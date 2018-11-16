package typings
package azureDashSbLib.libModelsResourceresultMod.AzureNs.ServiceBusNs.ResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceResult extends js.Object {
  def parse(resourceName: java.lang.String, nameProperty: java.lang.String, xml: js.Object): js.Object | js.Array[js.Object] = js.native
  def serialize(resourceName: java.lang.String, resource: js.Object, properties: js.Array[java.lang.String]): java.lang.String = js.native
  def setName(entry: azureDashSbLib.`Anon_`, nameProperty: java.lang.String): scala.Unit = js.native
  def setName(
    entry: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[_],
    nameProperty: java.lang.String
  ): scala.Unit = js.native
}

