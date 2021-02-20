package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecastJSCrowd extends ICrowd {
  
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
    getAgentNextTargetPath: Double => Vector3,
    getAgentNextTargetPathToRef: (Double, Vector3) => Unit,
    getAgentPosition: Double => Vector3,
    getAgentPositionToRef: (Double, Vector3) => Unit,
    getAgentState: Double => Double,
    getAgentVelocity: Double => Vector3,
    getAgentVelocityToRef: (Double, Vector3) => Unit,
    getAgents: () => js.Array[Double],
    getDefaultQueryExtent: () => Vector3,
    getDefaultQueryExtentToRef: Vector3 => Unit,
    overOffmeshConnection: Double => Boolean,
    recastCrowd: js.Any,
    removeAgent: Double => Unit,
    setDefaultQueryExtent: Vector3 => Unit,
    transforms: js.Array[TransformNode],
    update: Double => Unit,
    updateAgentParameters: (Double, IAgentParameters) => Unit
  ): RecastJSCrowd = {
    val __obj = js.Dynamic.literal(_onBeforeAnimationsObserver = _onBeforeAnimationsObserver.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], addAgent = js.Any.fromFunction3(addAgent), agentGoto = js.Any.fromFunction2(agentGoto), agentTeleport = js.Any.fromFunction2(agentTeleport), agents = agents.asInstanceOf[js.Any], bjsRECASTPlugin = bjsRECASTPlugin.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getAgentNextTargetPath = js.Any.fromFunction1(getAgentNextTargetPath), getAgentNextTargetPathToRef = js.Any.fromFunction2(getAgentNextTargetPathToRef), getAgentPosition = js.Any.fromFunction1(getAgentPosition), getAgentPositionToRef = js.Any.fromFunction2(getAgentPositionToRef), getAgentState = js.Any.fromFunction1(getAgentState), getAgentVelocity = js.Any.fromFunction1(getAgentVelocity), getAgentVelocityToRef = js.Any.fromFunction2(getAgentVelocityToRef), getAgents = js.Any.fromFunction0(getAgents), getDefaultQueryExtent = js.Any.fromFunction0(getDefaultQueryExtent), getDefaultQueryExtentToRef = js.Any.fromFunction1(getDefaultQueryExtentToRef), overOffmeshConnection = js.Any.fromFunction1(overOffmeshConnection), recastCrowd = recastCrowd.asInstanceOf[js.Any], removeAgent = js.Any.fromFunction1(removeAgent), setDefaultQueryExtent = js.Any.fromFunction1(setDefaultQueryExtent), transforms = transforms.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), updateAgentParameters = js.Any.fromFunction2(updateAgentParameters))
    __obj.asInstanceOf[RecastJSCrowd]
  }
  
  @scala.inline
  implicit class RecastJSCrowdMutableBuilder[Self <: RecastJSCrowd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgents(value: js.Array[Double]): Self = StObject.set(x, "agents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentsVarargs(value: Double*): Self = StObject.set(x, "agents", js.Array(value :_*))
    
    @scala.inline
    def setBjsRECASTPlugin(value: RecastJSPlugin): Self = StObject.set(x, "bjsRECASTPlugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecastCrowd(value: js.Any): Self = StObject.set(x, "recastCrowd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransforms(value: js.Array[TransformNode]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformsVarargs(value: TransformNode*): Self = StObject.set(x, "transforms", js.Array(value :_*))
    
    @scala.inline
    def set_onBeforeAnimationsObserver(value: js.Any): Self = StObject.set(x, "_onBeforeAnimationsObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_scene(value: js.Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
  }
}
