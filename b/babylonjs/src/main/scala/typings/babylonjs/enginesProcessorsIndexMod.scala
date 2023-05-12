package typings.babylonjs

import typings.babylonjs.anon.FragmentCode
import typings.babylonjs.enginesProcessorsShaderProcessingOptionsMod.ProcessingOptions
import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.miscFileRequestMod.IFileRequest
import typings.babylonjs.miscFileToolsMod.LoadFileError
import typings.babylonjs.miscWebRequestMod.WebRequest
import typings.babylonjs.offlineIofflineproviderMod.IOfflineProvider
import typings.std.EventTarget
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesProcessorsIndexMod {
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderCodeConditionNode")
  @js.native
  open class ShaderCodeConditionNode ()
    extends typings.babylonjs.enginesProcessorsShaderCodeConditionNodeMod.ShaderCodeConditionNode
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderCodeCursor")
  @js.native
  open class ShaderCodeCursor ()
    extends typings.babylonjs.enginesProcessorsShaderCodeCursorMod.ShaderCodeCursor
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderCodeInliner")
  @js.native
  open class ShaderCodeInliner protected ()
    extends typings.babylonjs.enginesProcessorsShaderCodeInlinerMod.ShaderCodeInliner {
    /**
      * Initializes the inliner
      * @param sourceCode shader code source to inline
      * @param numMaxIterations maximum number of iterations (used to detect recursive calls)
      */
    def this(sourceCode: String) = this()
    def this(sourceCode: String, numMaxIterations: Double) = this()
  }
  /* static members */
  object ShaderCodeInliner {
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderCodeInliner._RegexpFindFunctionNameAndType")
    @js.native
    val _RegexpFindFunctionNameAndType: Any = js.native
  }
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderCodeNode")
  @js.native
  open class ShaderCodeNode ()
    extends typings.babylonjs.enginesProcessorsShaderCodeNodeMod.ShaderCodeNode
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderCodeTestNode")
  @js.native
  open class ShaderCodeTestNode ()
    extends typings.babylonjs.enginesProcessorsShaderCodeTestNodeMod.ShaderCodeTestNode
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineAndOperator")
  @js.native
  open class ShaderDefineAndOperator ()
    extends typings.babylonjs.enginesProcessorsExpressionsIndexMod.ShaderDefineAndOperator
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineArithmeticOperator")
  @js.native
  open class ShaderDefineArithmeticOperator protected ()
    extends typings.babylonjs.enginesProcessorsExpressionsIndexMod.ShaderDefineArithmeticOperator {
    def this(define: String, operand: String, testValue: String) = this()
  }
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineExpression")
  @js.native
  open class ShaderDefineExpression ()
    extends typings.babylonjs.enginesProcessorsExpressionsIndexMod.ShaderDefineExpression
  /* static members */
  object ShaderDefineExpression {
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineExpression")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineExpression._OperatorPriority")
    @js.native
    def _OperatorPriority: Any = js.native
    inline def _OperatorPriority_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OperatorPriority")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineExpression._Stack")
    @js.native
    def _Stack: Any = js.native
    inline def _Stack_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Stack")(x.asInstanceOf[js.Any])
    
    inline def infixToPostfix(infix: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("infixToPostfix")(infix.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def postfixToInfix(postfix: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("postfixToInfix")(postfix.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineIsDefinedOperator")
  @js.native
  open class ShaderDefineIsDefinedOperator protected ()
    extends typings.babylonjs.enginesProcessorsExpressionsIndexMod.ShaderDefineIsDefinedOperator {
    def this(define: String) = this()
    def this(define: String, not: Boolean) = this()
  }
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineOrOperator")
  @js.native
  open class ShaderDefineOrOperator ()
    extends typings.babylonjs.enginesProcessorsExpressionsIndexMod.ShaderDefineOrOperator
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor")
  @js.native
  open class ShaderProcessor ()
    extends typings.babylonjs.enginesProcessorsShaderProcessorMod.ShaderProcessor
  /* static members */
  object ShaderProcessor {
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Finalize(vertexCode: String, fragmentCode: String, options: ProcessingOptions): FragmentCode = (^.asInstanceOf[js.Dynamic].applyDynamic("Finalize")(vertexCode.asInstanceOf[js.Any], fragmentCode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FragmentCode]
    
    inline def Initialize(options: ProcessingOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Initialize")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def PreProcess(
      sourceCode: String,
      options: ProcessingOptions,
      callback: js.Function2[/* migratedCode */ String, /* codeBeforeMigration */ String, Unit],
      engine: ThinEngine
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PreProcess")(sourceCode.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def Process(
      sourceCode: String,
      options: ProcessingOptions,
      callback: js.Function2[/* migratedCode */ String, /* codeBeforeMigration */ String, Unit],
      engine: ThinEngine
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Process")(sourceCode.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._ApplyPreProcessing")
    @js.native
    def _ApplyPreProcessing: Any = js.native
    inline def _ApplyPreProcessing_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyPreProcessing")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._BuildExpression")
    @js.native
    def _BuildExpression: Any = js.native
    inline def _BuildExpression_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BuildExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._BuildSubExpression")
    @js.native
    def _BuildSubExpression: Any = js.native
    inline def _BuildSubExpression_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BuildSubExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._EvaluatePreProcessors")
    @js.native
    def _EvaluatePreProcessors: Any = js.native
    inline def _EvaluatePreProcessors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EvaluatePreProcessors")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._ExtractOperation")
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
      * @internal
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
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._MoveCursor")
    @js.native
    def _MoveCursor: Any = js.native
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._MoveCursorWithinIf")
    @js.native
    def _MoveCursorWithinIf: Any = js.native
    inline def _MoveCursorWithinIf_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MoveCursorWithinIf")(x.asInstanceOf[js.Any])
    
    inline def _MoveCursor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MoveCursor")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._PreparePreProcessors")
    @js.native
    def _PreparePreProcessors: Any = js.native
    inline def _PreparePreProcessors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PreparePreProcessors")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._ProcessIncludes")
    @js.native
    def _ProcessIncludes: Any = js.native
    inline def _ProcessIncludes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessIncludes")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._ProcessPrecision")
    @js.native
    def _ProcessPrecision: Any = js.native
    inline def _ProcessPrecision_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessPrecision")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._ProcessShaderConversion")
    @js.native
    def _ProcessShaderConversion: Any = js.native
    inline def _ProcessShaderConversion_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessShaderConversion")(x.asInstanceOf[js.Any])
  }
}
