package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrafficPolicyRequest extends StObject {
  
  /**
    * (Optional) Any comments that you want to include about the traffic policy.
    */
  var Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
  
  /**
    * The definition of this traffic policy in JSON format. For more information, see Traffic Policy Document Format.
    */
  var Document: TrafficPolicyDocument
  
  /**
    * The name of the traffic policy.
    */
  var Name: TrafficPolicyName
}
object CreateTrafficPolicyRequest {
  
  @scala.inline
  def apply(Document: TrafficPolicyDocument, Name: TrafficPolicyName): CreateTrafficPolicyRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyRequest]
  }
  
  @scala.inline
  implicit class CreateTrafficPolicyRequestMutableBuilder[Self <: CreateTrafficPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: TrafficPolicyComment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setDocument(value: TrafficPolicyDocument): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: TrafficPolicyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
