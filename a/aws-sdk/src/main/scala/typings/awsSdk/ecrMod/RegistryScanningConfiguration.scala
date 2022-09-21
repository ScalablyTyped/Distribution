package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistryScanningConfiguration extends StObject {
  
  /**
    * The scanning rules associated with the registry.
    */
  var rules: js.UndefOr[RegistryScanningRuleList] = js.undefined
  
  /**
    * The type of scanning configured for the registry.
    */
  var scanType: js.UndefOr[ScanType] = js.undefined
}
object RegistryScanningConfiguration {
  
  inline def apply(): RegistryScanningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistryScanningConfiguration]
  }
  
  extension [Self <: RegistryScanningConfiguration](x: Self) {
    
    inline def setRules(value: RegistryScanningRuleList): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: RegistryScanningRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setScanType(value: ScanType): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    inline def setScanTypeUndefined: Self = StObject.set(x, "scanType", js.undefined)
  }
}
