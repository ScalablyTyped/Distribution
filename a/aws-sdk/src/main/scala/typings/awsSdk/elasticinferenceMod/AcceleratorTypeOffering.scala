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
  def apply(
    acceleratorType: AcceleratorTypeName = null,
    location: Location = null,
    locationType: LocationType = null
  ): AcceleratorTypeOffering = {
    val __obj = js.Dynamic.literal()
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorTypeOffering]
  }
}

