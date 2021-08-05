package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaxiFare extends StObject {
  
  var day: TaxiFareDetail
  
  var distance: Double
  
  var night: TaxiFareDetail
  
  var remark: String
}
object TaxiFare {
  
  inline def apply(day: TaxiFareDetail, distance: Double, night: TaxiFareDetail, remark: String): TaxiFare = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], night = night.asInstanceOf[js.Any], remark = remark.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaxiFare]
  }
  
  extension [Self <: TaxiFare](x: Self) {
    
    inline def setDay(value: TaxiFareDetail): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setNight(value: TaxiFareDetail): Self = StObject.set(x, "night", value.asInstanceOf[js.Any])
    
    inline def setRemark(value: String): Self = StObject.set(x, "remark", value.asInstanceOf[js.Any])
  }
}
