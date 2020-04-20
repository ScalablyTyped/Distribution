package typings.connectRedis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serializer extends js.Object {
  var parse: js.Function
  var stringify: js.Function
}

object Serializer {
  @scala.inline
  def apply(parse: js.Function, stringify: js.Function): Serializer = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any], stringify = stringify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serializer]
  }
}

