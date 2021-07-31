package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeElasticsearchDomainConfigRequest extends StObject {
  
  /**
    * The Elasticsearch domain that you want to get information about.
    */
  var DomainName: typings.awsSdk.esMod.DomainName
}
object DescribeElasticsearchDomainConfigRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): DescribeElasticsearchDomainConfigRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainConfigRequest]
  }
  
  @scala.inline
  implicit class DescribeElasticsearchDomainConfigRequestMutableBuilder[Self <: DescribeElasticsearchDomainConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
