package typings.babylonjs

import typings.babylonjs.anon.CrossOrigin
import typings.babylonjs.baseErrorMod.BaseError
import typings.babylonjs.fileRequestMod.IFileRequest
import typings.babylonjs.iofflineproviderMod.IOfflineProvider
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webRequestMod.WebRequest
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.EventTarget
import typings.std.File
import typings.std.HTMLImageElement
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileToolsMod {
  
  @JSImport("babylonjs/Misc/fileTools", "FileTools")
  @js.native
  class FileTools () extends StObject
  /* static members */
  object FileTools {
    
    @JSImport("babylonjs/Misc/fileTools", "FileTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets the base URL to use to load assets
      */
    @JSImport("babylonjs/Misc/fileTools", "FileTools.BaseUrl")
    @js.native
    def BaseUrl: String = js.native
    @scala.inline
    def BaseUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseUrl")(x.asInstanceOf[js.Any])
    
    /**
      * Default behaviour for cors in the application.
      * It can be a string if the expected behavior is identical in the entire app.
      * Or a callback to be able to set it per url or on a group of them (in case of Video source for instance)
      */
    @JSImport("babylonjs/Misc/fileTools", "FileTools.CorsBehavior")
    @js.native
    def CorsBehavior: String | (js.Function1[/* url */ String | js.Array[String], String]) = js.native
    @scala.inline
    def CorsBehavior_=(x: String | (js.Function1[/* url */ String | js.Array[String], String])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CorsBehavior")(x.asInstanceOf[js.Any])
    
    /**
      * Gets or sets the retry strategy to apply when an error happens while loading an asset
      */
    @JSImport("babylonjs/Misc/fileTools", "FileTools.DefaultRetryStrategy")
    @js.native
    def DefaultRetryStrategy(url: String, request: WebRequest, retryIndex: Double): Double = js.native
    
    /**
      * Checks if the loaded document was accessed via `file:`-Protocol.
      * @returns boolean
      */
    @JSImport("babylonjs/Misc/fileTools", "FileTools.IsFileURL")
    @js.native
    def IsFileURL(): Boolean = js.native
    
    /**
      * Loads a file from a url
      * @param url url to load
      * @param onSuccess callback called when the file successfully loads
      * @param onProgress callback called while file is loading (if the server supports this mode)
      * @param offlineProvider defines the offline provider for caching
      * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
      * @param onError callback called when the file fails to load
      * @returns a file request object
      */
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
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
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
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
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
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
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
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
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
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
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
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
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
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
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadFile")
    @js.native
    def LoadFile(
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
    
    /**
      * Loads an image as an HTMLImageElement.
      * @param input url string, ArrayBuffer, or Blob to load
      * @param onLoad callback called when the image successfully loads
      * @param onError callback called when the image fails to load
      * @param offlineProvider offline provider for caching
      * @param mimeType optional mime type
      * @returns the HTMLImageElement of the loaded image
      */
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadImage")
    @js.native
    def LoadImage(
      input: String,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadImage")
    @js.native
    def LoadImage(
      input: String,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadImage")
    @js.native
    def LoadImage(
      input: ArrayBufferView,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadImage")
    @js.native
    def LoadImage(
      input: ArrayBufferView,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadImage")
    @js.native
    def LoadImage(
      input: ArrayBuffer,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadImage")
    @js.native
    def LoadImage(
      input: ArrayBuffer,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadImage")
    @js.native
    def LoadImage(
      input: Blob,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.LoadImage")
    @js.native
    def LoadImage(
      input: Blob,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = js.native
    
    /**
      * Gets or sets a function used to pre-process url before using them to load assets
      */
    @JSImport("babylonjs/Misc/fileTools", "FileTools.PreprocessUrl")
    @js.native
    def PreprocessUrl(url: String): String = js.native
    
    /**
      * Reads a file from a File object
      * @param file defines the file to load
      * @param onSuccess defines the callback to call when data is loaded
      * @param onProgress defines the callback to call during loading process
      * @param useArrayBuffer defines a boolean indicating that data must be returned as an ArrayBuffer
      * @param onError defines the callback to call when an error occurs
      * @returns a file request object
      */
    @JSImport("babylonjs/Misc/fileTools", "FileTools.ReadFile")
    @js.native
    def ReadFile(file: File, onSuccess: js.Function1[/* data */ js.Any, Unit]): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.ReadFile")
    @js.native
    def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ js.Any, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.ReadFile")
    @js.native
    def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ js.Any, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.ReadFile")
    @js.native
    def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ js.Any, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.ReadFile")
    @js.native
    def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ js.Any, Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], _]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.ReadFile")
    @js.native
    def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ js.Any, Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], _],
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.ReadFile")
    @js.native
    def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ js.Any, Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], _],
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.ReadFile")
    @js.native
    def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ js.Any, Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], _],
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = js.native
    
    /**
      * Loads a file
      * @param url url to load
      * @param onSuccess callback called when the file successfully loads
      * @param onProgress callback called while file is loading (if the server supports this mode)
      * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
      * @param onError callback called when the file fails to load
      * @param onOpened callback called when the web request is opened
      * @returns a file request object
      */
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean,
      onError: js.UndefOr[scala.Nothing],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.UndefOr[scala.Nothing],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean,
      onError: js.UndefOr[scala.Nothing],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.UndefOr[scala.Nothing],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.RequestFile")
    @js.native
    def RequestFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* request */ js.UndefOr[WebRequest], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ RequestFileError, Unit],
      onOpened: js.Function1[/* request */ WebRequest, Unit]
    ): IFileRequest = js.native
    
    /**
      * Sets the cors behavior on a dom element. This will add the required Tools.CorsBehavior to the element.
      * @param url define the url we are trying
      * @param element define the dom element where to configure the cors policy
      */
    @JSImport("babylonjs/Misc/fileTools", "FileTools.SetCorsBehavior")
    @js.native
    def SetCorsBehavior(url: String, element: CrossOrigin): Unit = js.native
    @JSImport("babylonjs/Misc/fileTools", "FileTools.SetCorsBehavior")
    @js.native
    def SetCorsBehavior(url: js.Array[String], element: CrossOrigin): Unit = js.native
    
    /**
      * Removes unwanted characters from an url
      * @param url defines the url to clean
      * @returns the cleaned url
      */
    @JSImport("babylonjs/Misc/fileTools", "FileTools._CleanUrl")
    @js.native
    def _CleanUrl: js.Any = js.native
    @scala.inline
    def _CleanUrl_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CleanUrl")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Misc/fileTools", "LoadFileError")
  @js.native
  class LoadFileError protected () extends BaseError {
    /**
      * Creates a new LoadFileError
      * @param message defines the message of the error
      * @param request defines the optional web request
      * @param file defines the optional file
      */
    def this(message: String) = this()
    def this(message: String, `object`: WebRequest) = this()
    def this(message: String, `object`: File) = this()
    
    var file: js.UndefOr[File] = js.native
    
    var request: js.UndefOr[WebRequest] = js.native
  }
  
  @JSImport("babylonjs/Misc/fileTools", "ReadFileError")
  @js.native
  class ReadFileError protected () extends BaseError {
    /**
      * Creates a new ReadFileError
      * @param message defines the message of the error
      * @param file defines the optional file
      */
    def this(message: String, file: File) = this()
    
    var file: File = js.native
  }
  
  @JSImport("babylonjs/Misc/fileTools", "RequestFileError")
  @js.native
  class RequestFileError protected () extends BaseError {
    /**
      * Creates a new LoadFileError
      * @param message defines the message of the error
      * @param request defines the optional web request
      */
    def this(message: String, request: WebRequest) = this()
    
    var request: WebRequest = js.native
  }
}
