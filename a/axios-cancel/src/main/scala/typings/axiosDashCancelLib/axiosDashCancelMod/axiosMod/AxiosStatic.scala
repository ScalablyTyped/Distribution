package typings
package axiosDashCancelLib.axiosDashCancelMod.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosStatic extends js.Object {
  def cancel(requestId: java.lang.String): scala.Unit
  def cancelAll(): scala.Unit
}

object AxiosStatic {
  @scala.inline
  def apply(cancel: java.lang.String => scala.Unit, cancelAll: () => scala.Unit): AxiosStatic = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), cancelAll = js.Any.fromFunction0(cancelAll))
  
    __obj.asInstanceOf[AxiosStatic]
  }
}

