package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecastJSPlugin
  extends StObject
     with INavigationEnginePlugin {
  
  /* private */ var _maximumSubStepCount: js.Any = js.native
  
  /* private */ var _timeStep: js.Any = js.native
  
  /**
    * Reference to the Recast library
    */
  var bjsRECAST: js.Any = js.native
  
  /**
    * the first navmesh created. We might extend this to support multiple navmeshes
    */
  var navMesh: js.Any = js.native
  
  /**
    * If delta time in navigation tick update is greater than the time step
    * a number of sub iterations are done. If more iterations are need to reach deltatime
    * they will be discarded.
    * A value of 0 will set to no maximum and update will use as many substeps as needed
    * @param newStepCount the maximum number of iterations
    */
  def setMaximumSubStepCount(): Unit = js.native
  
  /**
    * Set the time step of the navigation tick update.
    * Default is 1/60.
    * A value of 0 will disable fixed time update
    * @param newTimeStep the new timestep to apply to this world.
    */
  def setTimeStep(): Unit = js.native
}
