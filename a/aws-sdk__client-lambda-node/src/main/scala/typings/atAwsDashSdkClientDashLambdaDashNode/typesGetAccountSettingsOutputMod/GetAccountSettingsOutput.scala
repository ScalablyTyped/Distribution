package typings.atAwsDashSdkClientDashLambdaDashNode.typesGetAccountSettingsOutputMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAccountLimitMod._UnmarshalledAccountLimit
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAccountUsageMod._UnmarshalledAccountUsage
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountSettingsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Limits related to concurrency and code storage.</p>
    */
  var AccountLimit: js.UndefOr[_UnmarshalledAccountLimit] = js.undefined
  /**
    * <p>The number of functions and amount of storage in use.</p>
    */
  var AccountUsage: js.UndefOr[_UnmarshalledAccountUsage] = js.undefined
}

object GetAccountSettingsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    AccountLimit: _UnmarshalledAccountLimit = null,
    AccountUsage: _UnmarshalledAccountUsage = null
  ): GetAccountSettingsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (AccountLimit != null) __obj.updateDynamic("AccountLimit")(AccountLimit.asInstanceOf[js.Any])
    if (AccountUsage != null) __obj.updateDynamic("AccountUsage")(AccountUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountSettingsOutput]
  }
}

