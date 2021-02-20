package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTrafficPolicyVersionRequest extends StObject {
  
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
  implicit class CreateTrafficPolicyVersionRequestMutableBuilder[Self <: CreateTrafficPolicyVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: TrafficPolicyComment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setDocument(value: TrafficPolicyDocument): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TrafficPolicyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
