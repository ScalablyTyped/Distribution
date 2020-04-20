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
}

