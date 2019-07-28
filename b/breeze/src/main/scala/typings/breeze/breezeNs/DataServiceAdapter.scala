package typings.breeze.breezeNs

import typings.breeze.Anon_DataService
import typings.breeze.Anon_DataServiceResourceName
import typings.breeze.Anon_InterfaceName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.DataServiceAdapter")
@js.native
class DataServiceAdapter () extends js.Object {
  var JsonResultsAdapter: typings.breeze.breezeNs.JsonResultsAdapter = js.native
  def checkForRecomposition(interfaceInitializedArgs: Anon_InterfaceName): Unit = js.native
  def executeQuery(mappingContext: Anon_DataService): js.Promise[_] = js.native
  def fetchMetadata(metadataStore: MetadataStore, dataService: DataService): js.Promise[_] = js.native
  def initialize(): Unit = js.native
  def saveChanges(saveContext: Anon_DataServiceResourceName, saveBundle: js.Object): js.Promise[SaveResult] = js.native
}

