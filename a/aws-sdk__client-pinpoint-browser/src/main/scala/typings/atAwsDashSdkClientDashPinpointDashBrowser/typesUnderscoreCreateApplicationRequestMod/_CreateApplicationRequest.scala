package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCreateApplicationRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CreateApplicationRequest extends js.Object {
  /**
    * The display name of the application. Used in the Amazon Pinpoint console.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object _CreateApplicationRequest {
  @scala.inline
  def apply(Name: String = null): _CreateApplicationRequest = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[_CreateApplicationRequest]
  }
}

