package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingMapsApiType extends js.Object {
  var defaultKey: String
  def getKey(providedKey: String): String
}

object BingMapsApiType {
  @scala.inline
  def apply(defaultKey: String, getKey: String => String): BingMapsApiType = {
    val __obj = js.Dynamic.literal(defaultKey = defaultKey.asInstanceOf[js.Any], getKey = js.Any.fromFunction1(getKey))
    __obj.asInstanceOf[BingMapsApiType]
  }
}

