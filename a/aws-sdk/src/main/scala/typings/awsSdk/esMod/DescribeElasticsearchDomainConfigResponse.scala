package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchDomainConfigResponse extends js.Object {
  /**
    * The configuration information of the domain requested in the DescribeElasticsearchDomainConfig request.
    */
  var DomainConfig: ElasticsearchDomainConfig = js.native
}

object DescribeElasticsearchDomainConfigResponse {
  @scala.inline
  def apply(DomainConfig: ElasticsearchDomainConfig): DescribeElasticsearchDomainConfigResponse = {
    val __obj = js.Dynamic.literal(DomainConfig = DomainConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainConfigResponse]
  }
}

