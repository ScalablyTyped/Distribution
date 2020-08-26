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
  def apply(): GetAssetPropertyValueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssetPropertyValueResponse]
  }
  @scala.inline
  implicit class GetAssetPropertyValueResponseOps[Self <: GetAssetPropertyValueResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPropertyValue(value: AssetPropertyValue): Self = this.set("propertyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyValue: Self = this.set("propertyValue", js.undefined)
  }
  
}

