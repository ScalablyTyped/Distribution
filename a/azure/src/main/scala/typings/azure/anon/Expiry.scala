package typings.azure.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expiry extends StObject {
  
  var Expiry: Date
  
  var Permission: js.UndefOr[String] = js.undefined
  
  var Start: js.UndefOr[Date] = js.undefined
}
object Expiry {
  
  inline def apply(Expiry: Date): Expiry = {
    val __obj = js.Dynamic.literal(Expiry = Expiry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expiry]
  }
  
  extension [Self <: Expiry](x: Self) {
    
    inline def setExpiry(value: Date): Self = StObject.set(x, "Expiry", value.asInstanceOf[js.Any])
    
    inline def setPermission(value: String): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
    
    inline def setStart(value: Date): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
  }
}
