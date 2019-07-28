package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.`private`
import typings.atBabelTypes.atBabelTypesStrings.`protected`
import typings.atBabelTypes.atBabelTypesStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ClassProperty
  extends Property
     with BaseNode {
  var `abstract`: Boolean | Null
  var accessibility: public | `private` | `protected` | Null
  var computed: Boolean
  var decorators: js.Array[Decorator] | Null
  var definite: Boolean | Null
  var key: Identifier | StringLiteral | NumericLiteral | Expression
  var optional: Boolean | Null
  var readonly: Boolean | Null
  var static: Boolean | Null
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | Null
  @JSName("type")
  var type_ClassProperty: typings.atBabelTypes.atBabelTypesStrings.ClassProperty
  var value: Expression | Null
}

object ClassProperty {
  @scala.inline
  def apply(
    computed: Boolean,
    key: Identifier | StringLiteral | NumericLiteral | Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ClassProperty,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    accessibility: public | `private` | `protected` = null,
    decorators: js.Array[Decorator] = null,
    definite: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null,
    static: js.UndefOr[Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop = null,
    value: Expression = null
  ): ClassProperty = {
    val __obj = js.Dynamic.literal(computed = computed, key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (!js.isUndefined(definite)) __obj.updateDynamic("definite")(definite)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ClassProperty]
  }
}

