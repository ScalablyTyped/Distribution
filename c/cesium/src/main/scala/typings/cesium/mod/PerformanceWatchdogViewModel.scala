package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PerformanceWatchdogViewModel")
@js.native
class PerformanceWatchdogViewModel () extends StObject {
  def this(options: typings.cesium.anon.Scene) = this()
  
  var dismissMessage: Command = js.native
  
  var lowFrameRateMessage: String = js.native
  
  var lowFrameRateMessageDismissed: Boolean = js.native
  
  var scene: Scene = js.native
  
  var showingLowFrameRateMessage: Boolean = js.native
}
