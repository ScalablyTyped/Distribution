package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaxiFare extends StObject {
  
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
  implicit class TaxiFareMutableBuilder[Self <: TaxiFare] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: TaxiFareDetail): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNight(value: TaxiFareDetail): Self = StObject.set(x, "night", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemark(value: String): Self = StObject.set(x, "remark", value.asInstanceOf[js.Any])
  }
}
