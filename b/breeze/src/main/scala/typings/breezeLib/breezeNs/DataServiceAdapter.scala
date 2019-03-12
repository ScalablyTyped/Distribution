package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.DataServiceAdapter")
@js.native
class DataServiceAdapter () extends js.Object {
  var JsonResultsAdapter: breezeLib.breezeNs.JsonResultsAdapter = js.native
  def checkForRecomposition(interfaceInitializedArgs: breezeLib.Anon_InterfaceName): scala.Unit = js.native
  def executeQuery(mappingContext: breezeLib.Anon_DataService): js.Promise[_] = js.native
  def fetchMetadata(metadataStore: MetadataStore, dataService: DataService): js.Promise[_] = js.native
  def initialize(): scala.Unit = js.native
  def saveChanges(saveContext: breezeLib.Anon_DataServiceResourceName, saveBundle: js.Object): js.Promise[SaveResult] = js.native
}

