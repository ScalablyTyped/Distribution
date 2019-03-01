package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackOptions extends js.Object {
  /** @todo TODO PROPER DOCS */
  def sendPacket(options: js.Object, callback: js.Function0[scala.Unit]): scala.Unit
}

object Anon_CallbackOptions {
  @scala.inline
  def apply(sendPacket: js.Function2[js.Object, js.Function0[scala.Unit], scala.Unit]): Anon_CallbackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sendPacket")(sendPacket)
    __obj.asInstanceOf[Anon_CallbackOptions]
  }
}

