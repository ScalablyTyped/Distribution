package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IAgentParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RecastJSCrowd")
@js.native
class RecastJSCrowd protected ()
  extends typings.babylonjs.BABYLON.RecastJSCrowd {
  /**
    * Constructor
    * @param plugin recastJS plugin
    * @param maxAgents the maximum agent count in the crowd
    * @param maxAgentRadius the maximum radius an agent can have
    * @param scene to attach the crowd to
    * @returns the crowd you can add agents to
    */
  def this(
    plugin: typings.babylonjs.BABYLON.RecastJSPlugin,
    maxAgents: Double,
    maxAgentRadius: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  /**
    * Observer for crowd updates
    */
  /* CompleteClass */
  override var _onBeforeAnimationsObserver: js.Any = js.native
  /**
    * Link to the scene is kept to unregister the crowd from the scene
    */
  /* CompleteClass */
  override var _scene: js.Any = js.native
  /**
    * All agents created
    */
  /* CompleteClass */
  override var agents: js.Array[Double] = js.native
  /**
    * Recast/detour plugin
    */
  /* CompleteClass */
  override var bjsRECASTPlugin: typings.babylonjs.BABYLON.RecastJSPlugin = js.native
  /**
    * Link to the detour crowd
    */
  /* CompleteClass */
  override var recastCrowd: js.Any = js.native
  /**
    * One transform per agent
    */
  /* CompleteClass */
  override var transforms: js.Array[typings.babylonjs.BABYLON.TransformNode] = js.native
  /**
    * Add a new agent to the crowd with the specified parameter a corresponding transformNode.
    * You can attach anything to that node. The node position is updated in the scene update tick.
    * @param pos world position that will be constrained by the navigation mesh
    * @param parameters agent parameters
    * @param transform hooked to the agent that will be update by the scene
    * @returns agent index
    */
  /* CompleteClass */
  override def addAgent(
    pos: typings.babylonjs.BABYLON.Vector3,
    parameters: IAgentParameters,
    transform: typings.babylonjs.BABYLON.TransformNode
  ): Double = js.native
  /**
    * Asks a particular agent to go to a destination. That destination is constrained by the navigation mesh
    * @param index agent index returned by addAgent
    * @param destination targeted world position
    */
  /* CompleteClass */
  override def agentGoto(index: Double, destination: typings.babylonjs.BABYLON.Vector3): Unit = js.native
  /**
    * Teleport the agent to a new position
    * @param index agent index returned by addAgent
    * @param destination targeted world position
    */
  /* CompleteClass */
  override def agentTeleport(index: Double, destination: typings.babylonjs.BABYLON.Vector3): Unit = js.native
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
  override def getAgentPosition(index: Double): typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * Gets the agent velocity in world space
    * @param index agent index returned by addAgent
    * @returns world space velocity
    */
  /* CompleteClass */
  override def getAgentVelocity(index: Double): typings.babylonjs.BABYLON.Vector3 = js.native
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
  override def getDefaultQueryExtent(): typings.babylonjs.BABYLON.Vector3 = js.native
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
  override def setDefaultQueryExtent(extent: typings.babylonjs.BABYLON.Vector3): Unit = js.native
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

