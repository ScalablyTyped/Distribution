package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPresetRequest extends js.Object {
  /**
    * The name of the preset.
    */
  var Name: string = js.native
}

object GetPresetRequest {
  @scala.inline
  def apply(Name: string): GetPresetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPresetRequest]
  }
}

