package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait OptionalCallExpression
  extends Expression
     with BaseNode {
  var arguments: js.Array[Expression | SpreadElement | JSXNamespacedName]
  var callee: Expression
  var optional: Boolean
  var typeArguments: TypeParameterInstantiation | Null
  var typeParameters: TSTypeParameterInstantiation | Null
  @JSName("type")
  var type_OptionalCallExpression: typings.atBabelTypes.atBabelTypesStrings.OptionalCallExpression
}

object OptionalCallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    callee: Expression,
    optional: Boolean,
    `type`: typings.atBabelTypes.atBabelTypesStrings.OptionalCallExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeArguments: TypeParameterInstantiation = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): OptionalCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalCallExpression]
  }
}

@JSImport("@babel/types", "optionalCallExpression")
@js.native
object optionalCallExpression extends js.Object {
  def apply(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: Boolean
  ): OptionalCallExpression = js.native
  def apply(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: Boolean,
    typeArguments: Null,
    typeParameters: TSTypeParameterInstantiation
  ): OptionalCallExpression = js.native
  def apply(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: Boolean,
    typeArguments: TypeParameterInstantiation
  ): OptionalCallExpression = js.native
  def apply(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: Boolean,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): OptionalCallExpression = js.native
}

