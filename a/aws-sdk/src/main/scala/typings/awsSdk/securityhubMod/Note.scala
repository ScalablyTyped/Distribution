package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Note extends js.Object {
  /**
    * The text of a note.
    */
  var Text: NonEmptyString = js.native
  /**
    * The timestamp of when the note was updated.
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
}

