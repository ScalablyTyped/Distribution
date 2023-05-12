package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CHJ extends StObject {
  
  var alpha: Fixup
  
  var h: `18`
}
object CHJ {
  
  inline def apply(alpha: Fixup, h: `18`): CHJ = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHJ]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CHJ] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Fixup): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setH(value: `18`): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
  }
}
