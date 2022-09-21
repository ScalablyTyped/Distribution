package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
open class DefaultRenderingPipeline ()
  extends typings.babylonjs.renderPipelineIndexMod.DefaultRenderingPipeline {
  def this(name: String) = this()
  def this(name: String, hdr: Boolean) = this()
  def this(name: Unit, hdr: Boolean) = this()
  def this(name: String, hdr: Boolean, scene: Scene) = this()
  def this(name: String, hdr: Unit, scene: Scene) = this()
  def this(name: Unit, hdr: Boolean, scene: Scene) = this()
  def this(name: Unit, hdr: Unit, scene: Scene) = this()
  def this(name: String, hdr: Boolean, scene: Unit, cameras: js.Array[Camera]) = this()
  def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera]) = this()
  def this(name: String, hdr: Unit, scene: Unit, cameras: js.Array[Camera]) = this()
  def this(name: String, hdr: Unit, scene: Scene, cameras: js.Array[Camera]) = this()
  def this(name: Unit, hdr: Boolean, scene: Unit, cameras: js.Array[Camera]) = this()
  def this(name: Unit, hdr: Boolean, scene: Scene, cameras: js.Array[Camera]) = this()
  def this(name: Unit, hdr: Unit, scene: Unit, cameras: js.Array[Camera]) = this()
  def this(name: Unit, hdr: Unit, scene: Scene, cameras: js.Array[Camera]) = this()
  def this(name: String, hdr: Boolean, scene: Unit, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
  def this(name: String, hdr: Boolean, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
  def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
  def this(name: String, hdr: Boolean, scene: Scene, cameras: Unit, automaticBuild: Boolean) = this()
  def this(name: String, hdr: Unit, scene: Unit, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
  def this(name: String, hdr: Unit, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
  def this(name: String, hdr: Unit, scene: Scene, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
  def this(name: String, hdr: Unit, scene: Scene, cameras: Unit, automaticBuild: Boolean) = this()
  def this(name: Unit, hdr: Boolean, scene: Unit, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
  def this(name: Unit, hdr: Boolean, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
  def this(name: Unit, hdr: Boolean, scene: Scene, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
  def this(name: Unit, hdr: Boolean, scene: Scene, cameras: Unit, automaticBuild: Boolean) = this()
  def this(name: Unit, hdr: Unit, scene: Unit, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
  def this(name: Unit, hdr: Unit, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
  def this(name: Unit, hdr: Unit, scene: Scene, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
  def this(name: Unit, hdr: Unit, scene: Scene, cameras: Unit, automaticBuild: Boolean) = this()
}
/* static members */
object DefaultRenderingPipeline {
  
  @JSImport("babylonjs/PostProcesses/index", "DefaultRenderingPipeline")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  inline def Parse(source: Any, scene: Scene, rootUrl: String): typings.babylonjs.defaultRenderingPipelineMod.DefaultRenderingPipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.defaultRenderingPipelineMod.DefaultRenderingPipeline]
}
