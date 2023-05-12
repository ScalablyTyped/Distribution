package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRequest extends StObject {
  
  /**
    * <p>A map of attribute name to attribute values, representing the primary key of an item
    *             to be processed by <code>PutItem</code>. All of the table's primary key attributes must
    *             be specified, and their data types must match those of the table's key schema. If any
    *             attributes are present in the item that are part of an index key schema for the table,
    *             their types must match the index key schema.</p>
    */
  var Item: js.UndefOr[Record[String, AttributeValue]] = js.undefined
}
object PutRequest {
  
  inline def apply(): PutRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRequest] (val x: Self) extends AnyVal {
    
    inline def setItem(value: Record[String, AttributeValue]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
  }
}
