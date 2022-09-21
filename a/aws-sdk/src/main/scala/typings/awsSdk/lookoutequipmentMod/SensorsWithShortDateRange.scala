package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensorsWithShortDateRange extends StObject {
  
  /**
    *  Indicates the number of sensors that have less than 90 days of data. 
    */
  var AffectedSensorCount: Integer
}
object SensorsWithShortDateRange {
  
  inline def apply(AffectedSensorCount: Integer): SensorsWithShortDateRange = {
    val __obj = js.Dynamic.literal(AffectedSensorCount = AffectedSensorCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorsWithShortDateRange]
  }
  
  extension [Self <: SensorsWithShortDateRange](x: Self) {
    
    inline def setAffectedSensorCount(value: Integer): Self = StObject.set(x, "AffectedSensorCount", value.asInstanceOf[js.Any])
  }
}
