package typings.babylonjs

import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.textureCreationOptionsMod.TextureSize
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderTargetWrapperMod {
  
  @JSImport("babylonjs/Engines/renderTargetWrapper", "RenderTargetWrapper")
  @js.native
  open class RenderTargetWrapper protected () extends StObject {
    /**
      * Initializes the render target wrapper
      * @param isMulti true if the wrapper is a multi render target
      * @param isCube true if the wrapper should render to a cube texture
      * @param size size of the render target (width/height/layers)
      * @param engine engine used to create the render target
      */
    def this(isMulti: Boolean, isCube: Boolean, size: TextureSize, engine: ThinEngine) = this()
    
    /** @hidden */
    var _attachments: Nullable[js.Array[Double]] = js.native
    
    /* protected */ def _cloneRenderTargetWrapper(): Nullable[RenderTargetWrapper] = js.native
    
    /** @hidden */
    var _depthStencilTexture: Nullable[InternalTexture] = js.native
    
    /** @hidden */
    var _depthStencilTextureWithStencil: Boolean = js.native
    
    /* protected */ var _engine: ThinEngine = js.native
    
    /** @hidden */
    var _generateDepthBuffer: Boolean = js.native
    
    /** @hidden */
    var _generateStencilBuffer: Boolean = js.native
    
    /* private */ var _isCube: Any = js.native
    
    /* private */ var _isMulti: Any = js.native
    
    /** @hidden */
    def _rebuild(): Unit = js.native
    
    /* private */ var _samples: Any = js.native
    
    /**
      * Shares the depth buffer of this render target with another render target.
      * @hidden
      * @param renderTarget Destination renderTarget
      */
    def _shareDepth(renderTarget: RenderTargetWrapper): Unit = js.native
    
    /* private */ var _size: Any = js.native
    
    /**
      * @param target
      * @hidden
      */
    def _swapAndDie(target: InternalTexture): Unit = js.native
    
    /* protected */ def _swapRenderTargetWrapper(target: RenderTargetWrapper): Unit = js.native
    
    /* private */ var _textures: Any = js.native
    
    /**
      * Creates the depth/stencil texture
      * @param comparisonFunction Comparison function to use for the texture
      * @param bilinearFiltering true if bilinear filtering should be used when sampling the texture
      * @param generateStencil true if the stencil aspect should also be created
      * @param samples sample count to use when creating the texture
      * @param format format of the depth texture
      * @returns the depth/stencil created texture
      */
    def createDepthStencilTexture(): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Double): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Double, bilinearFiltering: Boolean): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Double, bilinearFiltering: Boolean, generateStencil: Boolean): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Double, bilinearFiltering: Boolean, generateStencil: Boolean, samples: Double): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Boolean,
      generateStencil: Boolean,
      samples: Double,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Boolean,
      generateStencil: Boolean,
      samples: Unit,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Double, bilinearFiltering: Boolean, generateStencil: Unit, samples: Double): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Boolean,
      generateStencil: Unit,
      samples: Double,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Boolean,
      generateStencil: Unit,
      samples: Unit,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Double, bilinearFiltering: Unit, generateStencil: Boolean): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Double, bilinearFiltering: Unit, generateStencil: Boolean, samples: Double): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Unit,
      generateStencil: Boolean,
      samples: Double,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Unit,
      generateStencil: Boolean,
      samples: Unit,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Double, bilinearFiltering: Unit, generateStencil: Unit, samples: Double): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Unit,
      generateStencil: Unit,
      samples: Double,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Double,
      bilinearFiltering: Unit,
      generateStencil: Unit,
      samples: Unit,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Unit, bilinearFiltering: Boolean): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Unit, bilinearFiltering: Boolean, generateStencil: Boolean): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Unit, bilinearFiltering: Boolean, generateStencil: Boolean, samples: Double): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Boolean,
      generateStencil: Boolean,
      samples: Double,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Boolean,
      generateStencil: Boolean,
      samples: Unit,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Unit, bilinearFiltering: Boolean, generateStencil: Unit, samples: Double): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Boolean,
      generateStencil: Unit,
      samples: Double,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Boolean,
      generateStencil: Unit,
      samples: Unit,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Unit, bilinearFiltering: Unit, generateStencil: Boolean): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Unit, bilinearFiltering: Unit, generateStencil: Boolean, samples: Double): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Unit,
      generateStencil: Boolean,
      samples: Double,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Unit,
      generateStencil: Boolean,
      samples: Unit,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(comparisonFunction: Unit, bilinearFiltering: Unit, generateStencil: Unit, samples: Double): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Unit,
      generateStencil: Unit,
      samples: Double,
      format: Double
    ): InternalTexture = js.native
    def createDepthStencilTexture(
      comparisonFunction: Unit,
      bilinearFiltering: Unit,
      generateStencil: Unit,
      samples: Unit,
      format: Double
    ): InternalTexture = js.native
    
    /**
      * Gets the depth/stencil texture (if created by a createDepthStencilTexture() call)
      */
    def depthStencilTexture: Nullable[InternalTexture] = js.native
    
    /**
      * Indicates if the depth/stencil texture has a stencil aspect
      */
    def depthStencilTextureWithStencil: Boolean = js.native
    
    /**
      * Disposes the whole render target wrapper
      * @param disposeOnlyFramebuffers true if only the frame buffers should be released (used for the WebGL engine). If false, all the textures will also be released
      */
    def dispose(): Unit = js.native
    def dispose(disposeOnlyFramebuffers: Boolean): Unit = js.native
    
    /**
      * Gets the height of the render target wrapper
      */
    def height: Double = js.native
    
    /**
      * Defines if the render target wrapper is for a single or an array of textures
      */
    def is2DArray: Boolean = js.native
    
    /**
      * Defines if the render target wrapper is for a cube texture or if false a 2d texture
      */
    def isCube: Boolean = js.native
    
    /**
      * Defines if the render target wrapper is for a single or multi target render wrapper
      */
    def isMulti: Boolean = js.native
    
    /**
      * Gets the number of layers of the render target wrapper (only used if is2DArray is true)
      */
    def layers: Double = js.native
    
    /**
      * Releases the internal render textures
      */
    def releaseTextures(): Unit = js.native
    
    /**
      * Gets the sample count of the render target
      */
    def samples: Double = js.native
    
    /**
      * Sets the sample count of the render target
      * @param value sample count
      * @param initializeBuffers If set to true, the engine will make an initializing call to drawBuffers (only used when isMulti=true).
      * @param force true to force calling the update sample count engine function even if the current sample count is equal to value
      * @returns the sample count that has been set
      */
    def setSamples(value: Double): Double = js.native
    def setSamples(value: Double, initializeBuffers: Boolean): Double = js.native
    def setSamples(value: Double, initializeBuffers: Boolean, force: Boolean): Double = js.native
    def setSamples(value: Double, initializeBuffers: Unit, force: Boolean): Double = js.native
    
    /**
      * Set a texture in the textures array
      * @param texture the texture to set
      * @param index the index in the textures array to set
      * @param disposePrevious If this function should dispose the previous texture
      */
    def setTexture(texture: InternalTexture): Unit = js.native
    def setTexture(texture: InternalTexture, index: Double): Unit = js.native
    def setTexture(texture: InternalTexture, index: Double, disposePrevious: Boolean): Unit = js.native
    def setTexture(texture: InternalTexture, index: Unit, disposePrevious: Boolean): Unit = js.native
    
    /**
      * Sets the render target texture(s)
      * @param textures texture(s) to set
      */
    def setTextures(textures: Nullable[InternalTexture]): Unit = js.native
    def setTextures(textures: Nullable[js.Array[InternalTexture]]): Unit = js.native
    
    /**
      * Gets the size of the render target wrapper (used for cubes, as width=height in this case)
      */
    def size: Double = js.native
    
    /**
      * Gets the render texture. If this is a multi render target, gets the first texture
      */
    def texture: Nullable[InternalTexture] = js.native
    
    /**
      * Gets the list of render textures. If we are not in a multi render target, the list will be null (use the texture getter instead)
      */
    def textures: Nullable[js.Array[InternalTexture]] = js.native
    
    /**
      * Gets the width of the render target wrapper
      */
    def width: Double = js.native
  }
  
  trait IRenderTargetTexture extends StObject {
    
    /**
      * Entry point to access the wrapper on a texture.
      */
    var renderTarget: Nullable[RenderTargetWrapper]
  }
  object IRenderTargetTexture {
    
    inline def apply(): IRenderTargetTexture = {
      val __obj = js.Dynamic.literal(renderTarget = null)
      __obj.asInstanceOf[IRenderTargetTexture]
    }
    
    extension [Self <: IRenderTargetTexture](x: Self) {
      
      inline def setRenderTarget(value: Nullable[RenderTargetWrapper]): Self = StObject.set(x, "renderTarget", value.asInstanceOf[js.Any])
      
      inline def setRenderTargetNull: Self = StObject.set(x, "renderTarget", null)
    }
  }
}
