package typings.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Handle used to interact with the autocomplete dialog box.*/
trait Handle extends js.Object {
  var data: js.Any
  var length: Double
  def close(): Unit
  def menuSize(): Double
  def moveFocus(n: Double, avoidWrap: Boolean): Unit
  def pick(): Unit
  def setFocus(n: Double): Unit
}

object Handle {
  @scala.inline
  def apply(
    close: () => Unit,
    data: js.Any,
    length: Double,
    menuSize: () => Double,
    moveFocus: (Double, Boolean) => Unit,
    pick: () => Unit,
    setFocus: Double => Unit
  ): Handle = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = data, length = length, menuSize = js.Any.fromFunction0(menuSize), moveFocus = js.Any.fromFunction2(moveFocus), pick = js.Any.fromFunction0(pick), setFocus = js.Any.fromFunction1(setFocus))
  
    __obj.asInstanceOf[Handle]
  }
}

