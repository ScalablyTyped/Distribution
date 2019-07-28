package typings.azureDashSb.libModelsResourceresultMod.AzureNs.ServiceBusNs.ResultsNs

import typings.azureDashSb.Anon_
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceResult extends js.Object {
  def parse(resourceName: String, nameProperty: String, xml: js.Object): js.Object | js.Array[js.Object] = js.native
  def serialize(resourceName: String, resource: js.Object, properties: js.Array[String]): String = js.native
  def setName(entry: Anon_, nameProperty: String): Unit = js.native
  def setName(entry: Dictionary[_], nameProperty: String): Unit = js.native
}

