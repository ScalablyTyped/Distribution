package typings.bufbuildProtobuf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/enum.EnumValueInfo, 'localName'> */
trait OmitEnumValueInfolocalNam extends StObject {
  
  var name: String
  
  var no: Double
}
object OmitEnumValueInfolocalNam {
  
  inline def apply(name: String, no: Double): OmitEnumValueInfolocalNam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], no = no.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitEnumValueInfolocalNam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitEnumValueInfolocalNam] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNo(value: Double): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
  }
}
