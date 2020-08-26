package typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.HASH
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.RANGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeySchemaElement extends js.Object {
  /**
    * <p>The name of a key attribute.</p>
    */
  var AttributeName: String = js.native
  /**
    * <p>The role that this key attribute will assume:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
    */
  var KeyType: HASH | RANGE | String = js.native
}

object KeySchemaElement {
  @scala.inline
  def apply(AttributeName: String, KeyType: HASH | RANGE | String): KeySchemaElement = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], KeyType = KeyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySchemaElement]
  }
  @scala.inline
  implicit class KeySchemaElementOps[Self <: KeySchemaElement] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: String): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyType(value: HASH | RANGE | String): Self = this.set("KeyType", value.asInstanceOf[js.Any])
  }
  
}

