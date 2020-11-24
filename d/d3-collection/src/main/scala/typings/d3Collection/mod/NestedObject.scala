package typings.d3Collection.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestedObject[Datum, RollupType]
  extends /* key */ StringDictionary[(NestedObject[Datum, RollupType]) | js.Array[Datum] | RollupType]
object NestedObject {
  
  @scala.inline
  def apply[Datum, RollupType](): NestedObject[Datum, RollupType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestedObject[Datum, RollupType]]
  }
}
