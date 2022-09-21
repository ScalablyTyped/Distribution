package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainConfigRequest extends StObject {
  
  /**
    * The domain you want to get information about.
    */
  var DomainName: typings.awsSdk.opensearchMod.DomainName
}
object DescribeDomainConfigRequest {
  
  inline def apply(DomainName: DomainName): DescribeDomainConfigRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainConfigRequest]
  }
  
  extension [Self <: DescribeDomainConfigRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
