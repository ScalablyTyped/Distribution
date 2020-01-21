package typings.awsSdkClientDynamodbBrowser.typesPutRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRequest extends js.Object {
  /**
    * <p>A map of attribute name to attribute values, representing the primary key of an item to be processed by <code>PutItem</code>. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item which are part of an index key schema for the table, their types must match the index key schema.</p>
    */
  var Item: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])
}

object PutRequest {
  @scala.inline
  def apply(Item: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): PutRequest = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutRequest]
  }
}

