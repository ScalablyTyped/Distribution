package typings.awsSdkClientDynamodbBrowser.typesPutRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.UnmarshalledAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledPutRequest extends PutRequest {
  
  /**
    * <p>A map of attribute name to attribute values, representing the primary key of an item to be processed by <code>PutItem</code>. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item which are part of an index key schema for the table, their types must match the index key schema.</p>
    */
  @JSName("Item")
  var Item_UnmarshalledPutRequest: StringDictionary[UnmarshalledAttributeValue] = js.native
}
object UnmarshalledPutRequest {
  
  @scala.inline
  def apply(Item: StringDictionary[UnmarshalledAttributeValue]): UnmarshalledPutRequest = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledPutRequest]
  }
  
  @scala.inline
  implicit class UnmarshalledPutRequestOps[Self <: UnmarshalledPutRequest] (val x: Self) extends AnyVal {
    
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
    def setItem(value: StringDictionary[UnmarshalledAttributeValue]): Self = this.set("Item", value.asInstanceOf[js.Any])
  }
}
