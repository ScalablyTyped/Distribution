package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaLayerVersionDetails extends js.Object {
  /**
    * The layer's compatible runtimes. Maximum number of five items. Valid values: nodejs10.x | nodejs12.x | java8 | java11 | python2.7 | python3.6 | python3.7 | python3.8 | dotnetcore1.0 | dotnetcore2.1 | go1.x | ruby2.5 | provided 
    */
  var CompatibleRuntimes: js.UndefOr[NonEmptyStringList] = js.native
  /**
    * The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000. 
    */
  var CreatedDate: js.UndefOr[NonEmptyString] = js.native
  /**
    * The version number.
    */
  var Version: js.UndefOr[AwsLambdaLayerVersionNumber] = js.native
}

object AwsLambdaLayerVersionDetails {
  @scala.inline
  def apply(
    CompatibleRuntimes: NonEmptyStringList = null,
    CreatedDate: NonEmptyString = null,
    Version: js.UndefOr[AwsLambdaLayerVersionNumber] = js.undefined
  ): AwsLambdaLayerVersionDetails = {
    val __obj = js.Dynamic.literal()
    if (CompatibleRuntimes != null) __obj.updateDynamic("CompatibleRuntimes")(CompatibleRuntimes.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsLambdaLayerVersionDetails]
  }
}

