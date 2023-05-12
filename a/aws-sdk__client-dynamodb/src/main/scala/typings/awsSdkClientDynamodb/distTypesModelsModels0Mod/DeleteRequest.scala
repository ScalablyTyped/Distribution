package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRequest extends StObject {
  
  /**
    * <p>A map of attribute name to attribute values, representing the primary key of the item
    *             to delete. All of the table's primary key attributes must be specified, and their data
    *             types must match those of the table's key schema.</p>
    */
  var Key: js.UndefOr[Record[String, AttributeValue]] = js.undefined
}
object DeleteRequest {
  
  inline def apply(): DeleteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRequest] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Record[String, AttributeValue]): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
