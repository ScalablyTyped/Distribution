package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorTypeOffering extends js.Object {
  /**
    *  The name of the Elastic Inference Accelerator type. 
    */
  var acceleratorType: js.UndefOr[AcceleratorTypeName] = js.native
  /**
    *  The location for the offering. It will return either the region, availability zone or availability zone id for the offering depending on the locationType value. 
    */
  var location: js.UndefOr[Location] = js.native
  /**
    *  The location type for the offering. It can assume the following values: region: defines that the offering is at the regional level. availability-zone: defines that the offering is at the availability zone level. availability-zone-id: defines that the offering is at the availability zone level, defined by the availability zone id. 
    */
  var locationType: js.UndefOr[LocationType] = js.native
}

object AcceleratorTypeOffering {
  @scala.inline
  def apply(): AcceleratorTypeOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorTypeOffering]
  }
  @scala.inline
  implicit class AcceleratorTypeOfferingOps[Self <: AcceleratorTypeOffering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceleratorType(value: AcceleratorTypeName): Self = this.set("acceleratorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleratorType: Self = this.set("acceleratorType", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setLocationType(value: LocationType): Self = this.set("locationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
  }
  
}

