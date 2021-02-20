package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateHostedZoneCommentRequest extends StObject {
  
  /**
    * The new comment for the hosted zone. If you don't specify a value for Comment, Amazon Route 53 deletes the existing value of the Comment element, if any.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.native
  
  /**
    * The ID for the hosted zone that you want to update the comment for.
    */
  var Id: ResourceId = js.native
}
object UpdateHostedZoneCommentRequest {
  
  @scala.inline
  def apply(Id: ResourceId): UpdateHostedZoneCommentRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHostedZoneCommentRequest]
  }
  
  @scala.inline
  implicit class UpdateHostedZoneCommentRequestMutableBuilder[Self <: UpdateHostedZoneCommentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: ResourceDescription): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
