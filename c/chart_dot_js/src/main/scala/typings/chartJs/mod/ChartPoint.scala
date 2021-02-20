package typings.chartJs.mod

import typings.moment.mod.Moment
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartPoint extends StObject {
  
  var r: js.UndefOr[Double] = js.native
  
  var t: js.UndefOr[Double | String | Date | Moment] = js.native
  
  var x: js.UndefOr[Double | String | Date | Moment] = js.native
  
  var y: js.UndefOr[Double | String | Date | Moment] = js.native
}
object ChartPoint {
  
  @scala.inline
  def apply(): ChartPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPoint]
  }
  
  @scala.inline
  implicit class ChartPointMutableBuilder[Self <: ChartPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setT(value: Double | String | Date | Moment): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTUndefined: Self = StObject.set(x, "t", js.undefined)
    
    @scala.inline
    def setX(value: Double | String | Date | Moment): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double | String | Date | Moment): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
