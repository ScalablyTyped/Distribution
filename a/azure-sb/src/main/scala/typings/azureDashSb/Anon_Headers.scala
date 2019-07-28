package typings.azureDashSb

import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: Dictionary[String]
}

object Anon_Headers {
  @scala.inline
  def apply(headers: Dictionary[String]): Anon_Headers = {
    val __obj = js.Dynamic.literal(headers = headers)
  
    __obj.asInstanceOf[Anon_Headers]
  }
}

