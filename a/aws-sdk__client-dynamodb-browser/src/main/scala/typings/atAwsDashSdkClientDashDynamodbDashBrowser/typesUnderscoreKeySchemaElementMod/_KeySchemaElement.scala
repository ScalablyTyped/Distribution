package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreKeySchemaElementMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.HASH
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.RANGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _KeySchemaElement extends js.Object {
  /**
    * <p>The name of a key attribute.</p>
    */
  var AttributeName: String
  /**
    * <p>The role that this key attribute will assume:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
    */
  var KeyType: HASH | RANGE | String
}

object _KeySchemaElement {
  @scala.inline
  def apply(AttributeName: String, KeyType: HASH | RANGE | String): _KeySchemaElement = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName, KeyType = KeyType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_KeySchemaElement]
  }
}

