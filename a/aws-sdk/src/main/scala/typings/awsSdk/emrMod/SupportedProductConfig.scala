package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportedProductConfig extends js.Object {
  /**
    * The list of user-supplied arguments.
    */
  var Args: js.UndefOr[XmlStringList] = js.native
  /**
    * The name of the product configuration.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
}

object SupportedProductConfig {
  @scala.inline
  def apply(Args: XmlStringList = null, Name: XmlStringMaxLen256 = null): SupportedProductConfig = {
    val __obj = js.Dynamic.literal()
    if (Args != null) __obj.updateDynamic("Args")(Args.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedProductConfig]
  }
}

