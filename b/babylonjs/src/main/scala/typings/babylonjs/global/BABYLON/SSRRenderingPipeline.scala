package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SSRRenderingPipeline")
@js.native
open class SSRRenderingPipeline protected ()
  extends StObject
     with typings.babylonjs.BABYLON.SSRRenderingPipeline {
  /**
    * Constructor of the SSR rendering pipeline
    * @param name The rendering pipeline name
    * @param scene The scene linked to this pipeline
    * @param cameras The array of cameras that the rendering pipeline will be attached to (default: scene.cameras)
    * @param forceGeometryBuffer Set to true if you want to use the legacy geometry buffer renderer (default: false)
    * @param textureType The texture type used by the different post processes created by SSR (default: Constants.TEXTURETYPE_UNSIGNED_BYTE)
    */
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    cameras: js.Array[typings.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    cameras: js.Array[typings.babylonjs.BABYLON.Camera],
    forceGeometryBuffer: Boolean
  ) = this()
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene, cameras: Unit, forceGeometryBuffer: Boolean) = this()
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    cameras: js.Array[typings.babylonjs.BABYLON.Camera],
    forceGeometryBuffer: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    cameras: js.Array[typings.babylonjs.BABYLON.Camera],
    forceGeometryBuffer: Unit,
    textureType: Double
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    cameras: Unit,
    forceGeometryBuffer: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    cameras: Unit,
    forceGeometryBuffer: Unit,
    textureType: Double
  ) = this()
}
/* static members */
object SSRRenderingPipeline {
  
  @JSGlobal("BABYLON.SSRRenderingPipeline")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  inline def Parse(source: Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.SSRRenderingPipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SSRRenderingPipeline]
}
