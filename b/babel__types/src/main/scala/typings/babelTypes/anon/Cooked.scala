package typings.babelTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cooked extends StObject {
  
  var cooked: js.UndefOr[String] = js.undefined
  
  var raw: String
}
object Cooked {
  
  inline def apply(raw: String): Cooked = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cooked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cooked] (val x: Self) extends AnyVal {
    
    inline def setCooked(value: String): Self = StObject.set(x, "cooked", value.asInstanceOf[js.Any])
    
    inline def setCookedUndefined: Self = StObject.set(x, "cooked", js.undefined)
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
