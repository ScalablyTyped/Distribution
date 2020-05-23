package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RenderingGroupInfo")
@js.native
class RenderingGroupInfo ()
  extends typings.babylonjs.BABYLON.RenderingGroupInfo {
  /**
    * The camera currently used for the rendering pass
    */
  /* CompleteClass */
  override var camera: Nullable[typings.babylonjs.BABYLON.Camera] = js.native
  /**
    * The ID of the renderingGroup being processed
    */
  /* CompleteClass */
  override var renderingGroupId: Double = js.native
  /**
    * The Scene that being rendered
    */
  /* CompleteClass */
  override var scene: typings.babylonjs.BABYLON.Scene = js.native
}

