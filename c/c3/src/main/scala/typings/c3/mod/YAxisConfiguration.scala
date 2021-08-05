package typings.c3.mod

import typings.c3.anon.PositionText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YAxisConfiguration
  extends StObject
     with AxisConfiguration {
  
  /**
    * Set default range of y axis. This option set the default value for y axis when there is no data on init.
    */
  var default: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  /**
    * Set center value of y axis.
    */
  var center: js.UndefOr[Double] = js.undefined
  
  /**
    * Change the direction of y axis.
    * If true set, the direction will be from the top to the bottom.
    */
  var inverted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set label on Y axis.
    */
  var label: js.UndefOr[String | PositionText] = js.undefined
  
  @JSName("max")
  var max_YAxisConfiguration: js.UndefOr[Double] = js.undefined
  
  @JSName("min")
  var min_YAxisConfiguration: js.UndefOr[Double] = js.undefined
  
  var tick: js.UndefOr[YTickConfiguration] = js.undefined
  
  var `type`: js.UndefOr[YAxisType] = js.undefined
}
object YAxisConfiguration {
  
  inline def apply(): YAxisConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisConfiguration]
  }
  
  extension [Self <: YAxisConfiguration](x: Self) {
    
    inline def setCenter(value: Double): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setDefault(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    inline def setLabel(value: String | PositionText): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setTick(value: YTickConfiguration): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setType(value: YAxisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
