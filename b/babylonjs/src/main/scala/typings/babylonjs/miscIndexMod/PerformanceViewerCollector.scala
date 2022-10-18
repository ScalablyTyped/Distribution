package typings.babylonjs.miscIndexMod

import typings.babylonjs.miscPerformanceViewerPerformanceViewerCollectorMod.IPerformanceViewerStrategyParameter
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "PerformanceViewerCollector")
@js.native
open class PerformanceViewerCollector protected ()
  extends typings.babylonjs.miscPerformanceViewerIndexMod.PerformanceViewerCollector {
  /**
    * Handles the creation of a performance viewer collector.
    * @param _scene the scene to collect on.
    * @param _enabledStrategyCallbacks the list of data to collect with callbacks for initialization purposes.
    */
  def this(_scene: Scene) = this()
  def this(_scene: Scene, _enabledStrategyCallbacks: js.Array[IPerformanceViewerStrategyParameter]) = this()
}
