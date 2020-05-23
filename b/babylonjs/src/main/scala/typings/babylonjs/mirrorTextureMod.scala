package typings.babylonjs

import typings.babylonjs.anon.Ratio
import typings.babylonjs.anon.Width
import typings.babylonjs.mathPlaneMod.Plane
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Textures/mirrorTexture", JSImport.Namespace)
@js.native
object mirrorTextureMod extends js.Object {
  @js.native
  class MirrorTexture protected () extends RenderTargetTexture {
    /**
      * Instantiates a Mirror Texture.
      * Mirror texture can be used to simulate the view from a mirror in a scene.
      * It will dynamically be rendered every frame to adapt to the camera point of view.
      * You can then easily use it as a reflectionTexture on a flat surface.
      * In case the surface is not a plane, please consider relying on reflection probes.
      * @see https://doc.babylonjs.com/how_to/reflect#mirrors
      * @param name
      * @param size
      * @param scene
      * @param generateMipMaps
      * @param type
      * @param samplingMode
      * @param generateDepthBuffer
      */
    def this(name: String, size: Double, scene: Scene) = this()
    def this(name: String, size: Ratio, scene: Scene) = this()
    def this(name: String, size: Width, scene: Scene) = this()
    def this(name: String, size: Double, scene: Scene, generateMipMaps: Boolean) = this()
    def this(name: String, size: Ratio, scene: Scene, generateMipMaps: Boolean) = this()
    def this(name: String, size: Width, scene: Scene, generateMipMaps: Boolean) = this()
    def this(name: String, size: Double, scene: Scene, generateMipMaps: Boolean, `type`: Double) = this()
    def this(name: String, size: Ratio, scene: Scene, generateMipMaps: Boolean, `type`: Double) = this()
    def this(name: String, size: Width, scene: Scene, generateMipMaps: Boolean, `type`: Double) = this()
    def this(
      name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      `type`: Double,
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      size: Ratio,
      scene: Scene,
      generateMipMaps: Boolean,
      `type`: Double,
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      size: Width,
      scene: Scene,
      generateMipMaps: Boolean,
      `type`: Double,
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      size: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      `type`: Double,
      samplingMode: Double,
      generateDepthBuffer: Boolean
    ) = this()
    def this(
      name: String,
      size: Ratio,
      scene: Scene,
      generateMipMaps: Boolean,
      `type`: Double,
      samplingMode: Double,
      generateDepthBuffer: Boolean
    ) = this()
    def this(
      name: String,
      size: Width,
      scene: Scene,
      generateMipMaps: Boolean,
      `type`: Double,
      samplingMode: Double,
      generateDepthBuffer: Boolean
    ) = this()
    var _adaptiveBlurKernel: js.Any = js.native
    var _autoComputeBlurKernel: js.Any = js.native
    var _blurKernelX: js.Any = js.native
    var _blurKernelY: js.Any = js.native
    var _blurRatio: js.Any = js.native
    var _blurX: js.Any = js.native
    var _blurY: js.Any = js.native
    var _imageProcessingConfigChangeObserver: js.Any = js.native
    var _mirrorMatrix: js.Any = js.native
    var _preparePostProcesses: js.Any = js.native
    var _savedViewMatrix: js.Any = js.native
    var _transformMatrix: js.Any = js.native
    var _updateGammaSpace: js.Any = js.native
    /**
      * Define the reflection plane we want to use. The mirrorPlane is usually set to the constructed reflector.
      * It is possible to directly set the mirrorPlane by directly using a Plane(a, b, c, d) where a, b and c give the plane normal vector (a, b, c) and d is a scalar displacement from the mirrorPlane to the origin. However in all but the very simplest of situations it is more straight forward to set it to the reflector as stated in the doc.
      * @see https://doc.babylonjs.com/how_to/reflect#mirrors
      */
    var mirrorPlane: Plane = js.native
    var scene: js.Any = js.native
    /**
      * Define the adaptive blur kernel used to blur the reflection if needed.
      * This will autocompute the closest best match for the `blurKernel`
      */
    def adaptiveBlurKernel(value: Double): js.Any = js.native
    /**
      * Define the blur kernel used to blur the reflection if needed.
      * Please consider using `adaptiveBlurKernel` as it could find the closest best value for you.
      */
    def blurKernel(value: Double): js.Any = js.native
    def blurKernelX: Double = js.native
    /**
      * Define the blur kernel on the X Axis used to blur the reflection if needed.
      * Please consider using `adaptiveBlurKernel` as it could find the closest best value for you.
      */
    def blurKernelX(value: Double): js.Any = js.native
    def blurKernelY: Double = js.native
    /**
      * Define the blur kernel on the Y Axis used to blur the reflection if needed.
      * Please consider using `adaptiveBlurKernel` as it could find the closest best value for you.
      */
    def blurKernelY(value: Double): js.Any = js.native
    def blurRatio: Double = js.native
    /**
      * Define the blur ratio used to blur the reflection if needed.
      */
    def blurRatio(value: Double): js.Any = js.native
  }
  
}

