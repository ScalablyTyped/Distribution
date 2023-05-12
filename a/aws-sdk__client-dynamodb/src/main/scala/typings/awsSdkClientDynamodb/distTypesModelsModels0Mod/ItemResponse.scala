package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemResponse extends StObject {
  
  /**
    * <p>Map of attribute data consisting of the data type and attribute value.</p>
    */
  var Item: js.UndefOr[Record[String, AttributeValue]] = js.undefined
}
object ItemResponse {
  
  inline def apply(): ItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemResponse] (val x: Self) extends AnyVal {
    
    inline def setItem(value: Record[String, AttributeValue]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
  }
}
