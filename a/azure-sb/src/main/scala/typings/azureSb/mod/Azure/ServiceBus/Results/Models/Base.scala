package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import typings.azureSb.AnonAuthor
import typings.azureSb.mod.Azure.ServiceBus.DateString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var CreatedAt: DateString
  @JSName("_")
  var _underscore: AnonAuthor
}

object Base {
  @scala.inline
  def apply(CreatedAt: DateString, _underscore: AnonAuthor): Base = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

