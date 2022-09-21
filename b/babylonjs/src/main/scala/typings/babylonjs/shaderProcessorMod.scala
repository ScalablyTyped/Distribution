package typings.babylonjs

import typings.babylonjs.anon.FragmentCode
import typings.babylonjs.fileRequestMod.IFileRequest
import typings.babylonjs.fileToolsMod.LoadFileError
import typings.babylonjs.iofflineproviderMod.IOfflineProvider
import typings.babylonjs.shaderProcessingOptionsMod.ProcessingOptions
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.webRequestMod.WebRequest
import typings.std.EventTarget
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderProcessorMod {
  
  @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor")
  @js.native
  open class ShaderProcessor () extends StObject
  /* static members */
  object ShaderProcessor {
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Finalize(vertexCode: String, fragmentCode: String, options: ProcessingOptions): FragmentCode = (^.asInstanceOf[js.Dynamic].applyDynamic("Finalize")(vertexCode.asInstanceOf[js.Any], fragmentCode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FragmentCode]
    
    inline def Initialize(options: ProcessingOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Initialize")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def PreProcess(
      sourceCode: String,
      options: ProcessingOptions,
      callback: js.Function1[/* migratedCode */ String, Unit],
      engine: ThinEngine
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PreProcess")(sourceCode.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def Process(
      sourceCode: String,
      options: ProcessingOptions,
      callback: js.Function1[/* migratedCode */ String, Unit],
      engine: ThinEngine
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Process")(sourceCode.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._ApplyPreProcessing")
    @js.native
    def _ApplyPreProcessing: Any = js.native
    inline def _ApplyPreProcessing_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyPreProcessing")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._BuildExpression")
    @js.native
    def _BuildExpression: Any = js.native
    inline def _BuildExpression_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BuildExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._BuildSubExpression")
    @js.native
    def _BuildSubExpression: Any = js.native
    inline def _BuildSubExpression_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BuildSubExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._EvaluatePreProcessors")
    @js.native
    def _EvaluatePreProcessors: Any = js.native
    inline def _EvaluatePreProcessors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EvaluatePreProcessors")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._ExtractOperation")
    @js.native
    def _ExtractOperation: Any = js.native
    inline def _ExtractOperation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ExtractOperation")(x.asInstanceOf[js.Any])
    
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
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._MoveCursor")
    @js.native
    def _MoveCursor: Any = js.native
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._MoveCursorWithinIf")
    @js.native
    def _MoveCursorWithinIf: Any = js.native
    inline def _MoveCursorWithinIf_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MoveCursorWithinIf")(x.asInstanceOf[js.Any])
    
    inline def _MoveCursor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MoveCursor")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._PreparePreProcessors")
    @js.native
    def _PreparePreProcessors: Any = js.native
    inline def _PreparePreProcessors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PreparePreProcessors")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._ProcessIncludes")
    @js.native
    def _ProcessIncludes: Any = js.native
    inline def _ProcessIncludes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessIncludes")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._ProcessPrecision")
    @js.native
    def _ProcessPrecision: Any = js.native
    inline def _ProcessPrecision_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessPrecision")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/shaderProcessor", "ShaderProcessor._ProcessShaderConversion")
    @js.native
    def _ProcessShaderConversion: Any = js.native
    inline def _ProcessShaderConversion_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessShaderConversion")(x.asInstanceOf[js.Any])
  }
}
