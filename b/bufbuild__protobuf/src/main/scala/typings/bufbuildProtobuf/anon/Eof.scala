package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eof extends StObject {
  
  val eof: `false`
  
  val offset: Double
  
  val size: Double
}
object Eof {
  
  inline def apply(offset: Double, size: Double): Eof = {
    val __obj = js.Dynamic.literal(eof = false, offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eof]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Eof] (val x: Self) extends AnyVal {
    
    inline def setEof(value: `false`): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
