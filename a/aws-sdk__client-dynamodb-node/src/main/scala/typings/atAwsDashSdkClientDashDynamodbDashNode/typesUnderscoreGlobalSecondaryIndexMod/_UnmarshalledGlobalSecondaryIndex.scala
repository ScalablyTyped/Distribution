package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreGlobalSecondaryIndexMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreKeySchemaElementMod._UnmarshalledKeySchemaElement
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreProjectionMod._UnmarshalledProjection
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreProvisionedThroughputMod._UnmarshalledProvisionedThroughput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledGlobalSecondaryIndex extends _GlobalSecondaryIndex {
  /**
    * <p>The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
    */
  @JSName("KeySchema")
  var KeySchema__UnmarshalledGlobalSecondaryIndex: js.Array[_UnmarshalledKeySchemaElement]
  /**
    * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
    */
  @JSName("Projection")
  var Projection__UnmarshalledGlobalSecondaryIndex: _UnmarshalledProjection
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("ProvisionedThroughput")
  var ProvisionedThroughput__UnmarshalledGlobalSecondaryIndex: _UnmarshalledProvisionedThroughput
}

object _UnmarshalledGlobalSecondaryIndex {
  @scala.inline
  def apply(
    IndexName: String,
    KeySchema: js.Array[_UnmarshalledKeySchemaElement],
    Projection: _UnmarshalledProjection,
    ProvisionedThroughput: _UnmarshalledProvisionedThroughput
  ): _UnmarshalledGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_UnmarshalledGlobalSecondaryIndex]
  }
}

