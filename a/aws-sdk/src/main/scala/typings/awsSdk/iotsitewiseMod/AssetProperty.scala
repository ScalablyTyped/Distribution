package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetProperty extends js.Object {
  /**
    * The property alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping Industrial Data Streams to Asset Properties in the AWS IoT SiteWise User Guide.
    */
  var alias: js.UndefOr[PropertyAlias] = js.native
  /**
    * The data type of the asset property.
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
    * The unit (such as Newtons or RPM) of the asset property.
    */
  var unit: js.UndefOr[PropertyUnit] = js.native
}

object AssetProperty {
  @scala.inline
  def apply(dataType: PropertyDataType, id: ID, name: Name): AssetProperty = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetProperty]
  }
  @scala.inline
  implicit class AssetPropertyOps[Self <: AssetProperty] (val x: Self) extends AnyVal {
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
    def setDataType(value: PropertyDataType): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: ID): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlias(value: PropertyAlias): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setNotification(value: PropertyNotification): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    @scala.inline
    def setUnit(value: PropertyUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

