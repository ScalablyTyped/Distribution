package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchDomainRequest extends js.Object {
  /**
    * The name of the Elasticsearch domain for which you want information.
    */
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
}

object DescribeElasticsearchDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName): DescribeElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainRequest]
  }
}

