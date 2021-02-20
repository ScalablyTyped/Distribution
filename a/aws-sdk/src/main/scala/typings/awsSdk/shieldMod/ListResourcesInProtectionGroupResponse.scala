package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourcesInProtectionGroupResponse extends StObject {
  
  /**
    * If you specify a value for MaxResults and you have more resources in the protection group than the value of MaxResults, AWS Shield Advanced returns this token that you can use in your next request, to get the next batch of objects. 
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of the resources that are included in the protection group.
    */
  var ResourceArns: ResourceArnList = js.native
}
object ListResourcesInProtectionGroupResponse {
  
  @scala.inline
  def apply(ResourceArns: ResourceArnList): ListResourcesInProtectionGroupResponse = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesInProtectionGroupResponse]
  }
  
  @scala.inline
  implicit class ListResourcesInProtectionGroupResponseMutableBuilder[Self <: ListResourcesInProtectionGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceArns(value: ResourceArnList): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value :_*))
  }
}
