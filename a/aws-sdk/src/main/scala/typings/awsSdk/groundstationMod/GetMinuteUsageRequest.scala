package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMinuteUsageRequest extends StObject {
  
  /**
    * The month being requested, with a value of 1-12.
    */
  var month: Integer
  
  /**
    * The year being requested, in the format of YYYY.
    */
  var year: Integer
}
object GetMinuteUsageRequest {
  
  inline def apply(month: Integer, year: Integer): GetMinuteUsageRequest = {
    val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMinuteUsageRequest]
  }
  
  extension [Self <: GetMinuteUsageRequest](x: Self) {
    
    inline def setMonth(value: Integer): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Integer): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
