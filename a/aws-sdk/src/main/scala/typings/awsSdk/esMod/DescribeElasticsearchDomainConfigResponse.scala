package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeElasticsearchDomainConfigResponse extends js.Object {
  
  /**
    * The configuration information of the domain requested in the DescribeElasticsearchDomainConfig request.
    */
  var DomainConfig: ElasticsearchDomainConfig = js.native
}
object DescribeElasticsearchDomainConfigResponse {
  
  @scala.inline
  def apply(DomainConfig: ElasticsearchDomainConfig): DescribeElasticsearchDomainConfigResponse = {
    val __obj = js.Dynamic.literal(DomainConfig = DomainConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainConfigResponse]
  }
  
  @scala.inline
  implicit class DescribeElasticsearchDomainConfigResponseOps[Self <: DescribeElasticsearchDomainConfigResponse] (val x: Self) extends AnyVal {
    
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
