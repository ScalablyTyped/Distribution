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
import scala.scalajs.js.`|`
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
  
  @JSGlobal("chrome.downloads.acceptDanger")
  @js.native
  def acceptDanger(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.downloads.cancel")
  @js.native
  def cancel(downloadId: Double): Unit = js.native
  @JSGlobal("chrome.downloads.cancel")
  @js.native
  def cancel(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.downloads.download")
  @js.native
  def download(options: DownloadOptions): Unit = js.native
  @JSGlobal("chrome.downloads.download")
  @js.native
  def download(options: DownloadOptions, callback: js.Function1[/* downloadId */ Double, Unit]): Unit = js.native
  
  @JSGlobal("chrome.downloads.drag")
  @js.native
  def drag(downloadId: Double): Unit = js.native
  
  @JSGlobal("chrome.downloads.erase")
  @js.native
  def erase(query: DownloadQuery, callback: js.Function1[/* erasedIds */ js.Array[Double], Unit]): Unit = js.native
  
  @JSGlobal("chrome.downloads.getFileIcon")
  @js.native
  def getFileIcon(downloadId: Double, callback: js.Function1[/* iconURL */ String, Unit]): Unit = js.native
  @JSGlobal("chrome.downloads.getFileIcon")
  @js.native
  def getFileIcon(
    downloadId: Double,
    options: GetFileIconOptions,
    callback: js.Function1[/* iconURL */ String, Unit]
  ): Unit = js.native
  
  @JSGlobal("chrome.downloads.onChanged")
  @js.native
  def onChanged: DownloadChangedEvent = js.native
  @scala.inline
  def onChanged_=(x: DownloadChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.downloads.onCreated")
  @js.native
  def onCreated: DownloadCreatedEvent = js.native
  @scala.inline
  def onCreated_=(x: DownloadCreatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.downloads.onDeterminingFilename")
  @js.native
  def onDeterminingFilename: DownloadDeterminingFilenameEvent = js.native
  @scala.inline
  def onDeterminingFilename_=(x: DownloadDeterminingFilenameEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDeterminingFilename")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.downloads.onErased")
  @js.native
  def onErased: DownloadErasedEvent = js.native
  @scala.inline
  def onErased_=(x: DownloadErasedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onErased")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.downloads.open")
  @js.native
  def open(downloadId: Double): Unit = js.native
  
  @JSGlobal("chrome.downloads.pause")
  @js.native
  def pause(downloadId: Double): Unit = js.native
  @JSGlobal("chrome.downloads.pause")
  @js.native
  def pause(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.downloads.removeFile")
  @js.native
  def removeFile(downloadId: Double): Unit = js.native
  @JSGlobal("chrome.downloads.removeFile")
  @js.native
  def removeFile(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.downloads.resume")
  @js.native
  def resume(downloadId: Double): Unit = js.native
  @JSGlobal("chrome.downloads.resume")
  @js.native
  def resume(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.downloads.search")
  @js.native
  def search(query: DownloadQuery, callback: js.Function1[/* results */ js.Array[DownloadItem], Unit]): Unit = js.native
  
  @JSGlobal("chrome.downloads.setShelfEnabled")
  @js.native
  def setShelfEnabled(enabled: Boolean): Unit = js.native
  
  @JSGlobal("chrome.downloads.show")
  @js.native
  def show(downloadId: Double): Unit = js.native
  
  @JSGlobal("chrome.downloads.showDefaultFolder")
  @js.native
  def showDefaultFolder(): Unit = js.native
}
