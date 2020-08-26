package typings.blueprintjsTable.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyDenylist[T] extends js.Object {
  var exclude: js.Array[/* keyof T */ String] = js.native
}

object IKeyDenylist {
  @scala.inline
  def apply[T](exclude: js.Array[/* keyof T */ String]): IKeyDenylist[T] = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyDenylist[T]]
  }
  @scala.inline
  implicit class IKeyDenylistOps[Self <: IKeyDenylist[_], T] (val x: Self with IKeyDenylist[T]) extends AnyVal {
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
    def setExcludeVarargs(value: (/* keyof T */ String)*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[/* keyof T */ String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
  }
  
}

