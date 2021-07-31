package typings.canvasGauges

import typings.canvasGauges.CanvasGauges.BaseGauge
import typings.canvasGauges.CanvasGauges.LinearGauge
import typings.canvasGauges.CanvasGauges.RadialGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var BaseGauge: typings.canvasGauges.CanvasGauges.BaseGauge
  
  var LinearGauge: typings.canvasGauges.CanvasGauges.LinearGauge
  
  var RadialGauge: typings.canvasGauges.CanvasGauges.RadialGauge
}
object Window {
  
  @scala.inline
  def apply(BaseGauge: BaseGauge, LinearGauge: LinearGauge, RadialGauge: RadialGauge): Window = {
    val __obj = js.Dynamic.literal(BaseGauge = BaseGauge.asInstanceOf[js.Any], LinearGauge = LinearGauge.asInstanceOf[js.Any], RadialGauge = RadialGauge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseGauge(value: BaseGauge): Self = StObject.set(x, "BaseGauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearGauge(value: LinearGauge): Self = StObject.set(x, "LinearGauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadialGauge(value: RadialGauge): Self = StObject.set(x, "RadialGauge", value.asInstanceOf[js.Any])
  }
}
