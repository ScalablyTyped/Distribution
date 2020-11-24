package typings.awsSdkClientPinpointBrowser.typesSegmentLocationMod

import typings.awsSdkClientPinpointBrowser.typesGpspointdimensionMod.UnmarshalledGPSPointDimension
import typings.awsSdkClientPinpointBrowser.typesSetDimensionMod.UnmarshalledSetDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledSegmentLocation extends SegmentLocation {
  
  /**
    * The country or region, in ISO 3166-1 alpha-2 format.
    */
  @JSName("Country")
  var Country_UnmarshalledSegmentLocation: js.UndefOr[UnmarshalledSetDimension] = js.native
  
  /**
    * The GPS Point dimension.
    */
  @JSName("GPSPoint")
  var GPSPoint_UnmarshalledSegmentLocation: js.UndefOr[UnmarshalledGPSPointDimension] = js.native
}
object UnmarshalledSegmentLocation {
  
  @scala.inline
  def apply(): UnmarshalledSegmentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentLocation]
  }
  
  @scala.inline
  implicit class UnmarshalledSegmentLocationOps[Self <: UnmarshalledSegmentLocation] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: UnmarshalledSetDimension): Self = this.set("Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    
    @scala.inline
    def setGPSPoint(value: UnmarshalledGPSPointDimension): Self = this.set("GPSPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSPoint: Self = this.set("GPSPoint", js.undefined)
  }
}
