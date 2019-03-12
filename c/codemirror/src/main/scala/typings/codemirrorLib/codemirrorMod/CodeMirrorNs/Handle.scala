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
    close: () => scala.Unit,
    data: js.Any,
    length: scala.Double,
    menuSize: () => scala.Double,
    moveFocus: (scala.Double, scala.Boolean) => scala.Unit,
    pick: () => scala.Unit,
    setFocus: scala.Double => scala.Unit
  ): Handle = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = data, length = length, menuSize = js.Any.fromFunction0(menuSize), moveFocus = js.Any.fromFunction2(moveFocus), pick = js.Any.fromFunction0(pick), setFocus = js.Any.fromFunction1(setFocus))
  
    __obj.asInstanceOf[Handle]
  }
}

