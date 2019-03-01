package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Handle used to interact with the autocomplete dialog box.*/
trait Handle extends js.Object {
  var data: js.Any
  var length: scala.Double
  def close(): scala.Unit
  def menuSize(): scala.Double
  def moveFocus(n: scala.Double, avoidWrap: scala.Boolean): scala.Unit
  def pick(): scala.Unit
  def setFocus(n: scala.Double): scala.Unit
}

object Handle {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    data: js.Any,
    length: scala.Double,
    menuSize: js.Function0[scala.Double],
    moveFocus: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    pick: js.Function0[scala.Unit],
    setFocus: js.Function1[scala.Double, scala.Unit]
  ): Handle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("menuSize")(menuSize)
    __obj.updateDynamic("moveFocus")(moveFocus)
    __obj.updateDynamic("pick")(pick)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.asInstanceOf[Handle]
  }
}

