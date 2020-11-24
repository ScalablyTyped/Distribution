package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "DefaultRenderingPipeline")
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
  extends typings.babylonjs.renderPipelineIndexMod.DefaultRenderingPipeline {
  def this(name: String) = this()
  def this(name: js.UndefOr[scala.Nothing], hdr: Boolean) = this()
  def this(name: String, hdr: Boolean) = this()
  def this(name: js.UndefOr[scala.Nothing], hdr: js.UndefOr[scala.Nothing], scene: Scene) = this()
  def this(name: js.UndefOr[scala.Nothing], hdr: Boolean, scene: Scene) = this()
  def this(name: String, hdr: js.UndefOr[scala.Nothing], scene: Scene) = this()
  def this(name: String, hdr: Boolean, scene: Scene) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[scala.Nothing],
    cameras: js.Array[Camera]
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: js.UndefOr[scala.Nothing],
    scene: Scene,
    cameras: js.Array[Camera]
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: Boolean,
    scene: js.UndefOr[scala.Nothing],
    cameras: js.Array[Camera]
  ) = this()
  def this(name: js.UndefOr[scala.Nothing], hdr: Boolean, scene: Scene, cameras: js.Array[Camera]) = this()
  def this(
    name: String,
    hdr: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[scala.Nothing],
    cameras: js.Array[Camera]
  ) = this()
  def this(name: String, hdr: js.UndefOr[scala.Nothing], scene: Scene, cameras: js.Array[Camera]) = this()
  def this(name: String, hdr: Boolean, scene: js.UndefOr[scala.Nothing], cameras: js.Array[Camera]) = this()
  def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera]) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[scala.Nothing],
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[scala.Nothing],
    cameras: js.Array[Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: js.UndefOr[scala.Nothing],
    scene: Scene,
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: js.UndefOr[scala.Nothing],
    scene: Scene,
    cameras: js.Array[Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: Boolean,
    scene: js.UndefOr[scala.Nothing],
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: Boolean,
    scene: js.UndefOr[scala.Nothing],
    cameras: js.Array[Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: Boolean,
    scene: Scene,
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: Boolean,
    scene: Scene,
    cameras: js.Array[Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[scala.Nothing],
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[scala.Nothing],
    cameras: js.Array[Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: js.UndefOr[scala.Nothing],
    scene: Scene,
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: js.UndefOr[scala.Nothing],
    scene: Scene,
    cameras: js.Array[Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: js.UndefOr[scala.Nothing],
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: js.UndefOr[scala.Nothing],
    cameras: js.Array[Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: Scene,
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
}
/* static members */
@JSImport("babylonjs/PostProcesses/index", "DefaultRenderingPipeline")
@js.native
object DefaultRenderingPipeline extends js.Object {
  
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.defaultRenderingPipelineMod.DefaultRenderingPipeline = js.native
}
