package typings.bingmaps.Microsoft.Maps

import typings.bingmaps.bingmapsStrings.meters
import typings.bingmaps.bingmapsStrings.pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHeatMapLayerOptions extends StObject {
  
  /**
    * The temperature gradient that is used to colorize the map. Default gradient:
    *    {
    *        '0.00': 'rgb(255,0,255)', // Magenta
    *        '0.25': 'rgb(0,0,255)', // Blue
    *        '0.50': 'rgb(0,255,0)', // Green
    *        '0.75': 'rgb(255,255,0)', // Yellow
    *        '1.00': 'rgb(255,0,0)' // Red
    *    }
    */
  var colorGradient: js.UndefOr[IDictionary[String]] = js.undefined
  
  /**
    * The intensity of each heat point. This is a decimal value between 0 and 1. This is used to specify how "hot" a single data point should be. Default: 0.5
    */
  var intensity: js.UndefOr[Double] = js.undefined
  
  /**
    * The opacity of the HeatMapLayer canvas. Value should be a decimal between 0 and 1. Default: 1
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The radius to draw each data point on the map. Default: 10
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance units of the radius. Possible values are:
    * 
    * • 'pixels' (defualt)
    * • 'meters'
    *
    * When set to pixels the size of each data point will always be the same radius, regardless of zoom level. When set to meters, the size of the data points
    * will scale based on zoom level so as to ensure that the radius is spatially accurate.
    */
  var unit: js.UndefOr[meters | pixel] = js.undefined
  
  /** A boolean indicating if the heat map layer is visible or not. **/
  var visible: js.UndefOr[Boolean] = js.undefined
}
object IHeatMapLayerOptions {
  
  @scala.inline
  def apply(): IHeatMapLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeatMapLayerOptions]
  }
  
  @scala.inline
  implicit class IHeatMapLayerOptionsMutableBuilder[Self <: IHeatMapLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorGradient(value: IDictionary[String]): Self = StObject.set(x, "colorGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorGradientUndefined: Self = StObject.set(x, "colorGradient", js.undefined)
    
    @scala.inline
    def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntensityUndefined: Self = StObject.set(x, "intensity", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setUnit(value: meters | pixel): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
