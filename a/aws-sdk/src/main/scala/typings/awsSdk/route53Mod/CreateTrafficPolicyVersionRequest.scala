package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTrafficPolicyVersionRequest extends js.Object {
  
  /**
    * The comment that you specified in the CreateTrafficPolicyVersion request, if any.
    */
  var Comment: js.UndefOr[TrafficPolicyComment] = js.native
  
  /**
    * The definition of this version of the traffic policy, in JSON format. You specified the JSON in the CreateTrafficPolicyVersion request. For more information about the JSON format, see CreateTrafficPolicy.
    */
  var Document: TrafficPolicyDocument = js.native
  
  /**
    * The ID of the traffic policy for which you want to create a new version.
    */
  var Id: TrafficPolicyId = js.native
}
object CreateTrafficPolicyVersionRequest {
  
  @scala.inline
  def apply(Document: TrafficPolicyDocument, Id: TrafficPolicyId): CreateTrafficPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyVersionRequest]
  }
  
  @scala.inline
  implicit class CreateTrafficPolicyVersionRequestOps[Self <: CreateTrafficPolicyVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setId(value: TrafficPolicyId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: TrafficPolicyComment): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
  }
}
