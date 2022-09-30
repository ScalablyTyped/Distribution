package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineFeaturesMod {
  
  trait EngineFeatures extends StObject {
    
    /** @internal */
    var _collectUbosUpdatedInFrame: Boolean
    
    /** Indicates that prefiltered mipmaps can be generated in some processes (for eg when loading an HDR cube texture) */
    var allowTexturePrefiltering: Boolean
    
    /** Indicates that the textures transcoded by the basis transcoder must have power of 2 width and height */
    var basisNeedsPOT: Boolean
    
    /** Indicates that the current content of a ubo should be compared to the content of the corresponding GPU buffer and the GPU buffer updated only if different. Requires trackUbosInFrame to be true */
    var checkUbosContentBeforeUpload: Boolean
    
    /** Force using Bitmap when Bitmap or HTMLImageElement can be used */
    var forceBitmapOverHTMLImageElement: Boolean
    
    /** Indicates that the inliner should be run over every shader code */
    var needShaderCodeInlining: Boolean
    
    /** Indicates that even if we don't have to update the properties of a uniform buffer (because of some optimzations in the material) we still need to bind the uniform buffer themselves */
    var needToAlwaysBindUniformBuffers: Boolean
    
    /** Indicates that constants need a type suffix in shaders (used by realtime filtering...) */
    var needTypeSuffixInShaderConstants: Boolean
    
    /** Indicates that y should be inverted when dealing with bitmaps (notably in environment tools) */
    var needsInvertingBitmap: Boolean
    
    /** Indicates that the engine supports 3D textures */
    var support3DTextures: Boolean
    
    /** Indicates that the Cascaded Shadow Map technic is supported */
    var supportCSM: Boolean
    
    /** Indicates that the engine support handling depth/stencil textures */
    var supportDepthStencilTexture: Boolean
    
    /** Indicates that some additional texture formats are supported (like TEXTUREFORMAT_R for eg) */
    var supportExtendedTextureFormats: Boolean
    
    /** Indicates that MSAA is supported */
    var supportMSAA: Boolean
    
    /** Indicates that the engine support rendering to as well as copying to lod float textures */
    var supportRenderAndCopyToLodForFloatTextures: Boolean
    
    /**  Indicates that the engine supports render passes */
    var supportRenderPasses: Boolean
    
    /** Indicates that SSAO2 is supported */
    var supportSSAO2: Boolean
    
    /** Indicates that the engine support shadow samplers */
    var supportShadowSamplers: Boolean
    
    /**  Indicates that the engine supports sprite instancing */
    var supportSpriteInstancing: Boolean
    
    /** Indicates that the switch/case construct is supported in shaders */
    var supportSwitchCaseInShader: Boolean
    
    /** Indicates that synchronous texture reading is supported */
    var supportSyncTextureRead: Boolean
    
    /** Indicates to track the usage of ubos and to create new ones as necessary during a frame duration */
    var trackUbosInFrame: Boolean
    
    /** Indicates to check the matrix bytes per bytes to know if it has changed or not. If false, only the updateFlag of the matrix is checked */
    var uniformBufferHardCheckMatrix: Boolean
    
    /** Indicates that the engine should cache the bound UBO */
    var useUBOBindingCache: Boolean
  }
  object EngineFeatures {
    
    inline def apply(
      _collectUbosUpdatedInFrame: Boolean,
      allowTexturePrefiltering: Boolean,
      basisNeedsPOT: Boolean,
      checkUbosContentBeforeUpload: Boolean,
      forceBitmapOverHTMLImageElement: Boolean,
      needShaderCodeInlining: Boolean,
      needToAlwaysBindUniformBuffers: Boolean,
      needTypeSuffixInShaderConstants: Boolean,
      needsInvertingBitmap: Boolean,
      support3DTextures: Boolean,
      supportCSM: Boolean,
      supportDepthStencilTexture: Boolean,
      supportExtendedTextureFormats: Boolean,
      supportMSAA: Boolean,
      supportRenderAndCopyToLodForFloatTextures: Boolean,
      supportRenderPasses: Boolean,
      supportSSAO2: Boolean,
      supportShadowSamplers: Boolean,
      supportSpriteInstancing: Boolean,
      supportSwitchCaseInShader: Boolean,
      supportSyncTextureRead: Boolean,
      trackUbosInFrame: Boolean,
      uniformBufferHardCheckMatrix: Boolean,
      useUBOBindingCache: Boolean
    ): EngineFeatures = {
      val __obj = js.Dynamic.literal(_collectUbosUpdatedInFrame = _collectUbosUpdatedInFrame.asInstanceOf[js.Any], allowTexturePrefiltering = allowTexturePrefiltering.asInstanceOf[js.Any], basisNeedsPOT = basisNeedsPOT.asInstanceOf[js.Any], checkUbosContentBeforeUpload = checkUbosContentBeforeUpload.asInstanceOf[js.Any], forceBitmapOverHTMLImageElement = forceBitmapOverHTMLImageElement.asInstanceOf[js.Any], needShaderCodeInlining = needShaderCodeInlining.asInstanceOf[js.Any], needToAlwaysBindUniformBuffers = needToAlwaysBindUniformBuffers.asInstanceOf[js.Any], needTypeSuffixInShaderConstants = needTypeSuffixInShaderConstants.asInstanceOf[js.Any], needsInvertingBitmap = needsInvertingBitmap.asInstanceOf[js.Any], support3DTextures = support3DTextures.asInstanceOf[js.Any], supportCSM = supportCSM.asInstanceOf[js.Any], supportDepthStencilTexture = supportDepthStencilTexture.asInstanceOf[js.Any], supportExtendedTextureFormats = supportExtendedTextureFormats.asInstanceOf[js.Any], supportMSAA = supportMSAA.asInstanceOf[js.Any], supportRenderAndCopyToLodForFloatTextures = supportRenderAndCopyToLodForFloatTextures.asInstanceOf[js.Any], supportRenderPasses = supportRenderPasses.asInstanceOf[js.Any], supportSSAO2 = supportSSAO2.asInstanceOf[js.Any], supportShadowSamplers = supportShadowSamplers.asInstanceOf[js.Any], supportSpriteInstancing = supportSpriteInstancing.asInstanceOf[js.Any], supportSwitchCaseInShader = supportSwitchCaseInShader.asInstanceOf[js.Any], supportSyncTextureRead = supportSyncTextureRead.asInstanceOf[js.Any], trackUbosInFrame = trackUbosInFrame.asInstanceOf[js.Any], uniformBufferHardCheckMatrix = uniformBufferHardCheckMatrix.asInstanceOf[js.Any], useUBOBindingCache = useUBOBindingCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[EngineFeatures]
    }
    
    extension [Self <: EngineFeatures](x: Self) {
      
      inline def setAllowTexturePrefiltering(value: Boolean): Self = StObject.set(x, "allowTexturePrefiltering", value.asInstanceOf[js.Any])
      
      inline def setBasisNeedsPOT(value: Boolean): Self = StObject.set(x, "basisNeedsPOT", value.asInstanceOf[js.Any])
      
      inline def setCheckUbosContentBeforeUpload(value: Boolean): Self = StObject.set(x, "checkUbosContentBeforeUpload", value.asInstanceOf[js.Any])
      
      inline def setForceBitmapOverHTMLImageElement(value: Boolean): Self = StObject.set(x, "forceBitmapOverHTMLImageElement", value.asInstanceOf[js.Any])
      
      inline def setNeedShaderCodeInlining(value: Boolean): Self = StObject.set(x, "needShaderCodeInlining", value.asInstanceOf[js.Any])
      
      inline def setNeedToAlwaysBindUniformBuffers(value: Boolean): Self = StObject.set(x, "needToAlwaysBindUniformBuffers", value.asInstanceOf[js.Any])
      
      inline def setNeedTypeSuffixInShaderConstants(value: Boolean): Self = StObject.set(x, "needTypeSuffixInShaderConstants", value.asInstanceOf[js.Any])
      
      inline def setNeedsInvertingBitmap(value: Boolean): Self = StObject.set(x, "needsInvertingBitmap", value.asInstanceOf[js.Any])
      
      inline def setSupport3DTextures(value: Boolean): Self = StObject.set(x, "support3DTextures", value.asInstanceOf[js.Any])
      
      inline def setSupportCSM(value: Boolean): Self = StObject.set(x, "supportCSM", value.asInstanceOf[js.Any])
      
      inline def setSupportDepthStencilTexture(value: Boolean): Self = StObject.set(x, "supportDepthStencilTexture", value.asInstanceOf[js.Any])
      
      inline def setSupportExtendedTextureFormats(value: Boolean): Self = StObject.set(x, "supportExtendedTextureFormats", value.asInstanceOf[js.Any])
      
      inline def setSupportMSAA(value: Boolean): Self = StObject.set(x, "supportMSAA", value.asInstanceOf[js.Any])
      
      inline def setSupportRenderAndCopyToLodForFloatTextures(value: Boolean): Self = StObject.set(x, "supportRenderAndCopyToLodForFloatTextures", value.asInstanceOf[js.Any])
      
      inline def setSupportRenderPasses(value: Boolean): Self = StObject.set(x, "supportRenderPasses", value.asInstanceOf[js.Any])
      
      inline def setSupportSSAO2(value: Boolean): Self = StObject.set(x, "supportSSAO2", value.asInstanceOf[js.Any])
      
      inline def setSupportShadowSamplers(value: Boolean): Self = StObject.set(x, "supportShadowSamplers", value.asInstanceOf[js.Any])
      
      inline def setSupportSpriteInstancing(value: Boolean): Self = StObject.set(x, "supportSpriteInstancing", value.asInstanceOf[js.Any])
      
      inline def setSupportSwitchCaseInShader(value: Boolean): Self = StObject.set(x, "supportSwitchCaseInShader", value.asInstanceOf[js.Any])
      
      inline def setSupportSyncTextureRead(value: Boolean): Self = StObject.set(x, "supportSyncTextureRead", value.asInstanceOf[js.Any])
      
      inline def setTrackUbosInFrame(value: Boolean): Self = StObject.set(x, "trackUbosInFrame", value.asInstanceOf[js.Any])
      
      inline def setUniformBufferHardCheckMatrix(value: Boolean): Self = StObject.set(x, "uniformBufferHardCheckMatrix", value.asInstanceOf[js.Any])
      
      inline def setUseUBOBindingCache(value: Boolean): Self = StObject.set(x, "useUBOBindingCache", value.asInstanceOf[js.Any])
      
      inline def set_collectUbosUpdatedInFrame(value: Boolean): Self = StObject.set(x, "_collectUbosUpdatedInFrame", value.asInstanceOf[js.Any])
    }
  }
}
