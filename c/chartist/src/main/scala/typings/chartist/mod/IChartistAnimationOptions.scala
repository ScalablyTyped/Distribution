package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartistAnimationOptions extends StObject {
  
  var begin: js.UndefOr[String] = js.native
  
  var dur: String | Double = js.native
  
  var easing: js.UndefOr[IChartistEasingDefinition | String] = js.native
  
  var fill: js.UndefOr[String] = js.native
  
  var from: String | Double = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var to: String | Double = js.native
}
object IChartistAnimationOptions {
  
  @scala.inline
  def apply(dur: String | Double, from: String | Double, to: String | Double): IChartistAnimationOptions = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistAnimationOptions]
  }
  
  @scala.inline
  implicit class IChartistAnimationOptionsMutableBuilder[Self <: IChartistAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    @scala.inline
    def setDur(value: String | Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: IChartistEasingDefinition | String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFrom(value: String | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTo(value: String | Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
