package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTrafficPolicyRequest extends js.Object {
  
  /**
    * (Optional) Any comments that you want to include about the traffic policy.
    */
  var Comment: js.UndefOr[TrafficPolicyComment] = js.native
  
  /**
    * The definition of this traffic policy in JSON format. For more information, see Traffic Policy Document Format.
    */
  var Document: TrafficPolicyDocument = js.native
  
  /**
    * The name of the traffic policy.
    */
  var Name: TrafficPolicyName = js.native
}
object CreateTrafficPolicyRequest {
  
  @scala.inline
  def apply(Document: TrafficPolicyDocument, Name: TrafficPolicyName): CreateTrafficPolicyRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyRequest]
  }
  
  @scala.inline
  implicit class CreateTrafficPolicyRequestOps[Self <: CreateTrafficPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setDocument(value: TrafficPolicyDocument): Self = this.set("Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: TrafficPolicyName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: TrafficPolicyComment): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
  }
}
