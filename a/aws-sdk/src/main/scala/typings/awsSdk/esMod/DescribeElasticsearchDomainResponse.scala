package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DescribeElasticsearchDomainResponseOps[Self <: DescribeElasticsearchDomainResponse] (val x: Self) extends AnyVal {
    
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
  }
}
