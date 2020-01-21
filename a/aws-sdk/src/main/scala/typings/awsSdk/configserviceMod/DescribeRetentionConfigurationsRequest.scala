package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRetentionConfigurationsRequest extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
  /**
    * A list of names of retention configurations for which you want details. If you do not specify a name, AWS Config returns details for all the retention configurations for that account.  Currently, AWS Config supports only one retention configuration per region in your account. 
    */
  var RetentionConfigurationNames: js.UndefOr[RetentionConfigurationNameList] = js.native
}

object DescribeRetentionConfigurationsRequest {
  @scala.inline
  def apply(NextToken: NextToken = null, RetentionConfigurationNames: RetentionConfigurationNameList = null): DescribeRetentionConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RetentionConfigurationNames != null) __obj.updateDynamic("RetentionConfigurationNames")(RetentionConfigurationNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRetentionConfigurationsRequest]
  }
}

