package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.EnumBooleanMember_
  - typings.babelTypes.libMod.EnumNumberMember_
  - typings.babelTypes.libMod.EnumStringMember_
  - typings.babelTypes.libMod.EnumDefaultedMember_
*/
trait EnumMember extends StObject
object EnumMember {
  
  inline def EnumBooleanMember_(id: Identifier_, init: BooleanLiteral_): typings.babelTypes.libMod.EnumBooleanMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumBooleanMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumBooleanMember_]
  }
  
  inline def EnumDefaultedMember_(id: Identifier_): typings.babelTypes.libMod.EnumDefaultedMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumDefaultedMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumDefaultedMember_]
  }
  
  inline def EnumNumberMember_(id: Identifier_, init: NumericLiteral_): typings.babelTypes.libMod.EnumNumberMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumNumberMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumNumberMember_]
  }
  
  inline def EnumStringMember_(id: Identifier_, init: StringLiteral_): typings.babelTypes.libMod.EnumStringMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumStringMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumStringMember_]
  }
}
