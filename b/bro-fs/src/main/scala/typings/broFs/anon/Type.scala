package typings.broFs.anon

import typings.broFs.broFsStrings.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: ArrayBuffer
}

object Type {
  @scala.inline
  def apply(`type`: ArrayBuffer): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

