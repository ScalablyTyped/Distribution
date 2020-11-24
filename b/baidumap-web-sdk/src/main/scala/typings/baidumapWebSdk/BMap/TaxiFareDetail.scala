package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaxiFareDetail extends js.Object {
  
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
  implicit class TaxiFareDetailOps[Self <: TaxiFareDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInitialFare(value: Double): Self = this.set("initialFare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFare(value: Double): Self = this.set("totalFare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitFare(value: Double): Self = this.set("unitFare", value.asInstanceOf[js.Any])
  }
}
