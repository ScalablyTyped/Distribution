package typings.cordovaPluginBadge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CordovaPluginBadge extends js.Object {
  def clear(): Unit = js.native
  def clear(callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def clear(callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def clear(callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def configure(config: CordovaPluginBadgeOptions): CordovaPluginBadgeOptions = js.native
  def decrease(): Unit = js.native
  def decrease(count: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def decrease(count: js.UndefOr[scala.Nothing], callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def decrease(count: js.UndefOr[scala.Nothing], callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def decrease(count: Double): Unit = js.native
  def decrease(count: Double, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def decrease(count: Double, callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def decrease(count: Double, callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def get(): Unit = js.native
  def get(callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def get(callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def get(callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def hasPermission(): Unit = js.native
  def hasPermission(callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def hasPermission(callback: js.Function1[/* granted */ Boolean, Unit]): Unit = js.native
  def hasPermission(callback: js.Function1[/* granted */ Boolean, Unit], scope: js.Any): Unit = js.native
  def increase(): Unit = js.native
  def increase(count: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def increase(count: js.UndefOr[scala.Nothing], callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def increase(count: js.UndefOr[scala.Nothing], callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def increase(count: Double): Unit = js.native
  def increase(count: Double, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def increase(count: Double, callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def increase(count: Double, callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def requestPermission(): Unit = js.native
  def requestPermission(callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def requestPermission(callback: js.Function1[/* granted */ Boolean, Unit]): Unit = js.native
  def requestPermission(callback: js.Function1[/* granted */ Boolean, Unit], scope: js.Any): Unit = js.native
  def set(): Unit = js.native
  def set(badge: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def set(badge: js.UndefOr[scala.Nothing], callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def set(badge: js.UndefOr[scala.Nothing], callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def set(badge: Double): Unit = js.native
  def set(badge: Double, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def set(badge: Double, callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def set(badge: Double, callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
}

