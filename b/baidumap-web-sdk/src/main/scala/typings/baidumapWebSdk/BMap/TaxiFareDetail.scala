package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaxiFareDetail extends StObject {
  
  var initialFare: Double = js.native
  
  var totalFare: Double = js.native
  
  var unitFare: Double = js.native
}
object TaxiFareDetail {
  
  @scala.inline
  def apply(initialFare: Double, totalFare: Double, unitFare: Double): TaxiFareDetail = {
    val __obj = js.Dynamic.literal(initialFare = initialFare.asInstanceOf[js.Any], totalFare = totalFare.asInstanceOf[js.Any], unitFare = unitFare.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaxiFareDetail]
  }
  
  @scala.inline
  implicit class TaxiFareDetailMutableBuilder[Self <: TaxiFareDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialFare(value: Double): Self = StObject.set(x, "initialFare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFare(value: Double): Self = StObject.set(x, "totalFare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitFare(value: Double): Self = StObject.set(x, "unitFare", value.asInstanceOf[js.Any])
  }
}
