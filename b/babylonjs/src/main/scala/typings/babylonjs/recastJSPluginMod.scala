package typings.babylonjs

import typings.babylonjs.inavigationengineMod.ICrowd
import typings.babylonjs.inavigationengineMod.INavigationEnginePlugin
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.transformNodeMod.TransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  }
  
  @js.native
  /**
    * Initializes the recastJS plugin
    * @param recastInjection can be used to inject your own recast reference
    */
  class RecastJSPlugin () extends INavigationEnginePlugin {
    def this(recastInjection: js.Any) = this()
    
    var _maximumSubStepCount: js.Any = js.native
    
    var _timeStep: js.Any = js.native
    
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
}
