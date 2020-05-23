package typings.breeze.mod

import typings.breeze.breeze.DataServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "DataService")
@js.native
class DataService protected ()
  extends typings.breeze.breeze.DataService {
  def this(config: DataServiceOptions) = this()
  /* CompleteClass */
  override var adapterInstance: typings.breeze.breeze.DataServiceAdapter = js.native
  /* CompleteClass */
  override var adapterName: String = js.native
  /* CompleteClass */
  override var hasServerMetadata: Boolean = js.native
  /* CompleteClass */
  override var jsonResultsAdapter: typings.breeze.breeze.JsonResultsAdapter = js.native
  /* CompleteClass */
  override var serviceName: String = js.native
  /* CompleteClass */
  override var uriBuilderName: String = js.native
  /* CompleteClass */
  override var useJsonp: Boolean = js.native
  /* CompleteClass */
  override def using(config: DataServiceOptions): typings.breeze.breeze.DataService = js.native
}

