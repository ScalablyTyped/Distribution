package typings.chocolatechipjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delete extends js.Object {
  var _delete: js.Function = js.native
  var hasKey: js.Function = js.native
  var keys: js.Array[_] = js.native
  var set: js.Function = js.native
  var values: js.Array[_] = js.native
}

object Delete {
  @scala.inline
  def apply(
    _delete: js.Function,
    hasKey: js.Function,
    keys: js.Array[_],
    set: js.Function,
    values: js.Array[_]
  ): Delete = {
    val __obj = js.Dynamic.literal(_delete = _delete.asInstanceOf[js.Any], hasKey = hasKey.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  @scala.inline
  implicit class DeleteOps[Self <: Delete] (val x: Self) extends AnyVal {
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
    def set_delete(value: js.Function): Self = this.set("_delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasKey(value: js.Function): Self = this.set("hasKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeysVarargs(value: js.Any*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[_]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: js.Function): Self = this.set("set", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

