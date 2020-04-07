package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "DefaultRenderingPipeline")
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
  extends typings.babylonjs.postProcessesIndexMod.DefaultRenderingPipeline {
  def this(name: String) = this()
  def this(name: String, hdr: Boolean) = this()
  def this(name: String, hdr: Boolean, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: js.Array[typings.babylonjs.cameraMod.Camera]
  ) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: js.Array[typings.babylonjs.cameraMod.Camera],
    automaticBuild: Boolean
  ) = this()
}

/* static members */
@JSImport("babylonjs/index", "DefaultRenderingPipeline")
@js.native
object DefaultRenderingPipeline extends js.Object {
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  def Parse(source: js.Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.defaultRenderingPipelineMod.DefaultRenderingPipeline = js.native
}

