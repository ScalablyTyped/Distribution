package typings.broFs

import typings.broFs.broFsStrings.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrayBuffer extends js.Object {
  var `type`: ArrayBuffer
}

object AnonArrayBuffer {
  @scala.inline
  def apply(`type`: ArrayBuffer): AnonArrayBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrayBuffer]
  }
}

