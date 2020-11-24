package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourcesInProtectionGroupRequest extends js.Object {
  
  /**
    * The maximum number of resource ARN objects to return. If you leave this blank, Shield Advanced returns the first 20 results. This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number of objects returned could be less than MaxResults, even if there are still more objects yet to return. If there are more objects to return, Shield Advanced returns a value in NextToken that you can use in your next request, to get the next batch of objects.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.shieldMod.MaxResults] = js.native
  
  /**
    * The next token value from a previous call to ListResourcesInProtectionGroup. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * The name of the protection group. You use this to identify the protection group in lists and to manage the protection group, for example to update, delete, or describe it. 
    */
  var ProtectionGroupId: typings.awsSdk.shieldMod.ProtectionGroupId = js.native
}
object ListResourcesInProtectionGroupRequest {
  
  @scala.inline
  def apply(ProtectionGroupId: ProtectionGroupId): ListResourcesInProtectionGroupRequest = {
    val __obj = js.Dynamic.literal(ProtectionGroupId = ProtectionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesInProtectionGroupRequest]
  }
  
  @scala.inline
  implicit class ListResourcesInProtectionGroupRequestOps[Self <: ListResourcesInProtectionGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setProtectionGroupId(value: ProtectionGroupId): Self = this.set("ProtectionGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
