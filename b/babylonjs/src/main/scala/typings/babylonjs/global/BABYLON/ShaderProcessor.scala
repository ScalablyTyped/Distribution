package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IFileRequest
import typings.babylonjs.BABYLON.IOfflineProvider
import typings.babylonjs.BABYLON.ProcessingOptions
import typings.std.ArrayBuffer
import typings.std.EventTarget
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ShaderProcessor")
@js.native
class ShaderProcessor ()
  extends typings.babylonjs.BABYLON.ShaderProcessor
/* static members */
object ShaderProcessor {
  
  @JSGlobal("BABYLON.ShaderProcessor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.ShaderProcessor.Process")
  @js.native
  def Process(
    sourceCode: String,
    options: ProcessingOptions,
    callback: js.Function1[/* migratedCode */ String, Unit],
    engine: typings.babylonjs.BABYLON.ThinEngine
  ): Unit = js.native
  
  @JSGlobal("BABYLON.ShaderProcessor._BuildExpression")
  @js.native
  def _BuildExpression: js.Any = js.native
  @scala.inline
  def _BuildExpression_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BuildExpression")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.ShaderProcessor._BuildSubExpression")
  @js.native
  def _BuildSubExpression: js.Any = js.native
  @scala.inline
  def _BuildSubExpression_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BuildSubExpression")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.ShaderProcessor._EvaluatePreProcessors")
  @js.native
  def _EvaluatePreProcessors: js.Any = js.native
  @scala.inline
  def _EvaluatePreProcessors_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EvaluatePreProcessors")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.ShaderProcessor._ExtractOperation")
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
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typings.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typings.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typings.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typings.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typings.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typings.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typings.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.ShaderProcessor._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typings.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  
  @JSGlobal("BABYLON.ShaderProcessor._MoveCursor")
  @js.native
  def _MoveCursor: js.Any = js.native
  
  @JSGlobal("BABYLON.ShaderProcessor._MoveCursorWithinIf")
  @js.native
  def _MoveCursorWithinIf: js.Any = js.native
  @scala.inline
  def _MoveCursorWithinIf_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MoveCursorWithinIf")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def _MoveCursor_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MoveCursor")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.ShaderProcessor._PreparePreProcessors")
  @js.native
  def _PreparePreProcessors: js.Any = js.native
  @scala.inline
  def _PreparePreProcessors_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PreparePreProcessors")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.ShaderProcessor._ProcessIncludes")
  @js.native
  def _ProcessIncludes: js.Any = js.native
  @scala.inline
  def _ProcessIncludes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessIncludes")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.ShaderProcessor._ProcessPrecision")
  @js.native
  def _ProcessPrecision: js.Any = js.native
  @scala.inline
  def _ProcessPrecision_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessPrecision")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.ShaderProcessor._ProcessShaderConversion")
  @js.native
  def _ProcessShaderConversion: js.Any = js.native
  @scala.inline
  def _ProcessShaderConversion_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessShaderConversion")(x.asInstanceOf[js.Any])
}
