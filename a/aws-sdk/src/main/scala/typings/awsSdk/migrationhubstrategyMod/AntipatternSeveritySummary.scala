package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AntipatternSeveritySummary extends StObject {
  
  /**
    *  Contains the count of anti-patterns. 
    */
  var count: js.UndefOr[Integer] = js.undefined
  
  /**
    *  Contains the severity of anti-patterns. 
    */
  var severity: js.UndefOr[Severity] = js.undefined
}
object AntipatternSeveritySummary {
  
  inline def apply(): AntipatternSeveritySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AntipatternSeveritySummary]
  }
  
  extension [Self <: AntipatternSeveritySummary](x: Self) {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
