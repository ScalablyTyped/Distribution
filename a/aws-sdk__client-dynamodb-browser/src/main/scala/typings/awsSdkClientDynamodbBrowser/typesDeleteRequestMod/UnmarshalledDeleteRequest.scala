package typings.awsSdkClientDynamodbBrowser.typesDeleteRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.UnmarshalledAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledDeleteRequest extends DeleteRequest {
  /**
    * <p>A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.</p>
    */
  @JSName("Key")
  var Key_UnmarshalledDeleteRequest: StringDictionary[UnmarshalledAttributeValue]
}

object UnmarshalledDeleteRequest {
  @scala.inline
  def apply(Key: StringDictionary[UnmarshalledAttributeValue]): UnmarshalledDeleteRequest = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnmarshalledDeleteRequest]
  }
}

