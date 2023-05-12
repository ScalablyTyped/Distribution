package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Oneof extends StObject {
  
  val oneof: Unit
  
  val opt: `false`
  
  val packed: `false`
  
  val repeated: `false`
}
object Oneof {
  
  inline def apply(oneof: Unit): Oneof = {
    val __obj = js.Dynamic.literal(oneof = oneof.asInstanceOf[js.Any], opt = false, packed = false, repeated = false)
    __obj.asInstanceOf[Oneof]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Oneof] (val x: Self) extends AnyVal {
    
    inline def setOneof(value: Unit): Self = StObject.set(x, "oneof", value.asInstanceOf[js.Any])
    
    inline def setOpt(value: `false`): Self = StObject.set(x, "opt", value.asInstanceOf[js.Any])
    
    inline def setPacked(value: `false`): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    inline def setRepeated(value: `false`): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
  }
}
