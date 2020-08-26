package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassPrivateProperty
import typings.babelTypes.babelTypesStrings.ClassProperty
import typings.babelTypes.babelTypesStrings.ObjectProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.ObjectProperty_
  - typings.babelTypes.mod.ClassProperty_
  - typings.babelTypes.mod.ClassPrivateProperty_
*/
trait Property extends _Node

object Property {
  @scala.inline
  def ObjectProperty_(
    computed: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_,
    shorthand: Boolean,
    `type`: ObjectProperty,
    value: Expression | PatternLike
  ): Property = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  @scala.inline
  def ClassProperty_(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    static: Boolean,
    `type`: ClassProperty
  ): Property = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  @scala.inline
  def ClassPrivateProperty_(key: PrivateName_, `type`: ClassPrivateProperty): Property = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
}

