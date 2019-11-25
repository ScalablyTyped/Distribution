package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscorePutRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAttributeValueMod._UnmarshalledAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledPutRequest extends _PutRequest {
  /**
    * <p>A map of attribute name to attribute values, representing the primary key of an item to be processed by <code>PutItem</code>. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item which are part of an index key schema for the table, their types must match the index key schema.</p>
    */
  @JSName("Item")
  var Item__UnmarshalledPutRequest: StringDictionary[_UnmarshalledAttributeValue]
}

object _UnmarshalledPutRequest {
  @scala.inline
  def apply(Item: StringDictionary[_UnmarshalledAttributeValue]): _UnmarshalledPutRequest = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_UnmarshalledPutRequest]
  }
}

