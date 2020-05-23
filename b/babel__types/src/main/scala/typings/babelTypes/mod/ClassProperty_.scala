package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassProperty
import typings.babelTypes.babelTypesStrings.`private`
import typings.babelTypes.babelTypesStrings.`protected`
import typings.babelTypes.babelTypesStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ClassProperty_
  extends Property
     with BaseNode {
  var `abstract`: Boolean | Null
  var accessibility: public | `private` | `protected` | Null
  var computed: Boolean
  var declare: Boolean | Null
  var decorators: js.Array[Decorator_] | Null
  var definite: Boolean | Null
  var key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression
  var optional: Boolean | Null
  var readonly: Boolean | Null
  var static: Boolean
  var typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null
  @JSName("type")
  var type_ClassProperty_ : ClassProperty
  var value: Expression | Null
}

object ClassProperty_ {
  @scala.inline
  def apply(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    static: Boolean,
    `type`: ClassProperty,
    `abstract`: Boolean = null.asInstanceOf[Boolean],
    accessibility: public | `private` | `protected` = null,
    declare: Boolean = null.asInstanceOf[Boolean],
    decorators: js.Array[Decorator_] = null,
    definite: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: Boolean = null.asInstanceOf[Boolean],
    readonly: Boolean = null.asInstanceOf[Boolean],
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ = null,
    value: Expression = null
  ): ClassProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], accessibility = accessibility.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], definite = definite.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassProperty_]
  }
}

