package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaxiFare extends js.Object {
  
  var day: TaxiFareDetail = js.native
  
  var distance: Double = js.native
  
  var night: TaxiFareDetail = js.native
  
  var remark: String = js.native
}
object TaxiFare {
  
  @scala.inline
  def apply(day: TaxiFareDetail, distance: Double, night: TaxiFareDetail, remark: String): TaxiFare = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], night = night.asInstanceOf[js.Any], remark = remark.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaxiFare]
  }
  
  @scala.inline
  implicit class TaxiFareOps[Self <: TaxiFare] (val x: Self) extends AnyVal {
    
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
    def setDay(value: TaxiFareDetail): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNight(value: TaxiFareDetail): Self = this.set("night", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemark(value: String): Self = this.set("remark", value.asInstanceOf[js.Any])
  }
}
