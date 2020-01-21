package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTestGridUrlResult extends js.Object {
  /**
    * The number of seconds the URL from CreateTestGridUrlResult$url stays active.
    */
  var expires: js.UndefOr[DateTime] = js.native
  /**
    * A signed URL, expiring in CreateTestGridUrlRequest$expiresInSeconds seconds, to be passed to a RemoteWebDriver. 
    */
  var url: js.UndefOr[String] = js.native
}

object CreateTestGridUrlResult {
  @scala.inline
  def apply(expires: DateTime = null, url: String = null): CreateTestGridUrlResult = {
    val __obj = js.Dynamic.literal()
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTestGridUrlResult]
  }
}

