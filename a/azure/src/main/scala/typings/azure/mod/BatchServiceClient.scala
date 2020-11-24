package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "BatchServiceClient")
@js.native
class BatchServiceClient protected () extends StorageServiceClient {
  def this(
    storageAccount: String,
    storageAccessKey: String,
    host: String,
    usePathstyleUri: Boolean,
    authenticationProvider: js.Any
  ) = this()
  
  def addOperation(webResource: WebResource, outputData: js.Any): Unit = js.native
  
  def beginBatch(): Unit = js.native
  
  def commitBatch(
    callback: js.Function3[/* error */ js.Any, /* operationResponses */ js.Array[_], /* response */ js.Any, Unit]
  ): Unit = js.native
  def commitBatch(
    options: js.Any,
    callback: js.Function3[/* error */ js.Any, /* operationResponses */ js.Array[_], /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def hasOperations(): Boolean = js.native
  
  def isInBatch(): Boolean = js.native
  
  var operations: js.Array[_] = js.native
  
  def processOperation(webResource: WebResource, rawResponse: String): js.Any = js.native
  
  def processResponse(responseObject: js.Any, requestOperations: js.Array[_]): js.Array[_] = js.native
  
  def rollback(): Unit = js.native
}
