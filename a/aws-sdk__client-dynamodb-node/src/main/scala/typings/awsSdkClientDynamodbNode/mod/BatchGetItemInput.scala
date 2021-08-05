package typings.awsSdkClientDynamodbNode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.typesKeysAndAttributesMod.KeysAndAttributes
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetItemInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesBatchGetItemInputMod.BatchGetItemInput
object BatchGetItemInput {
  
  inline def apply(
    RequestItems: StringDictionary[KeysAndAttributes] | (Iterable[js.Tuple2[String, KeysAndAttributes]])
  ): BatchGetItemInput = {
    val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetItemInput]
  }
}
