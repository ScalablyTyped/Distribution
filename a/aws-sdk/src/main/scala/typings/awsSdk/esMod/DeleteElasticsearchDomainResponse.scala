package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteElasticsearchDomainResponse extends js.Object {
  /**
    * The status of the Elasticsearch domain being deleted.
    */
  var DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.native
}

object DeleteElasticsearchDomainResponse {
  @scala.inline
  def apply(): DeleteElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteElasticsearchDomainResponse]
  }
  @scala.inline
  implicit class DeleteElasticsearchDomainResponseOps[Self <: DeleteElasticsearchDomainResponse] (val x: Self) extends AnyVal {
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
    def setDomainStatus(value: ElasticsearchDomainStatus): Self = this.set("DomainStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainStatus: Self = this.set("DomainStatus", js.undefined)
  }
  
}

