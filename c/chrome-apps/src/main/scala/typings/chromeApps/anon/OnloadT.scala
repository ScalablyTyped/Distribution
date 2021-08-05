package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnloadT extends StObject {
  
  var onloadT: integer
  
  var pageT: integer
  
  var startE: integer
  
  var tran: integer
}
object OnloadT {
  
  inline def apply(onloadT: integer, pageT: integer, startE: integer, tran: integer): OnloadT = {
    val __obj = js.Dynamic.literal(onloadT = onloadT.asInstanceOf[js.Any], pageT = pageT.asInstanceOf[js.Any], startE = startE.asInstanceOf[js.Any], tran = tran.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnloadT]
  }
  
  extension [Self <: OnloadT](x: Self) {
    
    inline def setOnloadT(value: integer): Self = StObject.set(x, "onloadT", value.asInstanceOf[js.Any])
    
    inline def setPageT(value: integer): Self = StObject.set(x, "pageT", value.asInstanceOf[js.Any])
    
    inline def setStartE(value: integer): Self = StObject.set(x, "startE", value.asInstanceOf[js.Any])
    
    inline def setTran(value: integer): Self = StObject.set(x, "tran", value.asInstanceOf[js.Any])
  }
}
