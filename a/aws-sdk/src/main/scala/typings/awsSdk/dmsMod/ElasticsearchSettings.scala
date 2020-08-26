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
  def apply(EndpointUri: String, ServiceAccessRoleArn: String): ElasticsearchSettings = {
    val __obj = js.Dynamic.literal(EndpointUri = EndpointUri.asInstanceOf[js.Any], ServiceAccessRoleArn = ServiceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchSettings]
  }
  @scala.inline
  implicit class ElasticsearchSettingsOps[Self <: ElasticsearchSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndpointUri(value: String): Self = this.set("EndpointUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = this.set("ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorRetryDuration(value: IntegerOptional): Self = this.set("ErrorRetryDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorRetryDuration: Self = this.set("ErrorRetryDuration", js.undefined)
    @scala.inline
    def setFullLoadErrorPercentage(value: IntegerOptional): Self = this.set("FullLoadErrorPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullLoadErrorPercentage: Self = this.set("FullLoadErrorPercentage", js.undefined)
  }
  
}

