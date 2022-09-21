package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatetimeRange extends StObject {
  
  /**
    * Start of the time range.
    */
  var Begin: ISO8601DateTime
  
  /**
    * End of the time range.
    */
  var End: js.UndefOr[ISO8601DateTime] = js.undefined
}
object DatetimeRange {
  
  inline def apply(Begin: ISO8601DateTime): DatetimeRange = {
    val __obj = js.Dynamic.literal(Begin = Begin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimeRange]
  }
  
  extension [Self <: DatetimeRange](x: Self) {
    
    inline def setBegin(value: ISO8601DateTime): Self = StObject.set(x, "Begin", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: ISO8601DateTime): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
  }
}
