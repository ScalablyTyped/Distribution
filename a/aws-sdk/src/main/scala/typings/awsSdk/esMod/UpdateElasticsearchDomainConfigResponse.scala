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
  @scala.inline
  implicit class UpdateElasticsearchDomainConfigResponseOps[Self <: UpdateElasticsearchDomainConfigResponse] (val x: Self) extends AnyVal {
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
    def setDomainConfig(value: ElasticsearchDomainConfig): Self = this.set("DomainConfig", value.asInstanceOf[js.Any])
  }
  
}

