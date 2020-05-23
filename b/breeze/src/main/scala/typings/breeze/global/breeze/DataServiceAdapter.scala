package typings.breeze.global.breeze

import typings.breeze.anon.InterfaceName
import typings.breeze.anon.ResourceName
import typings.breeze.breeze.SaveResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.DataServiceAdapter")
@js.native
class DataServiceAdapter ()
  extends typings.breeze.breeze.DataServiceAdapter {
  /* CompleteClass */
  override var JsonResultsAdapter: typings.breeze.breeze.JsonResultsAdapter = js.native
  /* CompleteClass */
  override def checkForRecomposition(interfaceInitializedArgs: InterfaceName): Unit = js.native
  /* CompleteClass */
  override def executeQuery(mappingContext: typings.breeze.anon.DataService): js.Promise[_] = js.native
  /* CompleteClass */
  override def fetchMetadata(metadataStore: typings.breeze.breeze.MetadataStore, dataService: typings.breeze.breeze.DataService): js.Promise[_] = js.native
  /* CompleteClass */
  override def initialize(): Unit = js.native
  /* CompleteClass */
  override def saveChanges(saveContext: ResourceName, saveBundle: js.Object): js.Promise[SaveResult] = js.native
}

