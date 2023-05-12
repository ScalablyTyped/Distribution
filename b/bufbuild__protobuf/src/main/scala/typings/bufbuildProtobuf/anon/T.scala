package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.`enum`
import typings.bufbuildProtobuf.distTypesEnumMod.EnumType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait T extends StObject {
  
  val T: EnumType
  
  val kind: `enum`
}
object T {
  
  inline def apply(T: EnumType): T = {
    val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], kind = "enum")
    __obj.asInstanceOf[T]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: T] (val x: Self) extends AnyVal {
    
    inline def setKind(value: `enum`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setT(value: EnumType): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
  }
}
