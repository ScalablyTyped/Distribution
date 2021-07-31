package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCommentOutput extends StObject {
  
  /**
    * The contents of the comment.
    */
  var comment: js.UndefOr[Comment] = js.undefined
}
object GetCommentOutput {
  
  @scala.inline
  def apply(): GetCommentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCommentOutput]
  }
  
  @scala.inline
  implicit class GetCommentOutputMutableBuilder[Self <: GetCommentOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
  }
}
