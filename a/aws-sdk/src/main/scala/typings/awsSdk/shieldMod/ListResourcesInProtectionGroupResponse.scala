package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourcesInProtectionGroupResponse extends js.Object {
  
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
  implicit class ListResourcesInProtectionGroupResponseOps[Self <: ListResourcesInProtectionGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceArnsVarargs(value: ResourceArn*): Self = this.set("ResourceArns", js.Array(value :_*))
    
    @scala.inline
    def setResourceArns(value: ResourceArnList): Self = this.set("ResourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
