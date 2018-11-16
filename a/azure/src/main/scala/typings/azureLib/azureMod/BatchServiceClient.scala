package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "BatchServiceClient")
@js.native
class BatchServiceClient protected () extends StorageServiceClient {
  def this(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String, usePathstyleUri: scala.Boolean, authenticationProvider: js.Any) = this()
  var operations: js.Array[_] = js.native
  def addOperation(webResource: WebResource, outputData: js.Any): scala.Unit = js.native
  def beginBatch(): scala.Unit = js.native
  def commitBatch(
    callback: js.Function3[
      /* error */ js.Any, 
      /* operationResponses */ js.Array[_], 
      /* response */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def commitBatch(
    options: js.Any,
    callback: js.Function3[
      /* error */ js.Any, 
      /* operationResponses */ js.Array[_], 
      /* response */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def hasOperations(): scala.Boolean = js.native
  def isInBatch(): scala.Boolean = js.native
  def processOperation(webResource: WebResource, rawResponse: java.lang.String): js.Any = js.native
  def processResponse(responseObject: js.Any, requestOperations: js.Array[_]): js.Array[_] = js.native
  def rollback(): scala.Unit = js.native
}

