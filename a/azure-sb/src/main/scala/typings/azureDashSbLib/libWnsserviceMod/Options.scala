package typings
package azureDashSbLib.libWnsserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var headers: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[java.lang.String]
}

object Options {
  @scala.inline
  def apply(headers: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[java.lang.String]): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Options]
  }
}

