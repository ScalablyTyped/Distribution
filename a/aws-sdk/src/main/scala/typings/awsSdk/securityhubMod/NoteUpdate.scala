package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoteUpdate extends js.Object {
  
  /**
    * The updated note text.
    */
  var Text: NonEmptyString = js.native
  
  /**
    * The principal that updated the note.
    */
  var UpdatedBy: NonEmptyString = js.native
}
object NoteUpdate {
  
  @scala.inline
  def apply(Text: NonEmptyString, UpdatedBy: NonEmptyString): NoteUpdate = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any], UpdatedBy = UpdatedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteUpdate]
  }
  
  @scala.inline
  implicit class NoteUpdateOps[Self <: NoteUpdate] (val x: Self) extends AnyVal {
    
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
    def setText(value: NonEmptyString): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedBy(value: NonEmptyString): Self = this.set("UpdatedBy", value.asInstanceOf[js.Any])
  }
}
