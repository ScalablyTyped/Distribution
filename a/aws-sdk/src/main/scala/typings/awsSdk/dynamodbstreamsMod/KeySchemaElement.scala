package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeySchemaElement extends js.Object {
  /**
    * The name of a key attribute.
    */
  var AttributeName: KeySchemaAttributeName = js.native
  /**
    * The attribute data, consisting of the data type and the attribute value itself.
    */
  var KeyType: typings.awsSdk.dynamodbstreamsMod.KeyType = js.native
}

object KeySchemaElement {
  @scala.inline
  def apply(AttributeName: KeySchemaAttributeName, KeyType: KeyType): KeySchemaElement = {
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributeName(value: KeySchemaAttributeName): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyType(value: KeyType): Self = this.set("KeyType", value.asInstanceOf[js.Any])
  }
  
}

