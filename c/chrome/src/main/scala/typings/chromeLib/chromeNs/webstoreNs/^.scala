package typings
package chromeLib.chromeNs.webstoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.webstore")
@js.native
object ^ extends js.Object {
  var onDownloadProgress: DownloadProgressEvent = js.native
  var onInstallStageChanged: InstallationStageEvent = js.native
  def install(): scala.Unit = js.native
  def install(
    failureCallback: js.Function2[
      /* error */ java.lang.String, 
      /* errorCode */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def install(successCallback: js.Function): scala.Unit = js.native
  def install(
    successCallback: js.Function,
    failureCallback: js.Function2[
      /* error */ java.lang.String, 
      /* errorCode */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def install(url: java.lang.String): scala.Unit = js.native
  def install(url: java.lang.String, successCallback: js.Function): scala.Unit = js.native
  def install(
    url: java.lang.String,
    successCallback: js.Function,
    failureCallback: js.Function2[
      /* error */ java.lang.String, 
      /* errorCode */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

