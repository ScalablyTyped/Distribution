package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationIndexMod {
  
  @JSImport("babylonjs/Navigation/index", "RecastJSCrowd")
  @js.native
  open class RecastJSCrowd protected ()
    extends typings.babylonjs.navigationPluginsIndexMod.RecastJSCrowd {
    /**
      * Constructor
      * @param plugin recastJS plugin
      * @param maxAgents the maximum agent count in the crowd
      * @param maxAgentRadius the maximum radius an agent can have
      * @param scene to attach the crowd to
      * @returns the crowd you can add agents to
      */
    def this(
      plugin: typings.babylonjs.navigationPluginsRecastJSPluginMod.RecastJSPlugin,
      maxAgents: Double,
      maxAgentRadius: Double,
      scene: Scene
    ) = this()
  }
  
  @JSImport("babylonjs/Navigation/index", "RecastJSPlugin")
  @js.native
  /**
    * Initializes the recastJS plugin
    * @param recastInjection can be used to inject your own recast reference
    */
  open class RecastJSPlugin ()
    extends typings.babylonjs.navigationPluginsIndexMod.RecastJSPlugin {
    def this(recastInjection: Any) = this()
  }
}
