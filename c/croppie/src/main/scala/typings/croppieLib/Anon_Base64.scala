package typings
package croppieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64 extends js.Object {
  var `type`: croppieLib.croppieLibStrings.base64 | croppieLib.croppieLibStrings.canvas
}

object Anon_Base64 {
  @scala.inline
  def apply(`type`: croppieLib.croppieLibStrings.base64 | croppieLib.croppieLibStrings.canvas): Anon_Base64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Base64]
  }
}

