package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  val eof: `true`
  
  val offset: Null
  
  val size: Null
}
object Offset {
  
  inline def apply(offset: Null, size: Null): Offset = {
    val __obj = js.Dynamic.literal(eof = true, offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
    
    inline def setEof(value: `true`): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Null): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Null): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
