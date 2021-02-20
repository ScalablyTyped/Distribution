package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourcesForWebACLResponse extends StObject {
  
  /**
    * The array of Amazon Resource Names (ARNs) of the associated resources.
    */
  var ResourceArns: js.UndefOr[typings.awsSdk.wafv2Mod.ResourceArns] = js.native
}
object ListResourcesForWebACLResponse {
  
  @scala.inline
  def apply(): ListResourcesForWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesForWebACLResponse]
  }
  
  @scala.inline
  implicit class ListResourcesForWebACLResponseMutableBuilder[Self <: ListResourcesForWebACLResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArns(value: ResourceArns): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnsUndefined: Self = StObject.set(x, "ResourceArns", js.undefined)
    
    @scala.inline
    def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value :_*))
  }
}
