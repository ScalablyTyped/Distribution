package typings.breeze.global.breeze

import typings.breeze.breeze.DataServiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.DataService")
@js.native
class DataService protected ()
  extends StObject
     with typings.breeze.breeze.DataService {
  def this(config: DataServiceOptions) = this()
  
  /* CompleteClass */
  var adapterInstance: typings.breeze.breeze.DataServiceAdapter = js.native
  
  /* CompleteClass */
  var adapterName: String = js.native
  
  /* CompleteClass */
  var hasServerMetadata: Boolean = js.native
  
  /* CompleteClass */
  var jsonResultsAdapter: typings.breeze.breeze.JsonResultsAdapter = js.native
  
  /* CompleteClass */
  var serviceName: String = js.native
  
  /* CompleteClass */
  var uriBuilderName: String = js.native
  
  /* CompleteClass */
  var useJsonp: Boolean = js.native
  
  /* CompleteClass */
  override def `using`(config: DataServiceOptions): typings.breeze.breeze.DataService = js.native
}
