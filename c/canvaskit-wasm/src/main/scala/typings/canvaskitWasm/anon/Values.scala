package typings.canvaskitWasm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Values[T] extends js.Object {
  val values: js.Array[T] = js.native
}

object Values {
  @scala.inline
  def apply[T](values: js.Array[T]): Values[T] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values[T]]
  }
  @scala.inline
  implicit class ValuesOps[Self <: Values[_], T] (val x: Self with Values[T]) extends AnyVal {
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
    def setValuesVarargs(value: T*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[T]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

