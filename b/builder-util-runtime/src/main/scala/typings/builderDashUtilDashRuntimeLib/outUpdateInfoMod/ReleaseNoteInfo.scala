package typings
package builderDashUtilDashRuntimeLib.outUpdateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseNoteInfo extends js.Object {
  /**
    * The note.
    */
  val note: java.lang.String | scala.Null
  /**
    * The version.
    */
  val version: java.lang.String
}

object ReleaseNoteInfo {
  @scala.inline
  def apply(version: java.lang.String, note: java.lang.String = null): ReleaseNoteInfo = {
    val __obj = js.Dynamic.literal(version = version)
    if (note != null) __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[ReleaseNoteInfo]
  }
}

