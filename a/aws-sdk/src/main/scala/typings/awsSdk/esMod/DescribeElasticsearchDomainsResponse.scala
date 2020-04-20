package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchDomainsResponse extends js.Object {
  /**
    * The status of the domains requested in the DescribeElasticsearchDomains request.
    */
  var DomainStatusList: ElasticsearchDomainStatusList = js.native
}

object DescribeElasticsearchDomainsResponse {
  @scala.inline
  def apply(DomainStatusList: ElasticsearchDomainStatusList): DescribeElasticsearchDomainsResponse = {
    val __obj = js.Dynamic.literal(DomainStatusList = DomainStatusList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainsResponse]
  }
}

