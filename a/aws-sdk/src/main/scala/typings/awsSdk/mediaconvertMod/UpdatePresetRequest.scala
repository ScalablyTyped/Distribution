package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePresetRequest extends js.Object {
  /**
    * The new category for the preset, if you are changing it.
    */
  var Category: js.UndefOr[string] = js.native
  /**
    * The new description for the preset, if you are changing it.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The name of the preset you are modifying.
    */
  var Name: string = js.native
  /**
    * Settings for preset
    */
  var Settings: js.UndefOr[PresetSettings] = js.native
}

object UpdatePresetRequest {
  @scala.inline
  def apply(Name: string, Category: string = null, Description: string = null, Settings: PresetSettings = null): UpdatePresetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePresetRequest]
  }
}

