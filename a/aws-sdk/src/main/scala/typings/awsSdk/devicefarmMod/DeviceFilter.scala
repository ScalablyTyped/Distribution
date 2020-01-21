package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceFilter extends js.Object {
  /**
    * The aspect of a device such as platform or model used as the selection criteria in a device filter. The supported operators for each attribute are provided in the following list.  ARN  The Amazon Resource Name (ARN) of the device (for example, arn:aws:devicefarm:us-west-2::device:12345Example). Supported operators: EQUALS, IN, NOT_IN   PLATFORM  The device platform. Valid values are ANDROID or IOS. Supported operators: EQUALS   OS_VERSION  The operating system version (for example, 10.3.2). Supported operators: EQUALS, GREATER_THAN, GREATER_THAN_OR_EQUALS, IN, LESS_THAN, LESS_THAN_OR_EQUALS, NOT_IN   MODEL  The device model (for example, iPad 5th Gen). Supported operators: CONTAINS, EQUALS, IN, NOT_IN   AVAILABILITY  The current availability of the device. Valid values are AVAILABLE, HIGHLY_AVAILABLE, BUSY, or TEMPORARY_NOT_AVAILABLE. Supported operators: EQUALS   FORM_FACTOR  The device form factor. Valid values are PHONE or TABLET. Supported operators: EQUALS   MANUFACTURER  The device manufacturer (for example, Apple). Supported operators: EQUALS, IN, NOT_IN   REMOTE_ACCESS_ENABLED  Whether the device is enabled for remote access. Valid values are TRUE or FALSE. Supported operators: EQUALS   REMOTE_DEBUG_ENABLED  Whether the device is enabled for remote debugging. Valid values are TRUE or FALSE. Supported operators: EQUALS  Because remote debugging is no longer supported, this filter is ignored.  INSTANCE_ARN  The Amazon Resource Name (ARN) of the device instance. Supported operators: EQUALS, IN, NOT_IN   INSTANCE_LABELS  The label of the device instance. Supported operators: CONTAINS   FLEET_TYPE  The fleet type. Valid values are PUBLIC or PRIVATE. Supported operators: EQUALS   
    */
  var attribute: js.UndefOr[DeviceFilterAttribute] = js.native
  /**
    * Specifies how Device Farm compares the filter's attribute to the value. See the attribute descriptions.
    */
  var operator: js.UndefOr[RuleOperator] = js.native
  /**
    * An array of one or more filter values used in a device filter.  Operator Values    The IN and NOT_IN operators can take a values array that has more than one element.   The other operators require an array with a single element.    Attribute Values    The PLATFORM attribute can be set to ANDROID or IOS.   The AVAILABILITY attribute can be set to AVAILABLE, HIGHLY_AVAILABLE, BUSY, or TEMPORARY_NOT_AVAILABLE.   The FORM_FACTOR attribute can be set to PHONE or TABLET.   The FLEET_TYPE attribute can be set to PUBLIC or PRIVATE.  
    */
  var values: js.UndefOr[DeviceFilterValues] = js.native
}

object DeviceFilter {
  @scala.inline
  def apply(
    attribute: DeviceFilterAttribute = null,
    operator: RuleOperator = null,
    values: DeviceFilterValues = null
  ): DeviceFilter = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceFilter]
  }
}

