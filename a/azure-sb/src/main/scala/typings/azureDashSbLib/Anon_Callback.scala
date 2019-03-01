package typings
package azureDashSbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  def signRequest(webResource: js.Any, callback: js.Function0[scala.Unit]): scala.Unit
}

object Anon_Callback {
  @scala.inline
  def apply(signRequest: js.Function2[js.Any, js.Function0[scala.Unit], scala.Unit]): Anon_Callback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("signRequest")(signRequest)
    __obj.asInstanceOf[Anon_Callback]
  }
}

