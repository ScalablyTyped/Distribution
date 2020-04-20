package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateElasticsearchDomainConfigResponse extends js.Object {
  /**
    * The status of the updated Elasticsearch domain. 
    */
  var DomainConfig: ElasticsearchDomainConfig = js.native
}

object UpdateElasticsearchDomainConfigResponse {
  @scala.inline
  def apply(DomainConfig: ElasticsearchDomainConfig): UpdateElasticsearchDomainConfigResponse = {
    val __obj = js.Dynamic.literal(DomainConfig = DomainConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateElasticsearchDomainConfigResponse]
  }
}

