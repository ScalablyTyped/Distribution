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
  
  extension [Self <: Typeofbuffer](x: Self) {
    
    inline def setBuffer(value: TypeofBuffer_): Self = StObject.set(x, "Buffer", value.asInstanceOf[js.Any])
  }
}
