package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumBooleanMember
import typings.babelTypes.babelTypesStrings.EnumDefaultedMember
import typings.babelTypes.babelTypesStrings.EnumNumberMember
import typings.babelTypes.babelTypesStrings.EnumStringMember
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
  def EnumBooleanMember_(id: Identifier_, init: BooleanLiteral_, `type`: EnumBooleanMember): EnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumMember]
  }
  
  @scala.inline
  def EnumNumberMember_(id: Identifier_, init: NumericLiteral_, `type`: EnumNumberMember): EnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumMember]
  }
  
  @scala.inline
  def EnumStringMember_(id: Identifier_, init: StringLiteral_, `type`: EnumStringMember): EnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumMember]
  }
  
  @scala.inline
  def EnumDefaultedMember_(id: Identifier_, `type`: EnumDefaultedMember): EnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumMember]
  }
}
