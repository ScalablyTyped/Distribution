package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.scalar
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind extends StObject {
  
  val T: ScalarType
  
  val kind: scalar
}
object Kind {
  
  inline def apply(T: ScalarType): Kind = {
    val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], kind = "scalar")
    __obj.asInstanceOf[Kind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
    
    inline def setKind(value: scalar): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setT(value: ScalarType): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
  }
}
