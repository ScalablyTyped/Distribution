package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceSelectionConfiguration extends js.Object {
  /**
    * Used to dynamically select a set of devices for a test run. A filter is made up of an attribute, an operator, and one or more values.    Attribute  The aspect of a device such as platform or model used as the selection criteria in a device filter. Allowed values include:   ARN: The Amazon Resource Name (ARN) of the device (for example, arn:aws:devicefarm:us-west-2::device:12345Example).   PLATFORM: The device platform. Valid values are ANDROID or IOS.   OS_VERSION: The operating system version (for example, 10.3.2).   MODEL: The device model (for example, iPad 5th Gen).   AVAILABILITY: The current availability of the device. Valid values are AVAILABLE, HIGHLY_AVAILABLE, BUSY, or TEMPORARY_NOT_AVAILABLE.   FORM_FACTOR: The device form factor. Valid values are PHONE or TABLET.   MANUFACTURER: The device manufacturer (for example, Apple).   REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access. Valid values are TRUE or FALSE.   REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging. Valid values are TRUE or FALSE. Because remote debugging is no longer supported, this filter is ignored.   INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.   INSTANCE_LABELS: The label of the device instance.   FLEET_TYPE: The fleet type. Valid values are PUBLIC or PRIVATE.      Operator  The filter operator.   The EQUALS operator is available for every attribute except INSTANCE_LABELS.   The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.   The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN attributes.   The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available for the OS_VERSION attribute.      Values  An array of one or more filter values.  Operator Values    The IN and NOT_IN operators can take a values array that has more than one element.   The other operators require an array with a single element.    Attribute Values    The PLATFORM attribute can be set to ANDROID or IOS.   The AVAILABILITY attribute can be set to AVAILABLE, HIGHLY_AVAILABLE, BUSY, or TEMPORARY_NOT_AVAILABLE.   The FORM_FACTOR attribute can be set to PHONE or TABLET.   The FLEET_TYPE attribute can be set to PUBLIC or PRIVATE.    
    */
  var filters: DeviceFilters = js.native
  /**
    * The maximum number of devices to be included in a test run.
    */
  var maxDevices: Integer = js.native
}

object DeviceSelectionConfiguration {
  @scala.inline
  def apply(filters: DeviceFilters, maxDevices: Integer): DeviceSelectionConfiguration = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], maxDevices = maxDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSelectionConfiguration]
  }
}

