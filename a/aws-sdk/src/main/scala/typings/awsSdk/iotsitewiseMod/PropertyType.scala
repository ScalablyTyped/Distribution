package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyType extends js.Object {
  
  /**
    * Specifies an asset attribute property. An attribute generally contains static information, such as the serial number of an IIoT wind turbine.
    */
  var attribute: js.UndefOr[Attribute] = js.native
  
  /**
    * Specifies an asset measurement property. A measurement represents a device's raw sensor data stream, such as timestamped temperature values or timestamped power values.
    */
  var measurement: js.UndefOr[Measurement] = js.native
  
  /**
    * Specifies an asset metric property. A metric contains a mathematical expression that uses aggregate functions to process all input data points over a time interval and output a single data point, such as to calculate the average hourly temperature.
    */
  var metric: js.UndefOr[Metric] = js.native
  
  /**
    * Specifies an asset transform property. A transform contains a mathematical expression that maps a property's data points from one form to another, such as a unit conversion from Celsius to Fahrenheit.
    */
  var transform: js.UndefOr[Transform] = js.native
}
object PropertyType {
  
  @scala.inline
  def apply(): PropertyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyType]
  }
  
  @scala.inline
  implicit class PropertyTypeOps[Self <: PropertyType] (val x: Self) extends AnyVal {
    
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
    def setAttribute(value: Attribute): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    
    @scala.inline
    def setMeasurement(value: Measurement): Self = this.set("measurement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasurement: Self = this.set("measurement", js.undefined)
    
    @scala.inline
    def setMetric(value: Metric): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    
    @scala.inline
    def setTransform(value: Transform): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
