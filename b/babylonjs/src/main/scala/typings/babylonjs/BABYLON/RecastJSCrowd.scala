package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RecastJSCrowd")
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

