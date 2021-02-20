package typings.cesium.mod

import typings.cesium.anon.LowFrameRateMessage
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PerformanceWatchdog")
@js.native
class PerformanceWatchdog () extends StObject {
  def this(options: LowFrameRateMessage) = this()
  
  var container: Element = js.native
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var viewModel: PerformanceWatchdogViewModel = js.native
}
