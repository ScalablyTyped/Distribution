package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementTemplate extends js.Object {
  /**
    * The default attributes (key/value pairs) to be applied to all placements using this template.
    */
  var defaultAttributes: js.UndefOr[DefaultPlacementAttributeMap] = js.native
  /**
    * An object specifying the DeviceTemplate for all placements using this (PlacementTemplate) template.
    */
  var deviceTemplates: js.UndefOr[DeviceTemplateMap] = js.native
}

object PlacementTemplate {
  @scala.inline
  def apply(): PlacementTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementTemplate]
  }
  @scala.inline
  implicit class PlacementTemplateOps[Self <: PlacementTemplate] (val x: Self) extends AnyVal {
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
    def setDefaultAttributes(value: DefaultPlacementAttributeMap): Self = this.set("defaultAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAttributes: Self = this.set("defaultAttributes", js.undefined)
    @scala.inline
    def setDeviceTemplates(value: DeviceTemplateMap): Self = this.set("deviceTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceTemplates: Self = this.set("deviceTemplates", js.undefined)
  }
  
}

