package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguagePaginateSettings extends js.Object {
  var first: String = js.native
  var last: String = js.native
  var next: String = js.native
  var previous: String = js.native
}

object LanguagePaginateSettings {
  @scala.inline
  def apply(first: String, last: String, next: String, previous: String): LanguagePaginateSettings = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguagePaginateSettings]
  }
  @scala.inline
  implicit class LanguagePaginateSettingsOps[Self <: LanguagePaginateSettings] (val x: Self) extends AnyVal {
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
    def setFirst(value: String): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast(value: String): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevious(value: String): Self = this.set("previous", value.asInstanceOf[js.Any])
  }
  
}

