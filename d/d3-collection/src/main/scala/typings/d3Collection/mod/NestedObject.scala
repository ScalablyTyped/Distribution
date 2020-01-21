package typings.d3Collection.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedObject[Datum, RollupType]
  extends /* key */ StringDictionary[(NestedObject[Datum, RollupType]) | js.Array[Datum] | RollupType]

object NestedObject {
  @scala.inline
  def apply[Datum, RollupType](
    StringDictionary: /* key */ StringDictionary[(NestedObject[Datum, RollupType]) | js.Array[Datum] | RollupType] = null
  ): NestedObject[Datum, RollupType] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NestedObject[Datum, RollupType]]
  }
}

