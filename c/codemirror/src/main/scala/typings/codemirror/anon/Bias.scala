package typings.codemirror.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bias extends StObject {
  
  var bias: js.UndefOr[Double] = js.undefined
  
  var origin: js.UndefOr[String] = js.undefined
  
  var scroll: js.UndefOr[Boolean] = js.undefined
}
object Bias {
  
  inline def apply(): Bias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bias]
  }
  
  extension [Self <: Bias](x: Self) {
    
    inline def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
  }
}
