package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreLocalSecondaryIndexMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreKeySchemaElementMod._UnmarshalledKeySchemaElement
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreProjectionMod._UnmarshalledProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledLocalSecondaryIndex extends _LocalSecondaryIndex {
  /**
    * <p>The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
    */
  @JSName("KeySchema")
  var KeySchema__UnmarshalledLocalSecondaryIndex: js.Array[_UnmarshalledKeySchemaElement]
  /**
    * <p>Represents attributes that are copied (projected) from the table into the local secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
    */
  @JSName("Projection")
  var Projection__UnmarshalledLocalSecondaryIndex: _UnmarshalledProjection
}

object _UnmarshalledLocalSecondaryIndex {
  @scala.inline
  def apply(
    IndexName: String,
    KeySchema: js.Array[_UnmarshalledKeySchemaElement],
    Projection: _UnmarshalledProjection
  ): _UnmarshalledLocalSecondaryIndex = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_UnmarshalledLocalSecondaryIndex]
  }
}

