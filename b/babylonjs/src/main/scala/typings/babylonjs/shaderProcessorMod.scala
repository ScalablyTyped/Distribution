package typings.babylonjs

import typings.babylonjs.fileRequestMod.IFileRequest
import typings.babylonjs.fileToolsMod.LoadFileError
import typings.babylonjs.iofflineproviderMod.IOfflineProvider
import typings.babylonjs.shaderProcessingOptionsMod.ProcessingOptions
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.webRequestMod.WebRequest
import typings.std.ArrayBuffer
import typings.std.EventTarget
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderProcessorMod {
  
  @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor")
  @js.native
  class ShaderProcessor () extends StObject
  /* static members */
  object ShaderProcessor {
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor.Process")
    @js.native
    def Process(
      sourceCode: String,
      options: ProcessingOptions,
      callback: js.Function1[/* migratedCode */ String, Unit],
      engine: ThinEngine
    ): Unit = js.native
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._BuildExpression")
    @js.native
    def _BuildExpression: js.Any = js.native
    @scala.inline
    def _BuildExpression_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BuildExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._BuildSubExpression")
    @js.native
    def _BuildSubExpression: js.Any = js.native
    @scala.inline
    def _BuildSubExpression_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BuildSubExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._EvaluatePreProcessors")
    @js.native
    def _EvaluatePreProcessors: js.Any = js.native
    @scala.inline
    def _EvaluatePreProcessors_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EvaluatePreProcessors")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._ExtractOperation")
    @js.native
    def _ExtractOperation: js.Any = js.native
    @scala.inline
    def _ExtractOperation_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ExtractOperation")(x.asInstanceOf[js.Any])
    
    /**
      * Loads a file from a url
      * @param url url to load
      * @param onSuccess callback called when the file successfully loads
      * @param onProgress callback called while file is loading (if the server supports this mode)
      * @param offlineProvider defines the offline provider for caching
      * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
      * @param onError callback called when the file fails to load
      * @returns a file request object
      * @hidden
      */
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._MoveCursor")
    @js.native
    def _MoveCursor: js.Any = js.native
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._MoveCursorWithinIf")
    @js.native
    def _MoveCursorWithinIf: js.Any = js.native
    @scala.inline
    def _MoveCursorWithinIf_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MoveCursorWithinIf")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def _MoveCursor_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MoveCursor")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._PreparePreProcessors")
    @js.native
    def _PreparePreProcessors: js.Any = js.native
    @scala.inline
    def _PreparePreProcessors_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PreparePreProcessors")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._ProcessIncludes")
    @js.native
    def _ProcessIncludes: js.Any = js.native
    @scala.inline
    def _ProcessIncludes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessIncludes")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._ProcessPrecision")
    @js.native
    def _ProcessPrecision: js.Any = js.native
    @scala.inline
    def _ProcessPrecision_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessPrecision")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._ProcessShaderConversion")
    @js.native
    def _ProcessShaderConversion: js.Any = js.native
    @scala.inline
    def _ProcessShaderConversion_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessShaderConversion")(x.asInstanceOf[js.Any])
  }
}
