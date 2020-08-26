package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BingMapsApiType extends js.Object {
  var defaultKey: String = js.native
  def getKey(providedKey: String): String = js.native
}

object BingMapsApiType {
  @scala.inline
  def apply(defaultKey: String, getKey: String => String): BingMapsApiType = {
    val __obj = js.Dynamic.literal(defaultKey = defaultKey.asInstanceOf[js.Any], getKey = js.Any.fromFunction1(getKey))
    __obj.asInstanceOf[BingMapsApiType]
  }
  @scala.inline
  implicit class BingMapsApiTypeOps[Self <: BingMapsApiType] (val x: Self) extends AnyVal {
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
    def setDefaultKey(value: String): Self = this.set("defaultKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetKey(value: String => String): Self = this.set("getKey", js.Any.fromFunction1(value))
  }
  
}

