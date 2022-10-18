package typings.babylonjs

import typings.babylonjs.anon.Height
import typings.babylonjs.anon.Ratio
import typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.mathsMathDotplaneMod.Plane
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesMirrorTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/mirrorTexture", "MirrorTexture")
  @js.native
  open class MirrorTexture protected () extends RenderTargetTexture {
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
    def this(
      name: String,
      size: Double | Height | Ratio,
      scene: js.UndefOr[Scene],
      generateMipMaps: js.UndefOr[Boolean],
      `type`: js.UndefOr[Double],
      samplingMode: js.UndefOr[Double],
      generateDepthBuffer: js.UndefOr[Boolean]
    ) = this()
    
    /* private */ var _adaptiveBlurKernel: Any = js.native
    
    /* private */ var _autoComputeBlurKernel: Any = js.native
    
    /* private */ var _blurKernelX: Any = js.native
    
    /* private */ var _blurKernelY: Any = js.native
    
    /* private */ var _blurRatio: Any = js.native
    
    /* private */ var _blurX: Any = js.native
    
    /* private */ var _blurY: Any = js.native
    
    /* private */ var _currentSceneUBO: Any = js.native
    
    /* private */ var _imageProcessingConfigChangeObserver: Any = js.native
    
    /* private */ var _mirrorMatrix: Any = js.native
    
    /* private */ var _preparePostProcesses: Any = js.native
    
    /* private */ var _sceneUBO: Any = js.native
    
    /* private */ var _transformMatrix: Any = js.native
    
    /* private */ var _updateGammaSpace: Any = js.native
    
    /**
      * Define the adaptive blur kernel used to blur the reflection if needed.
      * This will autocompute the closest best match for the `blurKernel`
      */
    def adaptiveBlurKernel_=(value: Double): Unit = js.native
    
    def blurKernelX: Double = js.native
    /**
      * Define the blur kernel on the X Axis used to blur the reflection if needed.
      * Please consider using `adaptiveBlurKernel` as it could find the closest best value for you.
      */
    def blurKernelX_=(value: Double): Unit = js.native
    
    def blurKernelY: Double = js.native
    /**
      * Define the blur kernel on the Y Axis used to blur the reflection if needed.
      * Please consider using `adaptiveBlurKernel` as it could find the closest best value for you.
      */
    def blurKernelY_=(value: Double): Unit = js.native
    
    /**
      * Define the blur kernel used to blur the reflection if needed.
      * Please consider using `adaptiveBlurKernel` as it could find the closest best value for you.
      */
    def blurKernel_=(value: Double): Unit = js.native
    
    def blurRatio: Double = js.native
    /**
      * Define the blur ratio used to blur the reflection if needed.
      */
    def blurRatio_=(value: Double): Unit = js.native
    
    /**
      * Define the reflection plane we want to use. The mirrorPlane is usually set to the constructed reflector.
      * It is possible to directly set the mirrorPlane by directly using a Plane(a, b, c, d) where a, b and c give the plane normal vector (a, b, c) and d is a scalar displacement from the mirrorPlane to the origin. However in all but the very simplest of situations it is more straight forward to set it to the reflector as stated in the doc.
      * @see https://doc.babylonjs.com/how_to/reflect#mirrors
      */
    var mirrorPlane: Plane = js.native
  }
}
