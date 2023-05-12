package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesBinaryEncodingMod.WireType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.typedarray.Uint8Array
  
  var no: Double
  
  var wireType: WireType
}
object Data {
  
  inline def apply(data: js.typedarray.Uint8Array, no: Double, wireType: WireType): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], no = no.asInstanceOf[js.Any], wireType = wireType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setNo(value: Double): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
    
    inline def setWireType(value: WireType): Self = StObject.set(x, "wireType", value.asInstanceOf[js.Any])
  }
}
