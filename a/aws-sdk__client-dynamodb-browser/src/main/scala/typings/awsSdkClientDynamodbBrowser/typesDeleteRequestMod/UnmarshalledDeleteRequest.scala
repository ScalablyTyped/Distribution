package typings.awsSdkClientDynamodbBrowser.typesDeleteRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.UnmarshalledAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledDeleteRequest extends DeleteRequest {
  /**
    * <p>A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.</p>
    */
  @JSName("Key")
  var Key_UnmarshalledDeleteRequest: StringDictionary[UnmarshalledAttributeValue] = js.native
}

object UnmarshalledDeleteRequest {
  @scala.inline
  def apply(Key: StringDictionary[UnmarshalledAttributeValue]): UnmarshalledDeleteRequest = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledDeleteRequest]
  }
  @scala.inline
  implicit class UnmarshalledDeleteRequestOps[Self <: UnmarshalledDeleteRequest] (val x: Self) extends AnyVal {
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
    def setKey(value: StringDictionary[UnmarshalledAttributeValue]): Self = this.set("Key", value.asInstanceOf[js.Any])
  }
  
}

