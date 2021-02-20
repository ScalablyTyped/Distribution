package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorCorrectionPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/colorCorrectionPostProcess", "ColorCorrectionPostProcess")
  @js.native
  class ColorCorrectionPostProcess protected () extends PostProcess {
    def this(name: String, colorTableUrl: String, options: Double, camera: Camera) = this()
    def this(name: String, colorTableUrl: String, options: PostProcessOptions, camera: Camera) = this()
    def this(name: String, colorTableUrl: String, options: Double, camera: Camera, samplingMode: Double) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Camera,
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Camera,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Camera,
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Camera,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Camera,
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Camera,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Camera,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Camera,
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Camera,
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Camera,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Camera,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Camera,
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Camera,
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    
    var _colorTableTexture: js.Any = js.native
    
    /**
      * Gets the color table url used to create the LUT texture
      */
    var colorTableUrl: String = js.native
  }
  /* static members */
  object ColorCorrectionPostProcess {
    
    /** @hidden */
    @JSImport("babylonjs/PostProcesses/colorCorrectionPostProcess", "ColorCorrectionPostProcess._Parse")
    @js.native
    def _Parse(parsedPostProcess: js.Any, targetCamera: Camera, scene: Scene, rootUrl: String): Nullable[ColorCorrectionPostProcess] = js.native
  }
}
