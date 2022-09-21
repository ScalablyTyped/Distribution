package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Use branding: string instead to set the application key in help URLs
  */
trait Branding extends StObject {
  
  var application: js.UndefOr[String] = js.undefined
  
  var brand: js.UndefOr[String] = js.undefined
}
object Branding {
  
  inline def apply(): Branding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Branding]
  }
  
  extension [Self <: Branding](x: Self) {
    
    inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
  }
}
