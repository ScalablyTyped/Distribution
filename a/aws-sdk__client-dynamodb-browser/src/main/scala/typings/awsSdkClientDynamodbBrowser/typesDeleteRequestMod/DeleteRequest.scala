package typings.awsSdkClientDynamodbBrowser.typesDeleteRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRequest extends js.Object {
  /**
    * <p>A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.</p>
    */
  var Key: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])
}

object DeleteRequest {
  @scala.inline
  def apply(Key: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): DeleteRequest = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRequest]
  }
}

