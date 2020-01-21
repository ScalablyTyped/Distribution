package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationResponse extends js.Object {
  /**
    * Configuration ID of an application to be created.
    */
  var configurationId: js.UndefOr[String] = js.native
}

object CreateApplicationResponse {
  @scala.inline
  def apply(configurationId: String = null): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (configurationId != null) __obj.updateDynamic("configurationId")(configurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationResponse]
  }
}

