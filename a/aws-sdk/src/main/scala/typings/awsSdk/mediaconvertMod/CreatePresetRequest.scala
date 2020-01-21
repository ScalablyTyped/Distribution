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
  def apply(
    Name: string,
    Settings: PresetSettings,
    Category: string = null,
    Description: string = null,
    Tags: mapOfString = null
  ): CreatePresetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresetRequest]
  }
}

