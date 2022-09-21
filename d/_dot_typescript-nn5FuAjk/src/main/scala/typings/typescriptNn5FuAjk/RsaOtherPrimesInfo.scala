package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaOtherPrimesInfo extends StObject {
  
  var d: js.UndefOr[java.lang.String] = js.undefined
  
  var r: js.UndefOr[java.lang.String] = js.undefined
  
  var t: js.UndefOr[java.lang.String] = js.undefined
}
object RsaOtherPrimesInfo {
  
  inline def apply(): RsaOtherPrimesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RsaOtherPrimesInfo]
  }
  
  extension [Self <: RsaOtherPrimesInfo](x: Self) {
    
    inline def setD(value: java.lang.String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setR(value: java.lang.String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    inline def setT(value: java.lang.String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
  }
}
