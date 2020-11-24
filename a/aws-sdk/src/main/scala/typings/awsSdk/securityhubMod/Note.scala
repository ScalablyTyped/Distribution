package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Note extends js.Object {
  
  /**
    * The text of a note.
    */
  var Text: NonEmptyString = js.native
  
  /**
    * The timestamp of when the note was updated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var UpdatedAt: NonEmptyString = js.native
  
  /**
    * The principal that created a note.
    */
  var UpdatedBy: NonEmptyString = js.native
}
object Note {
  
  @scala.inline
  def apply(Text: NonEmptyString, UpdatedAt: NonEmptyString, UpdatedBy: NonEmptyString): Note = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any], UpdatedBy = UpdatedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Note]
  }
  
  @scala.inline
  implicit class NoteOps[Self <: Note] (val x: Self) extends AnyVal {
    
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
    def setUpdatedAt(value: NonEmptyString): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedBy(value: NonEmptyString): Self = this.set("UpdatedBy", value.asInstanceOf[js.Any])
  }
}
