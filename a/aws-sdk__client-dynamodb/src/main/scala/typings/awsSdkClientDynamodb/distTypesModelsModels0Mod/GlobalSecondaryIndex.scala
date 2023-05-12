package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalSecondaryIndex extends StObject {
  
  /**
    * <p>The name of the global secondary index. The name must be unique among all other
    *             indexes on this table.</p>
    */
  var IndexName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The complete key schema for a global secondary index, which consists of one or more
    *             pairs of attribute names and key types:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>HASH</code> - partition key</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>RANGE</code> - sort key</p>
    *             </li>
    *          </ul>
    *          <note>
    *             <p>The partition key of an item is also known as its <i>hash
    *                     attribute</i>. The term "hash attribute" derives from DynamoDB's usage of
    *                 an internal hash function to evenly distribute data items across partitions, based
    *                 on their partition key values.</p>
    *             <p>The sort key of an item is also known as its <i>range attribute</i>.
    *                 The term "range attribute" derives from the way DynamoDB stores items with the same
    *                 partition key physically close together, in sorted order by the sort key
    *                 value.</p>
    *          </note>
    */
  var KeySchema: js.UndefOr[js.Array[KeySchemaElement]] = js.undefined
  
  /**
    * <p>Represents attributes that are copied (projected) from the table into the global
    *             secondary index. These are in addition to the primary key attributes and index key
    *             attributes, which are automatically projected. </p>
    */
  var Projection: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.Projection] = js.undefined
  
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary
    *             index.</p>
    *          <p>For current minimum and maximum provisioned throughput values, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Service,
    *                 Account, and Table Quotas</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ProvisionedThroughput] = js.undefined
}
object GlobalSecondaryIndex {
  
  inline def apply(): GlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalSecondaryIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalSecondaryIndex] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setKeySchema(value: js.Array[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
    
    inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
    
    inline def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
    
    inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
  }
}
