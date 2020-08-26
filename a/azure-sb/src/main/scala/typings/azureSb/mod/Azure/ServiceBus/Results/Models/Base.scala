package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import typings.azureSb.anon.Author
import typings.azureSb.mod.Azure.ServiceBus.DateString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var CreatedAt: DateString = js.native
  @JSName("_")
  var _underscore: Author = js.native
}

object Base {
  @scala.inline
  def apply(CreatedAt: DateString, _underscore: Author): Base = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: DateString): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def set_underscore(value: Author): Self = this.set("_", value.asInstanceOf[js.Any])
  }
  
}

