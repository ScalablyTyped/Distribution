package typings.babylonjs

import typings.babylonjs.inavigationengineMod.IAgentParameters
import typings.babylonjs.inavigationengineMod.ICrowd
import typings.babylonjs.inavigationengineMod.INavMeshParameters
import typings.babylonjs.inavigationengineMod.INavigationEnginePlugin
import typings.babylonjs.mathMod.Vector3
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.transformNodeMod.TransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Navigation/Plugins/recastJSPlugin", JSImport.Namespace)
@js.native
object recastJSPluginMod extends js.Object {
  @js.native
  class RecastJSCrowd protected () extends ICrowd {
    /**
      * Constructor
      * @param plugin recastJS plugin
      * @param maxAgents the maximum agent count in the crowd
      * @param maxAgentRadius the maximum radius an agent can have
      * @param scene to attach the crowd to
      * @returns the crowd you can add agents to
      */
    def this(plugin: RecastJSPlugin, maxAgents: Double, maxAgentRadius: Double, scene: Scene) = this()
    /**
      * Observer for crowd updates
      */
    var _onBeforeAnimationsObserver: js.Any = js.native
    /**
      * Link to the scene is kept to unregister the crowd from the scene
      */
    var _scene: js.Any = js.native
    /**
      * All agents created
      */
    var agents: js.Array[Double] = js.native
    /**
      * Recast/detour plugin
      */
    var bjsRECASTPlugin: RecastJSPlugin = js.native
    /**
      * Link to the detour crowd
      */
    var recastCrowd: js.Any = js.native
    /**
      * One transform per agent
      */
    var transforms: js.Array[TransformNode] = js.native
    /**
      * Add a new agent to the crowd with the specified parameter a corresponding transformNode.
      * You can attach anything to that node. The node position is updated in the scene update tick.
      * @param pos world position that will be constrained by the navigation mesh
      * @param parameters agent parameters
      * @param transform hooked to the agent that will be update by the scene
      * @returns agent index
      */
    /* CompleteClass */
    override def addAgent(pos: Vector3, parameters: IAgentParameters, transform: TransformNode): Double = js.native
    /**
      * Asks a particular agent to go to a destination. That destination is constrained by the navigation mesh
      * @param index agent index returned by addAgent
      * @param destination targeted world position
      */
    /* CompleteClass */
    override def agentGoto(index: Double, destination: Vector3): Unit = js.native
    /**
      * Teleport the agent to a new position
      * @param index agent index returned by addAgent
      * @param destination targeted world position
      */
    /* CompleteClass */
    override def agentTeleport(index: Double, destination: Vector3): Unit = js.native
    /**
      * Release all resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /**
      * Returns the agent position in world space
      * @param index agent index returned by addAgent
      * @returns world space position
      */
    /* CompleteClass */
    override def getAgentPosition(index: Double): Vector3 = js.native
    /**
      * Gets the agent velocity in world space
      * @param index agent index returned by addAgent
      * @returns world space velocity
      */
    /* CompleteClass */
    override def getAgentVelocity(index: Double): Vector3 = js.native
    /**
      * get the list of all agents attached to this crowd
      * @returns list of agent indices
      */
    /* CompleteClass */
    override def getAgents(): js.Array[Double] = js.native
    /**
      * Get the Bounding box extent specified by setDefaultQueryExtent
      * @returns the box extent values
      */
    /* CompleteClass */
    override def getDefaultQueryExtent(): Vector3 = js.native
    /**
      * remove a particular agent previously created
      * @param index agent index returned by addAgent
      */
    /* CompleteClass */
    override def removeAgent(index: Double): Unit = js.native
    /**
      * Set the Bounding box extent for doing spatial queries (getClosestPoint, getRandomPointAround, ...)
      * The queries will try to find a solution within those bounds
      * default is (1,1,1)
      * @param extent x,y,z value that define the extent around the queries point of reference
      */
    /* CompleteClass */
    override def setDefaultQueryExtent(extent: Vector3): Unit = js.native
    /**
      * Tick update done by the Scene. Agent position/velocity/acceleration is updated by this function
      * @param deltaTime in seconds
      */
    /* CompleteClass */
    override def update(deltaTime: Double): Unit = js.native
    /**
      * Update agent parameters
      * @param index agent index returned by addAgent
      * @param parameters agent parameters
      */
    /* CompleteClass */
    override def updateAgentParameters(index: Double, parameters: IAgentParameters): Unit = js.native
  }
  
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
  
}

