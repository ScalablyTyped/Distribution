package typings.cordovaPluginBadge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPluginBadge extends StObject {
  
  def clear(): Unit = js.native
  def clear(callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def clear(callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def clear(callback: Unit, scope: js.Any): Unit = js.native
  
  def configure(config: CordovaPluginBadgeOptions): CordovaPluginBadgeOptions = js.native
  
  def decrease(): Unit = js.native
  def decrease(count: Double): Unit = js.native
  def decrease(count: Double, callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def decrease(count: Double, callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def decrease(count: Double, callback: Unit, scope: js.Any): Unit = js.native
  def decrease(count: Unit, callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def decrease(count: Unit, callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def decrease(count: Unit, callback: Unit, scope: js.Any): Unit = js.native
  
  def get(): Unit = js.native
  def get(callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def get(callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def get(callback: Unit, scope: js.Any): Unit = js.native
  
  def hasPermission(): Unit = js.native
  def hasPermission(callback: js.Function1[/* granted */ Boolean, Unit]): Unit = js.native
  def hasPermission(callback: js.Function1[/* granted */ Boolean, Unit], scope: js.Any): Unit = js.native
  def hasPermission(callback: Unit, scope: js.Any): Unit = js.native
  
  def increase(): Unit = js.native
  def increase(count: Double): Unit = js.native
  def increase(count: Double, callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def increase(count: Double, callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def increase(count: Double, callback: Unit, scope: js.Any): Unit = js.native
  def increase(count: Unit, callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def increase(count: Unit, callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def increase(count: Unit, callback: Unit, scope: js.Any): Unit = js.native
  
  def requestPermission(): Unit = js.native
  def requestPermission(callback: js.Function1[/* granted */ Boolean, Unit]): Unit = js.native
  def requestPermission(callback: js.Function1[/* granted */ Boolean, Unit], scope: js.Any): Unit = js.native
  def requestPermission(callback: Unit, scope: js.Any): Unit = js.native
  
  def set(): Unit = js.native
  def set(badge: Double): Unit = js.native
  def set(badge: Double, callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def set(badge: Double, callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def set(badge: Double, callback: Unit, scope: js.Any): Unit = js.native
  def set(badge: Unit, callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  def set(badge: Unit, callback: js.Function1[/* badge */ Double, Unit], scope: js.Any): Unit = js.native
  def set(badge: Unit, callback: Unit, scope: js.Any): Unit = js.native
}
