package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardProperties[TLength, TTime]
  extends StandardLonghandProperties[TLength, TTime]
     with StandardShorthandProperties[TLength, TTime]

object StandardProperties {
  @scala.inline
  def apply[TLength, TTime](): StandardProperties[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardProperties[TLength, TTime]]
  }
}

