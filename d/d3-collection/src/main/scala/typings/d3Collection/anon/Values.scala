package typings.d3Collection.anon

import typings.d3Collection.mod.NestedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Values[Datum, RollupType] extends js.Object {
  var key: String = js.native
  var value: js.UndefOr[RollupType] = js.native
  var values: js.UndefOr[(NestedArray[Datum, RollupType]) | js.Array[Datum]] = js.native
}

object Values {
  @scala.inline
  def apply[Datum, RollupType](key: String): Values[Datum, RollupType] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values[Datum, RollupType]]
  }
  @scala.inline
  implicit class ValuesOps[Self <: Values[_, _], Datum, RollupType] (val x: Self with (Values[Datum, RollupType])) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: RollupType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValuesVarargs(value: Datum*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: (NestedArray[Datum, RollupType]) | js.Array[Datum]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

