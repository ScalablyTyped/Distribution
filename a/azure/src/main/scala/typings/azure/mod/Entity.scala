package typings.azure.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entity
  extends StObject
     with /* property */ StringDictionary[js.UndefOr[String | Double | Boolean | Date]] {
  
  var PartitionKey: String
  
  var RowKey: String
  
  var Timestamp: js.UndefOr[Date] = js.undefined
  
  var etag: js.UndefOr[String] = js.undefined
}
object Entity {
  
  inline def apply(PartitionKey: String, RowKey: String): Entity = {
    val __obj = js.Dynamic.literal(PartitionKey = PartitionKey.asInstanceOf[js.Any], RowKey = RowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  
  extension [Self <: Entity](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setPartitionKey(value: String): Self = StObject.set(x, "PartitionKey", value.asInstanceOf[js.Any])
    
    inline def setRowKey(value: String): Self = StObject.set(x, "RowKey", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
