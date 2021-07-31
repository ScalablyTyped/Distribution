package typings.awsSdkClientDynamodbNode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.typesWriteRequestMod.WriteRequest
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchWriteItemInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesBatchWriteItemInputMod.BatchWriteItemInput
object BatchWriteItemInput {
  
  @scala.inline
  def apply(
    RequestItems: (StringDictionary[js.Array[WriteRequest] | Iterable[WriteRequest]]) | (Iterable[js.Tuple2[String, js.Array[WriteRequest] | Iterable[WriteRequest]]])
  ): BatchWriteItemInput = {
    val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchWriteItemInput]
  }
}
