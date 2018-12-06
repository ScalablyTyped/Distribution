package typings
package atBabelCoreLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "types")
@js.native
object typesNs extends js.Object {
  def anyTypeAnnotation(): atBabelTypesLib.typesMod.AnyTypeAnnotation = js.native
  def arrayExpression(): atBabelTypesLib.typesMod.ArrayExpression = js.native
  def arrayExpression(
    elements: js.Array[
      scala.Null | atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement
    ]
  ): atBabelTypesLib.typesMod.ArrayExpression = js.native
  def arrayPattern(elements: js.Array[atBabelTypesLib.typesMod.PatternLike]): atBabelTypesLib.typesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.typesMod.PatternLike],
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator]
  ): atBabelTypesLib.typesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.typesMod.PatternLike],
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.typesMod.PatternLike],
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.typesMod.PatternLike],
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.typesMod.PatternLike],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.typesMod.PatternLike],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.typesMod.PatternLike],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.ArrayPattern = js.native
  def arrayTypeAnnotation(elementType: atBabelTypesLib.typesMod.FlowType): atBabelTypesLib.typesMod.ArrayTypeAnnotation = js.native
  def arrowFunctionExpression(params: js.Array[atBabelTypesLib.typesMod.LVal], body: atBabelTypesLib.typesMod.BlockStatement): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.Noop,
    typeParameters: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.Noop,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.Noop,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation,
    typeParameters: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation,
    typeParameters: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(params: js.Array[atBabelTypesLib.typesMod.LVal], body: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.Noop,
    typeParameters: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.Noop,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.Noop,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation,
    typeParameters: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation,
    typeParameters: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration
  ): atBabelTypesLib.typesMod.ArrowFunctionExpression = js.native
  def assignmentExpression(
    operator: java.lang.String,
    left: atBabelTypesLib.typesMod.LVal,
    right: atBabelTypesLib.typesMod.Expression
  ): atBabelTypesLib.typesMod.AssignmentExpression = js.native
  def assignmentPattern(left: atBabelTypesLib.typesMod.ArrayPattern, right: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.typesMod.ArrayPattern,
    right: atBabelTypesLib.typesMod.Expression,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator]
  ): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.typesMod.ArrayPattern,
    right: atBabelTypesLib.typesMod.Expression,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.typesMod.ArrayPattern,
    right: atBabelTypesLib.typesMod.Expression,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.typesMod.ArrayPattern,
    right: atBabelTypesLib.typesMod.Expression,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def assignmentPattern(left: atBabelTypesLib.typesMod.Identifier, right: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.typesMod.Identifier,
    right: atBabelTypesLib.typesMod.Expression,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator]
  ): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.typesMod.Identifier,
    right: atBabelTypesLib.typesMod.Expression,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.typesMod.Identifier,
    right: atBabelTypesLib.typesMod.Expression,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.typesMod.Identifier,
    right: atBabelTypesLib.typesMod.Expression,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def assignmentPattern(left: atBabelTypesLib.typesMod.ObjectPattern, right: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.typesMod.ObjectPattern,
    right: atBabelTypesLib.typesMod.Expression,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator]
  ): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.typesMod.ObjectPattern,
    right: atBabelTypesLib.typesMod.Expression,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.typesMod.ObjectPattern,
    right: atBabelTypesLib.typesMod.Expression,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.typesMod.ObjectPattern,
    right: atBabelTypesLib.typesMod.Expression,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.AssignmentPattern = js.native
  def awaitExpression(argument: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.AwaitExpression = js.native
  def bigIntLiteral(value: java.lang.String): atBabelTypesLib.typesMod.BigIntLiteral = js.native
  def binaryExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`+` | atBabelCoreLib.atBabelCoreLibStrings.`-` | atBabelCoreLib.atBabelCoreLibStrings.`/` | atBabelCoreLib.atBabelCoreLibStrings.`%` | atBabelCoreLib.atBabelCoreLibStrings.`*` | atBabelCoreLib.atBabelCoreLibStrings.`**` | atBabelCoreLib.atBabelCoreLibStrings.`&` | atBabelCoreLib.atBabelCoreLibStrings.`|` | atBabelCoreLib.atBabelCoreLibStrings.`>>` | atBabelCoreLib.atBabelCoreLibStrings.`>>>` | atBabelCoreLib.atBabelCoreLibStrings.`<<` | atBabelCoreLib.atBabelCoreLibStrings.`^` | atBabelCoreLib.atBabelCoreLibStrings.`==` | atBabelCoreLib.atBabelCoreLibStrings.`===` | atBabelCoreLib.atBabelCoreLibStrings.`!=` | atBabelCoreLib.atBabelCoreLibStrings.`!==` | atBabelCoreLib.atBabelCoreLibStrings.in | atBabelCoreLib.atBabelCoreLibStrings.instanceof | atBabelCoreLib.atBabelCoreLibStrings.`>` | atBabelCoreLib.atBabelCoreLibStrings.`<` | atBabelCoreLib.atBabelCoreLibStrings.`>=` | atBabelCoreLib.atBabelCoreLibStrings.`<=`,
    left: atBabelTypesLib.typesMod.Expression,
    right: atBabelTypesLib.typesMod.Expression
  ): atBabelTypesLib.typesMod.BinaryExpression = js.native
  def bindExpression(`object`: js.Any, callee: js.Any): atBabelTypesLib.typesMod.BindExpression = js.native
  def blockStatement(body: js.Array[atBabelTypesLib.typesMod.Statement]): atBabelTypesLib.typesMod.BlockStatement = js.native
  def blockStatement(
    body: js.Array[atBabelTypesLib.typesMod.Statement],
    directives: js.Array[atBabelTypesLib.typesMod.Directive]
  ): atBabelTypesLib.typesMod.BlockStatement = js.native
  def booleanLiteral(value: scala.Boolean): atBabelTypesLib.typesMod.BooleanLiteral = js.native
  def booleanLiteralTypeAnnotation(value: scala.Boolean): atBabelTypesLib.typesMod.BooleanLiteralTypeAnnotation = js.native
  def booleanTypeAnnotation(): atBabelTypesLib.typesMod.BooleanTypeAnnotation = js.native
  def breakStatement(): atBabelTypesLib.typesMod.BreakStatement = js.native
  def breakStatement(label: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.BreakStatement = js.native
  def callExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ]
  ): atBabelTypesLib.typesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`
  ): atBabelTypesLib.typesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`,
    typeArguments: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`,
    typeArguments: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`
  ): atBabelTypesLib.typesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`,
    typeArguments: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`,
    typeArguments: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: scala.Null,
    typeArguments: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: scala.Null,
    typeArguments: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: scala.Null,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.CallExpression = js.native
  def catchClause(param: atBabelTypesLib.typesMod.Identifier, body: atBabelTypesLib.typesMod.BlockStatement): atBabelTypesLib.typesMod.CatchClause = js.native
  def catchClause(param: js.UndefOr[scala.Nothing], body: atBabelTypesLib.typesMod.BlockStatement): atBabelTypesLib.typesMod.CatchClause = js.native
  def catchClause(param: scala.Null, body: atBabelTypesLib.typesMod.BlockStatement): atBabelTypesLib.typesMod.CatchClause = js.native
  def classBody(
    body: js.Array[
      atBabelTypesLib.typesMod.ClassMethod | atBabelTypesLib.typesMod.ClassPrivateMethod | atBabelTypesLib.typesMod.ClassProperty | atBabelTypesLib.typesMod.ClassPrivateProperty | atBabelTypesLib.typesMod.TSDeclareMethod | atBabelTypesLib.typesMod.TSIndexSignature
    ]
  ): atBabelTypesLib.typesMod.ClassBody = js.native
  def classDeclaration(
    id: js.UndefOr[atBabelTypesLib.typesMod.Identifier | scala.Null],
    superClass: js.UndefOr[atBabelTypesLib.typesMod.Expression | scala.Null],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.UndefOr[js.Array[atBabelTypesLib.typesMod.Decorator] | scala.Null],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    declare: js.UndefOr[scala.Boolean | scala.Null],
    _implements: js.UndefOr[
      (js.Array[
        atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
      ]) | scala.Null
    ],
    mixins: js.UndefOr[js.Any | scala.Null],
    superTypeParameters: js.UndefOr[
      atBabelTypesLib.typesMod.TypeParameterInstantiation | atBabelTypesLib.typesMod.TSTypeParameterInstantiation | scala.Null
    ],
    typeParameters: js.UndefOr[
      atBabelTypesLib.typesMod.TypeParameterDeclaration | atBabelTypesLib.typesMod.TSTypeParameterDeclaration | atBabelTypesLib.typesMod.Noop | scala.Null
    ]
  ): atBabelTypesLib.typesMod.ClassDeclaration = js.native
  def classExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator]
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ]
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator]
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ]
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator]
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ]
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[atBabelTypesLib.typesMod.Identifier | scala.Null],
    superClass: js.UndefOr[atBabelTypesLib.typesMod.Expression | scala.Null],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation | atBabelTypesLib.typesMod.TSTypeParameterInstantiation,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration | atBabelTypesLib.typesMod.TSTypeParameterDeclaration | atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(id: js.UndefOr[scala.Nothing], superClass: scala.Null, body: atBabelTypesLib.typesMod.ClassBody): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator]
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ]
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator]
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ]
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(id: scala.Null, superClass: scala.Null, body: atBabelTypesLib.typesMod.ClassBody): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator]
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ]
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: scala.Null,
    body: atBabelTypesLib.typesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.typesMod.TSExpressionWithTypeArguments | atBabelTypesLib.typesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.ClassExpression = js.native
  def classImplements(id: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.ClassImplements = js.native
  def classImplements(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.ClassImplements = js.native
  def classMethod(
    kind: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.get | atBabelCoreLib.atBabelCoreLibStrings.set | atBabelCoreLib.atBabelCoreLibStrings.method | atBabelCoreLib.atBabelCoreLibStrings.constructor
    ],
    key: atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.StringLiteral | atBabelTypesLib.typesMod.NumericLiteral | atBabelTypesLib.typesMod.Expression,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    computed: js.UndefOr[scala.Boolean],
    _static: js.UndefOr[scala.Boolean | scala.Null],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    access: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.public | atBabelCoreLib.atBabelCoreLibStrings.`private` | atBabelCoreLib.atBabelCoreLibStrings.`protected` | scala.Null
    ],
    accessibility: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.public | atBabelCoreLib.atBabelCoreLibStrings.`private` | atBabelCoreLib.atBabelCoreLibStrings.`protected` | scala.Null
    ],
    async: js.UndefOr[scala.Boolean],
    decorators: js.UndefOr[js.Array[atBabelTypesLib.typesMod.Decorator] | scala.Null],
    generator: js.UndefOr[scala.Boolean],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    returnType: js.UndefOr[
      atBabelTypesLib.typesMod.TypeAnnotation | atBabelTypesLib.typesMod.TSTypeAnnotation | atBabelTypesLib.typesMod.Noop | scala.Null
    ],
    typeParameters: js.UndefOr[
      atBabelTypesLib.typesMod.TypeParameterDeclaration | atBabelTypesLib.typesMod.TSTypeParameterDeclaration | atBabelTypesLib.typesMod.Noop | scala.Null
    ]
  ): atBabelTypesLib.typesMod.ClassMethod = js.native
  def classPrivateMethod(
    kind: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.get | atBabelCoreLib.atBabelCoreLibStrings.set | atBabelCoreLib.atBabelCoreLibStrings.method | atBabelCoreLib.atBabelCoreLibStrings.constructor
    ],
    key: atBabelTypesLib.typesMod.PrivateName,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    _static: js.UndefOr[scala.Boolean | scala.Null],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    access: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.public | atBabelCoreLib.atBabelCoreLibStrings.`private` | atBabelCoreLib.atBabelCoreLibStrings.`protected` | scala.Null
    ],
    accessibility: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.public | atBabelCoreLib.atBabelCoreLibStrings.`private` | atBabelCoreLib.atBabelCoreLibStrings.`protected` | scala.Null
    ],
    async: js.UndefOr[scala.Boolean],
    computed: js.UndefOr[scala.Boolean],
    decorators: js.UndefOr[js.Array[atBabelTypesLib.typesMod.Decorator] | scala.Null],
    generator: js.UndefOr[scala.Boolean],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    returnType: js.UndefOr[js.Any | scala.Null],
    typeParameters: js.UndefOr[js.Any | scala.Null]
  ): atBabelTypesLib.typesMod.ClassPrivateMethod = js.native
  def classPrivateProperty(key: atBabelTypesLib.typesMod.PrivateName): atBabelTypesLib.typesMod.ClassPrivateProperty = js.native
  def classPrivateProperty(key: atBabelTypesLib.typesMod.PrivateName, value: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.ClassPrivateProperty = js.native
  def classProperty(
    key: atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.StringLiteral | atBabelTypesLib.typesMod.NumericLiteral | atBabelTypesLib.typesMod.Expression,
    value: js.UndefOr[atBabelTypesLib.typesMod.Expression | scala.Null],
    typeAnnotation: js.UndefOr[
      atBabelTypesLib.typesMod.TypeAnnotation | atBabelTypesLib.typesMod.TSTypeAnnotation | atBabelTypesLib.typesMod.Noop | scala.Null
    ],
    decorators: js.UndefOr[js.Array[atBabelTypesLib.typesMod.Decorator] | scala.Null],
    computed: js.UndefOr[scala.Boolean],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    accessibility: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.public | atBabelCoreLib.atBabelCoreLibStrings.`private` | atBabelCoreLib.atBabelCoreLibStrings.`protected` | scala.Null
    ],
    definite: js.UndefOr[scala.Boolean | scala.Null],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    readonly: js.UndefOr[scala.Boolean | scala.Null],
    _static: js.UndefOr[scala.Boolean | scala.Null]
  ): atBabelTypesLib.typesMod.ClassProperty = js.native
  def clone[T /* <: atBabelTypesLib.typesMod.Node */](n: T): T = js.native
  def cloneDeep[T /* <: atBabelTypesLib.typesMod.Node */](n: T): T = js.native
  def conditionalExpression(
    test: atBabelTypesLib.typesMod.Expression,
    consequent: atBabelTypesLib.typesMod.Expression,
    alternate: atBabelTypesLib.typesMod.Expression
  ): atBabelTypesLib.typesMod.ConditionalExpression = js.native
  def continueStatement(): atBabelTypesLib.typesMod.ContinueStatement = js.native
  def continueStatement(label: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.ContinueStatement = js.native
  def debuggerStatement(): atBabelTypesLib.typesMod.DebuggerStatement = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareClass = js.native
  def declareExportAllDeclaration(source: atBabelTypesLib.typesMod.StringLiteral): atBabelTypesLib.typesMod.DeclareExportAllDeclaration = js.native
  def declareExportAllDeclaration(
    source: atBabelTypesLib.typesMod.StringLiteral,
    exportKind: js.Tuple2[
      atBabelCoreLib.atBabelCoreLibStrings.`type`, 
      atBabelCoreLib.atBabelCoreLibStrings.value
    ]
  ): atBabelTypesLib.typesMod.DeclareExportAllDeclaration = js.native
  def declareExportDeclaration(): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: atBabelTypesLib.typesMod.Flow): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.typesMod.Flow,
    specifiers: js.Array[
      atBabelTypesLib.typesMod.ExportSpecifier | atBabelTypesLib.typesMod.ExportNamespaceSpecifier
    ]
  ): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.typesMod.Flow,
    specifiers: js.Array[
      atBabelTypesLib.typesMod.ExportSpecifier | atBabelTypesLib.typesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.typesMod.StringLiteral
  ): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.typesMod.Flow,
    specifiers: js.Array[
      atBabelTypesLib.typesMod.ExportSpecifier | atBabelTypesLib.typesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.typesMod.StringLiteral,
    _default: scala.Boolean
  ): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.typesMod.Flow,
    specifiers: js.Array[
      atBabelTypesLib.typesMod.ExportSpecifier | atBabelTypesLib.typesMod.ExportNamespaceSpecifier
    ],
    source: scala.Null,
    _default: scala.Boolean
  ): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.typesMod.Flow,
    specifiers: scala.Null,
    source: atBabelTypesLib.typesMod.StringLiteral
  ): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.typesMod.Flow,
    specifiers: scala.Null,
    source: atBabelTypesLib.typesMod.StringLiteral,
    _default: scala.Boolean
  ): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.typesMod.Flow,
    specifiers: scala.Null,
    source: scala.Null,
    _default: scala.Boolean
  ): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.typesMod.ExportSpecifier | atBabelTypesLib.typesMod.ExportNamespaceSpecifier
    ]
  ): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.typesMod.ExportSpecifier | atBabelTypesLib.typesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.typesMod.StringLiteral
  ): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.typesMod.ExportSpecifier | atBabelTypesLib.typesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.typesMod.StringLiteral,
    _default: scala.Boolean
  ): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.typesMod.ExportSpecifier | atBabelTypesLib.typesMod.ExportNamespaceSpecifier
    ],
    source: scala.Null,
    _default: scala.Boolean
  ): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: scala.Null, specifiers: scala.Null, source: atBabelTypesLib.typesMod.StringLiteral): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: scala.Null,
    source: atBabelTypesLib.typesMod.StringLiteral,
    _default: scala.Boolean
  ): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: scala.Null, specifiers: scala.Null, source: scala.Null, _default: scala.Boolean): atBabelTypesLib.typesMod.DeclareExportDeclaration = js.native
  def declareFunction(id: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.DeclareFunction = js.native
  def declareFunction(id: atBabelTypesLib.typesMod.Identifier, predicate: atBabelTypesLib.typesMod.DeclaredPredicate): atBabelTypesLib.typesMod.DeclareFunction = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.DeclareInterface = js.native
  def declareModule(id: atBabelTypesLib.typesMod.Identifier, body: atBabelTypesLib.typesMod.BlockStatement): atBabelTypesLib.typesMod.DeclareModule = js.native
  def declareModule(id: atBabelTypesLib.typesMod.StringLiteral, body: atBabelTypesLib.typesMod.BlockStatement): atBabelTypesLib.typesMod.DeclareModule = js.native
  def declareModuleExports(typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation): atBabelTypesLib.typesMod.DeclareModuleExports = js.native
  @JSName("declareModule")
  def declareModule_CommonJS(
    id: atBabelTypesLib.typesMod.Identifier,
    body: atBabelTypesLib.typesMod.BlockStatement,
    kind: atBabelCoreLib.atBabelCoreLibStrings.CommonJS
  ): atBabelTypesLib.typesMod.DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_CommonJS(
    id: atBabelTypesLib.typesMod.StringLiteral,
    body: atBabelTypesLib.typesMod.BlockStatement,
    kind: atBabelCoreLib.atBabelCoreLibStrings.CommonJS
  ): atBabelTypesLib.typesMod.DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_ES(
    id: atBabelTypesLib.typesMod.Identifier,
    body: atBabelTypesLib.typesMod.BlockStatement,
    kind: atBabelCoreLib.atBabelCoreLibStrings.ES
  ): atBabelTypesLib.typesMod.DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_ES(
    id: atBabelTypesLib.typesMod.StringLiteral,
    body: atBabelTypesLib.typesMod.BlockStatement,
    kind: atBabelCoreLib.atBabelCoreLibStrings.ES
  ): atBabelTypesLib.typesMod.DeclareModule = js.native
  def declareOpaqueType(id: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.DeclareOpaqueType = js.native
  def declareOpaqueType(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration
  ): atBabelTypesLib.typesMod.DeclareOpaqueType = js.native
  def declareOpaqueType(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    supertype: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.DeclareOpaqueType = js.native
  def declareOpaqueType(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    supertype: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.DeclareOpaqueType = js.native
  def declareTypeAlias(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    right: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.DeclareTypeAlias = js.native
  def declareTypeAlias(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    right: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.DeclareTypeAlias = js.native
  def declareTypeAlias(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    right: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.DeclareTypeAlias = js.native
  def declareVariable(id: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.DeclareVariable = js.native
  def declaredPredicate(value: atBabelTypesLib.typesMod.Flow): atBabelTypesLib.typesMod.DeclaredPredicate = js.native
  def decorator(expression: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.Decorator = js.native
  def directive(value: atBabelTypesLib.typesMod.DirectiveLiteral): atBabelTypesLib.typesMod.Directive = js.native
  def directiveLiteral(value: java.lang.String): atBabelTypesLib.typesMod.DirectiveLiteral = js.native
  def doExpression(body: atBabelTypesLib.typesMod.BlockStatement): atBabelTypesLib.typesMod.DoExpression = js.native
  def doWhileStatement(test: atBabelTypesLib.typesMod.Expression, body: atBabelTypesLib.typesMod.Statement): atBabelTypesLib.typesMod.DoWhileStatement = js.native
  def emptyStatement(): atBabelTypesLib.typesMod.EmptyStatement = js.native
  def emptyTypeAnnotation(): atBabelTypesLib.typesMod.EmptyTypeAnnotation = js.native
  def existsTypeAnnotation(): atBabelTypesLib.typesMod.ExistsTypeAnnotation = js.native
  def exportAllDeclaration(source: atBabelTypesLib.typesMod.StringLiteral): atBabelTypesLib.typesMod.ExportAllDeclaration = js.native
  def exportDefaultDeclaration(declaration: atBabelTypesLib.typesMod.ClassDeclaration): atBabelTypesLib.typesMod.ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: atBabelTypesLib.typesMod.FunctionDeclaration): atBabelTypesLib.typesMod.ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: atBabelTypesLib.typesMod.TSDeclareFunction): atBabelTypesLib.typesMod.ExportDefaultDeclaration = js.native
  def exportDefaultSpecifier(exported: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.ExportDefaultSpecifier = js.native
  def exportNamedDeclaration(
    declaration: atBabelTypesLib.typesMod.Declaration | js.UndefOr[scala.Nothing],
    specifiers: js.Array[
      atBabelTypesLib.typesMod.ExportSpecifier | atBabelTypesLib.typesMod.ExportDefaultSpecifier | atBabelTypesLib.typesMod.ExportNamespaceSpecifier
    ]
  ): atBabelTypesLib.typesMod.ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: atBabelTypesLib.typesMod.Declaration | js.UndefOr[scala.Nothing],
    specifiers: js.Array[
      atBabelTypesLib.typesMod.ExportSpecifier | atBabelTypesLib.typesMod.ExportDefaultSpecifier | atBabelTypesLib.typesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.typesMod.StringLiteral
  ): atBabelTypesLib.typesMod.ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.typesMod.ExportSpecifier | atBabelTypesLib.typesMod.ExportDefaultSpecifier | atBabelTypesLib.typesMod.ExportNamespaceSpecifier
    ]
  ): atBabelTypesLib.typesMod.ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.typesMod.ExportSpecifier | atBabelTypesLib.typesMod.ExportDefaultSpecifier | atBabelTypesLib.typesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.typesMod.StringLiteral
  ): atBabelTypesLib.typesMod.ExportNamedDeclaration = js.native
  def exportNamespaceSpecifier(exported: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.ExportNamespaceSpecifier = js.native
  def exportSpecifier(local: atBabelTypesLib.typesMod.Identifier, exported: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.ExportSpecifier = js.native
  def expressionStatement(expression: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.ExpressionStatement = js.native
  def file(program: atBabelTypesLib.typesMod.Program, comments: js.Any, tokens: js.Any): atBabelTypesLib.typesMod.File = js.native
  def forInStatement(
    left: atBabelTypesLib.typesMod.LVal,
    right: atBabelTypesLib.typesMod.Expression,
    body: atBabelTypesLib.typesMod.Statement
  ): atBabelTypesLib.typesMod.ForInStatement = js.native
  def forInStatement(
    left: atBabelTypesLib.typesMod.VariableDeclaration,
    right: atBabelTypesLib.typesMod.Expression,
    body: atBabelTypesLib.typesMod.Statement
  ): atBabelTypesLib.typesMod.ForInStatement = js.native
  def forOfStatement(
    left: atBabelTypesLib.typesMod.LVal,
    right: atBabelTypesLib.typesMod.Expression,
    body: atBabelTypesLib.typesMod.Statement
  ): atBabelTypesLib.typesMod.ForOfStatement = js.native
  def forOfStatement(
    left: atBabelTypesLib.typesMod.LVal,
    right: atBabelTypesLib.typesMod.Expression,
    body: atBabelTypesLib.typesMod.Statement,
    _await: scala.Boolean
  ): atBabelTypesLib.typesMod.ForOfStatement = js.native
  def forOfStatement(
    left: atBabelTypesLib.typesMod.VariableDeclaration,
    right: atBabelTypesLib.typesMod.Expression,
    body: atBabelTypesLib.typesMod.Statement
  ): atBabelTypesLib.typesMod.ForOfStatement = js.native
  def forOfStatement(
    left: atBabelTypesLib.typesMod.VariableDeclaration,
    right: atBabelTypesLib.typesMod.Expression,
    body: atBabelTypesLib.typesMod.Statement,
    _await: scala.Boolean
  ): atBabelTypesLib.typesMod.ForOfStatement = js.native
  def forStatement(
    init: js.UndefOr[
      atBabelTypesLib.typesMod.VariableDeclaration | atBabelTypesLib.typesMod.Expression | scala.Null
    ],
    test: js.UndefOr[atBabelTypesLib.typesMod.Expression | scala.Null],
    update: js.UndefOr[atBabelTypesLib.typesMod.Expression | scala.Null],
    body: atBabelTypesLib.typesMod.Statement
  ): atBabelTypesLib.typesMod.ForStatement = js.native
  def functionDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[atBabelTypesLib.typesMod.Identifier | scala.Null],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation | atBabelTypesLib.typesMod.TSTypeAnnotation | atBabelTypesLib.typesMod.Noop,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration | atBabelTypesLib.typesMod.TSTypeParameterDeclaration | atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.FunctionDeclaration = js.native
  def functionExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: atBabelTypesLib.typesMod.Identifier,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[atBabelTypesLib.typesMod.Identifier | scala.Null],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation | atBabelTypesLib.typesMod.TSTypeAnnotation | atBabelTypesLib.typesMod.Noop,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration | atBabelTypesLib.typesMod.TSTypeParameterDeclaration | atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionExpression(
    id: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.FunctionExpression = js.native
  def functionTypeAnnotation(
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    params: js.Array[atBabelTypesLib.typesMod.FunctionTypeParam],
    rest: atBabelTypesLib.typesMod.FunctionTypeParam,
    returnType: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    params: js.Array[atBabelTypesLib.typesMod.FunctionTypeParam],
    rest: js.UndefOr[scala.Nothing],
    returnType: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    params: js.Array[atBabelTypesLib.typesMod.FunctionTypeParam],
    rest: scala.Null,
    returnType: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.FunctionTypeParam],
    rest: atBabelTypesLib.typesMod.FunctionTypeParam,
    returnType: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.FunctionTypeParam],
    rest: js.UndefOr[scala.Nothing],
    returnType: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.FunctionTypeParam],
    rest: scala.Null,
    returnType: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.FunctionTypeParam],
    rest: atBabelTypesLib.typesMod.FunctionTypeParam,
    returnType: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.FunctionTypeParam],
    rest: js.UndefOr[scala.Nothing],
    returnType: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.FunctionTypeParam],
    rest: scala.Null,
    returnType: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.FunctionTypeAnnotation = js.native
  def functionTypeParam(name: atBabelTypesLib.typesMod.Identifier, typeAnnotation: atBabelTypesLib.typesMod.FlowType): atBabelTypesLib.typesMod.FunctionTypeParam = js.native
  def functionTypeParam(
    name: atBabelTypesLib.typesMod.Identifier,
    typeAnnotation: atBabelTypesLib.typesMod.FlowType,
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionTypeParam = js.native
  def functionTypeParam(name: js.UndefOr[scala.Nothing], typeAnnotation: atBabelTypesLib.typesMod.FlowType): atBabelTypesLib.typesMod.FunctionTypeParam = js.native
  def functionTypeParam(
    name: js.UndefOr[scala.Nothing],
    typeAnnotation: atBabelTypesLib.typesMod.FlowType,
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.FunctionTypeParam = js.native
  def functionTypeParam(name: scala.Null, typeAnnotation: atBabelTypesLib.typesMod.FlowType): atBabelTypesLib.typesMod.FunctionTypeParam = js.native
  def functionTypeParam(name: scala.Null, typeAnnotation: atBabelTypesLib.typesMod.FlowType, optional: scala.Boolean): atBabelTypesLib.typesMod.FunctionTypeParam = js.native
  def genericTypeAnnotation(id: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.GenericTypeAnnotation = js.native
  def genericTypeAnnotation(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.GenericTypeAnnotation = js.native
  def identifier(name: java.lang.String): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(name: java.lang.String, decorators: js.Array[atBabelTypesLib.typesMod.Decorator]): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(name: java.lang.String, decorators: scala.Null, optional: scala.Boolean): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.Identifier = js.native
  def ifStatement(test: atBabelTypesLib.typesMod.Expression, consequent: atBabelTypesLib.typesMod.Statement): atBabelTypesLib.typesMod.IfStatement = js.native
  def ifStatement(
    test: atBabelTypesLib.typesMod.Expression,
    consequent: atBabelTypesLib.typesMod.Statement,
    alternate: atBabelTypesLib.typesMod.Statement
  ): atBabelTypesLib.typesMod.IfStatement = js.native
  def importDeclaration(
    specifiers: js.Array[
      atBabelTypesLib.typesMod.ImportSpecifier | atBabelTypesLib.typesMod.ImportDefaultSpecifier | atBabelTypesLib.typesMod.ImportNamespaceSpecifier
    ],
    source: atBabelTypesLib.typesMod.StringLiteral
  ): atBabelTypesLib.typesMod.ImportDeclaration = js.native
  def importDefaultSpecifier(local: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.ImportDefaultSpecifier = js.native
  def importNamespaceSpecifier(local: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.ImportNamespaceSpecifier = js.native
  def importSpecifier(local: atBabelTypesLib.typesMod.Identifier, imported: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.ImportSpecifier = js.native
  @JSName("importSpecifier")
  def importSpecifier_type(
    local: atBabelTypesLib.typesMod.Identifier,
    imported: atBabelTypesLib.typesMod.Identifier,
    importKind: atBabelCoreLib.atBabelCoreLibStrings.`type`
  ): atBabelTypesLib.typesMod.ImportSpecifier = js.native
  @JSName("importSpecifier")
  def importSpecifier_typeof(
    local: atBabelTypesLib.typesMod.Identifier,
    imported: atBabelTypesLib.typesMod.Identifier,
    importKind: atBabelCoreLib.atBabelCoreLibStrings.typeof
  ): atBabelTypesLib.typesMod.ImportSpecifier = js.native
  def inferredPredicate(): atBabelTypesLib.typesMod.InferredPredicate = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.typesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.typesMod.InterfaceExtends]
  ): atBabelTypesLib.typesMod.InterfaceDeclaration = js.native
  def interfaceExtends(id: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.InterfaceExtends = js.native
  def interfaceExtends(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.InterfaceExtends = js.native
  def interfaceTypeAnnotation(
    _extends: js.Array[atBabelTypesLib.typesMod.InterfaceExtends],
    body: atBabelTypesLib.typesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.typesMod.InterfaceTypeAnnotation = js.native
  def interfaceTypeAnnotation(_extends: js.UndefOr[scala.Nothing], body: atBabelTypesLib.typesMod.ObjectTypeAnnotation): atBabelTypesLib.typesMod.InterfaceTypeAnnotation = js.native
  def interfaceTypeAnnotation(_extends: scala.Null, body: atBabelTypesLib.typesMod.ObjectTypeAnnotation): atBabelTypesLib.typesMod.InterfaceTypeAnnotation = js.native
  def interpreterDirective(value: java.lang.String): atBabelTypesLib.typesMod.InterpreterDirective = js.native
  def intersectionTypeAnnotation(types: js.Array[atBabelTypesLib.typesMod.FlowType]): atBabelTypesLib.typesMod.IntersectionTypeAnnotation = js.native
  def isAnyTypeAnnotation(node: js.Object): /* is AnyTypeAnnotation */scala.Boolean = js.native
  def isAnyTypeAnnotation(node: js.Object, opts: js.Object): /* is AnyTypeAnnotation */scala.Boolean = js.native
  def isArrayExpression(node: js.Object): /* is ArrayExpression */scala.Boolean = js.native
  def isArrayExpression(node: js.Object, opts: js.Object): /* is ArrayExpression */scala.Boolean = js.native
  def isArrayPattern(node: js.Object): /* is ArrayPattern */scala.Boolean = js.native
  def isArrayPattern(node: js.Object, opts: js.Object): /* is ArrayPattern */scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.Object): /* is ArrayTypeAnnotation */scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.Object, opts: js.Object): /* is ArrayTypeAnnotation */scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.Object): /* is ArrowFunctionExpression */scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.Object, opts: js.Object): /* is ArrowFunctionExpression */scala.Boolean = js.native
  def isAssignmentExpression(node: js.Object): /* is AssignmentExpression */scala.Boolean = js.native
  def isAssignmentExpression(node: js.Object, opts: js.Object): /* is AssignmentExpression */scala.Boolean = js.native
  def isAssignmentPattern(node: js.Object): /* is AssignmentPattern */scala.Boolean = js.native
  def isAssignmentPattern(node: js.Object, opts: js.Object): /* is AssignmentPattern */scala.Boolean = js.native
  def isAwaitExpression(node: js.Object): /* is AwaitExpression */scala.Boolean = js.native
  def isAwaitExpression(node: js.Object, opts: js.Object): /* is AwaitExpression */scala.Boolean = js.native
  def isBigIntLiteral(node: js.Object): /* is BigIntLiteral */scala.Boolean = js.native
  def isBigIntLiteral(node: js.Object, opts: js.Object): /* is BigIntLiteral */scala.Boolean = js.native
  def isBinary(node: js.Object): /* is Binary */scala.Boolean = js.native
  def isBinary(node: js.Object, opts: js.Object): /* is Binary */scala.Boolean = js.native
  def isBinaryExpression(node: js.Object): /* is BinaryExpression */scala.Boolean = js.native
  def isBinaryExpression(node: js.Object, opts: js.Object): /* is BinaryExpression */scala.Boolean = js.native
  def isBindExpression(node: js.Object): /* is BindExpression */scala.Boolean = js.native
  def isBindExpression(node: js.Object, opts: js.Object): /* is BindExpression */scala.Boolean = js.native
  def isBlock(node: js.Object): /* is Block */scala.Boolean = js.native
  def isBlock(node: js.Object, opts: js.Object): /* is Block */scala.Boolean = js.native
  def isBlockParent(node: js.Object): /* is BlockParent */scala.Boolean = js.native
  def isBlockParent(node: js.Object, opts: js.Object): /* is BlockParent */scala.Boolean = js.native
  def isBlockStatement(node: js.Object): /* is BlockStatement */scala.Boolean = js.native
  def isBlockStatement(node: js.Object, opts: js.Object): /* is BlockStatement */scala.Boolean = js.native
  def isBooleanLiteral(node: js.Object): /* is BooleanLiteral */scala.Boolean = js.native
  def isBooleanLiteral(node: js.Object, opts: js.Object): /* is BooleanLiteral */scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.Object): /* is BooleanLiteralTypeAnnotation */scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is BooleanLiteralTypeAnnotation */scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.Object): /* is BooleanTypeAnnotation */scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.Object, opts: js.Object): /* is BooleanTypeAnnotation */scala.Boolean = js.native
  def isBreakStatement(node: js.Object): /* is BreakStatement */scala.Boolean = js.native
  def isBreakStatement(node: js.Object, opts: js.Object): /* is BreakStatement */scala.Boolean = js.native
  def isCallExpression(node: js.Object): /* is CallExpression */scala.Boolean = js.native
  def isCallExpression(node: js.Object, opts: js.Object): /* is CallExpression */scala.Boolean = js.native
  def isCatchClause(node: js.Object): /* is CatchClause */scala.Boolean = js.native
  def isCatchClause(node: js.Object, opts: js.Object): /* is CatchClause */scala.Boolean = js.native
  def isClass(node: js.Object): /* is Class */scala.Boolean = js.native
  def isClass(node: js.Object, opts: js.Object): /* is Class */scala.Boolean = js.native
  def isClassBody(node: js.Object): /* is ClassBody */scala.Boolean = js.native
  def isClassBody(node: js.Object, opts: js.Object): /* is ClassBody */scala.Boolean = js.native
  def isClassDeclaration(node: js.Object): /* is ClassDeclaration */scala.Boolean = js.native
  def isClassDeclaration(node: js.Object, opts: js.Object): /* is ClassDeclaration */scala.Boolean = js.native
  def isClassExpression(node: js.Object): /* is ClassExpression */scala.Boolean = js.native
  def isClassExpression(node: js.Object, opts: js.Object): /* is ClassExpression */scala.Boolean = js.native
  def isClassImplements(node: js.Object): /* is ClassImplements */scala.Boolean = js.native
  def isClassImplements(node: js.Object, opts: js.Object): /* is ClassImplements */scala.Boolean = js.native
  def isClassMethod(node: js.Object): /* is ClassMethod */scala.Boolean = js.native
  def isClassMethod(node: js.Object, opts: js.Object): /* is ClassMethod */scala.Boolean = js.native
  def isClassPrivateMethod(node: js.Object): /* is ClassPrivateMethod */scala.Boolean = js.native
  def isClassPrivateMethod(node: js.Object, opts: js.Object): /* is ClassPrivateMethod */scala.Boolean = js.native
  def isClassPrivateProperty(node: js.Object): /* is ClassPrivateProperty */scala.Boolean = js.native
  def isClassPrivateProperty(node: js.Object, opts: js.Object): /* is ClassPrivateProperty */scala.Boolean = js.native
  def isClassProperty(node: js.Object): /* is ClassProperty */scala.Boolean = js.native
  def isClassProperty(node: js.Object, opts: js.Object): /* is ClassProperty */scala.Boolean = js.native
  def isCompletionStatement(node: js.Object): /* is CompletionStatement */scala.Boolean = js.native
  def isCompletionStatement(node: js.Object, opts: js.Object): /* is CompletionStatement */scala.Boolean = js.native
  def isConditional(node: js.Object): /* is Conditional */scala.Boolean = js.native
  def isConditional(node: js.Object, opts: js.Object): /* is Conditional */scala.Boolean = js.native
  def isConditionalExpression(node: js.Object): /* is ConditionalExpression */scala.Boolean = js.native
  def isConditionalExpression(node: js.Object, opts: js.Object): /* is ConditionalExpression */scala.Boolean = js.native
  def isContinueStatement(node: js.Object): /* is ContinueStatement */scala.Boolean = js.native
  def isContinueStatement(node: js.Object, opts: js.Object): /* is ContinueStatement */scala.Boolean = js.native
  def isDebuggerStatement(node: js.Object): /* is DebuggerStatement */scala.Boolean = js.native
  def isDebuggerStatement(node: js.Object, opts: js.Object): /* is DebuggerStatement */scala.Boolean = js.native
  def isDeclaration(node: js.Object): /* is Declaration */scala.Boolean = js.native
  def isDeclaration(node: js.Object, opts: js.Object): /* is Declaration */scala.Boolean = js.native
  def isDeclareClass(node: js.Object): /* is DeclareClass */scala.Boolean = js.native
  def isDeclareClass(node: js.Object, opts: js.Object): /* is DeclareClass */scala.Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.Object): /* is DeclareExportAllDeclaration */scala.Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.Object, opts: js.Object): /* is DeclareExportAllDeclaration */scala.Boolean = js.native
  def isDeclareExportDeclaration(node: js.Object): /* is DeclareExportDeclaration */scala.Boolean = js.native
  def isDeclareExportDeclaration(node: js.Object, opts: js.Object): /* is DeclareExportDeclaration */scala.Boolean = js.native
  def isDeclareFunction(node: js.Object): /* is DeclareFunction */scala.Boolean = js.native
  def isDeclareFunction(node: js.Object, opts: js.Object): /* is DeclareFunction */scala.Boolean = js.native
  def isDeclareInterface(node: js.Object): /* is DeclareInterface */scala.Boolean = js.native
  def isDeclareInterface(node: js.Object, opts: js.Object): /* is DeclareInterface */scala.Boolean = js.native
  def isDeclareModule(node: js.Object): /* is DeclareModule */scala.Boolean = js.native
  def isDeclareModule(node: js.Object, opts: js.Object): /* is DeclareModule */scala.Boolean = js.native
  def isDeclareModuleExports(node: js.Object): /* is DeclareModuleExports */scala.Boolean = js.native
  def isDeclareModuleExports(node: js.Object, opts: js.Object): /* is DeclareModuleExports */scala.Boolean = js.native
  def isDeclareOpaqueType(node: js.Object): /* is DeclareOpaqueType */scala.Boolean = js.native
  def isDeclareOpaqueType(node: js.Object, opts: js.Object): /* is DeclareOpaqueType */scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.Object): /* is DeclareTypeAlias */scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.Object, opts: js.Object): /* is DeclareTypeAlias */scala.Boolean = js.native
  def isDeclareVariable(node: js.Object): /* is DeclareVariable */scala.Boolean = js.native
  def isDeclareVariable(node: js.Object, opts: js.Object): /* is DeclareVariable */scala.Boolean = js.native
  def isDeclaredPredicate(node: js.Object): /* is DeclaredPredicate */scala.Boolean = js.native
  def isDeclaredPredicate(node: js.Object, opts: js.Object): /* is DeclaredPredicate */scala.Boolean = js.native
  def isDecorator(node: js.Object): /* is Decorator */scala.Boolean = js.native
  def isDecorator(node: js.Object, opts: js.Object): /* is Decorator */scala.Boolean = js.native
  def isDirective(node: js.Object): /* is Directive */scala.Boolean = js.native
  def isDirective(node: js.Object, opts: js.Object): /* is Directive */scala.Boolean = js.native
  def isDirectiveLiteral(node: js.Object): /* is DirectiveLiteral */scala.Boolean = js.native
  def isDirectiveLiteral(node: js.Object, opts: js.Object): /* is DirectiveLiteral */scala.Boolean = js.native
  def isDoExpression(node: js.Object): /* is DoExpression */scala.Boolean = js.native
  def isDoExpression(node: js.Object, opts: js.Object): /* is DoExpression */scala.Boolean = js.native
  def isDoWhileStatement(node: js.Object): /* is DoWhileStatement */scala.Boolean = js.native
  def isDoWhileStatement(node: js.Object, opts: js.Object): /* is DoWhileStatement */scala.Boolean = js.native
  def isEmptyStatement(node: js.Object): /* is EmptyStatement */scala.Boolean = js.native
  def isEmptyStatement(node: js.Object, opts: js.Object): /* is EmptyStatement */scala.Boolean = js.native
  def isEmptyTypeAnnotation(node: js.Object): /* is EmptyTypeAnnotation */scala.Boolean = js.native
  def isEmptyTypeAnnotation(node: js.Object, opts: js.Object): /* is EmptyTypeAnnotation */scala.Boolean = js.native
  def isExistsTypeAnnotation(node: js.Object): /* is ExistsTypeAnnotation */scala.Boolean = js.native
  def isExistsTypeAnnotation(node: js.Object, opts: js.Object): /* is ExistsTypeAnnotation */scala.Boolean = js.native
  def isExportAllDeclaration(node: js.Object): /* is ExportAllDeclaration */scala.Boolean = js.native
  def isExportAllDeclaration(node: js.Object, opts: js.Object): /* is ExportAllDeclaration */scala.Boolean = js.native
  def isExportDeclaration(node: js.Object): /* is ExportDeclaration */scala.Boolean = js.native
  def isExportDeclaration(node: js.Object, opts: js.Object): /* is ExportDeclaration */scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.Object): /* is ExportDefaultDeclaration */scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.Object, opts: js.Object): /* is ExportDefaultDeclaration */scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.Object): /* is ExportDefaultSpecifier */scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.Object, opts: js.Object): /* is ExportDefaultSpecifier */scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.Object): /* is ExportNamedDeclaration */scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.Object, opts: js.Object): /* is ExportNamedDeclaration */scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.Object): /* is ExportNamespaceSpecifier */scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is ExportNamespaceSpecifier */scala.Boolean = js.native
  def isExportSpecifier(node: js.Object): /* is ExportSpecifier */scala.Boolean = js.native
  def isExportSpecifier(node: js.Object, opts: js.Object): /* is ExportSpecifier */scala.Boolean = js.native
  def isExpression(node: js.Object): /* is Expression */scala.Boolean = js.native
  def isExpression(node: js.Object, opts: js.Object): /* is Expression */scala.Boolean = js.native
  def isExpressionStatement(node: js.Object): /* is ExpressionStatement */scala.Boolean = js.native
  def isExpressionStatement(node: js.Object, opts: js.Object): /* is ExpressionStatement */scala.Boolean = js.native
  def isExpressionWrapper(node: js.Object): /* is ExpressionWrapper */scala.Boolean = js.native
  def isExpressionWrapper(node: js.Object, opts: js.Object): /* is ExpressionWrapper */scala.Boolean = js.native
  def isFile(node: js.Object): /* is File */scala.Boolean = js.native
  def isFile(node: js.Object, opts: js.Object): /* is File */scala.Boolean = js.native
  def isFlow(node: js.Object): /* is Flow */scala.Boolean = js.native
  def isFlow(node: js.Object, opts: js.Object): /* is Flow */scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.Object): /* is FlowBaseAnnotation */scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.Object, opts: js.Object): /* is FlowBaseAnnotation */scala.Boolean = js.native
  def isFlowDeclaration(node: js.Object): /* is FlowDeclaration */scala.Boolean = js.native
  def isFlowDeclaration(node: js.Object, opts: js.Object): /* is FlowDeclaration */scala.Boolean = js.native
  def isFlowPredicate(node: js.Object): /* is FlowPredicate */scala.Boolean = js.native
  def isFlowPredicate(node: js.Object, opts: js.Object): /* is FlowPredicate */scala.Boolean = js.native
  def isFlowType(node: js.Object): /* is FlowType */scala.Boolean = js.native
  def isFlowType(node: js.Object, opts: js.Object): /* is FlowType */scala.Boolean = js.native
  def isFor(node: js.Object): /* is For */scala.Boolean = js.native
  def isFor(node: js.Object, opts: js.Object): /* is For */scala.Boolean = js.native
  def isForInStatement(node: js.Object): /* is ForInStatement */scala.Boolean = js.native
  def isForInStatement(node: js.Object, opts: js.Object): /* is ForInStatement */scala.Boolean = js.native
  def isForOfStatement(node: js.Object): /* is ForOfStatement */scala.Boolean = js.native
  def isForOfStatement(node: js.Object, opts: js.Object): /* is ForOfStatement */scala.Boolean = js.native
  def isForStatement(node: js.Object): /* is ForStatement */scala.Boolean = js.native
  def isForStatement(node: js.Object, opts: js.Object): /* is ForStatement */scala.Boolean = js.native
  def isForXStatement(node: js.Object): /* is ForXStatement */scala.Boolean = js.native
  def isForXStatement(node: js.Object, opts: js.Object): /* is ForXStatement */scala.Boolean = js.native
  def isFunction(node: js.Object): /* is Function */scala.Boolean = js.native
  def isFunction(node: js.Object, opts: js.Object): /* is Function */scala.Boolean = js.native
  def isFunctionDeclaration(node: js.Object): /* is FunctionDeclaration */scala.Boolean = js.native
  def isFunctionDeclaration(node: js.Object, opts: js.Object): /* is FunctionDeclaration */scala.Boolean = js.native
  def isFunctionExpression(node: js.Object): /* is FunctionExpression */scala.Boolean = js.native
  def isFunctionExpression(node: js.Object, opts: js.Object): /* is FunctionExpression */scala.Boolean = js.native
  def isFunctionParent(node: js.Object): /* is FunctionParent */scala.Boolean = js.native
  def isFunctionParent(node: js.Object, opts: js.Object): /* is FunctionParent */scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.Object): /* is FunctionTypeAnnotation */scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.Object, opts: js.Object): /* is FunctionTypeAnnotation */scala.Boolean = js.native
  def isFunctionTypeParam(node: js.Object): /* is FunctionTypeParam */scala.Boolean = js.native
  def isFunctionTypeParam(node: js.Object, opts: js.Object): /* is FunctionTypeParam */scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.Object): /* is GenericTypeAnnotation */scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.Object, opts: js.Object): /* is GenericTypeAnnotation */scala.Boolean = js.native
  def isIdentifier(node: js.Object): /* is Identifier */scala.Boolean = js.native
  def isIdentifier(node: js.Object, opts: js.Object): /* is Identifier */scala.Boolean = js.native
  def isIfStatement(node: js.Object): /* is IfStatement */scala.Boolean = js.native
  def isIfStatement(node: js.Object, opts: js.Object): /* is IfStatement */scala.Boolean = js.native
  def isImmutable(node: js.Object): /* is Immutable */scala.Boolean = js.native
  def isImmutable(node: js.Object, opts: js.Object): /* is Immutable */scala.Boolean = js.native
  def isImport(node: js.Object): /* is Import */scala.Boolean = js.native
  def isImport(node: js.Object, opts: js.Object): /* is Import */scala.Boolean = js.native
  def isImportDeclaration(node: js.Object): /* is ImportDeclaration */scala.Boolean = js.native
  def isImportDeclaration(node: js.Object, opts: js.Object): /* is ImportDeclaration */scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.Object): /* is ImportDefaultSpecifier */scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.Object, opts: js.Object): /* is ImportDefaultSpecifier */scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.Object): /* is ImportNamespaceSpecifier */scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is ImportNamespaceSpecifier */scala.Boolean = js.native
  def isImportSpecifier(node: js.Object): /* is ImportSpecifier */scala.Boolean = js.native
  def isImportSpecifier(node: js.Object, opts: js.Object): /* is ImportSpecifier */scala.Boolean = js.native
  def isInferredPredicate(node: js.Object): /* is InferredPredicate */scala.Boolean = js.native
  def isInferredPredicate(node: js.Object, opts: js.Object): /* is InferredPredicate */scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.Object): /* is InterfaceDeclaration */scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.Object, opts: js.Object): /* is InterfaceDeclaration */scala.Boolean = js.native
  def isInterfaceExtends(node: js.Object): /* is InterfaceExtends */scala.Boolean = js.native
  def isInterfaceExtends(node: js.Object, opts: js.Object): /* is InterfaceExtends */scala.Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.Object): /* is InterfaceTypeAnnotation */scala.Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.Object, opts: js.Object): /* is InterfaceTypeAnnotation */scala.Boolean = js.native
  def isInterpreterDirective(node: js.Object): /* is InterpreterDirective */scala.Boolean = js.native
  def isInterpreterDirective(node: js.Object, opts: js.Object): /* is InterpreterDirective */scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.Object): /* is IntersectionTypeAnnotation */scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.Object, opts: js.Object): /* is IntersectionTypeAnnotation */scala.Boolean = js.native
  def isJSX(node: js.Object): /* is JSX */scala.Boolean = js.native
  def isJSX(node: js.Object, opts: js.Object): /* is JSX */scala.Boolean = js.native
  def isJSXAttribute(node: js.Object): /* is JSXAttribute */scala.Boolean = js.native
  def isJSXAttribute(node: js.Object, opts: js.Object): /* is JSXAttribute */scala.Boolean = js.native
  def isJSXClosingElement(node: js.Object): /* is JSXClosingElement */scala.Boolean = js.native
  def isJSXClosingElement(node: js.Object, opts: js.Object): /* is JSXClosingElement */scala.Boolean = js.native
  def isJSXClosingFragment(node: js.Object): /* is JSXClosingFragment */scala.Boolean = js.native
  def isJSXClosingFragment(node: js.Object, opts: js.Object): /* is JSXClosingFragment */scala.Boolean = js.native
  def isJSXElement(node: js.Object): /* is JSXElement */scala.Boolean = js.native
  def isJSXElement(node: js.Object, opts: js.Object): /* is JSXElement */scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.Object): /* is JSXEmptyExpression */scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.Object, opts: js.Object): /* is JSXEmptyExpression */scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.Object): /* is JSXExpressionContainer */scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.Object, opts: js.Object): /* is JSXExpressionContainer */scala.Boolean = js.native
  def isJSXFragment(node: js.Object): /* is JSXFragment */scala.Boolean = js.native
  def isJSXFragment(node: js.Object, opts: js.Object): /* is JSXFragment */scala.Boolean = js.native
  def isJSXIdentifier(node: js.Object): /* is JSXIdentifier */scala.Boolean = js.native
  def isJSXIdentifier(node: js.Object, opts: js.Object): /* is JSXIdentifier */scala.Boolean = js.native
  def isJSXMemberExpression(node: js.Object): /* is JSXMemberExpression */scala.Boolean = js.native
  def isJSXMemberExpression(node: js.Object, opts: js.Object): /* is JSXMemberExpression */scala.Boolean = js.native
  def isJSXNamespacedName(node: js.Object): /* is JSXNamespacedName */scala.Boolean = js.native
  def isJSXNamespacedName(node: js.Object, opts: js.Object): /* is JSXNamespacedName */scala.Boolean = js.native
  def isJSXOpeningElement(node: js.Object): /* is JSXOpeningElement */scala.Boolean = js.native
  def isJSXOpeningElement(node: js.Object, opts: js.Object): /* is JSXOpeningElement */scala.Boolean = js.native
  def isJSXOpeningFragment(node: js.Object): /* is JSXOpeningFragment */scala.Boolean = js.native
  def isJSXOpeningFragment(node: js.Object, opts: js.Object): /* is JSXOpeningFragment */scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.Object): /* is JSXSpreadAttribute */scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.Object, opts: js.Object): /* is JSXSpreadAttribute */scala.Boolean = js.native
  def isJSXSpreadChild(node: js.Object): /* is JSXSpreadChild */scala.Boolean = js.native
  def isJSXSpreadChild(node: js.Object, opts: js.Object): /* is JSXSpreadChild */scala.Boolean = js.native
  def isJSXText(node: js.Object): /* is JSXText */scala.Boolean = js.native
  def isJSXText(node: js.Object, opts: js.Object): /* is JSXText */scala.Boolean = js.native
  def isLVal(node: js.Object): /* is LVal */scala.Boolean = js.native
  def isLVal(node: js.Object, opts: js.Object): /* is LVal */scala.Boolean = js.native
  def isLabeledStatement(node: js.Object): /* is LabeledStatement */scala.Boolean = js.native
  def isLabeledStatement(node: js.Object, opts: js.Object): /* is LabeledStatement */scala.Boolean = js.native
  def isLiteral(node: js.Object): /* is Literal */scala.Boolean = js.native
  def isLiteral(node: js.Object, opts: js.Object): /* is Literal */scala.Boolean = js.native
  def isLogicalExpression(node: js.Object): /* is LogicalExpression */scala.Boolean = js.native
  def isLogicalExpression(node: js.Object, opts: js.Object): /* is LogicalExpression */scala.Boolean = js.native
  def isLoop(node: js.Object): /* is Loop */scala.Boolean = js.native
  def isLoop(node: js.Object, opts: js.Object): /* is Loop */scala.Boolean = js.native
  def isMemberExpression(node: js.Object): /* is MemberExpression */scala.Boolean = js.native
  def isMemberExpression(node: js.Object, opts: js.Object): /* is MemberExpression */scala.Boolean = js.native
  def isMetaProperty(node: js.Object): /* is MetaProperty */scala.Boolean = js.native
  def isMetaProperty(node: js.Object, opts: js.Object): /* is MetaProperty */scala.Boolean = js.native
  def isMethod(node: js.Object): /* is Method */scala.Boolean = js.native
  def isMethod(node: js.Object, opts: js.Object): /* is Method */scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.Object): /* is MixedTypeAnnotation */scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.Object, opts: js.Object): /* is MixedTypeAnnotation */scala.Boolean = js.native
  def isModuleDeclaration(node: js.Object): /* is ModuleDeclaration */scala.Boolean = js.native
  def isModuleDeclaration(node: js.Object, opts: js.Object): /* is ModuleDeclaration */scala.Boolean = js.native
  def isModuleSpecifier(node: js.Object): /* is ModuleSpecifier */scala.Boolean = js.native
  def isModuleSpecifier(node: js.Object, opts: js.Object): /* is ModuleSpecifier */scala.Boolean = js.native
  def isNewExpression(node: js.Object): /* is NewExpression */scala.Boolean = js.native
  def isNewExpression(node: js.Object, opts: js.Object): /* is NewExpression */scala.Boolean = js.native
  def isNoop(node: js.Object): /* is Noop */scala.Boolean = js.native
  def isNoop(node: js.Object, opts: js.Object): /* is Noop */scala.Boolean = js.native
  def isNullLiteral(node: js.Object): /* is NullLiteral */scala.Boolean = js.native
  def isNullLiteral(node: js.Object, opts: js.Object): /* is NullLiteral */scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.Object): /* is NullLiteralTypeAnnotation */scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is NullLiteralTypeAnnotation */scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.Object): /* is NullableTypeAnnotation */scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.Object, opts: js.Object): /* is NullableTypeAnnotation */scala.Boolean = js.native
  def isNumberLiteral(node: js.Object): scala.Boolean = js.native
  def isNumberLiteral(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.Object): /* is NumberLiteralTypeAnnotation */scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is NumberLiteralTypeAnnotation */scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.Object): /* is NumberTypeAnnotation */scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.Object, opts: js.Object): /* is NumberTypeAnnotation */scala.Boolean = js.native
  def isNumericLiteral(node: js.Object): /* is NumericLiteral */scala.Boolean = js.native
  def isNumericLiteral(node: js.Object, opts: js.Object): /* is NumericLiteral */scala.Boolean = js.native
  def isObjectExpression(node: js.Object): /* is ObjectExpression */scala.Boolean = js.native
  def isObjectExpression(node: js.Object, opts: js.Object): /* is ObjectExpression */scala.Boolean = js.native
  def isObjectMember(node: js.Object): /* is ObjectMember */scala.Boolean = js.native
  def isObjectMember(node: js.Object, opts: js.Object): /* is ObjectMember */scala.Boolean = js.native
  def isObjectMethod(node: js.Object): /* is ObjectMethod */scala.Boolean = js.native
  def isObjectMethod(node: js.Object, opts: js.Object): /* is ObjectMethod */scala.Boolean = js.native
  def isObjectPattern(node: js.Object): /* is ObjectPattern */scala.Boolean = js.native
  def isObjectPattern(node: js.Object, opts: js.Object): /* is ObjectPattern */scala.Boolean = js.native
  def isObjectProperty(node: js.Object): /* is ObjectProperty */scala.Boolean = js.native
  def isObjectProperty(node: js.Object, opts: js.Object): /* is ObjectProperty */scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.Object): /* is ObjectTypeAnnotation */scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.Object, opts: js.Object): /* is ObjectTypeAnnotation */scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.Object): /* is ObjectTypeCallProperty */scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.Object, opts: js.Object): /* is ObjectTypeCallProperty */scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.Object): /* is ObjectTypeIndexer */scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.Object, opts: js.Object): /* is ObjectTypeIndexer */scala.Boolean = js.native
  def isObjectTypeInternalSlot(node: js.Object): /* is ObjectTypeInternalSlot */scala.Boolean = js.native
  def isObjectTypeInternalSlot(node: js.Object, opts: js.Object): /* is ObjectTypeInternalSlot */scala.Boolean = js.native
  def isObjectTypeProperty(node: js.Object): /* is ObjectTypeProperty */scala.Boolean = js.native
  def isObjectTypeProperty(node: js.Object, opts: js.Object): /* is ObjectTypeProperty */scala.Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.Object): /* is ObjectTypeSpreadProperty */scala.Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.Object, opts: js.Object): /* is ObjectTypeSpreadProperty */scala.Boolean = js.native
  def isOpaqueType(node: js.Object): /* is OpaqueType */scala.Boolean = js.native
  def isOpaqueType(node: js.Object, opts: js.Object): /* is OpaqueType */scala.Boolean = js.native
  def isOptionalCallExpression(node: js.Object): /* is OptionalCallExpression */scala.Boolean = js.native
  def isOptionalCallExpression(node: js.Object, opts: js.Object): /* is OptionalCallExpression */scala.Boolean = js.native
  def isOptionalMemberExpression(node: js.Object): /* is OptionalMemberExpression */scala.Boolean = js.native
  def isOptionalMemberExpression(node: js.Object, opts: js.Object): /* is OptionalMemberExpression */scala.Boolean = js.native
  def isParenthesizedExpression(node: js.Object): /* is ParenthesizedExpression */scala.Boolean = js.native
  def isParenthesizedExpression(node: js.Object, opts: js.Object): /* is ParenthesizedExpression */scala.Boolean = js.native
  def isPattern(node: js.Object): /* is Pattern */scala.Boolean = js.native
  def isPattern(node: js.Object, opts: js.Object): /* is Pattern */scala.Boolean = js.native
  def isPatternLike(node: js.Object): /* is PatternLike */scala.Boolean = js.native
  def isPatternLike(node: js.Object, opts: js.Object): /* is PatternLike */scala.Boolean = js.native
  def isPrivate(node: js.Object): /* is Private */scala.Boolean = js.native
  def isPrivate(node: js.Object, opts: js.Object): /* is Private */scala.Boolean = js.native
  def isPrivateName(node: js.Object): /* is PrivateName */scala.Boolean = js.native
  def isPrivateName(node: js.Object, opts: js.Object): /* is PrivateName */scala.Boolean = js.native
  def isProgram(node: js.Object): /* is Program */scala.Boolean = js.native
  def isProgram(node: js.Object, opts: js.Object): /* is Program */scala.Boolean = js.native
  def isProperty(node: js.Object): /* is Property */scala.Boolean = js.native
  def isProperty(node: js.Object, opts: js.Object): /* is Property */scala.Boolean = js.native
  def isPureish(node: js.Object): /* is Pureish */scala.Boolean = js.native
  def isPureish(node: js.Object, opts: js.Object): /* is Pureish */scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.Object): /* is QualifiedTypeIdentifier */scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.Object, opts: js.Object): /* is QualifiedTypeIdentifier */scala.Boolean = js.native
  def isRegExpLiteral(node: js.Object): /* is RegExpLiteral */scala.Boolean = js.native
  def isRegExpLiteral(node: js.Object, opts: js.Object): /* is RegExpLiteral */scala.Boolean = js.native
  def isRegexLiteral(node: js.Object): scala.Boolean = js.native
  def isRegexLiteral(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isRestElement(node: js.Object): /* is RestElement */scala.Boolean = js.native
  def isRestElement(node: js.Object, opts: js.Object): /* is RestElement */scala.Boolean = js.native
  def isRestProperty(node: js.Object): scala.Boolean = js.native
  def isRestProperty(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isReturnStatement(node: js.Object): /* is ReturnStatement */scala.Boolean = js.native
  def isReturnStatement(node: js.Object, opts: js.Object): /* is ReturnStatement */scala.Boolean = js.native
  def isScopable(node: js.Object): /* is Scopable */scala.Boolean = js.native
  def isScopable(node: js.Object, opts: js.Object): /* is Scopable */scala.Boolean = js.native
  def isSequenceExpression(node: js.Object): /* is SequenceExpression */scala.Boolean = js.native
  def isSequenceExpression(node: js.Object, opts: js.Object): /* is SequenceExpression */scala.Boolean = js.native
  def isSpreadElement(node: js.Object): /* is SpreadElement */scala.Boolean = js.native
  def isSpreadElement(node: js.Object, opts: js.Object): /* is SpreadElement */scala.Boolean = js.native
  def isSpreadProperty(node: js.Object): scala.Boolean = js.native
  def isSpreadProperty(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isStatement(node: js.Object): /* is Statement */scala.Boolean = js.native
  def isStatement(node: js.Object, opts: js.Object): /* is Statement */scala.Boolean = js.native
  def isStringLiteral(node: js.Object): /* is StringLiteral */scala.Boolean = js.native
  def isStringLiteral(node: js.Object, opts: js.Object): /* is StringLiteral */scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.Object): /* is StringLiteralTypeAnnotation */scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is StringLiteralTypeAnnotation */scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.Object): /* is StringTypeAnnotation */scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.Object, opts: js.Object): /* is StringTypeAnnotation */scala.Boolean = js.native
  def isSuper(node: js.Object): /* is Super */scala.Boolean = js.native
  def isSuper(node: js.Object, opts: js.Object): /* is Super */scala.Boolean = js.native
  def isSwitchCase(node: js.Object): /* is SwitchCase */scala.Boolean = js.native
  def isSwitchCase(node: js.Object, opts: js.Object): /* is SwitchCase */scala.Boolean = js.native
  def isSwitchStatement(node: js.Object): /* is SwitchStatement */scala.Boolean = js.native
  def isSwitchStatement(node: js.Object, opts: js.Object): /* is SwitchStatement */scala.Boolean = js.native
  def isTSAnyKeyword(node: js.Object): /* is TSAnyKeyword */scala.Boolean = js.native
  def isTSAnyKeyword(node: js.Object, opts: js.Object): /* is TSAnyKeyword */scala.Boolean = js.native
  def isTSArrayType(node: js.Object): /* is TSArrayType */scala.Boolean = js.native
  def isTSArrayType(node: js.Object, opts: js.Object): /* is TSArrayType */scala.Boolean = js.native
  def isTSAsExpression(node: js.Object): /* is TSAsExpression */scala.Boolean = js.native
  def isTSAsExpression(node: js.Object, opts: js.Object): /* is TSAsExpression */scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.Object): /* is TSBooleanKeyword */scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.Object, opts: js.Object): /* is TSBooleanKeyword */scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.Object): /* is TSCallSignatureDeclaration */scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.Object, opts: js.Object): /* is TSCallSignatureDeclaration */scala.Boolean = js.native
  def isTSConditionalType(node: js.Object): /* is TSConditionalType */scala.Boolean = js.native
  def isTSConditionalType(node: js.Object, opts: js.Object): /* is TSConditionalType */scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.Object): /* is TSConstructSignatureDeclaration */scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.Object, opts: js.Object): /* is TSConstructSignatureDeclaration */scala.Boolean = js.native
  def isTSConstructorType(node: js.Object): /* is TSConstructorType */scala.Boolean = js.native
  def isTSConstructorType(node: js.Object, opts: js.Object): /* is TSConstructorType */scala.Boolean = js.native
  def isTSDeclareFunction(node: js.Object): /* is TSDeclareFunction */scala.Boolean = js.native
  def isTSDeclareFunction(node: js.Object, opts: js.Object): /* is TSDeclareFunction */scala.Boolean = js.native
  def isTSDeclareMethod(node: js.Object): /* is TSDeclareMethod */scala.Boolean = js.native
  def isTSDeclareMethod(node: js.Object, opts: js.Object): /* is TSDeclareMethod */scala.Boolean = js.native
  def isTSEntityName(node: js.Object): /* is TSEntityName */scala.Boolean = js.native
  def isTSEntityName(node: js.Object, opts: js.Object): /* is TSEntityName */scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.Object): /* is TSEnumDeclaration */scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.Object, opts: js.Object): /* is TSEnumDeclaration */scala.Boolean = js.native
  def isTSEnumMember(node: js.Object): /* is TSEnumMember */scala.Boolean = js.native
  def isTSEnumMember(node: js.Object, opts: js.Object): /* is TSEnumMember */scala.Boolean = js.native
  def isTSExportAssignment(node: js.Object): /* is TSExportAssignment */scala.Boolean = js.native
  def isTSExportAssignment(node: js.Object, opts: js.Object): /* is TSExportAssignment */scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.Object): /* is TSExpressionWithTypeArguments */scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.Object, opts: js.Object): /* is TSExpressionWithTypeArguments */scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.Object): /* is TSExternalModuleReference */scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.Object, opts: js.Object): /* is TSExternalModuleReference */scala.Boolean = js.native
  def isTSFunctionType(node: js.Object): /* is TSFunctionType */scala.Boolean = js.native
  def isTSFunctionType(node: js.Object, opts: js.Object): /* is TSFunctionType */scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.Object): /* is TSImportEqualsDeclaration */scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.Object, opts: js.Object): /* is TSImportEqualsDeclaration */scala.Boolean = js.native
  def isTSIndexSignature(node: js.Object): /* is TSIndexSignature */scala.Boolean = js.native
  def isTSIndexSignature(node: js.Object, opts: js.Object): /* is TSIndexSignature */scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.Object): /* is TSIndexedAccessType */scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.Object, opts: js.Object): /* is TSIndexedAccessType */scala.Boolean = js.native
  def isTSInferType(node: js.Object): /* is TSInferType */scala.Boolean = js.native
  def isTSInferType(node: js.Object, opts: js.Object): /* is TSInferType */scala.Boolean = js.native
  def isTSInterfaceBody(node: js.Object): /* is TSInterfaceBody */scala.Boolean = js.native
  def isTSInterfaceBody(node: js.Object, opts: js.Object): /* is TSInterfaceBody */scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.Object): /* is TSInterfaceDeclaration */scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.Object, opts: js.Object): /* is TSInterfaceDeclaration */scala.Boolean = js.native
  def isTSIntersectionType(node: js.Object): /* is TSIntersectionType */scala.Boolean = js.native
  def isTSIntersectionType(node: js.Object, opts: js.Object): /* is TSIntersectionType */scala.Boolean = js.native
  def isTSLiteralType(node: js.Object): /* is TSLiteralType */scala.Boolean = js.native
  def isTSLiteralType(node: js.Object, opts: js.Object): /* is TSLiteralType */scala.Boolean = js.native
  def isTSMappedType(node: js.Object): /* is TSMappedType */scala.Boolean = js.native
  def isTSMappedType(node: js.Object, opts: js.Object): /* is TSMappedType */scala.Boolean = js.native
  def isTSMethodSignature(node: js.Object): /* is TSMethodSignature */scala.Boolean = js.native
  def isTSMethodSignature(node: js.Object, opts: js.Object): /* is TSMethodSignature */scala.Boolean = js.native
  def isTSModuleBlock(node: js.Object): /* is TSModuleBlock */scala.Boolean = js.native
  def isTSModuleBlock(node: js.Object, opts: js.Object): /* is TSModuleBlock */scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.Object): /* is TSModuleDeclaration */scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.Object, opts: js.Object): /* is TSModuleDeclaration */scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.Object): /* is TSNamespaceExportDeclaration */scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.Object, opts: js.Object): /* is TSNamespaceExportDeclaration */scala.Boolean = js.native
  def isTSNeverKeyword(node: js.Object): /* is TSNeverKeyword */scala.Boolean = js.native
  def isTSNeverKeyword(node: js.Object, opts: js.Object): /* is TSNeverKeyword */scala.Boolean = js.native
  def isTSNonNullExpression(node: js.Object): /* is TSNonNullExpression */scala.Boolean = js.native
  def isTSNonNullExpression(node: js.Object, opts: js.Object): /* is TSNonNullExpression */scala.Boolean = js.native
  def isTSNullKeyword(node: js.Object): /* is TSNullKeyword */scala.Boolean = js.native
  def isTSNullKeyword(node: js.Object, opts: js.Object): /* is TSNullKeyword */scala.Boolean = js.native
  def isTSNumberKeyword(node: js.Object): /* is TSNumberKeyword */scala.Boolean = js.native
  def isTSNumberKeyword(node: js.Object, opts: js.Object): /* is TSNumberKeyword */scala.Boolean = js.native
  def isTSObjectKeyword(node: js.Object): /* is TSObjectKeyword */scala.Boolean = js.native
  def isTSObjectKeyword(node: js.Object, opts: js.Object): /* is TSObjectKeyword */scala.Boolean = js.native
  def isTSOptionalType(node: js.Object): /* is TSOptionalType */scala.Boolean = js.native
  def isTSOptionalType(node: js.Object, opts: js.Object): /* is TSOptionalType */scala.Boolean = js.native
  def isTSParameterProperty(node: js.Object): /* is TSParameterProperty */scala.Boolean = js.native
  def isTSParameterProperty(node: js.Object, opts: js.Object): /* is TSParameterProperty */scala.Boolean = js.native
  def isTSParenthesizedType(node: js.Object): /* is TSParenthesizedType */scala.Boolean = js.native
  def isTSParenthesizedType(node: js.Object, opts: js.Object): /* is TSParenthesizedType */scala.Boolean = js.native
  def isTSPropertySignature(node: js.Object): /* is TSPropertySignature */scala.Boolean = js.native
  def isTSPropertySignature(node: js.Object, opts: js.Object): /* is TSPropertySignature */scala.Boolean = js.native
  def isTSQualifiedName(node: js.Object): /* is TSQualifiedName */scala.Boolean = js.native
  def isTSQualifiedName(node: js.Object, opts: js.Object): /* is TSQualifiedName */scala.Boolean = js.native
  def isTSRestType(node: js.Object): /* is TSRestType */scala.Boolean = js.native
  def isTSRestType(node: js.Object, opts: js.Object): /* is TSRestType */scala.Boolean = js.native
  def isTSStringKeyword(node: js.Object): /* is TSStringKeyword */scala.Boolean = js.native
  def isTSStringKeyword(node: js.Object, opts: js.Object): /* is TSStringKeyword */scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.Object): /* is TSSymbolKeyword */scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.Object, opts: js.Object): /* is TSSymbolKeyword */scala.Boolean = js.native
  def isTSThisType(node: js.Object): /* is TSThisType */scala.Boolean = js.native
  def isTSThisType(node: js.Object, opts: js.Object): /* is TSThisType */scala.Boolean = js.native
  def isTSTupleType(node: js.Object): /* is TSTupleType */scala.Boolean = js.native
  def isTSTupleType(node: js.Object, opts: js.Object): /* is TSTupleType */scala.Boolean = js.native
  def isTSType(node: js.Object): /* is TSType */scala.Boolean = js.native
  def isTSType(node: js.Object, opts: js.Object): /* is TSType */scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.Object): /* is TSTypeAliasDeclaration */scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.Object, opts: js.Object): /* is TSTypeAliasDeclaration */scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.Object): /* is TSTypeAnnotation */scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.Object, opts: js.Object): /* is TSTypeAnnotation */scala.Boolean = js.native
  def isTSTypeAssertion(node: js.Object): /* is TSTypeAssertion */scala.Boolean = js.native
  def isTSTypeAssertion(node: js.Object, opts: js.Object): /* is TSTypeAssertion */scala.Boolean = js.native
  def isTSTypeElement(node: js.Object): /* is TSTypeElement */scala.Boolean = js.native
  def isTSTypeElement(node: js.Object, opts: js.Object): /* is TSTypeElement */scala.Boolean = js.native
  def isTSTypeLiteral(node: js.Object): /* is TSTypeLiteral */scala.Boolean = js.native
  def isTSTypeLiteral(node: js.Object, opts: js.Object): /* is TSTypeLiteral */scala.Boolean = js.native
  def isTSTypeOperator(node: js.Object): /* is TSTypeOperator */scala.Boolean = js.native
  def isTSTypeOperator(node: js.Object, opts: js.Object): /* is TSTypeOperator */scala.Boolean = js.native
  def isTSTypeParameter(node: js.Object): /* is TSTypeParameter */scala.Boolean = js.native
  def isTSTypeParameter(node: js.Object, opts: js.Object): /* is TSTypeParameter */scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.Object): /* is TSTypeParameterDeclaration */scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is TSTypeParameterDeclaration */scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.Object): /* is TSTypeParameterInstantiation */scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is TSTypeParameterInstantiation */scala.Boolean = js.native
  def isTSTypePredicate(node: js.Object): /* is TSTypePredicate */scala.Boolean = js.native
  def isTSTypePredicate(node: js.Object, opts: js.Object): /* is TSTypePredicate */scala.Boolean = js.native
  def isTSTypeQuery(node: js.Object): /* is TSTypeQuery */scala.Boolean = js.native
  def isTSTypeQuery(node: js.Object, opts: js.Object): /* is TSTypeQuery */scala.Boolean = js.native
  def isTSTypeReference(node: js.Object): /* is TSTypeReference */scala.Boolean = js.native
  def isTSTypeReference(node: js.Object, opts: js.Object): /* is TSTypeReference */scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.Object): /* is TSUndefinedKeyword */scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.Object, opts: js.Object): /* is TSUndefinedKeyword */scala.Boolean = js.native
  def isTSUnionType(node: js.Object): /* is TSUnionType */scala.Boolean = js.native
  def isTSUnionType(node: js.Object, opts: js.Object): /* is TSUnionType */scala.Boolean = js.native
  def isTSUnknownKeyword(node: js.Object): /* is TSUnknownKeyword */scala.Boolean = js.native
  def isTSUnknownKeyword(node: js.Object, opts: js.Object): /* is TSUnknownKeyword */scala.Boolean = js.native
  def isTSVoidKeyword(node: js.Object): /* is TSVoidKeyword */scala.Boolean = js.native
  def isTSVoidKeyword(node: js.Object, opts: js.Object): /* is TSVoidKeyword */scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.Object): /* is TaggedTemplateExpression */scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.Object, opts: js.Object): /* is TaggedTemplateExpression */scala.Boolean = js.native
  def isTemplateElement(node: js.Object): /* is TemplateElement */scala.Boolean = js.native
  def isTemplateElement(node: js.Object, opts: js.Object): /* is TemplateElement */scala.Boolean = js.native
  def isTemplateLiteral(node: js.Object): /* is TemplateLiteral */scala.Boolean = js.native
  def isTemplateLiteral(node: js.Object, opts: js.Object): /* is TemplateLiteral */scala.Boolean = js.native
  def isTerminatorless(node: js.Object): /* is Terminatorless */scala.Boolean = js.native
  def isTerminatorless(node: js.Object, opts: js.Object): /* is Terminatorless */scala.Boolean = js.native
  def isThisExpression(node: js.Object): /* is ThisExpression */scala.Boolean = js.native
  def isThisExpression(node: js.Object, opts: js.Object): /* is ThisExpression */scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.Object): /* is ThisTypeAnnotation */scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.Object, opts: js.Object): /* is ThisTypeAnnotation */scala.Boolean = js.native
  def isThrowStatement(node: js.Object): /* is ThrowStatement */scala.Boolean = js.native
  def isThrowStatement(node: js.Object, opts: js.Object): /* is ThrowStatement */scala.Boolean = js.native
  def isTryStatement(node: js.Object): /* is TryStatement */scala.Boolean = js.native
  def isTryStatement(node: js.Object, opts: js.Object): /* is TryStatement */scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.Object): /* is TupleTypeAnnotation */scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.Object, opts: js.Object): /* is TupleTypeAnnotation */scala.Boolean = js.native
  def isTypeAlias(node: js.Object): /* is TypeAlias */scala.Boolean = js.native
  def isTypeAlias(node: js.Object, opts: js.Object): /* is TypeAlias */scala.Boolean = js.native
  def isTypeAnnotation(node: js.Object): /* is TypeAnnotation */scala.Boolean = js.native
  def isTypeAnnotation(node: js.Object, opts: js.Object): /* is TypeAnnotation */scala.Boolean = js.native
  def isTypeCastExpression(node: js.Object): /* is TypeCastExpression */scala.Boolean = js.native
  def isTypeCastExpression(node: js.Object, opts: js.Object): /* is TypeCastExpression */scala.Boolean = js.native
  def isTypeParameter(node: js.Object): /* is TypeParameter */scala.Boolean = js.native
  def isTypeParameter(node: js.Object, opts: js.Object): /* is TypeParameter */scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.Object): /* is TypeParameterDeclaration */scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is TypeParameterDeclaration */scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.Object): /* is TypeParameterInstantiation */scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is TypeParameterInstantiation */scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.Object): /* is TypeofTypeAnnotation */scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.Object, opts: js.Object): /* is TypeofTypeAnnotation */scala.Boolean = js.native
  def isUnaryExpression(node: js.Object): /* is UnaryExpression */scala.Boolean = js.native
  def isUnaryExpression(node: js.Object, opts: js.Object): /* is UnaryExpression */scala.Boolean = js.native
  def isUnaryLike(node: js.Object): /* is UnaryLike */scala.Boolean = js.native
  def isUnaryLike(node: js.Object, opts: js.Object): /* is UnaryLike */scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.Object): /* is UnionTypeAnnotation */scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.Object, opts: js.Object): /* is UnionTypeAnnotation */scala.Boolean = js.native
  def isUpdateExpression(node: js.Object): /* is UpdateExpression */scala.Boolean = js.native
  def isUpdateExpression(node: js.Object, opts: js.Object): /* is UpdateExpression */scala.Boolean = js.native
  def isUserWhitespacable(node: js.Object): /* is UserWhitespacable */scala.Boolean = js.native
  def isUserWhitespacable(node: js.Object, opts: js.Object): /* is UserWhitespacable */scala.Boolean = js.native
  def isVariableDeclaration(node: js.Object): /* is VariableDeclaration */scala.Boolean = js.native
  def isVariableDeclaration(node: js.Object, opts: js.Object): /* is VariableDeclaration */scala.Boolean = js.native
  def isVariableDeclarator(node: js.Object): /* is VariableDeclarator */scala.Boolean = js.native
  def isVariableDeclarator(node: js.Object, opts: js.Object): /* is VariableDeclarator */scala.Boolean = js.native
  def isVariance(node: js.Object): /* is Variance */scala.Boolean = js.native
  def isVariance(node: js.Object, opts: js.Object): /* is Variance */scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.Object): /* is VoidTypeAnnotation */scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.Object, opts: js.Object): /* is VoidTypeAnnotation */scala.Boolean = js.native
  def isWhile(node: js.Object): /* is While */scala.Boolean = js.native
  def isWhile(node: js.Object, opts: js.Object): /* is While */scala.Boolean = js.native
  def isWhileStatement(node: js.Object): /* is WhileStatement */scala.Boolean = js.native
  def isWhileStatement(node: js.Object, opts: js.Object): /* is WhileStatement */scala.Boolean = js.native
  def isWithStatement(node: js.Object): /* is WithStatement */scala.Boolean = js.native
  def isWithStatement(node: js.Object, opts: js.Object): /* is WithStatement */scala.Boolean = js.native
  def isYieldExpression(node: js.Object): /* is YieldExpression */scala.Boolean = js.native
  def isYieldExpression(node: js.Object, opts: js.Object): /* is YieldExpression */scala.Boolean = js.native
  def jsxAttribute(name: atBabelTypesLib.typesMod.JSXIdentifier): atBabelTypesLib.typesMod.JSXAttribute = js.native
  def jsxAttribute(name: atBabelTypesLib.typesMod.JSXIdentifier, value: atBabelTypesLib.typesMod.JSXElement): atBabelTypesLib.typesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.typesMod.JSXIdentifier,
    value: atBabelTypesLib.typesMod.JSXExpressionContainer
  ): atBabelTypesLib.typesMod.JSXAttribute = js.native
  def jsxAttribute(name: atBabelTypesLib.typesMod.JSXIdentifier, value: atBabelTypesLib.typesMod.JSXFragment): atBabelTypesLib.typesMod.JSXAttribute = js.native
  def jsxAttribute(name: atBabelTypesLib.typesMod.JSXIdentifier, value: atBabelTypesLib.typesMod.StringLiteral): atBabelTypesLib.typesMod.JSXAttribute = js.native
  def jsxAttribute(name: atBabelTypesLib.typesMod.JSXNamespacedName): atBabelTypesLib.typesMod.JSXAttribute = js.native
  def jsxAttribute(name: atBabelTypesLib.typesMod.JSXNamespacedName, value: atBabelTypesLib.typesMod.JSXElement): atBabelTypesLib.typesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.typesMod.JSXNamespacedName,
    value: atBabelTypesLib.typesMod.JSXExpressionContainer
  ): atBabelTypesLib.typesMod.JSXAttribute = js.native
  def jsxAttribute(name: atBabelTypesLib.typesMod.JSXNamespacedName, value: atBabelTypesLib.typesMod.JSXFragment): atBabelTypesLib.typesMod.JSXAttribute = js.native
  def jsxAttribute(name: atBabelTypesLib.typesMod.JSXNamespacedName, value: atBabelTypesLib.typesMod.StringLiteral): atBabelTypesLib.typesMod.JSXAttribute = js.native
  def jsxClosingElement(name: atBabelTypesLib.typesMod.JSXIdentifier): atBabelTypesLib.typesMod.JSXClosingElement = js.native
  def jsxClosingElement(name: atBabelTypesLib.typesMod.JSXMemberExpression): atBabelTypesLib.typesMod.JSXClosingElement = js.native
  def jsxClosingFragment(): atBabelTypesLib.typesMod.JSXClosingFragment = js.native
  def jsxElement(
    openingElement: atBabelTypesLib.typesMod.JSXOpeningElement,
    closingElement: atBabelTypesLib.typesMod.JSXClosingElement,
    children: js.Array[
      atBabelTypesLib.typesMod.JSXText | atBabelTypesLib.typesMod.JSXExpressionContainer | atBabelTypesLib.typesMod.JSXSpreadChild | atBabelTypesLib.typesMod.JSXElement | atBabelTypesLib.typesMod.JSXFragment
    ],
    selfClosing: js.Any
  ): atBabelTypesLib.typesMod.JSXElement = js.native
  def jsxElement(
    openingElement: atBabelTypesLib.typesMod.JSXOpeningElement,
    closingElement: js.UndefOr[scala.Nothing],
    children: js.Array[
      atBabelTypesLib.typesMod.JSXText | atBabelTypesLib.typesMod.JSXExpressionContainer | atBabelTypesLib.typesMod.JSXSpreadChild | atBabelTypesLib.typesMod.JSXElement | atBabelTypesLib.typesMod.JSXFragment
    ],
    selfClosing: js.Any
  ): atBabelTypesLib.typesMod.JSXElement = js.native
  def jsxElement(
    openingElement: atBabelTypesLib.typesMod.JSXOpeningElement,
    closingElement: scala.Null,
    children: js.Array[
      atBabelTypesLib.typesMod.JSXText | atBabelTypesLib.typesMod.JSXExpressionContainer | atBabelTypesLib.typesMod.JSXSpreadChild | atBabelTypesLib.typesMod.JSXElement | atBabelTypesLib.typesMod.JSXFragment
    ],
    selfClosing: js.Any
  ): atBabelTypesLib.typesMod.JSXElement = js.native
  def jsxEmptyExpression(): atBabelTypesLib.typesMod.JSXEmptyExpression = js.native
  def jsxExpressionContainer(expression: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.JSXExpressionContainer = js.native
  def jsxExpressionContainer(expression: atBabelTypesLib.typesMod.JSXEmptyExpression): atBabelTypesLib.typesMod.JSXExpressionContainer = js.native
  def jsxFragment(
    openingFragment: atBabelTypesLib.typesMod.JSXOpeningFragment,
    closingFragment: atBabelTypesLib.typesMod.JSXClosingFragment,
    children: js.Array[
      atBabelTypesLib.typesMod.JSXText | atBabelTypesLib.typesMod.JSXExpressionContainer | atBabelTypesLib.typesMod.JSXSpreadChild | atBabelTypesLib.typesMod.JSXElement | atBabelTypesLib.typesMod.JSXFragment
    ]
  ): atBabelTypesLib.typesMod.JSXFragment = js.native
  def jsxIdentifier(name: java.lang.String): atBabelTypesLib.typesMod.JSXIdentifier = js.native
  def jsxMemberExpression(`object`: atBabelTypesLib.typesMod.JSXIdentifier, property: atBabelTypesLib.typesMod.JSXIdentifier): atBabelTypesLib.typesMod.JSXMemberExpression = js.native
  def jsxMemberExpression(
    `object`: atBabelTypesLib.typesMod.JSXMemberExpression,
    property: atBabelTypesLib.typesMod.JSXIdentifier
  ): atBabelTypesLib.typesMod.JSXMemberExpression = js.native
  def jsxNamespacedName(namespace: atBabelTypesLib.typesMod.JSXIdentifier, name: atBabelTypesLib.typesMod.JSXIdentifier): atBabelTypesLib.typesMod.JSXNamespacedName = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.typesMod.JSXIdentifier,
    attributes: js.Array[
      atBabelTypesLib.typesMod.JSXAttribute | atBabelTypesLib.typesMod.JSXSpreadAttribute
    ]
  ): atBabelTypesLib.typesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.typesMod.JSXIdentifier,
    attributes: js.Array[
      atBabelTypesLib.typesMod.JSXAttribute | atBabelTypesLib.typesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean
  ): atBabelTypesLib.typesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.typesMod.JSXIdentifier,
    attributes: js.Array[
      atBabelTypesLib.typesMod.JSXAttribute | atBabelTypesLib.typesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.typesMod.JSXIdentifier,
    attributes: js.Array[
      atBabelTypesLib.typesMod.JSXAttribute | atBabelTypesLib.typesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.typesMod.JSXMemberExpression,
    attributes: js.Array[
      atBabelTypesLib.typesMod.JSXAttribute | atBabelTypesLib.typesMod.JSXSpreadAttribute
    ]
  ): atBabelTypesLib.typesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.typesMod.JSXMemberExpression,
    attributes: js.Array[
      atBabelTypesLib.typesMod.JSXAttribute | atBabelTypesLib.typesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean
  ): atBabelTypesLib.typesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.typesMod.JSXMemberExpression,
    attributes: js.Array[
      atBabelTypesLib.typesMod.JSXAttribute | atBabelTypesLib.typesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.typesMod.JSXMemberExpression,
    attributes: js.Array[
      atBabelTypesLib.typesMod.JSXAttribute | atBabelTypesLib.typesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.JSXOpeningElement = js.native
  def jsxOpeningFragment(): atBabelTypesLib.typesMod.JSXOpeningFragment = js.native
  def jsxSpreadAttribute(argument: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.JSXSpreadAttribute = js.native
  def jsxSpreadChild(expression: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.JSXSpreadChild = js.native
  def jsxText(value: java.lang.String): atBabelTypesLib.typesMod.JSXText = js.native
  def labeledStatement(label: atBabelTypesLib.typesMod.Identifier, body: atBabelTypesLib.typesMod.Statement): atBabelTypesLib.typesMod.LabeledStatement = js.native
  @JSName("logicalExpression")
  def `logicalExpression_&&`(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`&&`,
    left: atBabelTypesLib.typesMod.Expression,
    right: atBabelTypesLib.typesMod.Expression
  ): atBabelTypesLib.typesMod.LogicalExpression = js.native
  @JSName("logicalExpression")
  def `logicalExpression_??`(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`??`,
    left: atBabelTypesLib.typesMod.Expression,
    right: atBabelTypesLib.typesMod.Expression
  ): atBabelTypesLib.typesMod.LogicalExpression = js.native
  @JSName("logicalExpression")
  def `logicalExpression_||`(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`||`,
    left: atBabelTypesLib.typesMod.Expression,
    right: atBabelTypesLib.typesMod.Expression
  ): atBabelTypesLib.typesMod.LogicalExpression = js.native
  def memberExpression(`object`: atBabelTypesLib.typesMod.Expression, property: js.Any): atBabelTypesLib.typesMod.MemberExpression = js.native
  def memberExpression(`object`: atBabelTypesLib.typesMod.Expression, property: js.Any, computed: scala.Boolean): atBabelTypesLib.typesMod.MemberExpression = js.native
  def memberExpression(
    `object`: atBabelTypesLib.typesMod.Expression,
    property: js.Any,
    computed: scala.Boolean,
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`
  ): atBabelTypesLib.typesMod.MemberExpression = js.native
  def memberExpression(
    `object`: atBabelTypesLib.typesMod.Expression,
    property: js.Any,
    computed: scala.Boolean,
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`
  ): atBabelTypesLib.typesMod.MemberExpression = js.native
  def metaProperty(meta: atBabelTypesLib.typesMod.Identifier, property: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.MetaProperty = js.native
  def mixedTypeAnnotation(): atBabelTypesLib.typesMod.MixedTypeAnnotation = js.native
  def newExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ]
  ): atBabelTypesLib.typesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`
  ): atBabelTypesLib.typesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`,
    typeArguments: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`,
    typeArguments: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`
  ): atBabelTypesLib.typesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`,
    typeArguments: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`,
    typeArguments: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: scala.Null,
    typeArguments: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: scala.Null,
    typeArguments: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: scala.Null,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.NewExpression = js.native
  def noop(): atBabelTypesLib.typesMod.Noop = js.native
  def nullLiteral(): atBabelTypesLib.typesMod.NullLiteral = js.native
  def nullLiteralTypeAnnotation(): atBabelTypesLib.typesMod.NullLiteralTypeAnnotation = js.native
  def nullableTypeAnnotation(typeAnnotation: atBabelTypesLib.typesMod.FlowType): atBabelTypesLib.typesMod.NullableTypeAnnotation = js.native
  def numberLiteralTypeAnnotation(value: scala.Double): atBabelTypesLib.typesMod.NumberLiteralTypeAnnotation = js.native
  def numberTypeAnnotation(): atBabelTypesLib.typesMod.NumberTypeAnnotation = js.native
  def numericLiteral(value: scala.Double): atBabelTypesLib.typesMod.NumericLiteral = js.native
  def objectExpression(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectMethod | atBabelTypesLib.typesMod.ObjectProperty | atBabelTypesLib.typesMod.SpreadElement
    ]
  ): atBabelTypesLib.typesMod.ObjectExpression = js.native
  def objectMethod(
    kind: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.method | atBabelCoreLib.atBabelCoreLibStrings.get | atBabelCoreLib.atBabelCoreLibStrings.set
    ],
    key: js.Any,
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    body: atBabelTypesLib.typesMod.BlockStatement,
    computed: js.UndefOr[scala.Boolean],
    async: js.UndefOr[scala.Boolean],
    decorators: js.UndefOr[js.Array[atBabelTypesLib.typesMod.Decorator] | scala.Null],
    generator: js.UndefOr[scala.Boolean],
    returnType: js.UndefOr[
      atBabelTypesLib.typesMod.TypeAnnotation | atBabelTypesLib.typesMod.TSTypeAnnotation | atBabelTypesLib.typesMod.Noop | scala.Null
    ],
    typeParameters: js.UndefOr[
      atBabelTypesLib.typesMod.TypeParameterDeclaration | atBabelTypesLib.typesMod.TSTypeParameterDeclaration | atBabelTypesLib.typesMod.Noop | scala.Null
    ]
  ): atBabelTypesLib.typesMod.ObjectMethod = js.native
  def objectPattern(
    properties: js.Array[atBabelTypesLib.typesMod.RestElement | atBabelTypesLib.typesMod.ObjectProperty]
  ): atBabelTypesLib.typesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[atBabelTypesLib.typesMod.RestElement | atBabelTypesLib.typesMod.ObjectProperty],
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator]
  ): atBabelTypesLib.typesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[atBabelTypesLib.typesMod.RestElement | atBabelTypesLib.typesMod.ObjectProperty],
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[atBabelTypesLib.typesMod.RestElement | atBabelTypesLib.typesMod.ObjectProperty],
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[atBabelTypesLib.typesMod.RestElement | atBabelTypesLib.typesMod.ObjectProperty],
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[atBabelTypesLib.typesMod.RestElement | atBabelTypesLib.typesMod.ObjectProperty],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[atBabelTypesLib.typesMod.RestElement | atBabelTypesLib.typesMod.ObjectProperty],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[atBabelTypesLib.typesMod.RestElement | atBabelTypesLib.typesMod.ObjectProperty],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.ObjectPattern = js.native
  def objectProperty(key: js.Any, value: atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.PatternLike): atBabelTypesLib.typesMod.ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.PatternLike,
    computed: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.PatternLike,
    computed: scala.Boolean,
    shorthand: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.PatternLike,
    computed: scala.Boolean,
    shorthand: scala.Boolean,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator]
  ): atBabelTypesLib.typesMod.ObjectProperty = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ]
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.typesMod.ObjectTypeIndexer]
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.typesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.typesMod.ObjectTypeCallProperty]
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.typesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.typesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.typesMod.ObjectTypeInternalSlot]
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.typesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.typesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.typesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.typesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.typesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.typesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.typesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.typesMod.ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.typesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.typesMod.ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.typesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.typesMod.ObjectTypeInternalSlot]
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.typesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.typesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.typesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.typesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.typesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.typesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.typesMod.ObjectTypeCallProperty]
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.typesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.typesMod.ObjectTypeInternalSlot]
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.typesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.typesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.typesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.typesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.typesMod.ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.typesMod.ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.typesMod.ObjectTypeInternalSlot]
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.typesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.typesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.typesMod.ObjectTypeProperty | atBabelTypesLib.typesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeAnnotation = js.native
  def objectTypeCallProperty(value: atBabelTypesLib.typesMod.FlowType): atBabelTypesLib.typesMod.ObjectTypeCallProperty = js.native
  def objectTypeCallProperty(value: atBabelTypesLib.typesMod.FlowType, _static: scala.Boolean): atBabelTypesLib.typesMod.ObjectTypeCallProperty = js.native
  def objectTypeIndexer(
    id: atBabelTypesLib.typesMod.Identifier,
    key: atBabelTypesLib.typesMod.FlowType,
    value: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: atBabelTypesLib.typesMod.Identifier,
    key: atBabelTypesLib.typesMod.FlowType,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance
  ): atBabelTypesLib.typesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: atBabelTypesLib.typesMod.Identifier,
    key: atBabelTypesLib.typesMod.FlowType,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    _static: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: atBabelTypesLib.typesMod.Identifier,
    key: atBabelTypesLib.typesMod.FlowType,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: scala.Null,
    _static: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: atBabelTypesLib.typesMod.FlowType,
    value: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: atBabelTypesLib.typesMod.FlowType,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance
  ): atBabelTypesLib.typesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: atBabelTypesLib.typesMod.FlowType,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    _static: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: atBabelTypesLib.typesMod.FlowType,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: scala.Null,
    _static: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: scala.Null, key: atBabelTypesLib.typesMod.FlowType, value: atBabelTypesLib.typesMod.FlowType): atBabelTypesLib.typesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: scala.Null,
    key: atBabelTypesLib.typesMod.FlowType,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance
  ): atBabelTypesLib.typesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: scala.Null,
    key: atBabelTypesLib.typesMod.FlowType,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    _static: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: scala.Null,
    key: atBabelTypesLib.typesMod.FlowType,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: scala.Null,
    _static: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeIndexer = js.native
  def objectTypeInternalSlot(
    id: atBabelTypesLib.typesMod.Identifier,
    value: atBabelTypesLib.typesMod.FlowType,
    optional: scala.Boolean,
    _static: scala.Boolean,
    method: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeInternalSlot = js.native
  def objectTypeProperty(key: atBabelTypesLib.typesMod.Identifier, value: atBabelTypesLib.typesMod.FlowType): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: atBabelTypesLib.typesMod.Identifier,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  def objectTypeProperty(key: atBabelTypesLib.typesMod.StringLiteral, value: atBabelTypesLib.typesMod.FlowType): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: atBabelTypesLib.typesMod.StringLiteral,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.typesMod.Identifier,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.typesMod.Identifier,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get,
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.typesMod.Identifier,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get,
    optional: scala.Boolean,
    proto: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.typesMod.Identifier,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get,
    optional: scala.Boolean,
    proto: scala.Boolean,
    _static: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.typesMod.StringLiteral,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.typesMod.StringLiteral,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get,
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.typesMod.StringLiteral,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get,
    optional: scala.Boolean,
    proto: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.typesMod.StringLiteral,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get,
    optional: scala.Boolean,
    proto: scala.Boolean,
    _static: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.typesMod.Identifier,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.typesMod.Identifier,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init,
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.typesMod.Identifier,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init,
    optional: scala.Boolean,
    proto: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.typesMod.Identifier,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init,
    optional: scala.Boolean,
    proto: scala.Boolean,
    _static: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.typesMod.StringLiteral,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.typesMod.StringLiteral,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init,
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.typesMod.StringLiteral,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init,
    optional: scala.Boolean,
    proto: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.typesMod.StringLiteral,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init,
    optional: scala.Boolean,
    proto: scala.Boolean,
    _static: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.typesMod.Identifier,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.typesMod.Identifier,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set,
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.typesMod.Identifier,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set,
    optional: scala.Boolean,
    proto: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.typesMod.Identifier,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set,
    optional: scala.Boolean,
    proto: scala.Boolean,
    _static: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.typesMod.StringLiteral,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.typesMod.StringLiteral,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set,
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.typesMod.StringLiteral,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set,
    optional: scala.Boolean,
    proto: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.typesMod.StringLiteral,
    value: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set,
    optional: scala.Boolean,
    proto: scala.Boolean,
    _static: scala.Boolean
  ): atBabelTypesLib.typesMod.ObjectTypeProperty = js.native
  def objectTypeSpreadProperty(argument: atBabelTypesLib.typesMod.FlowType): atBabelTypesLib.typesMod.ObjectTypeSpreadProperty = js.native
  def opaqueType(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    supertype: atBabelTypesLib.typesMod.FlowType | js.UndefOr[scala.Nothing],
    impltype: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    supertype: scala.Null,
    impltype: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: atBabelTypesLib.typesMod.FlowType | js.UndefOr[scala.Nothing],
    impltype: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: scala.Null,
    impltype: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    supertype: atBabelTypesLib.typesMod.FlowType | js.UndefOr[scala.Nothing],
    impltype: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    supertype: scala.Null,
    impltype: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.OpaqueType = js.native
  def optionalCallExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: scala.Boolean,
    typeArguments: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: scala.Boolean,
    typeArguments: atBabelTypesLib.typesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: atBabelTypesLib.typesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.typesMod.Expression | atBabelTypesLib.typesMod.SpreadElement | atBabelTypesLib.typesMod.JSXNamespacedName
    ],
    optional: scala.Boolean,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.OptionalCallExpression = js.native
  def optionalMemberExpression(
    `object`: atBabelTypesLib.typesMod.Expression,
    property: js.Any,
    computed: js.UndefOr[scala.Nothing],
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.OptionalMemberExpression = js.native
  def optionalMemberExpression(
    `object`: atBabelTypesLib.typesMod.Expression,
    property: js.Any,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.OptionalMemberExpression = js.native
  def parenthesizedExpression(expression: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.ParenthesizedExpression = js.native
  def privateName(id: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.PrivateName = js.native
  def program(body: js.Array[atBabelTypesLib.typesMod.Statement]): atBabelTypesLib.typesMod.Program = js.native
  def program(
    body: js.Array[atBabelTypesLib.typesMod.Statement],
    directives: js.Array[atBabelTypesLib.typesMod.Directive]
  ): atBabelTypesLib.typesMod.Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[atBabelTypesLib.typesMod.Statement],
    directives: js.Array[atBabelTypesLib.typesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.module
  ): atBabelTypesLib.typesMod.Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[atBabelTypesLib.typesMod.Statement],
    directives: js.Array[atBabelTypesLib.typesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.module,
    interpreter: atBabelTypesLib.typesMod.InterpreterDirective
  ): atBabelTypesLib.typesMod.Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[atBabelTypesLib.typesMod.Statement],
    directives: js.Array[atBabelTypesLib.typesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.module,
    interpreter: atBabelTypesLib.typesMod.InterpreterDirective,
    sourceFile: java.lang.String
  ): atBabelTypesLib.typesMod.Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[atBabelTypesLib.typesMod.Statement],
    directives: js.Array[atBabelTypesLib.typesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.module,
    interpreter: scala.Null,
    sourceFile: java.lang.String
  ): atBabelTypesLib.typesMod.Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[atBabelTypesLib.typesMod.Statement],
    directives: js.Array[atBabelTypesLib.typesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.script
  ): atBabelTypesLib.typesMod.Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[atBabelTypesLib.typesMod.Statement],
    directives: js.Array[atBabelTypesLib.typesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.script,
    interpreter: atBabelTypesLib.typesMod.InterpreterDirective
  ): atBabelTypesLib.typesMod.Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[atBabelTypesLib.typesMod.Statement],
    directives: js.Array[atBabelTypesLib.typesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.script,
    interpreter: atBabelTypesLib.typesMod.InterpreterDirective,
    sourceFile: java.lang.String
  ): atBabelTypesLib.typesMod.Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[atBabelTypesLib.typesMod.Statement],
    directives: js.Array[atBabelTypesLib.typesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.script,
    interpreter: scala.Null,
    sourceFile: java.lang.String
  ): atBabelTypesLib.typesMod.Program = js.native
  def qualifiedTypeIdentifier(id: atBabelTypesLib.typesMod.Identifier, qualification: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.QualifiedTypeIdentifier = js.native
  def qualifiedTypeIdentifier(
    id: atBabelTypesLib.typesMod.Identifier,
    qualification: atBabelTypesLib.typesMod.QualifiedTypeIdentifier
  ): atBabelTypesLib.typesMod.QualifiedTypeIdentifier = js.native
  def regExpLiteral(pattern: java.lang.String): atBabelTypesLib.typesMod.RegExpLiteral = js.native
  def regExpLiteral(pattern: java.lang.String, flags: java.lang.String): atBabelTypesLib.typesMod.RegExpLiteral = js.native
  def removeProperties(n: atBabelTypesLib.typesMod.Node): scala.Unit = js.native
  def removeProperties(n: atBabelTypesLib.typesMod.Node, opts: atBabelTypesLib.Anon_PreserveComments): scala.Unit = js.native
  def removePropertiesDeep[T /* <: atBabelTypesLib.typesMod.Node */](n: T): T = js.native
  def removePropertiesDeep[T /* <: atBabelTypesLib.typesMod.Node */](n: T, opts: atBabelTypesLib.Anon_PreserveComments): T = js.native
  def restElement(argument: atBabelTypesLib.typesMod.LVal): atBabelTypesLib.typesMod.RestElement = js.native
  def restElement(argument: atBabelTypesLib.typesMod.LVal, decorators: js.Array[atBabelTypesLib.typesMod.Decorator]): atBabelTypesLib.typesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.typesMod.LVal,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.typesMod.LVal,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.typesMod.LVal,
    decorators: js.Array[atBabelTypesLib.typesMod.Decorator],
    typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.typesMod.LVal,
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.typesMod.LVal,
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.typesMod.LVal,
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.RestElement = js.native
  def returnStatement(): atBabelTypesLib.typesMod.ReturnStatement = js.native
  def returnStatement(argument: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.ReturnStatement = js.native
  def sequenceExpression(expressions: js.Array[atBabelTypesLib.typesMod.Expression]): atBabelTypesLib.typesMod.SequenceExpression = js.native
  def spreadElement(argument: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.SpreadElement = js.native
  def stringLiteral(value: java.lang.String): atBabelTypesLib.typesMod.StringLiteral = js.native
  def stringLiteralTypeAnnotation(value: java.lang.String): atBabelTypesLib.typesMod.StringLiteralTypeAnnotation = js.native
  def stringTypeAnnotation(): atBabelTypesLib.typesMod.StringTypeAnnotation = js.native
  def switchCase(
    test: atBabelTypesLib.typesMod.Expression | js.UndefOr[scala.Nothing],
    consequent: js.Array[atBabelTypesLib.typesMod.Statement]
  ): atBabelTypesLib.typesMod.SwitchCase = js.native
  def switchCase(test: scala.Null, consequent: js.Array[atBabelTypesLib.typesMod.Statement]): atBabelTypesLib.typesMod.SwitchCase = js.native
  def switchStatement(
    discriminant: atBabelTypesLib.typesMod.Expression,
    cases: js.Array[atBabelTypesLib.typesMod.SwitchCase]
  ): atBabelTypesLib.typesMod.SwitchStatement = js.native
  def taggedTemplateExpression(tag: atBabelTypesLib.typesMod.Expression, quasi: atBabelTypesLib.typesMod.TemplateLiteral): atBabelTypesLib.typesMod.TaggedTemplateExpression = js.native
  def taggedTemplateExpression(
    tag: atBabelTypesLib.typesMod.Expression,
    quasi: atBabelTypesLib.typesMod.TemplateLiteral,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.TaggedTemplateExpression = js.native
  def taggedTemplateExpression(
    tag: atBabelTypesLib.typesMod.Expression,
    quasi: atBabelTypesLib.typesMod.TemplateLiteral,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterInstantiation
  ): atBabelTypesLib.typesMod.TaggedTemplateExpression = js.native
  def templateElement(value: js.Any): atBabelTypesLib.typesMod.TemplateElement = js.native
  def templateElement(value: js.Any, tail: scala.Boolean): atBabelTypesLib.typesMod.TemplateElement = js.native
  def templateLiteral(
    quasis: js.Array[atBabelTypesLib.typesMod.TemplateElement],
    expressions: js.Array[atBabelTypesLib.typesMod.Expression]
  ): atBabelTypesLib.typesMod.TemplateLiteral = js.native
  def thisExpression(): atBabelTypesLib.typesMod.ThisExpression = js.native
  def thisTypeAnnotation(): atBabelTypesLib.typesMod.ThisTypeAnnotation = js.native
  def throwStatement(argument: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.ThrowStatement = js.native
  def traverse[T](n: atBabelTypesLib.typesMod.Node, h: atBabelTypesLib.typesMod.TraversalHandler[T]): scala.Unit = js.native
  def traverse[T](n: atBabelTypesLib.typesMod.Node, h: atBabelTypesLib.typesMod.TraversalHandlers[T]): scala.Unit = js.native
  def traverse[T](n: atBabelTypesLib.typesMod.Node, h: atBabelTypesLib.typesMod.TraversalHandlers[T], state: T): scala.Unit = js.native
  def traverse[T](n: atBabelTypesLib.typesMod.Node, h: atBabelTypesLib.typesMod.TraversalHandler[T], state: T): scala.Unit = js.native
  def tryStatement(block: atBabelTypesLib.typesMod.BlockStatement): atBabelTypesLib.typesMod.TryStatement = js.native
  def tryStatement(block: atBabelTypesLib.typesMod.BlockStatement, handler: atBabelTypesLib.typesMod.CatchClause): atBabelTypesLib.typesMod.TryStatement = js.native
  def tryStatement(
    block: atBabelTypesLib.typesMod.BlockStatement,
    handler: atBabelTypesLib.typesMod.CatchClause,
    finalizer: atBabelTypesLib.typesMod.BlockStatement
  ): atBabelTypesLib.typesMod.TryStatement = js.native
  def tryStatement(
    block: atBabelTypesLib.typesMod.BlockStatement,
    handler: scala.Null,
    finalizer: atBabelTypesLib.typesMod.BlockStatement
  ): atBabelTypesLib.typesMod.TryStatement = js.native
  def tsAnyKeyword(): atBabelTypesLib.typesMod.TSAnyKeyword = js.native
  def tsArrayType(elementType: atBabelTypesLib.typesMod.TSType): atBabelTypesLib.typesMod.TSArrayType = js.native
  def tsAsExpression(expression: atBabelTypesLib.typesMod.Expression, typeAnnotation: atBabelTypesLib.typesMod.TSType): atBabelTypesLib.typesMod.TSAsExpression = js.native
  def tsBooleanKeyword(): atBabelTypesLib.typesMod.TSBooleanKeyword = js.native
  def tsCallSignatureDeclaration(): atBabelTypesLib.typesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration): atBabelTypesLib.typesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement]
  ): atBabelTypesLib.typesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    parameters: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement]
  ): atBabelTypesLib.typesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSCallSignatureDeclaration = js.native
  def tsConditionalType(
    checkType: atBabelTypesLib.typesMod.TSType,
    extendsType: atBabelTypesLib.typesMod.TSType,
    trueType: atBabelTypesLib.typesMod.TSType,
    falseType: atBabelTypesLib.typesMod.TSType
  ): atBabelTypesLib.typesMod.TSConditionalType = js.native
  def tsConstructSignatureDeclaration(): atBabelTypesLib.typesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration): atBabelTypesLib.typesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement]
  ): atBabelTypesLib.typesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    parameters: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement]
  ): atBabelTypesLib.typesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructorType(): atBabelTypesLib.typesMod.TSConstructorType = js.native
  def tsConstructorType(typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration): atBabelTypesLib.typesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement]
  ): atBabelTypesLib.typesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    typeAnnotation: scala.Null,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement]
  ): atBabelTypesLib.typesMod.TSConstructorType = js.native
  def tsConstructorType(typeParameters: scala.Null, typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation): atBabelTypesLib.typesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement]
  ): atBabelTypesLib.typesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: scala.Null,
    typeAnnotation: scala.Null,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement]
  ): atBabelTypesLib.typesMod.TSConstructorType = js.native
  def tsDeclareFunction(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.Noop,
    params: js.Array[atBabelTypesLib.typesMod.LVal]
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    params: js.Array[atBabelTypesLib.typesMod.LVal]
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal]
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal]
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[scala.Nothing],
    typeParameters: atBabelTypesLib.typesMod.Noop,
    params: js.Array[atBabelTypesLib.typesMod.LVal]
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[scala.Nothing],
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    params: js.Array[atBabelTypesLib.typesMod.LVal]
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal]
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[atBabelTypesLib.typesMod.Identifier | scala.Null],
    typeParameters: js.UndefOr[
      atBabelTypesLib.typesMod.TSTypeParameterDeclaration | atBabelTypesLib.typesMod.Noop | scala.Null
    ],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation | atBabelTypesLib.typesMod.Noop
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[atBabelTypesLib.typesMod.Identifier | scala.Null],
    typeParameters: js.UndefOr[
      atBabelTypesLib.typesMod.TSTypeParameterDeclaration | atBabelTypesLib.typesMod.Noop | scala.Null
    ],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation | atBabelTypesLib.typesMod.Noop,
    async: scala.Boolean
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[atBabelTypesLib.typesMod.Identifier | scala.Null],
    typeParameters: js.UndefOr[
      atBabelTypesLib.typesMod.TSTypeParameterDeclaration | atBabelTypesLib.typesMod.Noop | scala.Null
    ],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation | atBabelTypesLib.typesMod.Noop,
    async: scala.Boolean,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[atBabelTypesLib.typesMod.Identifier | scala.Null],
    typeParameters: js.UndefOr[
      atBabelTypesLib.typesMod.TSTypeParameterDeclaration | atBabelTypesLib.typesMod.Noop | scala.Null
    ],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    returnType: atBabelTypesLib.typesMod.TSTypeAnnotation | atBabelTypesLib.typesMod.Noop,
    async: scala.Boolean,
    declare: scala.Boolean,
    generator: scala.Boolean
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[scala.Nothing],
    typeParameters: scala.Null,
    params: js.Array[atBabelTypesLib.typesMod.LVal]
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: scala.Null,
    typeParameters: atBabelTypesLib.typesMod.Noop,
    params: js.Array[atBabelTypesLib.typesMod.LVal]
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: scala.Null,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    params: js.Array[atBabelTypesLib.typesMod.LVal]
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: scala.Null,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.typesMod.LVal]
  ): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(id: scala.Null, typeParameters: scala.Null, params: js.Array[atBabelTypesLib.typesMod.LVal]): atBabelTypesLib.typesMod.TSDeclareFunction = js.native
  def tsDeclareMethod(
    decorators: js.UndefOr[js.Array[atBabelTypesLib.typesMod.Decorator] | scala.Null],
    key: atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.StringLiteral | atBabelTypesLib.typesMod.NumericLiteral | atBabelTypesLib.typesMod.Expression,
    typeParameters: js.UndefOr[
      atBabelTypesLib.typesMod.TSTypeParameterDeclaration | atBabelTypesLib.typesMod.Noop | scala.Null
    ],
    params: js.Array[atBabelTypesLib.typesMod.LVal],
    returnType: js.UndefOr[
      atBabelTypesLib.typesMod.TSTypeAnnotation | atBabelTypesLib.typesMod.Noop | scala.Null
    ],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    access: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.public | atBabelCoreLib.atBabelCoreLibStrings.`private` | atBabelCoreLib.atBabelCoreLibStrings.`protected` | scala.Null
    ],
    accessibility: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.public | atBabelCoreLib.atBabelCoreLibStrings.`private` | atBabelCoreLib.atBabelCoreLibStrings.`protected` | scala.Null
    ],
    async: js.UndefOr[scala.Boolean],
    computed: js.UndefOr[scala.Boolean],
    generator: js.UndefOr[scala.Boolean],
    kind: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.get | atBabelCoreLib.atBabelCoreLibStrings.set | atBabelCoreLib.atBabelCoreLibStrings.method | atBabelCoreLib.atBabelCoreLibStrings.constructor
    ],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    _static: js.UndefOr[scala.Boolean | scala.Null]
  ): atBabelTypesLib.typesMod.TSDeclareMethod = js.native
  def tsEnumDeclaration(id: atBabelTypesLib.typesMod.Identifier, members: js.Array[atBabelTypesLib.typesMod.TSEnumMember]): atBabelTypesLib.typesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    members: js.Array[atBabelTypesLib.typesMod.TSEnumMember],
    _const: scala.Boolean
  ): atBabelTypesLib.typesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    members: js.Array[atBabelTypesLib.typesMod.TSEnumMember],
    _const: scala.Boolean,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    members: js.Array[atBabelTypesLib.typesMod.TSEnumMember],
    _const: scala.Boolean,
    declare: scala.Boolean,
    initializer: atBabelTypesLib.typesMod.Expression
  ): atBabelTypesLib.typesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    members: js.Array[atBabelTypesLib.typesMod.TSEnumMember],
    _const: scala.Boolean,
    declare: scala.Null,
    initializer: atBabelTypesLib.typesMod.Expression
  ): atBabelTypesLib.typesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    members: js.Array[atBabelTypesLib.typesMod.TSEnumMember],
    _const: scala.Null,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    members: js.Array[atBabelTypesLib.typesMod.TSEnumMember],
    _const: scala.Null,
    declare: scala.Boolean,
    initializer: atBabelTypesLib.typesMod.Expression
  ): atBabelTypesLib.typesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    members: js.Array[atBabelTypesLib.typesMod.TSEnumMember],
    _const: scala.Null,
    declare: scala.Null,
    initializer: atBabelTypesLib.typesMod.Expression
  ): atBabelTypesLib.typesMod.TSEnumDeclaration = js.native
  def tsEnumMember(id: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.TSEnumMember = js.native
  def tsEnumMember(id: atBabelTypesLib.typesMod.Identifier, initializer: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.TSEnumMember = js.native
  def tsEnumMember(id: atBabelTypesLib.typesMod.StringLiteral): atBabelTypesLib.typesMod.TSEnumMember = js.native
  def tsEnumMember(id: atBabelTypesLib.typesMod.StringLiteral, initializer: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.TSEnumMember = js.native
  def tsExportAssignment(expression: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.TSExportAssignment = js.native
  def tsExpressionWithTypeArguments(expression: atBabelTypesLib.typesMod.TSEntityName): atBabelTypesLib.typesMod.TSExpressionWithTypeArguments = js.native
  def tsExpressionWithTypeArguments(
    expression: atBabelTypesLib.typesMod.TSEntityName,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.TSExpressionWithTypeArguments = js.native
  def tsExternalModuleReference(expression: atBabelTypesLib.typesMod.StringLiteral): atBabelTypesLib.typesMod.TSExternalModuleReference = js.native
  def tsFunctionType(): atBabelTypesLib.typesMod.TSFunctionType = js.native
  def tsFunctionType(typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration): atBabelTypesLib.typesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement]
  ): atBabelTypesLib.typesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    typeAnnotation: scala.Null,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement]
  ): atBabelTypesLib.typesMod.TSFunctionType = js.native
  def tsFunctionType(typeParameters: scala.Null, typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation): atBabelTypesLib.typesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement]
  ): atBabelTypesLib.typesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: scala.Null,
    typeAnnotation: scala.Null,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement]
  ): atBabelTypesLib.typesMod.TSFunctionType = js.native
  def tsImportEqualsDeclaration(id: atBabelTypesLib.typesMod.Identifier, moduleReference: atBabelTypesLib.typesMod.TSEntityName): atBabelTypesLib.typesMod.TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    moduleReference: atBabelTypesLib.typesMod.TSEntityName,
    isExport: scala.Boolean
  ): atBabelTypesLib.typesMod.TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    moduleReference: atBabelTypesLib.typesMod.TSExternalModuleReference
  ): atBabelTypesLib.typesMod.TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    moduleReference: atBabelTypesLib.typesMod.TSExternalModuleReference,
    isExport: scala.Boolean
  ): atBabelTypesLib.typesMod.TSImportEqualsDeclaration = js.native
  def tsIndexSignature(parameters: js.Array[atBabelTypesLib.typesMod.Identifier]): atBabelTypesLib.typesMod.TSIndexSignature = js.native
  def tsIndexSignature(
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSIndexSignature = js.native
  def tsIndexSignature(
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation,
    readonly: scala.Boolean
  ): atBabelTypesLib.typesMod.TSIndexSignature = js.native
  def tsIndexSignature(
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier],
    typeAnnotation: scala.Null,
    readonly: scala.Boolean
  ): atBabelTypesLib.typesMod.TSIndexSignature = js.native
  def tsIndexedAccessType(objectType: atBabelTypesLib.typesMod.TSType, indexType: atBabelTypesLib.typesMod.TSType): atBabelTypesLib.typesMod.TSIndexedAccessType = js.native
  def tsInferType(typeParameter: atBabelTypesLib.typesMod.TSTypeParameter): atBabelTypesLib.typesMod.TSInferType = js.native
  def tsInterfaceBody(body: js.Array[atBabelTypesLib.typesMod.TSTypeElement]): atBabelTypesLib.typesMod.TSInterfaceBody = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.typesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.typesMod.TSInterfaceBody
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.typesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.typesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.TSInterfaceBody
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.TSInterfaceBody
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.typesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.typesMod.TSInterfaceBody
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.typesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.typesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.TSInterfaceBody
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.TSInterfaceBody
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.typesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.typesMod.TSInterfaceBody
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.typesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.typesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.TSInterfaceBody
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.typesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.TSInterfaceBody
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.typesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSInterfaceDeclaration = js.native
  def tsIntersectionType(types: js.Array[atBabelTypesLib.typesMod.TSType]): atBabelTypesLib.typesMod.TSIntersectionType = js.native
  def tsLiteralType(literal: atBabelTypesLib.typesMod.BooleanLiteral): atBabelTypesLib.typesMod.TSLiteralType = js.native
  def tsLiteralType(literal: atBabelTypesLib.typesMod.NumericLiteral): atBabelTypesLib.typesMod.TSLiteralType = js.native
  def tsLiteralType(literal: atBabelTypesLib.typesMod.StringLiteral): atBabelTypesLib.typesMod.TSLiteralType = js.native
  def tsMappedType(typeParameter: atBabelTypesLib.typesMod.TSTypeParameter): atBabelTypesLib.typesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.typesMod.TSTypeParameter,
    typeAnnotation: atBabelTypesLib.typesMod.TSType
  ): atBabelTypesLib.typesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.typesMod.TSTypeParameter,
    typeAnnotation: atBabelTypesLib.typesMod.TSType,
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.typesMod.TSTypeParameter,
    typeAnnotation: atBabelTypesLib.typesMod.TSType,
    optional: scala.Boolean,
    readonly: scala.Boolean
  ): atBabelTypesLib.typesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.typesMod.TSTypeParameter,
    typeAnnotation: atBabelTypesLib.typesMod.TSType,
    optional: scala.Null,
    readonly: scala.Boolean
  ): atBabelTypesLib.typesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.typesMod.TSTypeParameter,
    typeAnnotation: scala.Null,
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.typesMod.TSTypeParameter,
    typeAnnotation: scala.Null,
    optional: scala.Boolean,
    readonly: scala.Boolean
  ): atBabelTypesLib.typesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.typesMod.TSTypeParameter,
    typeAnnotation: scala.Null,
    optional: scala.Null,
    readonly: scala.Boolean
  ): atBabelTypesLib.typesMod.TSMappedType = js.native
  def tsMethodSignature(key: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.typesMod.Expression,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration
  ): atBabelTypesLib.typesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.typesMod.Expression,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement]
  ): atBabelTypesLib.typesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.typesMod.Expression,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.typesMod.Expression,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation,
    computed: scala.Boolean
  ): atBabelTypesLib.typesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.typesMod.Expression,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    parameters: js.Array[atBabelTypesLib.typesMod.Identifier | atBabelTypesLib.typesMod.RestElement],
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.TSMethodSignature = js.native
  def tsModuleBlock(body: js.Array[atBabelTypesLib.typesMod.Statement]): atBabelTypesLib.typesMod.TSModuleBlock = js.native
  def tsModuleDeclaration(id: atBabelTypesLib.typesMod.Identifier, body: atBabelTypesLib.typesMod.TSModuleBlock): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    body: atBabelTypesLib.typesMod.TSModuleBlock,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    body: atBabelTypesLib.typesMod.TSModuleBlock,
    declare: scala.Boolean,
    global: scala.Boolean
  ): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    body: atBabelTypesLib.typesMod.TSModuleBlock,
    declare: scala.Null,
    global: scala.Boolean
  ): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: atBabelTypesLib.typesMod.Identifier, body: atBabelTypesLib.typesMod.TSModuleDeclaration): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    body: atBabelTypesLib.typesMod.TSModuleDeclaration,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    body: atBabelTypesLib.typesMod.TSModuleDeclaration,
    declare: scala.Boolean,
    global: scala.Boolean
  ): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    body: atBabelTypesLib.typesMod.TSModuleDeclaration,
    declare: scala.Null,
    global: scala.Boolean
  ): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: atBabelTypesLib.typesMod.StringLiteral, body: atBabelTypesLib.typesMod.TSModuleBlock): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.typesMod.StringLiteral,
    body: atBabelTypesLib.typesMod.TSModuleBlock,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.typesMod.StringLiteral,
    body: atBabelTypesLib.typesMod.TSModuleBlock,
    declare: scala.Boolean,
    global: scala.Boolean
  ): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.typesMod.StringLiteral,
    body: atBabelTypesLib.typesMod.TSModuleBlock,
    declare: scala.Null,
    global: scala.Boolean
  ): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: atBabelTypesLib.typesMod.StringLiteral, body: atBabelTypesLib.typesMod.TSModuleDeclaration): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.typesMod.StringLiteral,
    body: atBabelTypesLib.typesMod.TSModuleDeclaration,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.typesMod.StringLiteral,
    body: atBabelTypesLib.typesMod.TSModuleDeclaration,
    declare: scala.Boolean,
    global: scala.Boolean
  ): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.typesMod.StringLiteral,
    body: atBabelTypesLib.typesMod.TSModuleDeclaration,
    declare: scala.Null,
    global: scala.Boolean
  ): atBabelTypesLib.typesMod.TSModuleDeclaration = js.native
  def tsNamespaceExportDeclaration(id: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.TSNamespaceExportDeclaration = js.native
  def tsNeverKeyword(): atBabelTypesLib.typesMod.TSNeverKeyword = js.native
  def tsNonNullExpression(expression: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.TSNonNullExpression = js.native
  def tsNullKeyword(): atBabelTypesLib.typesMod.TSNullKeyword = js.native
  def tsNumberKeyword(): atBabelTypesLib.typesMod.TSNumberKeyword = js.native
  def tsObjectKeyword(): atBabelTypesLib.typesMod.TSObjectKeyword = js.native
  def tsOptionalType(typeAnnotation: atBabelTypesLib.typesMod.TSType): atBabelTypesLib.typesMod.TSOptionalType = js.native
  def tsParameterProperty(parameter: atBabelTypesLib.typesMod.AssignmentPattern): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  def tsParameterProperty(
    parameter: atBabelTypesLib.typesMod.AssignmentPattern,
    accessibility: scala.Null,
    readonly: scala.Boolean
  ): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  def tsParameterProperty(parameter: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  def tsParameterProperty(parameter: atBabelTypesLib.typesMod.Identifier, accessibility: scala.Null, readonly: scala.Boolean): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(
    parameter: atBabelTypesLib.typesMod.AssignmentPattern,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`private`
  ): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(
    parameter: atBabelTypesLib.typesMod.AssignmentPattern,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`private`,
    readonly: scala.Boolean
  ): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(
    parameter: atBabelTypesLib.typesMod.Identifier,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`private`
  ): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(
    parameter: atBabelTypesLib.typesMod.Identifier,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`private`,
    readonly: scala.Boolean
  ): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(
    parameter: atBabelTypesLib.typesMod.AssignmentPattern,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`protected`
  ): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(
    parameter: atBabelTypesLib.typesMod.AssignmentPattern,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`protected`,
    readonly: scala.Boolean
  ): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(
    parameter: atBabelTypesLib.typesMod.Identifier,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`protected`
  ): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(
    parameter: atBabelTypesLib.typesMod.Identifier,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`protected`,
    readonly: scala.Boolean
  ): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(
    parameter: atBabelTypesLib.typesMod.AssignmentPattern,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.public
  ): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(
    parameter: atBabelTypesLib.typesMod.AssignmentPattern,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.public,
    readonly: scala.Boolean
  ): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(
    parameter: atBabelTypesLib.typesMod.Identifier,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.public
  ): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(
    parameter: atBabelTypesLib.typesMod.Identifier,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.public,
    readonly: scala.Boolean
  ): atBabelTypesLib.typesMod.TSParameterProperty = js.native
  def tsParenthesizedType(typeAnnotation: atBabelTypesLib.typesMod.TSType): atBabelTypesLib.typesMod.TSParenthesizedType = js.native
  def tsPropertySignature(key: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.typesMod.Expression,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.typesMod.Expression,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation,
    initializer: atBabelTypesLib.typesMod.Expression
  ): atBabelTypesLib.typesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.typesMod.Expression,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation,
    initializer: atBabelTypesLib.typesMod.Expression,
    computed: scala.Boolean
  ): atBabelTypesLib.typesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.typesMod.Expression,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation,
    initializer: atBabelTypesLib.typesMod.Expression,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): atBabelTypesLib.typesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.typesMod.Expression,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation,
    initializer: atBabelTypesLib.typesMod.Expression,
    computed: scala.Boolean,
    optional: scala.Boolean,
    readonly: scala.Boolean
  ): atBabelTypesLib.typesMod.TSPropertySignature = js.native
  def tsQualifiedName(left: atBabelTypesLib.typesMod.TSEntityName, right: atBabelTypesLib.typesMod.Identifier): atBabelTypesLib.typesMod.TSQualifiedName = js.native
  def tsRestType(typeAnnotation: atBabelTypesLib.typesMod.TSType): atBabelTypesLib.typesMod.TSRestType = js.native
  def tsStringKeyword(): atBabelTypesLib.typesMod.TSStringKeyword = js.native
  def tsSymbolKeyword(): atBabelTypesLib.typesMod.TSSymbolKeyword = js.native
  def tsThisType(): atBabelTypesLib.typesMod.TSThisType = js.native
  def tsTupleType(elementTypes: js.Array[atBabelTypesLib.typesMod.TSType]): atBabelTypesLib.typesMod.TSTupleType = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    typeAnnotation: atBabelTypesLib.typesMod.TSType
  ): atBabelTypesLib.typesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterDeclaration,
    typeAnnotation: atBabelTypesLib.typesMod.TSType,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    typeAnnotation: atBabelTypesLib.typesMod.TSType
  ): atBabelTypesLib.typesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    typeAnnotation: atBabelTypesLib.typesMod.TSType,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TSType
  ): atBabelTypesLib.typesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    typeAnnotation: atBabelTypesLib.typesMod.TSType,
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAnnotation(typeAnnotation: atBabelTypesLib.typesMod.TSType): atBabelTypesLib.typesMod.TSTypeAnnotation = js.native
  def tsTypeAssertion(typeAnnotation: atBabelTypesLib.typesMod.TSType, expression: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.TSTypeAssertion = js.native
  def tsTypeLiteral(members: js.Array[atBabelTypesLib.typesMod.TSTypeElement]): atBabelTypesLib.typesMod.TSTypeLiteral = js.native
  def tsTypeOperator(typeAnnotation: atBabelTypesLib.typesMod.TSType): atBabelTypesLib.typesMod.TSTypeOperator = js.native
  def tsTypeOperator(typeAnnotation: atBabelTypesLib.typesMod.TSType, operator: java.lang.String): atBabelTypesLib.typesMod.TSTypeOperator = js.native
  def tsTypeParameter(): atBabelTypesLib.typesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: atBabelTypesLib.typesMod.TSType): atBabelTypesLib.typesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: atBabelTypesLib.typesMod.TSType, _default: atBabelTypesLib.typesMod.TSType): atBabelTypesLib.typesMod.TSTypeParameter = js.native
  def tsTypeParameter(
    constraint: atBabelTypesLib.typesMod.TSType,
    _default: atBabelTypesLib.typesMod.TSType,
    name: java.lang.String
  ): atBabelTypesLib.typesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: atBabelTypesLib.typesMod.TSType, _default: scala.Null, name: java.lang.String): atBabelTypesLib.typesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: scala.Null, _default: atBabelTypesLib.typesMod.TSType): atBabelTypesLib.typesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: scala.Null, _default: atBabelTypesLib.typesMod.TSType, name: java.lang.String): atBabelTypesLib.typesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: scala.Null, _default: scala.Null, name: java.lang.String): atBabelTypesLib.typesMod.TSTypeParameter = js.native
  def tsTypeParameterDeclaration(params: js.Array[atBabelTypesLib.typesMod.TSTypeParameter]): atBabelTypesLib.typesMod.TSTypeParameterDeclaration = js.native
  def tsTypeParameterInstantiation(params: js.Array[atBabelTypesLib.typesMod.TSType]): atBabelTypesLib.typesMod.TSTypeParameterInstantiation = js.native
  def tsTypePredicate(
    parameterName: atBabelTypesLib.typesMod.Identifier,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSTypePredicate = js.native
  def tsTypePredicate(
    parameterName: atBabelTypesLib.typesMod.TSThisType,
    typeAnnotation: atBabelTypesLib.typesMod.TSTypeAnnotation
  ): atBabelTypesLib.typesMod.TSTypePredicate = js.native
  def tsTypeQuery(exprName: atBabelTypesLib.typesMod.TSEntityName): atBabelTypesLib.typesMod.TSTypeQuery = js.native
  def tsTypeReference(typeName: atBabelTypesLib.typesMod.TSEntityName): atBabelTypesLib.typesMod.TSTypeReference = js.native
  def tsTypeReference(
    typeName: atBabelTypesLib.typesMod.TSEntityName,
    typeParameters: atBabelTypesLib.typesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.typesMod.TSTypeReference = js.native
  def tsUndefinedKeyword(): atBabelTypesLib.typesMod.TSUndefinedKeyword = js.native
  def tsUnionType(types: js.Array[atBabelTypesLib.typesMod.TSType]): atBabelTypesLib.typesMod.TSUnionType = js.native
  def tsUnknownKeyword(): atBabelTypesLib.typesMod.TSUnknownKeyword = js.native
  def tsVoidKeyword(): atBabelTypesLib.typesMod.TSVoidKeyword = js.native
  def tupleTypeAnnotation(types: js.Array[atBabelTypesLib.typesMod.FlowType]): atBabelTypesLib.typesMod.TupleTypeAnnotation = js.native
  def typeAlias(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: atBabelTypesLib.typesMod.TypeParameterDeclaration,
    right: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.TypeAlias = js.native
  def typeAlias(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    right: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.TypeAlias = js.native
  def typeAlias(
    id: atBabelTypesLib.typesMod.Identifier,
    typeParameters: scala.Null,
    right: atBabelTypesLib.typesMod.FlowType
  ): atBabelTypesLib.typesMod.TypeAlias = js.native
  def typeAnnotation(typeAnnotation: atBabelTypesLib.typesMod.FlowType): atBabelTypesLib.typesMod.TypeAnnotation = js.native
  def typeCastExpression(
    expression: atBabelTypesLib.typesMod.Expression,
    typeAnnotation: atBabelTypesLib.typesMod.TypeAnnotation
  ): atBabelTypesLib.typesMod.TypeCastExpression = js.native
  def typeParameter(): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(bound: atBabelTypesLib.typesMod.TypeAnnotation): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(bound: atBabelTypesLib.typesMod.TypeAnnotation, _default: atBabelTypesLib.typesMod.FlowType): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.typesMod.TypeAnnotation,
    _default: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance
  ): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.typesMod.TypeAnnotation,
    _default: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    name: java.lang.String
  ): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.typesMod.TypeAnnotation,
    _default: atBabelTypesLib.typesMod.FlowType,
    variance: scala.Null,
    name: java.lang.String
  ): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.typesMod.TypeAnnotation,
    _default: scala.Null,
    variance: atBabelTypesLib.typesMod.Variance
  ): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.typesMod.TypeAnnotation,
    _default: scala.Null,
    variance: atBabelTypesLib.typesMod.Variance,
    name: java.lang.String
  ): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.typesMod.TypeAnnotation,
    _default: scala.Null,
    variance: scala.Null,
    name: java.lang.String
  ): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: atBabelTypesLib.typesMod.FlowType): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(
    bound: scala.Null,
    _default: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance
  ): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(
    bound: scala.Null,
    _default: atBabelTypesLib.typesMod.FlowType,
    variance: atBabelTypesLib.typesMod.Variance,
    name: java.lang.String
  ): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(
    bound: scala.Null,
    _default: atBabelTypesLib.typesMod.FlowType,
    variance: scala.Null,
    name: java.lang.String
  ): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: scala.Null, variance: atBabelTypesLib.typesMod.Variance): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(
    bound: scala.Null,
    _default: scala.Null,
    variance: atBabelTypesLib.typesMod.Variance,
    name: java.lang.String
  ): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: scala.Null, variance: scala.Null, name: java.lang.String): atBabelTypesLib.typesMod.TypeParameter = js.native
  def typeParameterDeclaration(params: js.Array[atBabelTypesLib.typesMod.TypeParameter]): atBabelTypesLib.typesMod.TypeParameterDeclaration = js.native
  def typeParameterInstantiation(params: js.Array[atBabelTypesLib.typesMod.FlowType]): atBabelTypesLib.typesMod.TypeParameterInstantiation = js.native
  def typeofTypeAnnotation(argument: atBabelTypesLib.typesMod.FlowType): atBabelTypesLib.typesMod.TypeofTypeAnnotation = js.native
  @JSName("unaryExpression")
  def `unaryExpression_!`(operator: atBabelCoreLib.atBabelCoreLibStrings.`!`, argument: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_!`(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`!`,
    argument: atBabelTypesLib.typesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_+`(operator: atBabelCoreLib.atBabelCoreLibStrings.`+`, argument: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_+`(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`+`,
    argument: atBabelTypesLib.typesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_-`(operator: atBabelCoreLib.atBabelCoreLibStrings.`-`, argument: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_-`(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`-`,
    argument: atBabelTypesLib.typesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(
    operator: atBabelCoreLib.atBabelCoreLibStrings.delete,
    argument: atBabelTypesLib.typesMod.Expression
  ): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(
    operator: atBabelCoreLib.atBabelCoreLibStrings.delete,
    argument: atBabelTypesLib.typesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_throw(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`throw`,
    argument: atBabelTypesLib.typesMod.Expression
  ): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_throw(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`throw`,
    argument: atBabelTypesLib.typesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(
    operator: atBabelCoreLib.atBabelCoreLibStrings.typeof,
    argument: atBabelTypesLib.typesMod.Expression
  ): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(
    operator: atBabelCoreLib.atBabelCoreLibStrings.typeof,
    argument: atBabelTypesLib.typesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(operator: atBabelCoreLib.atBabelCoreLibStrings.void, argument: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(
    operator: atBabelCoreLib.atBabelCoreLibStrings.void,
    argument: atBabelTypesLib.typesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_~`(operator: atBabelCoreLib.atBabelCoreLibStrings.`~`, argument: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_~`(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`~`,
    argument: atBabelTypesLib.typesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.typesMod.UnaryExpression = js.native
  def unionTypeAnnotation(types: js.Array[atBabelTypesLib.typesMod.FlowType]): atBabelTypesLib.typesMod.UnionTypeAnnotation = js.native
  @JSName("updateExpression")
  def `updateExpression_++`(operator: atBabelCoreLib.atBabelCoreLibStrings.`++`, argument: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_++`(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`++`,
    argument: atBabelTypesLib.typesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.typesMod.UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_--`(operator: atBabelCoreLib.atBabelCoreLibStrings.`--`, argument: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_--`(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`--`,
    argument: atBabelTypesLib.typesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.typesMod.UpdateExpression = js.native
  def validate(n: atBabelTypesLib.typesMod.Node, key: java.lang.String, value: js.Any): scala.Unit = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_const(
    kind: atBabelCoreLib.atBabelCoreLibStrings.const,
    declarations: js.Array[atBabelTypesLib.typesMod.VariableDeclarator]
  ): atBabelTypesLib.typesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_const(
    kind: atBabelCoreLib.atBabelCoreLibStrings.const,
    declarations: js.Array[atBabelTypesLib.typesMod.VariableDeclarator],
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_let(
    kind: atBabelCoreLib.atBabelCoreLibStrings.let,
    declarations: js.Array[atBabelTypesLib.typesMod.VariableDeclarator]
  ): atBabelTypesLib.typesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_let(
    kind: atBabelCoreLib.atBabelCoreLibStrings.let,
    declarations: js.Array[atBabelTypesLib.typesMod.VariableDeclarator],
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_var(
    kind: atBabelCoreLib.atBabelCoreLibStrings.`var`,
    declarations: js.Array[atBabelTypesLib.typesMod.VariableDeclarator]
  ): atBabelTypesLib.typesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_var(
    kind: atBabelCoreLib.atBabelCoreLibStrings.`var`,
    declarations: js.Array[atBabelTypesLib.typesMod.VariableDeclarator],
    declare: scala.Boolean
  ): atBabelTypesLib.typesMod.VariableDeclaration = js.native
  def variableDeclarator(id: atBabelTypesLib.typesMod.LVal): atBabelTypesLib.typesMod.VariableDeclarator = js.native
  def variableDeclarator(id: atBabelTypesLib.typesMod.LVal, init: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.VariableDeclarator = js.native
  def variableDeclarator(
    id: atBabelTypesLib.typesMod.LVal,
    init: atBabelTypesLib.typesMod.Expression,
    definite: scala.Boolean
  ): atBabelTypesLib.typesMod.VariableDeclarator = js.native
  def variableDeclarator(id: atBabelTypesLib.typesMod.LVal, init: scala.Null, definite: scala.Boolean): atBabelTypesLib.typesMod.VariableDeclarator = js.native
  @JSName("variance")
  def variance_minus(kind: atBabelCoreLib.atBabelCoreLibStrings.minus): atBabelTypesLib.typesMod.Variance = js.native
  @JSName("variance")
  def variance_plus(kind: atBabelCoreLib.atBabelCoreLibStrings.plus): atBabelTypesLib.typesMod.Variance = js.native
  def voidTypeAnnotation(): atBabelTypesLib.typesMod.VoidTypeAnnotation = js.native
  def whileStatement(test: atBabelTypesLib.typesMod.Expression, body: atBabelTypesLib.typesMod.BlockStatement): atBabelTypesLib.typesMod.WhileStatement = js.native
  def whileStatement(test: atBabelTypesLib.typesMod.Expression, body: atBabelTypesLib.typesMod.Statement): atBabelTypesLib.typesMod.WhileStatement = js.native
  def withStatement(`object`: atBabelTypesLib.typesMod.Expression, body: atBabelTypesLib.typesMod.BlockStatement): atBabelTypesLib.typesMod.WithStatement = js.native
  def withStatement(`object`: atBabelTypesLib.typesMod.Expression, body: atBabelTypesLib.typesMod.Statement): atBabelTypesLib.typesMod.WithStatement = js.native
  def yieldExpression(): atBabelTypesLib.typesMod.YieldExpression = js.native
  def yieldExpression(argument: atBabelTypesLib.typesMod.Expression): atBabelTypesLib.typesMod.YieldExpression = js.native
  def yieldExpression(argument: atBabelTypesLib.typesMod.Expression, delegate: scala.Boolean): atBabelTypesLib.typesMod.YieldExpression = js.native
  def yieldExpression(argument: scala.Null, delegate: scala.Boolean): atBabelTypesLib.typesMod.YieldExpression = js.native
}

