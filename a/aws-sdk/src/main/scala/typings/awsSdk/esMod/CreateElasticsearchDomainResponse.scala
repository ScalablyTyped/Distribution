package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateElasticsearchDomainResponse extends js.Object {
  /**
    * The status of the newly created Elasticsearch domain. 
    */
  var DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.native
}

object CreateElasticsearchDomainResponse {
  @scala.inline
  def apply(DomainStatus: ElasticsearchDomainStatus = null): CreateElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainStatus != null) __obj.updateDynamic("DomainStatus")(DomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateElasticsearchDomainResponse]
  }
}

