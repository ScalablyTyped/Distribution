package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumBooleanBody
import typings.babelTypes.babelTypesStrings.EnumNumberBody
import typings.babelTypes.babelTypesStrings.EnumStringBody
import typings.babelTypes.babelTypesStrings.EnumSymbolBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.EnumBooleanBody_
  - typings.babelTypes.mod.EnumNumberBody_
  - typings.babelTypes.mod.EnumStringBody_
  - typings.babelTypes.mod.EnumSymbolBody_
*/
trait EnumBody extends _Node

object EnumBody {
  @scala.inline
  def EnumBooleanBody_(explicit: Boolean, members: js.Array[EnumBooleanMember_], `type`: EnumBooleanBody): EnumBody = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumBody]
  }
  @scala.inline
  def EnumNumberBody_(explicit: Boolean, members: js.Array[EnumNumberMember_], `type`: EnumNumberBody): EnumBody = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumBody]
  }
  @scala.inline
  def EnumStringBody_(
    explicit: Boolean,
    members: js.Array[EnumStringMember_ | EnumDefaultedMember_],
    `type`: EnumStringBody
  ): EnumBody = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumBody]
  }
  @scala.inline
  def EnumSymbolBody_(members: js.Array[EnumDefaultedMember_], `type`: EnumSymbolBody): EnumBody = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumBody]
  }
}

