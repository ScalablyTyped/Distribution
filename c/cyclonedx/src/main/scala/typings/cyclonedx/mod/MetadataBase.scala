package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataBase[T, C] extends StObject {
  
  var authors: js.UndefOr[js.Array[ContactPerson]] = js.undefined
  
  var component: js.UndefOr[C] = js.undefined
  
  var manufacture: js.UndefOr[Contact] = js.undefined
  
  var supplier: js.UndefOr[Contact] = js.undefined
  
  var timestamp: js.UndefOr[Timestamp] = js.undefined
  
  var tools: js.UndefOr[js.Array[T]] = js.undefined
}
object MetadataBase {
  
  inline def apply[T, C](): MetadataBase[T, C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataBase[T, C]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataBase[?, ?], T, C] (val x: Self & (MetadataBase[T, C])) extends AnyVal {
    
    inline def setAuthors(value: js.Array[ContactPerson]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    inline def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
    
    inline def setAuthorsVarargs(value: ContactPerson*): Self = StObject.set(x, "authors", js.Array(value*))
    
    inline def setComponent(value: C): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setManufacture(value: Contact): Self = StObject.set(x, "manufacture", value.asInstanceOf[js.Any])
    
    inline def setManufactureUndefined: Self = StObject.set(x, "manufacture", js.undefined)
    
    inline def setSupplier(value: Contact): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    inline def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTools(value: js.Array[T]): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    inline def setToolsVarargs(value: T*): Self = StObject.set(x, "tools", js.Array(value*))
  }
}
