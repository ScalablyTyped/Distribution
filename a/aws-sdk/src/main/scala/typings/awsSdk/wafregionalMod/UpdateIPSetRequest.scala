package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateIPSetRequest extends js.Object {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken = js.native
  
  /**
    * The IPSetId of the IPSet that you want to update. IPSetId is returned by CreateIPSet and by ListIPSets.
    */
  var IPSetId: ResourceId = js.native
  
  /**
    * An array of IPSetUpdate objects that you want to insert into or delete from an IPSet. For more information, see the applicable data types:    IPSetUpdate: Contains Action and IPSetDescriptor     IPSetDescriptor: Contains Type and Value    You can insert a maximum of 1000 addresses in a single request.
    */
  var Updates: IPSetUpdates = js.native
}
object UpdateIPSetRequest {
  
  @scala.inline
  def apply(ChangeToken: ChangeToken, IPSetId: ResourceId, Updates: IPSetUpdates): UpdateIPSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], IPSetId = IPSetId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIPSetRequest]
  }
  
  @scala.inline
  implicit class UpdateIPSetRequestOps[Self <: UpdateIPSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = this.set("ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPSetId(value: ResourceId): Self = this.set("IPSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesVarargs(value: IPSetUpdate*): Self = this.set("Updates", js.Array(value :_*))
    
    @scala.inline
    def setUpdates(value: IPSetUpdates): Self = this.set("Updates", value.asInstanceOf[js.Any])
  }
}
