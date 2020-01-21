package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  /**
    * Reserved.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * Reserved.
    */
  var Value: js.UndefOr[String] = js.native
}

object Metadata {
  @scala.inline
  def apply(Name: String = null, Value: String = null): Metadata = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

