package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchSettings extends js.Object {
  /**
    * The endpoint for the Elasticsearch cluster.
    */
  var EndpointUri: String = js.native
  /**
    * The maximum number of seconds for which DMS retries failed API requests to the Elasticsearch cluster.
    */
  var ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.native
  /**
    * The maximum percentage of records that can fail to be written before a full load operation stops. 
    */
  var FullLoadErrorPercentage: js.UndefOr[IntegerOptional] = js.native
  /**
    * The Amazon Resource Name (ARN) used by service to access the IAM role.
    */
  var ServiceAccessRoleArn: String = js.native
}

object ElasticsearchSettings {
  @scala.inline
  def apply(
    EndpointUri: String,
    ServiceAccessRoleArn: String,
    ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.undefined,
    FullLoadErrorPercentage: js.UndefOr[IntegerOptional] = js.undefined
  ): ElasticsearchSettings = {
    val __obj = js.Dynamic.literal(EndpointUri = EndpointUri.asInstanceOf[js.Any], ServiceAccessRoleArn = ServiceAccessRoleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(ErrorRetryDuration)) __obj.updateDynamic("ErrorRetryDuration")(ErrorRetryDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FullLoadErrorPercentage)) __obj.updateDynamic("FullLoadErrorPercentage")(FullLoadErrorPercentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchSettings]
  }
}

