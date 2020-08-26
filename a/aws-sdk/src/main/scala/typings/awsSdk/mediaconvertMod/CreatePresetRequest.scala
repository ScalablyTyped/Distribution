package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePresetRequest extends js.Object {
  /**
    * Optional. A category for the preset you are creating.
    */
  var Category: js.UndefOr[string] = js.native
  /**
    * Optional. A description of the preset you are creating.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The name of the preset you are creating.
    */
  var Name: string = js.native
  /**
    * Settings for preset
    */
  var Settings: PresetSettings = js.native
  /**
    * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
}

object CreatePresetRequest {
  @scala.inline
  def apply(Name: string, Settings: PresetSettings): CreatePresetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresetRequest]
  }
  @scala.inline
  implicit class CreatePresetRequestOps[Self <: CreatePresetRequest] (val x: Self) extends AnyVal {
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
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: PresetSettings): Self = this.set("Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: string): Self = this.set("Category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("Category", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setTags(value: mapOfString): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

