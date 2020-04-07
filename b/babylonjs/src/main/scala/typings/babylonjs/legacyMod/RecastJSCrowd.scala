package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "RecastJSCrowd")
@js.native
class RecastJSCrowd protected ()
  extends typings.babylonjs.indexMod.RecastJSCrowd {
  /**
    * Constructor
    * @param plugin recastJS plugin
    * @param maxAgents the maximum agent count in the crowd
    * @param maxAgentRadius the maximum radius an agent can have
    * @param scene to attach the crowd to
    * @returns the crowd you can add agents to
    */
  def this(
    plugin: typings.babylonjs.recastJSPluginMod.RecastJSPlugin,
    maxAgents: Double,
    maxAgentRadius: Double,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}

