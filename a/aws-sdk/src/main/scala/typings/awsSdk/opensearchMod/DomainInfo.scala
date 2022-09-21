package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainInfo extends StObject {
  
  /**
    * The DomainName. 
    */
  var DomainName: js.UndefOr[typings.awsSdk.opensearchMod.DomainName] = js.undefined
  
  /**
    *  Specifies the EngineType of the domain.
    */
  var EngineType: js.UndefOr[typings.awsSdk.opensearchMod.EngineType] = js.undefined
}
object DomainInfo {
  
  inline def apply(): DomainInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainInfo]
  }
  
  extension [Self <: DomainInfo](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    inline def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
  }
}
