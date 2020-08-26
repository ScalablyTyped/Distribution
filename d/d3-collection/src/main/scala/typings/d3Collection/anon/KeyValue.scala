package typings.d3Collection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValue[RollupType] extends js.Object {
  var key: String = js.native
  var value: js.UndefOr[RollupType] = js.native
  var values: js.Any = js.native
}

object KeyValue {
  @scala.inline
  def apply[RollupType](key: String, values: js.Any): KeyValue[RollupType] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValue[RollupType]]
  }
  @scala.inline
  implicit class KeyValueOps[Self <: KeyValue[_], RollupType] (val x: Self with KeyValue[RollupType]) extends AnyVal {
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
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: RollupType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

