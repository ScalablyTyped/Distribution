package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFilter extends StObject {
  
  /**
    * A timestamp representing the end of the time period filtered on.
    */
  var endInclusive: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A timestamp representing the start of the time period filtered on.
    */
  var startInclusive: js.UndefOr[js.Date] = js.undefined
}
object DateFilter {
  
  inline def apply(): DateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFilter]
  }
  
  extension [Self <: DateFilter](x: Self) {
    
    inline def setEndInclusive(value: js.Date): Self = StObject.set(x, "endInclusive", value.asInstanceOf[js.Any])
    
    inline def setEndInclusiveUndefined: Self = StObject.set(x, "endInclusive", js.undefined)
    
    inline def setStartInclusive(value: js.Date): Self = StObject.set(x, "startInclusive", value.asInstanceOf[js.Any])
    
    inline def setStartInclusiveUndefined: Self = StObject.set(x, "startInclusive", js.undefined)
  }
}
