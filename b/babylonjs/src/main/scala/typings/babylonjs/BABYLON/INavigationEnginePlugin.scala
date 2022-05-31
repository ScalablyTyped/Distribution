package typings.babylonjs.BABYLON

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INavigationEnginePlugin extends StObject {
  
  /**
    * build the navmesh from a previously saved state using getNavmeshData
    * @param data the Uint8Array returned by getNavmeshData
    */
  def buildFromNavmeshData(data: Uint8Array): Unit
  
  /**
    * Compute a navigation path from start to end. Returns an empty array if no path can be computed
    * @param start world position
    * @param end world position
    * @returns array containing world position composing the path
    */
  def computePath(start: Vector3, end: Vector3): js.Array[Vector3]
  
  /**
    * Create a new Crowd so you can add agents
    * @param maxAgents the maximum agent count in the crowd
    * @param maxAgentRadius the maximum radius an agent can have
    * @param scene to attach the crowd to
    * @returns the crowd you can add agents to
    */
  def createCrowd(maxAgents: Double, maxAgentRadius: Double, scene: Scene): ICrowd
  
  /**
    * Create a navigation mesh debug mesh
    * @param scene is where the mesh will be added
    * @returns debug display mesh
    */
  def createDebugNavMesh(scene: Scene): Mesh
  
  /**
    * Creates a navigation mesh
    * @param meshes array of all the geometry used to compute the navigatio mesh
    * @param parameters bunch of parameters used to filter geometry
    */
  def createNavMesh(meshes: js.Array[Mesh], parameters: INavMeshParameters): Unit
  
  /**
    * Release all resources
    */
  def dispose(): Unit
  
  /**
    * Get a navigation mesh constrained position, closest to the parameter position
    * @param position world position
    * @returns the closest point to position constrained by the navigation mesh
    */
  def getClosestPoint(position: Vector3): Vector3
  
  /**
    * Get a navigation mesh constrained position, closest to the parameter position
    * @param position world position
    * @param result output the closest point to position constrained by the navigation mesh
    */
  def getClosestPointToRef(position: Vector3, result: Vector3): Unit
  
  /**
    * Get the Bounding box extent specified by setDefaultQueryExtent
    * @returns the box extent values
    */
  def getDefaultQueryExtent(): Vector3
  
  /**
    * Get the Bounding box extent result specified by setDefaultQueryExtent
    * @param result output the box extent values
    */
  def getDefaultQueryExtentToRef(result: Vector3): Unit
  
  /**
    * Get the maximum number of iterations per navigation tick update
    * @returns the maximum number of iterations
    */
  def getMaximumSubStepCount(): Double
  
  /**
    * returns the navmesh data that can be used later. The navmesh must be built before retrieving the data
    * @returns data the Uint8Array that can be saved and reused
    */
  def getNavmeshData(): Uint8Array
  
  /**
    * Get a navigation mesh constrained position, within a particular radius
    * @param position world position
    * @param maxRadius the maximum distance to the constrained world position
    * @returns the closest point to position constrained by the navigation mesh
    */
  def getRandomPointAround(position: Vector3, maxRadius: Double): Vector3
  
  /**
    * Get a navigation mesh constrained position, within a particular radius
    * @param position world position
    * @param maxRadius the maximum distance to the constrained world position
    * @param result output the closest point to position constrained by the navigation mesh
    */
  def getRandomPointAroundToRef(position: Vector3, maxRadius: Double, result: Vector3): Unit
  
  /**
    * Get the time step of the navigation tick update.
    * @returns the current time step
    */
  def getTimeStep(): Double
  
  /**
    * If this plugin is supported
    * @returns true if plugin is supported
    */
  def isSupported(): Boolean
  
  /**
    * Compute the final position from a segment made of destination-position
    * @param position world position
    * @param destination world position
    * @returns the resulting point along the navmesh
    */
  def moveAlong(position: Vector3, destination: Vector3): Vector3
  
  /**
    * Compute the final position from a segment made of destination-position
    * @param position world position
    * @param destination world position
    * @param result output the resulting point along the navmesh
    */
  def moveAlongToRef(position: Vector3, destination: Vector3, result: Vector3): Unit
  
  /**
    * plugin name
    */
  var name: String
  
  /**
    * Set the Bounding box extent for doing spatial queries (getClosestPoint, getRandomPointAround, ...)
    * The queries will try to find a solution within those bounds
    * default is (1,1,1)
    * @param extent x,y,z value that define the extent around the queries point of reference
    */
  def setDefaultQueryExtent(extent: Vector3): Unit
  
  /**
    * If delta time in navigation tick update is greater than the time step
    * a number of sub iterations are done. If more iterations are need to reach deltatime
    * they will be discarded.
    * A value of 0 will set to no maximum and update will use as many substeps as needed
    * @param newStepCount the maximum number of iterations
    */
  def setMaximumSubStepCount(newStepCount: Double): Unit
  
  /**
    * Set the time step of the navigation tick update.
    * Default is 1/60.
    * A value of 0 will disable fixed time update
    * @param newTimeStep the new timestep to apply to this world.
    */
  def setTimeStep(newTimeStep: Double): Unit
}
object INavigationEnginePlugin {
  
  inline def apply(
    buildFromNavmeshData: Uint8Array => Unit,
    computePath: (Vector3, Vector3) => js.Array[Vector3],
    createCrowd: (Double, Double, Scene) => ICrowd,
    createDebugNavMesh: Scene => Mesh,
    createNavMesh: (js.Array[Mesh], INavMeshParameters) => Unit,
    dispose: () => Unit,
    getClosestPoint: Vector3 => Vector3,
    getClosestPointToRef: (Vector3, Vector3) => Unit,
    getDefaultQueryExtent: () => Vector3,
    getDefaultQueryExtentToRef: Vector3 => Unit,
    getMaximumSubStepCount: () => Double,
    getNavmeshData: () => Uint8Array,
    getRandomPointAround: (Vector3, Double) => Vector3,
    getRandomPointAroundToRef: (Vector3, Double, Vector3) => Unit,
    getTimeStep: () => Double,
    isSupported: () => Boolean,
    moveAlong: (Vector3, Vector3) => Vector3,
    moveAlongToRef: (Vector3, Vector3, Vector3) => Unit,
    name: String,
    setDefaultQueryExtent: Vector3 => Unit,
    setMaximumSubStepCount: Double => Unit,
    setTimeStep: Double => Unit
  ): INavigationEnginePlugin = {
    val __obj = js.Dynamic.literal(buildFromNavmeshData = js.Any.fromFunction1(buildFromNavmeshData), computePath = js.Any.fromFunction2(computePath), createCrowd = js.Any.fromFunction3(createCrowd), createDebugNavMesh = js.Any.fromFunction1(createDebugNavMesh), createNavMesh = js.Any.fromFunction2(createNavMesh), dispose = js.Any.fromFunction0(dispose), getClosestPoint = js.Any.fromFunction1(getClosestPoint), getClosestPointToRef = js.Any.fromFunction2(getClosestPointToRef), getDefaultQueryExtent = js.Any.fromFunction0(getDefaultQueryExtent), getDefaultQueryExtentToRef = js.Any.fromFunction1(getDefaultQueryExtentToRef), getMaximumSubStepCount = js.Any.fromFunction0(getMaximumSubStepCount), getNavmeshData = js.Any.fromFunction0(getNavmeshData), getRandomPointAround = js.Any.fromFunction2(getRandomPointAround), getRandomPointAroundToRef = js.Any.fromFunction3(getRandomPointAroundToRef), getTimeStep = js.Any.fromFunction0(getTimeStep), isSupported = js.Any.fromFunction0(isSupported), moveAlong = js.Any.fromFunction2(moveAlong), moveAlongToRef = js.Any.fromFunction3(moveAlongToRef), name = name.asInstanceOf[js.Any], setDefaultQueryExtent = js.Any.fromFunction1(setDefaultQueryExtent), setMaximumSubStepCount = js.Any.fromFunction1(setMaximumSubStepCount), setTimeStep = js.Any.fromFunction1(setTimeStep))
    __obj.asInstanceOf[INavigationEnginePlugin]
  }
  
  extension [Self <: INavigationEnginePlugin](x: Self) {
    
    inline def setBuildFromNavmeshData(value: Uint8Array => Unit): Self = StObject.set(x, "buildFromNavmeshData", js.Any.fromFunction1(value))
    
    inline def setComputePath(value: (Vector3, Vector3) => js.Array[Vector3]): Self = StObject.set(x, "computePath", js.Any.fromFunction2(value))
    
    inline def setCreateCrowd(value: (Double, Double, Scene) => ICrowd): Self = StObject.set(x, "createCrowd", js.Any.fromFunction3(value))
    
    inline def setCreateDebugNavMesh(value: Scene => Mesh): Self = StObject.set(x, "createDebugNavMesh", js.Any.fromFunction1(value))
    
    inline def setCreateNavMesh(value: (js.Array[Mesh], INavMeshParameters) => Unit): Self = StObject.set(x, "createNavMesh", js.Any.fromFunction2(value))
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setGetClosestPoint(value: Vector3 => Vector3): Self = StObject.set(x, "getClosestPoint", js.Any.fromFunction1(value))
    
    inline def setGetClosestPointToRef(value: (Vector3, Vector3) => Unit): Self = StObject.set(x, "getClosestPointToRef", js.Any.fromFunction2(value))
    
    inline def setGetDefaultQueryExtent(value: () => Vector3): Self = StObject.set(x, "getDefaultQueryExtent", js.Any.fromFunction0(value))
    
    inline def setGetDefaultQueryExtentToRef(value: Vector3 => Unit): Self = StObject.set(x, "getDefaultQueryExtentToRef", js.Any.fromFunction1(value))
    
    inline def setGetMaximumSubStepCount(value: () => Double): Self = StObject.set(x, "getMaximumSubStepCount", js.Any.fromFunction0(value))
    
    inline def setGetNavmeshData(value: () => Uint8Array): Self = StObject.set(x, "getNavmeshData", js.Any.fromFunction0(value))
    
    inline def setGetRandomPointAround(value: (Vector3, Double) => Vector3): Self = StObject.set(x, "getRandomPointAround", js.Any.fromFunction2(value))
    
    inline def setGetRandomPointAroundToRef(value: (Vector3, Double, Vector3) => Unit): Self = StObject.set(x, "getRandomPointAroundToRef", js.Any.fromFunction3(value))
    
    inline def setGetTimeStep(value: () => Double): Self = StObject.set(x, "getTimeStep", js.Any.fromFunction0(value))
    
    inline def setIsSupported(value: () => Boolean): Self = StObject.set(x, "isSupported", js.Any.fromFunction0(value))
    
    inline def setMoveAlong(value: (Vector3, Vector3) => Vector3): Self = StObject.set(x, "moveAlong", js.Any.fromFunction2(value))
    
    inline def setMoveAlongToRef(value: (Vector3, Vector3, Vector3) => Unit): Self = StObject.set(x, "moveAlongToRef", js.Any.fromFunction3(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultQueryExtent(value: Vector3 => Unit): Self = StObject.set(x, "setDefaultQueryExtent", js.Any.fromFunction1(value))
    
    inline def setSetMaximumSubStepCount(value: Double => Unit): Self = StObject.set(x, "setMaximumSubStepCount", js.Any.fromFunction1(value))
    
    inline def setSetTimeStep(value: Double => Unit): Self = StObject.set(x, "setTimeStep", js.Any.fromFunction1(value))
  }
}
