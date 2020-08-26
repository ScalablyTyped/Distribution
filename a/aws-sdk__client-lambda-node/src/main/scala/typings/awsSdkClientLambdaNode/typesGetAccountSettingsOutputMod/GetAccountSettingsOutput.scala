package typings.awsSdkClientLambdaNode.typesGetAccountSettingsOutputMod

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesAccountLimitMod.UnmarshalledAccountLimit
import typings.awsSdkClientLambdaNode.typesAccountUsageMod.UnmarshalledAccountUsage
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountSettingsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Limits related to concurrency and code storage.</p>
    */
  var AccountLimit: js.UndefOr[UnmarshalledAccountLimit] = js.native
  /**
    * <p>The number of functions and amount of storage in use.</p>
    */
  var AccountUsage: js.UndefOr[UnmarshalledAccountUsage] = js.native
}

object GetAccountSettingsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetAccountSettingsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountSettingsOutput]
  }
  @scala.inline
  implicit class GetAccountSettingsOutputOps[Self <: GetAccountSettingsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountLimit(value: UnmarshalledAccountLimit): Self = this.set("AccountLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountLimit: Self = this.set("AccountLimit", js.undefined)
    @scala.inline
    def setAccountUsage(value: UnmarshalledAccountUsage): Self = this.set("AccountUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountUsage: Self = this.set("AccountUsage", js.undefined)
  }
  
}

