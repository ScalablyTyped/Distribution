package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationOptions extends js.Object {
  var skip: Double
  var top: Double
}

object PaginationOptions {
  @scala.inline
  def apply(skip: Double, top: Double): PaginationOptions = {
    val __obj = js.Dynamic.literal(skip = skip.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaginationOptions]
  }
}

