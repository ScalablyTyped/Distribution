package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDetails extends StObject {
  
  /**
    * The name of the domain.
    */
  var domainName: js.UndefOr[string] = js.undefined
}
object DomainDetails {
  
  inline def apply(): DomainDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDetails]
  }
  
  extension [Self <: DomainDetails](x: Self) {
    
    inline def setDomainName(value: string): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
  }
}
