package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecastJSCrowd extends ICrowd {
  /**
    * Observer for crowd updates
    */
  var _onBeforeAnimationsObserver: js.Any
  /**
    * Link to the scene is kept to unregister the crowd from the scene
    */
  var _scene: js.Any
  /**
    * All agents created
    */
  var agents: js.Array[Double]
  /**
    * Recast/detour plugin
    */
  var bjsRECASTPlugin: RecastJSPlugin
  /**
    * Link to the detour crowd
    */
  var recastCrowd: js.Any
  /**
    * One transform per agent
    */
  var transforms: js.Array[TransformNode]
}

object RecastJSCrowd {
  @scala.inline
  def apply(
    _onBeforeAnimationsObserver: js.Any,
    _scene: js.Any,
    addAgent: (Vector3, IAgentParameters, TransformNode) => Double,
    agentGoto: (Double, Vector3) => Unit,
    agentTeleport: (Double, Vector3) => Unit,
    agents: js.Array[Double],
    bjsRECASTPlugin: RecastJSPlugin,
    dispose: () => Unit,
    getAgentPosition: Double => Vector3,
    getAgentVelocity: Double => Vector3,
    getAgents: () => js.Array[Double],
    getDefaultQueryExtent: () => Vector3,
    recastCrowd: js.Any,
    removeAgent: Double => Unit,
    setDefaultQueryExtent: Vector3 => Unit,
    transforms: js.Array[TransformNode],
    update: Double => Unit,
    updateAgentParameters: (Double, IAgentParameters) => Unit
  ): RecastJSCrowd = {
    val __obj = js.Dynamic.literal(_onBeforeAnimationsObserver = _onBeforeAnimationsObserver.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], addAgent = js.Any.fromFunction3(addAgent), agentGoto = js.Any.fromFunction2(agentGoto), agentTeleport = js.Any.fromFunction2(agentTeleport), agents = agents.asInstanceOf[js.Any], bjsRECASTPlugin = bjsRECASTPlugin.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getAgentPosition = js.Any.fromFunction1(getAgentPosition), getAgentVelocity = js.Any.fromFunction1(getAgentVelocity), getAgents = js.Any.fromFunction0(getAgents), getDefaultQueryExtent = js.Any.fromFunction0(getDefaultQueryExtent), recastCrowd = recastCrowd.asInstanceOf[js.Any], removeAgent = js.Any.fromFunction1(removeAgent), setDefaultQueryExtent = js.Any.fromFunction1(setDefaultQueryExtent), transforms = transforms.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), updateAgentParameters = js.Any.fromFunction2(updateAgentParameters))
    __obj.asInstanceOf[RecastJSCrowd]
  }
}

