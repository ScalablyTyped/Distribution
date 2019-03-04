package typings
package bunnymqLib.bunnymqMod.bunnymqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection
  extends /* address */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var startedAt: java.lang.String
}

object Connection {
  @scala.inline
  def apply(
    startedAt: java.lang.String,
    StringDictionary: /* address */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Connection = {
    val __obj = js.Dynamic.literal(startedAt = startedAt)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Connection]
  }
}

