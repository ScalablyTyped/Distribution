package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderingGroupInfo extends js.Object {
  /**
    * The camera currently used for the rendering pass
    */
  var camera: Nullable[Camera]
  /**
    * The ID of the renderingGroup being processed
    */
  var renderingGroupId: Double
  /**
    * The Scene that being rendered
    */
  var scene: Scene
}

object RenderingGroupInfo {
  @scala.inline
  def apply(renderingGroupId: Double, scene: Scene, camera: Nullable[Camera] = null): RenderingGroupInfo = {
    val __obj = js.Dynamic.literal(renderingGroupId = renderingGroupId.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderingGroupInfo]
  }
}

