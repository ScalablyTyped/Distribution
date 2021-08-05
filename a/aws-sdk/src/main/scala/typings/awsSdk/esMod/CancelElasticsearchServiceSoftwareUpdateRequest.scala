package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelElasticsearchServiceSoftwareUpdateRequest extends StObject {
  
  /**
    * The name of the domain that you want to stop the latest service software update on.
    */
  var DomainName: typings.awsSdk.esMod.DomainName
}
object CancelElasticsearchServiceSoftwareUpdateRequest {
  
  inline def apply(DomainName: DomainName): CancelElasticsearchServiceSoftwareUpdateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelElasticsearchServiceSoftwareUpdateRequest]
  }
  
  extension [Self <: CancelElasticsearchServiceSoftwareUpdateRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
