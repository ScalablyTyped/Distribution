package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.EnumBooleanMember_
  - typings.babelTypes.mod.EnumNumberMember_
  - typings.babelTypes.mod.EnumStringMember_
  - typings.babelTypes.mod.EnumDefaultedMember_
*/
trait EnumMember
  extends StObject
     with _Node
object EnumMember {
  
  @scala.inline
  def EnumBooleanMember_(id: Identifier_, init: BooleanLiteral_): typings.babelTypes.mod.EnumBooleanMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumBooleanMember")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumBooleanMember_]
  }
  
  @scala.inline
  def EnumDefaultedMember_(id: Identifier_): typings.babelTypes.mod.EnumDefaultedMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumDefaultedMember")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumDefaultedMember_]
  }
  
  @scala.inline
  def EnumNumberMember_(id: Identifier_, init: NumericLiteral_): typings.babelTypes.mod.EnumNumberMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumNumberMember")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumNumberMember_]
  }
  
  @scala.inline
  def EnumStringMember_(id: Identifier_, init: StringLiteral_): typings.babelTypes.mod.EnumStringMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumStringMember")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumStringMember_]
  }
}
