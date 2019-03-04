package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ClassProperty
  extends Property
     with BaseNode {
  var `abstract`: scala.Boolean | scala.Null
  var accessibility: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
  var computed: scala.Boolean
  var decorators: js.Array[Decorator] | scala.Null
  var definite: scala.Boolean | scala.Null
  var key: Identifier | StringLiteral | NumericLiteral | Expression
  var optional: scala.Boolean | scala.Null
  var readonly: scala.Boolean | scala.Null
  var static: scala.Boolean | scala.Null
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  @JSName("type")
  var type_ClassProperty: atBabelTypesLib.atBabelTypesLibStrings.ClassProperty
  var value: Expression | scala.Null
}

object ClassProperty {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    key: Identifier | StringLiteral | NumericLiteral | Expression,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ClassProperty,
    `abstract`: js.UndefOr[scala.Boolean] = js.undefined,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` = null,
    decorators: js.Array[Decorator] = null,
    definite: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null,
    static: js.UndefOr[scala.Boolean] = js.undefined,
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

