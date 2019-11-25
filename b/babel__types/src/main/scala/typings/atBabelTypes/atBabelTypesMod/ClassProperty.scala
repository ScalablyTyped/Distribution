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
  var declare: Boolean | Null
  var decorators: js.Array[Decorator] | Null
  var definite: Boolean | Null
  var key: Identifier | StringLiteral | NumericLiteral | Expression
  var optional: Boolean | Null
  var readonly: Boolean | Null
  var static: Boolean
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
    static: Boolean,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ClassProperty,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    accessibility: public | `private` | `protected` = null,
    declare: js.UndefOr[Boolean] = js.undefined,
    decorators: js.Array[Decorator] = null,
    definite: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop = null,
    value: Expression = null
  ): ClassProperty = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (!js.isUndefined(definite)) __obj.updateDynamic("definite")(definite.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassProperty]
  }
}

@JSImport("@babel/types", "classProperty")
@js.native
object classProperty extends js.Object {
  def apply(
    key: Identifier | StringLiteral | NumericLiteral | Expression,
    value: js.UndefOr[Expression | Null],
    typeAnnotation: js.UndefOr[TypeAnnotation | TSTypeAnnotation | Noop | Null],
    decorators: js.UndefOr[js.Array[Decorator] | Null],
    computed: js.UndefOr[Boolean],
    _static: js.UndefOr[Boolean],
    `abstract`: js.UndefOr[Boolean | Null],
    accessibility: js.UndefOr[public | `private` | `protected` | Null],
    declare: js.UndefOr[Boolean | Null],
    definite: js.UndefOr[Boolean | Null],
    optional: js.UndefOr[Boolean | Null],
    readonly: js.UndefOr[Boolean | Null]
  ): ClassProperty = js.native
}

