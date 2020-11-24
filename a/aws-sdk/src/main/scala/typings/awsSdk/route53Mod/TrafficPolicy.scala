package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficPolicy extends js.Object {
  
  /**
    * The comment that you specify in the CreateTrafficPolicy request, if any.
    */
  var Comment: js.UndefOr[TrafficPolicyComment] = js.native
  
  /**
    * The definition of a traffic policy in JSON format. You specify the JSON document to use for a new traffic policy in the CreateTrafficPolicy request. For more information about the JSON format, see Traffic Policy Document Format.
    */
  var Document: TrafficPolicyDocument = js.native
  
  /**
    * The ID that Amazon Route 53 assigned to a traffic policy when you created it.
    */
  var Id: TrafficPolicyId = js.native
  
  /**
    * The name that you specified when you created the traffic policy.
    */
  var Name: TrafficPolicyName = js.native
  
  /**
    * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
    */
  var Type: RRType = js.native
  
  /**
    * The version number that Amazon Route 53 assigns to a traffic policy. For a new traffic policy, the value of Version is always 1.
    */
  var Version: TrafficPolicyVersion = js.native
}
object TrafficPolicy {
  
  @scala.inline
  def apply(
    Document: TrafficPolicyDocument,
    Id: TrafficPolicyId,
    Name: TrafficPolicyName,
    Type: RRType,
    Version: TrafficPolicyVersion
  ): TrafficPolicy = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficPolicy]
  }
  
  @scala.inline
  implicit class TrafficPolicyOps[Self <: TrafficPolicy] (val x: Self) extends AnyVal {
    
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
    def setName(value: TrafficPolicyName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RRType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: TrafficPolicyVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: TrafficPolicyComment): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
  }
}
