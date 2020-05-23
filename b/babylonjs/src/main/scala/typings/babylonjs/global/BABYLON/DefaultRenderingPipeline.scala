package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DefaultRenderingPipeline")
@js.native
/**
  * @constructor
  * @param name - The rendering pipeline name (default: "")
  * @param hdr - If high dynamic range textures should be used (default: true)
  * @param scene - The scene linked to this pipeline (default: the last created scene)
  * @param cameras - The array of cameras that the rendering pipeline will be attached to (default: scene.cameras)
  * @param automaticBuild - if false, you will have to manually call prepare() to update the pipeline (default: true)
  */
class DefaultRenderingPipeline ()
  extends typings.babylonjs.BABYLON.DefaultRenderingPipeline {
  def this(name: String) = this()
  def this(name: String, hdr: Boolean) = this()
  def this(name: String, hdr: Boolean, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: typings.babylonjs.BABYLON.Scene,
    cameras: js.Array[typings.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: typings.babylonjs.BABYLON.Scene,
    cameras: js.Array[typings.babylonjs.BABYLON.Camera],
    automaticBuild: Boolean
  ) = this()
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.DefaultRenderingPipeline")
@js.native
object DefaultRenderingPipeline extends js.Object {
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  def Parse(source: js.Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.DefaultRenderingPipeline = js.native
}

