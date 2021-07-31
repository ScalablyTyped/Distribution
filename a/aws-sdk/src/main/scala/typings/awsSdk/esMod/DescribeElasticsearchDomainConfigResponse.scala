package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeElasticsearchDomainConfigResponse extends StObject {
  
  /**
    * The configuration information of the domain requested in the DescribeElasticsearchDomainConfig request.
    */
  var DomainConfig: ElasticsearchDomainConfig
}
object DescribeElasticsearchDomainConfigResponse {
  
  @scala.inline
  def apply(DomainConfig: ElasticsearchDomainConfig): DescribeElasticsearchDomainConfigResponse = {
    val __obj = js.Dynamic.literal(DomainConfig = DomainConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainConfigResponse]
  }
  
  @scala.inline
  implicit class DescribeElasticsearchDomainConfigResponseMutableBuilder[Self <: DescribeElasticsearchDomainConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainConfig(value: ElasticsearchDomainConfig): Self = StObject.set(x, "DomainConfig", value.asInstanceOf[js.Any])
  }
}
