package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditCheckConfiguration extends StObject {
  
  /**
    * True if this audit check is enabled for this account.
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
}
object AuditCheckConfiguration {
  
  inline def apply(): AuditCheckConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditCheckConfiguration]
  }
  
  extension [Self <: AuditCheckConfiguration](x: Self) {
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
