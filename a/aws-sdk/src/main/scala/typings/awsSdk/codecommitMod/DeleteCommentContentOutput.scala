package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCommentContentOutput extends StObject {
  
  /**
    * Information about the comment you just deleted.
    */
  var comment: js.UndefOr[Comment] = js.native
}
object DeleteCommentContentOutput {
  
  @scala.inline
  def apply(): DeleteCommentContentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCommentContentOutput]
  }
  
  @scala.inline
  implicit class DeleteCommentContentOutputMutableBuilder[Self <: DeleteCommentContentOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
  }
}
