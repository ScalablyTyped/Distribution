package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportedPlatform extends js.Object {
  /**
    * 
    */
  var Name: js.UndefOr[String] = js.native
}

object SupportedPlatform {
  @scala.inline
  def apply(Name: String = null): SupportedPlatform = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedPlatform]
  }
}

