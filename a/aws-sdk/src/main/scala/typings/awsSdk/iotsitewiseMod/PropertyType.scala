package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyType extends StObject {
  
  /**
    * Specifies an asset attribute property. An attribute generally contains static information, such as the serial number of an IIoT wind turbine.
    */
  var attribute: js.UndefOr[Attribute] = js.undefined
  
  /**
    * Specifies an asset measurement property. A measurement represents a device's raw sensor data stream, such as timestamped temperature values or timestamped power values.
    */
  var measurement: js.UndefOr[Measurement] = js.undefined
  
  /**
    * Specifies an asset metric property. A metric contains a mathematical expression that uses aggregate functions to process all input data points over a time interval and output a single data point, such as to calculate the average hourly temperature.
    */
  var metric: js.UndefOr[Metric] = js.undefined
  
  /**
    * Specifies an asset transform property. A transform contains a mathematical expression that maps a property's data points from one form to another, such as a unit conversion from Celsius to Fahrenheit.
    */
  var transform: js.UndefOr[Transform] = js.undefined
}
object PropertyType {
  
  inline def apply(): PropertyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyType]
  }
  
  extension [Self <: PropertyType](x: Self) {
    
    inline def setAttribute(value: Attribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setMeasurement(value: Measurement): Self = StObject.set(x, "measurement", value.asInstanceOf[js.Any])
    
    inline def setMeasurementUndefined: Self = StObject.set(x, "measurement", js.undefined)
    
    inline def setMetric(value: Metric): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
