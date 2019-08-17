package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreDeleteRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAttributeValueMod._AttributeValue
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DeleteRequest extends js.Object {
  /**
    * <p>A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.</p>
    */
  var Key: StringDictionary[_AttributeValue] | (Iterable[js.Tuple2[String, _AttributeValue]])
}

object _DeleteRequest {
  @scala.inline
  def apply(Key: StringDictionary[_AttributeValue] | (Iterable[js.Tuple2[String, _AttributeValue]])): _DeleteRequest = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_DeleteRequest]
  }
}

