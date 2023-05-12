package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalSecondaryIndexDescription extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) that uniquely identifies the index.</p>
    */
  var IndexArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Represents the name of the local secondary index.</p>
    */
  var IndexName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The total size of the specified index, in bytes. DynamoDB updates this value
    *             approximately every six hours. Recent changes might not be reflected in this
    *             value.</p>
    */
  var IndexSizeBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The number of items in the specified index. DynamoDB updates this value
    *             approximately every six hours. Recent changes might not be reflected in this
    *             value.</p>
    */
  var ItemCount: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The complete key schema for the local secondary index, consisting of one or more pairs
    *             of attribute names and key types:</p>
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
}
object LocalSecondaryIndexDescription {
  
  inline def apply(): LocalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalSecondaryIndexDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalSecondaryIndexDescription] (val x: Self) extends AnyVal {
    
    inline def setIndexArn(value: String): Self = StObject.set(x, "IndexArn", value.asInstanceOf[js.Any])
    
    inline def setIndexArnUndefined: Self = StObject.set(x, "IndexArn", js.undefined)
    
    inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setIndexSizeBytes(value: Double): Self = StObject.set(x, "IndexSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setIndexSizeBytesUndefined: Self = StObject.set(x, "IndexSizeBytes", js.undefined)
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    inline def setKeySchema(value: js.Array[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
    
    inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
    
    inline def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
  }
}
