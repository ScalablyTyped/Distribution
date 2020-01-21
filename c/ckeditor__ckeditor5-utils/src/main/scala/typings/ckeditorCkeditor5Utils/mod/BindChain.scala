package typings.ckeditorCkeditor5Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindChain extends js.Object {
  def to(observable: Observable, bindProperties: (Observable | String | js.Function)*): Unit
  def toMany(observable: js.Array[Observable], bindProperties: (Observable | String | js.Function)*): Unit
}

object BindChain {
  @scala.inline
  def apply(
    to: (Observable, /* repeated */ Observable | String | js.Function) => Unit,
    toMany: (js.Array[Observable], /* repeated */ Observable | String | js.Function) => Unit
  ): BindChain = {
    val __obj = js.Dynamic.literal(to = js.Any.fromFunction2(to), toMany = js.Any.fromFunction2(toMany))
  
    __obj.asInstanceOf[BindChain]
  }
}

