package typings.chrome.anon

import typings.chrome.chrome.webstore.DownloadProgressEvent
import typings.chrome.chrome.webstore.InstallationStageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofwebstore extends js.Object {
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
  def install(url: String, successCallback: js.Function): Unit = js.native
  def install(
    url: String,
    successCallback: js.Function,
    failureCallback: js.Function2[/* error */ String, /* errorCode */ js.UndefOr[String], Unit]
  ): Unit = js.native
}

