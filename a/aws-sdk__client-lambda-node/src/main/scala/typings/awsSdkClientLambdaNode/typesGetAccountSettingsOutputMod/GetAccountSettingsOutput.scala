package typings.awsSdkClientLambdaNode.typesGetAccountSettingsOutputMod

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesAccountLimitMod.UnmarshalledAccountLimit
import typings.awsSdkClientLambdaNode.typesAccountUsageMod.UnmarshalledAccountUsage
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
  var AccountLimit: js.UndefOr[UnmarshalledAccountLimit] = js.undefined
  /**
    * <p>The number of functions and amount of storage in use.</p>
    */
  var AccountUsage: js.UndefOr[UnmarshalledAccountUsage] = js.undefined
}

object GetAccountSettingsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    AccountLimit: UnmarshalledAccountLimit = null,
    AccountUsage: UnmarshalledAccountUsage = null
  ): GetAccountSettingsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (AccountLimit != null) __obj.updateDynamic("AccountLimit")(AccountLimit.asInstanceOf[js.Any])
    if (AccountUsage != null) __obj.updateDynamic("AccountUsage")(AccountUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountSettingsOutput]
  }
}

