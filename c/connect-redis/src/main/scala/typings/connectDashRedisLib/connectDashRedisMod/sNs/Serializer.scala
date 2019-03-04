package typings
package connectDashRedisLib.connectDashRedisMod.sNs

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
    val __obj = js.Dynamic.literal(parse = parse, stringify = stringify)
  
    __obj.asInstanceOf[Serializer]
  }
}

