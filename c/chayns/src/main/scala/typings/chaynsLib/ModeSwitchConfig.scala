package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * UI Functions
 * chayns.ui.modeswitch
 * interfaces
 */
// chayns.ui.modeswitch.init()

trait ModeSwitchConfig extends js.Object {
  var headline: js.UndefOr[java.lang.String] = js.undefined
  var items: js.Array[ModeSwitchItem]
  var preventclose: js.UndefOr[scala.Boolean] = js.undefined
  def callback(result: ModeSwitchItem): scala.Unit
}

