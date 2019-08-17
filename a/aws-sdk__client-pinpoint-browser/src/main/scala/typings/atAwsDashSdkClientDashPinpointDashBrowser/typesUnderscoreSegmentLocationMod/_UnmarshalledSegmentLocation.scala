package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentLocationMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreGPSPointDimensionMod._UnmarshalledGPSPointDimension
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSetDimensionMod._UnmarshalledSetDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSegmentLocation extends _SegmentLocation {
  /**
    * The country or region, in ISO 3166-1 alpha-2 format.
    */
  @JSName("Country")
  var Country__UnmarshalledSegmentLocation: js.UndefOr[_UnmarshalledSetDimension] = js.undefined
  /**
    * The GPS Point dimension.
    */
  @JSName("GPSPoint")
  var GPSPoint__UnmarshalledSegmentLocation: js.UndefOr[_UnmarshalledGPSPointDimension] = js.undefined
}

object _UnmarshalledSegmentLocation {
  @scala.inline
  def apply(Country: _UnmarshalledSetDimension = null, GPSPoint: _UnmarshalledGPSPointDimension = null): _UnmarshalledSegmentLocation = {
    val __obj = js.Dynamic.literal()
    if (Country != null) __obj.updateDynamic("Country")(Country)
    if (GPSPoint != null) __obj.updateDynamic("GPSPoint")(GPSPoint)
    __obj.asInstanceOf[_UnmarshalledSegmentLocation]
  }
}

