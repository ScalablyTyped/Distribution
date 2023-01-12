package typings.browserfs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofbuffer extends StObject {
  
  var Buffer: TypeofBuffer_
}
object Typeofbuffer {
  
  inline def apply(Buffer: TypeofBuffer_): Typeofbuffer = {
    val __obj = js.Dynamic.literal(Buffer = Buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofbuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofbuffer] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: TypeofBuffer_): Self = StObject.set(x, "Buffer", value.asInstanceOf[js.Any])
  }
}
