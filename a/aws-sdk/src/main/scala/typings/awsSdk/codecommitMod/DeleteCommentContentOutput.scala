package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCommentContentOutput extends js.Object {
  
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
  implicit class DeleteCommentContentOutputOps[Self <: DeleteCommentContentOutput] (val x: Self) extends AnyVal {
    
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
    def setComment(value: Comment): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
  }
}
