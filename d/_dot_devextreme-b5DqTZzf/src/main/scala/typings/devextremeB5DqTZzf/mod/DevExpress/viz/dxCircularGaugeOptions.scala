package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.EndAngle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxCircularGaugeOptions
  extends StObject
     with BaseGaugeOptions[dxCircularGauge] {
  
  /**
    * Specifies the properties required to set the geometry of the CircularGauge UI component.
    */
  var geometry: js.UndefOr[EndAngle] = js.undefined
  
  /**
    * Specifies gauge range container properties.
    */
  @JSName("rangeContainer")
  var rangeContainer_dxCircularGaugeOptions: js.UndefOr[dxCircularGaugeRangeContainer] = js.undefined
  
  /**
    * Specifies a gauge&apos;s scale properties.
    */
  @JSName("scale")
  var scale_dxCircularGaugeOptions: js.UndefOr[dxCircularGaugeScale] = js.undefined
  
  /**
    * Specifies the appearance properties of subvalue indicators.
    */
  var subvalueIndicator: js.UndefOr[GaugeIndicator] = js.undefined
  
  /**
    * Specifies the appearance properties of the value indicator.
    */
  var valueIndicator: js.UndefOr[GaugeIndicator] = js.undefined
}
object dxCircularGaugeOptions {
  
  inline def apply(): dxCircularGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCircularGaugeOptions]
  }
  
  extension [Self <: dxCircularGaugeOptions](x: Self) {
    
    inline def setGeometry(value: EndAngle): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setRangeContainer(value: dxCircularGaugeRangeContainer): Self = StObject.set(x, "rangeContainer", value.asInstanceOf[js.Any])
    
    inline def setRangeContainerUndefined: Self = StObject.set(x, "rangeContainer", js.undefined)
    
    inline def setScale(value: dxCircularGaugeScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSubvalueIndicator(value: GaugeIndicator): Self = StObject.set(x, "subvalueIndicator", value.asInstanceOf[js.Any])
    
    inline def setSubvalueIndicatorUndefined: Self = StObject.set(x, "subvalueIndicator", js.undefined)
    
    inline def setValueIndicator(value: GaugeIndicator): Self = StObject.set(x, "valueIndicator", value.asInstanceOf[js.Any])
    
    inline def setValueIndicatorUndefined: Self = StObject.set(x, "valueIndicator", js.undefined)
  }
}
