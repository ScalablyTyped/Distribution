package typings.babylonjs.renderingManagerMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Rendering/renderingManager", "RenderingGroupInfo")
@js.native
class RenderingGroupInfo () extends js.Object {
  /**
    * The camera currently used for the rendering pass
    */
  var camera: Nullable[Camera] = js.native
  /**
    * The ID of the renderingGroup being processed
    */
  var renderingGroupId: Double = js.native
  /**
    * The Scene that being rendered
    */
  var scene: Scene = js.native
}

