package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetPropertyValue extends js.Object {
  /**
    * The quality of the asset property value. The value must be GOOD, BAD, or UNCERTAIN. You can also specify an expression.
    */
  var quality: js.UndefOr[AssetPropertyQuality] = js.native
  /**
    * The timestamp associated with the asset property value. The default is the current event time.
    */
  var timestamp: js.UndefOr[AssetPropertyTimestamp] = js.native
  /**
    * The value to send to an asset property.
    */
  var value: AssetPropertyVariant = js.native
}

object AssetPropertyValue {
  @scala.inline
  def apply(value: AssetPropertyVariant): AssetPropertyValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyValue]
  }
  @scala.inline
  implicit class AssetPropertyValueOps[Self <: AssetPropertyValue] (val x: Self) extends AnyVal {
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
    def setValue(value: AssetPropertyVariant): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuality(value: AssetPropertyQuality): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setTimestamp(value: AssetPropertyTimestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

