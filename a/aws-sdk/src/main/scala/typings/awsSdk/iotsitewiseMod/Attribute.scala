package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute extends js.Object {
  /**
    * The default value of the asset model property attribute. All assets that you create from the asset model contain this attribute value. You can update an attribute's value after you create an asset. For more information, see Updating Attribute Values in the AWS IoT SiteWise User Guide.
    */
  var defaultValue: js.UndefOr[DefaultValue] = js.native
}

object Attribute {
  @scala.inline
  def apply(defaultValue: DefaultValue = null): Attribute = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

