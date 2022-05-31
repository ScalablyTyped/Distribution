package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ICrowd
import typings.babylonjs.BABYLON.INavMeshParameters
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RecastJSPlugin")
@js.native
/**
  * Initializes the recastJS plugin
  * @param recastInjection can be used to inject your own recast reference
  */
class RecastJSPlugin ()
  extends StObject
     with typings.babylonjs.BABYLON.RecastJSPlugin {
  def this(recastInjection: js.Any) = this()
  
  /**
    * build the navmesh from a previously saved state using getNavmeshData
    * @param data the Uint8Array returned by getNavmeshData
    */
  /* CompleteClass */
  override def buildFromNavmeshData(data: Uint8Array): Unit = js.native
  
  /**
    * Compute a navigation path from start to end. Returns an empty array if no path can be computed
    * @param start world position
    * @param end world position
    * @returns array containing world position composing the path
    */
  /* CompleteClass */
  override def computePath(start: typings.babylonjs.BABYLON.Vector3, end: typings.babylonjs.BABYLON.Vector3): js.Array[typings.babylonjs.BABYLON.Vector3] = js.native
  
  /**
    * Create a new Crowd so you can add agents
    * @param maxAgents the maximum agent count in the crowd
    * @param maxAgentRadius the maximum radius an agent can have
    * @param scene to attach the crowd to
    * @returns the crowd you can add agents to
    */
  /* CompleteClass */
  override def createCrowd(maxAgents: Double, maxAgentRadius: Double, scene: typings.babylonjs.BABYLON.Scene): ICrowd = js.native
  
  /**
    * Create a navigation mesh debug mesh
    * @param scene is where the mesh will be added
    * @returns debug display mesh
    */
  /* CompleteClass */
  override def createDebugNavMesh(scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Creates a navigation mesh
    * @param meshes array of all the geometry used to compute the navigatio mesh
    * @param parameters bunch of parameters used to filter geometry
    */
  /* CompleteClass */
  override def createNavMesh(meshes: js.Array[typings.babylonjs.BABYLON.Mesh], parameters: INavMeshParameters): Unit = js.native
  
  /**
    * Release all resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Get a navigation mesh constrained position, closest to the parameter position
    * @param position world position
    * @returns the closest point to position constrained by the navigation mesh
    */
  /* CompleteClass */
  override def getClosestPoint(position: typings.babylonjs.BABYLON.Vector3): typings.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Get a navigation mesh constrained position, closest to the parameter position
    * @param position world position
    * @param result output the closest point to position constrained by the navigation mesh
    */
  /* CompleteClass */
  override def getClosestPointToRef(position: typings.babylonjs.BABYLON.Vector3, result: typings.babylonjs.BABYLON.Vector3): Unit = js.native
  
  /**
    * Get the Bounding box extent specified by setDefaultQueryExtent
    * @returns the box extent values
    */
  /* CompleteClass */
  override def getDefaultQueryExtent(): typings.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Get the Bounding box extent result specified by setDefaultQueryExtent
    * @param result output the box extent values
    */
  /* CompleteClass */
  override def getDefaultQueryExtentToRef(result: typings.babylonjs.BABYLON.Vector3): Unit = js.native
  
  /**
    * Get the maximum number of iterations per navigation tick update
    * @returns the maximum number of iterations
    */
  /* CompleteClass */
  override def getMaximumSubStepCount(): Double = js.native
  
  /**
    * returns the navmesh data that can be used later. The navmesh must be built before retrieving the data
    * @returns data the Uint8Array that can be saved and reused
    */
  /* CompleteClass */
  override def getNavmeshData(): Uint8Array = js.native
  
  /**
    * Get a navigation mesh constrained position, within a particular radius
    * @param position world position
    * @param maxRadius the maximum distance to the constrained world position
    * @returns the closest point to position constrained by the navigation mesh
    */
  /* CompleteClass */
  override def getRandomPointAround(position: typings.babylonjs.BABYLON.Vector3, maxRadius: Double): typings.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Get a navigation mesh constrained position, within a particular radius
    * @param position world position
    * @param maxRadius the maximum distance to the constrained world position
    * @param result output the closest point to position constrained by the navigation mesh
    */
  /* CompleteClass */
  override def getRandomPointAroundToRef(
    position: typings.babylonjs.BABYLON.Vector3,
    maxRadius: Double,
    result: typings.babylonjs.BABYLON.Vector3
  ): Unit = js.native
  
  /**
    * Get the time step of the navigation tick update.
    * @returns the current time step
    */
  /* CompleteClass */
  override def getTimeStep(): Double = js.native
  
  /**
    * If this plugin is supported
    * @returns true if plugin is supported
    */
  /* CompleteClass */
  override def isSupported(): Boolean = js.native
  
  /**
    * Compute the final position from a segment made of destination-position
    * @param position world position
    * @param destination world position
    * @returns the resulting point along the navmesh
    */
  /* CompleteClass */
  override def moveAlong(position: typings.babylonjs.BABYLON.Vector3, destination: typings.babylonjs.BABYLON.Vector3): typings.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Compute the final position from a segment made of destination-position
    * @param position world position
    * @param destination world position
    * @param result output the resulting point along the navmesh
    */
  /* CompleteClass */
  override def moveAlongToRef(
    position: typings.babylonjs.BABYLON.Vector3,
    destination: typings.babylonjs.BABYLON.Vector3,
    result: typings.babylonjs.BABYLON.Vector3
  ): Unit = js.native
  
  /**
    * plugin name
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Set the Bounding box extent for doing spatial queries (getClosestPoint, getRandomPointAround, ...)
    * The queries will try to find a solution within those bounds
    * default is (1,1,1)
    * @param extent x,y,z value that define the extent around the queries point of reference
    */
  /* CompleteClass */
  override def setDefaultQueryExtent(extent: typings.babylonjs.BABYLON.Vector3): Unit = js.native
  
  /**
    * If delta time in navigation tick update is greater than the time step
    * a number of sub iterations are done. If more iterations are need to reach deltatime
    * they will be discarded.
    * A value of 0 will set to no maximum and update will use as many substeps as needed
    * @param newStepCount the maximum number of iterations
    */
  /* CompleteClass */
  override def setMaximumSubStepCount(newStepCount: Double): Unit = js.native
  
  /**
    * Set the time step of the navigation tick update.
    * Default is 1/60.
    * A value of 0 will disable fixed time update
    * @param newTimeStep the new timestep to apply to this world.
    */
  /* CompleteClass */
  override def setTimeStep(newTimeStep: Double): Unit = js.native
}
