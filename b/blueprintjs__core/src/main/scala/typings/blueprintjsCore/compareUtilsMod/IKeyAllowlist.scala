package typings.blueprintjsCore.compareUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyAllowlist[T] extends js.Object {
  var include: js.Array[/* keyof T */ String] = js.native
}

object IKeyAllowlist {
  @scala.inline
  def apply[T](include: js.Array[/* keyof T */ String]): IKeyAllowlist[T] = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyAllowlist[T]]
  }
  @scala.inline
  implicit class IKeyAllowlistOps[Self <: IKeyAllowlist[_], T] (val x: Self with IKeyAllowlist[T]) extends AnyVal {
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
    def setIncludeVarargs(value: (/* keyof T */ String)*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: js.Array[/* keyof T */ String]): Self = this.set("include", value.asInstanceOf[js.Any])
  }
  
}

