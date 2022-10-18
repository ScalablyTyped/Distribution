package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.UrlOptions> */
trait PartialUrlOptions extends StObject {
  
  var decode: js.UndefOr[Boolean] = js.undefined
  
  var log: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object PartialUrlOptions {
  
  inline def apply(): PartialUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUrlOptions]
  }
  
  extension [Self <: PartialUrlOptions](x: Self) {
    
    inline def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
    
    inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
