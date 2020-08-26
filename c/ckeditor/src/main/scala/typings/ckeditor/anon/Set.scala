package typings.ckeditor.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set extends js.Object {
  var removed: js.Array[String] = js.native
  var set: StringDictionary[String] = js.native
}

object Set {
  @scala.inline
  def apply(removed: js.Array[String], set: StringDictionary[String]): Set = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Set]
  }
  @scala.inline
  implicit class SetOps[Self <: Set] (val x: Self) extends AnyVal {
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
    def setRemovedVarargs(value: String*): Self = this.set("removed", js.Array(value :_*))
    @scala.inline
    def setRemoved(value: js.Array[String]): Self = this.set("removed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: StringDictionary[String]): Self = this.set("set", value.asInstanceOf[js.Any])
  }
  
}

