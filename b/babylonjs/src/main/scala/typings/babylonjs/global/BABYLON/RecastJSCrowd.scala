package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
