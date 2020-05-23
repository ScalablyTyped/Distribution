package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties extends js.Object {
  var properties: js.Array[Indicate]
  var uuid: String
}

object Properties {
  @scala.inline
  def apply(properties: js.Array[Indicate], uuid: String): Properties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
}

