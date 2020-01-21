package typings.bunnymq.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection
  extends /* address */ StringDictionary[js.Any] {
  var startedAt: String
}

object Connection {
  @scala.inline
  def apply(startedAt: String, StringDictionary: /* address */ StringDictionary[js.Any] = null): Connection = {
    val __obj = js.Dynamic.literal(startedAt = startedAt.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Connection]
  }
}

