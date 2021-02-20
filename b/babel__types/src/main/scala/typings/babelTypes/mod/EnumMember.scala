package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumBooleanMember
import typings.babelTypes.babelTypesStrings.EnumDefaultedMember
import typings.babelTypes.babelTypesStrings.EnumNumberMember
import typings.babelTypes.babelTypesStrings.EnumStringMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.EnumBooleanMember_
  - typings.babelTypes.mod.EnumNumberMember_
  - typings.babelTypes.mod.EnumStringMember_
  - typings.babelTypes.mod.EnumDefaultedMember_
*/
trait EnumMember extends _Node
object EnumMember {
  
  @scala.inline
  def EnumBooleanMember_(id: Identifier_, init: BooleanLiteral_, `type`: EnumBooleanMember): typings.babelTypes.mod.EnumBooleanMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.EnumBooleanMember_]
  }
  
  @scala.inline
  def EnumDefaultedMember_(id: Identifier_, `type`: EnumDefaultedMember): typings.babelTypes.mod.EnumDefaultedMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.EnumDefaultedMember_]
  }
  
  @scala.inline
  def EnumNumberMember_(id: Identifier_, init: NumericLiteral_, `type`: EnumNumberMember): typings.babelTypes.mod.EnumNumberMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.EnumNumberMember_]
  }
  
  @scala.inline
  def EnumStringMember_(id: Identifier_, init: StringLiteral_, `type`: EnumStringMember): typings.babelTypes.mod.EnumStringMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.EnumStringMember_]
  }
}
