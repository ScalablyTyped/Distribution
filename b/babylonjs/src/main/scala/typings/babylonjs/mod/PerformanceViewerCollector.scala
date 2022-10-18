package typings.babylonjs.mod

import typings.babylonjs.miscPerformanceViewerPerformanceViewerCollectorMod.IPerformanceViewerStrategyParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PerformanceViewerCollector")
@js.native
open class PerformanceViewerCollector protected ()
  extends typings.babylonjs.legacyLegacyMod.PerformanceViewerCollector {
  /**
    * Handles the creation of a performance viewer collector.
    * @param _scene the scene to collect on.
    * @param _enabledStrategyCallbacks the list of data to collect with callbacks for initialization purposes.
    */
  def this(_scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(
    _scene: typings.babylonjs.sceneMod.Scene,
    _enabledStrategyCallbacks: js.Array[IPerformanceViewerStrategyParameter]
  ) = this()
}
