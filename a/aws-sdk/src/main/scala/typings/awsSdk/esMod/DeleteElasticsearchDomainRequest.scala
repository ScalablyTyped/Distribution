package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteElasticsearchDomainRequest extends js.Object {
  /**
    * The name of the Elasticsearch domain that you want to permanently delete.
    */
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
}

object DeleteElasticsearchDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName): DeleteElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteElasticsearchDomainRequest]
  }
  @scala.inline
  implicit class DeleteElasticsearchDomainRequestOps[Self <: DeleteElasticsearchDomainRequest] (val x: Self) extends AnyVal {
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
  }
  
}

