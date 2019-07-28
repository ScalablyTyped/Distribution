package typings.azureDashSb.libWnsserviceMod

import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var headers: Dictionary[String]
}

object Options {
  @scala.inline
  def apply(headers: Dictionary[String]): Options = {
    val __obj = js.Dynamic.literal(headers = headers)
  
    __obj.asInstanceOf[Options]
  }
}

