package typings.chrome.global.chrome

import typings.chrome.chrome.downloads.DownloadChangedEvent
import typings.chrome.chrome.downloads.DownloadCreatedEvent
import typings.chrome.chrome.downloads.DownloadDeterminingFilenameEvent
import typings.chrome.chrome.downloads.DownloadErasedEvent
import typings.chrome.chrome.downloads.DownloadItem
import typings.chrome.chrome.downloads.DownloadOptions
import typings.chrome.chrome.downloads.DownloadQuery
import typings.chrome.chrome.downloads.GetFileIconOptions
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
@JSGlobal("chrome.downloads")
@js.native
object downloads extends js.Object {
  
  def acceptDanger(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def cancel(downloadId: Double): Unit = js.native
  def cancel(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def download(options: DownloadOptions): Unit = js.native
  def download(options: DownloadOptions, callback: js.Function1[/* downloadId */ Double, Unit]): Unit = js.native
  
  def drag(downloadId: Double): Unit = js.native
  
  def erase(query: DownloadQuery, callback: js.Function1[/* erasedIds */ js.Array[Double], Unit]): Unit = js.native
  
  def getFileIcon(downloadId: Double, callback: js.Function1[/* iconURL */ String, Unit]): Unit = js.native
  def getFileIcon(
    downloadId: Double,
    options: GetFileIconOptions,
    callback: js.Function1[/* iconURL */ String, Unit]
  ): Unit = js.native
  
  var onChanged: DownloadChangedEvent = js.native
  
  var onCreated: DownloadCreatedEvent = js.native
  
  var onDeterminingFilename: DownloadDeterminingFilenameEvent = js.native
  
  var onErased: DownloadErasedEvent = js.native
  
  def open(downloadId: Double): Unit = js.native
  
  def pause(downloadId: Double): Unit = js.native
  def pause(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def removeFile(downloadId: Double): Unit = js.native
  def removeFile(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def resume(downloadId: Double): Unit = js.native
  def resume(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def search(query: DownloadQuery, callback: js.Function1[/* results */ js.Array[DownloadItem], Unit]): Unit = js.native
  
  def setShelfEnabled(enabled: Boolean): Unit = js.native
  
  def show(downloadId: Double): Unit = js.native
  
  def showDefaultFolder(): Unit = js.native
}
