package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQ extends StObject {
  
  var alpha: Fixup
}
object IQ {
  
  inline def apply(alpha: Fixup): IQ = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQ]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IQ] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Fixup): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
  }
}
