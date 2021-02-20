package typings.chrome.global.chrome

import typings.chrome.chrome.webstore.DownloadProgressEvent
import typings.chrome.chrome.webstore.InstallationStageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Web Store
////////////////////
/**
  * Use the chrome.webstore API to initiate app and extension installations "inline" from your site.
  * @since Chrome 15.
  */
object webstore {
  
  @JSGlobal("chrome.webstore")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.webstore.install")
  @js.native
  def install(): Unit = js.native
  @JSGlobal("chrome.webstore.install")
  @js.native
  def install(failureCallback: js.Function2[/* error */ String, /* errorCode */ js.UndefOr[String], Unit]): Unit = js.native
  @JSGlobal("chrome.webstore.install")
  @js.native
  def install(successCallback: js.Function): Unit = js.native
  @JSGlobal("chrome.webstore.install")
  @js.native
  def install(
    successCallback: js.Function,
    failureCallback: js.Function2[/* error */ String, /* errorCode */ js.UndefOr[String], Unit]
  ): Unit = js.native
  @JSGlobal("chrome.webstore.install")
  @js.native
  def install(url: String): Unit = js.native
  @JSGlobal("chrome.webstore.install")
  @js.native
  def install(
    url: String,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* error */ String, /* errorCode */ js.UndefOr[String], Unit]
  ): Unit = js.native
  @JSGlobal("chrome.webstore.install")
  @js.native
  def install(url: String, successCallback: js.Function): Unit = js.native
  @JSGlobal("chrome.webstore.install")
  @js.native
  def install(
    url: String,
    successCallback: js.Function,
    failureCallback: js.Function2[/* error */ String, /* errorCode */ js.UndefOr[String], Unit]
  ): Unit = js.native
  
  @JSGlobal("chrome.webstore.onDownloadProgress")
  @js.native
  def onDownloadProgress: DownloadProgressEvent = js.native
  @scala.inline
  def onDownloadProgress_=(x: DownloadProgressEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDownloadProgress")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webstore.onInstallStageChanged")
  @js.native
  def onInstallStageChanged: InstallationStageEvent = js.native
  @scala.inline
  def onInstallStageChanged_=(x: InstallationStageEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInstallStageChanged")(x.asInstanceOf[js.Any])
}
