package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePresetRequest extends js.Object {
  /**
    * The name of the preset to be deleted.
    */
  var Name: string = js.native
}

object DeletePresetRequest {
  @scala.inline
  def apply(Name: string): DeletePresetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePresetRequest]
  }
}

