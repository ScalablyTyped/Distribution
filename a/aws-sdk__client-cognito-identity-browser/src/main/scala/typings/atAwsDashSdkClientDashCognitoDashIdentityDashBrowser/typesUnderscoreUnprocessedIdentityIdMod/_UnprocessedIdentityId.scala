package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreUnprocessedIdentityIdMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.AccessDenied
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.InternalServerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnprocessedIdentityId extends js.Object {
  /**
    * <p>The error code indicating the type of error that occurred.</p>
    */
  var ErrorCode: js.UndefOr[AccessDenied | InternalServerError | String] = js.undefined
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
}

object _UnprocessedIdentityId {
  @scala.inline
  def apply(ErrorCode: AccessDenied | InternalServerError | String = null, IdentityId: String = null): _UnprocessedIdentityId = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnprocessedIdentityId]
  }
}

