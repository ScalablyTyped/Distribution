package typings.axiosDashCancel.axiosDashCancelMod.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosStatic extends js.Object {
  def cancel(requestId: String): Unit
  def cancelAll(): Unit
}

object AxiosStatic {
  @scala.inline
  def apply(cancel: String => Unit, cancelAll: () => Unit): AxiosStatic = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), cancelAll = js.Any.fromFunction0(cancelAll))
  
    __obj.asInstanceOf[AxiosStatic]
  }
}

