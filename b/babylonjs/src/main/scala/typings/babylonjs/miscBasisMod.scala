package typings.babylonjs

import typings.babylonjs.anon.Astc
import typings.babylonjs.anon.Levels
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscBasisMod {
  
  @JSImport("babylonjs/Misc/basis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object BasisTools {
    
    @JSImport("babylonjs/Misc/basis", "BasisTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the internal format to be passed to texImage2D corresponding to the .basis format value
      * @param basisFormat format chosen from GetSupportedTranscodeFormat
      * @returns internal format corresponding to the Basis format
      */
    inline def GetInternalFormatFromBasisFormat(basisFormat: Double, engine: Engine): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetInternalFormatFromBasisFormat")(basisFormat.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * URL to use when loading the basis transcoder
      */
    @JSImport("babylonjs/Misc/basis", "BasisTools.JSModuleURL")
    @js.native
    def JSModuleURL: String = js.native
    inline def JSModuleURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSModuleURL")(x.asInstanceOf[js.Any])
    
    /**
      * Loads a texture from the transcode result
      * @param texture texture load to
      * @param transcodeResult the result of transcoding the basis file to load from
      */
    inline def LoadTextureFromTranscodeResult(texture: InternalTexture, transcodeResult: TranscodeResult): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadTextureFromTranscodeResult")(texture.asInstanceOf[js.Any], transcodeResult.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def TranscodeAsync(data: js.typedarray.ArrayBufferView, config: BasisTranscodeConfiguration): js.Promise[TranscodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("TranscodeAsync")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TranscodeResult]]
    /**
      * Transcodes a loaded image file to compressed pixel data
      * @param data image data to transcode
      * @param config configuration options for the transcoding
      * @returns a promise resulting in the transcoded image
      */
    inline def TranscodeAsync(data: js.typedarray.ArrayBuffer, config: BasisTranscodeConfiguration): js.Promise[TranscodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("TranscodeAsync")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TranscodeResult]]
    
    /**
      * URL to use when loading the wasm module for the transcoder
      */
    @JSImport("babylonjs/Misc/basis", "BasisTools.WasmModuleURL")
    @js.native
    def WasmModuleURL: String = js.native
    inline def WasmModuleURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WasmModuleURL")(x.asInstanceOf[js.Any])
  }
  
  object BasisToolsOptions {
    
    @JSImport("babylonjs/Misc/basis", "BasisToolsOptions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * URL to use when loading the basis transcoder
      */
    @JSImport("babylonjs/Misc/basis", "BasisToolsOptions.JSModuleURL")
    @js.native
    def JSModuleURL: String = js.native
    inline def JSModuleURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSModuleURL")(x.asInstanceOf[js.Any])
    
    /**
      * URL to use when loading the wasm module for the transcoder
      */
    @JSImport("babylonjs/Misc/basis", "BasisToolsOptions.WasmModuleURL")
    @js.native
    def WasmModuleURL: String = js.native
    inline def WasmModuleURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WasmModuleURL")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Misc/basis", "BasisTranscodeConfiguration")
  @js.native
  open class BasisTranscodeConfiguration () extends StObject {
    
    /**
      * If mipmap levels should be loaded for transcoded images (Default: true)
      */
    var loadMipmapLevels: js.UndefOr[Boolean] = js.native
    
    /**
      * Index of a single image to load (Default: all images)
      */
    var loadSingleImage: js.UndefOr[Double] = js.native
    
    /**
      * Supported compression formats used to determine the supported output format of the transcoder
      */
    var supportedCompressionFormats: js.UndefOr[Astc] = js.native
  }
  
  inline def GetInternalFormatFromBasisFormat(basisFormat: Double, engine: Engine): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetInternalFormatFromBasisFormat")(basisFormat.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def LoadTextureFromTranscodeResult(texture: InternalTexture, transcodeResult: TranscodeResult): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadTextureFromTranscodeResult")(texture.asInstanceOf[js.Any], transcodeResult.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def TranscodeAsync(data: js.typedarray.ArrayBufferView, config: BasisTranscodeConfiguration): js.Promise[TranscodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("TranscodeAsync")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TranscodeResult]]
  inline def TranscodeAsync(data: js.typedarray.ArrayBuffer, config: BasisTranscodeConfiguration): js.Promise[TranscodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("TranscodeAsync")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TranscodeResult]]
  
  /**
    * Info about the .basis files
    */
  trait BasisFileInfo extends StObject {
    
    /**
      * If the file has alpha
      */
    var hasAlpha: Boolean
    
    /**
      * Info about each image of the basis file
      */
    var images: js.Array[Levels]
  }
  object BasisFileInfo {
    
    inline def apply(hasAlpha: Boolean, images: js.Array[Levels]): BasisFileInfo = {
      val __obj = js.Dynamic.literal(hasAlpha = hasAlpha.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasisFileInfo]
    }
    
    extension [Self <: BasisFileInfo](x: Self) {
      
      inline def setHasAlpha(value: Boolean): Self = StObject.set(x, "hasAlpha", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[Levels]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: Levels*): Self = StObject.set(x, "images", js.Array(value*))
    }
  }
  
  /**
    * Result of transcoding a basis file
    */
  trait TranscodeResult extends StObject {
    
    /**
      * Info about the .basis file
      */
    var fileInfo: BasisFileInfo
    
    /**
      * Format to use when loading the file
      */
    var format: Double
  }
  object TranscodeResult {
    
    inline def apply(fileInfo: BasisFileInfo, format: Double): TranscodeResult = {
      val __obj = js.Dynamic.literal(fileInfo = fileInfo.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranscodeResult]
    }
    
    extension [Self <: TranscodeResult](x: Self) {
      
      inline def setFileInfo(value: BasisFileInfo): Self = StObject.set(x, "fileInfo", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
}
