package typings.awsSdkClientPinpointBrowser.typesCreateApplicationRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationRequest extends js.Object {
  /**
    * The display name of the application. Used in the Amazon Pinpoint console.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object CreateApplicationRequest {
  @scala.inline
  def apply(Name: String = null): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
}

