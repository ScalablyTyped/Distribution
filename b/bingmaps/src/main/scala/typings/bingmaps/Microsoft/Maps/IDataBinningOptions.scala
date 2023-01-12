package typings.bingmaps.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataBinningOptions extends StObject {
  
  /* The name of a property in the Pushpin.metadata object on which to perform calculations (average, count, sum) against the pushpins in each data bin. */
  var aggregationProperty: js.UndefOr[String] = js.undefined
  
  /*
    * A callback function which defines the color a data bin polygon should be. This callback recieves data bin information
    * along with the min and max calculated metrics for the data set. If set, this callback function must return a color value.
    */
  var colorCallback: js.UndefOr[
    js.Function3[
      /* binInfo */ IDataBinInfo, 
      /* min */ IDataBinMetrics, 
      /* max */ IDataBinMetrics, 
      String | Color
    ]
  ] = js.undefined
  
  /* The shape of the data bin to generate. Default: hexagon */
  var dataBinType: js.UndefOr[DataBinType] = js.undefined
  
  /* The distance units of the radius option. Default: meters */
  var distanceUnits: js.UndefOr[DistanceUnits] = js.undefined
  
  /* The default options used for rendering the data bin polygons. */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.undefined
  
  /*
    * A spatial distance which will be converted into a pixel distance at the equater and used to generate symetrically sized data bins
    * that have the apprimate spatial distance radius. Default: 1000
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /*
    * A callback function which defines how much to scale a data bins size. This callback recieves data bin information
    * along with the min and max calculated metrics for the data set. If set, this callback function must return a number between 0 and 1.
    */
  var scaleCallback: js.UndefOr[
    js.Function3[
      /* binInfo */ IDataBinInfo, 
      /* min */ IDataBinMetrics, 
      /* max */ IDataBinMetrics, 
      Double
    ]
  ] = js.undefined
}
object IDataBinningOptions {
  
  inline def apply(): IDataBinningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataBinningOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDataBinningOptions] (val x: Self) extends AnyVal {
    
    inline def setAggregationProperty(value: String): Self = StObject.set(x, "aggregationProperty", value.asInstanceOf[js.Any])
    
    inline def setAggregationPropertyUndefined: Self = StObject.set(x, "aggregationProperty", js.undefined)
    
    inline def setColorCallback(
      value: (/* binInfo */ IDataBinInfo, /* min */ IDataBinMetrics, /* max */ IDataBinMetrics) => String | Color
    ): Self = StObject.set(x, "colorCallback", js.Any.fromFunction3(value))
    
    inline def setColorCallbackUndefined: Self = StObject.set(x, "colorCallback", js.undefined)
    
    inline def setDataBinType(value: DataBinType): Self = StObject.set(x, "dataBinType", value.asInstanceOf[js.Any])
    
    inline def setDataBinTypeUndefined: Self = StObject.set(x, "dataBinType", js.undefined)
    
    inline def setDistanceUnits(value: DistanceUnits): Self = StObject.set(x, "distanceUnits", value.asInstanceOf[js.Any])
    
    inline def setDistanceUnitsUndefined: Self = StObject.set(x, "distanceUnits", js.undefined)
    
    inline def setPolygonOptions(value: IPolygonOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
    
    inline def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setScaleCallback(
      value: (/* binInfo */ IDataBinInfo, /* min */ IDataBinMetrics, /* max */ IDataBinMetrics) => Double
    ): Self = StObject.set(x, "scaleCallback", js.Any.fromFunction3(value))
    
    inline def setScaleCallbackUndefined: Self = StObject.set(x, "scaleCallback", js.undefined)
  }
}
