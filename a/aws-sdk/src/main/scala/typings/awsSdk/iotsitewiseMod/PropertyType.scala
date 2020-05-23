package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    attribute: Attribute = null,
    measurement: Measurement = null,
    metric: Metric = null,
    transform: Transform = null
  ): PropertyType = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (measurement != null) __obj.updateDynamic("measurement")(measurement.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyType]
  }
}

