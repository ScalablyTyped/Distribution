package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchDomainConfigRequest extends js.Object {
  /**
    * The Elasticsearch domain that you want to get information about.
    */
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
}

object DescribeElasticsearchDomainConfigRequest {
  @scala.inline
  def apply(DomainName: DomainName): DescribeElasticsearchDomainConfigRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainConfigRequest]
  }
  @scala.inline
  implicit class DescribeElasticsearchDomainConfigRequestOps[Self <: DescribeElasticsearchDomainConfigRequest] (val x: Self) extends AnyVal {
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

