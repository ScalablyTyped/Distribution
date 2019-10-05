package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models

import typings.azureDashSb.Anon_Author
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.DateString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var CreatedAt: DateString
  var `_`: Anon_Author
}

object Base {
  @scala.inline
  def apply(CreatedAt: DateString, `_`: Anon_Author): Base = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt)
    __obj.updateDynamic("_")(`_`)
    __obj.asInstanceOf[Base]
  }
}

