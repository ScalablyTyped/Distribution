package typings
package azureDashMobileDashServicesDashClientLib.MicrosoftNs.WindowsAzureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interface to Platform.async(func) => Platform.Promise based on code MobileServices.Web-1.0.0.js
@js.native
trait asyncPromise extends js.Object {
  def done(): scala.Unit = js.native
  def done(onSuccess: js.Function1[/* result */ js.Any, scala.Unit]): scala.Unit = js.native
  def done(
    onSuccess: js.Function1[/* result */ js.Any, scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def `then`(onSuccess: js.Function1[/* result */ js.Any, _]): asyncPromise = js.native
  def `then`(onSuccess: js.Function1[/* result */ js.Any, _], onError: js.Function1[/* error */ js.Any, _]): asyncPromise = js.native
}

