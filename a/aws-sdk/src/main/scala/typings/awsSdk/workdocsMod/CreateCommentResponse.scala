package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCommentResponse extends StObject {
  
  /**
    * The comment that has been created.
    */
  var Comment: js.UndefOr[typings.awsSdk.workdocsMod.Comment] = js.native
}
object CreateCommentResponse {
  
  @scala.inline
  def apply(): CreateCommentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCommentResponse]
  }
  
  @scala.inline
  implicit class CreateCommentResponseMutableBuilder[Self <: CreateCommentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: Comment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
  }
}
