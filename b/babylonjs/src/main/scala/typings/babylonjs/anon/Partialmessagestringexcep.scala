package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  message :string,   exception :any}> */
trait Partialmessagestringexcep extends StObject {
  
  var exception: js.UndefOr[Any] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object Partialmessagestringexcep {
  
  inline def apply(): Partialmessagestringexcep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialmessagestringexcep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialmessagestringexcep] (val x: Self) extends AnyVal {
    
    inline def setException(value: Any): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
