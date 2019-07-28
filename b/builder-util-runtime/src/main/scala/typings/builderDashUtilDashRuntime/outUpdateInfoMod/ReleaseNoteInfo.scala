package typings.builderDashUtilDashRuntime.outUpdateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseNoteInfo extends js.Object {
  /**
    * The note.
    */
  val note: String | Null
  /**
    * The version.
    */
  val version: String
}

object ReleaseNoteInfo {
  @scala.inline
  def apply(version: String, note: String = null): ReleaseNoteInfo = {
    val __obj = js.Dynamic.literal(version = version)
    if (note != null) __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[ReleaseNoteInfo]
  }
}

