package typings.chrome.global.chrome

import typings.chrome.chrome.webstore.DownloadProgressEvent
import typings.chrome.chrome.webstore.InstallationStageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Web Store
////////////////////
/**
  * Use the chrome.webstore API to initiate app and extension installations "inline" from your site.
  * @since Chrome 15.
  */
@JSGlobal("chrome.webstore")
@js.native
object webstore extends js.Object {
  var onDownloadProgress: DownloadProgressEvent = js.native
  var onInstallStageChanged: InstallationStageEvent = js.native
  def install(): Unit = js.native
  def install(failureCallback: js.Function2[/* error */ String, /* errorCode */ js.UndefOr[String], Unit]): Unit = js.native
  def install(successCallback: js.Function): Unit = js.native
  def install(
    successCallback: js.Function,
    failureCallback: js.Function2[/* error */ String, /* errorCode */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def install(url: String): Unit = js.native
  def install(
    url: String,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* error */ String, /* errorCode */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def install(url: String, successCallback: js.Function): Unit = js.native
  def install(
    url: String,
    successCallback: js.Function,
    failureCallback: js.Function2[/* error */ String, /* errorCode */ js.UndefOr[String], Unit]
  ): Unit = js.native
}

