package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeRange extends StObject {
  
  /**
    * The start time, in Unix time in seconds. 
    */
  var FromInclusive: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The end time, in Unix time in seconds. 
    */
  var ToExclusive: js.UndefOr[js.Date] = js.undefined
}
object TimeRange {
  
  inline def apply(): TimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeRange]
  }
  
  extension [Self <: TimeRange](x: Self) {
    
    inline def setFromInclusive(value: js.Date): Self = StObject.set(x, "FromInclusive", value.asInstanceOf[js.Any])
    
    inline def setFromInclusiveUndefined: Self = StObject.set(x, "FromInclusive", js.undefined)
    
    inline def setToExclusive(value: js.Date): Self = StObject.set(x, "ToExclusive", value.asInstanceOf[js.Any])
    
    inline def setToExclusiveUndefined: Self = StObject.set(x, "ToExclusive", js.undefined)
  }
}
