package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Property extends js.Object {
  /**
    * The property alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping Industrial Data Streams to Asset Properties in the AWS IoT SiteWise User Guide.
    */
  var alias: js.UndefOr[PropertyAlias] = js.native
  /**
    * The property data type.
    */
  var dataType: PropertyDataType = js.native
  /**
    * The ID of the asset property.
    */
  var id: ID = js.native
  /**
    * The name of the property.
    */
  var name: Name = js.native
  /**
    * The asset property's notification topic and state. For more information, see UpdateAssetProperty 
    */
  var notification: js.UndefOr[PropertyNotification] = js.native
  /**
    * The property type (see PropertyType). A property contains one type.
    */
  var `type`: js.UndefOr[PropertyType] = js.native
  /**
    * The unit (such as Newtons or RPM) of the asset property.
    */
  var unit: js.UndefOr[PropertyUnit] = js.native
}

object Property {
  @scala.inline
  def apply(
    dataType: PropertyDataType,
    id: ID,
    name: Name,
    alias: PropertyAlias = null,
    notification: PropertyNotification = null,
    `type`: PropertyType = null,
    unit: PropertyUnit = null
  ): Property = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
}

