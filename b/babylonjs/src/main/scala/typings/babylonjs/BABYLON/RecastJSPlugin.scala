package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RecastJSPlugin")
@js.native
/**
  * Initializes the recastJS plugin
  * @param recastInjection can be used to inject your own recast reference
  */
class RecastJSPlugin () extends INavigationEnginePlugin {
  def this(recastInjection: js.Any) = this()
  /**
    * Reference to the Recast library
    */
  var bjsRECAST: js.Any = js.native
  /**
    * plugin name
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * the first navmesh created. We might extend this to support multiple navmeshes
    */
  var navMesh: js.Any = js.native
  /**
    * Compute a navigation path from start to end. Returns an empty array if no path can be computed
    * @param start world position
    * @param end world position
    * @returns array containing world position composing the path
    */
  /* CompleteClass */
  override def computePath(start: Vector3, end: Vector3): js.Array[Vector3] = js.native
  /**
    * Create a new Crowd so you can add agents
    * @param maxAgents the maximum agent count in the crowd
    * @param maxAgentRadius the maximum radius an agent can have
    * @param scene to attach the crowd to
    * @returns the crowd you can add agents to
    */
  /* CompleteClass */
  override def createCrowd(maxAgents: Double, maxAgentRadius: Double, scene: Scene): ICrowd = js.native
  /**
    * Create a navigation mesh debug mesh
    * @param scene is where the mesh will be added
    * @returns debug display mesh
    */
  /* CompleteClass */
  override def createDebugNavMesh(scene: Scene): Mesh = js.native
  /**
    * Creates a navigation mesh
    * @param meshes array of all the geometry used to compute the navigatio mesh
    * @param parameters bunch of parameters used to filter geometry
    */
  /* CompleteClass */
  override def createNavMesh(meshes: js.Array[Mesh], parameters: INavMeshParameters): Unit = js.native
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
  override def getClosestPoint(position: Vector3): Vector3 = js.native
  /**
    * Get the Bounding box extent specified by setDefaultQueryExtent
    * @returns the box extent values
    */
  /* CompleteClass */
  override def getDefaultQueryExtent(): Vector3 = js.native
  /**
    * Get a navigation mesh constrained position, within a particular radius
    * @param position world position
    * @param maxRadius the maximum distance to the constrained world position
    * @returns the closest point to position constrained by the navigation mesh
    */
  /* CompleteClass */
  override def getRandomPointAround(position: Vector3, maxRadius: Double): Vector3 = js.native
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
  override def moveAlong(position: Vector3, destination: Vector3): Vector3 = js.native
  /**
    * Set the Bounding box extent for doing spatial queries (getClosestPoint, getRandomPointAround, ...)
    * The queries will try to find a solution within those bounds
    * default is (1,1,1)
    * @param extent x,y,z value that define the extent around the queries point of reference
    */
  /* CompleteClass */
  override def setDefaultQueryExtent(extent: Vector3): Unit = js.native
}

