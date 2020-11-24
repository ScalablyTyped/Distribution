package typings.awsSdkClientCodecommitNode.typesCommentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledComment extends Comment {
  
  /**
    * <p>The date and time the comment was created, in timestamp format.</p>
    */
  @JSName("creationDate")
  var creationDate_UnmarshalledComment: js.UndefOr[Date] = js.native
  
  /**
    * <p>The date and time the comment was most recently modified, in timestamp format.</p>
    */
  @JSName("lastModifiedDate")
  var lastModifiedDate_UnmarshalledComment: js.UndefOr[Date] = js.native
}
object UnmarshalledComment {
  
  @scala.inline
  def apply(): UnmarshalledComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledComment]
  }
  
  @scala.inline
  implicit class UnmarshalledCommentOps[Self <: UnmarshalledComment] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: Date): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
  }
}
