package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreDeleteRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAttributeValueMod._UnmarshalledAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledDeleteRequest extends _DeleteRequest {
  /**
    * <p>A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.</p>
    */
  @JSName("Key")
  var Key__UnmarshalledDeleteRequest: StringDictionary[_UnmarshalledAttributeValue]
}

object _UnmarshalledDeleteRequest {
  @scala.inline
  def apply(Key: StringDictionary[_UnmarshalledAttributeValue]): _UnmarshalledDeleteRequest = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_UnmarshalledDeleteRequest]
  }
}

