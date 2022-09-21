package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecastJSPlugin
  extends StObject
     with INavigationEnginePlugin {
  
  /* private */ var _maximumSubStepCount: Any = js.native
  
  /* private */ var _tempVec1: Any = js.native
  
  /* private */ var _tempVec2: Any = js.native
  
  /* private */ var _timeFactor: Any = js.native
  
  /* private */ var _timeStep: Any = js.native
  
  /* private */ var _worker: Any = js.native
  
  /**
    * Reference to the Recast library
    */
  var bjsRECAST: Any = js.native
  
  def createNavMesh(
    meshes: js.Array[Mesh],
    parameters: INavMeshParameters,
    completion: js.Function1[/* navmeshData */ js.typedarray.Uint8Array, Unit]
  ): Unit = js.native
  
  /**
    * the first navmesh created. We might extend this to support multiple navmeshes
    */
  var navMesh: Any = js.native
  
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
  
  /**
    * Set worker URL to be used when generating a new navmesh
    * @param workerURL url string
    * @returns boolean indicating if worker is created
    */
  def setWorkerURL(workerURL: String): Boolean = js.native
  
  /**
    * Get the time factor used for crowd agent update
    * @returns the time factor
    */
  def timeFactor: Double = js.native
  /**
    * Time factor applied when updating crowd agents (default 1). A value of 0 will pause crowd updates.
    * @param value the time factor applied at update
    */
  def timeFactor_=(value: Double): Unit = js.native
}
