package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyGroup extends js.Object {
  /**
    * Describes the key of an application execution property key-value pair.
    */
  var PropertyGroupId: Id = js.native
  /**
    * Describes the value of an application execution property key-value pair.
    */
  var PropertyMap: typings.awsSdk.kinesisanalyticsv2Mod.PropertyMap = js.native
}

object PropertyGroup {
  @scala.inline
  def apply(PropertyGroupId: Id, PropertyMap: PropertyMap): PropertyGroup = {
    val __obj = js.Dynamic.literal(PropertyGroupId = PropertyGroupId.asInstanceOf[js.Any], PropertyMap = PropertyMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyGroup]
  }
  @scala.inline
  implicit class PropertyGroupOps[Self <: PropertyGroup] (val x: Self) extends AnyVal {
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
    def setPropertyGroupId(value: Id): Self = this.set("PropertyGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyMap(value: PropertyMap): Self = this.set("PropertyMap", value.asInstanceOf[js.Any])
  }
  
}

