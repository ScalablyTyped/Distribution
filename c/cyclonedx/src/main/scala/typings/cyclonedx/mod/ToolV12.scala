package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolV12 extends StObject {
  
  var hashes: js.UndefOr[js.Array[Hash]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var vendor: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object ToolV12 {
  
  inline def apply(): ToolV12 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolV12]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolV12] (val x: Self) extends AnyVal {
    
    inline def setHashes(value: js.Array[Hash]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    inline def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
    
    inline def setHashesVarargs(value: Hash*): Self = StObject.set(x, "hashes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
