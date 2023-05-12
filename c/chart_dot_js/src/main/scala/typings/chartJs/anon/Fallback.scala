package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fallback extends StObject {
  
  var _fallback: String
}
object Fallback {
  
  inline def apply(_fallback: String): Fallback = {
    val __obj = js.Dynamic.literal(_fallback = _fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fallback] (val x: Self) extends AnyVal {
    
    inline def set_fallback(value: String): Self = StObject.set(x, "_fallback", value.asInstanceOf[js.Any])
  }
}
