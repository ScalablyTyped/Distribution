package typings.awsSdkClientDynamodbNode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.AttributeValue
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteItemInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesDeleteItemInputMod.DeleteItemInput
object DeleteItemInput {
  
  @scala.inline
  def apply(
    Key: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]]),
    TableName: String
  ): DeleteItemInput = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteItemInput]
  }
}
