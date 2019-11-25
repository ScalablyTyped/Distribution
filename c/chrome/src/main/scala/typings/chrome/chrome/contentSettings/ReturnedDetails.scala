package typings.chrome.chrome.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnedDetails extends js.Object {
  /** The content setting. See the description of the individual ContentSetting objects for the possible values. */
  var setting: js.Any
}

object ReturnedDetails {
  @scala.inline
  def apply(setting: js.Any): ReturnedDetails = {
    val __obj = js.Dynamic.literal(setting = setting.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReturnedDetails]
  }
}

