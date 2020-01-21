package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchDomainResponse extends js.Object {
  /**
    * The current status of the Elasticsearch domain.
    */
  var DomainStatus: ElasticsearchDomainStatus = js.native
}

object DescribeElasticsearchDomainResponse {
  @scala.inline
  def apply(DomainStatus: ElasticsearchDomainStatus): DescribeElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal(DomainStatus = DomainStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeElasticsearchDomainResponse]
  }
}

