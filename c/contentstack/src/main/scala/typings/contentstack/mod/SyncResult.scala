package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncResult extends StObject {
  
  var items: js.Array[Any]
  
  var limit: Double
  
  var pagination_token: js.UndefOr[String] = js.undefined
  
  var skip: Double
  
  var sync_token: js.UndefOr[String] = js.undefined
  
  var total_count: Double
}
object SyncResult {
  
  inline def apply(items: js.Array[Any], limit: Double, skip: Double, total_count: Double): SyncResult = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncResult] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setPagination_token(value: String): Self = StObject.set(x, "pagination_token", value.asInstanceOf[js.Any])
    
    inline def setPagination_tokenUndefined: Self = StObject.set(x, "pagination_token", js.undefined)
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSync_token(value: String): Self = StObject.set(x, "sync_token", value.asInstanceOf[js.Any])
    
    inline def setSync_tokenUndefined: Self = StObject.set(x, "sync_token", js.undefined)
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
