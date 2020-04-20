package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

