package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssetPropertyValueResponse extends js.Object {
  /**
    * The current asset property value.
    */
  var propertyValue: js.UndefOr[AssetPropertyValue] = js.native
}

object GetAssetPropertyValueResponse {
  @scala.inline
  def apply(propertyValue: AssetPropertyValue = null): GetAssetPropertyValueResponse = {
    val __obj = js.Dynamic.literal()
    if (propertyValue != null) __obj.updateDynamic("propertyValue")(propertyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssetPropertyValueResponse]
  }
}

