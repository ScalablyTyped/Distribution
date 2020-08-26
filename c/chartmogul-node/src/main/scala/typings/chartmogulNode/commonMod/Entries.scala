package typings.chartmogulNode.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entries[T] extends Cursor {
  var entries: js.Array[T] = js.native
}

object Entries {
  @scala.inline
  def apply[T](entries: js.Array[T]): Entries[T] = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries[T]]
  }
  @scala.inline
  implicit class EntriesOps[Self <: Entries[_], T] (val x: Self with Entries[T]) extends AnyVal {
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
    def setEntriesVarargs(value: T*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[T]): Self = this.set("entries", value.asInstanceOf[js.Any])
  }
  
}

