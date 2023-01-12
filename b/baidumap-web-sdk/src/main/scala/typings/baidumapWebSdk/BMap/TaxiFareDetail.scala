package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaxiFareDetail extends StObject {
  
  var initialFare: Double
  
  var totalFare: Double
  
  var unitFare: Double
}
object TaxiFareDetail {
  
  inline def apply(initialFare: Double, totalFare: Double, unitFare: Double): TaxiFareDetail = {
    val __obj = js.Dynamic.literal(initialFare = initialFare.asInstanceOf[js.Any], totalFare = totalFare.asInstanceOf[js.Any], unitFare = unitFare.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaxiFareDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaxiFareDetail] (val x: Self) extends AnyVal {
    
    inline def setInitialFare(value: Double): Self = StObject.set(x, "initialFare", value.asInstanceOf[js.Any])
    
    inline def setTotalFare(value: Double): Self = StObject.set(x, "totalFare", value.asInstanceOf[js.Any])
    
    inline def setUnitFare(value: Double): Self = StObject.set(x, "unitFare", value.asInstanceOf[js.Any])
  }
}
