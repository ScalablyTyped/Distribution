package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "RecastJSCrowd")
@js.native
open class RecastJSCrowd protected ()
  extends typings.babylonjs.legacyLegacyMod.RecastJSCrowd {
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
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}
