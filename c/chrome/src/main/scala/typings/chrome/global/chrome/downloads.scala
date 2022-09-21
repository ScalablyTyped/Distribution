package typings.chrome.global.chrome

import typings.chrome.chrome.downloads.DownloadChangedEvent
import typings.chrome.chrome.downloads.DownloadCreatedEvent
import typings.chrome.chrome.downloads.DownloadDeterminingFilenameEvent
import typings.chrome.chrome.downloads.DownloadErasedEvent
import typings.chrome.chrome.downloads.DownloadItem
import typings.chrome.chrome.downloads.DownloadOptions
import typings.chrome.chrome.downloads.DownloadQuery
import typings.chrome.chrome.downloads.GetFileIconOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Dev Tools - Downloads
////////////////////
/**
  * Use the chrome.downloads API to programmatically initiate, monitor, manipulate, and search for downloads.
  * Availability: Since Chrome 31.
  * Permissions:  "downloads"
  */
object downloads {
  
  @JSGlobal("chrome.downloads")
  @js.native
  val ^ : js.Any = js.native
  
  inline def acceptDanger(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("acceptDanger")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def acceptDanger(downloadId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("acceptDanger")(downloadId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cancel(downloadId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(downloadId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def cancel(downloadId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(downloadId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cancel_Promise(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def download(options: DownloadOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("download")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def download(options: DownloadOptions, callback: js.Function1[/* downloadId */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("download")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def download_Promise(options: DownloadOptions): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("download")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  inline def drag(downloadId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("drag")(downloadId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def erase(query: DownloadQuery): js.Promise[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("erase")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Double]]]
  inline def erase(query: DownloadQuery, callback: js.Function1[/* erasedIds */ js.Array[Double], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFileIcon(downloadId: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileIcon")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getFileIcon(downloadId: Double, callback: js.Function1[/* iconURL */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileIcon")(downloadId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getFileIcon(downloadId: Double, options: GetFileIconOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileIcon")(downloadId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getFileIcon(
    downloadId: Double,
    options: GetFileIconOptions,
    callback: js.Function1[/* iconURL */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileIcon")(downloadId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.downloads.onChanged")
  @js.native
  def onChanged: DownloadChangedEvent = js.native
  inline def onChanged_=(x: DownloadChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.downloads.onCreated")
  @js.native
  def onCreated: DownloadCreatedEvent = js.native
  inline def onCreated_=(x: DownloadCreatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.downloads.onDeterminingFilename")
  @js.native
  def onDeterminingFilename: DownloadDeterminingFilenameEvent = js.native
  inline def onDeterminingFilename_=(x: DownloadDeterminingFilenameEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDeterminingFilename")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.downloads.onErased")
  @js.native
  def onErased: DownloadErasedEvent = js.native
  inline def onErased_=(x: DownloadErasedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onErased")(x.asInstanceOf[js.Any])
  
  inline def open(downloadId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(downloadId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def pause(downloadId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")(downloadId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def pause(downloadId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pause")(downloadId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pause_Promise(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def removeFile(downloadId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(downloadId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeFile(downloadId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(downloadId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeFile_Promise(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def resume(downloadId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resume")(downloadId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def resume(downloadId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resume")(downloadId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resume_Promise(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resume")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def search(query: DownloadQuery): js.Promise[js.Array[DownloadItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[DownloadItem]]]
  inline def search(query: DownloadQuery, callback: js.Function1[/* results */ js.Array[DownloadItem], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setShelfEnabled(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShelfEnabled")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def show(downloadId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(downloadId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def showDefaultFolder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showDefaultFolder")().asInstanceOf[Unit]
}
