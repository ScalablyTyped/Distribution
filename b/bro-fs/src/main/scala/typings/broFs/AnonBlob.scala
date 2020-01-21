package typings.broFs

import typings.broFs.broFsStrings.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlob extends js.Object {
  var `type`: Blob
}

object AnonBlob {
  @scala.inline
  def apply(`type`: Blob): AnonBlob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlob]
  }
}

