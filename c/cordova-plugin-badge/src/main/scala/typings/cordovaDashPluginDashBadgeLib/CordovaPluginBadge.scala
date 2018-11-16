package typings
package cordovaDashPluginDashBadgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CordovaPluginBadge extends js.Object {
  def clear(): scala.Unit = js.native
  def clear(callback: js.Function1[/* badge */ scala.Double, scala.Unit]): scala.Unit = js.native
  def clear(callback: js.Function1[/* badge */ scala.Double, scala.Unit], scope: js.Any): scala.Unit = js.native
  def configure(config: CordovaPluginBadgeOptions): CordovaPluginBadgeOptions = js.native
  def decrease(): scala.Unit = js.native
  def decrease(count: scala.Double): scala.Unit = js.native
  def decrease(count: scala.Double, callback: js.Function1[/* badge */ scala.Double, scala.Unit]): scala.Unit = js.native
  def decrease(count: scala.Double, callback: js.Function1[/* badge */ scala.Double, scala.Unit], scope: js.Any): scala.Unit = js.native
  def get(): scala.Unit = js.native
  def get(callback: js.Function1[/* badge */ scala.Double, scala.Unit]): scala.Unit = js.native
  def get(callback: js.Function1[/* badge */ scala.Double, scala.Unit], scope: js.Any): scala.Unit = js.native
  def hasPermission(): scala.Unit = js.native
  def hasPermission(callback: js.Function1[/* granted */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def hasPermission(callback: js.Function1[/* granted */ scala.Boolean, scala.Unit], scope: js.Any): scala.Unit = js.native
  def increase(): scala.Unit = js.native
  def increase(count: scala.Double): scala.Unit = js.native
  def increase(count: scala.Double, callback: js.Function1[/* badge */ scala.Double, scala.Unit]): scala.Unit = js.native
  def increase(count: scala.Double, callback: js.Function1[/* badge */ scala.Double, scala.Unit], scope: js.Any): scala.Unit = js.native
  def requestPermission(): scala.Unit = js.native
  def requestPermission(callback: js.Function1[/* granted */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def requestPermission(callback: js.Function1[/* granted */ scala.Boolean, scala.Unit], scope: js.Any): scala.Unit = js.native
  def set(): scala.Unit = js.native
  def set(badge: scala.Double): scala.Unit = js.native
  def set(badge: scala.Double, callback: js.Function1[/* badge */ scala.Double, scala.Unit]): scala.Unit = js.native
  def set(badge: scala.Double, callback: js.Function1[/* badge */ scala.Double, scala.Unit], scope: js.Any): scala.Unit = js.native
}

