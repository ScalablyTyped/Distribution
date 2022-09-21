package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.EnumBooleanBody_
  - typings.babelTypes.libMod.EnumNumberBody_
  - typings.babelTypes.libMod.EnumStringBody_
  - typings.babelTypes.libMod.EnumSymbolBody_
*/
trait EnumBody extends StObject
object EnumBody {
  
  inline def EnumBooleanBody_(explicitType: Boolean, hasUnknownMembers: Boolean, members: js.Array[EnumBooleanMember_]): typings.babelTypes.libMod.EnumBooleanBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumBooleanBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumBooleanBody_]
  }
  
  inline def EnumNumberBody_(explicitType: Boolean, hasUnknownMembers: Boolean, members: js.Array[EnumNumberMember_]): typings.babelTypes.libMod.EnumNumberBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumNumberBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumNumberBody_]
  }
  
  inline def EnumStringBody_(
    explicitType: Boolean,
    hasUnknownMembers: Boolean,
    members: js.Array[EnumStringMember_ | EnumDefaultedMember_]
  ): typings.babelTypes.libMod.EnumStringBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumStringBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumStringBody_]
  }
  
  inline def EnumSymbolBody_(hasUnknownMembers: Boolean, members: js.Array[EnumDefaultedMember_]): typings.babelTypes.libMod.EnumSymbolBody_ = {
    val __obj = js.Dynamic.literal(hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumSymbolBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumSymbolBody_]
  }
}
