package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "RecastJSCrowd")
@js.native
class RecastJSCrowd protected ()
  extends typings.babylonjs.navigationIndexMod.RecastJSCrowd {
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

