package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Packed extends StObject {
  
  val oneof: Unit
  
  val opt: `false`
  
  val packed: Boolean
  
  val repeated: Boolean
}
object Packed {
  
  inline def apply(oneof: Unit, packed: Boolean, repeated: Boolean): Packed = {
    val __obj = js.Dynamic.literal(oneof = oneof.asInstanceOf[js.Any], opt = false, packed = packed.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Packed] (val x: Self) extends AnyVal {
    
    inline def setOneof(value: Unit): Self = StObject.set(x, "oneof", value.asInstanceOf[js.Any])
    
    inline def setOpt(value: `false`): Self = StObject.set(x, "opt", value.asInstanceOf[js.Any])
    
    inline def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
  }
}
