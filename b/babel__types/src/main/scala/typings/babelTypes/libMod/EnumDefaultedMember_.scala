package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.EnumDefaultedMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumDefaultedMember_
  extends StObject
     with BaseNode
     with EnumMember
     with Flow
     with Node {
  
  var id: Identifier_
  
  @JSName("type")
  var type_EnumDefaultedMember_ : EnumDefaultedMember
}
object EnumDefaultedMember_ {
  
  inline def apply(id: Identifier_): EnumDefaultedMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumDefaultedMember")
    __obj.asInstanceOf[EnumDefaultedMember_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumDefaultedMember_] (val x: Self) extends AnyVal {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: EnumDefaultedMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
