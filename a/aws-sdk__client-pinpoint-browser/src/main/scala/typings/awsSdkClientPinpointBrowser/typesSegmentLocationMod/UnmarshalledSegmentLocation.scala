package typings.awsSdkClientPinpointBrowser.typesSegmentLocationMod

import typings.awsSdkClientPinpointBrowser.typesGpspointdimensionMod.UnmarshalledGPSPointDimension
import typings.awsSdkClientPinpointBrowser.typesSetDimensionMod.UnmarshalledSetDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSegmentLocation extends SegmentLocation {
  /**
    * The country or region, in ISO 3166-1 alpha-2 format.
    */
  @JSName("Country")
  var Country_UnmarshalledSegmentLocation: js.UndefOr[UnmarshalledSetDimension] = js.undefined
  /**
    * The GPS Point dimension.
    */
  @JSName("GPSPoint")
  var GPSPoint_UnmarshalledSegmentLocation: js.UndefOr[UnmarshalledGPSPointDimension] = js.undefined
}

object UnmarshalledSegmentLocation {
  @scala.inline
  def apply(Country: UnmarshalledSetDimension = null, GPSPoint: UnmarshalledGPSPointDimension = null): UnmarshalledSegmentLocation = {
    val __obj = js.Dynamic.literal()
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (GPSPoint != null) __obj.updateDynamic("GPSPoint")(GPSPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSegmentLocation]
  }
}

