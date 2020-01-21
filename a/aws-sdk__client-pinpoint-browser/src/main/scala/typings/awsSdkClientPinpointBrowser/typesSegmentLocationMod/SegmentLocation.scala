package typings.awsSdkClientPinpointBrowser.typesSegmentLocationMod

import typings.awsSdkClientPinpointBrowser.typesGpspointdimensionMod.GPSPointDimension
import typings.awsSdkClientPinpointBrowser.typesSetDimensionMod.SetDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentLocation extends js.Object {
  /**
    * The country or region, in ISO 3166-1 alpha-2 format.
    */
  var Country: js.UndefOr[SetDimension] = js.undefined
  /**
    * The GPS Point dimension.
    */
  var GPSPoint: js.UndefOr[GPSPointDimension] = js.undefined
}

object SegmentLocation {
  @scala.inline
  def apply(Country: SetDimension = null, GPSPoint: GPSPointDimension = null): SegmentLocation = {
    val __obj = js.Dynamic.literal()
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (GPSPoint != null) __obj.updateDynamic("GPSPoint")(GPSPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentLocation]
  }
}

