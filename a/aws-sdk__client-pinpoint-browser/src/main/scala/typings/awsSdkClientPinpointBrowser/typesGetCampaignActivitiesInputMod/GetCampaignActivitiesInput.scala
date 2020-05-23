package typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCampaignActivitiesInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: String
  /**
    * The unique ID of the campaign.
    */
  var CampaignId: String
  /**
    * The number of entries you want on each page in the response.
    */
  var PageSize: js.UndefOr[String] = js.undefined
  /**
    * The NextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var Token: js.UndefOr[String] = js.undefined
}

object GetCampaignActivitiesInput {
  @scala.inline
  def apply(
    ApplicationId: String,
    CampaignId: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: js.UndefOr[Double] = js.undefined,
    PageSize: String = null,
    Token: String = null
  ): GetCampaignActivitiesInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if (!js.isUndefined($maxRetries)) __obj.updateDynamic("$maxRetries")($maxRetries.get.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (Token != null) __obj.updateDynamic("Token")(Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignActivitiesInput]
  }
}

