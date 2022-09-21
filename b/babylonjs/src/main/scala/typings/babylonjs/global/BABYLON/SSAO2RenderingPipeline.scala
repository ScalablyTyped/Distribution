package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SSAO2RenderingPipeline")
@js.native
open class SSAO2RenderingPipeline protected ()
  extends StObject
     with typings.babylonjs.BABYLON.SSAO2RenderingPipeline {
  /**
    * @constructor
    * @param name The rendering pipeline name
    * @param scene The scene linked to this pipeline
    * @param ratio The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, blurRatio: 1.0 }
    * @param cameras The array of cameras that the rendering pipeline will be attached to
    * @param forceGeometryBuffer Set to true if you want to use the legacy geometry buffer renderer
    * @param textureType The texture type used by the different post processes created by SSAO (default: Constants.TEXTURETYPE_UNSIGNED_INT)
    */
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene, ratio: Any) = this()
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    ratio: Any,
    cameras: js.Array[typings.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    ratio: Any,
    cameras: js.Array[typings.babylonjs.BABYLON.Camera],
    forceGeometryBuffer: Boolean
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    ratio: Any,
    cameras: Unit,
    forceGeometryBuffer: Boolean
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    ratio: Any,
    cameras: js.Array[typings.babylonjs.BABYLON.Camera],
    forceGeometryBuffer: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    ratio: Any,
    cameras: js.Array[typings.babylonjs.BABYLON.Camera],
    forceGeometryBuffer: Unit,
    textureType: Double
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    ratio: Any,
    cameras: Unit,
    forceGeometryBuffer: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    ratio: Any,
    cameras: Unit,
    forceGeometryBuffer: Unit,
    textureType: Double
  ) = this()
}
/* static members */
object SSAO2RenderingPipeline {
  
  @JSGlobal("BABYLON.SSAO2RenderingPipeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.SSAO2RenderingPipeline.ORTHO_DEPTH_PROJECTION")
  @js.native
  val ORTHO_DEPTH_PROJECTION: Any = js.native
  
  @JSGlobal("BABYLON.SSAO2RenderingPipeline.PERSPECTIVE_DEPTH_PROJECTION")
  @js.native
  val PERSPECTIVE_DEPTH_PROJECTION: Any = js.native
  
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  inline def Parse(source: Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.SSAO2RenderingPipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SSAO2RenderingPipeline]
}
