package typings.babylonjs

import typings.babylonjs.anon.Layers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesTextureCreationOptionsMod {
  
  trait DepthTextureCreationOptions extends StObject {
    
    /** Specifies whether or not bilinear filtering is enable on the texture */
    var bilinearFiltering: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the comparison function to set on the texture. If 0 or undefined, the texture is not in comparison mode */
    var comparisonFunction: js.UndefOr[Double] = js.undefined
    
    /** Specifies the depth texture format to use */
    var depthTextureFormat: js.UndefOr[Double] = js.undefined
    
    /** Specifies whether or not a stencil should be allocated in the texture */
    var generateStencil: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies if the created texture is a cube texture */
    var isCube: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the sample count of the depth/stencil texture texture */
    var samples: js.UndefOr[Double] = js.undefined
  }
  object DepthTextureCreationOptions {
    
    inline def apply(): DepthTextureCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DepthTextureCreationOptions]
    }
    
    extension [Self <: DepthTextureCreationOptions](x: Self) {
      
      inline def setBilinearFiltering(value: Boolean): Self = StObject.set(x, "bilinearFiltering", value.asInstanceOf[js.Any])
      
      inline def setBilinearFilteringUndefined: Self = StObject.set(x, "bilinearFiltering", js.undefined)
      
      inline def setComparisonFunction(value: Double): Self = StObject.set(x, "comparisonFunction", value.asInstanceOf[js.Any])
      
      inline def setComparisonFunctionUndefined: Self = StObject.set(x, "comparisonFunction", js.undefined)
      
      inline def setDepthTextureFormat(value: Double): Self = StObject.set(x, "depthTextureFormat", value.asInstanceOf[js.Any])
      
      inline def setDepthTextureFormatUndefined: Self = StObject.set(x, "depthTextureFormat", js.undefined)
      
      inline def setGenerateStencil(value: Boolean): Self = StObject.set(x, "generateStencil", value.asInstanceOf[js.Any])
      
      inline def setGenerateStencilUndefined: Self = StObject.set(x, "generateStencil", js.undefined)
      
      inline def setIsCube(value: Boolean): Self = StObject.set(x, "isCube", value.asInstanceOf[js.Any])
      
      inline def setIsCubeUndefined: Self = StObject.set(x, "isCube", js.undefined)
      
      inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
    }
  }
  
  trait InternalTextureCreationOptions extends StObject {
    
    /**
      * Specifies if mipmaps must be created. If undefined, the value from generateMipMaps is taken instead
      */
    var createMipMaps: js.UndefOr[Boolean] = js.undefined
    
    /** Texture creation flags */
    var creationFlags: js.UndefOr[Double] = js.undefined
    
    /** Defines format (RGBA by default) */
    var format: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies if mipmaps must be generated
      */
    var generateMipMaps: js.UndefOr[Boolean] = js.undefined
    
    /** Defines sample count (1 by default) */
    var samples: js.UndefOr[Double] = js.undefined
    
    /** Defines sampling mode (trilinear by default) */
    var samplingMode: js.UndefOr[Double] = js.undefined
    
    /** Defines texture type (int by default) */
    var `type`: js.UndefOr[Double] = js.undefined
    
    /** Creates the RTT in sRGB space */
    var useSRGBBuffer: js.UndefOr[Boolean] = js.undefined
  }
  object InternalTextureCreationOptions {
    
    inline def apply(): InternalTextureCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalTextureCreationOptions]
    }
    
    extension [Self <: InternalTextureCreationOptions](x: Self) {
      
      inline def setCreateMipMaps(value: Boolean): Self = StObject.set(x, "createMipMaps", value.asInstanceOf[js.Any])
      
      inline def setCreateMipMapsUndefined: Self = StObject.set(x, "createMipMaps", js.undefined)
      
      inline def setCreationFlags(value: Double): Self = StObject.set(x, "creationFlags", value.asInstanceOf[js.Any])
      
      inline def setCreationFlagsUndefined: Self = StObject.set(x, "creationFlags", js.undefined)
      
      inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
      
      inline def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
      
      inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
      
      inline def setSamplingMode(value: Double): Self = StObject.set(x, "samplingMode", value.asInstanceOf[js.Any])
      
      inline def setSamplingModeUndefined: Self = StObject.set(x, "samplingMode", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseSRGBBuffer(value: Boolean): Self = StObject.set(x, "useSRGBBuffer", value.asInstanceOf[js.Any])
      
      inline def setUseSRGBBufferUndefined: Self = StObject.set(x, "useSRGBBuffer", js.undefined)
    }
  }
  
  trait RenderTargetCreationOptions
    extends StObject
       with InternalTextureCreationOptions {
    
    /** Specifies whether or not a depth should be allocated in the texture (true by default) */
    var generateDepthBuffer: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether or not a stencil should be allocated in the texture (false by default)*/
    var generateStencilBuffer: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies that no color target should be bound to the render target (useful if you only want to write to the depth buffer, for eg) */
    var noColorTarget: js.UndefOr[Boolean] = js.undefined
  }
  object RenderTargetCreationOptions {
    
    inline def apply(): RenderTargetCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderTargetCreationOptions]
    }
    
    extension [Self <: RenderTargetCreationOptions](x: Self) {
      
      inline def setGenerateDepthBuffer(value: Boolean): Self = StObject.set(x, "generateDepthBuffer", value.asInstanceOf[js.Any])
      
      inline def setGenerateDepthBufferUndefined: Self = StObject.set(x, "generateDepthBuffer", js.undefined)
      
      inline def setGenerateStencilBuffer(value: Boolean): Self = StObject.set(x, "generateStencilBuffer", value.asInstanceOf[js.Any])
      
      inline def setGenerateStencilBufferUndefined: Self = StObject.set(x, "generateStencilBuffer", js.undefined)
      
      inline def setNoColorTarget(value: Boolean): Self = StObject.set(x, "noColorTarget", value.asInstanceOf[js.Any])
      
      inline def setNoColorTargetUndefined: Self = StObject.set(x, "noColorTarget", js.undefined)
    }
  }
  
  type TextureSize = Double | Layers
}
