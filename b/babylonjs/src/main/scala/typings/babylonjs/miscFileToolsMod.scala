package typings.babylonjs

import typings.babylonjs.anon.BaseUrl
import typings.babylonjs.anon.CrossOrigin
import typings.babylonjs.anon.Match
import typings.babylonjs.miscErrorMod.RuntimeError
import typings.babylonjs.miscFileRequestMod.IFileRequest
import typings.babylonjs.miscWebRequestMod.WebRequest
import typings.babylonjs.offlineIofflineproviderMod.IOfflineProvider
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

object miscFileToolsMod {
  
  @JSImport("babylonjs/Misc/fileTools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DecodeBase64UrlToBinary(uri: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64UrlToBinary")(uri.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def DecodeBase64UrlToString(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64UrlToString")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object FileTools {
    
    @JSImport("babylonjs/Misc/fileTools", "FileTools")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Misc/fileTools", "FileTools.BaseUrl")
    @js.native
    def BaseUrl: Any = js.native
    inline def BaseUrl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseUrl")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/fileTools", "FileTools.CorsBehavior")
    @js.native
    def CorsBehavior: Any = js.native
    inline def CorsBehavior_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CorsBehavior")(x.asInstanceOf[js.Any])
    
    inline def DecodeBase64UrlToBinary(uri: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64UrlToBinary")(uri.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
    inline def DecodeBase64UrlToString(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64UrlToString")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("babylonjs/Misc/fileTools", "FileTools.DefaultRetryStrategy")
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
            /* request */ js.UndefOr[WebRequest], 
            /* exception */ js.UndefOr[LoadFileError], 
            Unit
          ]
        ],
      onOpened: js.UndefOr[js.Function1[/* request */ WebRequest, Unit]]
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
    
    @JSImport("babylonjs/Misc/fileTools", "FileTools.PreprocessUrl")
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
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ Any, Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any],
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ ReadFileError, Unit]
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
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ Any, Unit],
      onProgress: Unit,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
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
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
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
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
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
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
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
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def RequestFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* request */ js.UndefOr[WebRequest], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: Unit,
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    
    inline def SetCorsBehavior(url: String, element: CrossOrigin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCorsBehavior")(url.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def SetCorsBehavior(url: js.Array[String], element: CrossOrigin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCorsBehavior")(url.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object FileToolsOptions {
    
    @JSImport("babylonjs/Misc/fileTools", "FileToolsOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Misc/fileTools", "FileToolsOptions.BaseUrl")
    @js.native
    def BaseUrl: String = js.native
    inline def BaseUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseUrl")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/fileTools", "FileToolsOptions.CorsBehavior")
    @js.native
    def CorsBehavior: String | (js.Function1[/* url */ String | js.Array[String], String]) = js.native
    inline def CorsBehavior_=(x: String | (js.Function1[/* url */ String | js.Array[String], String])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CorsBehavior")(x.asInstanceOf[js.Any])
    
    inline def DefaultRetryStrategy(url: String, request: WebRequest, retryIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DefaultRetryStrategy")(url.asInstanceOf[js.Any], request.asInstanceOf[js.Any], retryIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def PreprocessUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("PreprocessUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def IsBase64DataUrl(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase64DataUrl")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def IsFileURL(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFileURL")().asInstanceOf[Boolean]
  
  inline def LoadFile(
    fileOrUrl: File | String,
    onSuccess: js.Function3[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      /* contentType */ js.UndefOr[Nullable[String]], 
      Unit
    ],
    onProgress: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]],
    offlineProvider: js.UndefOr[IOfflineProvider],
    useArrayBuffer: js.UndefOr[Boolean],
    onError: js.UndefOr[
      js.Function2[
        /* request */ js.UndefOr[WebRequest], 
        /* exception */ js.UndefOr[LoadFileError], 
        Unit
      ]
    ],
    onOpened: js.UndefOr[js.Function1[/* request */ WebRequest, Unit]]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(fileOrUrl.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  
  @JSImport("babylonjs/Misc/fileTools", "LoadFileError")
  @js.native
  open class LoadFileError protected () extends RuntimeError {
    /**
      * Creates a new LoadFileError
      * @param message defines the message of the error
      * @param object defines the optional web request
      */
    def this(message: String) = this()
    def this(message: String, `object`: WebRequest) = this()
    def this(message: String, `object`: File) = this()
    
    var file: js.UndefOr[File] = js.native
    
    var request: js.UndefOr[WebRequest] = js.native
  }
  
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
    onError: js.Function1[/* error */ ReadFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any],
    useArrayBuffer: Unit,
    onError: js.Function1[/* error */ ReadFileError, Unit]
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
    onError: js.Function1[/* error */ ReadFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ Any, Unit],
    onProgress: Unit,
    useArrayBuffer: Unit,
    onError: js.Function1[/* error */ ReadFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  
  @JSImport("babylonjs/Misc/fileTools", "ReadFileError")
  @js.native
  open class ReadFileError protected () extends RuntimeError {
    /**
      * Creates a new ReadFileError
      * @param message defines the message of the error
      * @param file defines the optional file
      */
    def this(message: String, file: File) = this()
    
    var file: File = js.native
  }
  
  inline def RequestFile(
    url: String,
    onSuccess: js.UndefOr[
      js.Function2[
        /* data */ String | js.typedarray.ArrayBuffer, 
        /* request */ js.UndefOr[WebRequest], 
        Unit
      ]
    ],
    onProgress: js.UndefOr[js.Function1[/* event */ ProgressEvent[EventTarget], Unit]],
    offlineProvider: js.UndefOr[IOfflineProvider],
    useArrayBuffer: js.UndefOr[Boolean],
    onError: js.UndefOr[js.Function1[/* error */ RequestFileError, Unit]],
    onOpened: js.UndefOr[js.Function1[/* request */ WebRequest, Unit]]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  
  @JSImport("babylonjs/Misc/fileTools", "RequestFileError")
  @js.native
  open class RequestFileError protected () extends RuntimeError {
    /**
      * Creates a new LoadFileError
      * @param message defines the message of the error
      * @param request defines the optional web request
      */
    def this(message: String, request: WebRequest) = this()
    
    var request: WebRequest = js.native
  }
  
  inline def SetCorsBehavior(url: String, element: CrossOrigin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCorsBehavior")(url.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def SetCorsBehavior(url: js.Array[String], element: CrossOrigin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCorsBehavior")(url.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def TestBase64DataUrl(uri: String): Match = ^.asInstanceOf[js.Dynamic].applyDynamic("TestBase64DataUrl")(uri.asInstanceOf[js.Any]).asInstanceOf[Match]
  
  inline def injectLTSFileTools(
    DecodeBase64UrlToBinary: js.Function1[/* uri */ String, js.typedarray.ArrayBuffer],
    DecodeBase64UrlToString: js.Function1[/* uri */ String, String],
    FileToolsOptions: BaseUrl,
    IsBase64DataUrl: js.Function1[/* uri */ String, Boolean],
    IsFileURL: js.Function0[Boolean],
    LoadFile: js.Function7[
      /* fileOrUrl */ String | File, 
      /* onSuccess */ js.Function2[
        /* data */ String | js.typedarray.ArrayBuffer, 
        /* responseURL */ js.UndefOr[String], 
        Unit
      ], 
      /* onProgress */ js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]], 
      /* offlineProvider */ js.UndefOr[IOfflineProvider], 
      /* useArrayBuffer */ js.UndefOr[Boolean], 
      /* onError */ js.UndefOr[
        js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
      ], 
      /* onOpened */ js.UndefOr[js.Function1[/* request */ WebRequest, Unit]], 
      IFileRequest
    ],
    LoadImage: js.Function6[
      /* input */ String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | Blob, 
      /* onLoad */ js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit], 
      /* onError */ js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit], 
      /* offlineProvider */ Nullable[IOfflineProvider], 
      /* mimeType */ js.UndefOr[String], 
      /* imageBitmapOptions */ js.UndefOr[ImageBitmapOptions], 
      Nullable[HTMLImageElement]
    ],
    ReadFile: js.Function5[
      /* file */ File, 
      /* onSuccess */ js.Function1[/* data */ Any, Unit], 
      /* onProgress */ js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], Any]], 
      /* useArrayBuffer */ js.UndefOr[Boolean], 
      /* onError */ js.UndefOr[js.Function1[/* error */ ReadFileError, Unit]], 
      IFileRequest
    ],
    RequestFile: js.Function7[
      /* url */ String, 
      /* onSuccess */ js.Function2[
        /* data */ String | js.typedarray.ArrayBuffer, 
        /* request */ js.UndefOr[WebRequest], 
        Unit
      ], 
      /* onProgress */ js.UndefOr[js.Function1[/* event */ ProgressEvent[EventTarget], Unit]], 
      /* offlineProvider */ js.UndefOr[IOfflineProvider], 
      /* useArrayBuffer */ js.UndefOr[Boolean], 
      /* onError */ js.UndefOr[js.Function1[/* error */ RequestFileError, Unit]], 
      /* onOpened */ js.UndefOr[js.Function1[/* request */ WebRequest, Unit]], 
      IFileRequest
    ],
    SetCorsBehavior: js.Function2[/* url */ String | js.Array[String], /* element */ CrossOrigin, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_injectLTSFileTools")(DecodeBase64UrlToBinary.asInstanceOf[js.Any], DecodeBase64UrlToString.asInstanceOf[js.Any], FileToolsOptions.asInstanceOf[js.Any], IsBase64DataUrl.asInstanceOf[js.Any], IsFileURL.asInstanceOf[js.Any], LoadFile.asInstanceOf[js.Any], LoadImage.asInstanceOf[js.Any], ReadFile.asInstanceOf[js.Any], RequestFile.asInstanceOf[js.Any], SetCorsBehavior.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
