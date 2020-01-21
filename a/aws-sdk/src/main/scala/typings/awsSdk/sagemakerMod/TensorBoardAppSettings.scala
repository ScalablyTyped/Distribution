package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorBoardAppSettings extends js.Object {
  /**
    * The instance type and quantity.
    */
  var DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.native
}

object TensorBoardAppSettings {
  @scala.inline
  def apply(DefaultResourceSpec: ResourceSpec = null): TensorBoardAppSettings = {
    val __obj = js.Dynamic.literal()
    if (DefaultResourceSpec != null) __obj.updateDynamic("DefaultResourceSpec")(DefaultResourceSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorBoardAppSettings]
  }
}

