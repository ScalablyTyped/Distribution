package typings.breeze.breeze

import typings.breeze.AnonDataService
import typings.breeze.AnonDataServiceResourceName
import typings.breeze.AnonInterfaceName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.DataServiceAdapter")
@js.native
class DataServiceAdapter () extends js.Object {
  var JsonResultsAdapter: typings.breeze.breeze.JsonResultsAdapter = js.native
  def checkForRecomposition(interfaceInitializedArgs: AnonInterfaceName): Unit = js.native
  def executeQuery(mappingContext: AnonDataService): js.Promise[_] = js.native
  def fetchMetadata(metadataStore: MetadataStore, dataService: DataService): js.Promise[_] = js.native
  def initialize(): Unit = js.native
  def saveChanges(saveContext: AnonDataServiceResourceName, saveBundle: js.Object): js.Promise[SaveResult] = js.native
}

