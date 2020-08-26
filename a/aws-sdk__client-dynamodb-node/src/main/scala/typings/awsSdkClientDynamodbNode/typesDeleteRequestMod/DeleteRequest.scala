package typings.awsSdkClientDynamodbNode.typesDeleteRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.AttributeValue
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRequest extends js.Object {
  /**
    * <p>A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.</p>
    */
  var Key: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]]) = js.native
}

object DeleteRequest {
  @scala.inline
  def apply(Key: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): DeleteRequest = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRequest]
  }
  @scala.inline
  implicit class DeleteRequestOps[Self <: DeleteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): Self = this.set("Key", value.asInstanceOf[js.Any])
  }
  
}

