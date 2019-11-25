package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreApplicationResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ApplicationResponse extends js.Object {
  /**
    * The unique application ID.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * The display name of the application.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object _ApplicationResponse {
  @scala.inline
  def apply(Id: String = null, Name: String = null): _ApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ApplicationResponse]
  }
}

