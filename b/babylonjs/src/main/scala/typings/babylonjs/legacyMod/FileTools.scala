package typings.babylonjs.legacyMod

import typings.babylonjs.anon.CrossOrigin
import typings.babylonjs.fileRequestMod.IFileRequest
import typings.babylonjs.iofflineproviderMod.IOfflineProvider
import typings.babylonjs.typesMod.Nullable
import typings.std.Blob
import typings.std.EventTarget
import typings.std.File
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import typings.std.ImageBitmapOptions
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileTools {
  
  @JSImport("babylonjs/Legacy/legacy", "FileTools")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "FileTools.BaseUrl")
  @js.native
  def BaseUrl: Any = js.native
  inline def BaseUrl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseUrl")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "FileTools.CorsBehavior")
  @js.native
  def CorsBehavior: Any = js.native
  inline def CorsBehavior_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CorsBehavior")(x.asInstanceOf[js.Any])
  
  inline def DecodeBase64UrlToBinary(uri: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64UrlToBinary")(uri.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def DecodeBase64UrlToString(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64UrlToString")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("babylonjs/Legacy/legacy", "FileTools.DefaultRetryStrategy")
  @js.native
  def DefaultRetryStrategy: Any = js.native
  inline def DefaultRetryStrategy_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultRetryStrategy")(x.asInstanceOf[js.Any])
  
  inline def IsBase64DataUrl(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase64DataUrl")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def IsFileURL(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFileURL")().asInstanceOf[Boolean]
  
  inline def LoadFile(
    fileOrUrl: String | File,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]],
    offlineProvider: js.UndefOr[IOfflineProvider],
    useArrayBuffer: js.UndefOr[Boolean],
    onError: js.UndefOr[
      js.Function2[
        /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
        /* exception */ js.UndefOr[typings.babylonjs.fileToolsMod.LoadFileError], 
        Unit
      ]
    ],
    onOpened: js.UndefOr[js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(fileOrUrl.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  
  inline def LoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: Unit,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: js.typedarray.ArrayBufferView,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: js.typedarray.ArrayBufferView,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: js.typedarray.ArrayBufferView,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: js.typedarray.ArrayBufferView,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: Unit,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: js.typedarray.ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: js.typedarray.ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: js.typedarray.ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: js.typedarray.ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: Unit,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: Unit,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  
  @JSImport("babylonjs/Legacy/legacy", "FileTools.PreprocessUrl")
  @js.native
  def PreprocessUrl: Any = js.native
  inline def PreprocessUrl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PreprocessUrl")(x.asInstanceOf[js.Any])
  
  inline def ReadFile(file: File, onSuccess: js.Function1[/* data */ Any, Unit]): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any],
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any],
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.ReadFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any],
    useArrayBuffer: Unit,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.ReadFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ Any, Unit],
    onProgress: Unit,
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ Any, Unit],
    onProgress: Unit,
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.ReadFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ Any, Unit],
    onProgress: Unit,
    useArrayBuffer: Unit,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.ReadFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: Unit,
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: Unit,
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: Unit,
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: Unit,
    useArrayBuffer: Boolean,
    onError: Unit,
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: Unit,
    useArrayBuffer: Unit,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: Unit,
    useArrayBuffer: Unit,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: Unit,
    useArrayBuffer: Unit,
    onError: Unit,
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: Unit,
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Unit,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Unit,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Unit,
    onError: Unit,
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Boolean,
    onError: Unit,
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Unit,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Unit,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Unit,
    onError: Unit,
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: IOfflineProvider
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: Unit,
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Unit,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Unit,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Unit,
    onError: Unit,
    onOpened: js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  
  inline def SetCorsBehavior(url: String, element: CrossOrigin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCorsBehavior")(url.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def SetCorsBehavior(url: js.Array[String], element: CrossOrigin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCorsBehavior")(url.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
