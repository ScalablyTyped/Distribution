package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.EnumBooleanBody_
  - typings.babelTypes.mod.EnumNumberBody_
  - typings.babelTypes.mod.EnumStringBody_
  - typings.babelTypes.mod.EnumSymbolBody_
*/
trait EnumBody
  extends StObject
     with _Node
object EnumBody {
  
  @scala.inline
  def EnumBooleanBody_(explicit: Boolean, members: js.Array[EnumBooleanMember_]): typings.babelTypes.mod.EnumBooleanBody_ = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumBooleanBody")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumBooleanBody_]
  }
  
  @scala.inline
  def EnumNumberBody_(explicit: Boolean, members: js.Array[EnumNumberMember_]): typings.babelTypes.mod.EnumNumberBody_ = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumNumberBody")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumNumberBody_]
  }
  
  @scala.inline
  def EnumStringBody_(explicit: Boolean, members: js.Array[EnumStringMember_ | EnumDefaultedMember_]): typings.babelTypes.mod.EnumStringBody_ = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumStringBody")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumStringBody_]
  }
  
  @scala.inline
  def EnumSymbolBody_(members: js.Array[EnumDefaultedMember_]): typings.babelTypes.mod.EnumSymbolBody_ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumSymbolBody")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumSymbolBody_]
  }
}
