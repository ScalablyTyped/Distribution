package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccountSettingsRequest extends js.Object {
  /**
    * Specifies whether to return the effective settings. If true, the account settings for the root user or the default setting for the principalArn are returned. If false, the account settings for the principalArn are returned if they are set. Otherwise, no account settings are returned.
    */
  var effectiveSettings: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of account setting results returned by ListAccountSettings in paginated output. When this parameter is used, ListAccountSettings only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListAccountSettings request with the returned nextToken value. This value can be between 1 and 10. If this parameter is not used, then ListAccountSettings returns up to 10 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * The resource name you want to list the account settings for.
    */
  var name: js.UndefOr[SettingName] = js.native
  /**
    * The nextToken value returned from a ListAccountSettings request indicating that more results are available to fulfill the request and further calls will be needed. If maxResults was provided, it is possible the number of results to be fewer than maxResults.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted, the account settings are listed only for the authenticated user.
    */
  var principalArn: js.UndefOr[String] = js.native
  /**
    * The value of the account settings with which to filter results. You must also specify an account setting name to use this parameter.
    */
  var value: js.UndefOr[String] = js.native
}

object ListAccountSettingsRequest {
  @scala.inline
  def apply(
    effectiveSettings: js.UndefOr[scala.Boolean] = js.undefined,
    maxResults: Int | scala.Double = null,
    name: SettingName = null,
    nextToken: String = null,
    principalArn: String = null,
    value: String = null
  ): ListAccountSettingsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(effectiveSettings)) __obj.updateDynamic("effectiveSettings")(effectiveSettings.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (principalArn != null) __obj.updateDynamic("principalArn")(principalArn.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccountSettingsRequest]
  }
}

