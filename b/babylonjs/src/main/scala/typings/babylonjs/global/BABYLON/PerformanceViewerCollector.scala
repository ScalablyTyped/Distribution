package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IPerformanceViewerStrategyParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PerformanceViewerCollector")
@js.native
open class PerformanceViewerCollector protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PerformanceViewerCollector {
  /**
    * Handles the creation of a performance viewer collector.
    * @param _scene the scene to collect on.
    * @param _enabledStrategyCallbacks the list of data to collect with callbacks for initialization purposes.
    */
  def this(_scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    _scene: typings.babylonjs.BABYLON.Scene,
    _enabledStrategyCallbacks: js.Array[IPerformanceViewerStrategyParameter]
  ) = this()
}
