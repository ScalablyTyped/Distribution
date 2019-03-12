package typings
package atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindChain extends js.Object {
  def to(observable: Observable, bindProperties: (Observable | java.lang.String | js.Function)*): scala.Unit
  def toMany(observable: js.Array[Observable], bindProperties: (Observable | java.lang.String | js.Function)*): scala.Unit
}

object BindChain {
  @scala.inline
  def apply(
    to: (Observable, /* repeated */ Observable | java.lang.String | js.Function) => scala.Unit,
    toMany: (js.Array[Observable], /* repeated */ Observable | java.lang.String | js.Function) => scala.Unit
  ): BindChain = {
    val __obj = js.Dynamic.literal(to = js.Any.fromFunction2(to), toMany = js.Any.fromFunction2(toMany))
  
    __obj.asInstanceOf[BindChain]
  }
}

