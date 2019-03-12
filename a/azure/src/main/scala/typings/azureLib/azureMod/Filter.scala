package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  def handle(requestOptions: js.Any, next: js.Function): scala.Unit
}

object Filter {
  @scala.inline
  def apply(handle: (js.Any, js.Function) => scala.Unit): Filter = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction2(handle))
  
    __obj.asInstanceOf[Filter]
  }
}

