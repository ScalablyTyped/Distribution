package typings.broFs

import typings.broFs.broFsStrings.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends js.Object {
  var `type`: File
}

object AnonFile {
  @scala.inline
  def apply(`type`: File): AnonFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFile]
  }
}

