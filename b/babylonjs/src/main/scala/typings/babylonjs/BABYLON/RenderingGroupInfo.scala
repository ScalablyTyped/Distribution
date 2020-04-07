package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RenderingGroupInfo")
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

