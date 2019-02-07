package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def anyTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.AnyTypeAnnotation = js.native
  def arrayExpression(): atBabelTypesLib.atBabelTypesMod.ArrayExpression = js.native
  def arrayExpression(
    elements: js.Array[
      scala.Null | atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.ArrayExpression = js.native
  def arrayPattern(elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike]): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayTypeAnnotation(elementType: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.ArrayTypeAnnotation = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement | atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement | atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement | atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement | atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement | atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement | atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def assignmentExpression(
    operator: java.lang.String,
    left: atBabelTypesLib.atBabelTypesMod.LVal,
    right: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.AssignmentExpression = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.ObjectPattern | atBabelTypesLib.atBabelTypesMod.ArrayPattern,
    right: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.ObjectPattern | atBabelTypesLib.atBabelTypesMod.ArrayPattern,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.ObjectPattern | atBabelTypesLib.atBabelTypesMod.ArrayPattern,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def awaitExpression(argument: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.AwaitExpression = js.native
  def bigIntLiteral(value: java.lang.String): atBabelTypesLib.atBabelTypesMod.BigIntLiteral = js.native
  def binaryExpression(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`+` | atBabelTypesLib.atBabelTypesLibStrings.`-` | atBabelTypesLib.atBabelTypesLibStrings.`/` | atBabelTypesLib.atBabelTypesLibStrings.`%` | atBabelTypesLib.atBabelTypesLibStrings.`*` | atBabelTypesLib.atBabelTypesLibStrings.`**` | atBabelTypesLib.atBabelTypesLibStrings.`&` | atBabelTypesLib.atBabelTypesLibStrings.`|` | atBabelTypesLib.atBabelTypesLibStrings.`>>` | atBabelTypesLib.atBabelTypesLibStrings.`>>>` | atBabelTypesLib.atBabelTypesLibStrings.`<<` | atBabelTypesLib.atBabelTypesLibStrings.`^` | atBabelTypesLib.atBabelTypesLibStrings.`==` | atBabelTypesLib.atBabelTypesLibStrings.`===` | atBabelTypesLib.atBabelTypesLibStrings.`!=` | atBabelTypesLib.atBabelTypesLibStrings.`!==` | atBabelTypesLib.atBabelTypesLibStrings.in | atBabelTypesLib.atBabelTypesLibStrings.instanceof | atBabelTypesLib.atBabelTypesLibStrings.`>` | atBabelTypesLib.atBabelTypesLibStrings.`<` | atBabelTypesLib.atBabelTypesLibStrings.`>=` | atBabelTypesLib.atBabelTypesLibStrings.`<=`,
    left: atBabelTypesLib.atBabelTypesMod.Expression,
    right: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.BinaryExpression = js.native
  def bindExpression(`object`: js.Any, callee: js.Any): atBabelTypesLib.atBabelTypesMod.BindExpression = js.native
  def blockStatement(body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement]): atBabelTypesLib.atBabelTypesMod.BlockStatement = js.native
  def blockStatement(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive]
  ): atBabelTypesLib.atBabelTypesMod.BlockStatement = js.native
  def booleanLiteral(value: scala.Boolean): atBabelTypesLib.atBabelTypesMod.BooleanLiteral = js.native
  def booleanLiteralTypeAnnotation(value: scala.Boolean): atBabelTypesLib.atBabelTypesMod.BooleanLiteralTypeAnnotation = js.native
  def booleanTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.BooleanTypeAnnotation = js.native
  def breakStatement(): atBabelTypesLib.atBabelTypesMod.BreakStatement = js.native
  def breakStatement(label: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.BreakStatement = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ],
    optional: scala.Null,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: scala.Null,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: scala.Null,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def catchClause(
    param: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.CatchClause = js.native
  def catchClause(param: js.UndefOr[scala.Nothing], body: atBabelTypesLib.atBabelTypesMod.BlockStatement): atBabelTypesLib.atBabelTypesMod.CatchClause = js.native
  def catchClause(param: scala.Null, body: atBabelTypesLib.atBabelTypesMod.BlockStatement): atBabelTypesLib.atBabelTypesMod.CatchClause = js.native
  def classBody(
    body: js.Array[
      atBabelTypesLib.atBabelTypesMod.ClassMethod | atBabelTypesLib.atBabelTypesMod.ClassPrivateMethod | atBabelTypesLib.atBabelTypesMod.ClassProperty | atBabelTypesLib.atBabelTypesMod.ClassPrivateProperty | atBabelTypesLib.atBabelTypesMod.TSDeclareMethod | atBabelTypesLib.atBabelTypesMod.TSIndexSignature
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassBody = js.native
  def classDeclaration(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    superClass: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.Decorator] | scala.Null],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    declare: js.UndefOr[scala.Boolean | scala.Null],
    _implements: js.UndefOr[
      (js.Array[
        atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
      ]) | scala.Null
    ],
    mixins: js.UndefOr[js.Any | scala.Null],
    superTypeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation | atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation | scala.Null
    ],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassDeclaration = js.native
  def classExpression(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    superClass: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    superClass: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    superClass: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    superClass: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    superClass: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation | atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    superClass: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation | atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classImplements(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.ClassImplements = js.native
  def classImplements(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassImplements = js.native
  def classMethod(
    kind: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set | atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.constructor
    ],
    key: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.StringLiteral | atBabelTypesLib.atBabelTypesMod.NumericLiteral | atBabelTypesLib.atBabelTypesMod.Expression,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    computed: js.UndefOr[scala.Boolean],
    _static: js.UndefOr[scala.Boolean | scala.Null],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    access: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
    ],
    accessibility: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
    ],
    async: js.UndefOr[scala.Boolean],
    decorators: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.Decorator] | scala.Null],
    generator: js.UndefOr[scala.Boolean],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    returnType: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassMethod = js.native
  def classPrivateMethod(
    kind: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set | atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.constructor
    ],
    key: atBabelTypesLib.atBabelTypesMod.PrivateName,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    _static: js.UndefOr[scala.Boolean | scala.Null],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    access: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
    ],
    accessibility: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
    ],
    async: js.UndefOr[scala.Boolean],
    computed: js.UndefOr[scala.Boolean],
    decorators: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.Decorator] | scala.Null],
    generator: js.UndefOr[scala.Boolean],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    returnType: js.UndefOr[js.Any | scala.Null],
    typeParameters: js.UndefOr[js.Any | scala.Null]
  ): atBabelTypesLib.atBabelTypesMod.ClassPrivateMethod = js.native
  def classPrivateProperty(key: atBabelTypesLib.atBabelTypesMod.PrivateName): atBabelTypesLib.atBabelTypesMod.ClassPrivateProperty = js.native
  def classPrivateProperty(
    key: atBabelTypesLib.atBabelTypesMod.PrivateName,
    value: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.ClassPrivateProperty = js.native
  def classProperty(
    key: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.StringLiteral | atBabelTypesLib.atBabelTypesMod.NumericLiteral | atBabelTypesLib.atBabelTypesMod.Expression,
    value: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    typeAnnotation: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    decorators: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.Decorator] | scala.Null],
    computed: js.UndefOr[scala.Boolean],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    accessibility: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
    ],
    definite: js.UndefOr[scala.Boolean | scala.Null],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    readonly: js.UndefOr[scala.Boolean | scala.Null],
    _static: js.UndefOr[scala.Boolean | scala.Null]
  ): atBabelTypesLib.atBabelTypesMod.ClassProperty = js.native
  def clone[T /* <: atBabelTypesLib.atBabelTypesMod.Node */](n: T): T = js.native
  def cloneDeep[T /* <: atBabelTypesLib.atBabelTypesMod.Node */](n: T): T = js.native
  def conditionalExpression(
    test: atBabelTypesLib.atBabelTypesMod.Expression,
    consequent: atBabelTypesLib.atBabelTypesMod.Expression,
    alternate: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.ConditionalExpression = js.native
  def continueStatement(): atBabelTypesLib.atBabelTypesMod.ContinueStatement = js.native
  def continueStatement(label: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.ContinueStatement = js.native
  def debuggerStatement(): atBabelTypesLib.atBabelTypesMod.DebuggerStatement = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation | scala.Null],
    _extends: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends] | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation | scala.Null],
    _extends: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends] | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation | scala.Null],
    _extends: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends] | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareExportAllDeclaration(source: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.DeclareExportAllDeclaration = js.native
  def declareExportAllDeclaration(
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    exportKind: js.Tuple2[
      atBabelTypesLib.atBabelTypesLibStrings.`type`, 
      atBabelTypesLib.atBabelTypesLibStrings.value
    ]
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportAllDeclaration = js.native
  def declareExportDeclaration(): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: atBabelTypesLib.atBabelTypesMod.Flow): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Flow,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier | atBabelTypesLib.atBabelTypesMod.ExportSpecifier
    ]
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Flow,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier | atBabelTypesLib.atBabelTypesMod.ExportSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Flow,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    _default: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Flow,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: scala.Null,
    _default: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Flow,
    specifiers: scala.Null,
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Flow,
    specifiers: scala.Null,
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    _default: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Flow,
    specifiers: scala.Null,
    source: scala.Null,
    _default: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier | atBabelTypesLib.atBabelTypesMod.ExportSpecifier
    ]
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier | atBabelTypesLib.atBabelTypesMod.ExportSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    _default: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: scala.Null,
    _default: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: scala.Null,
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: scala.Null,
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    _default: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: scala.Null, specifiers: scala.Null, source: scala.Null, _default: scala.Boolean): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareFunction(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.DeclareFunction = js.native
  def declareFunction(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    predicate: atBabelTypesLib.atBabelTypesMod.DeclaredPredicate
  ): atBabelTypesLib.atBabelTypesMod.DeclareFunction = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | scala.Null],
    _extends: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends] | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | scala.Null],
    _extends: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends] | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | scala.Null],
    _extends: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends] | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareModule(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  def declareModule(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  def declareModuleExports(typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation): atBabelTypesLib.atBabelTypesMod.DeclareModuleExports = js.native
  @JSName("declareModule")
  def declareModule_CommonJS(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    kind: atBabelTypesLib.atBabelTypesLibStrings.CommonJS
  ): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_CommonJS(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    kind: atBabelTypesLib.atBabelTypesLibStrings.CommonJS
  ): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_ES(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    kind: atBabelTypesLib.atBabelTypesLibStrings.ES
  ): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_ES(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    kind: atBabelTypesLib.atBabelTypesLibStrings.ES
  ): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  def declareOpaqueType(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType = js.native
  def declareOpaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType = js.native
  def declareOpaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    supertype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType = js.native
  def declareOpaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    supertype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType = js.native
  def declareTypeAlias(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    right: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.DeclareTypeAlias = js.native
  def declareTypeAlias(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    right: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.DeclareTypeAlias = js.native
  def declareTypeAlias(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    right: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.DeclareTypeAlias = js.native
  def declareVariable(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.DeclareVariable = js.native
  def declaredPredicate(value: atBabelTypesLib.atBabelTypesMod.Flow): atBabelTypesLib.atBabelTypesMod.DeclaredPredicate = js.native
  def decorator(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.Decorator = js.native
  def directive(value: atBabelTypesLib.atBabelTypesMod.DirectiveLiteral): atBabelTypesLib.atBabelTypesMod.Directive = js.native
  def directiveLiteral(value: java.lang.String): atBabelTypesLib.atBabelTypesMod.DirectiveLiteral = js.native
  def doExpression(body: atBabelTypesLib.atBabelTypesMod.BlockStatement): atBabelTypesLib.atBabelTypesMod.DoExpression = js.native
  def doWhileStatement(test: atBabelTypesLib.atBabelTypesMod.Expression, body: atBabelTypesLib.atBabelTypesMod.Statement): atBabelTypesLib.atBabelTypesMod.DoWhileStatement = js.native
  def emptyStatement(): atBabelTypesLib.atBabelTypesMod.EmptyStatement = js.native
  def emptyTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.EmptyTypeAnnotation = js.native
  def existsTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.ExistsTypeAnnotation = js.native
  def exportAllDeclaration(source: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.ExportAllDeclaration = js.native
  def exportDefaultDeclaration(declaration: atBabelTypesLib.atBabelTypesMod.ClassDeclaration): atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: atBabelTypesLib.atBabelTypesMod.FunctionDeclaration): atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: atBabelTypesLib.atBabelTypesMod.TSDeclareFunction): atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration = js.native
  def exportDefaultSpecifier(exported: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier = js.native
  def exportNamedDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Declaration | js.UndefOr[scala.Nothing],
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier | atBabelTypesLib.atBabelTypesMod.ExportSpecifier
    ]
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Declaration | js.UndefOr[scala.Nothing],
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier | atBabelTypesLib.atBabelTypesMod.ExportSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier | atBabelTypesLib.atBabelTypesMod.ExportSpecifier
    ]
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  def exportNamespaceSpecifier(exported: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier = js.native
  def exportSpecifier(
    local: atBabelTypesLib.atBabelTypesMod.Identifier,
    exported: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.ExportSpecifier = js.native
  def expressionStatement(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.ExpressionStatement = js.native
  def file(program: atBabelTypesLib.atBabelTypesMod.Program, comments: js.Any, tokens: js.Any): atBabelTypesLib.atBabelTypesMod.File = js.native
  def forInStatement(
    left: atBabelTypesLib.atBabelTypesMod.LVal,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.ForInStatement = js.native
  def forInStatement(
    left: atBabelTypesLib.atBabelTypesMod.VariableDeclaration,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.ForInStatement = js.native
  def forOfStatement(
    left: atBabelTypesLib.atBabelTypesMod.LVal,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.ForOfStatement = js.native
  def forOfStatement(
    left: atBabelTypesLib.atBabelTypesMod.LVal,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.Statement,
    _await: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ForOfStatement = js.native
  def forOfStatement(
    left: atBabelTypesLib.atBabelTypesMod.VariableDeclaration,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.ForOfStatement = js.native
  def forOfStatement(
    left: atBabelTypesLib.atBabelTypesMod.VariableDeclaration,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.Statement,
    _await: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ForOfStatement = js.native
  def forStatement(
    init: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.VariableDeclaration | atBabelTypesLib.atBabelTypesMod.Expression | scala.Null
    ],
    test: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    update: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.ForStatement = js.native
  def functionDeclaration(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionExpression(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionTypeAnnotation(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: atBabelTypesLib.atBabelTypesMod.FunctionTypeParam,
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: js.UndefOr[scala.Nothing],
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: scala.Null,
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: atBabelTypesLib.atBabelTypesMod.FunctionTypeParam,
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: js.UndefOr[scala.Nothing],
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: scala.Null,
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: scala.Null,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: atBabelTypesLib.atBabelTypesMod.FunctionTypeParam,
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: scala.Null,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: js.UndefOr[scala.Nothing],
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: scala.Null,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: scala.Null,
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeParam(
    name: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def functionTypeParam(
    name: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def functionTypeParam(name: js.UndefOr[scala.Nothing], typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def functionTypeParam(
    name: js.UndefOr[scala.Nothing],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def functionTypeParam(name: scala.Null, typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def functionTypeParam(
    name: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def genericTypeAnnotation(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation = js.native
  def genericTypeAnnotation(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier): atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation = js.native
  def genericTypeAnnotation(
    id: atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation = js.native
  def identifier(name: java.lang.String): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(name: java.lang.String, decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(name: java.lang.String, decorators: scala.Null, optional: scala.Boolean): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def ifStatement(
    test: atBabelTypesLib.atBabelTypesMod.Expression,
    consequent: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.IfStatement = js.native
  def ifStatement(
    test: atBabelTypesLib.atBabelTypesMod.Expression,
    consequent: atBabelTypesLib.atBabelTypesMod.Statement,
    alternate: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.IfStatement = js.native
  def importDeclaration(
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ImportSpecifier | atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.ImportDeclaration = js.native
  def importDefaultSpecifier(local: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier = js.native
  def importNamespaceSpecifier(local: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier = js.native
  def importSpecifier(
    local: atBabelTypesLib.atBabelTypesMod.Identifier,
    imported: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.ImportSpecifier = js.native
  @JSName("importSpecifier")
  def importSpecifier_type(
    local: atBabelTypesLib.atBabelTypesMod.Identifier,
    imported: atBabelTypesLib.atBabelTypesMod.Identifier,
    importKind: atBabelTypesLib.atBabelTypesLibStrings.`type`
  ): atBabelTypesLib.atBabelTypesMod.ImportSpecifier = js.native
  @JSName("importSpecifier")
  def importSpecifier_typeof(
    local: atBabelTypesLib.atBabelTypesMod.Identifier,
    imported: atBabelTypesLib.atBabelTypesMod.Identifier,
    importKind: atBabelTypesLib.atBabelTypesLibStrings.typeof
  ): atBabelTypesLib.atBabelTypesMod.ImportSpecifier = js.native
  def inferredPredicate(): atBabelTypesLib.atBabelTypesMod.InferredPredicate = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | scala.Null],
    _extends: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends] | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | scala.Null],
    _extends: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends] | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | scala.Null],
    _extends: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends] | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceExtends(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.InterfaceExtends = js.native
  def interfaceExtends(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceExtends = js.native
  def interfaceExtends(id: atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier): atBabelTypesLib.atBabelTypesMod.InterfaceExtends = js.native
  def interfaceExtends(
    id: atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceExtends = js.native
  def interfaceTypeAnnotation(
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceTypeAnnotation = js.native
  def interfaceTypeAnnotation(_extends: js.UndefOr[scala.Nothing], body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation): atBabelTypesLib.atBabelTypesMod.InterfaceTypeAnnotation = js.native
  def interfaceTypeAnnotation(_extends: scala.Null, body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation): atBabelTypesLib.atBabelTypesMod.InterfaceTypeAnnotation = js.native
  def interpreterDirective(value: java.lang.String): atBabelTypesLib.atBabelTypesMod.InterpreterDirective = js.native
  def intersectionTypeAnnotation(types: js.Array[atBabelTypesLib.atBabelTypesMod.FlowType]): atBabelTypesLib.atBabelTypesMod.IntersectionTypeAnnotation = js.native
  def isAnyTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isAnyTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isArrayExpression(node: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ scala.Boolean = js.native
  def isArrayExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ scala.Boolean = js.native
  def isArrayPattern(node: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ scala.Boolean = js.native
  def isArrayPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentPattern(node: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ scala.Boolean = js.native
  def isAssignmentPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ scala.Boolean = js.native
  def isAwaitExpression(node: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ scala.Boolean = js.native
  def isBigIntLiteral(node: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ scala.Boolean = js.native
  def isBigIntLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ scala.Boolean = js.native
  def isBinary(node: js.Object): /* is @babel/types.@babel/types.Binary */ scala.Boolean = js.native
  def isBinary(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Binary */ scala.Boolean = js.native
  def isBinaryExpression(node: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ scala.Boolean = js.native
  def isBindExpression(node: js.Object): /* is @babel/types.@babel/types.BindExpression */ scala.Boolean = js.native
  def isBindExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BindExpression */ scala.Boolean = js.native
  def isBlock(node: js.Object): /* is @babel/types.@babel/types.Block */ scala.Boolean = js.native
  def isBlock(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Block */ scala.Boolean = js.native
  def isBlockParent(node: js.Object): /* is @babel/types.@babel/types.BlockParent */ scala.Boolean = js.native
  def isBlockParent(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BlockParent */ scala.Boolean = js.native
  def isBlockStatement(node: js.Object): /* is @babel/types.@babel/types.BlockStatement */ scala.Boolean = js.native
  def isBlockStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BlockStatement */ scala.Boolean = js.native
  def isBooleanLiteral(node: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBreakStatement(node: js.Object): /* is @babel/types.@babel/types.BreakStatement */ scala.Boolean = js.native
  def isBreakStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BreakStatement */ scala.Boolean = js.native
  def isCallExpression(node: js.Object): /* is @babel/types.@babel/types.CallExpression */ scala.Boolean = js.native
  def isCallExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ scala.Boolean = js.native
  def isCatchClause(node: js.Object): /* is @babel/types.@babel/types.CatchClause */ scala.Boolean = js.native
  def isCatchClause(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CatchClause */ scala.Boolean = js.native
  def isClass(node: js.Object): /* is @babel/types.@babel/types.Class */ scala.Boolean = js.native
  def isClass(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Class */ scala.Boolean = js.native
  def isClassBody(node: js.Object): /* is @babel/types.@babel/types.ClassBody */ scala.Boolean = js.native
  def isClassBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassBody */ scala.Boolean = js.native
  def isClassDeclaration(node: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ scala.Boolean = js.native
  def isClassDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ scala.Boolean = js.native
  def isClassExpression(node: js.Object): /* is @babel/types.@babel/types.ClassExpression */ scala.Boolean = js.native
  def isClassExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassExpression */ scala.Boolean = js.native
  def isClassImplements(node: js.Object): /* is @babel/types.@babel/types.ClassImplements */ scala.Boolean = js.native
  def isClassImplements(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassImplements */ scala.Boolean = js.native
  def isClassMethod(node: js.Object): /* is @babel/types.@babel/types.ClassMethod */ scala.Boolean = js.native
  def isClassMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassMethod */ scala.Boolean = js.native
  def isClassPrivateMethod(node: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ scala.Boolean = js.native
  def isClassPrivateMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ scala.Boolean = js.native
  def isClassPrivateProperty(node: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ scala.Boolean = js.native
  def isClassPrivateProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ scala.Boolean = js.native
  def isClassProperty(node: js.Object): /* is @babel/types.@babel/types.ClassProperty */ scala.Boolean = js.native
  def isClassProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassProperty */ scala.Boolean = js.native
  def isCompletionStatement(node: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ scala.Boolean = js.native
  def isCompletionStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ scala.Boolean = js.native
  def isConditional(node: js.Object): /* is @babel/types.@babel/types.Conditional */ scala.Boolean = js.native
  def isConditional(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Conditional */ scala.Boolean = js.native
  def isConditionalExpression(node: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ scala.Boolean = js.native
  def isContinueStatement(node: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ scala.Boolean = js.native
  def isContinueStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ scala.Boolean = js.native
  def isDeclaration(node: js.Object): /* is @babel/types.@babel/types.Declaration */ scala.Boolean = js.native
  def isDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Declaration */ scala.Boolean = js.native
  def isDeclareClass(node: js.Object): /* is @babel/types.@babel/types.DeclareClass */ scala.Boolean = js.native
  def isDeclareClass(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareClass */ scala.Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ scala.Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ scala.Boolean = js.native
  def isDeclareExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ scala.Boolean = js.native
  def isDeclareExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ scala.Boolean = js.native
  def isDeclareFunction(node: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareInterface(node: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareInterface(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareModule(node: js.Object): /* is @babel/types.@babel/types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModule(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModuleExports(node: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ scala.Boolean = js.native
  def isDeclareModuleExports(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ scala.Boolean = js.native
  def isDeclareOpaqueType(node: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ scala.Boolean = js.native
  def isDeclareOpaqueType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareVariable(node: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ scala.Boolean = js.native
  def isDeclareVariable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ scala.Boolean = js.native
  def isDeclaredPredicate(node: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ scala.Boolean = js.native
  def isDeclaredPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ scala.Boolean = js.native
  def isDecorator(node: js.Object): /* is @babel/types.@babel/types.Decorator */ scala.Boolean = js.native
  def isDecorator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Decorator */ scala.Boolean = js.native
  def isDirective(node: js.Object): /* is @babel/types.@babel/types.Directive */ scala.Boolean = js.native
  def isDirective(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Directive */ scala.Boolean = js.native
  def isDirectiveLiteral(node: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ scala.Boolean = js.native
  def isDirectiveLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ scala.Boolean = js.native
  def isDoExpression(node: js.Object): /* is @babel/types.@babel/types.DoExpression */ scala.Boolean = js.native
  def isDoExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DoExpression */ scala.Boolean = js.native
  def isDoWhileStatement(node: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ scala.Boolean = js.native
  def isDoWhileStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ scala.Boolean = js.native
  def isEmptyTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ scala.Boolean = js.native
  def isExistsTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ scala.Boolean = js.native
  def isExistsTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ scala.Boolean = js.native
  def isExportAllDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportAllDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ scala.Boolean = js.native
  def isExpression(node: js.Object): /* is @babel/types.@babel/types.Expression */ scala.Boolean = js.native
  def isExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Expression */ scala.Boolean = js.native
  def isExpressionStatement(node: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionWrapper(node: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ scala.Boolean = js.native
  def isExpressionWrapper(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ scala.Boolean = js.native
  def isFile(node: js.Object): /* is @babel/types.@babel/types.File */ scala.Boolean = js.native
  def isFile(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.File */ scala.Boolean = js.native
  def isFlow(node: js.Object): /* is @babel/types.@babel/types.Flow */ scala.Boolean = js.native
  def isFlow(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Flow */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowDeclaration(node: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowPredicate(node: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ scala.Boolean = js.native
  def isFlowPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ scala.Boolean = js.native
  def isFlowType(node: js.Object): /* is @babel/types.@babel/types.FlowType */ scala.Boolean = js.native
  def isFlowType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowType */ scala.Boolean = js.native
  def isFor(node: js.Object): /* is @babel/types.@babel/types.For */ scala.Boolean = js.native
  def isFor(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.For */ scala.Boolean = js.native
  def isForInStatement(node: js.Object): /* is @babel/types.@babel/types.ForInStatement */ scala.Boolean = js.native
  def isForInStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForInStatement */ scala.Boolean = js.native
  def isForOfStatement(node: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ scala.Boolean = js.native
  def isForOfStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ scala.Boolean = js.native
  def isForStatement(node: js.Object): /* is @babel/types.@babel/types.ForStatement */ scala.Boolean = js.native
  def isForStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForStatement */ scala.Boolean = js.native
  def isForXStatement(node: js.Object): /* is @babel/types.@babel/types.ForXStatement */ scala.Boolean = js.native
  def isForXStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForXStatement */ scala.Boolean = js.native
  def isFunction(node: js.Object): /* is @babel/types.@babel/types.Function */ scala.Boolean = js.native
  def isFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Function */ scala.Boolean = js.native
  def isFunctionDeclaration(node: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionExpression(node: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionParent(node: js.Object): /* is @babel/types.@babel/types.FunctionParent */ scala.Boolean = js.native
  def isFunctionParent(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionParent */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeParam(node: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ scala.Boolean = js.native
  def isFunctionTypeParam(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isIdentifier(node: js.Object): /* is @babel/types.@babel/types.Identifier */ scala.Boolean = js.native
  def isIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Identifier */ scala.Boolean = js.native
  def isIfStatement(node: js.Object): /* is @babel/types.@babel/types.IfStatement */ scala.Boolean = js.native
  def isIfStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.IfStatement */ scala.Boolean = js.native
  def isImmutable(node: js.Object): /* is @babel/types.@babel/types.Immutable */ scala.Boolean = js.native
  def isImmutable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Immutable */ scala.Boolean = js.native
  def isImport(node: js.Object): /* is @babel/types.@babel/types.Import */ scala.Boolean = js.native
  def isImport(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Import */ scala.Boolean = js.native
  def isImportDeclaration(node: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ scala.Boolean = js.native
  def isInferredPredicate(node: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ scala.Boolean = js.native
  def isInferredPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceExtends(node: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceExtends(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ scala.Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ scala.Boolean = js.native
  def isInterpreterDirective(node: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ scala.Boolean = js.native
  def isInterpreterDirective(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isJSX(node: js.Object): /* is @babel/types.@babel/types.JSX */ scala.Boolean = js.native
  def isJSX(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSX */ scala.Boolean = js.native
  def isJSXAttribute(node: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ scala.Boolean = js.native
  def isJSXAttribute(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ scala.Boolean = js.native
  def isJSXClosingElement(node: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingFragment(node: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ scala.Boolean = js.native
  def isJSXClosingFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ scala.Boolean = js.native
  def isJSXElement(node: js.Object): /* is @babel/types.@babel/types.JSXElement */ scala.Boolean = js.native
  def isJSXElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXElement */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXFragment(node: js.Object): /* is @babel/types.@babel/types.JSXFragment */ scala.Boolean = js.native
  def isJSXFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXFragment */ scala.Boolean = js.native
  def isJSXIdentifier(node: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXMemberExpression(node: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXNamespacedName(node: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXNamespacedName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXOpeningElement(node: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningFragment(node: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ scala.Boolean = js.native
  def isJSXOpeningFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadChild(node: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ scala.Boolean = js.native
  def isJSXSpreadChild(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ scala.Boolean = js.native
  def isJSXText(node: js.Object): /* is @babel/types.@babel/types.JSXText */ scala.Boolean = js.native
  def isJSXText(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXText */ scala.Boolean = js.native
  def isLVal(node: js.Object): /* is @babel/types.@babel/types.LVal */ scala.Boolean = js.native
  def isLVal(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LVal */ scala.Boolean = js.native
  def isLabeledStatement(node: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ scala.Boolean = js.native
  def isLabeledStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ scala.Boolean = js.native
  def isLiteral(node: js.Object): /* is @babel/types.@babel/types.Literal */ scala.Boolean = js.native
  def isLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Literal */ scala.Boolean = js.native
  def isLogicalExpression(node: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ scala.Boolean = js.native
  def isLogicalExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ scala.Boolean = js.native
  def isLoop(node: js.Object): /* is @babel/types.@babel/types.Loop */ scala.Boolean = js.native
  def isLoop(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Loop */ scala.Boolean = js.native
  def isMemberExpression(node: js.Object): /* is @babel/types.@babel/types.MemberExpression */ scala.Boolean = js.native
  def isMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MemberExpression */ scala.Boolean = js.native
  def isMetaProperty(node: js.Object): /* is @babel/types.@babel/types.MetaProperty */ scala.Boolean = js.native
  def isMetaProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MetaProperty */ scala.Boolean = js.native
  def isMethod(node: js.Object): /* is @babel/types.@babel/types.Method */ scala.Boolean = js.native
  def isMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Method */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isModuleDeclaration(node: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleSpecifier(node: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ scala.Boolean = js.native
  def isModuleSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ scala.Boolean = js.native
  def isNewExpression(node: js.Object): /* is @babel/types.@babel/types.NewExpression */ scala.Boolean = js.native
  def isNewExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NewExpression */ scala.Boolean = js.native
  def isNoop(node: js.Object): /* is @babel/types.@babel/types.Noop */ scala.Boolean = js.native
  def isNoop(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Noop */ scala.Boolean = js.native
  def isNullLiteral(node: js.Object): /* is @babel/types.@babel/types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteral(node: js.Object): scala.Boolean = js.native
  def isNumberLiteral(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumericLiteral(node: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ scala.Boolean = js.native
  def isObjectExpression(node: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ scala.Boolean = js.native
  def isObjectExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ scala.Boolean = js.native
  def isObjectMember(node: js.Object): /* is @babel/types.@babel/types.ObjectMember */ scala.Boolean = js.native
  def isObjectMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectMember */ scala.Boolean = js.native
  def isObjectMethod(node: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ scala.Boolean = js.native
  def isObjectMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ scala.Boolean = js.native
  def isObjectPattern(node: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ scala.Boolean = js.native
  def isObjectPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ scala.Boolean = js.native
  def isObjectProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ scala.Boolean = js.native
  def isObjectProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeInternalSlot(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ scala.Boolean = js.native
  def isObjectTypeInternalSlot(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ scala.Boolean = js.native
  def isObjectTypeProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ scala.Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ scala.Boolean = js.native
  def isOpaqueType(node: js.Object): /* is @babel/types.@babel/types.OpaqueType */ scala.Boolean = js.native
  def isOpaqueType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OpaqueType */ scala.Boolean = js.native
  def isOptionalCallExpression(node: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ scala.Boolean = js.native
  def isOptionalCallExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ scala.Boolean = js.native
  def isOptionalMemberExpression(node: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ scala.Boolean = js.native
  def isOptionalMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ scala.Boolean = js.native
  def isPattern(node: js.Object): /* is @babel/types.@babel/types.Pattern */ scala.Boolean = js.native
  def isPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Pattern */ scala.Boolean = js.native
  def isPatternLike(node: js.Object): /* is @babel/types.@babel/types.PatternLike */ scala.Boolean = js.native
  def isPatternLike(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PatternLike */ scala.Boolean = js.native
  def isPipelineBareFunction(node: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ scala.Boolean = js.native
  def isPipelineBareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ scala.Boolean = js.native
  def isPipelinePrimaryTopicReference(node: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ scala.Boolean = js.native
  def isPipelinePrimaryTopicReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ scala.Boolean = js.native
  def isPipelineTopicExpression(node: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ scala.Boolean = js.native
  def isPipelineTopicExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ scala.Boolean = js.native
  def isPrivate(node: js.Object): /* is @babel/types.@babel/types.Private */ scala.Boolean = js.native
  def isPrivate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Private */ scala.Boolean = js.native
  def isPrivateName(node: js.Object): /* is @babel/types.@babel/types.PrivateName */ scala.Boolean = js.native
  def isPrivateName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PrivateName */ scala.Boolean = js.native
  def isProgram(node: js.Object): /* is @babel/types.@babel/types.Program */ scala.Boolean = js.native
  def isProgram(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Program */ scala.Boolean = js.native
  def isProperty(node: js.Object): /* is @babel/types.@babel/types.Property */ scala.Boolean = js.native
  def isProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Property */ scala.Boolean = js.native
  def isPureish(node: js.Object): /* is @babel/types.@babel/types.Pureish */ scala.Boolean = js.native
  def isPureish(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Pureish */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isRegExpLiteral(node: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ scala.Boolean = js.native
  def isRegExpLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ scala.Boolean = js.native
  def isRegexLiteral(node: js.Object): scala.Boolean = js.native
  def isRegexLiteral(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isRestElement(node: js.Object): /* is @babel/types.@babel/types.RestElement */ scala.Boolean = js.native
  def isRestElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RestElement */ scala.Boolean = js.native
  def isRestProperty(node: js.Object): scala.Boolean = js.native
  def isRestProperty(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isReturnStatement(node: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ scala.Boolean = js.native
  def isReturnStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ scala.Boolean = js.native
  def isScopable(node: js.Object): /* is @babel/types.@babel/types.Scopable */ scala.Boolean = js.native
  def isScopable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Scopable */ scala.Boolean = js.native
  def isSequenceExpression(node: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ scala.Boolean = js.native
  def isSequenceExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ scala.Boolean = js.native
  def isSpreadElement(node: js.Object): /* is @babel/types.@babel/types.SpreadElement */ scala.Boolean = js.native
  def isSpreadElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ scala.Boolean = js.native
  def isSpreadProperty(node: js.Object): scala.Boolean = js.native
  def isSpreadProperty(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isStatement(node: js.Object): /* is @babel/types.@babel/types.Statement */ scala.Boolean = js.native
  def isStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Statement */ scala.Boolean = js.native
  def isStringLiteral(node: js.Object): /* is @babel/types.@babel/types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ scala.Boolean = js.native
  def isSuper(node: js.Object): /* is @babel/types.@babel/types.Super */ scala.Boolean = js.native
  def isSuper(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Super */ scala.Boolean = js.native
  def isSwitchCase(node: js.Object): /* is @babel/types.@babel/types.SwitchCase */ scala.Boolean = js.native
  def isSwitchCase(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SwitchCase */ scala.Boolean = js.native
  def isSwitchStatement(node: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ scala.Boolean = js.native
  def isSwitchStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ scala.Boolean = js.native
  def isTSAnyKeyword(node: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSAnyKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSArrayType(node: js.Object): /* is @babel/types.@babel/types.TSArrayType */ scala.Boolean = js.native
  def isTSArrayType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSArrayType */ scala.Boolean = js.native
  def isTSAsExpression(node: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ scala.Boolean = js.native
  def isTSAsExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSConditionalType(node: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ scala.Boolean = js.native
  def isTSConditionalType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructorType(node: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ scala.Boolean = js.native
  def isTSConstructorType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ scala.Boolean = js.native
  def isTSDeclareFunction(node: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareMethod(node: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSDeclareMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSEntityName(node: js.Object): /* is @babel/types.@babel/types.TSEntityName */ scala.Boolean = js.native
  def isTSEntityName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEntityName */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumMember(node: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ scala.Boolean = js.native
  def isTSEnumMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ scala.Boolean = js.native
  def isTSExportAssignment(node: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExportAssignment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSFunctionType(node: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ scala.Boolean = js.native
  def isTSFunctionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportType(node: js.Object): /* is @babel/types.@babel/types.TSImportType */ scala.Boolean = js.native
  def isTSImportType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSImportType */ scala.Boolean = js.native
  def isTSIndexSignature(node: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexSignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSInferType(node: js.Object): /* is @babel/types.@babel/types.TSInferType */ scala.Boolean = js.native
  def isTSInferType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInferType */ scala.Boolean = js.native
  def isTSInterfaceBody(node: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSIntersectionType(node: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ scala.Boolean = js.native
  def isTSIntersectionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ scala.Boolean = js.native
  def isTSLiteralType(node: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ scala.Boolean = js.native
  def isTSLiteralType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ scala.Boolean = js.native
  def isTSMappedType(node: js.Object): /* is @babel/types.@babel/types.TSMappedType */ scala.Boolean = js.native
  def isTSMappedType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSMappedType */ scala.Boolean = js.native
  def isTSMethodSignature(node: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ scala.Boolean = js.native
  def isTSMethodSignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ scala.Boolean = js.native
  def isTSModuleBlock(node: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleBlock(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNeverKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNeverKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNonNullExpression(node: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNonNullExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNullKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNullKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSOptionalType(node: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ scala.Boolean = js.native
  def isTSOptionalType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ scala.Boolean = js.native
  def isTSParameterProperty(node: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParameterProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParenthesizedType(node: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSParenthesizedType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSPropertySignature(node: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ scala.Boolean = js.native
  def isTSPropertySignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ scala.Boolean = js.native
  def isTSQualifiedName(node: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ scala.Boolean = js.native
  def isTSQualifiedName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ scala.Boolean = js.native
  def isTSRestType(node: js.Object): /* is @babel/types.@babel/types.TSRestType */ scala.Boolean = js.native
  def isTSRestType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSRestType */ scala.Boolean = js.native
  def isTSStringKeyword(node: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ scala.Boolean = js.native
  def isTSStringKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSThisType(node: js.Object): /* is @babel/types.@babel/types.TSThisType */ scala.Boolean = js.native
  def isTSThisType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSThisType */ scala.Boolean = js.native
  def isTSTupleType(node: js.Object): /* is @babel/types.@babel/types.TSTupleType */ scala.Boolean = js.native
  def isTSTupleType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTupleType */ scala.Boolean = js.native
  def isTSType(node: js.Object): /* is @babel/types.@babel/types.TSType */ scala.Boolean = js.native
  def isTSType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSType */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAssertion(node: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeAssertion(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeElement(node: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ scala.Boolean = js.native
  def isTSTypeElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ scala.Boolean = js.native
  def isTSTypeLiteral(node: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeOperator(node: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeOperator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeParameter(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameter(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypePredicate(node: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypePredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypeQuery(node: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeQuery(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeReference(node: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ scala.Boolean = js.native
  def isTSTypeReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUnionType(node: js.Object): /* is @babel/types.@babel/types.TSUnionType */ scala.Boolean = js.native
  def isTSUnionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUnionType */ scala.Boolean = js.native
  def isTSUnknownKeyword(node: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ scala.Boolean = js.native
  def isTSUnknownKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTemplateElement(node: js.Object): /* is @babel/types.@babel/types.TemplateElement */ scala.Boolean = js.native
  def isTemplateElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TemplateElement */ scala.Boolean = js.native
  def isTemplateLiteral(node: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ scala.Boolean = js.native
  def isTerminatorless(node: js.Object): /* is @babel/types.@babel/types.Terminatorless */ scala.Boolean = js.native
  def isTerminatorless(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Terminatorless */ scala.Boolean = js.native
  def isThisExpression(node: js.Object): /* is @babel/types.@babel/types.ThisExpression */ scala.Boolean = js.native
  def isThisExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThisExpression */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThrowStatement(node: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ scala.Boolean = js.native
  def isThrowStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ scala.Boolean = js.native
  def isTryStatement(node: js.Object): /* is @babel/types.@babel/types.TryStatement */ scala.Boolean = js.native
  def isTryStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TryStatement */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTypeAlias(node: js.Object): /* is @babel/types.@babel/types.TypeAlias */ scala.Boolean = js.native
  def isTypeAlias(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeAlias */ scala.Boolean = js.native
  def isTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeCastExpression(node: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeCastExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeParameter(node: js.Object): /* is @babel/types.@babel/types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameter(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isUnaryExpression(node: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryLike(node: js.Object): /* is @babel/types.@babel/types.UnaryLike */ scala.Boolean = js.native
  def isUnaryLike(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnaryLike */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUpdateExpression(node: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ scala.Boolean = js.native
  def isUpdateExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ scala.Boolean = js.native
  def isUserWhitespacable(node: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ scala.Boolean = js.native
  def isUserWhitespacable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ scala.Boolean = js.native
  def isVariableDeclaration(node: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclarator(node: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ scala.Boolean = js.native
  def isVariableDeclarator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ scala.Boolean = js.native
  def isVariance(node: js.Object): /* is @babel/types.@babel/types.Variance */ scala.Boolean = js.native
  def isVariance(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Variance */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isWhile(node: js.Object): /* is @babel/types.@babel/types.While */ scala.Boolean = js.native
  def isWhile(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.While */ scala.Boolean = js.native
  def isWhileStatement(node: js.Object): /* is @babel/types.@babel/types.WhileStatement */ scala.Boolean = js.native
  def isWhileStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.WhileStatement */ scala.Boolean = js.native
  def isWithStatement(node: js.Object): /* is @babel/types.@babel/types.WithStatement */ scala.Boolean = js.native
  def isWithStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.WithStatement */ scala.Boolean = js.native
  def isYieldExpression(node: js.Object): /* is @babel/types.@babel/types.YieldExpression */ scala.Boolean = js.native
  def isYieldExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.YieldExpression */ scala.Boolean = js.native
  def jsxAttribute(name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    value: atBabelTypesLib.atBabelTypesMod.JSXElement
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    value: atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    value: atBabelTypesLib.atBabelTypesMod.JSXFragment
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    value: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(name: atBabelTypesLib.atBabelTypesMod.JSXNamespacedName): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXNamespacedName,
    value: atBabelTypesLib.atBabelTypesMod.JSXElement
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXNamespacedName,
    value: atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXNamespacedName,
    value: atBabelTypesLib.atBabelTypesMod.JSXFragment
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXNamespacedName,
    value: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxClosingElement(name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier): atBabelTypesLib.atBabelTypesMod.JSXClosingElement = js.native
  def jsxClosingElement(name: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression): atBabelTypesLib.atBabelTypesMod.JSXClosingElement = js.native
  def jsxClosingFragment(): atBabelTypesLib.atBabelTypesMod.JSXClosingFragment = js.native
  def jsxElement(
    openingElement: atBabelTypesLib.atBabelTypesMod.JSXOpeningElement,
    closingElement: atBabelTypesLib.atBabelTypesMod.JSXClosingElement,
    children: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXText | atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer | atBabelTypesLib.atBabelTypesMod.JSXSpreadChild | atBabelTypesLib.atBabelTypesMod.JSXElement | atBabelTypesLib.atBabelTypesMod.JSXFragment
    ],
    selfClosing: js.Any
  ): atBabelTypesLib.atBabelTypesMod.JSXElement = js.native
  def jsxElement(
    openingElement: atBabelTypesLib.atBabelTypesMod.JSXOpeningElement,
    closingElement: js.UndefOr[scala.Nothing],
    children: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXText | atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer | atBabelTypesLib.atBabelTypesMod.JSXSpreadChild | atBabelTypesLib.atBabelTypesMod.JSXElement | atBabelTypesLib.atBabelTypesMod.JSXFragment
    ],
    selfClosing: js.Any
  ): atBabelTypesLib.atBabelTypesMod.JSXElement = js.native
  def jsxElement(
    openingElement: atBabelTypesLib.atBabelTypesMod.JSXOpeningElement,
    closingElement: scala.Null,
    children: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXText | atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer | atBabelTypesLib.atBabelTypesMod.JSXSpreadChild | atBabelTypesLib.atBabelTypesMod.JSXElement | atBabelTypesLib.atBabelTypesMod.JSXFragment
    ],
    selfClosing: js.Any
  ): atBabelTypesLib.atBabelTypesMod.JSXElement = js.native
  def jsxEmptyExpression(): atBabelTypesLib.atBabelTypesMod.JSXEmptyExpression = js.native
  def jsxExpressionContainer(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer = js.native
  def jsxExpressionContainer(expression: atBabelTypesLib.atBabelTypesMod.JSXEmptyExpression): atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer = js.native
  def jsxFragment(
    openingFragment: atBabelTypesLib.atBabelTypesMod.JSXOpeningFragment,
    closingFragment: atBabelTypesLib.atBabelTypesMod.JSXClosingFragment,
    children: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXText | atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer | atBabelTypesLib.atBabelTypesMod.JSXSpreadChild | atBabelTypesLib.atBabelTypesMod.JSXElement | atBabelTypesLib.atBabelTypesMod.JSXFragment
    ]
  ): atBabelTypesLib.atBabelTypesMod.JSXFragment = js.native
  def jsxIdentifier(name: java.lang.String): atBabelTypesLib.atBabelTypesMod.JSXIdentifier = js.native
  def jsxMemberExpression(
    `object`: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    property: atBabelTypesLib.atBabelTypesMod.JSXIdentifier
  ): atBabelTypesLib.atBabelTypesMod.JSXMemberExpression = js.native
  def jsxMemberExpression(
    `object`: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression,
    property: atBabelTypesLib.atBabelTypesMod.JSXIdentifier
  ): atBabelTypesLib.atBabelTypesMod.JSXMemberExpression = js.native
  def jsxNamespacedName(
    namespace: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier
  ): atBabelTypesLib.atBabelTypesMod.JSXNamespacedName = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ]
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ]
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningFragment(): atBabelTypesLib.atBabelTypesMod.JSXOpeningFragment = js.native
  def jsxSpreadAttribute(argument: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute = js.native
  def jsxSpreadChild(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.JSXSpreadChild = js.native
  def jsxText(value: java.lang.String): atBabelTypesLib.atBabelTypesMod.JSXText = js.native
  def labeledStatement(label: atBabelTypesLib.atBabelTypesMod.Identifier, body: atBabelTypesLib.atBabelTypesMod.Statement): atBabelTypesLib.atBabelTypesMod.LabeledStatement = js.native
  @JSName("logicalExpression")
  def `logicalExpression_&&`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`&&`,
    left: atBabelTypesLib.atBabelTypesMod.Expression,
    right: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.LogicalExpression = js.native
  @JSName("logicalExpression")
  def `logicalExpression_??`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`??`,
    left: atBabelTypesLib.atBabelTypesMod.Expression,
    right: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.LogicalExpression = js.native
  @JSName("logicalExpression")
  def `logicalExpression_||`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`||`,
    left: atBabelTypesLib.atBabelTypesMod.Expression,
    right: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.LogicalExpression = js.native
  def memberExpression(`object`: atBabelTypesLib.atBabelTypesMod.Expression, property: js.Any): atBabelTypesLib.atBabelTypesMod.MemberExpression = js.native
  def memberExpression(`object`: atBabelTypesLib.atBabelTypesMod.Expression, property: js.Any, computed: scala.Boolean): atBabelTypesLib.atBabelTypesMod.MemberExpression = js.native
  def memberExpression(
    `object`: atBabelTypesLib.atBabelTypesMod.Expression,
    property: js.Any,
    computed: scala.Boolean,
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`
  ): atBabelTypesLib.atBabelTypesMod.MemberExpression = js.native
  def memberExpression(
    `object`: atBabelTypesLib.atBabelTypesMod.Expression,
    property: js.Any,
    computed: scala.Boolean,
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`
  ): atBabelTypesLib.atBabelTypesMod.MemberExpression = js.native
  def metaProperty(
    meta: atBabelTypesLib.atBabelTypesMod.Identifier,
    property: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.MetaProperty = js.native
  def mixedTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.MixedTypeAnnotation = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ],
    optional: scala.Null,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: scala.Null,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: scala.Null,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def noop(): atBabelTypesLib.atBabelTypesMod.Noop = js.native
  def nullLiteral(): atBabelTypesLib.atBabelTypesMod.NullLiteral = js.native
  def nullLiteralTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.NullLiteralTypeAnnotation = js.native
  def nullableTypeAnnotation(typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.NullableTypeAnnotation = js.native
  def numberLiteralTypeAnnotation(value: scala.Double): atBabelTypesLib.atBabelTypesMod.NumberLiteralTypeAnnotation = js.native
  def numberTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.NumberTypeAnnotation = js.native
  def numericLiteral(value: scala.Double): atBabelTypesLib.atBabelTypesMod.NumericLiteral = js.native
  def objectExpression(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectMethod | atBabelTypesLib.atBabelTypesMod.ObjectProperty | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.ObjectExpression = js.native
  def objectMethod(
    kind: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set
    ],
    key: js.Any,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    computed: js.UndefOr[scala.Boolean],
    async: js.UndefOr[scala.Boolean],
    decorators: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.Decorator] | scala.Null],
    generator: js.UndefOr[scala.Boolean],
    returnType: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ]
  ): atBabelTypesLib.atBabelTypesMod.ObjectMethod = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectProperty | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectProperty | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.ObjectProperty
    ],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.ObjectProperty
    ],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.ObjectProperty
    ],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.ObjectProperty
    ],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.ObjectProperty
    ],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.ObjectProperty
    ],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectProperty(
    key: js.Any,
    value: atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.PatternLike
  ): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.PatternLike,
    computed: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.PatternLike,
    computed: scala.Boolean,
    shorthand: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.PatternLike,
    computed: scala.Boolean,
    shorthand: scala.Boolean,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeCallProperty(value: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty = js.native
  def objectTypeCallProperty(value: atBabelTypesLib.atBabelTypesMod.FlowType, _static: scala.Boolean): atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty = js.native
  def objectTypeIndexer(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: scala.Null,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: scala.Null,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: scala.Null,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: scala.Null,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: scala.Null,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: scala.Null,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: scala.Null,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeInternalSlot(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    optional: scala.Boolean,
    _static: scala.Boolean,
    method: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot = js.native
  def objectTypeProperty(
    key: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelTypesLib.atBabelTypesLibStrings.init | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelTypesLib.atBabelTypesLibStrings.init | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelTypesLib.atBabelTypesLibStrings.init | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set,
    optional: scala.Boolean,
    proto: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelTypesLib.atBabelTypesLibStrings.init | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set,
    optional: scala.Boolean,
    proto: scala.Boolean,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  def objectTypeSpreadProperty(argument: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    supertype: atBabelTypesLib.atBabelTypesMod.FlowType | js.UndefOr[scala.Nothing],
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    supertype: scala.Null,
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: atBabelTypesLib.atBabelTypesMod.FlowType | js.UndefOr[scala.Nothing],
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: scala.Null,
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    supertype: atBabelTypesLib.atBabelTypesMod.FlowType | js.UndefOr[scala.Nothing],
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    supertype: scala.Null,
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def optionalCallExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ],
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ],
    optional: scala.Boolean,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: scala.Boolean,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: scala.Boolean,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.OptionalCallExpression = js.native
  def optionalMemberExpression(
    `object`: atBabelTypesLib.atBabelTypesMod.Expression,
    property: js.Any,
    computed: js.UndefOr[scala.Nothing],
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.OptionalMemberExpression = js.native
  def optionalMemberExpression(
    `object`: atBabelTypesLib.atBabelTypesMod.Expression,
    property: js.Any,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.OptionalMemberExpression = js.native
  def parenthesizedExpression(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.ParenthesizedExpression = js.native
  def pipelineBareFunction(callee: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.PipelineBareFunction = js.native
  def pipelinePrimaryTopicReference(): atBabelTypesLib.atBabelTypesMod.PipelinePrimaryTopicReference = js.native
  def pipelineTopicExpression(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.PipelineTopicExpression = js.native
  def privateName(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.PrivateName = js.native
  def program(body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement]): atBabelTypesLib.atBabelTypesMod.Program = js.native
  def program(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive]
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.module
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.module,
    interpreter: atBabelTypesLib.atBabelTypesMod.InterpreterDirective
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.module,
    interpreter: atBabelTypesLib.atBabelTypesMod.InterpreterDirective,
    sourceFile: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.module,
    interpreter: scala.Null,
    sourceFile: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.script
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.script,
    interpreter: atBabelTypesLib.atBabelTypesMod.InterpreterDirective
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.script,
    interpreter: atBabelTypesLib.atBabelTypesMod.InterpreterDirective,
    sourceFile: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.script,
    interpreter: scala.Null,
    sourceFile: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  def qualifiedTypeIdentifier(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    qualification: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier = js.native
  def qualifiedTypeIdentifier(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    qualification: atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier
  ): atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier = js.native
  def regExpLiteral(pattern: java.lang.String): atBabelTypesLib.atBabelTypesMod.RegExpLiteral = js.native
  def regExpLiteral(pattern: java.lang.String, flags: java.lang.String): atBabelTypesLib.atBabelTypesMod.RegExpLiteral = js.native
  def removeProperties(n: atBabelTypesLib.atBabelTypesMod.Node): scala.Unit = js.native
  def removeProperties(n: atBabelTypesLib.atBabelTypesMod.Node, opts: atBabelTypesLib.Anon_PreserveComments): scala.Unit = js.native
  def removePropertiesDeep[T /* <: atBabelTypesLib.atBabelTypesMod.Node */](n: T): T = js.native
  def removePropertiesDeep[T /* <: atBabelTypesLib.atBabelTypesMod.Node */](n: T, opts: atBabelTypesLib.Anon_PreserveComments): T = js.native
  def restElement(argument: atBabelTypesLib.atBabelTypesMod.LVal): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.atBabelTypesMod.LVal,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.atBabelTypesMod.LVal,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.atBabelTypesMod.LVal,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.atBabelTypesMod.LVal,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.atBabelTypesMod.LVal,
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.atBabelTypesMod.LVal,
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.atBabelTypesMod.LVal,
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def returnStatement(): atBabelTypesLib.atBabelTypesMod.ReturnStatement = js.native
  def returnStatement(argument: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.ReturnStatement = js.native
  def sequenceExpression(expressions: js.Array[atBabelTypesLib.atBabelTypesMod.Expression]): atBabelTypesLib.atBabelTypesMod.SequenceExpression = js.native
  def spreadElement(argument: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.SpreadElement = js.native
  def stringLiteral(value: java.lang.String): atBabelTypesLib.atBabelTypesMod.StringLiteral = js.native
  def stringLiteralTypeAnnotation(value: java.lang.String): atBabelTypesLib.atBabelTypesMod.StringLiteralTypeAnnotation = js.native
  def stringTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.StringTypeAnnotation = js.native
  def switchCase(
    test: atBabelTypesLib.atBabelTypesMod.Expression | js.UndefOr[scala.Nothing],
    consequent: js.Array[atBabelTypesLib.atBabelTypesMod.Statement]
  ): atBabelTypesLib.atBabelTypesMod.SwitchCase = js.native
  def switchCase(test: scala.Null, consequent: js.Array[atBabelTypesLib.atBabelTypesMod.Statement]): atBabelTypesLib.atBabelTypesMod.SwitchCase = js.native
  def switchStatement(
    discriminant: atBabelTypesLib.atBabelTypesMod.Expression,
    cases: js.Array[atBabelTypesLib.atBabelTypesMod.SwitchCase]
  ): atBabelTypesLib.atBabelTypesMod.SwitchStatement = js.native
  def taggedTemplateExpression(
    tag: atBabelTypesLib.atBabelTypesMod.Expression,
    quasi: atBabelTypesLib.atBabelTypesMod.TemplateLiteral
  ): atBabelTypesLib.atBabelTypesMod.TaggedTemplateExpression = js.native
  def taggedTemplateExpression(
    tag: atBabelTypesLib.atBabelTypesMod.Expression,
    quasi: atBabelTypesLib.atBabelTypesMod.TemplateLiteral,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.TaggedTemplateExpression = js.native
  def taggedTemplateExpression(
    tag: atBabelTypesLib.atBabelTypesMod.Expression,
    quasi: atBabelTypesLib.atBabelTypesMod.TemplateLiteral,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.TaggedTemplateExpression = js.native
  def templateElement(value: js.Any): atBabelTypesLib.atBabelTypesMod.TemplateElement = js.native
  def templateElement(value: js.Any, tail: scala.Boolean): atBabelTypesLib.atBabelTypesMod.TemplateElement = js.native
  def templateLiteral(
    quasis: js.Array[atBabelTypesLib.atBabelTypesMod.TemplateElement],
    expressions: js.Array[atBabelTypesLib.atBabelTypesMod.Expression]
  ): atBabelTypesLib.atBabelTypesMod.TemplateLiteral = js.native
  def thisExpression(): atBabelTypesLib.atBabelTypesMod.ThisExpression = js.native
  def thisTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.ThisTypeAnnotation = js.native
  def throwStatement(argument: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.ThrowStatement = js.native
  def traverse[T](n: atBabelTypesLib.atBabelTypesMod.Node, h: atBabelTypesLib.atBabelTypesMod.TraversalHandler[T]): scala.Unit = js.native
  def traverse[T](n: atBabelTypesLib.atBabelTypesMod.Node, h: atBabelTypesLib.atBabelTypesMod.TraversalHandlers[T]): scala.Unit = js.native
  def traverse[T](
    n: atBabelTypesLib.atBabelTypesMod.Node,
    h: atBabelTypesLib.atBabelTypesMod.TraversalHandlers[T],
    state: T
  ): scala.Unit = js.native
  def traverse[T](
    n: atBabelTypesLib.atBabelTypesMod.Node,
    h: atBabelTypesLib.atBabelTypesMod.TraversalHandler[T],
    state: T
  ): scala.Unit = js.native
  def tryStatement(block: atBabelTypesLib.atBabelTypesMod.BlockStatement): atBabelTypesLib.atBabelTypesMod.TryStatement = js.native
  def tryStatement(
    block: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    handler: atBabelTypesLib.atBabelTypesMod.CatchClause
  ): atBabelTypesLib.atBabelTypesMod.TryStatement = js.native
  def tryStatement(
    block: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    handler: atBabelTypesLib.atBabelTypesMod.CatchClause,
    finalizer: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.TryStatement = js.native
  def tryStatement(
    block: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    handler: scala.Null,
    finalizer: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.TryStatement = js.native
  def tsAnyKeyword(): atBabelTypesLib.atBabelTypesMod.TSAnyKeyword = js.native
  def tsArrayType(elementType: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSArrayType = js.native
  def tsAsExpression(
    expression: atBabelTypesLib.atBabelTypesMod.Expression,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSAsExpression = js.native
  def tsBooleanKeyword(): atBabelTypesLib.atBabelTypesMod.TSBooleanKeyword = js.native
  def tsCallSignatureDeclaration(): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def tsConditionalType(
    checkType: atBabelTypesLib.atBabelTypesMod.TSType,
    extendsType: atBabelTypesLib.atBabelTypesMod.TSType,
    trueType: atBabelTypesLib.atBabelTypesMod.TSType,
    falseType: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSConditionalType = js.native
  def tsConstructSignatureDeclaration(): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructorType(): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def tsConstructorType(typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    typeAnnotation: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def tsConstructorType(typeParameters: scala.Null, typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: scala.Null,
    typeAnnotation: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def tsDeclareFunction(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop,
    async: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop,
    async: scala.Boolean,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop,
    async: scala.Boolean,
    declare: scala.Boolean,
    generator: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareMethod(
    decorators: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.Decorator] | scala.Null],
    key: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.StringLiteral | atBabelTypesLib.atBabelTypesMod.NumericLiteral | atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.LVal],
    returnType: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    access: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
    ],
    accessibility: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
    ],
    async: js.UndefOr[scala.Boolean],
    computed: js.UndefOr[scala.Boolean],
    generator: js.UndefOr[scala.Boolean],
    kind: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set | atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.constructor
    ],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    _static: js.UndefOr[scala.Boolean | scala.Null]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareMethod = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember]
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember],
    _const: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember],
    _const: scala.Boolean,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember],
    _const: scala.Boolean,
    declare: scala.Boolean,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember],
    _const: scala.Boolean,
    declare: scala.Null,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember],
    _const: scala.Null,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember],
    _const: scala.Null,
    declare: scala.Boolean,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember],
    _const: scala.Null,
    declare: scala.Null,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumMember(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.TSEnumMember = js.native
  def tsEnumMember(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSEnumMember = js.native
  def tsEnumMember(id: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.TSEnumMember = js.native
  def tsEnumMember(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSEnumMember = js.native
  def tsExportAssignment(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.TSExportAssignment = js.native
  def tsExpressionWithTypeArguments(expression: atBabelTypesLib.atBabelTypesMod.TSEntityName): atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments = js.native
  def tsExpressionWithTypeArguments(
    expression: atBabelTypesLib.atBabelTypesMod.TSEntityName,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments = js.native
  def tsExternalModuleReference(expression: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.TSExternalModuleReference = js.native
  def tsFunctionType(): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def tsFunctionType(typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    typeAnnotation: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def tsFunctionType(typeParameters: scala.Null, typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: scala.Null,
    typeAnnotation: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def tsImportEqualsDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    moduleReference: atBabelTypesLib.atBabelTypesMod.TSEntityName
  ): atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    moduleReference: atBabelTypesLib.atBabelTypesMod.TSEntityName,
    isExport: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    moduleReference: atBabelTypesLib.atBabelTypesMod.TSExternalModuleReference
  ): atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    moduleReference: atBabelTypesLib.atBabelTypesMod.TSExternalModuleReference,
    isExport: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration = js.native
  def tsImportType(argument: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.TSImportType = js.native
  def tsImportType(
    argument: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    qualifier: atBabelTypesLib.atBabelTypesMod.TSEntityName
  ): atBabelTypesLib.atBabelTypesMod.TSImportType = js.native
  def tsImportType(
    argument: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    qualifier: atBabelTypesLib.atBabelTypesMod.TSEntityName,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.TSImportType = js.native
  def tsImportType(
    argument: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    qualifier: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.TSImportType = js.native
  def tsIndexSignature(parameters: js.Array[atBabelTypesLib.atBabelTypesMod.Identifier]): atBabelTypesLib.atBabelTypesMod.TSIndexSignature = js.native
  def tsIndexSignature(
    parameters: js.Array[atBabelTypesLib.atBabelTypesMod.Identifier],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSIndexSignature = js.native
  def tsIndexSignature(
    parameters: js.Array[atBabelTypesLib.atBabelTypesMod.Identifier],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSIndexSignature = js.native
  def tsIndexSignature(
    parameters: js.Array[atBabelTypesLib.atBabelTypesMod.Identifier],
    typeAnnotation: scala.Null,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSIndexSignature = js.native
  def tsIndexedAccessType(
    objectType: atBabelTypesLib.atBabelTypesMod.TSType,
    indexType: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSIndexedAccessType = js.native
  def tsInferType(typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter): atBabelTypesLib.atBabelTypesMod.TSInferType = js.native
  def tsInterfaceBody(body: js.Array[atBabelTypesLib.atBabelTypesMod.TSTypeElement]): atBabelTypesLib.atBabelTypesMod.TSInterfaceBody = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsIntersectionType(types: js.Array[atBabelTypesLib.atBabelTypesMod.TSType]): atBabelTypesLib.atBabelTypesMod.TSIntersectionType = js.native
  def tsLiteralType(literal: atBabelTypesLib.atBabelTypesMod.BooleanLiteral): atBabelTypesLib.atBabelTypesMod.TSLiteralType = js.native
  def tsLiteralType(literal: atBabelTypesLib.atBabelTypesMod.NumericLiteral): atBabelTypesLib.atBabelTypesMod.TSLiteralType = js.native
  def tsLiteralType(literal: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.TSLiteralType = js.native
  def tsMappedType(typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType,
    optional: scala.Boolean,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType,
    optional: scala.Null,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter,
    typeAnnotation: scala.Null,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter,
    typeAnnotation: scala.Null,
    optional: scala.Boolean,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter,
    typeAnnotation: scala.Null,
    optional: scala.Null,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMethodSignature(key: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    computed: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsModuleBlock(body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement]): atBabelTypesLib.atBabelTypesMod.TSModuleBlock = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock,
    declare: scala.Boolean,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock,
    declare: scala.Null,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration,
    declare: scala.Boolean,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration,
    declare: scala.Null,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock,
    declare: scala.Boolean,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock,
    declare: scala.Null,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration,
    declare: scala.Boolean,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration,
    declare: scala.Null,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsNamespaceExportDeclaration(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.TSNamespaceExportDeclaration = js.native
  def tsNeverKeyword(): atBabelTypesLib.atBabelTypesMod.TSNeverKeyword = js.native
  def tsNonNullExpression(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.TSNonNullExpression = js.native
  def tsNullKeyword(): atBabelTypesLib.atBabelTypesMod.TSNullKeyword = js.native
  def tsNumberKeyword(): atBabelTypesLib.atBabelTypesMod.TSNumberKeyword = js.native
  def tsObjectKeyword(): atBabelTypesLib.atBabelTypesMod.TSObjectKeyword = js.native
  def tsOptionalType(typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSOptionalType = js.native
  def tsParameterProperty(parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  def tsParameterProperty(
    parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern,
    accessibility: scala.Null,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  def tsParameterProperty(parameter: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  def tsParameterProperty(
    parameter: atBabelTypesLib.atBabelTypesMod.Identifier,
    accessibility: scala.Null,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(
    parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.`private`
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(
    parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.`private`,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(
    parameter: atBabelTypesLib.atBabelTypesMod.Identifier,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.`private`
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(
    parameter: atBabelTypesLib.atBabelTypesMod.Identifier,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.`private`,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(
    parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.`protected`
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(
    parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.`protected`,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(
    parameter: atBabelTypesLib.atBabelTypesMod.Identifier,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.`protected`
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(
    parameter: atBabelTypesLib.atBabelTypesMod.Identifier,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.`protected`,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(
    parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.public
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(
    parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.public,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(
    parameter: atBabelTypesLib.atBabelTypesMod.Identifier,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.public
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(
    parameter: atBabelTypesLib.atBabelTypesMod.Identifier,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.public,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  def tsParenthesizedType(typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSParenthesizedType = js.native
  def tsPropertySignature(key: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression,
    computed: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression,
    computed: scala.Boolean,
    optional: scala.Boolean,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def tsQualifiedName(
    left: atBabelTypesLib.atBabelTypesMod.TSEntityName,
    right: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.TSQualifiedName = js.native
  def tsRestType(typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSRestType = js.native
  def tsStringKeyword(): atBabelTypesLib.atBabelTypesMod.TSStringKeyword = js.native
  def tsSymbolKeyword(): atBabelTypesLib.atBabelTypesMod.TSSymbolKeyword = js.native
  def tsThisType(): atBabelTypesLib.atBabelTypesMod.TSThisType = js.native
  def tsTupleType(elementTypes: js.Array[atBabelTypesLib.atBabelTypesMod.TSType]): atBabelTypesLib.atBabelTypesMod.TSTupleType = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAnnotation(typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation = js.native
  def tsTypeAssertion(
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType,
    expression: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAssertion = js.native
  def tsTypeLiteral(members: js.Array[atBabelTypesLib.atBabelTypesMod.TSTypeElement]): atBabelTypesLib.atBabelTypesMod.TSTypeLiteral = js.native
  def tsTypeOperator(typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSTypeOperator = js.native
  def tsTypeOperator(typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType, operator: java.lang.String): atBabelTypesLib.atBabelTypesMod.TSTypeOperator = js.native
  def tsTypeParameter(): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameter(
    constraint: atBabelTypesLib.atBabelTypesMod.TSType,
    _default: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameter(
    constraint: atBabelTypesLib.atBabelTypesMod.TSType,
    _default: atBabelTypesLib.atBabelTypesMod.TSType,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: atBabelTypesLib.atBabelTypesMod.TSType, _default: scala.Null, name: java.lang.String): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: scala.Null, _default: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: scala.Null, _default: atBabelTypesLib.atBabelTypesMod.TSType, name: java.lang.String): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: scala.Null, _default: scala.Null, name: java.lang.String): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameterDeclaration(params: js.Array[atBabelTypesLib.atBabelTypesMod.TSTypeParameter]): atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration = js.native
  def tsTypeParameterInstantiation(params: js.Array[atBabelTypesLib.atBabelTypesMod.TSType]): atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation = js.native
  def tsTypePredicate(
    parameterName: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSTypePredicate = js.native
  def tsTypePredicate(
    parameterName: atBabelTypesLib.atBabelTypesMod.TSThisType,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSTypePredicate = js.native
  def tsTypeQuery(exprName: atBabelTypesLib.atBabelTypesMod.TSEntityName): atBabelTypesLib.atBabelTypesMod.TSTypeQuery = js.native
  def tsTypeQuery(exprName: atBabelTypesLib.atBabelTypesMod.TSImportType): atBabelTypesLib.atBabelTypesMod.TSTypeQuery = js.native
  def tsTypeReference(typeName: atBabelTypesLib.atBabelTypesMod.TSEntityName): atBabelTypesLib.atBabelTypesMod.TSTypeReference = js.native
  def tsTypeReference(
    typeName: atBabelTypesLib.atBabelTypesMod.TSEntityName,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.TSTypeReference = js.native
  def tsUndefinedKeyword(): atBabelTypesLib.atBabelTypesMod.TSUndefinedKeyword = js.native
  def tsUnionType(types: js.Array[atBabelTypesLib.atBabelTypesMod.TSType]): atBabelTypesLib.atBabelTypesMod.TSUnionType = js.native
  def tsUnknownKeyword(): atBabelTypesLib.atBabelTypesMod.TSUnknownKeyword = js.native
  def tsVoidKeyword(): atBabelTypesLib.atBabelTypesMod.TSVoidKeyword = js.native
  def tupleTypeAnnotation(types: js.Array[atBabelTypesLib.atBabelTypesMod.FlowType]): atBabelTypesLib.atBabelTypesMod.TupleTypeAnnotation = js.native
  def typeAlias(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    right: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.TypeAlias = js.native
  def typeAlias(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    right: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.TypeAlias = js.native
  def typeAlias(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    right: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.TypeAlias = js.native
  def typeAnnotation(typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.TypeAnnotation = js.native
  def typeCastExpression(
    expression: atBabelTypesLib.atBabelTypesMod.Expression,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TypeCastExpression = js.native
  def typeParameter(): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    _default: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    _default: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    _default: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    _default: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: scala.Null,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    _default: scala.Null,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    _default: scala.Null,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    _default: scala.Null,
    variance: scala.Null,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: scala.Null,
    _default: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: scala.Null,
    _default: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: scala.Null,
    _default: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: scala.Null,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: scala.Null, variance: atBabelTypesLib.atBabelTypesMod.Variance): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: scala.Null,
    _default: scala.Null,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: scala.Null, variance: scala.Null, name: java.lang.String): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameterDeclaration(params: js.Array[atBabelTypesLib.atBabelTypesMod.TypeParameter]): atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration = js.native
  def typeParameterInstantiation(params: js.Array[atBabelTypesLib.atBabelTypesMod.FlowType]): atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation = js.native
  def typeofTypeAnnotation(argument: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.TypeofTypeAnnotation = js.native
  @JSName("unaryExpression")
  def `unaryExpression_!`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`!`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_!`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`!`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_+`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`+`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_+`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`+`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_-`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`-`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_-`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`-`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(
    operator: atBabelTypesLib.atBabelTypesLibStrings.delete,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(
    operator: atBabelTypesLib.atBabelTypesLibStrings.delete,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_throw(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`throw`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_throw(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`throw`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(
    operator: atBabelTypesLib.atBabelTypesLibStrings.typeof,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(
    operator: atBabelTypesLib.atBabelTypesLibStrings.typeof,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(
    operator: atBabelTypesLib.atBabelTypesLibStrings.void,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(
    operator: atBabelTypesLib.atBabelTypesLibStrings.void,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_~`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`~`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_~`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`~`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  def unionTypeAnnotation(types: js.Array[atBabelTypesLib.atBabelTypesMod.FlowType]): atBabelTypesLib.atBabelTypesMod.UnionTypeAnnotation = js.native
  @JSName("updateExpression")
  def `updateExpression_++`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`++`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_++`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`++`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_--`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`--`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_--`(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`--`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UpdateExpression = js.native
  def validate(n: atBabelTypesLib.atBabelTypesMod.Node, key: java.lang.String, value: js.Any): scala.Unit = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_const(
    kind: atBabelTypesLib.atBabelTypesLibStrings.const,
    declarations: js.Array[atBabelTypesLib.atBabelTypesMod.VariableDeclarator]
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_const(
    kind: atBabelTypesLib.atBabelTypesLibStrings.const,
    declarations: js.Array[atBabelTypesLib.atBabelTypesMod.VariableDeclarator],
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_let(
    kind: atBabelTypesLib.atBabelTypesLibStrings.let,
    declarations: js.Array[atBabelTypesLib.atBabelTypesMod.VariableDeclarator]
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_let(
    kind: atBabelTypesLib.atBabelTypesLibStrings.let,
    declarations: js.Array[atBabelTypesLib.atBabelTypesMod.VariableDeclarator],
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_var(
    kind: atBabelTypesLib.atBabelTypesLibStrings.`var`,
    declarations: js.Array[atBabelTypesLib.atBabelTypesMod.VariableDeclarator]
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_var(
    kind: atBabelTypesLib.atBabelTypesLibStrings.`var`,
    declarations: js.Array[atBabelTypesLib.atBabelTypesMod.VariableDeclarator],
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  def variableDeclarator(id: atBabelTypesLib.atBabelTypesMod.LVal): atBabelTypesLib.atBabelTypesMod.VariableDeclarator = js.native
  def variableDeclarator(id: atBabelTypesLib.atBabelTypesMod.LVal, init: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.VariableDeclarator = js.native
  def variableDeclarator(
    id: atBabelTypesLib.atBabelTypesMod.LVal,
    init: atBabelTypesLib.atBabelTypesMod.Expression,
    definite: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclarator = js.native
  def variableDeclarator(id: atBabelTypesLib.atBabelTypesMod.LVal, init: scala.Null, definite: scala.Boolean): atBabelTypesLib.atBabelTypesMod.VariableDeclarator = js.native
  @JSName("variance")
  def variance_minus(kind: atBabelTypesLib.atBabelTypesLibStrings.minus): atBabelTypesLib.atBabelTypesMod.Variance = js.native
  @JSName("variance")
  def variance_plus(kind: atBabelTypesLib.atBabelTypesLibStrings.plus): atBabelTypesLib.atBabelTypesMod.Variance = js.native
  def voidTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.VoidTypeAnnotation = js.native
  def whileStatement(
    test: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.WhileStatement = js.native
  def whileStatement(test: atBabelTypesLib.atBabelTypesMod.Expression, body: atBabelTypesLib.atBabelTypesMod.Statement): atBabelTypesLib.atBabelTypesMod.WhileStatement = js.native
  def withStatement(
    `object`: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.WithStatement = js.native
  def withStatement(
    `object`: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.WithStatement = js.native
  def yieldExpression(): atBabelTypesLib.atBabelTypesMod.YieldExpression = js.native
  def yieldExpression(argument: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.YieldExpression = js.native
  def yieldExpression(argument: atBabelTypesLib.atBabelTypesMod.Expression, delegate: scala.Boolean): atBabelTypesLib.atBabelTypesMod.YieldExpression = js.native
  def yieldExpression(argument: scala.Null, delegate: scala.Boolean): atBabelTypesLib.atBabelTypesMod.YieldExpression = js.native
}

