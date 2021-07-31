package typings.chrome.anon

import typings.chrome.chrome.webstore.DownloadProgressEvent
import typings.chrome.chrome.webstore.InstallationStageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofwebstore extends StObject {
  
  def install(): Unit = js.native
  def install(failureCallback: js.Function2[/* error */ String, /* errorCode */ js.UndefOr[String], Unit]): Unit = js.native
  def install(successCallback: js.Function): Unit = js.native
  def install(
    successCallback: js.Function,
    failureCallback: js.Function2[/* error */ String, /* errorCode */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def install(url: String): Unit = js.native
  def install(url: String, successCallback: js.Function): Unit = js.native
  def install(
    url: String,
    successCallback: js.Function,
    failureCallback: js.Function2[/* error */ String, /* errorCode */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def install(
    url: String,
    successCallback: Unit,
    failureCallback: js.Function2[/* error */ String, /* errorCode */ js.UndefOr[String], Unit]
  ): Unit = js.native
  
  var onDownloadProgress: DownloadProgressEvent = js.native
  
  var onInstallStageChanged: InstallationStageEvent = js.native
}
