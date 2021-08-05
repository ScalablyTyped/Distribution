package typings.awsSdkClientDynamodbBrowser.mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutItemInput
  extends StObject
     with typings.awsSdkClientDynamodbBrowser.typesPutItemInputMod.PutItemInput
object PutItemInput {
  
  inline def apply(
    Item: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]]),
    TableName: String
  ): PutItemInput = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutItemInput]
  }
}
