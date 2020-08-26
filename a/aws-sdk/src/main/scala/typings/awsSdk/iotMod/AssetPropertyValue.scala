package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetPropertyValue extends js.Object {
  /**
    * Optional. A string that describes the quality of the value. Accepts substitution templates. Must be GOOD, BAD, or UNCERTAIN.
    */
  var quality: js.UndefOr[AssetPropertyQuality] = js.native
  /**
    * The asset property value timestamp.
    */
  var timestamp: AssetPropertyTimestamp = js.native
  /**
    * The value of the asset property.
    */
  var value: AssetPropertyVariant = js.native
}

object AssetPropertyValue {
  @scala.inline
  def apply(timestamp: AssetPropertyTimestamp, value: AssetPropertyVariant): AssetPropertyValue = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyValue]
  }
  @scala.inline
  implicit class AssetPropertyValueOps[Self <: AssetPropertyValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTimestamp(value: AssetPropertyTimestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: AssetPropertyVariant): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuality(value: AssetPropertyQuality): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
  
}

