package typings.babelTypes.mod

import typings.babelTypes.anon.Body
import typings.babelTypes.anon.BuildUndefinedNode
import typings.babelTypes.anon.Children
import typings.babelTypes.anon.Computed
import typings.babelTypes.anon.Cooked
import typings.babelTypes.anon.Index
import typings.babelTypes.anon.PickMemberExpressionobjec
import typings.babelTypes.anon.PreserveComments
import typings.babelTypes.anon.ToString
import typings.babelTypes.anon.Type
import typings.babelTypes.babelTypesBooleans.`false`
import typings.babelTypes.babelTypesBooleans.`true`
import typings.babelTypes.babelTypesStrings.Ampersand
import typings.babelTypes.babelTypesStrings.AmpersandAmpersand
import typings.babelTypes.babelTypesStrings.Asterisk
import typings.babelTypes.babelTypesStrings.AsteriskAsterisk
import typings.babelTypes.babelTypesStrings.BlockStatement
import typings.babelTypes.babelTypesStrings.ClassBody
import typings.babelTypes.babelTypesStrings.CommonJS
import typings.babelTypes.babelTypesStrings.ES
import typings.babelTypes.babelTypesStrings.EqualssignEqualssign
import typings.babelTypes.babelTypesStrings.EqualssignEqualssignEqualssign
import typings.babelTypes.babelTypesStrings.Exclamationmark
import typings.babelTypes.babelTypesStrings.ExclamationmarkEqualssign
import typings.babelTypes.babelTypesStrings.ExclamationmarkEqualssignEqualssign
import typings.babelTypes.babelTypesStrings.Greaterthansign
import typings.babelTypes.babelTypesStrings.GreaterthansignEqualssign
import typings.babelTypes.babelTypesStrings.GreaterthansignGreaterthansign
import typings.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typings.babelTypes.babelTypesStrings.Identifier
import typings.babelTypes.babelTypesStrings.Lessthansign
import typings.babelTypes.babelTypesStrings.LessthansignEqualssign
import typings.babelTypes.babelTypesStrings.LessthansignLessthansign
import typings.babelTypes.babelTypesStrings.Percentsign
import typings.babelTypes.babelTypesStrings.Plussign
import typings.babelTypes.babelTypesStrings.PlussignPlussign
import typings.babelTypes.babelTypesStrings.QuestionmarkQuestionmark
import typings.babelTypes.babelTypesStrings.Slash
import typings.babelTypes.babelTypesStrings.StringLiteral
import typings.babelTypes.babelTypesStrings.Tilde
import typings.babelTypes.babelTypesStrings.Verticalline
import typings.babelTypes.babelTypesStrings.VerticallineGreaterthansign
import typings.babelTypes.babelTypesStrings.VerticallineVerticalline
import typings.babelTypes.babelTypesStrings.`--`
import typings.babelTypes.babelTypesStrings.`-_`
import typings.babelTypes.babelTypesStrings.`await using`
import typings.babelTypes.babelTypesStrings.`object`
import typings.babelTypes.babelTypesStrings.`throw`
import typings.babelTypes.babelTypesStrings.`using`
import typings.babelTypes.babelTypesStrings.`var`
import typings.babelTypes.babelTypesStrings.boolean
import typings.babelTypes.babelTypesStrings.const
import typings.babelTypes.babelTypesStrings.constructor
import typings.babelTypes.babelTypesStrings.delete
import typings.babelTypes.babelTypesStrings.function_
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.in
import typings.babelTypes.babelTypesStrings.instanceof
import typings.babelTypes.babelTypesStrings.let
import typings.babelTypes.babelTypesStrings.method_
import typings.babelTypes.babelTypesStrings.minus
import typings.babelTypes.babelTypesStrings.module
import typings.babelTypes.babelTypesStrings.number
import typings.babelTypes.babelTypesStrings.plus
import typings.babelTypes.babelTypesStrings.script
import typings.babelTypes.babelTypesStrings.set
import typings.babelTypes.babelTypesStrings.string
import typings.babelTypes.babelTypesStrings.symbol
import typings.babelTypes.babelTypesStrings.typeof
import typings.babelTypes.babelTypesStrings.undefined
import typings.babelTypes.babelTypesStrings.void
import typings.babelTypes.mod.^
import typings.std.Extract
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addComment[T /* <: Node */](node: T, `type`: CommentTypeShorthand, content: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addComment")(node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[T]
inline def addComment[T /* <: Node */](node: T, `type`: CommentTypeShorthand, content: String, line: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addComment")(node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], content.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[T]

inline def addComments[T /* <: Node */](node: T, `type`: CommentTypeShorthand, comments: js.Array[Comment]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addComments")(node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], comments.asInstanceOf[js.Any])).asInstanceOf[T]

inline def anyTypeAnnotation(): AnyTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("anyTypeAnnotation")().asInstanceOf[AnyTypeAnnotation_]

inline def appendToMemberExpression[T /* <: PickMemberExpressionobjec */](member: T, append: Expression): T = (^.asInstanceOf[js.Dynamic].applyDynamic("appendToMemberExpression")(member.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[T]
inline def appendToMemberExpression[T /* <: PickMemberExpressionobjec */](member: T, append: Expression, computed: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("appendToMemberExpression")(member.asInstanceOf[js.Any], append.asInstanceOf[js.Any], computed.asInstanceOf[js.Any])).asInstanceOf[T]
inline def appendToMemberExpression[T /* <: PickMemberExpressionobjec */](member: T, append: Identifier_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("appendToMemberExpression")(member.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[T]
inline def appendToMemberExpression[T /* <: PickMemberExpressionobjec */](member: T, append: Identifier_, computed: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("appendToMemberExpression")(member.asInstanceOf[js.Any], append.asInstanceOf[js.Any], computed.asInstanceOf[js.Any])).asInstanceOf[T]
inline def appendToMemberExpression[T /* <: PickMemberExpressionobjec */](member: T, append: PrivateName_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("appendToMemberExpression")(member.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[T]
inline def appendToMemberExpression[T /* <: PickMemberExpressionobjec */](member: T, append: PrivateName_, computed: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("appendToMemberExpression")(member.asInstanceOf[js.Any], append.asInstanceOf[js.Any], computed.asInstanceOf[js.Any])).asInstanceOf[T]

inline def argumentPlaceholder(): ArgumentPlaceholder_ = ^.asInstanceOf[js.Dynamic].applyDynamic("argumentPlaceholder")().asInstanceOf[ArgumentPlaceholder_]

inline def arrayExpression(): ArrayExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayExpression")().asInstanceOf[ArrayExpression_]
inline def arrayExpression(elements: js.Array[Null | Expression | SpreadElement_]): ArrayExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayExpression")(elements.asInstanceOf[js.Any]).asInstanceOf[ArrayExpression_]

inline def arrayPattern(elements: js.Array[Null | PatternLike | LVal]): ArrayPattern_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayPattern")(elements.asInstanceOf[js.Any]).asInstanceOf[ArrayPattern_]

inline def arrayTypeAnnotation(elementType: FlowType): ArrayTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayTypeAnnotation")(elementType.asInstanceOf[js.Any]).asInstanceOf[ArrayTypeAnnotation_]

inline def arrowFunctionExpression(params: js.Array[Identifier_ | Pattern | RestElement_], body: BlockStatement_): ArrowFunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowFunctionExpression")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ArrowFunctionExpression_]
inline def arrowFunctionExpression(params: js.Array[Identifier_ | Pattern | RestElement_], body: BlockStatement_, async: Boolean): ArrowFunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowFunctionExpression")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[ArrowFunctionExpression_]
inline def arrowFunctionExpression(params: js.Array[Identifier_ | Pattern | RestElement_], body: Expression): ArrowFunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowFunctionExpression")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ArrowFunctionExpression_]
inline def arrowFunctionExpression(params: js.Array[Identifier_ | Pattern | RestElement_], body: Expression, async: Boolean): ArrowFunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("arrowFunctionExpression")(params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[ArrowFunctionExpression_]

inline def assertAccessor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertAccessor")().asInstanceOf[Unit]
inline def assertAccessor(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertAccessor")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertAccessor(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAccessor")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertAccessor(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAccessor")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertAccessor(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAccessor")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertAnyTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertAnyTypeAnnotation")().asInstanceOf[Unit]
inline def assertAnyTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertAnyTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertAnyTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAnyTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertAnyTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAnyTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertAnyTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAnyTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertArgumentPlaceholder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertArgumentPlaceholder")().asInstanceOf[Unit]
inline def assertArgumentPlaceholder(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertArgumentPlaceholder")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertArgumentPlaceholder(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArgumentPlaceholder")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertArgumentPlaceholder(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArgumentPlaceholder")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertArgumentPlaceholder(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArgumentPlaceholder")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertArrayExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayExpression")().asInstanceOf[Unit]
inline def assertArrayExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertArrayExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertArrayExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertArrayExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertArrayPattern(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayPattern")().asInstanceOf[Unit]
inline def assertArrayPattern(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayPattern")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertArrayPattern(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertArrayPattern(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertArrayPattern(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertArrayTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayTypeAnnotation")().asInstanceOf[Unit]
inline def assertArrayTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertArrayTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertArrayTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertArrayTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArrayTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertArrowFunctionExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertArrowFunctionExpression")().asInstanceOf[Unit]
inline def assertArrowFunctionExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertArrowFunctionExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertArrowFunctionExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArrowFunctionExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertArrowFunctionExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArrowFunctionExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertArrowFunctionExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArrowFunctionExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertAssignmentExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertAssignmentExpression")().asInstanceOf[Unit]
inline def assertAssignmentExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertAssignmentExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertAssignmentExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAssignmentExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertAssignmentExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAssignmentExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertAssignmentExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAssignmentExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertAssignmentPattern(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertAssignmentPattern")().asInstanceOf[Unit]
inline def assertAssignmentPattern(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertAssignmentPattern")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertAssignmentPattern(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAssignmentPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertAssignmentPattern(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAssignmentPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertAssignmentPattern(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAssignmentPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertAwaitExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertAwaitExpression")().asInstanceOf[Unit]
inline def assertAwaitExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertAwaitExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertAwaitExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAwaitExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertAwaitExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAwaitExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertAwaitExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAwaitExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertBigIntLiteral(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBigIntLiteral")().asInstanceOf[Unit]
inline def assertBigIntLiteral(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBigIntLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertBigIntLiteral(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBigIntLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBigIntLiteral(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBigIntLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBigIntLiteral(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBigIntLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertBinary(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBinary")().asInstanceOf[Unit]
inline def assertBinary(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBinary")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertBinary(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBinary")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBinary(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBinary")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBinary(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBinary")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertBinaryExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBinaryExpression")().asInstanceOf[Unit]
inline def assertBinaryExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBinaryExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertBinaryExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBinaryExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBinaryExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBinaryExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBinaryExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBinaryExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertBindExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBindExpression")().asInstanceOf[Unit]
inline def assertBindExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBindExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertBindExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBindExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBindExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBindExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBindExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBindExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertBlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBlock")().asInstanceOf[Unit]
inline def assertBlock(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBlock")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertBlock(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBlock(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBlock(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertBlockParent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBlockParent")().asInstanceOf[Unit]
inline def assertBlockParent(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBlockParent")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertBlockParent(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBlockParent")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBlockParent(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBlockParent")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBlockParent(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBlockParent")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertBlockStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBlockStatement")().asInstanceOf[Unit]
inline def assertBlockStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBlockStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertBlockStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBlockStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBlockStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBlockStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBlockStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBlockStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertBooleanLiteral(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanLiteral")().asInstanceOf[Unit]
inline def assertBooleanLiteral(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertBooleanLiteral(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBooleanLiteral(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBooleanLiteral(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertBooleanLiteralTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanLiteralTypeAnnotation")().asInstanceOf[Unit]
inline def assertBooleanLiteralTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanLiteralTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertBooleanLiteralTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBooleanLiteralTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBooleanLiteralTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertBooleanTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanTypeAnnotation")().asInstanceOf[Unit]
inline def assertBooleanTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertBooleanTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBooleanTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBooleanTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBooleanTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertBreakStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBreakStatement")().asInstanceOf[Unit]
inline def assertBreakStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBreakStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertBreakStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBreakStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBreakStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBreakStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertBreakStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertBreakStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertCallExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertCallExpression")().asInstanceOf[Unit]
inline def assertCallExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertCallExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertCallExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertCallExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertCallExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertCallExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertCallExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertCallExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertCatchClause(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertCatchClause")().asInstanceOf[Unit]
inline def assertCatchClause(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertCatchClause")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertCatchClause(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertCatchClause")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertCatchClause(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertCatchClause")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertCatchClause(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertCatchClause")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertClass(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClass")().asInstanceOf[Unit]
inline def assertClass(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClass")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertClass(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClass")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClass(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClass")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClass(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClass")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertClassAccessorProperty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassAccessorProperty")().asInstanceOf[Unit]
inline def assertClassAccessorProperty(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassAccessorProperty")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertClassAccessorProperty(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassAccessorProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassAccessorProperty(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassAccessorProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassAccessorProperty(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassAccessorProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertClassBody(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassBody")().asInstanceOf[Unit]
inline def assertClassBody(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassBody")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertClassBody(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassBody(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassBody(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertClassDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassDeclaration")().asInstanceOf[Unit]
inline def assertClassDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertClassDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertClassExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassExpression")().asInstanceOf[Unit]
inline def assertClassExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertClassExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertClassImplements(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassImplements")().asInstanceOf[Unit]
inline def assertClassImplements(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassImplements")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertClassImplements(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassImplements")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassImplements(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassImplements")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassImplements(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassImplements")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertClassMethod(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassMethod")().asInstanceOf[Unit]
inline def assertClassMethod(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassMethod")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertClassMethod(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassMethod(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassMethod(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertClassPrivateMethod(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassPrivateMethod")().asInstanceOf[Unit]
inline def assertClassPrivateMethod(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassPrivateMethod")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertClassPrivateMethod(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassPrivateMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassPrivateMethod(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassPrivateMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassPrivateMethod(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassPrivateMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertClassPrivateProperty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassPrivateProperty")().asInstanceOf[Unit]
inline def assertClassPrivateProperty(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassPrivateProperty")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertClassPrivateProperty(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassPrivateProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassPrivateProperty(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassPrivateProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassPrivateProperty(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassPrivateProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertClassProperty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassProperty")().asInstanceOf[Unit]
inline def assertClassProperty(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertClassProperty")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertClassProperty(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassProperty(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertClassProperty(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertClassProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertCompletionStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertCompletionStatement")().asInstanceOf[Unit]
inline def assertCompletionStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertCompletionStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertCompletionStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertCompletionStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertCompletionStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertCompletionStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertCompletionStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertCompletionStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertConditional(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertConditional")().asInstanceOf[Unit]
inline def assertConditional(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertConditional")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertConditional(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertConditional")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertConditional(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertConditional")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertConditional(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertConditional")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertConditionalExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertConditionalExpression")().asInstanceOf[Unit]
inline def assertConditionalExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertConditionalExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertConditionalExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertConditionalExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertConditionalExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertConditionalExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertConditionalExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertConditionalExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertContinueStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertContinueStatement")().asInstanceOf[Unit]
inline def assertContinueStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertContinueStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertContinueStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertContinueStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertContinueStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertContinueStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertContinueStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertContinueStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDebuggerStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDebuggerStatement")().asInstanceOf[Unit]
inline def assertDebuggerStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDebuggerStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDebuggerStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDebuggerStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDebuggerStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDebuggerStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDebuggerStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDebuggerStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDecimalLiteral(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDecimalLiteral")().asInstanceOf[Unit]
inline def assertDecimalLiteral(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDecimalLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDecimalLiteral(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDecimalLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDecimalLiteral(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDecimalLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDecimalLiteral(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDecimalLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclaration")().asInstanceOf[Unit]
inline def assertDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDeclareClass(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareClass")().asInstanceOf[Unit]
inline def assertDeclareClass(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareClass")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDeclareClass(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareClass")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareClass(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareClass")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareClass(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareClass")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDeclareExportAllDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareExportAllDeclaration")().asInstanceOf[Unit]
inline def assertDeclareExportAllDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareExportAllDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDeclareExportAllDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareExportAllDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareExportAllDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareExportAllDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareExportAllDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareExportAllDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDeclareExportDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareExportDeclaration")().asInstanceOf[Unit]
inline def assertDeclareExportDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDeclareExportDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareExportDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareExportDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDeclareFunction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareFunction")().asInstanceOf[Unit]
inline def assertDeclareFunction(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareFunction")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDeclareFunction(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareFunction(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareFunction(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDeclareInterface(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareInterface")().asInstanceOf[Unit]
inline def assertDeclareInterface(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareInterface")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDeclareInterface(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareInterface")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareInterface(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareInterface")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareInterface(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareInterface")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDeclareModule(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareModule")().asInstanceOf[Unit]
inline def assertDeclareModule(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareModule")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDeclareModule(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareModule")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareModule(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareModule")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareModule(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareModule")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDeclareModuleExports(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareModuleExports")().asInstanceOf[Unit]
inline def assertDeclareModuleExports(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareModuleExports")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDeclareModuleExports(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareModuleExports")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareModuleExports(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareModuleExports")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareModuleExports(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareModuleExports")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDeclareOpaqueType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareOpaqueType")().asInstanceOf[Unit]
inline def assertDeclareOpaqueType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareOpaqueType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDeclareOpaqueType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareOpaqueType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareOpaqueType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareOpaqueType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareOpaqueType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareOpaqueType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDeclareTypeAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareTypeAlias")().asInstanceOf[Unit]
inline def assertDeclareTypeAlias(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareTypeAlias")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDeclareTypeAlias(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareTypeAlias")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareTypeAlias(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareTypeAlias")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareTypeAlias(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareTypeAlias")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDeclareVariable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareVariable")().asInstanceOf[Unit]
inline def assertDeclareVariable(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareVariable")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDeclareVariable(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareVariable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareVariable(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareVariable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclareVariable(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclareVariable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDeclaredPredicate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclaredPredicate")().asInstanceOf[Unit]
inline def assertDeclaredPredicate(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclaredPredicate")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDeclaredPredicate(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclaredPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclaredPredicate(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclaredPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDeclaredPredicate(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDeclaredPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDecorator(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDecorator")().asInstanceOf[Unit]
inline def assertDecorator(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDecorator")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDecorator(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDecorator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDecorator(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDecorator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDecorator(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDecorator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDirective(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDirective")().asInstanceOf[Unit]
inline def assertDirective(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDirective")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDirective(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDirective")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDirective(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDirective")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDirective(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDirective")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDirectiveLiteral(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDirectiveLiteral")().asInstanceOf[Unit]
inline def assertDirectiveLiteral(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDirectiveLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDirectiveLiteral(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDirectiveLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDirectiveLiteral(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDirectiveLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDirectiveLiteral(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDirectiveLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDoExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDoExpression")().asInstanceOf[Unit]
inline def assertDoExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDoExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDoExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDoExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDoExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDoExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDoExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDoExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertDoWhileStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDoWhileStatement")().asInstanceOf[Unit]
inline def assertDoWhileStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertDoWhileStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertDoWhileStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDoWhileStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDoWhileStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDoWhileStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertDoWhileStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertDoWhileStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertEmptyStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEmptyStatement")().asInstanceOf[Unit]
inline def assertEmptyStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEmptyStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertEmptyStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEmptyStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEmptyStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEmptyStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEmptyStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEmptyStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertEmptyTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEmptyTypeAnnotation")().asInstanceOf[Unit]
inline def assertEmptyTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEmptyTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertEmptyTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEmptyTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEmptyTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEmptyTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEmptyTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEmptyTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertEnumBody(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBody")().asInstanceOf[Unit]
inline def assertEnumBody(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBody")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertEnumBody(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumBody(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumBody(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertEnumBooleanBody(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBooleanBody")().asInstanceOf[Unit]
inline def assertEnumBooleanBody(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBooleanBody")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertEnumBooleanBody(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBooleanBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumBooleanBody(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBooleanBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumBooleanBody(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBooleanBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertEnumBooleanMember(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBooleanMember")().asInstanceOf[Unit]
inline def assertEnumBooleanMember(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBooleanMember")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertEnumBooleanMember(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBooleanMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumBooleanMember(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBooleanMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumBooleanMember(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumBooleanMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertEnumDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumDeclaration")().asInstanceOf[Unit]
inline def assertEnumDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertEnumDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertEnumDefaultedMember(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumDefaultedMember")().asInstanceOf[Unit]
inline def assertEnumDefaultedMember(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumDefaultedMember")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertEnumDefaultedMember(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumDefaultedMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumDefaultedMember(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumDefaultedMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumDefaultedMember(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumDefaultedMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertEnumMember(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumMember")().asInstanceOf[Unit]
inline def assertEnumMember(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumMember")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertEnumMember(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumMember(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumMember(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertEnumNumberBody(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumNumberBody")().asInstanceOf[Unit]
inline def assertEnumNumberBody(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumNumberBody")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertEnumNumberBody(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumNumberBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumNumberBody(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumNumberBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumNumberBody(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumNumberBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertEnumNumberMember(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumNumberMember")().asInstanceOf[Unit]
inline def assertEnumNumberMember(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumNumberMember")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertEnumNumberMember(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumNumberMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumNumberMember(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumNumberMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumNumberMember(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumNumberMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertEnumStringBody(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumStringBody")().asInstanceOf[Unit]
inline def assertEnumStringBody(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumStringBody")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertEnumStringBody(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumStringBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumStringBody(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumStringBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumStringBody(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumStringBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertEnumStringMember(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumStringMember")().asInstanceOf[Unit]
inline def assertEnumStringMember(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumStringMember")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertEnumStringMember(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumStringMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumStringMember(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumStringMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumStringMember(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumStringMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertEnumSymbolBody(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumSymbolBody")().asInstanceOf[Unit]
inline def assertEnumSymbolBody(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumSymbolBody")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertEnumSymbolBody(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumSymbolBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumSymbolBody(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumSymbolBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertEnumSymbolBody(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnumSymbolBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertExistsTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExistsTypeAnnotation")().asInstanceOf[Unit]
inline def assertExistsTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExistsTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertExistsTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExistsTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExistsTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExistsTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExistsTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExistsTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertExportAllDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExportAllDeclaration")().asInstanceOf[Unit]
inline def assertExportAllDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExportAllDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertExportAllDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportAllDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExportAllDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportAllDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExportAllDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportAllDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertExportDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDeclaration")().asInstanceOf[Unit]
inline def assertExportDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertExportDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExportDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExportDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertExportDefaultDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDefaultDeclaration")().asInstanceOf[Unit]
inline def assertExportDefaultDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDefaultDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertExportDefaultDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDefaultDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExportDefaultDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDefaultDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExportDefaultDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDefaultDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertExportDefaultSpecifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDefaultSpecifier")().asInstanceOf[Unit]
inline def assertExportDefaultSpecifier(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDefaultSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertExportDefaultSpecifier(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDefaultSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExportDefaultSpecifier(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDefaultSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExportDefaultSpecifier(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportDefaultSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertExportNamedDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExportNamedDeclaration")().asInstanceOf[Unit]
inline def assertExportNamedDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExportNamedDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertExportNamedDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportNamedDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExportNamedDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportNamedDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExportNamedDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportNamedDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertExportNamespaceSpecifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExportNamespaceSpecifier")().asInstanceOf[Unit]
inline def assertExportNamespaceSpecifier(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExportNamespaceSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertExportNamespaceSpecifier(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportNamespaceSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExportNamespaceSpecifier(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportNamespaceSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExportNamespaceSpecifier(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportNamespaceSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertExportSpecifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExportSpecifier")().asInstanceOf[Unit]
inline def assertExportSpecifier(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExportSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertExportSpecifier(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExportSpecifier(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExportSpecifier(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExportSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExpression")().asInstanceOf[Unit]
inline def assertExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertExpressionStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExpressionStatement")().asInstanceOf[Unit]
inline def assertExpressionStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExpressionStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertExpressionStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExpressionStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExpressionStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExpressionStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExpressionStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExpressionStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertExpressionWrapper(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExpressionWrapper")().asInstanceOf[Unit]
inline def assertExpressionWrapper(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertExpressionWrapper")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertExpressionWrapper(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExpressionWrapper")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExpressionWrapper(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExpressionWrapper")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertExpressionWrapper(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertExpressionWrapper")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFile")().asInstanceOf[Unit]
inline def assertFile(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFile")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertFile(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFile")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFile(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFile")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFile(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFile")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertFlow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFlow")().asInstanceOf[Unit]
inline def assertFlow(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFlow")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertFlow(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlow")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFlow(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlow")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFlow(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlow")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertFlowBaseAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowBaseAnnotation")().asInstanceOf[Unit]
inline def assertFlowBaseAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowBaseAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertFlowBaseAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowBaseAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFlowBaseAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowBaseAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFlowBaseAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowBaseAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertFlowDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowDeclaration")().asInstanceOf[Unit]
inline def assertFlowDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertFlowDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFlowDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFlowDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertFlowPredicate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowPredicate")().asInstanceOf[Unit]
inline def assertFlowPredicate(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowPredicate")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertFlowPredicate(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFlowPredicate(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFlowPredicate(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertFlowType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowType")().asInstanceOf[Unit]
inline def assertFlowType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertFlowType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFlowType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFlowType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFlowType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertFor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFor")().asInstanceOf[Unit]
inline def assertFor(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFor")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertFor(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFor")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFor(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFor")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFor(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFor")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertForInStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertForInStatement")().asInstanceOf[Unit]
inline def assertForInStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertForInStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertForInStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertForInStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertForInStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertForInStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertForInStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertForInStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertForOfStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertForOfStatement")().asInstanceOf[Unit]
inline def assertForOfStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertForOfStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertForOfStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertForOfStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertForOfStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertForOfStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertForOfStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertForOfStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertForStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertForStatement")().asInstanceOf[Unit]
inline def assertForStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertForStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertForStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertForStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertForStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertForStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertForStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertForStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertForXStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertForXStatement")().asInstanceOf[Unit]
inline def assertForXStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertForXStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertForXStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertForXStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertForXStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertForXStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertForXStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertForXStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertFunction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFunction")().asInstanceOf[Unit]
inline def assertFunction(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFunction")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertFunction(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFunction(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFunction(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertFunctionDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionDeclaration")().asInstanceOf[Unit]
inline def assertFunctionDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertFunctionDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFunctionDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFunctionDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertFunctionExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionExpression")().asInstanceOf[Unit]
inline def assertFunctionExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertFunctionExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFunctionExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFunctionExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertFunctionParent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionParent")().asInstanceOf[Unit]
inline def assertFunctionParent(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionParent")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertFunctionParent(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionParent")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFunctionParent(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionParent")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFunctionParent(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionParent")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertFunctionTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionTypeAnnotation")().asInstanceOf[Unit]
inline def assertFunctionTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertFunctionTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFunctionTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFunctionTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertFunctionTypeParam(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionTypeParam")().asInstanceOf[Unit]
inline def assertFunctionTypeParam(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionTypeParam")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertFunctionTypeParam(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionTypeParam")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFunctionTypeParam(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionTypeParam")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertFunctionTypeParam(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFunctionTypeParam")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertGenericTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertGenericTypeAnnotation")().asInstanceOf[Unit]
inline def assertGenericTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertGenericTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertGenericTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertGenericTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertGenericTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertGenericTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertGenericTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertGenericTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertIdentifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIdentifier")().asInstanceOf[Unit]
inline def assertIdentifier(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertIdentifier(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertIdentifier(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertIdentifier(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertIfStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIfStatement")().asInstanceOf[Unit]
inline def assertIfStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIfStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertIfStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertIfStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertIfStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertIfStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertIfStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertIfStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertImmutable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImmutable")().asInstanceOf[Unit]
inline def assertImmutable(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImmutable")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertImmutable(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImmutable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImmutable(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImmutable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImmutable(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImmutable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertImport(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImport")().asInstanceOf[Unit]
inline def assertImport(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImport")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertImport(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImport")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImport(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImport")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImport(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImport")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertImportAttribute(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImportAttribute")().asInstanceOf[Unit]
inline def assertImportAttribute(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImportAttribute")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertImportAttribute(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImportAttribute(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImportAttribute(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertImportDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImportDeclaration")().asInstanceOf[Unit]
inline def assertImportDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertImportDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImportDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImportDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertImportDefaultSpecifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImportDefaultSpecifier")().asInstanceOf[Unit]
inline def assertImportDefaultSpecifier(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImportDefaultSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertImportDefaultSpecifier(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportDefaultSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImportDefaultSpecifier(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportDefaultSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImportDefaultSpecifier(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportDefaultSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertImportNamespaceSpecifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImportNamespaceSpecifier")().asInstanceOf[Unit]
inline def assertImportNamespaceSpecifier(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImportNamespaceSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertImportNamespaceSpecifier(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportNamespaceSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImportNamespaceSpecifier(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportNamespaceSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImportNamespaceSpecifier(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportNamespaceSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertImportOrExportDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImportOrExportDeclaration")().asInstanceOf[Unit]
inline def assertImportOrExportDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImportOrExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertImportOrExportDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportOrExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImportOrExportDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportOrExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImportOrExportDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportOrExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertImportSpecifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImportSpecifier")().asInstanceOf[Unit]
inline def assertImportSpecifier(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertImportSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertImportSpecifier(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImportSpecifier(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertImportSpecifier(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertImportSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertIndexedAccessType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIndexedAccessType")().asInstanceOf[Unit]
inline def assertIndexedAccessType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIndexedAccessType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertIndexedAccessType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertIndexedAccessType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertIndexedAccessType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertInferredPredicate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInferredPredicate")().asInstanceOf[Unit]
inline def assertInferredPredicate(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInferredPredicate")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertInferredPredicate(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInferredPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertInferredPredicate(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInferredPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertInferredPredicate(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInferredPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertInterfaceDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceDeclaration")().asInstanceOf[Unit]
inline def assertInterfaceDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertInterfaceDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertInterfaceDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertInterfaceDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertInterfaceExtends(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceExtends")().asInstanceOf[Unit]
inline def assertInterfaceExtends(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceExtends")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertInterfaceExtends(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceExtends")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertInterfaceExtends(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceExtends")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertInterfaceExtends(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceExtends")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertInterfaceTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceTypeAnnotation")().asInstanceOf[Unit]
inline def assertInterfaceTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertInterfaceTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertInterfaceTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertInterfaceTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInterfaceTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertInterpreterDirective(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInterpreterDirective")().asInstanceOf[Unit]
inline def assertInterpreterDirective(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInterpreterDirective")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertInterpreterDirective(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInterpreterDirective")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertInterpreterDirective(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInterpreterDirective")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertInterpreterDirective(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInterpreterDirective")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertIntersectionTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIntersectionTypeAnnotation")().asInstanceOf[Unit]
inline def assertIntersectionTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIntersectionTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertIntersectionTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertIntersectionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertIntersectionTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertIntersectionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertIntersectionTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertIntersectionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSX(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSX")().asInstanceOf[Unit]
inline def assertJSX(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSX")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSX(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSX")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSX(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSX")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSX(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSX")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXAttribute(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXAttribute")().asInstanceOf[Unit]
inline def assertJSXAttribute(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXAttribute")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXAttribute(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXAttribute(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXAttribute(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXClosingElement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXClosingElement")().asInstanceOf[Unit]
inline def assertJSXClosingElement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXClosingElement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXClosingElement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXClosingElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXClosingElement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXClosingElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXClosingElement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXClosingElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXClosingFragment(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXClosingFragment")().asInstanceOf[Unit]
inline def assertJSXClosingFragment(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXClosingFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXClosingFragment(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXClosingFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXClosingFragment(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXClosingFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXClosingFragment(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXClosingFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXElement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXElement")().asInstanceOf[Unit]
inline def assertJSXElement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXElement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXElement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXElement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXElement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXEmptyExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXEmptyExpression")().asInstanceOf[Unit]
inline def assertJSXEmptyExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXEmptyExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXEmptyExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXEmptyExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXEmptyExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXEmptyExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXEmptyExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXEmptyExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXExpressionContainer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXExpressionContainer")().asInstanceOf[Unit]
inline def assertJSXExpressionContainer(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXExpressionContainer")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXExpressionContainer(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXExpressionContainer")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXExpressionContainer(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXExpressionContainer")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXExpressionContainer(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXExpressionContainer")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXFragment(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXFragment")().asInstanceOf[Unit]
inline def assertJSXFragment(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXFragment(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXFragment(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXFragment(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXIdentifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXIdentifier")().asInstanceOf[Unit]
inline def assertJSXIdentifier(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXIdentifier(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXIdentifier(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXIdentifier(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXMemberExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXMemberExpression")().asInstanceOf[Unit]
inline def assertJSXMemberExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXMemberExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXMemberExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXMemberExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXMemberExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXNamespacedName(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXNamespacedName")().asInstanceOf[Unit]
inline def assertJSXNamespacedName(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXNamespacedName")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXNamespacedName(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXNamespacedName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXNamespacedName(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXNamespacedName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXNamespacedName(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXNamespacedName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXOpeningElement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXOpeningElement")().asInstanceOf[Unit]
inline def assertJSXOpeningElement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXOpeningElement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXOpeningElement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXOpeningElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXOpeningElement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXOpeningElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXOpeningElement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXOpeningElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXOpeningFragment(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXOpeningFragment")().asInstanceOf[Unit]
inline def assertJSXOpeningFragment(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXOpeningFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXOpeningFragment(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXOpeningFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXOpeningFragment(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXOpeningFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXOpeningFragment(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXOpeningFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXSpreadAttribute(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXSpreadAttribute")().asInstanceOf[Unit]
inline def assertJSXSpreadAttribute(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXSpreadAttribute")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXSpreadAttribute(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXSpreadAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXSpreadAttribute(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXSpreadAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXSpreadAttribute(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXSpreadAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXSpreadChild(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXSpreadChild")().asInstanceOf[Unit]
inline def assertJSXSpreadChild(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXSpreadChild")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXSpreadChild(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXSpreadChild")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXSpreadChild(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXSpreadChild")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXSpreadChild(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXSpreadChild")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertJSXText(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXText")().asInstanceOf[Unit]
inline def assertJSXText(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXText")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertJSXText(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXText")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXText(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXText")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertJSXText(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertJSXText")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertLVal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertLVal")().asInstanceOf[Unit]
inline def assertLVal(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertLVal")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertLVal(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLVal")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertLVal(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLVal")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertLVal(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLVal")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertLabeledStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertLabeledStatement")().asInstanceOf[Unit]
inline def assertLabeledStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertLabeledStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertLabeledStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLabeledStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertLabeledStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLabeledStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertLabeledStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLabeledStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertLiteral(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertLiteral")().asInstanceOf[Unit]
inline def assertLiteral(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertLiteral(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertLiteral(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertLiteral(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertLogicalExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertLogicalExpression")().asInstanceOf[Unit]
inline def assertLogicalExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertLogicalExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertLogicalExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLogicalExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertLogicalExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLogicalExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertLogicalExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLogicalExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertLoop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertLoop")().asInstanceOf[Unit]
inline def assertLoop(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertLoop")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertLoop(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLoop")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertLoop(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLoop")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertLoop(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertLoop")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertMemberExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMemberExpression")().asInstanceOf[Unit]
inline def assertMemberExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMemberExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertMemberExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertMemberExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertMemberExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertMetaProperty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMetaProperty")().asInstanceOf[Unit]
inline def assertMetaProperty(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMetaProperty")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertMetaProperty(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMetaProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertMetaProperty(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMetaProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertMetaProperty(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMetaProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertMethod(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMethod")().asInstanceOf[Unit]
inline def assertMethod(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMethod")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertMethod(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertMethod(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertMethod(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertMiscellaneous(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMiscellaneous")().asInstanceOf[Unit]
inline def assertMiscellaneous(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMiscellaneous")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertMiscellaneous(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMiscellaneous")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertMiscellaneous(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMiscellaneous")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertMiscellaneous(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMiscellaneous")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertMixedTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMixedTypeAnnotation")().asInstanceOf[Unit]
inline def assertMixedTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMixedTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertMixedTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMixedTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertMixedTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMixedTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertMixedTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMixedTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertModuleDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleDeclaration")().asInstanceOf[Unit]
inline def assertModuleDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertModuleDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertModuleDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertModuleDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertModuleExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleExpression")().asInstanceOf[Unit]
inline def assertModuleExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertModuleExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertModuleExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertModuleExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertModuleSpecifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleSpecifier")().asInstanceOf[Unit]
inline def assertModuleSpecifier(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertModuleSpecifier(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertModuleSpecifier(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertModuleSpecifier(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertModuleSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertNewExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNewExpression")().asInstanceOf[Unit]
inline def assertNewExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNewExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertNewExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNewExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNewExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNewExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNewExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNewExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertNode(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNode")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def assertNoop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNoop")().asInstanceOf[Unit]
inline def assertNoop(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNoop")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertNoop(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNoop")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNoop(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNoop")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNoop(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNoop")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertNullLiteral(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNullLiteral")().asInstanceOf[Unit]
inline def assertNullLiteral(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNullLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertNullLiteral(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNullLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNullLiteral(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNullLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNullLiteral(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNullLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertNullLiteralTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNullLiteralTypeAnnotation")().asInstanceOf[Unit]
inline def assertNullLiteralTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNullLiteralTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertNullLiteralTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNullLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNullLiteralTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNullLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNullLiteralTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNullLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertNullableTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNullableTypeAnnotation")().asInstanceOf[Unit]
inline def assertNullableTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNullableTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertNullableTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNullableTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNullableTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNullableTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNullableTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNullableTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertNumberLiteral(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberLiteral")().asInstanceOf[Unit]
inline def assertNumberLiteral(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertNumberLiteral(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNumberLiteral(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNumberLiteral(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertNumberLiteralTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberLiteralTypeAnnotation")().asInstanceOf[Unit]
inline def assertNumberLiteralTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberLiteralTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertNumberLiteralTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNumberLiteralTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNumberLiteralTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertNumberTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberTypeAnnotation")().asInstanceOf[Unit]
inline def assertNumberTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertNumberTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNumberTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNumberTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNumberTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertNumericLiteral(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNumericLiteral")().asInstanceOf[Unit]
inline def assertNumericLiteral(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNumericLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertNumericLiteral(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNumericLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNumericLiteral(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNumericLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertNumericLiteral(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNumericLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertObjectExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectExpression")().asInstanceOf[Unit]
inline def assertObjectExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertObjectExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertObjectMember(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectMember")().asInstanceOf[Unit]
inline def assertObjectMember(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectMember")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertObjectMember(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectMember(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectMember(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertObjectMethod(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectMethod")().asInstanceOf[Unit]
inline def assertObjectMethod(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectMethod")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertObjectMethod(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectMethod(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectMethod(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertObjectPattern(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectPattern")().asInstanceOf[Unit]
inline def assertObjectPattern(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectPattern")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertObjectPattern(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectPattern(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectPattern(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertObjectProperty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectProperty")().asInstanceOf[Unit]
inline def assertObjectProperty(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectProperty")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertObjectProperty(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectProperty(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectProperty(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertObjectTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeAnnotation")().asInstanceOf[Unit]
inline def assertObjectTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertObjectTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertObjectTypeCallProperty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeCallProperty")().asInstanceOf[Unit]
inline def assertObjectTypeCallProperty(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeCallProperty")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertObjectTypeCallProperty(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeCallProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectTypeCallProperty(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeCallProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectTypeCallProperty(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeCallProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertObjectTypeIndexer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeIndexer")().asInstanceOf[Unit]
inline def assertObjectTypeIndexer(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeIndexer")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertObjectTypeIndexer(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeIndexer")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectTypeIndexer(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeIndexer")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectTypeIndexer(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeIndexer")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertObjectTypeInternalSlot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeInternalSlot")().asInstanceOf[Unit]
inline def assertObjectTypeInternalSlot(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeInternalSlot")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertObjectTypeInternalSlot(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeInternalSlot")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectTypeInternalSlot(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeInternalSlot")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectTypeInternalSlot(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeInternalSlot")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertObjectTypeProperty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeProperty")().asInstanceOf[Unit]
inline def assertObjectTypeProperty(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeProperty")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertObjectTypeProperty(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectTypeProperty(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectTypeProperty(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertObjectTypeSpreadProperty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeSpreadProperty")().asInstanceOf[Unit]
inline def assertObjectTypeSpreadProperty(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeSpreadProperty")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertObjectTypeSpreadProperty(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeSpreadProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectTypeSpreadProperty(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeSpreadProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertObjectTypeSpreadProperty(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertObjectTypeSpreadProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertOpaqueType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertOpaqueType")().asInstanceOf[Unit]
inline def assertOpaqueType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertOpaqueType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertOpaqueType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertOpaqueType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertOpaqueType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertOpaqueType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertOpaqueType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertOpaqueType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertOptionalCallExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalCallExpression")().asInstanceOf[Unit]
inline def assertOptionalCallExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalCallExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertOptionalCallExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalCallExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertOptionalCallExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalCallExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertOptionalCallExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalCallExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertOptionalIndexedAccessType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalIndexedAccessType")().asInstanceOf[Unit]
inline def assertOptionalIndexedAccessType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalIndexedAccessType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertOptionalIndexedAccessType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertOptionalIndexedAccessType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertOptionalIndexedAccessType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertOptionalMemberExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalMemberExpression")().asInstanceOf[Unit]
inline def assertOptionalMemberExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalMemberExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertOptionalMemberExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertOptionalMemberExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertOptionalMemberExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertOptionalMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertParenthesizedExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertParenthesizedExpression")().asInstanceOf[Unit]
inline def assertParenthesizedExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertParenthesizedExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertParenthesizedExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertParenthesizedExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertParenthesizedExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertParenthesizedExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertParenthesizedExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertParenthesizedExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertPattern(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPattern")().asInstanceOf[Unit]
inline def assertPattern(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPattern")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertPattern(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPattern(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPattern(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertPatternLike(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPatternLike")().asInstanceOf[Unit]
inline def assertPatternLike(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPatternLike")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertPatternLike(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPatternLike")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPatternLike(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPatternLike")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPatternLike(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPatternLike")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertPipelineBareFunction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelineBareFunction")().asInstanceOf[Unit]
inline def assertPipelineBareFunction(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelineBareFunction")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertPipelineBareFunction(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelineBareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPipelineBareFunction(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelineBareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPipelineBareFunction(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelineBareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertPipelinePrimaryTopicReference(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelinePrimaryTopicReference")().asInstanceOf[Unit]
inline def assertPipelinePrimaryTopicReference(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelinePrimaryTopicReference")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertPipelinePrimaryTopicReference(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelinePrimaryTopicReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPipelinePrimaryTopicReference(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelinePrimaryTopicReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPipelinePrimaryTopicReference(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelinePrimaryTopicReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertPipelineTopicExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelineTopicExpression")().asInstanceOf[Unit]
inline def assertPipelineTopicExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelineTopicExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertPipelineTopicExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelineTopicExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPipelineTopicExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelineTopicExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPipelineTopicExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPipelineTopicExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertPlaceholder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPlaceholder")().asInstanceOf[Unit]
inline def assertPlaceholder(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPlaceholder")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertPlaceholder(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPlaceholder")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPlaceholder(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPlaceholder")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPlaceholder(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPlaceholder")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertPrivate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivate")().asInstanceOf[Unit]
inline def assertPrivate(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivate")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertPrivate(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPrivate(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPrivate(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertPrivateName(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivateName")().asInstanceOf[Unit]
inline def assertPrivateName(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivateName")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertPrivateName(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivateName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPrivateName(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivateName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPrivateName(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivateName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertProgram(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertProgram")().asInstanceOf[Unit]
inline def assertProgram(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertProgram")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertProgram(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertProgram")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertProgram(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertProgram")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertProgram(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertProgram")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertProperty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertProperty")().asInstanceOf[Unit]
inline def assertProperty(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertProperty")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertProperty(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertProperty(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertProperty(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertPureish(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPureish")().asInstanceOf[Unit]
inline def assertPureish(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPureish")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertPureish(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPureish")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPureish(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPureish")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPureish(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPureish")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertQualifiedTypeIdentifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertQualifiedTypeIdentifier")().asInstanceOf[Unit]
inline def assertQualifiedTypeIdentifier(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertQualifiedTypeIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertQualifiedTypeIdentifier(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertQualifiedTypeIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertQualifiedTypeIdentifier(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertQualifiedTypeIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertQualifiedTypeIdentifier(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertQualifiedTypeIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertRecordExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertRecordExpression")().asInstanceOf[Unit]
inline def assertRecordExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertRecordExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertRecordExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRecordExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertRecordExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRecordExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertRecordExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRecordExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertRegExpLiteral(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertRegExpLiteral")().asInstanceOf[Unit]
inline def assertRegExpLiteral(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertRegExpLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertRegExpLiteral(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRegExpLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertRegExpLiteral(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRegExpLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertRegExpLiteral(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRegExpLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertRegexLiteral(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertRegexLiteral")().asInstanceOf[Unit]
inline def assertRegexLiteral(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertRegexLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertRegexLiteral(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRegexLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertRegexLiteral(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRegexLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertRegexLiteral(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRegexLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertRestElement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertRestElement")().asInstanceOf[Unit]
inline def assertRestElement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertRestElement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertRestElement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRestElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertRestElement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRestElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertRestElement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRestElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertRestProperty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertRestProperty")().asInstanceOf[Unit]
inline def assertRestProperty(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertRestProperty")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertRestProperty(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRestProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertRestProperty(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRestProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertRestProperty(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRestProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertReturnStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertReturnStatement")().asInstanceOf[Unit]
inline def assertReturnStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertReturnStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertReturnStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertReturnStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertReturnStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertReturnStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertReturnStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertReturnStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertScopable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertScopable")().asInstanceOf[Unit]
inline def assertScopable(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertScopable")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertScopable(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertScopable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertScopable(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertScopable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertScopable(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertScopable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertSequenceExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSequenceExpression")().asInstanceOf[Unit]
inline def assertSequenceExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSequenceExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertSequenceExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSequenceExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertSequenceExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSequenceExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertSequenceExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSequenceExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertSpreadElement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSpreadElement")().asInstanceOf[Unit]
inline def assertSpreadElement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSpreadElement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertSpreadElement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSpreadElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertSpreadElement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSpreadElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertSpreadElement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSpreadElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertSpreadProperty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSpreadProperty")().asInstanceOf[Unit]
inline def assertSpreadProperty(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSpreadProperty")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertSpreadProperty(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSpreadProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertSpreadProperty(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSpreadProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertSpreadProperty(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSpreadProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertStandardized(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertStandardized")().asInstanceOf[Unit]
inline def assertStandardized(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertStandardized")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertStandardized(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStandardized")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertStandardized(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStandardized")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertStandardized(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStandardized")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertStatement")().asInstanceOf[Unit]
inline def assertStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertStaticBlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertStaticBlock")().asInstanceOf[Unit]
inline def assertStaticBlock(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertStaticBlock")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertStaticBlock(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStaticBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertStaticBlock(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStaticBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertStaticBlock(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStaticBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertStringLiteral(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertStringLiteral")().asInstanceOf[Unit]
inline def assertStringLiteral(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertStringLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertStringLiteral(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStringLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertStringLiteral(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStringLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertStringLiteral(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStringLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertStringLiteralTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertStringLiteralTypeAnnotation")().asInstanceOf[Unit]
inline def assertStringLiteralTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertStringLiteralTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertStringLiteralTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStringLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertStringLiteralTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStringLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertStringLiteralTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStringLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertStringTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertStringTypeAnnotation")().asInstanceOf[Unit]
inline def assertStringTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertStringTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertStringTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStringTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertStringTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStringTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertStringTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertStringTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertSuper(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSuper")().asInstanceOf[Unit]
inline def assertSuper(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSuper")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertSuper(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSuper")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertSuper(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSuper")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertSuper(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSuper")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertSwitchCase(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSwitchCase")().asInstanceOf[Unit]
inline def assertSwitchCase(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSwitchCase")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertSwitchCase(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSwitchCase")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertSwitchCase(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSwitchCase")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertSwitchCase(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSwitchCase")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertSwitchStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSwitchStatement")().asInstanceOf[Unit]
inline def assertSwitchStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSwitchStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertSwitchStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSwitchStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertSwitchStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSwitchStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertSwitchStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSwitchStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertSymbolTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSymbolTypeAnnotation")().asInstanceOf[Unit]
inline def assertSymbolTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSymbolTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertSymbolTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSymbolTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertSymbolTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSymbolTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertSymbolTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSymbolTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSAnyKeyword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSAnyKeyword")().asInstanceOf[Unit]
inline def assertTSAnyKeyword(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSAnyKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSAnyKeyword(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSAnyKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSAnyKeyword(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSAnyKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSAnyKeyword(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSAnyKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSArrayType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSArrayType")().asInstanceOf[Unit]
inline def assertTSArrayType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSArrayType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSArrayType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSArrayType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSArrayType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSArrayType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSArrayType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSArrayType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSAsExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSAsExpression")().asInstanceOf[Unit]
inline def assertTSAsExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSAsExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSAsExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSAsExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSAsExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSAsExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSAsExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSAsExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSBaseType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBaseType")().asInstanceOf[Unit]
inline def assertTSBaseType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBaseType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSBaseType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBaseType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSBaseType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBaseType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSBaseType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBaseType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSBigIntKeyword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBigIntKeyword")().asInstanceOf[Unit]
inline def assertTSBigIntKeyword(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBigIntKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSBigIntKeyword(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBigIntKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSBigIntKeyword(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBigIntKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSBigIntKeyword(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBigIntKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSBooleanKeyword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBooleanKeyword")().asInstanceOf[Unit]
inline def assertTSBooleanKeyword(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBooleanKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSBooleanKeyword(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBooleanKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSBooleanKeyword(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBooleanKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSBooleanKeyword(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSBooleanKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSCallSignatureDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSCallSignatureDeclaration")().asInstanceOf[Unit]
inline def assertTSCallSignatureDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSCallSignatureDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSCallSignatureDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSCallSignatureDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSCallSignatureDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSCallSignatureDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSCallSignatureDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSCallSignatureDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSConditionalType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConditionalType")().asInstanceOf[Unit]
inline def assertTSConditionalType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConditionalType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSConditionalType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConditionalType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSConditionalType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConditionalType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSConditionalType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConditionalType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSConstructSignatureDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConstructSignatureDeclaration")().asInstanceOf[Unit]
inline def assertTSConstructSignatureDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConstructSignatureDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSConstructSignatureDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConstructSignatureDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSConstructSignatureDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConstructSignatureDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSConstructSignatureDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConstructSignatureDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSConstructorType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConstructorType")().asInstanceOf[Unit]
inline def assertTSConstructorType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConstructorType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSConstructorType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConstructorType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSConstructorType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConstructorType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSConstructorType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSConstructorType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSDeclareFunction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSDeclareFunction")().asInstanceOf[Unit]
inline def assertTSDeclareFunction(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSDeclareFunction")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSDeclareFunction(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSDeclareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSDeclareFunction(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSDeclareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSDeclareFunction(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSDeclareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSDeclareMethod(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSDeclareMethod")().asInstanceOf[Unit]
inline def assertTSDeclareMethod(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSDeclareMethod")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSDeclareMethod(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSDeclareMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSDeclareMethod(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSDeclareMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSDeclareMethod(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSDeclareMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSEntityName(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEntityName")().asInstanceOf[Unit]
inline def assertTSEntityName(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEntityName")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSEntityName(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEntityName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSEntityName(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEntityName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSEntityName(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEntityName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSEnumDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEnumDeclaration")().asInstanceOf[Unit]
inline def assertTSEnumDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEnumDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSEnumDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEnumDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSEnumDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEnumDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSEnumDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEnumDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSEnumMember(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEnumMember")().asInstanceOf[Unit]
inline def assertTSEnumMember(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEnumMember")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSEnumMember(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEnumMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSEnumMember(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEnumMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSEnumMember(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSEnumMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSExportAssignment(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExportAssignment")().asInstanceOf[Unit]
inline def assertTSExportAssignment(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExportAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSExportAssignment(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExportAssignment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSExportAssignment(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExportAssignment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSExportAssignment(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExportAssignment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSExpressionWithTypeArguments(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExpressionWithTypeArguments")().asInstanceOf[Unit]
inline def assertTSExpressionWithTypeArguments(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExpressionWithTypeArguments")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSExpressionWithTypeArguments(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExpressionWithTypeArguments")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSExpressionWithTypeArguments(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExpressionWithTypeArguments")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSExpressionWithTypeArguments(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExpressionWithTypeArguments")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSExternalModuleReference(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExternalModuleReference")().asInstanceOf[Unit]
inline def assertTSExternalModuleReference(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExternalModuleReference")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSExternalModuleReference(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExternalModuleReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSExternalModuleReference(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExternalModuleReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSExternalModuleReference(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSExternalModuleReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSFunctionType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSFunctionType")().asInstanceOf[Unit]
inline def assertTSFunctionType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSFunctionType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSFunctionType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSFunctionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSFunctionType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSFunctionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSFunctionType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSFunctionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSImportEqualsDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSImportEqualsDeclaration")().asInstanceOf[Unit]
inline def assertTSImportEqualsDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSImportEqualsDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSImportEqualsDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSImportEqualsDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSImportEqualsDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSImportEqualsDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSImportEqualsDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSImportEqualsDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSImportType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSImportType")().asInstanceOf[Unit]
inline def assertTSImportType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSImportType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSImportType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSImportType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSImportType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSImportType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSImportType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSImportType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSIndexSignature(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIndexSignature")().asInstanceOf[Unit]
inline def assertTSIndexSignature(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIndexSignature")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSIndexSignature(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIndexSignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSIndexSignature(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIndexSignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSIndexSignature(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIndexSignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSIndexedAccessType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIndexedAccessType")().asInstanceOf[Unit]
inline def assertTSIndexedAccessType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIndexedAccessType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSIndexedAccessType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSIndexedAccessType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSIndexedAccessType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSInferType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInferType")().asInstanceOf[Unit]
inline def assertTSInferType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInferType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSInferType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInferType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSInferType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInferType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSInferType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInferType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSInstantiationExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInstantiationExpression")().asInstanceOf[Unit]
inline def assertTSInstantiationExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInstantiationExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSInstantiationExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInstantiationExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSInstantiationExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInstantiationExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSInstantiationExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInstantiationExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSInterfaceBody(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInterfaceBody")().asInstanceOf[Unit]
inline def assertTSInterfaceBody(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInterfaceBody")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSInterfaceBody(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInterfaceBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSInterfaceBody(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInterfaceBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSInterfaceBody(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInterfaceBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSInterfaceDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInterfaceDeclaration")().asInstanceOf[Unit]
inline def assertTSInterfaceDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInterfaceDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSInterfaceDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInterfaceDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSInterfaceDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInterfaceDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSInterfaceDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSInterfaceDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSIntersectionType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIntersectionType")().asInstanceOf[Unit]
inline def assertTSIntersectionType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIntersectionType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSIntersectionType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIntersectionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSIntersectionType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIntersectionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSIntersectionType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIntersectionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSIntrinsicKeyword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIntrinsicKeyword")().asInstanceOf[Unit]
inline def assertTSIntrinsicKeyword(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIntrinsicKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSIntrinsicKeyword(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIntrinsicKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSIntrinsicKeyword(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIntrinsicKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSIntrinsicKeyword(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSIntrinsicKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSLiteralType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSLiteralType")().asInstanceOf[Unit]
inline def assertTSLiteralType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSLiteralType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSLiteralType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSLiteralType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSLiteralType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSLiteralType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSLiteralType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSLiteralType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSMappedType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSMappedType")().asInstanceOf[Unit]
inline def assertTSMappedType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSMappedType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSMappedType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSMappedType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSMappedType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSMappedType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSMappedType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSMappedType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSMethodSignature(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSMethodSignature")().asInstanceOf[Unit]
inline def assertTSMethodSignature(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSMethodSignature")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSMethodSignature(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSMethodSignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSMethodSignature(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSMethodSignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSMethodSignature(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSMethodSignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSModuleBlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSModuleBlock")().asInstanceOf[Unit]
inline def assertTSModuleBlock(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSModuleBlock")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSModuleBlock(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSModuleBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSModuleBlock(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSModuleBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSModuleBlock(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSModuleBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSModuleDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSModuleDeclaration")().asInstanceOf[Unit]
inline def assertTSModuleDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSModuleDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSModuleDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSModuleDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSModuleDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSModuleDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSModuleDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSModuleDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSNamedTupleMember(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNamedTupleMember")().asInstanceOf[Unit]
inline def assertTSNamedTupleMember(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNamedTupleMember")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSNamedTupleMember(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNamedTupleMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSNamedTupleMember(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNamedTupleMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSNamedTupleMember(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNamedTupleMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSNamespaceExportDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNamespaceExportDeclaration")().asInstanceOf[Unit]
inline def assertTSNamespaceExportDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNamespaceExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSNamespaceExportDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNamespaceExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSNamespaceExportDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNamespaceExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSNamespaceExportDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNamespaceExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSNeverKeyword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNeverKeyword")().asInstanceOf[Unit]
inline def assertTSNeverKeyword(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNeverKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSNeverKeyword(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNeverKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSNeverKeyword(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNeverKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSNeverKeyword(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNeverKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSNonNullExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNonNullExpression")().asInstanceOf[Unit]
inline def assertTSNonNullExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNonNullExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSNonNullExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNonNullExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSNonNullExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNonNullExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSNonNullExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNonNullExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSNullKeyword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNullKeyword")().asInstanceOf[Unit]
inline def assertTSNullKeyword(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNullKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSNullKeyword(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNullKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSNullKeyword(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNullKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSNullKeyword(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNullKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSNumberKeyword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNumberKeyword")().asInstanceOf[Unit]
inline def assertTSNumberKeyword(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNumberKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSNumberKeyword(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNumberKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSNumberKeyword(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNumberKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSNumberKeyword(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSNumberKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSObjectKeyword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSObjectKeyword")().asInstanceOf[Unit]
inline def assertTSObjectKeyword(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSObjectKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSObjectKeyword(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSObjectKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSObjectKeyword(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSObjectKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSObjectKeyword(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSObjectKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSOptionalType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSOptionalType")().asInstanceOf[Unit]
inline def assertTSOptionalType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSOptionalType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSOptionalType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSOptionalType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSOptionalType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSOptionalType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSOptionalType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSOptionalType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSParameterProperty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSParameterProperty")().asInstanceOf[Unit]
inline def assertTSParameterProperty(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSParameterProperty")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSParameterProperty(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSParameterProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSParameterProperty(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSParameterProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSParameterProperty(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSParameterProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSParenthesizedType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSParenthesizedType")().asInstanceOf[Unit]
inline def assertTSParenthesizedType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSParenthesizedType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSParenthesizedType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSParenthesizedType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSParenthesizedType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSParenthesizedType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSParenthesizedType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSParenthesizedType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSPropertySignature(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSPropertySignature")().asInstanceOf[Unit]
inline def assertTSPropertySignature(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSPropertySignature")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSPropertySignature(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSPropertySignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSPropertySignature(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSPropertySignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSPropertySignature(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSPropertySignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSQualifiedName(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSQualifiedName")().asInstanceOf[Unit]
inline def assertTSQualifiedName(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSQualifiedName")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSQualifiedName(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSQualifiedName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSQualifiedName(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSQualifiedName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSQualifiedName(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSQualifiedName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSRestType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSRestType")().asInstanceOf[Unit]
inline def assertTSRestType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSRestType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSRestType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSRestType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSRestType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSRestType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSRestType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSRestType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSSatisfiesExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSSatisfiesExpression")().asInstanceOf[Unit]
inline def assertTSSatisfiesExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSSatisfiesExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSSatisfiesExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSSatisfiesExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSSatisfiesExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSSatisfiesExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSSatisfiesExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSSatisfiesExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSStringKeyword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSStringKeyword")().asInstanceOf[Unit]
inline def assertTSStringKeyword(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSStringKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSStringKeyword(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSStringKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSStringKeyword(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSStringKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSStringKeyword(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSStringKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSSymbolKeyword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSSymbolKeyword")().asInstanceOf[Unit]
inline def assertTSSymbolKeyword(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSSymbolKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSSymbolKeyword(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSSymbolKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSSymbolKeyword(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSSymbolKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSSymbolKeyword(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSSymbolKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSThisType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSThisType")().asInstanceOf[Unit]
inline def assertTSThisType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSThisType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSThisType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSThisType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSThisType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSThisType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSThisType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSThisType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSTupleType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTupleType")().asInstanceOf[Unit]
inline def assertTSTupleType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTupleType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSTupleType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTupleType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTupleType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTupleType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTupleType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTupleType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSType")().asInstanceOf[Unit]
inline def assertTSType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSTypeAliasDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAliasDeclaration")().asInstanceOf[Unit]
inline def assertTSTypeAliasDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAliasDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSTypeAliasDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAliasDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeAliasDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAliasDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeAliasDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAliasDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAnnotation")().asInstanceOf[Unit]
inline def assertTSTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSTypeAssertion(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAssertion")().asInstanceOf[Unit]
inline def assertTSTypeAssertion(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAssertion")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSTypeAssertion(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAssertion")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeAssertion(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAssertion")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeAssertion(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeAssertion")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSTypeElement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeElement")().asInstanceOf[Unit]
inline def assertTSTypeElement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeElement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSTypeElement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeElement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeElement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSTypeLiteral(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeLiteral")().asInstanceOf[Unit]
inline def assertTSTypeLiteral(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSTypeLiteral(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeLiteral(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeLiteral(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSTypeOperator(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeOperator")().asInstanceOf[Unit]
inline def assertTSTypeOperator(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeOperator")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSTypeOperator(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeOperator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeOperator(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeOperator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeOperator(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeOperator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSTypeParameter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameter")().asInstanceOf[Unit]
inline def assertTSTypeParameter(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameter")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSTypeParameter(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameter")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeParameter(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameter")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeParameter(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameter")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSTypeParameterDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameterDeclaration")().asInstanceOf[Unit]
inline def assertTSTypeParameterDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameterDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSTypeParameterDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameterDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeParameterDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameterDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeParameterDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameterDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSTypeParameterInstantiation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameterInstantiation")().asInstanceOf[Unit]
inline def assertTSTypeParameterInstantiation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameterInstantiation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSTypeParameterInstantiation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameterInstantiation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeParameterInstantiation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameterInstantiation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeParameterInstantiation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeParameterInstantiation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSTypePredicate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypePredicate")().asInstanceOf[Unit]
inline def assertTSTypePredicate(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypePredicate")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSTypePredicate(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypePredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypePredicate(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypePredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypePredicate(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypePredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSTypeQuery(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeQuery")().asInstanceOf[Unit]
inline def assertTSTypeQuery(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeQuery")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSTypeQuery(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeQuery")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeQuery(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeQuery")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeQuery(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeQuery")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSTypeReference(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeReference")().asInstanceOf[Unit]
inline def assertTSTypeReference(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeReference")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSTypeReference(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeReference(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSTypeReference(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSTypeReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSUndefinedKeyword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUndefinedKeyword")().asInstanceOf[Unit]
inline def assertTSUndefinedKeyword(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUndefinedKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSUndefinedKeyword(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUndefinedKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSUndefinedKeyword(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUndefinedKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSUndefinedKeyword(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUndefinedKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSUnionType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUnionType")().asInstanceOf[Unit]
inline def assertTSUnionType(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUnionType")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSUnionType(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUnionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSUnionType(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUnionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSUnionType(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUnionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSUnknownKeyword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUnknownKeyword")().asInstanceOf[Unit]
inline def assertTSUnknownKeyword(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUnknownKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSUnknownKeyword(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUnknownKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSUnknownKeyword(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUnknownKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSUnknownKeyword(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSUnknownKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTSVoidKeyword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSVoidKeyword")().asInstanceOf[Unit]
inline def assertTSVoidKeyword(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTSVoidKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTSVoidKeyword(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSVoidKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSVoidKeyword(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSVoidKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTSVoidKeyword(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTSVoidKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTaggedTemplateExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTaggedTemplateExpression")().asInstanceOf[Unit]
inline def assertTaggedTemplateExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTaggedTemplateExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTaggedTemplateExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTaggedTemplateExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTaggedTemplateExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTaggedTemplateExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTaggedTemplateExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTaggedTemplateExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTemplateElement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTemplateElement")().asInstanceOf[Unit]
inline def assertTemplateElement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTemplateElement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTemplateElement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTemplateElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTemplateElement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTemplateElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTemplateElement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTemplateElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTemplateLiteral(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTemplateLiteral")().asInstanceOf[Unit]
inline def assertTemplateLiteral(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTemplateLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTemplateLiteral(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTemplateLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTemplateLiteral(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTemplateLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTemplateLiteral(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTemplateLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTerminatorless(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTerminatorless")().asInstanceOf[Unit]
inline def assertTerminatorless(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTerminatorless")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTerminatorless(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTerminatorless")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTerminatorless(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTerminatorless")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTerminatorless(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTerminatorless")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertThisExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertThisExpression")().asInstanceOf[Unit]
inline def assertThisExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertThisExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertThisExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertThisExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertThisExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertThisExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertThisExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertThisExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertThisTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertThisTypeAnnotation")().asInstanceOf[Unit]
inline def assertThisTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertThisTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertThisTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertThisTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertThisTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertThisTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertThisTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertThisTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertThrowStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertThrowStatement")().asInstanceOf[Unit]
inline def assertThrowStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertThrowStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertThrowStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertThrowStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertThrowStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertThrowStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertThrowStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertThrowStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTopicReference(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTopicReference")().asInstanceOf[Unit]
inline def assertTopicReference(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTopicReference")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTopicReference(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTopicReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTopicReference(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTopicReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTopicReference(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTopicReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTryStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTryStatement")().asInstanceOf[Unit]
inline def assertTryStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTryStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTryStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTryStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTryStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTryStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTryStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTryStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTupleExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTupleExpression")().asInstanceOf[Unit]
inline def assertTupleExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTupleExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTupleExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTupleExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTupleExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTupleExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTupleExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTupleExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTupleTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTupleTypeAnnotation")().asInstanceOf[Unit]
inline def assertTupleTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTupleTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTupleTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTupleTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTupleTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTupleTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTupleTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTupleTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTypeAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeAlias")().asInstanceOf[Unit]
inline def assertTypeAlias(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeAlias")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTypeAlias(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeAlias")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeAlias(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeAlias")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeAlias(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeAlias")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeAnnotation")().asInstanceOf[Unit]
inline def assertTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTypeCastExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeCastExpression")().asInstanceOf[Unit]
inline def assertTypeCastExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeCastExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTypeCastExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeCastExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeCastExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeCastExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeCastExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeCastExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTypeParameter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameter")().asInstanceOf[Unit]
inline def assertTypeParameter(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameter")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTypeParameter(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameter")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeParameter(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameter")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeParameter(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameter")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTypeParameterDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameterDeclaration")().asInstanceOf[Unit]
inline def assertTypeParameterDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameterDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTypeParameterDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameterDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeParameterDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameterDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeParameterDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameterDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTypeParameterInstantiation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameterInstantiation")().asInstanceOf[Unit]
inline def assertTypeParameterInstantiation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameterInstantiation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTypeParameterInstantiation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameterInstantiation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeParameterInstantiation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameterInstantiation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeParameterInstantiation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeParameterInstantiation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTypeScript(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeScript")().asInstanceOf[Unit]
inline def assertTypeScript(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeScript")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTypeScript(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeScript")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeScript(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeScript")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeScript(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeScript")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertTypeofTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeofTypeAnnotation")().asInstanceOf[Unit]
inline def assertTypeofTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeofTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertTypeofTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeofTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeofTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeofTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertTypeofTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeofTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertUnaryExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertUnaryExpression")().asInstanceOf[Unit]
inline def assertUnaryExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertUnaryExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertUnaryExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUnaryExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertUnaryExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUnaryExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertUnaryExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUnaryExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertUnaryLike(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertUnaryLike")().asInstanceOf[Unit]
inline def assertUnaryLike(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertUnaryLike")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertUnaryLike(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUnaryLike")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertUnaryLike(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUnaryLike")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertUnaryLike(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUnaryLike")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertUnionTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertUnionTypeAnnotation")().asInstanceOf[Unit]
inline def assertUnionTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertUnionTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertUnionTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUnionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertUnionTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUnionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertUnionTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUnionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertUpdateExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertUpdateExpression")().asInstanceOf[Unit]
inline def assertUpdateExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertUpdateExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertUpdateExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUpdateExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertUpdateExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUpdateExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertUpdateExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUpdateExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertUserWhitespacable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertUserWhitespacable")().asInstanceOf[Unit]
inline def assertUserWhitespacable(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertUserWhitespacable")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertUserWhitespacable(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUserWhitespacable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertUserWhitespacable(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUserWhitespacable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertUserWhitespacable(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUserWhitespacable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertV8IntrinsicIdentifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertV8IntrinsicIdentifier")().asInstanceOf[Unit]
inline def assertV8IntrinsicIdentifier(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertV8IntrinsicIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertV8IntrinsicIdentifier(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertV8IntrinsicIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertV8IntrinsicIdentifier(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertV8IntrinsicIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertV8IntrinsicIdentifier(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertV8IntrinsicIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertVariableDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertVariableDeclaration")().asInstanceOf[Unit]
inline def assertVariableDeclaration(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertVariableDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertVariableDeclaration(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertVariableDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertVariableDeclaration(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertVariableDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertVariableDeclaration(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertVariableDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertVariableDeclarator(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertVariableDeclarator")().asInstanceOf[Unit]
inline def assertVariableDeclarator(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertVariableDeclarator")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertVariableDeclarator(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertVariableDeclarator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertVariableDeclarator(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertVariableDeclarator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertVariableDeclarator(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertVariableDeclarator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertVariance(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertVariance")().asInstanceOf[Unit]
inline def assertVariance(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertVariance")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertVariance(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertVariance")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertVariance(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertVariance")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertVariance(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertVariance")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertVoidTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertVoidTypeAnnotation")().asInstanceOf[Unit]
inline def assertVoidTypeAnnotation(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertVoidTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertVoidTypeAnnotation(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertVoidTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertVoidTypeAnnotation(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertVoidTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertVoidTypeAnnotation(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertVoidTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertWhile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertWhile")().asInstanceOf[Unit]
inline def assertWhile(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertWhile")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertWhile(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertWhile")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertWhile(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertWhile")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertWhile(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertWhile")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertWhileStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertWhileStatement")().asInstanceOf[Unit]
inline def assertWhileStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertWhileStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertWhileStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertWhileStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertWhileStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertWhileStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertWhileStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertWhileStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertWithStatement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertWithStatement")().asInstanceOf[Unit]
inline def assertWithStatement(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertWithStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertWithStatement(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertWithStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertWithStatement(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertWithStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertWithStatement(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertWithStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertYieldExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertYieldExpression")().asInstanceOf[Unit]
inline def assertYieldExpression(node: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertYieldExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assertYieldExpression(node: js.Object, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertYieldExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertYieldExpression(node: Null, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertYieldExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertYieldExpression(node: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertYieldExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assignmentExpression(operator: String, left: LVal, right: Expression): AssignmentExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("assignmentExpression")(operator.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[AssignmentExpression_]

inline def assignmentPattern(left: ArrayPattern_, right: Expression): AssignmentPattern_ = (^.asInstanceOf[js.Dynamic].applyDynamic("assignmentPattern")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[AssignmentPattern_]
inline def assignmentPattern(left: Identifier_, right: Expression): AssignmentPattern_ = (^.asInstanceOf[js.Dynamic].applyDynamic("assignmentPattern")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[AssignmentPattern_]
inline def assignmentPattern(left: MemberExpression_, right: Expression): AssignmentPattern_ = (^.asInstanceOf[js.Dynamic].applyDynamic("assignmentPattern")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[AssignmentPattern_]
inline def assignmentPattern(left: ObjectPattern_, right: Expression): AssignmentPattern_ = (^.asInstanceOf[js.Dynamic].applyDynamic("assignmentPattern")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[AssignmentPattern_]
inline def assignmentPattern(left: TSAsExpression_, right: Expression): AssignmentPattern_ = (^.asInstanceOf[js.Dynamic].applyDynamic("assignmentPattern")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[AssignmentPattern_]
inline def assignmentPattern(left: TSNonNullExpression_, right: Expression): AssignmentPattern_ = (^.asInstanceOf[js.Dynamic].applyDynamic("assignmentPattern")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[AssignmentPattern_]
inline def assignmentPattern(left: TSSatisfiesExpression_, right: Expression): AssignmentPattern_ = (^.asInstanceOf[js.Dynamic].applyDynamic("assignmentPattern")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[AssignmentPattern_]
inline def assignmentPattern(left: TSTypeAssertion_, right: Expression): AssignmentPattern_ = (^.asInstanceOf[js.Dynamic].applyDynamic("assignmentPattern")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[AssignmentPattern_]

inline def awaitExpression(argument: Expression): AwaitExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("awaitExpression")(argument.asInstanceOf[js.Any]).asInstanceOf[AwaitExpression_]

inline def bigIntLiteral(value: String): BigIntLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bigIntLiteral")(value.asInstanceOf[js.Any]).asInstanceOf[BigIntLiteral_]

inline def binaryExpression(
  operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | typings.babelTypes.babelTypesStrings.^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign | VerticallineGreaterthansign,
  left: Expression,
  right: Expression
): BinaryExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryExpression")(operator.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BinaryExpression_]
inline def binaryExpression(
  operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | typings.babelTypes.babelTypesStrings.^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign | VerticallineGreaterthansign,
  left: PrivateName_,
  right: Expression
): BinaryExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryExpression")(operator.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BinaryExpression_]

inline def bindExpression(`object`: Expression, callee: Expression): BindExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("bindExpression")(`object`.asInstanceOf[js.Any], callee.asInstanceOf[js.Any])).asInstanceOf[BindExpression_]

inline def blockStatement(body: js.Array[Statement]): BlockStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("blockStatement")(body.asInstanceOf[js.Any]).asInstanceOf[BlockStatement_]
inline def blockStatement(body: js.Array[Statement], directives: js.Array[Directive_]): BlockStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("blockStatement")(body.asInstanceOf[js.Any], directives.asInstanceOf[js.Any])).asInstanceOf[BlockStatement_]

inline def booleanLiteral(value: Boolean): BooleanLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("booleanLiteral")(value.asInstanceOf[js.Any]).asInstanceOf[BooleanLiteral_]

inline def booleanLiteralTypeAnnotation(value: Boolean): BooleanLiteralTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("booleanLiteralTypeAnnotation")(value.asInstanceOf[js.Any]).asInstanceOf[BooleanLiteralTypeAnnotation_]

inline def booleanTypeAnnotation(): BooleanTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("booleanTypeAnnotation")().asInstanceOf[BooleanTypeAnnotation_]

inline def breakStatement(): BreakStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("breakStatement")().asInstanceOf[BreakStatement_]
inline def breakStatement(label: Identifier_): BreakStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("breakStatement")(label.asInstanceOf[js.Any]).asInstanceOf[BreakStatement_]

inline def buildChildren(node: Children): js.Array[
JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildChildren")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[
JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_]]

inline def buildMatchMemberExpression(`match`: String): js.Function1[
/* node */ js.UndefOr[Node | Null], 
/* is @babel/types.@babel/types.MemberExpression */ Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildMatchMemberExpression")(`match`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* node */ js.UndefOr[Node | Null], 
/* is @babel/types.@babel/types.MemberExpression */ Boolean]]
inline def buildMatchMemberExpression(`match`: String, allowPartial: Boolean): js.Function1[
/* node */ js.UndefOr[Node | Null], 
/* is @babel/types.@babel/types.MemberExpression */ Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMatchMemberExpression")(`match`.asInstanceOf[js.Any], allowPartial.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* node */ js.UndefOr[Node | Null], 
/* is @babel/types.@babel/types.MemberExpression */ Boolean]]

inline def callExpression(
  callee: Expression,
  _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
): CallExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("callExpression")(callee.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any])).asInstanceOf[CallExpression_]
inline def callExpression(
  callee: Super_,
  _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
): CallExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("callExpression")(callee.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any])).asInstanceOf[CallExpression_]
inline def callExpression(
  callee: V8IntrinsicIdentifier_,
  _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
): CallExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("callExpression")(callee.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any])).asInstanceOf[CallExpression_]

inline def catchClause(param: Null, body: BlockStatement_): CatchClause_ = (^.asInstanceOf[js.Dynamic].applyDynamic("catchClause")(param.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[CatchClause_]
inline def catchClause(param: Unit, body: BlockStatement_): CatchClause_ = (^.asInstanceOf[js.Dynamic].applyDynamic("catchClause")(param.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[CatchClause_]
inline def catchClause(param: ArrayPattern_, body: BlockStatement_): CatchClause_ = (^.asInstanceOf[js.Dynamic].applyDynamic("catchClause")(param.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[CatchClause_]
inline def catchClause(param: Identifier_, body: BlockStatement_): CatchClause_ = (^.asInstanceOf[js.Dynamic].applyDynamic("catchClause")(param.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[CatchClause_]
inline def catchClause(param: ObjectPattern_, body: BlockStatement_): CatchClause_ = (^.asInstanceOf[js.Dynamic].applyDynamic("catchClause")(param.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[CatchClause_]

inline def classAccessorProperty(
  key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression | PrivateName_,
  value: js.UndefOr[Expression | Null],
  typeAnnotation: js.UndefOr[TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null],
  decorators: js.UndefOr[js.Array[Decorator_] | Null],
  computed: js.UndefOr[Boolean],
  _static: js.UndefOr[Boolean]
): ClassAccessorProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classAccessorProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[ClassAccessorProperty_]

inline def classBody(
  body: js.Array[
  ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | ClassAccessorProperty_ | TSDeclareMethod_ | TSIndexSignature_ | StaticBlock_
]
): ClassBody_ = ^.asInstanceOf[js.Dynamic].applyDynamic("classBody")(body.asInstanceOf[js.Any]).asInstanceOf[ClassBody_]

inline def classDeclaration(id: Identifier_, superClass: Null, body: ClassBody_): ClassDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classDeclaration")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ClassDeclaration_]
inline def classDeclaration(id: Identifier_, superClass: Null, body: ClassBody_, decorators: js.Array[Decorator_]): ClassDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classDeclaration")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassDeclaration_]
inline def classDeclaration(id: Identifier_, superClass: Unit, body: ClassBody_): ClassDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classDeclaration")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ClassDeclaration_]
inline def classDeclaration(id: Identifier_, superClass: Unit, body: ClassBody_, decorators: js.Array[Decorator_]): ClassDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classDeclaration")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassDeclaration_]
inline def classDeclaration(id: Identifier_, superClass: Expression, body: ClassBody_): ClassDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classDeclaration")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ClassDeclaration_]
inline def classDeclaration(id: Identifier_, superClass: Expression, body: ClassBody_, decorators: js.Array[Decorator_]): ClassDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classDeclaration")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassDeclaration_]

inline def classExpression(id: Null, superClass: Null, body: ClassBody_): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Null, superClass: Null, body: ClassBody_, decorators: js.Array[Decorator_]): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Null, superClass: Unit, body: ClassBody_): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Null, superClass: Unit, body: ClassBody_, decorators: js.Array[Decorator_]): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Null, superClass: Expression, body: ClassBody_): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Null, superClass: Expression, body: ClassBody_, decorators: js.Array[Decorator_]): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Unit, superClass: Null, body: ClassBody_): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Unit, superClass: Null, body: ClassBody_, decorators: js.Array[Decorator_]): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Unit, superClass: Unit, body: ClassBody_): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Unit, superClass: Unit, body: ClassBody_, decorators: js.Array[Decorator_]): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Unit, superClass: Expression, body: ClassBody_): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Unit, superClass: Expression, body: ClassBody_, decorators: js.Array[Decorator_]): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Identifier_, superClass: Null, body: ClassBody_): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Identifier_, superClass: Null, body: ClassBody_, decorators: js.Array[Decorator_]): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Identifier_, superClass: Unit, body: ClassBody_): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Identifier_, superClass: Unit, body: ClassBody_, decorators: js.Array[Decorator_]): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Identifier_, superClass: Expression, body: ClassBody_): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]
inline def classExpression(id: Identifier_, superClass: Expression, body: ClassBody_, decorators: js.Array[Decorator_]): ClassExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classExpression")(id.asInstanceOf[js.Any], superClass.asInstanceOf[js.Any], body.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassExpression_]

inline def classImplements(id: Identifier_): ClassImplements_ = ^.asInstanceOf[js.Dynamic].applyDynamic("classImplements")(id.asInstanceOf[js.Any]).asInstanceOf[ClassImplements_]
inline def classImplements(id: Identifier_, typeParameters: TypeParameterInstantiation_): ClassImplements_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classImplements")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[ClassImplements_]

inline def classMethod(
  kind: js.UndefOr[get | set | method_ | constructor],
  key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
  params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
  body: BlockStatement_,
  computed: js.UndefOr[Boolean],
  _static: js.UndefOr[Boolean],
  generator: js.UndefOr[Boolean],
  async: js.UndefOr[Boolean]
): ClassMethod_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classMethod")(kind.asInstanceOf[js.Any], key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[ClassMethod_]

inline def classPrivateMethod(
  kind: get | set | method_,
  key: PrivateName_,
  params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
  body: BlockStatement_
): ClassPrivateMethod_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateMethod")(kind.asInstanceOf[js.Any], key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateMethod_]
inline def classPrivateMethod(
  kind: get | set | method_,
  key: PrivateName_,
  params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
  body: BlockStatement_,
  _static: Boolean
): ClassPrivateMethod_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateMethod")(kind.asInstanceOf[js.Any], key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateMethod_]
inline def classPrivateMethod(
  kind: Unit,
  key: PrivateName_,
  params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
  body: BlockStatement_
): ClassPrivateMethod_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateMethod")(kind.asInstanceOf[js.Any], key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateMethod_]
inline def classPrivateMethod(
  kind: Unit,
  key: PrivateName_,
  params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
  body: BlockStatement_,
  _static: Boolean
): ClassPrivateMethod_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateMethod")(kind.asInstanceOf[js.Any], key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateMethod_]

inline def classPrivateProperty(key: PrivateName_): ClassPrivateProperty_ = ^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateProperty")(key.asInstanceOf[js.Any]).asInstanceOf[ClassPrivateProperty_]
inline def classPrivateProperty(key: PrivateName_, value: Null, decorators: js.Array[Decorator_]): ClassPrivateProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateProperty_]
inline def classPrivateProperty(key: PrivateName_, value: Null, decorators: js.Array[Decorator_], _static: Boolean): ClassPrivateProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateProperty_]
inline def classPrivateProperty(key: PrivateName_, value: Null, decorators: Null, _static: Boolean): ClassPrivateProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateProperty_]
inline def classPrivateProperty(key: PrivateName_, value: Null, decorators: Unit, _static: Boolean): ClassPrivateProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateProperty_]
inline def classPrivateProperty(key: PrivateName_, value: Unit, decorators: js.Array[Decorator_]): ClassPrivateProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateProperty_]
inline def classPrivateProperty(key: PrivateName_, value: Unit, decorators: js.Array[Decorator_], _static: Boolean): ClassPrivateProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateProperty_]
inline def classPrivateProperty(key: PrivateName_, value: Unit, decorators: Null, _static: Boolean): ClassPrivateProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateProperty_]
inline def classPrivateProperty(key: PrivateName_, value: Unit, decorators: Unit, _static: Boolean): ClassPrivateProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateProperty_]
inline def classPrivateProperty(key: PrivateName_, value: Expression): ClassPrivateProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateProperty_]
inline def classPrivateProperty(key: PrivateName_, value: Expression, decorators: js.Array[Decorator_]): ClassPrivateProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateProperty_]
inline def classPrivateProperty(key: PrivateName_, value: Expression, decorators: js.Array[Decorator_], _static: Boolean): ClassPrivateProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateProperty_]
inline def classPrivateProperty(key: PrivateName_, value: Expression, decorators: Null, _static: Boolean): ClassPrivateProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateProperty_]
inline def classPrivateProperty(key: PrivateName_, value: Expression, decorators: Unit, _static: Boolean): ClassPrivateProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classPrivateProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[ClassPrivateProperty_]

inline def classProperty(
  key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
  value: js.UndefOr[Expression | Null],
  typeAnnotation: js.UndefOr[TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null],
  decorators: js.UndefOr[js.Array[Decorator_] | Null],
  computed: js.UndefOr[Boolean],
  _static: js.UndefOr[Boolean]
): ClassProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("classProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).asInstanceOf[ClassProperty_]

inline def cloneDeep[T /* <: Node */](n: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDeep")(n.asInstanceOf[js.Any]).asInstanceOf[T]

inline def cloneDeepWithoutLoc[T /* <: Node */](n: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDeepWithoutLoc")(n.asInstanceOf[js.Any]).asInstanceOf[T]

inline def cloneNode[T /* <: Node */](n: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneNode")(n.asInstanceOf[js.Any]).asInstanceOf[T]
inline def cloneNode[T /* <: Node */](n: T, deep: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneNode")(n.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[T]
inline def cloneNode[T /* <: Node */](n: T, deep: Boolean, withoutLoc: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneNode")(n.asInstanceOf[js.Any], deep.asInstanceOf[js.Any], withoutLoc.asInstanceOf[js.Any])).asInstanceOf[T]
inline def cloneNode[T /* <: Node */](n: T, deep: Unit, withoutLoc: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneNode")(n.asInstanceOf[js.Any], deep.asInstanceOf[js.Any], withoutLoc.asInstanceOf[js.Any])).asInstanceOf[T]

inline def cloneWithoutLoc[T /* <: Node */](n: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneWithoutLoc")(n.asInstanceOf[js.Any]).asInstanceOf[T]

inline def clone_[T /* <: Node */](n: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(n.asInstanceOf[js.Any]).asInstanceOf[T]

inline def conditionalExpression(test: Expression, consequent: Expression, alternate: Expression): ConditionalExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("conditionalExpression")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any])).asInstanceOf[ConditionalExpression_]

inline def continueStatement(): ContinueStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("continueStatement")().asInstanceOf[ContinueStatement_]
inline def continueStatement(label: Identifier_): ContinueStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("continueStatement")(label.asInstanceOf[js.Any]).asInstanceOf[ContinueStatement_]

inline def createFlowUnionType(types: js.Array[FlowType]): UnionTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createFlowUnionType")(types.asInstanceOf[js.Any]).asInstanceOf[UnionTypeAnnotation_]

inline def createFlowUnionType_T_T[T /* <: FlowType */](types: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createFlowUnionType")(types.asInstanceOf[js.Any]).asInstanceOf[T]

inline def createTypeAnnotationBasedOnTypeof(`type`: string | number | undefined | boolean | function_ | `object` | symbol): StringTypeAnnotation_ | VoidTypeAnnotation_ | NumberTypeAnnotation_ | BooleanTypeAnnotation_ | GenericTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeAnnotationBasedOnTypeof")(`type`.asInstanceOf[js.Any]).asInstanceOf[StringTypeAnnotation_ | VoidTypeAnnotation_ | NumberTypeAnnotation_ | BooleanTypeAnnotation_ | GenericTypeAnnotation_]

inline def createUnionTypeAnnotation(types: js.Array[FlowType]): UnionTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnionTypeAnnotation")(types.asInstanceOf[js.Any]).asInstanceOf[UnionTypeAnnotation_]

inline def createUnionTypeAnnotation_T_T[T /* <: FlowType */](types: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnionTypeAnnotation")(types.asInstanceOf[js.Any]).asInstanceOf[T]

inline def debuggerStatement(): DebuggerStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("debuggerStatement")().asInstanceOf[DebuggerStatement_]

inline def decimalLiteral(value: String): DecimalLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("decimalLiteral")(value.asInstanceOf[js.Any]).asInstanceOf[DecimalLiteral_]

inline def declareClass(
  id: Identifier_,
  typeParameters: Null,
  _extends: js.Array[InterfaceExtends_],
  body: ObjectTypeAnnotation_
): DeclareClass_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareClass")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareClass_]
inline def declareClass(id: Identifier_, typeParameters: Null, _extends: Null, body: ObjectTypeAnnotation_): DeclareClass_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareClass")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareClass_]
inline def declareClass(id: Identifier_, typeParameters: Null, _extends: Unit, body: ObjectTypeAnnotation_): DeclareClass_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareClass")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareClass_]
inline def declareClass(
  id: Identifier_,
  typeParameters: Unit,
  _extends: js.Array[InterfaceExtends_],
  body: ObjectTypeAnnotation_
): DeclareClass_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareClass")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareClass_]
inline def declareClass(id: Identifier_, typeParameters: Unit, _extends: Null, body: ObjectTypeAnnotation_): DeclareClass_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareClass")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareClass_]
inline def declareClass(id: Identifier_, typeParameters: Unit, _extends: Unit, body: ObjectTypeAnnotation_): DeclareClass_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareClass")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareClass_]
inline def declareClass(
  id: Identifier_,
  typeParameters: TypeParameterDeclaration_,
  _extends: js.Array[InterfaceExtends_],
  body: ObjectTypeAnnotation_
): DeclareClass_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareClass")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareClass_]
inline def declareClass(
  id: Identifier_,
  typeParameters: TypeParameterDeclaration_,
  _extends: Null,
  body: ObjectTypeAnnotation_
): DeclareClass_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareClass")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareClass_]
inline def declareClass(
  id: Identifier_,
  typeParameters: TypeParameterDeclaration_,
  _extends: Unit,
  body: ObjectTypeAnnotation_
): DeclareClass_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareClass")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareClass_]

inline def declareExportAllDeclaration(source: StringLiteral_): DeclareExportAllDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("declareExportAllDeclaration")(source.asInstanceOf[js.Any]).asInstanceOf[DeclareExportAllDeclaration_]

inline def declareExportDeclaration(): DeclareExportDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("declareExportDeclaration")().asInstanceOf[DeclareExportDeclaration_]
inline def declareExportDeclaration(declaration: Null, specifiers: js.Array[ExportNamespaceSpecifier_ | ExportSpecifier_]): DeclareExportDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareExportDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any])).asInstanceOf[DeclareExportDeclaration_]
inline def declareExportDeclaration(
  declaration: Null,
  specifiers: js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_],
  source: StringLiteral_
): DeclareExportDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareExportDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[DeclareExportDeclaration_]
inline def declareExportDeclaration(declaration: Null, specifiers: Null, source: StringLiteral_): DeclareExportDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareExportDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[DeclareExportDeclaration_]
inline def declareExportDeclaration(declaration: Null, specifiers: Unit, source: StringLiteral_): DeclareExportDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareExportDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[DeclareExportDeclaration_]
inline def declareExportDeclaration(declaration: Unit, specifiers: js.Array[ExportNamespaceSpecifier_ | ExportSpecifier_]): DeclareExportDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareExportDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any])).asInstanceOf[DeclareExportDeclaration_]
inline def declareExportDeclaration(
  declaration: Unit,
  specifiers: js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_],
  source: StringLiteral_
): DeclareExportDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareExportDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[DeclareExportDeclaration_]
inline def declareExportDeclaration(declaration: Unit, specifiers: Null, source: StringLiteral_): DeclareExportDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareExportDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[DeclareExportDeclaration_]
inline def declareExportDeclaration(declaration: Unit, specifiers: Unit, source: StringLiteral_): DeclareExportDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareExportDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[DeclareExportDeclaration_]
inline def declareExportDeclaration(declaration: Flow): DeclareExportDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("declareExportDeclaration")(declaration.asInstanceOf[js.Any]).asInstanceOf[DeclareExportDeclaration_]
inline def declareExportDeclaration(declaration: Flow, specifiers: js.Array[ExportNamespaceSpecifier_ | ExportSpecifier_]): DeclareExportDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareExportDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any])).asInstanceOf[DeclareExportDeclaration_]
inline def declareExportDeclaration(
  declaration: Flow,
  specifiers: js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_],
  source: StringLiteral_
): DeclareExportDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareExportDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[DeclareExportDeclaration_]
inline def declareExportDeclaration(declaration: Flow, specifiers: Null, source: StringLiteral_): DeclareExportDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareExportDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[DeclareExportDeclaration_]
inline def declareExportDeclaration(declaration: Flow, specifiers: Unit, source: StringLiteral_): DeclareExportDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareExportDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[DeclareExportDeclaration_]

inline def declareFunction(id: Identifier_): DeclareFunction_ = ^.asInstanceOf[js.Dynamic].applyDynamic("declareFunction")(id.asInstanceOf[js.Any]).asInstanceOf[DeclareFunction_]

inline def declareInterface(
  id: Identifier_,
  typeParameters: Null,
  _extends: js.Array[InterfaceExtends_],
  body: ObjectTypeAnnotation_
): DeclareInterface_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareInterface")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareInterface_]
inline def declareInterface(id: Identifier_, typeParameters: Null, _extends: Null, body: ObjectTypeAnnotation_): DeclareInterface_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareInterface")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareInterface_]
inline def declareInterface(id: Identifier_, typeParameters: Null, _extends: Unit, body: ObjectTypeAnnotation_): DeclareInterface_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareInterface")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareInterface_]
inline def declareInterface(
  id: Identifier_,
  typeParameters: Unit,
  _extends: js.Array[InterfaceExtends_],
  body: ObjectTypeAnnotation_
): DeclareInterface_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareInterface")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareInterface_]
inline def declareInterface(id: Identifier_, typeParameters: Unit, _extends: Null, body: ObjectTypeAnnotation_): DeclareInterface_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareInterface")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareInterface_]
inline def declareInterface(id: Identifier_, typeParameters: Unit, _extends: Unit, body: ObjectTypeAnnotation_): DeclareInterface_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareInterface")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareInterface_]
inline def declareInterface(
  id: Identifier_,
  typeParameters: TypeParameterDeclaration_,
  _extends: js.Array[InterfaceExtends_],
  body: ObjectTypeAnnotation_
): DeclareInterface_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareInterface")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareInterface_]
inline def declareInterface(
  id: Identifier_,
  typeParameters: TypeParameterDeclaration_,
  _extends: Null,
  body: ObjectTypeAnnotation_
): DeclareInterface_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareInterface")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareInterface_]
inline def declareInterface(
  id: Identifier_,
  typeParameters: TypeParameterDeclaration_,
  _extends: Unit,
  body: ObjectTypeAnnotation_
): DeclareInterface_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareInterface")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareInterface_]

inline def declareModule(id: Identifier_, body: BlockStatement_): DeclareModule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareModule")(id.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareModule_]
inline def declareModule(id: Identifier_, body: BlockStatement_, kind: CommonJS | ES): DeclareModule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareModule")(id.asInstanceOf[js.Any], body.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[DeclareModule_]
inline def declareModule(id: StringLiteral_, body: BlockStatement_): DeclareModule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareModule")(id.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DeclareModule_]
inline def declareModule(id: StringLiteral_, body: BlockStatement_, kind: CommonJS | ES): DeclareModule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareModule")(id.asInstanceOf[js.Any], body.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[DeclareModule_]

inline def declareModuleExports(typeAnnotation: TypeAnnotation_): DeclareModuleExports_ = ^.asInstanceOf[js.Dynamic].applyDynamic("declareModuleExports")(typeAnnotation.asInstanceOf[js.Any]).asInstanceOf[DeclareModuleExports_]

inline def declareOpaqueType(id: Identifier_): DeclareOpaqueType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("declareOpaqueType")(id.asInstanceOf[js.Any]).asInstanceOf[DeclareOpaqueType_]
inline def declareOpaqueType(id: Identifier_, typeParameters: Null, supertype: FlowType): DeclareOpaqueType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareOpaqueType")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], supertype.asInstanceOf[js.Any])).asInstanceOf[DeclareOpaqueType_]
inline def declareOpaqueType(id: Identifier_, typeParameters: Unit, supertype: FlowType): DeclareOpaqueType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareOpaqueType")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], supertype.asInstanceOf[js.Any])).asInstanceOf[DeclareOpaqueType_]
inline def declareOpaqueType(id: Identifier_, typeParameters: TypeParameterDeclaration_): DeclareOpaqueType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareOpaqueType")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[DeclareOpaqueType_]
inline def declareOpaqueType(id: Identifier_, typeParameters: TypeParameterDeclaration_, supertype: FlowType): DeclareOpaqueType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareOpaqueType")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], supertype.asInstanceOf[js.Any])).asInstanceOf[DeclareOpaqueType_]

inline def declareTypeAlias(id: Identifier_, typeParameters: Null, right: FlowType): DeclareTypeAlias_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareTypeAlias")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[DeclareTypeAlias_]
inline def declareTypeAlias(id: Identifier_, typeParameters: Unit, right: FlowType): DeclareTypeAlias_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareTypeAlias")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[DeclareTypeAlias_]
inline def declareTypeAlias(id: Identifier_, typeParameters: TypeParameterDeclaration_, right: FlowType): DeclareTypeAlias_ = (^.asInstanceOf[js.Dynamic].applyDynamic("declareTypeAlias")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[DeclareTypeAlias_]

inline def declareVariable(id: Identifier_): DeclareVariable_ = ^.asInstanceOf[js.Dynamic].applyDynamic("declareVariable")(id.asInstanceOf[js.Any]).asInstanceOf[DeclareVariable_]

inline def declaredPredicate(value: Flow): DeclaredPredicate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("declaredPredicate")(value.asInstanceOf[js.Any]).asInstanceOf[DeclaredPredicate_]

inline def decorator(expression: Expression): Decorator_ = ^.asInstanceOf[js.Dynamic].applyDynamic("decorator")(expression.asInstanceOf[js.Any]).asInstanceOf[Decorator_]

inline def directive(value: DirectiveLiteral_): Directive_ = ^.asInstanceOf[js.Dynamic].applyDynamic("directive")(value.asInstanceOf[js.Any]).asInstanceOf[Directive_]

inline def directiveLiteral(value: String): DirectiveLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("directiveLiteral")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveLiteral_]

inline def doExpression(body: BlockStatement_): DoExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("doExpression")(body.asInstanceOf[js.Any]).asInstanceOf[DoExpression_]
inline def doExpression(body: BlockStatement_, async: Boolean): DoExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("doExpression")(body.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[DoExpression_]

inline def doWhileStatement(test: Expression, body: Statement): DoWhileStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("doWhileStatement")(test.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[DoWhileStatement_]

inline def emptyStatement(): EmptyStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyStatement")().asInstanceOf[EmptyStatement_]

inline def emptyTypeAnnotation(): EmptyTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyTypeAnnotation")().asInstanceOf[EmptyTypeAnnotation_]

inline def ensureBlock(node: Extract[Node, Body]): BlockStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureBlock")(node.asInstanceOf[js.Any]).asInstanceOf[BlockStatement_]
inline def ensureBlock[K /* <: /* keyof std.Extract<@babel/types.@babel/types.Node, @babel/types.anon.Body> */ String */](node: Extract[Node, Record[K, BlockStatement_ | Statement | Expression]], key: K): BlockStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureBlock")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[BlockStatement_]

inline def enumBooleanBody(members: js.Array[EnumBooleanMember_]): EnumBooleanBody_ = ^.asInstanceOf[js.Dynamic].applyDynamic("enumBooleanBody")(members.asInstanceOf[js.Any]).asInstanceOf[EnumBooleanBody_]

inline def enumBooleanMember(id: Identifier_): EnumBooleanMember_ = ^.asInstanceOf[js.Dynamic].applyDynamic("enumBooleanMember")(id.asInstanceOf[js.Any]).asInstanceOf[EnumBooleanMember_]

inline def enumDeclaration(id: Identifier_, body: EnumBooleanBody_): EnumDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("enumDeclaration")(id.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[EnumDeclaration_]
inline def enumDeclaration(id: Identifier_, body: EnumNumberBody_): EnumDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("enumDeclaration")(id.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[EnumDeclaration_]
inline def enumDeclaration(id: Identifier_, body: EnumStringBody_): EnumDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("enumDeclaration")(id.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[EnumDeclaration_]
inline def enumDeclaration(id: Identifier_, body: EnumSymbolBody_): EnumDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("enumDeclaration")(id.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[EnumDeclaration_]

inline def enumDefaultedMember(id: Identifier_): EnumDefaultedMember_ = ^.asInstanceOf[js.Dynamic].applyDynamic("enumDefaultedMember")(id.asInstanceOf[js.Any]).asInstanceOf[EnumDefaultedMember_]

inline def enumNumberBody(members: js.Array[EnumNumberMember_]): EnumNumberBody_ = ^.asInstanceOf[js.Dynamic].applyDynamic("enumNumberBody")(members.asInstanceOf[js.Any]).asInstanceOf[EnumNumberBody_]

inline def enumNumberMember(id: Identifier_, init: NumericLiteral_): EnumNumberMember_ = (^.asInstanceOf[js.Dynamic].applyDynamic("enumNumberMember")(id.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[EnumNumberMember_]

inline def enumStringBody(members: js.Array[EnumStringMember_ | EnumDefaultedMember_]): EnumStringBody_ = ^.asInstanceOf[js.Dynamic].applyDynamic("enumStringBody")(members.asInstanceOf[js.Any]).asInstanceOf[EnumStringBody_]

inline def enumStringMember(id: Identifier_, init: StringLiteral_): EnumStringMember_ = (^.asInstanceOf[js.Dynamic].applyDynamic("enumStringMember")(id.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[EnumStringMember_]

inline def enumSymbolBody(members: js.Array[EnumDefaultedMember_]): EnumSymbolBody_ = ^.asInstanceOf[js.Dynamic].applyDynamic("enumSymbolBody")(members.asInstanceOf[js.Any]).asInstanceOf[EnumSymbolBody_]

inline def existsTypeAnnotation(): ExistsTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("existsTypeAnnotation")().asInstanceOf[ExistsTypeAnnotation_]

inline def exportAllDeclaration(source: StringLiteral_): ExportAllDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("exportAllDeclaration")(source.asInstanceOf[js.Any]).asInstanceOf[ExportAllDeclaration_]

inline def exportDefaultDeclaration(declaration: ClassDeclaration_): ExportDefaultDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("exportDefaultDeclaration")(declaration.asInstanceOf[js.Any]).asInstanceOf[ExportDefaultDeclaration_]
inline def exportDefaultDeclaration(declaration: Expression): ExportDefaultDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("exportDefaultDeclaration")(declaration.asInstanceOf[js.Any]).asInstanceOf[ExportDefaultDeclaration_]
inline def exportDefaultDeclaration(declaration: FunctionDeclaration_): ExportDefaultDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("exportDefaultDeclaration")(declaration.asInstanceOf[js.Any]).asInstanceOf[ExportDefaultDeclaration_]
inline def exportDefaultDeclaration(declaration: TSDeclareFunction_): ExportDefaultDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("exportDefaultDeclaration")(declaration.asInstanceOf[js.Any]).asInstanceOf[ExportDefaultDeclaration_]

inline def exportDefaultSpecifier(exported: Identifier_): ExportDefaultSpecifier_ = ^.asInstanceOf[js.Dynamic].applyDynamic("exportDefaultSpecifier")(exported.asInstanceOf[js.Any]).asInstanceOf[ExportDefaultSpecifier_]

inline def exportNamedDeclaration(): ExportNamedDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("exportNamedDeclaration")().asInstanceOf[ExportNamedDeclaration_]
inline def exportNamedDeclaration(
  declaration: Null,
  specifiers: js.Array[ExportDefaultSpecifier_ | ExportNamespaceSpecifier_ | ExportSpecifier_]
): ExportNamedDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("exportNamedDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any])).asInstanceOf[ExportNamedDeclaration_]
inline def exportNamedDeclaration(
  declaration: Null,
  specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_],
  source: StringLiteral_
): ExportNamedDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("exportNamedDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[ExportNamedDeclaration_]
inline def exportNamedDeclaration(declaration: Null, specifiers: Unit, source: StringLiteral_): ExportNamedDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("exportNamedDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[ExportNamedDeclaration_]
inline def exportNamedDeclaration(
  declaration: Unit,
  specifiers: js.Array[ExportDefaultSpecifier_ | ExportNamespaceSpecifier_ | ExportSpecifier_]
): ExportNamedDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("exportNamedDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any])).asInstanceOf[ExportNamedDeclaration_]
inline def exportNamedDeclaration(
  declaration: Unit,
  specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_],
  source: StringLiteral_
): ExportNamedDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("exportNamedDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[ExportNamedDeclaration_]
inline def exportNamedDeclaration(declaration: Unit, specifiers: Unit, source: StringLiteral_): ExportNamedDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("exportNamedDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[ExportNamedDeclaration_]
inline def exportNamedDeclaration(declaration: Declaration): ExportNamedDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("exportNamedDeclaration")(declaration.asInstanceOf[js.Any]).asInstanceOf[ExportNamedDeclaration_]
inline def exportNamedDeclaration(
  declaration: Declaration,
  specifiers: js.Array[ExportDefaultSpecifier_ | ExportNamespaceSpecifier_ | ExportSpecifier_]
): ExportNamedDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("exportNamedDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any])).asInstanceOf[ExportNamedDeclaration_]
inline def exportNamedDeclaration(
  declaration: Declaration,
  specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_],
  source: StringLiteral_
): ExportNamedDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("exportNamedDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[ExportNamedDeclaration_]
inline def exportNamedDeclaration(declaration: Declaration, specifiers: Unit, source: StringLiteral_): ExportNamedDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("exportNamedDeclaration")(declaration.asInstanceOf[js.Any], specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[ExportNamedDeclaration_]

inline def exportNamespaceSpecifier(exported: Identifier_): ExportNamespaceSpecifier_ = ^.asInstanceOf[js.Dynamic].applyDynamic("exportNamespaceSpecifier")(exported.asInstanceOf[js.Any]).asInstanceOf[ExportNamespaceSpecifier_]

inline def exportSpecifier(local: Identifier_, exported: Identifier_): ExportSpecifier_ = (^.asInstanceOf[js.Dynamic].applyDynamic("exportSpecifier")(local.asInstanceOf[js.Any], exported.asInstanceOf[js.Any])).asInstanceOf[ExportSpecifier_]
inline def exportSpecifier(local: Identifier_, exported: StringLiteral_): ExportSpecifier_ = (^.asInstanceOf[js.Dynamic].applyDynamic("exportSpecifier")(local.asInstanceOf[js.Any], exported.asInstanceOf[js.Any])).asInstanceOf[ExportSpecifier_]

inline def expressionStatement(expression: Expression): ExpressionStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("expressionStatement")(expression.asInstanceOf[js.Any]).asInstanceOf[ExpressionStatement_]

inline def file(program: Program_): File_ = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(program.asInstanceOf[js.Any]).asInstanceOf[File_]
inline def file(program: Program_, comments: js.Array[CommentBlock | CommentLine]): File_ = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(program.asInstanceOf[js.Any], comments.asInstanceOf[js.Any])).asInstanceOf[File_]
inline def file(program: Program_, comments: js.Array[CommentBlock | CommentLine], tokens: js.Array[Any]): File_ = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(program.asInstanceOf[js.Any], comments.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[File_]
inline def file(program: Program_, comments: Null, tokens: js.Array[Any]): File_ = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(program.asInstanceOf[js.Any], comments.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[File_]
inline def file(program: Program_, comments: Unit, tokens: js.Array[Any]): File_ = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(program.asInstanceOf[js.Any], comments.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[File_]

inline def forInStatement(left: LVal, right: Expression, body: Statement): ForInStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forInStatement")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForInStatement_]
inline def forInStatement(left: VariableDeclaration_, right: Expression, body: Statement): ForInStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forInStatement")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForInStatement_]

inline def forOfStatement(left: LVal, right: Expression, body: Statement): ForOfStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forOfStatement")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForOfStatement_]
inline def forOfStatement(left: LVal, right: Expression, body: Statement, _await: Boolean): ForOfStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forOfStatement")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], body.asInstanceOf[js.Any], _await.asInstanceOf[js.Any])).asInstanceOf[ForOfStatement_]
inline def forOfStatement(left: VariableDeclaration_, right: Expression, body: Statement): ForOfStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forOfStatement")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForOfStatement_]
inline def forOfStatement(left: VariableDeclaration_, right: Expression, body: Statement, _await: Boolean): ForOfStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forOfStatement")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], body.asInstanceOf[js.Any], _await.asInstanceOf[js.Any])).asInstanceOf[ForOfStatement_]

inline def forStatement(init: Null, test: Null, update: Null, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Null, test: Null, update: Unit, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Null, test: Null, update: Expression, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Null, test: Unit, update: Null, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Null, test: Unit, update: Unit, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Null, test: Unit, update: Expression, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Null, test: Expression, update: Null, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Null, test: Expression, update: Unit, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Null, test: Expression, update: Expression, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Unit, test: Null, update: Null, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Unit, test: Null, update: Unit, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Unit, test: Null, update: Expression, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Unit, test: Unit, update: Null, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Unit, test: Unit, update: Unit, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Unit, test: Unit, update: Expression, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Unit, test: Expression, update: Null, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Unit, test: Expression, update: Unit, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Unit, test: Expression, update: Expression, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Expression, test: Null, update: Null, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Expression, test: Null, update: Unit, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Expression, test: Null, update: Expression, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Expression, test: Unit, update: Null, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Expression, test: Unit, update: Unit, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Expression, test: Unit, update: Expression, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Expression, test: Expression, update: Null, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Expression, test: Expression, update: Unit, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: Expression, test: Expression, update: Expression, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: VariableDeclaration_, test: Null, update: Null, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: VariableDeclaration_, test: Null, update: Unit, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: VariableDeclaration_, test: Null, update: Expression, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: VariableDeclaration_, test: Unit, update: Null, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: VariableDeclaration_, test: Unit, update: Unit, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: VariableDeclaration_, test: Unit, update: Expression, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: VariableDeclaration_, test: Expression, update: Null, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: VariableDeclaration_, test: Expression, update: Unit, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]
inline def forStatement(init: VariableDeclaration_, test: Expression, update: Expression, body: Statement): ForStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forStatement")(init.asInstanceOf[js.Any], test.asInstanceOf[js.Any], update.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForStatement_]

inline def functionDeclaration(id: Null, params: js.Array[Identifier_ | Pattern | RestElement_], body: BlockStatement_): FunctionDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionDeclaration")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration_]
inline def functionDeclaration(
  id: Null,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Boolean
): FunctionDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionDeclaration")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration_]
inline def functionDeclaration(
  id: Null,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Boolean,
  async: Boolean
): FunctionDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionDeclaration")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration_]
inline def functionDeclaration(
  id: Null,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Unit,
  async: Boolean
): FunctionDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionDeclaration")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration_]
inline def functionDeclaration(id: Unit, params: js.Array[Identifier_ | Pattern | RestElement_], body: BlockStatement_): FunctionDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionDeclaration")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration_]
inline def functionDeclaration(
  id: Unit,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Boolean
): FunctionDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionDeclaration")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration_]
inline def functionDeclaration(
  id: Unit,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Boolean,
  async: Boolean
): FunctionDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionDeclaration")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration_]
inline def functionDeclaration(
  id: Unit,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Unit,
  async: Boolean
): FunctionDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionDeclaration")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration_]
inline def functionDeclaration(id: Identifier_, params: js.Array[Identifier_ | Pattern | RestElement_], body: BlockStatement_): FunctionDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionDeclaration")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration_]
inline def functionDeclaration(
  id: Identifier_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Boolean
): FunctionDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionDeclaration")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration_]
inline def functionDeclaration(
  id: Identifier_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Boolean,
  async: Boolean
): FunctionDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionDeclaration")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration_]
inline def functionDeclaration(
  id: Identifier_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Unit,
  async: Boolean
): FunctionDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionDeclaration")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration_]

inline def functionExpression(id: Null, params: js.Array[Identifier_ | Pattern | RestElement_], body: BlockStatement_): FunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionExpression")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[FunctionExpression_]
inline def functionExpression(
  id: Null,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Boolean
): FunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionExpression")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[FunctionExpression_]
inline def functionExpression(
  id: Null,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Boolean,
  async: Boolean
): FunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionExpression")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[FunctionExpression_]
inline def functionExpression(
  id: Null,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Unit,
  async: Boolean
): FunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionExpression")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[FunctionExpression_]
inline def functionExpression(id: Unit, params: js.Array[Identifier_ | Pattern | RestElement_], body: BlockStatement_): FunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionExpression")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[FunctionExpression_]
inline def functionExpression(
  id: Unit,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Boolean
): FunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionExpression")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[FunctionExpression_]
inline def functionExpression(
  id: Unit,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Boolean,
  async: Boolean
): FunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionExpression")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[FunctionExpression_]
inline def functionExpression(
  id: Unit,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Unit,
  async: Boolean
): FunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionExpression")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[FunctionExpression_]
inline def functionExpression(id: Identifier_, params: js.Array[Identifier_ | Pattern | RestElement_], body: BlockStatement_): FunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionExpression")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[FunctionExpression_]
inline def functionExpression(
  id: Identifier_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Boolean
): FunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionExpression")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[FunctionExpression_]
inline def functionExpression(
  id: Identifier_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Boolean,
  async: Boolean
): FunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionExpression")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[FunctionExpression_]
inline def functionExpression(
  id: Identifier_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  generator: Unit,
  async: Boolean
): FunctionExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionExpression")(id.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[FunctionExpression_]

inline def functionTypeAnnotation(typeParameters: Null, params: js.Array[FunctionTypeParam_], rest: Null, returnType: FlowType): FunctionTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionTypeAnnotation")(typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], rest.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[FunctionTypeAnnotation_]
inline def functionTypeAnnotation(typeParameters: Null, params: js.Array[FunctionTypeParam_], rest: Unit, returnType: FlowType): FunctionTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionTypeAnnotation")(typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], rest.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[FunctionTypeAnnotation_]
inline def functionTypeAnnotation(
  typeParameters: Null,
  params: js.Array[FunctionTypeParam_],
  rest: FunctionTypeParam_,
  returnType: FlowType
): FunctionTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionTypeAnnotation")(typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], rest.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[FunctionTypeAnnotation_]
inline def functionTypeAnnotation(typeParameters: Unit, params: js.Array[FunctionTypeParam_], rest: Null, returnType: FlowType): FunctionTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionTypeAnnotation")(typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], rest.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[FunctionTypeAnnotation_]
inline def functionTypeAnnotation(typeParameters: Unit, params: js.Array[FunctionTypeParam_], rest: Unit, returnType: FlowType): FunctionTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionTypeAnnotation")(typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], rest.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[FunctionTypeAnnotation_]
inline def functionTypeAnnotation(
  typeParameters: Unit,
  params: js.Array[FunctionTypeParam_],
  rest: FunctionTypeParam_,
  returnType: FlowType
): FunctionTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionTypeAnnotation")(typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], rest.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[FunctionTypeAnnotation_]
inline def functionTypeAnnotation(
  typeParameters: TypeParameterDeclaration_,
  params: js.Array[FunctionTypeParam_],
  rest: Null,
  returnType: FlowType
): FunctionTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionTypeAnnotation")(typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], rest.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[FunctionTypeAnnotation_]
inline def functionTypeAnnotation(
  typeParameters: TypeParameterDeclaration_,
  params: js.Array[FunctionTypeParam_],
  rest: Unit,
  returnType: FlowType
): FunctionTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionTypeAnnotation")(typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], rest.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[FunctionTypeAnnotation_]
inline def functionTypeAnnotation(
  typeParameters: TypeParameterDeclaration_,
  params: js.Array[FunctionTypeParam_],
  rest: FunctionTypeParam_,
  returnType: FlowType
): FunctionTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionTypeAnnotation")(typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], rest.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[FunctionTypeAnnotation_]

inline def functionTypeParam(name: Null, typeAnnotation: FlowType): FunctionTypeParam_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionTypeParam")(name.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[FunctionTypeParam_]
inline def functionTypeParam(name: Unit, typeAnnotation: FlowType): FunctionTypeParam_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionTypeParam")(name.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[FunctionTypeParam_]
inline def functionTypeParam(name: Identifier_, typeAnnotation: FlowType): FunctionTypeParam_ = (^.asInstanceOf[js.Dynamic].applyDynamic("functionTypeParam")(name.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[FunctionTypeParam_]

inline def genericTypeAnnotation(id: Identifier_): GenericTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("genericTypeAnnotation")(id.asInstanceOf[js.Any]).asInstanceOf[GenericTypeAnnotation_]
inline def genericTypeAnnotation(id: Identifier_, typeParameters: TypeParameterInstantiation_): GenericTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("genericTypeAnnotation")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[GenericTypeAnnotation_]
inline def genericTypeAnnotation(id: QualifiedTypeIdentifier_): GenericTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("genericTypeAnnotation")(id.asInstanceOf[js.Any]).asInstanceOf[GenericTypeAnnotation_]
inline def genericTypeAnnotation(id: QualifiedTypeIdentifier_, typeParameters: TypeParameterInstantiation_): GenericTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("genericTypeAnnotation")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[GenericTypeAnnotation_]

inline def getBindingIdentifiers(node: Node): Record[String, Identifier_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBindingIdentifiers")(node.asInstanceOf[js.Any]).asInstanceOf[Record[String, Identifier_]]
inline def getBindingIdentifiers(node: Node, duplicates: Boolean): Record[String, Identifier_ | js.Array[Identifier_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBindingIdentifiers")(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[Record[String, Identifier_ | js.Array[Identifier_]]]
inline def getBindingIdentifiers(node: Node, duplicates: Boolean, outerOnly: Boolean): Record[String, Identifier_ | js.Array[Identifier_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBindingIdentifiers")(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any], outerOnly.asInstanceOf[js.Any])).asInstanceOf[Record[String, Identifier_ | js.Array[Identifier_]]]
inline def getBindingIdentifiers(node: Node, duplicates: Unit, outerOnly: Boolean): Record[String, Identifier_] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBindingIdentifiers")(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any], outerOnly.asInstanceOf[js.Any])).asInstanceOf[Record[String, Identifier_]]

inline def getBindingIdentifiers_false(node: Node, duplicates: `false`): Record[String, Identifier_] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBindingIdentifiers")(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[Record[String, Identifier_]]
inline def getBindingIdentifiers_false(node: Node, duplicates: `false`, outerOnly: Boolean): Record[String, Identifier_] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBindingIdentifiers")(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any], outerOnly.asInstanceOf[js.Any])).asInstanceOf[Record[String, Identifier_]]

inline def getBindingIdentifiers_true(node: Node, duplicates: `true`): Record[String, js.Array[Identifier_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBindingIdentifiers")(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Array[Identifier_]]]
inline def getBindingIdentifiers_true(node: Node, duplicates: `true`, outerOnly: Boolean): Record[String, js.Array[Identifier_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBindingIdentifiers")(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any], outerOnly.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Array[Identifier_]]]

inline def getOuterBindingIdentifiers(node: Node): Record[String, Identifier_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterBindingIdentifiers")(node.asInstanceOf[js.Any]).asInstanceOf[Record[String, Identifier_]]
inline def getOuterBindingIdentifiers(node: Node, duplicates: Boolean): Record[String, Identifier_ | js.Array[Identifier_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterBindingIdentifiers")(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[Record[String, Identifier_ | js.Array[Identifier_]]]

inline def getOuterBindingIdentifiers_false(node: Node, duplicates: `false`): Record[String, Identifier_] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterBindingIdentifiers")(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[Record[String, Identifier_]]

inline def getOuterBindingIdentifiers_true(node: Node, duplicates: `true`): Record[String, js.Array[Identifier_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterBindingIdentifiers")(node.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Array[Identifier_]]]

inline def identifier(name: String): Identifier_ = ^.asInstanceOf[js.Dynamic].applyDynamic("identifier")(name.asInstanceOf[js.Any]).asInstanceOf[Identifier_]

inline def ifStatement(test: Expression, consequent: Statement): IfStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifStatement")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any])).asInstanceOf[IfStatement_]
inline def ifStatement(test: Expression, consequent: Statement, alternate: Statement): IfStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifStatement")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any])).asInstanceOf[IfStatement_]

inline def `import`(): Import_ = ^.asInstanceOf[js.Dynamic].applyDynamic("import")().asInstanceOf[Import_]

inline def importAttribute(key: Identifier_, value: StringLiteral_): ImportAttribute_ = (^.asInstanceOf[js.Dynamic].applyDynamic("importAttribute")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ImportAttribute_]
inline def importAttribute(key: StringLiteral_, value: StringLiteral_): ImportAttribute_ = (^.asInstanceOf[js.Dynamic].applyDynamic("importAttribute")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ImportAttribute_]

inline def importDeclaration(
  specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
  source: StringLiteral_
): ImportDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("importDeclaration")(specifiers.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[ImportDeclaration_]

inline def importDefaultSpecifier(local: Identifier_): ImportDefaultSpecifier_ = ^.asInstanceOf[js.Dynamic].applyDynamic("importDefaultSpecifier")(local.asInstanceOf[js.Any]).asInstanceOf[ImportDefaultSpecifier_]

inline def importNamespaceSpecifier(local: Identifier_): ImportNamespaceSpecifier_ = ^.asInstanceOf[js.Dynamic].applyDynamic("importNamespaceSpecifier")(local.asInstanceOf[js.Any]).asInstanceOf[ImportNamespaceSpecifier_]

inline def importSpecifier(local: Identifier_, imported: Identifier_): ImportSpecifier_ = (^.asInstanceOf[js.Dynamic].applyDynamic("importSpecifier")(local.asInstanceOf[js.Any], imported.asInstanceOf[js.Any])).asInstanceOf[ImportSpecifier_]
inline def importSpecifier(local: Identifier_, imported: StringLiteral_): ImportSpecifier_ = (^.asInstanceOf[js.Dynamic].applyDynamic("importSpecifier")(local.asInstanceOf[js.Any], imported.asInstanceOf[js.Any])).asInstanceOf[ImportSpecifier_]

inline def indexedAccessType(objectType: FlowType, indexType: FlowType): IndexedAccessType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("indexedAccessType")(objectType.asInstanceOf[js.Any], indexType.asInstanceOf[js.Any])).asInstanceOf[IndexedAccessType_]

inline def inferredPredicate(): InferredPredicate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("inferredPredicate")().asInstanceOf[InferredPredicate_]

inline def inheritInnerComments(node: Node, parent: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inheritInnerComments")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def inheritLeadingComments(node: Node, parent: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inheritLeadingComments")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def inheritTrailingComments(node: Node, parent: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inheritTrailingComments")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def inherits[T /* <: js.UndefOr[Node | Null] */](child: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(child.asInstanceOf[js.Any]).asInstanceOf[T]
inline def inherits[T /* <: js.UndefOr[Node | Null] */](child: T, parent: Node): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[T]

inline def inheritsComments[T /* <: Node */](node: T, parent: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inheritsComments")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def interfaceDeclaration(
  id: Identifier_,
  typeParameters: Null,
  _extends: js.Array[InterfaceExtends_],
  body: ObjectTypeAnnotation_
): InterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[InterfaceDeclaration_]
inline def interfaceDeclaration(id: Identifier_, typeParameters: Null, _extends: Null, body: ObjectTypeAnnotation_): InterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[InterfaceDeclaration_]
inline def interfaceDeclaration(id: Identifier_, typeParameters: Null, _extends: Unit, body: ObjectTypeAnnotation_): InterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[InterfaceDeclaration_]
inline def interfaceDeclaration(
  id: Identifier_,
  typeParameters: Unit,
  _extends: js.Array[InterfaceExtends_],
  body: ObjectTypeAnnotation_
): InterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[InterfaceDeclaration_]
inline def interfaceDeclaration(id: Identifier_, typeParameters: Unit, _extends: Null, body: ObjectTypeAnnotation_): InterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[InterfaceDeclaration_]
inline def interfaceDeclaration(id: Identifier_, typeParameters: Unit, _extends: Unit, body: ObjectTypeAnnotation_): InterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[InterfaceDeclaration_]
inline def interfaceDeclaration(
  id: Identifier_,
  typeParameters: TypeParameterDeclaration_,
  _extends: js.Array[InterfaceExtends_],
  body: ObjectTypeAnnotation_
): InterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[InterfaceDeclaration_]
inline def interfaceDeclaration(
  id: Identifier_,
  typeParameters: TypeParameterDeclaration_,
  _extends: Null,
  body: ObjectTypeAnnotation_
): InterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[InterfaceDeclaration_]
inline def interfaceDeclaration(
  id: Identifier_,
  typeParameters: TypeParameterDeclaration_,
  _extends: Unit,
  body: ObjectTypeAnnotation_
): InterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[InterfaceDeclaration_]

inline def interfaceExtends(id: Identifier_): InterfaceExtends_ = ^.asInstanceOf[js.Dynamic].applyDynamic("interfaceExtends")(id.asInstanceOf[js.Any]).asInstanceOf[InterfaceExtends_]
inline def interfaceExtends(id: Identifier_, typeParameters: TypeParameterInstantiation_): InterfaceExtends_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceExtends")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[InterfaceExtends_]
inline def interfaceExtends(id: QualifiedTypeIdentifier_): InterfaceExtends_ = ^.asInstanceOf[js.Dynamic].applyDynamic("interfaceExtends")(id.asInstanceOf[js.Any]).asInstanceOf[InterfaceExtends_]
inline def interfaceExtends(id: QualifiedTypeIdentifier_, typeParameters: TypeParameterInstantiation_): InterfaceExtends_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceExtends")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[InterfaceExtends_]

inline def interfaceTypeAnnotation(_extends: js.Array[InterfaceExtends_], body: ObjectTypeAnnotation_): InterfaceTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceTypeAnnotation")(_extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[InterfaceTypeAnnotation_]
inline def interfaceTypeAnnotation(_extends: Null, body: ObjectTypeAnnotation_): InterfaceTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceTypeAnnotation")(_extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[InterfaceTypeAnnotation_]
inline def interfaceTypeAnnotation(_extends: Unit, body: ObjectTypeAnnotation_): InterfaceTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceTypeAnnotation")(_extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[InterfaceTypeAnnotation_]

inline def interpreterDirective(value: String): InterpreterDirective_ = ^.asInstanceOf[js.Dynamic].applyDynamic("interpreterDirective")(value.asInstanceOf[js.Any]).asInstanceOf[InterpreterDirective_]

inline def intersectionTypeAnnotation(types: js.Array[FlowType]): IntersectionTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("intersectionTypeAnnotation")(types.asInstanceOf[js.Any]).asInstanceOf[IntersectionTypeAnnotation_]

inline def is(`type`: String): /* is @babel/types.@babel/types.Node */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Node */ Boolean]
inline def is(`type`: String, n: Null, required: Partial[Node]): /* is @babel/types.@babel/types.Node */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(`type`.asInstanceOf[js.Any], n.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Node */ Boolean]
inline def is(`type`: String, n: Unit, required: Partial[Node]): /* is @babel/types.@babel/types.Node */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(`type`.asInstanceOf[js.Any], n.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Node */ Boolean]
inline def is(`type`: String, n: Node): /* is @babel/types.@babel/types.Node */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(`type`.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Node */ Boolean]
inline def is(`type`: String, n: Node, required: Partial[Node]): /* is @babel/types.@babel/types.Node */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(`type`.asInstanceOf[js.Any], n.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Node */ Boolean]
inline def is[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.babelTypes.babelTypesStrings.ClassAccessorProperty, typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder */ Any */](`type`: T): /* is std.Extract<@babel/types.@babel/types.Node, @babel/types.anon.Type<T>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Extract<@babel/types.@babel/types.Node, @babel/types.anon.Type<T>> */ Boolean]
inline def is[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.babelTypes.babelTypesStrings.ClassAccessorProperty, typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder */ Any */](`type`: T, n: Node): /* is std.Extract<@babel/types.@babel/types.Node, @babel/types.anon.Type<T>> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(`type`.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[/* is std.Extract<@babel/types.@babel/types.Node, @babel/types.anon.Type<T>> */ Boolean]
inline def is[P /* <: Node */](`type`: String, n: Null, required: Partial[P]): /* is P */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(`type`.asInstanceOf[js.Any], n.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[/* is P */ Boolean]
inline def is[P /* <: Node */](`type`: String, n: Unit, required: Partial[P]): /* is P */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(`type`.asInstanceOf[js.Any], n.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[/* is P */ Boolean]
inline def is[P /* <: Node */](`type`: String, n: Node, required: Partial[P]): /* is P */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(`type`.asInstanceOf[js.Any], n.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[/* is P */ Boolean]
inline def is[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.babelTypes.babelTypesStrings.ClassAccessorProperty, typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder */ Any */, P /* <: Extract[Node, Type[T]] */](`type`: T, n: Null, required: Partial[P]): /* is P */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(`type`.asInstanceOf[js.Any], n.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[/* is P */ Boolean]
inline def is[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.babelTypes.babelTypesStrings.ClassAccessorProperty, typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder */ Any */, P /* <: Extract[Node, Type[T]] */](`type`: T, n: Unit, required: Partial[P]): /* is P */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(`type`.asInstanceOf[js.Any], n.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[/* is P */ Boolean]
inline def is[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.babelTypes.babelTypesStrings.ClassAccessorProperty, typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder */ Any */, P /* <: Extract[Node, Type[T]] */](`type`: T, n: Node, required: Partial[P]): /* is P */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(`type`.asInstanceOf[js.Any], n.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[/* is P */ Boolean]

inline def isAccessor(): /* is @babel/types.@babel/types.Accessor */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccessor")().asInstanceOf[/* is @babel/types.@babel/types.Accessor */ Boolean]
inline def isAccessor(node: js.Object): /* is @babel/types.@babel/types.Accessor */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccessor")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Accessor */ Boolean]
inline def isAccessor(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Accessor */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAccessor")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Accessor */ Boolean]
inline def isAccessor(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Accessor */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAccessor")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Accessor */ Boolean]
inline def isAccessor(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Accessor */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAccessor")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Accessor */ Boolean]

inline def isAnyTypeAnnotation(): /* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean]
inline def isAnyTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean]
inline def isAnyTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAnyTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean]
inline def isAnyTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAnyTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean]
inline def isAnyTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAnyTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean]

inline def isArgumentPlaceholder(): /* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgumentPlaceholder")().asInstanceOf[/* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean]
inline def isArgumentPlaceholder(node: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgumentPlaceholder")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean]
inline def isArgumentPlaceholder(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArgumentPlaceholder")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean]
inline def isArgumentPlaceholder(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArgumentPlaceholder")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean]
inline def isArgumentPlaceholder(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArgumentPlaceholder")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean]

inline def isArrayExpression(): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayExpression")().asInstanceOf[/* is @babel/types.@babel/types.ArrayExpression */ Boolean]
inline def isArrayExpression(node: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ArrayExpression */ Boolean]
inline def isArrayExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArrayExpression */ Boolean]
inline def isArrayExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArrayExpression */ Boolean]
inline def isArrayExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArrayExpression */ Boolean]

inline def isArrayPattern(): /* is @babel/types.@babel/types.ArrayPattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayPattern")().asInstanceOf[/* is @babel/types.@babel/types.ArrayPattern */ Boolean]
inline def isArrayPattern(node: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayPattern")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ArrayPattern */ Boolean]
inline def isArrayPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArrayPattern */ Boolean]
inline def isArrayPattern(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArrayPattern */ Boolean]
inline def isArrayPattern(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArrayPattern */ Boolean]

inline def isArrayTypeAnnotation(): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean]
inline def isArrayTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean]
inline def isArrayTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean]
inline def isArrayTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean]
inline def isArrayTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean]

inline def isArrowFunctionExpression(): /* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrowFunctionExpression")().asInstanceOf[/* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean]
inline def isArrowFunctionExpression(node: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrowFunctionExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean]
inline def isArrowFunctionExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrowFunctionExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean]
inline def isArrowFunctionExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrowFunctionExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean]
inline def isArrowFunctionExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrowFunctionExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean]

inline def isAssignmentExpression(): /* is @babel/types.@babel/types.AssignmentExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentExpression")().asInstanceOf[/* is @babel/types.@babel/types.AssignmentExpression */ Boolean]
inline def isAssignmentExpression(node: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.AssignmentExpression */ Boolean]
inline def isAssignmentExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.AssignmentExpression */ Boolean]
inline def isAssignmentExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.AssignmentExpression */ Boolean]
inline def isAssignmentExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.AssignmentExpression */ Boolean]

inline def isAssignmentPattern(): /* is @babel/types.@babel/types.AssignmentPattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentPattern")().asInstanceOf[/* is @babel/types.@babel/types.AssignmentPattern */ Boolean]
inline def isAssignmentPattern(node: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentPattern")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.AssignmentPattern */ Boolean]
inline def isAssignmentPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.AssignmentPattern */ Boolean]
inline def isAssignmentPattern(node: Null, opts: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.AssignmentPattern */ Boolean]
inline def isAssignmentPattern(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.AssignmentPattern */ Boolean]

inline def isAwaitExpression(): /* is @babel/types.@babel/types.AwaitExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAwaitExpression")().asInstanceOf[/* is @babel/types.@babel/types.AwaitExpression */ Boolean]
inline def isAwaitExpression(node: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAwaitExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.AwaitExpression */ Boolean]
inline def isAwaitExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAwaitExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.AwaitExpression */ Boolean]
inline def isAwaitExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAwaitExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.AwaitExpression */ Boolean]
inline def isAwaitExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAwaitExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.AwaitExpression */ Boolean]

inline def isBigIntLiteral(): /* is @babel/types.@babel/types.BigIntLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigIntLiteral")().asInstanceOf[/* is @babel/types.@babel/types.BigIntLiteral */ Boolean]
inline def isBigIntLiteral(node: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigIntLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.BigIntLiteral */ Boolean]
inline def isBigIntLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBigIntLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BigIntLiteral */ Boolean]
inline def isBigIntLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBigIntLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BigIntLiteral */ Boolean]
inline def isBigIntLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBigIntLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BigIntLiteral */ Boolean]

inline def isBinary(): /* is @babel/types.@babel/types.Binary */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")().asInstanceOf[/* is @babel/types.@babel/types.Binary */ Boolean]
inline def isBinary(node: js.Object): /* is @babel/types.@babel/types.Binary */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Binary */ Boolean]
inline def isBinary(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Binary */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Binary */ Boolean]
inline def isBinary(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Binary */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Binary */ Boolean]
inline def isBinary(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Binary */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Binary */ Boolean]

inline def isBinaryExpression(): /* is @babel/types.@babel/types.BinaryExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryExpression")().asInstanceOf[/* is @babel/types.@babel/types.BinaryExpression */ Boolean]
inline def isBinaryExpression(node: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.BinaryExpression */ Boolean]
inline def isBinaryExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BinaryExpression */ Boolean]
inline def isBinaryExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BinaryExpression */ Boolean]
inline def isBinaryExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BinaryExpression */ Boolean]

inline def isBindExpression(): /* is @babel/types.@babel/types.BindExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBindExpression")().asInstanceOf[/* is @babel/types.@babel/types.BindExpression */ Boolean]
inline def isBindExpression(node: js.Object): /* is @babel/types.@babel/types.BindExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBindExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.BindExpression */ Boolean]
inline def isBindExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BindExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBindExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BindExpression */ Boolean]
inline def isBindExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BindExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBindExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BindExpression */ Boolean]
inline def isBindExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.BindExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBindExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BindExpression */ Boolean]

inline def isBinding(node: Node, parent: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinding")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isBinding(node: Node, parent: Node, grandparent: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinding")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], grandparent.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isBlock(): /* is @babel/types.@babel/types.Block */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlock")().asInstanceOf[/* is @babel/types.@babel/types.Block */ Boolean]
inline def isBlock(node: js.Object): /* is @babel/types.@babel/types.Block */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlock")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Block */ Boolean]
inline def isBlock(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Block */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Block */ Boolean]
inline def isBlock(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Block */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Block */ Boolean]
inline def isBlock(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Block */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Block */ Boolean]

inline def isBlockParent(): /* is @babel/types.@babel/types.BlockParent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockParent")().asInstanceOf[/* is @babel/types.@babel/types.BlockParent */ Boolean]
inline def isBlockParent(node: js.Object): /* is @babel/types.@babel/types.BlockParent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockParent")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.BlockParent */ Boolean]
inline def isBlockParent(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BlockParent */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBlockParent")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BlockParent */ Boolean]
inline def isBlockParent(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BlockParent */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBlockParent")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BlockParent */ Boolean]
inline def isBlockParent(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.BlockParent */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBlockParent")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BlockParent */ Boolean]

inline def isBlockScoped(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScoped")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isBlockStatement(): /* is @babel/types.@babel/types.BlockStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockStatement")().asInstanceOf[/* is @babel/types.@babel/types.BlockStatement */ Boolean]
inline def isBlockStatement(node: js.Object): /* is @babel/types.@babel/types.BlockStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.BlockStatement */ Boolean]
inline def isBlockStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BlockStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBlockStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BlockStatement */ Boolean]
inline def isBlockStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BlockStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBlockStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BlockStatement */ Boolean]
inline def isBlockStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.BlockStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBlockStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BlockStatement */ Boolean]

inline def isBooleanLiteral(): /* is @babel/types.@babel/types.BooleanLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanLiteral")().asInstanceOf[/* is @babel/types.@babel/types.BooleanLiteral */ Boolean]
inline def isBooleanLiteral(node: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.BooleanLiteral */ Boolean]
inline def isBooleanLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BooleanLiteral */ Boolean]
inline def isBooleanLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BooleanLiteral */ Boolean]
inline def isBooleanLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BooleanLiteral */ Boolean]

inline def isBooleanLiteralTypeAnnotation(): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanLiteralTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean]
inline def isBooleanLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanLiteralTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean]
inline def isBooleanLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean]
inline def isBooleanLiteralTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean]
inline def isBooleanLiteralTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean]

inline def isBooleanTypeAnnotation(): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean]
inline def isBooleanTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean]
inline def isBooleanTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean]
inline def isBooleanTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean]
inline def isBooleanTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean]

inline def isBreakStatement(): /* is @babel/types.@babel/types.BreakStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBreakStatement")().asInstanceOf[/* is @babel/types.@babel/types.BreakStatement */ Boolean]
inline def isBreakStatement(node: js.Object): /* is @babel/types.@babel/types.BreakStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBreakStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.BreakStatement */ Boolean]
inline def isBreakStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BreakStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBreakStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BreakStatement */ Boolean]
inline def isBreakStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BreakStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBreakStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BreakStatement */ Boolean]
inline def isBreakStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.BreakStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBreakStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.BreakStatement */ Boolean]

inline def isCallExpression(): /* is @babel/types.@babel/types.CallExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallExpression")().asInstanceOf[/* is @babel/types.@babel/types.CallExpression */ Boolean]
inline def isCallExpression(node: js.Object): /* is @babel/types.@babel/types.CallExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.CallExpression */ Boolean]
inline def isCallExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCallExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.CallExpression */ Boolean]
inline def isCallExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCallExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.CallExpression */ Boolean]
inline def isCallExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCallExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.CallExpression */ Boolean]

inline def isCatchClause(): /* is @babel/types.@babel/types.CatchClause */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCatchClause")().asInstanceOf[/* is @babel/types.@babel/types.CatchClause */ Boolean]
inline def isCatchClause(node: js.Object): /* is @babel/types.@babel/types.CatchClause */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCatchClause")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.CatchClause */ Boolean]
inline def isCatchClause(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CatchClause */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCatchClause")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.CatchClause */ Boolean]
inline def isCatchClause(node: Null, opts: js.Object): /* is @babel/types.@babel/types.CatchClause */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCatchClause")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.CatchClause */ Boolean]
inline def isCatchClause(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.CatchClause */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCatchClause")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.CatchClause */ Boolean]

inline def isClass(): /* is @babel/types.@babel/types.Class */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClass")().asInstanceOf[/* is @babel/types.@babel/types.Class */ Boolean]
inline def isClass(node: js.Object): /* is @babel/types.@babel/types.Class */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClass")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Class */ Boolean]
inline def isClass(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Class */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClass")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Class */ Boolean]
inline def isClass(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Class */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClass")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Class */ Boolean]
inline def isClass(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Class */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClass")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Class */ Boolean]

inline def isClassAccessorProperty(): /* is @babel/types.@babel/types.ClassAccessorProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassAccessorProperty")().asInstanceOf[/* is @babel/types.@babel/types.ClassAccessorProperty */ Boolean]
inline def isClassAccessorProperty(node: js.Object): /* is @babel/types.@babel/types.ClassAccessorProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassAccessorProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ClassAccessorProperty */ Boolean]
inline def isClassAccessorProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassAccessorProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassAccessorProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassAccessorProperty */ Boolean]
inline def isClassAccessorProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassAccessorProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassAccessorProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassAccessorProperty */ Boolean]
inline def isClassAccessorProperty(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ClassAccessorProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassAccessorProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassAccessorProperty */ Boolean]

inline def isClassBody(): /* is @babel/types.@babel/types.ClassBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassBody")().asInstanceOf[/* is @babel/types.@babel/types.ClassBody */ Boolean]
inline def isClassBody(node: js.Object): /* is @babel/types.@babel/types.ClassBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassBody")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ClassBody */ Boolean]
inline def isClassBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassBody */ Boolean]
inline def isClassBody(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassBody */ Boolean]
inline def isClassBody(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ClassBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassBody */ Boolean]

inline def isClassDeclaration(): /* is @babel/types.@babel/types.ClassDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.ClassDeclaration */ Boolean]
inline def isClassDeclaration(node: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ClassDeclaration */ Boolean]
inline def isClassDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassDeclaration */ Boolean]
inline def isClassDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassDeclaration */ Boolean]
inline def isClassDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassDeclaration */ Boolean]

inline def isClassExpression(): /* is @babel/types.@babel/types.ClassExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassExpression")().asInstanceOf[/* is @babel/types.@babel/types.ClassExpression */ Boolean]
inline def isClassExpression(node: js.Object): /* is @babel/types.@babel/types.ClassExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ClassExpression */ Boolean]
inline def isClassExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassExpression */ Boolean]
inline def isClassExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassExpression */ Boolean]
inline def isClassExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ClassExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassExpression */ Boolean]

inline def isClassImplements(): /* is @babel/types.@babel/types.ClassImplements */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassImplements")().asInstanceOf[/* is @babel/types.@babel/types.ClassImplements */ Boolean]
inline def isClassImplements(node: js.Object): /* is @babel/types.@babel/types.ClassImplements */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassImplements")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ClassImplements */ Boolean]
inline def isClassImplements(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassImplements */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassImplements")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassImplements */ Boolean]
inline def isClassImplements(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassImplements */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassImplements")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassImplements */ Boolean]
inline def isClassImplements(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ClassImplements */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassImplements")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassImplements */ Boolean]

inline def isClassMethod(): /* is @babel/types.@babel/types.ClassMethod */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassMethod")().asInstanceOf[/* is @babel/types.@babel/types.ClassMethod */ Boolean]
inline def isClassMethod(node: js.Object): /* is @babel/types.@babel/types.ClassMethod */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassMethod")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ClassMethod */ Boolean]
inline def isClassMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassMethod */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassMethod */ Boolean]
inline def isClassMethod(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassMethod */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassMethod */ Boolean]
inline def isClassMethod(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ClassMethod */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassMethod */ Boolean]

inline def isClassPrivateMethod(): /* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassPrivateMethod")().asInstanceOf[/* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean]
inline def isClassPrivateMethod(node: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassPrivateMethod")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean]
inline def isClassPrivateMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassPrivateMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean]
inline def isClassPrivateMethod(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassPrivateMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean]
inline def isClassPrivateMethod(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassPrivateMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean]

inline def isClassPrivateProperty(): /* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassPrivateProperty")().asInstanceOf[/* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean]
inline def isClassPrivateProperty(node: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassPrivateProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean]
inline def isClassPrivateProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassPrivateProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean]
inline def isClassPrivateProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassPrivateProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean]
inline def isClassPrivateProperty(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassPrivateProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean]

inline def isClassProperty(): /* is @babel/types.@babel/types.ClassProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassProperty")().asInstanceOf[/* is @babel/types.@babel/types.ClassProperty */ Boolean]
inline def isClassProperty(node: js.Object): /* is @babel/types.@babel/types.ClassProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ClassProperty */ Boolean]
inline def isClassProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassProperty */ Boolean]
inline def isClassProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassProperty */ Boolean]
inline def isClassProperty(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ClassProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ClassProperty */ Boolean]

inline def isCompletionStatement(): /* is @babel/types.@babel/types.CompletionStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompletionStatement")().asInstanceOf[/* is @babel/types.@babel/types.CompletionStatement */ Boolean]
inline def isCompletionStatement(node: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompletionStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.CompletionStatement */ Boolean]
inline def isCompletionStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCompletionStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.CompletionStatement */ Boolean]
inline def isCompletionStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCompletionStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.CompletionStatement */ Boolean]
inline def isCompletionStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCompletionStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.CompletionStatement */ Boolean]

inline def isConditional(): /* is @babel/types.@babel/types.Conditional */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditional")().asInstanceOf[/* is @babel/types.@babel/types.Conditional */ Boolean]
inline def isConditional(node: js.Object): /* is @babel/types.@babel/types.Conditional */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditional")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Conditional */ Boolean]
inline def isConditional(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Conditional */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConditional")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Conditional */ Boolean]
inline def isConditional(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Conditional */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConditional")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Conditional */ Boolean]
inline def isConditional(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Conditional */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConditional")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Conditional */ Boolean]

inline def isConditionalExpression(): /* is @babel/types.@babel/types.ConditionalExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalExpression")().asInstanceOf[/* is @babel/types.@babel/types.ConditionalExpression */ Boolean]
inline def isConditionalExpression(node: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ConditionalExpression */ Boolean]
inline def isConditionalExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ConditionalExpression */ Boolean]
inline def isConditionalExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ConditionalExpression */ Boolean]
inline def isConditionalExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ConditionalExpression */ Boolean]

inline def isContinueStatement(): /* is @babel/types.@babel/types.ContinueStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContinueStatement")().asInstanceOf[/* is @babel/types.@babel/types.ContinueStatement */ Boolean]
inline def isContinueStatement(node: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContinueStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ContinueStatement */ Boolean]
inline def isContinueStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContinueStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ContinueStatement */ Boolean]
inline def isContinueStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContinueStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ContinueStatement */ Boolean]
inline def isContinueStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContinueStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ContinueStatement */ Boolean]

inline def isDebuggerStatement(): /* is @babel/types.@babel/types.DebuggerStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDebuggerStatement")().asInstanceOf[/* is @babel/types.@babel/types.DebuggerStatement */ Boolean]
inline def isDebuggerStatement(node: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDebuggerStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DebuggerStatement */ Boolean]
inline def isDebuggerStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDebuggerStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DebuggerStatement */ Boolean]
inline def isDebuggerStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDebuggerStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DebuggerStatement */ Boolean]
inline def isDebuggerStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDebuggerStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DebuggerStatement */ Boolean]

inline def isDecimalLiteral(): /* is @babel/types.@babel/types.DecimalLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimalLiteral")().asInstanceOf[/* is @babel/types.@babel/types.DecimalLiteral */ Boolean]
inline def isDecimalLiteral(node: js.Object): /* is @babel/types.@babel/types.DecimalLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimalLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DecimalLiteral */ Boolean]
inline def isDecimalLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DecimalLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDecimalLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DecimalLiteral */ Boolean]
inline def isDecimalLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DecimalLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDecimalLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DecimalLiteral */ Boolean]
inline def isDecimalLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DecimalLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDecimalLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DecimalLiteral */ Boolean]

inline def isDeclaration(): /* is @babel/types.@babel/types.Declaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.Declaration */ Boolean]
inline def isDeclaration(node: js.Object): /* is @babel/types.@babel/types.Declaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Declaration */ Boolean]
inline def isDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Declaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Declaration */ Boolean]
inline def isDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Declaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Declaration */ Boolean]
inline def isDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Declaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Declaration */ Boolean]

inline def isDeclareClass(): /* is @babel/types.@babel/types.DeclareClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareClass")().asInstanceOf[/* is @babel/types.@babel/types.DeclareClass */ Boolean]
inline def isDeclareClass(node: js.Object): /* is @babel/types.@babel/types.DeclareClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareClass")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DeclareClass */ Boolean]
inline def isDeclareClass(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareClass */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareClass")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareClass */ Boolean]
inline def isDeclareClass(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareClass */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareClass")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareClass */ Boolean]
inline def isDeclareClass(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DeclareClass */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareClass")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareClass */ Boolean]

inline def isDeclareExportAllDeclaration(): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareExportAllDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean]
inline def isDeclareExportAllDeclaration(node: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareExportAllDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean]
inline def isDeclareExportAllDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareExportAllDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean]
inline def isDeclareExportAllDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareExportAllDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean]
inline def isDeclareExportAllDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareExportAllDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean]

inline def isDeclareExportDeclaration(): /* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareExportDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean]
inline def isDeclareExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean]
inline def isDeclareExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean]
inline def isDeclareExportDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean]
inline def isDeclareExportDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean]

inline def isDeclareFunction(): /* is @babel/types.@babel/types.DeclareFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareFunction")().asInstanceOf[/* is @babel/types.@babel/types.DeclareFunction */ Boolean]
inline def isDeclareFunction(node: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareFunction")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DeclareFunction */ Boolean]
inline def isDeclareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareFunction */ Boolean]
inline def isDeclareFunction(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareFunction */ Boolean]
inline def isDeclareFunction(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareFunction */ Boolean]

inline def isDeclareInterface(): /* is @babel/types.@babel/types.DeclareInterface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareInterface")().asInstanceOf[/* is @babel/types.@babel/types.DeclareInterface */ Boolean]
inline def isDeclareInterface(node: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareInterface")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DeclareInterface */ Boolean]
inline def isDeclareInterface(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareInterface")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareInterface */ Boolean]
inline def isDeclareInterface(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareInterface")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareInterface */ Boolean]
inline def isDeclareInterface(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareInterface")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareInterface */ Boolean]

inline def isDeclareModule(): /* is @babel/types.@babel/types.DeclareModule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareModule")().asInstanceOf[/* is @babel/types.@babel/types.DeclareModule */ Boolean]
inline def isDeclareModule(node: js.Object): /* is @babel/types.@babel/types.DeclareModule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareModule")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DeclareModule */ Boolean]
inline def isDeclareModule(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareModule */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareModule")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareModule */ Boolean]
inline def isDeclareModule(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareModule */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareModule")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareModule */ Boolean]
inline def isDeclareModule(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DeclareModule */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareModule")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareModule */ Boolean]

inline def isDeclareModuleExports(): /* is @babel/types.@babel/types.DeclareModuleExports */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareModuleExports")().asInstanceOf[/* is @babel/types.@babel/types.DeclareModuleExports */ Boolean]
inline def isDeclareModuleExports(node: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareModuleExports")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DeclareModuleExports */ Boolean]
inline def isDeclareModuleExports(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareModuleExports")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareModuleExports */ Boolean]
inline def isDeclareModuleExports(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareModuleExports")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareModuleExports */ Boolean]
inline def isDeclareModuleExports(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareModuleExports")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareModuleExports */ Boolean]

inline def isDeclareOpaqueType(): /* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareOpaqueType")().asInstanceOf[/* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean]
inline def isDeclareOpaqueType(node: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareOpaqueType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean]
inline def isDeclareOpaqueType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareOpaqueType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean]
inline def isDeclareOpaqueType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareOpaqueType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean]
inline def isDeclareOpaqueType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareOpaqueType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean]

inline def isDeclareTypeAlias(): /* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareTypeAlias")().asInstanceOf[/* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean]
inline def isDeclareTypeAlias(node: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareTypeAlias")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean]
inline def isDeclareTypeAlias(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareTypeAlias")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean]
inline def isDeclareTypeAlias(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareTypeAlias")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean]
inline def isDeclareTypeAlias(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareTypeAlias")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean]

inline def isDeclareVariable(): /* is @babel/types.@babel/types.DeclareVariable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareVariable")().asInstanceOf[/* is @babel/types.@babel/types.DeclareVariable */ Boolean]
inline def isDeclareVariable(node: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareVariable")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DeclareVariable */ Boolean]
inline def isDeclareVariable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareVariable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareVariable */ Boolean]
inline def isDeclareVariable(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareVariable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareVariable */ Boolean]
inline def isDeclareVariable(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclareVariable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclareVariable */ Boolean]

inline def isDeclaredPredicate(): /* is @babel/types.@babel/types.DeclaredPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclaredPredicate")().asInstanceOf[/* is @babel/types.@babel/types.DeclaredPredicate */ Boolean]
inline def isDeclaredPredicate(node: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclaredPredicate")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DeclaredPredicate */ Boolean]
inline def isDeclaredPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclaredPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclaredPredicate */ Boolean]
inline def isDeclaredPredicate(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclaredPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclaredPredicate */ Boolean]
inline def isDeclaredPredicate(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclaredPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DeclaredPredicate */ Boolean]

inline def isDecorator(): /* is @babel/types.@babel/types.Decorator */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecorator")().asInstanceOf[/* is @babel/types.@babel/types.Decorator */ Boolean]
inline def isDecorator(node: js.Object): /* is @babel/types.@babel/types.Decorator */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecorator")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Decorator */ Boolean]
inline def isDecorator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Decorator */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDecorator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Decorator */ Boolean]
inline def isDecorator(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Decorator */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDecorator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Decorator */ Boolean]
inline def isDecorator(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Decorator */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDecorator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Decorator */ Boolean]

inline def isDirective(): /* is @babel/types.@babel/types.Directive */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirective")().asInstanceOf[/* is @babel/types.@babel/types.Directive */ Boolean]
inline def isDirective(node: js.Object): /* is @babel/types.@babel/types.Directive */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirective")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Directive */ Boolean]
inline def isDirective(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Directive */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDirective")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Directive */ Boolean]
inline def isDirective(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Directive */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDirective")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Directive */ Boolean]
inline def isDirective(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Directive */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDirective")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Directive */ Boolean]

inline def isDirectiveLiteral(): /* is @babel/types.@babel/types.DirectiveLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectiveLiteral")().asInstanceOf[/* is @babel/types.@babel/types.DirectiveLiteral */ Boolean]
inline def isDirectiveLiteral(node: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectiveLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DirectiveLiteral */ Boolean]
inline def isDirectiveLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDirectiveLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DirectiveLiteral */ Boolean]
inline def isDirectiveLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDirectiveLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DirectiveLiteral */ Boolean]
inline def isDirectiveLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDirectiveLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DirectiveLiteral */ Boolean]

inline def isDoExpression(): /* is @babel/types.@babel/types.DoExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDoExpression")().asInstanceOf[/* is @babel/types.@babel/types.DoExpression */ Boolean]
inline def isDoExpression(node: js.Object): /* is @babel/types.@babel/types.DoExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDoExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DoExpression */ Boolean]
inline def isDoExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DoExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDoExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DoExpression */ Boolean]
inline def isDoExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DoExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDoExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DoExpression */ Boolean]
inline def isDoExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DoExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDoExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DoExpression */ Boolean]

inline def isDoWhileStatement(): /* is @babel/types.@babel/types.DoWhileStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDoWhileStatement")().asInstanceOf[/* is @babel/types.@babel/types.DoWhileStatement */ Boolean]
inline def isDoWhileStatement(node: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDoWhileStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.DoWhileStatement */ Boolean]
inline def isDoWhileStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDoWhileStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DoWhileStatement */ Boolean]
inline def isDoWhileStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDoWhileStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DoWhileStatement */ Boolean]
inline def isDoWhileStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDoWhileStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.DoWhileStatement */ Boolean]

inline def isEmptyStatement(): /* is @babel/types.@babel/types.EmptyStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyStatement")().asInstanceOf[/* is @babel/types.@babel/types.EmptyStatement */ Boolean]
inline def isEmptyStatement(node: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.EmptyStatement */ Boolean]
inline def isEmptyStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EmptyStatement */ Boolean]
inline def isEmptyStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EmptyStatement */ Boolean]
inline def isEmptyStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EmptyStatement */ Boolean]

inline def isEmptyTypeAnnotation(): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean]
inline def isEmptyTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean]
inline def isEmptyTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean]
inline def isEmptyTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean]
inline def isEmptyTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean]

inline def isEnumBody(): /* is @babel/types.@babel/types.EnumBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBody")().asInstanceOf[/* is @babel/types.@babel/types.EnumBody */ Boolean]
inline def isEnumBody(node: js.Object): /* is @babel/types.@babel/types.EnumBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBody")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.EnumBody */ Boolean]
inline def isEnumBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EnumBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumBody */ Boolean]
inline def isEnumBody(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EnumBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumBody */ Boolean]
inline def isEnumBody(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.EnumBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumBody */ Boolean]

inline def isEnumBooleanBody(): /* is @babel/types.@babel/types.EnumBooleanBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBooleanBody")().asInstanceOf[/* is @babel/types.@babel/types.EnumBooleanBody */ Boolean]
inline def isEnumBooleanBody(node: js.Object): /* is @babel/types.@babel/types.EnumBooleanBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBooleanBody")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.EnumBooleanBody */ Boolean]
inline def isEnumBooleanBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EnumBooleanBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBooleanBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumBooleanBody */ Boolean]
inline def isEnumBooleanBody(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EnumBooleanBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBooleanBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumBooleanBody */ Boolean]
inline def isEnumBooleanBody(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.EnumBooleanBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBooleanBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumBooleanBody */ Boolean]

inline def isEnumBooleanMember(): /* is @babel/types.@babel/types.EnumBooleanMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBooleanMember")().asInstanceOf[/* is @babel/types.@babel/types.EnumBooleanMember */ Boolean]
inline def isEnumBooleanMember(node: js.Object): /* is @babel/types.@babel/types.EnumBooleanMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBooleanMember")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.EnumBooleanMember */ Boolean]
inline def isEnumBooleanMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EnumBooleanMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBooleanMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumBooleanMember */ Boolean]
inline def isEnumBooleanMember(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EnumBooleanMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBooleanMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumBooleanMember */ Boolean]
inline def isEnumBooleanMember(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.EnumBooleanMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumBooleanMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumBooleanMember */ Boolean]

inline def isEnumDeclaration(): /* is @babel/types.@babel/types.EnumDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.EnumDeclaration */ Boolean]
inline def isEnumDeclaration(node: js.Object): /* is @babel/types.@babel/types.EnumDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.EnumDeclaration */ Boolean]
inline def isEnumDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EnumDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumDeclaration */ Boolean]
inline def isEnumDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EnumDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumDeclaration */ Boolean]
inline def isEnumDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.EnumDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumDeclaration */ Boolean]

inline def isEnumDefaultedMember(): /* is @babel/types.@babel/types.EnumDefaultedMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumDefaultedMember")().asInstanceOf[/* is @babel/types.@babel/types.EnumDefaultedMember */ Boolean]
inline def isEnumDefaultedMember(node: js.Object): /* is @babel/types.@babel/types.EnumDefaultedMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumDefaultedMember")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.EnumDefaultedMember */ Boolean]
inline def isEnumDefaultedMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EnumDefaultedMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumDefaultedMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumDefaultedMember */ Boolean]
inline def isEnumDefaultedMember(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EnumDefaultedMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumDefaultedMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumDefaultedMember */ Boolean]
inline def isEnumDefaultedMember(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.EnumDefaultedMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumDefaultedMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumDefaultedMember */ Boolean]

inline def isEnumMember(): /* is @babel/types.@babel/types.EnumMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumMember")().asInstanceOf[/* is @babel/types.@babel/types.EnumMember */ Boolean]
inline def isEnumMember(node: js.Object): /* is @babel/types.@babel/types.EnumMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumMember")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.EnumMember */ Boolean]
inline def isEnumMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EnumMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumMember */ Boolean]
inline def isEnumMember(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EnumMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumMember */ Boolean]
inline def isEnumMember(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.EnumMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumMember */ Boolean]

inline def isEnumNumberBody(): /* is @babel/types.@babel/types.EnumNumberBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumNumberBody")().asInstanceOf[/* is @babel/types.@babel/types.EnumNumberBody */ Boolean]
inline def isEnumNumberBody(node: js.Object): /* is @babel/types.@babel/types.EnumNumberBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumNumberBody")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.EnumNumberBody */ Boolean]
inline def isEnumNumberBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EnumNumberBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumNumberBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumNumberBody */ Boolean]
inline def isEnumNumberBody(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EnumNumberBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumNumberBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumNumberBody */ Boolean]
inline def isEnumNumberBody(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.EnumNumberBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumNumberBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumNumberBody */ Boolean]

inline def isEnumNumberMember(): /* is @babel/types.@babel/types.EnumNumberMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumNumberMember")().asInstanceOf[/* is @babel/types.@babel/types.EnumNumberMember */ Boolean]
inline def isEnumNumberMember(node: js.Object): /* is @babel/types.@babel/types.EnumNumberMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumNumberMember")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.EnumNumberMember */ Boolean]
inline def isEnumNumberMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EnumNumberMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumNumberMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumNumberMember */ Boolean]
inline def isEnumNumberMember(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EnumNumberMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumNumberMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumNumberMember */ Boolean]
inline def isEnumNumberMember(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.EnumNumberMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumNumberMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumNumberMember */ Boolean]

inline def isEnumStringBody(): /* is @babel/types.@babel/types.EnumStringBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumStringBody")().asInstanceOf[/* is @babel/types.@babel/types.EnumStringBody */ Boolean]
inline def isEnumStringBody(node: js.Object): /* is @babel/types.@babel/types.EnumStringBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumStringBody")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.EnumStringBody */ Boolean]
inline def isEnumStringBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EnumStringBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumStringBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumStringBody */ Boolean]
inline def isEnumStringBody(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EnumStringBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumStringBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumStringBody */ Boolean]
inline def isEnumStringBody(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.EnumStringBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumStringBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumStringBody */ Boolean]

inline def isEnumStringMember(): /* is @babel/types.@babel/types.EnumStringMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumStringMember")().asInstanceOf[/* is @babel/types.@babel/types.EnumStringMember */ Boolean]
inline def isEnumStringMember(node: js.Object): /* is @babel/types.@babel/types.EnumStringMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumStringMember")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.EnumStringMember */ Boolean]
inline def isEnumStringMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EnumStringMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumStringMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumStringMember */ Boolean]
inline def isEnumStringMember(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EnumStringMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumStringMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumStringMember */ Boolean]
inline def isEnumStringMember(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.EnumStringMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumStringMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumStringMember */ Boolean]

inline def isEnumSymbolBody(): /* is @babel/types.@babel/types.EnumSymbolBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumSymbolBody")().asInstanceOf[/* is @babel/types.@babel/types.EnumSymbolBody */ Boolean]
inline def isEnumSymbolBody(node: js.Object): /* is @babel/types.@babel/types.EnumSymbolBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumSymbolBody")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.EnumSymbolBody */ Boolean]
inline def isEnumSymbolBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EnumSymbolBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumSymbolBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumSymbolBody */ Boolean]
inline def isEnumSymbolBody(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EnumSymbolBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumSymbolBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumSymbolBody */ Boolean]
inline def isEnumSymbolBody(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.EnumSymbolBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumSymbolBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.EnumSymbolBody */ Boolean]

inline def isExistsTypeAnnotation(): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExistsTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean]
inline def isExistsTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExistsTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean]
inline def isExistsTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExistsTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean]
inline def isExistsTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExistsTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean]
inline def isExistsTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExistsTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean]

inline def isExportAllDeclaration(): /* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportAllDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean]
inline def isExportAllDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportAllDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean]
inline def isExportAllDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportAllDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean]
inline def isExportAllDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportAllDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean]
inline def isExportAllDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportAllDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean]

inline def isExportDeclaration(): /* is @babel/types.@babel/types.ExportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.ExportDeclaration */ Boolean]
inline def isExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ExportDeclaration */ Boolean]
inline def isExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportDeclaration */ Boolean]
inline def isExportDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportDeclaration */ Boolean]
inline def isExportDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportDeclaration */ Boolean]

inline def isExportDefaultDeclaration(): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportDefaultDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean]
inline def isExportDefaultDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportDefaultDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean]
inline def isExportDefaultDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportDefaultDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean]
inline def isExportDefaultDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportDefaultDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean]
inline def isExportDefaultDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportDefaultDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean]

inline def isExportDefaultSpecifier(): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportDefaultSpecifier")().asInstanceOf[/* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean]
inline def isExportDefaultSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportDefaultSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean]
inline def isExportDefaultSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportDefaultSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean]
inline def isExportDefaultSpecifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportDefaultSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean]
inline def isExportDefaultSpecifier(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportDefaultSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean]

inline def isExportNamedDeclaration(): /* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportNamedDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean]
inline def isExportNamedDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportNamedDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean]
inline def isExportNamedDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportNamedDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean]
inline def isExportNamedDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportNamedDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean]
inline def isExportNamedDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportNamedDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean]

inline def isExportNamespaceSpecifier(): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportNamespaceSpecifier")().asInstanceOf[/* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean]
inline def isExportNamespaceSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportNamespaceSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean]
inline def isExportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportNamespaceSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean]
inline def isExportNamespaceSpecifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportNamespaceSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean]
inline def isExportNamespaceSpecifier(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportNamespaceSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean]

inline def isExportSpecifier(): /* is @babel/types.@babel/types.ExportSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportSpecifier")().asInstanceOf[/* is @babel/types.@babel/types.ExportSpecifier */ Boolean]
inline def isExportSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ExportSpecifier */ Boolean]
inline def isExportSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportSpecifier */ Boolean]
inline def isExportSpecifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportSpecifier */ Boolean]
inline def isExportSpecifier(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExportSpecifier */ Boolean]

inline def isExpression(): /* is @babel/types.@babel/types.Expression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpression")().asInstanceOf[/* is @babel/types.@babel/types.Expression */ Boolean]
inline def isExpression(node: js.Object): /* is @babel/types.@babel/types.Expression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Expression */ Boolean]
inline def isExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Expression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Expression */ Boolean]
inline def isExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Expression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Expression */ Boolean]
inline def isExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Expression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Expression */ Boolean]

inline def isExpressionStatement(): /* is @babel/types.@babel/types.ExpressionStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionStatement")().asInstanceOf[/* is @babel/types.@babel/types.ExpressionStatement */ Boolean]
inline def isExpressionStatement(node: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ExpressionStatement */ Boolean]
inline def isExpressionStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExpressionStatement */ Boolean]
inline def isExpressionStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExpressionStatement */ Boolean]
inline def isExpressionStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExpressionStatement */ Boolean]

inline def isExpressionWrapper(): /* is @babel/types.@babel/types.ExpressionWrapper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionWrapper")().asInstanceOf[/* is @babel/types.@babel/types.ExpressionWrapper */ Boolean]
inline def isExpressionWrapper(node: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionWrapper")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ExpressionWrapper */ Boolean]
inline def isExpressionWrapper(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionWrapper")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExpressionWrapper */ Boolean]
inline def isExpressionWrapper(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionWrapper")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExpressionWrapper */ Boolean]
inline def isExpressionWrapper(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionWrapper")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ExpressionWrapper */ Boolean]

inline def isFile(): /* is @babel/types.@babel/types.File */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")().asInstanceOf[/* is @babel/types.@babel/types.File */ Boolean]
inline def isFile(node: js.Object): /* is @babel/types.@babel/types.File */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.File */ Boolean]
inline def isFile(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.File */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.File */ Boolean]
inline def isFile(node: Null, opts: js.Object): /* is @babel/types.@babel/types.File */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.File */ Boolean]
inline def isFile(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.File */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.File */ Boolean]

inline def isFlow(): /* is @babel/types.@babel/types.Flow */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlow")().asInstanceOf[/* is @babel/types.@babel/types.Flow */ Boolean]
inline def isFlow(node: js.Object): /* is @babel/types.@babel/types.Flow */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlow")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Flow */ Boolean]
inline def isFlow(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Flow */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlow")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Flow */ Boolean]
inline def isFlow(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Flow */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlow")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Flow */ Boolean]
inline def isFlow(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Flow */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlow")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Flow */ Boolean]

inline def isFlowBaseAnnotation(): /* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowBaseAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean]
inline def isFlowBaseAnnotation(node: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowBaseAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean]
inline def isFlowBaseAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlowBaseAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean]
inline def isFlowBaseAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlowBaseAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean]
inline def isFlowBaseAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlowBaseAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean]

inline def isFlowDeclaration(): /* is @babel/types.@babel/types.FlowDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.FlowDeclaration */ Boolean]
inline def isFlowDeclaration(node: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.FlowDeclaration */ Boolean]
inline def isFlowDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlowDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FlowDeclaration */ Boolean]
inline def isFlowDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlowDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FlowDeclaration */ Boolean]
inline def isFlowDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlowDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FlowDeclaration */ Boolean]

inline def isFlowPredicate(): /* is @babel/types.@babel/types.FlowPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowPredicate")().asInstanceOf[/* is @babel/types.@babel/types.FlowPredicate */ Boolean]
inline def isFlowPredicate(node: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowPredicate")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.FlowPredicate */ Boolean]
inline def isFlowPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlowPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FlowPredicate */ Boolean]
inline def isFlowPredicate(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlowPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FlowPredicate */ Boolean]
inline def isFlowPredicate(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlowPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FlowPredicate */ Boolean]

inline def isFlowType(): /* is @babel/types.@babel/types.FlowType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowType")().asInstanceOf[/* is @babel/types.@babel/types.FlowType */ Boolean]
inline def isFlowType(node: js.Object): /* is @babel/types.@babel/types.FlowType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.FlowType */ Boolean]
inline def isFlowType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlowType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FlowType */ Boolean]
inline def isFlowType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FlowType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlowType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FlowType */ Boolean]
inline def isFlowType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.FlowType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlowType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FlowType */ Boolean]

inline def isFor(): /* is @babel/types.@babel/types.For */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFor")().asInstanceOf[/* is @babel/types.@babel/types.For */ Boolean]
inline def isFor(node: js.Object): /* is @babel/types.@babel/types.For */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFor")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.For */ Boolean]
inline def isFor(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.For */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFor")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.For */ Boolean]
inline def isFor(node: Null, opts: js.Object): /* is @babel/types.@babel/types.For */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFor")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.For */ Boolean]
inline def isFor(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.For */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFor")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.For */ Boolean]

inline def isForInStatement(): /* is @babel/types.@babel/types.ForInStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForInStatement")().asInstanceOf[/* is @babel/types.@babel/types.ForInStatement */ Boolean]
inline def isForInStatement(node: js.Object): /* is @babel/types.@babel/types.ForInStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForInStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ForInStatement */ Boolean]
inline def isForInStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForInStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isForInStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ForInStatement */ Boolean]
inline def isForInStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ForInStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isForInStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ForInStatement */ Boolean]
inline def isForInStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ForInStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isForInStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ForInStatement */ Boolean]

inline def isForOfStatement(): /* is @babel/types.@babel/types.ForOfStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForOfStatement")().asInstanceOf[/* is @babel/types.@babel/types.ForOfStatement */ Boolean]
inline def isForOfStatement(node: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForOfStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ForOfStatement */ Boolean]
inline def isForOfStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isForOfStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ForOfStatement */ Boolean]
inline def isForOfStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isForOfStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ForOfStatement */ Boolean]
inline def isForOfStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isForOfStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ForOfStatement */ Boolean]

inline def isForStatement(): /* is @babel/types.@babel/types.ForStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForStatement")().asInstanceOf[/* is @babel/types.@babel/types.ForStatement */ Boolean]
inline def isForStatement(node: js.Object): /* is @babel/types.@babel/types.ForStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ForStatement */ Boolean]
inline def isForStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isForStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ForStatement */ Boolean]
inline def isForStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ForStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isForStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ForStatement */ Boolean]
inline def isForStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ForStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isForStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ForStatement */ Boolean]

inline def isForXStatement(): /* is @babel/types.@babel/types.ForXStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForXStatement")().asInstanceOf[/* is @babel/types.@babel/types.ForXStatement */ Boolean]
inline def isForXStatement(node: js.Object): /* is @babel/types.@babel/types.ForXStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForXStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ForXStatement */ Boolean]
inline def isForXStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForXStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isForXStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ForXStatement */ Boolean]
inline def isForXStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ForXStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isForXStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ForXStatement */ Boolean]
inline def isForXStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ForXStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isForXStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ForXStatement */ Boolean]

inline def isFunction(): /* is @babel/types.@babel/types.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")().asInstanceOf[/* is @babel/types.@babel/types.Function */ Boolean]
inline def isFunction(node: js.Object): /* is @babel/types.@babel/types.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Function */ Boolean]
inline def isFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Function */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Function */ Boolean]
inline def isFunction(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Function */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Function */ Boolean]
inline def isFunction(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Function */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Function */ Boolean]

inline def isFunctionDeclaration(): /* is @babel/types.@babel/types.FunctionDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.FunctionDeclaration */ Boolean]
inline def isFunctionDeclaration(node: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.FunctionDeclaration */ Boolean]
inline def isFunctionDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionDeclaration */ Boolean]
inline def isFunctionDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionDeclaration */ Boolean]
inline def isFunctionDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionDeclaration */ Boolean]

inline def isFunctionExpression(): /* is @babel/types.@babel/types.FunctionExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionExpression")().asInstanceOf[/* is @babel/types.@babel/types.FunctionExpression */ Boolean]
inline def isFunctionExpression(node: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.FunctionExpression */ Boolean]
inline def isFunctionExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionExpression */ Boolean]
inline def isFunctionExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionExpression */ Boolean]
inline def isFunctionExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionExpression */ Boolean]

inline def isFunctionParent(): /* is @babel/types.@babel/types.FunctionParent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionParent")().asInstanceOf[/* is @babel/types.@babel/types.FunctionParent */ Boolean]
inline def isFunctionParent(node: js.Object): /* is @babel/types.@babel/types.FunctionParent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionParent")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.FunctionParent */ Boolean]
inline def isFunctionParent(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionParent */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionParent")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionParent */ Boolean]
inline def isFunctionParent(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionParent */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionParent")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionParent */ Boolean]
inline def isFunctionParent(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.FunctionParent */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionParent")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionParent */ Boolean]

inline def isFunctionTypeAnnotation(): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean]
inline def isFunctionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean]
inline def isFunctionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean]
inline def isFunctionTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean]
inline def isFunctionTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean]

inline def isFunctionTypeParam(): /* is @babel/types.@babel/types.FunctionTypeParam */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionTypeParam")().asInstanceOf[/* is @babel/types.@babel/types.FunctionTypeParam */ Boolean]
inline def isFunctionTypeParam(node: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionTypeParam")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.FunctionTypeParam */ Boolean]
inline def isFunctionTypeParam(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionTypeParam")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionTypeParam */ Boolean]
inline def isFunctionTypeParam(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionTypeParam")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionTypeParam */ Boolean]
inline def isFunctionTypeParam(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionTypeParam")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.FunctionTypeParam */ Boolean]

inline def isGenericTypeAnnotation(): /* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGenericTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean]
inline def isGenericTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGenericTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean]
inline def isGenericTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isGenericTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean]
inline def isGenericTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isGenericTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean]
inline def isGenericTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isGenericTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean]

inline def isIdentifier(): /* is @babel/types.@babel/types.Identifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifier")().asInstanceOf[/* is @babel/types.@babel/types.Identifier */ Boolean]
inline def isIdentifier(node: js.Object): /* is @babel/types.@babel/types.Identifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Identifier */ Boolean]
inline def isIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Identifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Identifier */ Boolean]
inline def isIdentifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Identifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Identifier */ Boolean]
inline def isIdentifier(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Identifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Identifier */ Boolean]

inline def isIfStatement(): /* is @babel/types.@babel/types.IfStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIfStatement")().asInstanceOf[/* is @babel/types.@babel/types.IfStatement */ Boolean]
inline def isIfStatement(node: js.Object): /* is @babel/types.@babel/types.IfStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIfStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.IfStatement */ Boolean]
inline def isIfStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.IfStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIfStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.IfStatement */ Boolean]
inline def isIfStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.IfStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIfStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.IfStatement */ Boolean]
inline def isIfStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.IfStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIfStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.IfStatement */ Boolean]

inline def isImmutable(): /* is @babel/types.@babel/types.Immutable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImmutable")().asInstanceOf[/* is @babel/types.@babel/types.Immutable */ Boolean]
inline def isImmutable(node: js.Object): /* is @babel/types.@babel/types.Immutable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImmutable")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Immutable */ Boolean]
inline def isImmutable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Immutable */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImmutable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Immutable */ Boolean]
inline def isImmutable(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Immutable */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImmutable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Immutable */ Boolean]
inline def isImmutable(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Immutable */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImmutable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Immutable */ Boolean]
inline def isImmutable(node: Node): /* is @babel/types.@babel/types.Immutable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImmutable")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Immutable */ Boolean]

inline def isImport(): /* is @babel/types.@babel/types.Import */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImport")().asInstanceOf[/* is @babel/types.@babel/types.Import */ Boolean]
inline def isImport(node: js.Object): /* is @babel/types.@babel/types.Import */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImport")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Import */ Boolean]
inline def isImport(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Import */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImport")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Import */ Boolean]
inline def isImport(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Import */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImport")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Import */ Boolean]
inline def isImport(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Import */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImport")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Import */ Boolean]

inline def isImportAttribute(): /* is @babel/types.@babel/types.ImportAttribute */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportAttribute")().asInstanceOf[/* is @babel/types.@babel/types.ImportAttribute */ Boolean]
inline def isImportAttribute(node: js.Object): /* is @babel/types.@babel/types.ImportAttribute */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportAttribute")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ImportAttribute */ Boolean]
inline def isImportAttribute(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportAttribute */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportAttribute */ Boolean]
inline def isImportAttribute(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ImportAttribute */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportAttribute */ Boolean]
inline def isImportAttribute(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ImportAttribute */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportAttribute */ Boolean]

inline def isImportDeclaration(): /* is @babel/types.@babel/types.ImportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.ImportDeclaration */ Boolean]
inline def isImportDeclaration(node: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ImportDeclaration */ Boolean]
inline def isImportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportDeclaration */ Boolean]
inline def isImportDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportDeclaration */ Boolean]
inline def isImportDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportDeclaration */ Boolean]

inline def isImportDefaultSpecifier(): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportDefaultSpecifier")().asInstanceOf[/* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean]
inline def isImportDefaultSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportDefaultSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean]
inline def isImportDefaultSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportDefaultSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean]
inline def isImportDefaultSpecifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportDefaultSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean]
inline def isImportDefaultSpecifier(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportDefaultSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean]

inline def isImportNamespaceSpecifier(): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportNamespaceSpecifier")().asInstanceOf[/* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean]
inline def isImportNamespaceSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportNamespaceSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean]
inline def isImportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportNamespaceSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean]
inline def isImportNamespaceSpecifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportNamespaceSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean]
inline def isImportNamespaceSpecifier(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportNamespaceSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean]

inline def isImportOrExportDeclaration(): /* is @babel/types.@babel/types.ImportOrExportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportOrExportDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.ImportOrExportDeclaration */ Boolean]
inline def isImportOrExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.ImportOrExportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportOrExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ImportOrExportDeclaration */ Boolean]
inline def isImportOrExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportOrExportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportOrExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportOrExportDeclaration */ Boolean]
inline def isImportOrExportDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ImportOrExportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportOrExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportOrExportDeclaration */ Boolean]
inline def isImportOrExportDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ImportOrExportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportOrExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportOrExportDeclaration */ Boolean]

inline def isImportSpecifier(): /* is @babel/types.@babel/types.ImportSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportSpecifier")().asInstanceOf[/* is @babel/types.@babel/types.ImportSpecifier */ Boolean]
inline def isImportSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ImportSpecifier */ Boolean]
inline def isImportSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportSpecifier */ Boolean]
inline def isImportSpecifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportSpecifier */ Boolean]
inline def isImportSpecifier(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isImportSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ImportSpecifier */ Boolean]

inline def isIndexedAccessType(): /* is @babel/types.@babel/types.IndexedAccessType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedAccessType")().asInstanceOf[/* is @babel/types.@babel/types.IndexedAccessType */ Boolean]
inline def isIndexedAccessType(node: js.Object): /* is @babel/types.@babel/types.IndexedAccessType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedAccessType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.IndexedAccessType */ Boolean]
inline def isIndexedAccessType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.IndexedAccessType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.IndexedAccessType */ Boolean]
inline def isIndexedAccessType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.IndexedAccessType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.IndexedAccessType */ Boolean]
inline def isIndexedAccessType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.IndexedAccessType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.IndexedAccessType */ Boolean]

inline def isInferredPredicate(): /* is @babel/types.@babel/types.InferredPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInferredPredicate")().asInstanceOf[/* is @babel/types.@babel/types.InferredPredicate */ Boolean]
inline def isInferredPredicate(node: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInferredPredicate")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.InferredPredicate */ Boolean]
inline def isInferredPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInferredPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InferredPredicate */ Boolean]
inline def isInferredPredicate(node: Null, opts: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInferredPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InferredPredicate */ Boolean]
inline def isInferredPredicate(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInferredPredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InferredPredicate */ Boolean]

inline def isInterfaceDeclaration(): /* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean]
inline def isInterfaceDeclaration(node: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean]
inline def isInterfaceDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean]
inline def isInterfaceDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean]
inline def isInterfaceDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean]

inline def isInterfaceExtends(): /* is @babel/types.@babel/types.InterfaceExtends */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceExtends")().asInstanceOf[/* is @babel/types.@babel/types.InterfaceExtends */ Boolean]
inline def isInterfaceExtends(node: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceExtends")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.InterfaceExtends */ Boolean]
inline def isInterfaceExtends(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceExtends")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InterfaceExtends */ Boolean]
inline def isInterfaceExtends(node: Null, opts: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceExtends")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InterfaceExtends */ Boolean]
inline def isInterfaceExtends(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceExtends")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InterfaceExtends */ Boolean]

inline def isInterfaceTypeAnnotation(): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean]
inline def isInterfaceTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean]
inline def isInterfaceTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean]
inline def isInterfaceTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean]
inline def isInterfaceTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean]

inline def isInterpreterDirective(): /* is @babel/types.@babel/types.InterpreterDirective */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterpreterDirective")().asInstanceOf[/* is @babel/types.@babel/types.InterpreterDirective */ Boolean]
inline def isInterpreterDirective(node: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterpreterDirective")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.InterpreterDirective */ Boolean]
inline def isInterpreterDirective(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInterpreterDirective")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InterpreterDirective */ Boolean]
inline def isInterpreterDirective(node: Null, opts: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInterpreterDirective")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InterpreterDirective */ Boolean]
inline def isInterpreterDirective(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInterpreterDirective")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.InterpreterDirective */ Boolean]

inline def isIntersectionTypeAnnotation(): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntersectionTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean]
inline def isIntersectionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntersectionTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean]
inline def isIntersectionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntersectionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean]
inline def isIntersectionTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntersectionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean]
inline def isIntersectionTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntersectionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean]

inline def isJSX(): /* is @babel/types.@babel/types.JSX */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSX")().asInstanceOf[/* is @babel/types.@babel/types.JSX */ Boolean]
inline def isJSX(node: js.Object): /* is @babel/types.@babel/types.JSX */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSX")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSX */ Boolean]
inline def isJSX(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSX */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSX")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSX */ Boolean]
inline def isJSX(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSX */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSX")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSX */ Boolean]
inline def isJSX(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSX */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSX")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSX */ Boolean]

inline def isJSXAttribute(): /* is @babel/types.@babel/types.JSXAttribute */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXAttribute")().asInstanceOf[/* is @babel/types.@babel/types.JSXAttribute */ Boolean]
inline def isJSXAttribute(node: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXAttribute")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXAttribute */ Boolean]
inline def isJSXAttribute(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXAttribute */ Boolean]
inline def isJSXAttribute(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXAttribute */ Boolean]
inline def isJSXAttribute(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXAttribute */ Boolean]

inline def isJSXClosingElement(): /* is @babel/types.@babel/types.JSXClosingElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXClosingElement")().asInstanceOf[/* is @babel/types.@babel/types.JSXClosingElement */ Boolean]
inline def isJSXClosingElement(node: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXClosingElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXClosingElement */ Boolean]
inline def isJSXClosingElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXClosingElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXClosingElement */ Boolean]
inline def isJSXClosingElement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXClosingElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXClosingElement */ Boolean]
inline def isJSXClosingElement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXClosingElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXClosingElement */ Boolean]

inline def isJSXClosingFragment(): /* is @babel/types.@babel/types.JSXClosingFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXClosingFragment")().asInstanceOf[/* is @babel/types.@babel/types.JSXClosingFragment */ Boolean]
inline def isJSXClosingFragment(node: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXClosingFragment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXClosingFragment */ Boolean]
inline def isJSXClosingFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXClosingFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXClosingFragment */ Boolean]
inline def isJSXClosingFragment(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXClosingFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXClosingFragment */ Boolean]
inline def isJSXClosingFragment(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXClosingFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXClosingFragment */ Boolean]

inline def isJSXElement(): /* is @babel/types.@babel/types.JSXElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXElement")().asInstanceOf[/* is @babel/types.@babel/types.JSXElement */ Boolean]
inline def isJSXElement(node: js.Object): /* is @babel/types.@babel/types.JSXElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXElement */ Boolean]
inline def isJSXElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXElement */ Boolean]
inline def isJSXElement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXElement */ Boolean]
inline def isJSXElement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXElement */ Boolean]

inline def isJSXEmptyExpression(): /* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXEmptyExpression")().asInstanceOf[/* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean]
inline def isJSXEmptyExpression(node: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXEmptyExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean]
inline def isJSXEmptyExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXEmptyExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean]
inline def isJSXEmptyExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXEmptyExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean]
inline def isJSXEmptyExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXEmptyExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean]

inline def isJSXExpressionContainer(): /* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXExpressionContainer")().asInstanceOf[/* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean]
inline def isJSXExpressionContainer(node: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXExpressionContainer")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean]
inline def isJSXExpressionContainer(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXExpressionContainer")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean]
inline def isJSXExpressionContainer(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXExpressionContainer")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean]
inline def isJSXExpressionContainer(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXExpressionContainer")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean]

inline def isJSXFragment(): /* is @babel/types.@babel/types.JSXFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXFragment")().asInstanceOf[/* is @babel/types.@babel/types.JSXFragment */ Boolean]
inline def isJSXFragment(node: js.Object): /* is @babel/types.@babel/types.JSXFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXFragment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXFragment */ Boolean]
inline def isJSXFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXFragment */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXFragment */ Boolean]
inline def isJSXFragment(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXFragment */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXFragment */ Boolean]
inline def isJSXFragment(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXFragment */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXFragment */ Boolean]

inline def isJSXIdentifier(): /* is @babel/types.@babel/types.JSXIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXIdentifier")().asInstanceOf[/* is @babel/types.@babel/types.JSXIdentifier */ Boolean]
inline def isJSXIdentifier(node: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXIdentifier */ Boolean]
inline def isJSXIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXIdentifier */ Boolean]
inline def isJSXIdentifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXIdentifier */ Boolean]
inline def isJSXIdentifier(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXIdentifier */ Boolean]

inline def isJSXMemberExpression(): /* is @babel/types.@babel/types.JSXMemberExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXMemberExpression")().asInstanceOf[/* is @babel/types.@babel/types.JSXMemberExpression */ Boolean]
inline def isJSXMemberExpression(node: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXMemberExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXMemberExpression */ Boolean]
inline def isJSXMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXMemberExpression */ Boolean]
inline def isJSXMemberExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXMemberExpression */ Boolean]
inline def isJSXMemberExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXMemberExpression */ Boolean]

inline def isJSXNamespacedName(): /* is @babel/types.@babel/types.JSXNamespacedName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXNamespacedName")().asInstanceOf[/* is @babel/types.@babel/types.JSXNamespacedName */ Boolean]
inline def isJSXNamespacedName(node: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXNamespacedName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXNamespacedName */ Boolean]
inline def isJSXNamespacedName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXNamespacedName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXNamespacedName */ Boolean]
inline def isJSXNamespacedName(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXNamespacedName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXNamespacedName */ Boolean]
inline def isJSXNamespacedName(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXNamespacedName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXNamespacedName */ Boolean]

inline def isJSXOpeningElement(): /* is @babel/types.@babel/types.JSXOpeningElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXOpeningElement")().asInstanceOf[/* is @babel/types.@babel/types.JSXOpeningElement */ Boolean]
inline def isJSXOpeningElement(node: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXOpeningElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXOpeningElement */ Boolean]
inline def isJSXOpeningElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXOpeningElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXOpeningElement */ Boolean]
inline def isJSXOpeningElement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXOpeningElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXOpeningElement */ Boolean]
inline def isJSXOpeningElement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXOpeningElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXOpeningElement */ Boolean]

inline def isJSXOpeningFragment(): /* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXOpeningFragment")().asInstanceOf[/* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean]
inline def isJSXOpeningFragment(node: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXOpeningFragment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean]
inline def isJSXOpeningFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXOpeningFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean]
inline def isJSXOpeningFragment(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXOpeningFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean]
inline def isJSXOpeningFragment(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXOpeningFragment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean]

inline def isJSXSpreadAttribute(): /* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXSpreadAttribute")().asInstanceOf[/* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean]
inline def isJSXSpreadAttribute(node: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXSpreadAttribute")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean]
inline def isJSXSpreadAttribute(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXSpreadAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean]
inline def isJSXSpreadAttribute(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXSpreadAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean]
inline def isJSXSpreadAttribute(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXSpreadAttribute")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean]

inline def isJSXSpreadChild(): /* is @babel/types.@babel/types.JSXSpreadChild */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXSpreadChild")().asInstanceOf[/* is @babel/types.@babel/types.JSXSpreadChild */ Boolean]
inline def isJSXSpreadChild(node: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXSpreadChild")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXSpreadChild */ Boolean]
inline def isJSXSpreadChild(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXSpreadChild")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXSpreadChild */ Boolean]
inline def isJSXSpreadChild(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXSpreadChild")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXSpreadChild */ Boolean]
inline def isJSXSpreadChild(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXSpreadChild")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXSpreadChild */ Boolean]

inline def isJSXText(): /* is @babel/types.@babel/types.JSXText */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXText")().asInstanceOf[/* is @babel/types.@babel/types.JSXText */ Boolean]
inline def isJSXText(node: js.Object): /* is @babel/types.@babel/types.JSXText */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSXText")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.JSXText */ Boolean]
inline def isJSXText(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXText */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXText")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXText */ Boolean]
inline def isJSXText(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXText */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXText")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXText */ Boolean]
inline def isJSXText(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.JSXText */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isJSXText")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.JSXText */ Boolean]

inline def isLVal(): /* is @babel/types.@babel/types.LVal */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLVal")().asInstanceOf[/* is @babel/types.@babel/types.LVal */ Boolean]
inline def isLVal(node: js.Object): /* is @babel/types.@babel/types.LVal */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLVal")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.LVal */ Boolean]
inline def isLVal(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LVal */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLVal")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.LVal */ Boolean]
inline def isLVal(node: Null, opts: js.Object): /* is @babel/types.@babel/types.LVal */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLVal")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.LVal */ Boolean]
inline def isLVal(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.LVal */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLVal")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.LVal */ Boolean]

inline def isLabeledStatement(): /* is @babel/types.@babel/types.LabeledStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLabeledStatement")().asInstanceOf[/* is @babel/types.@babel/types.LabeledStatement */ Boolean]
inline def isLabeledStatement(node: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLabeledStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.LabeledStatement */ Boolean]
inline def isLabeledStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLabeledStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.LabeledStatement */ Boolean]
inline def isLabeledStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLabeledStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.LabeledStatement */ Boolean]
inline def isLabeledStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLabeledStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.LabeledStatement */ Boolean]

inline def isLet(node: Node): /* is @babel/types.@babel/types.VariableDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLet")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.VariableDeclaration */ Boolean]

inline def isLiteral(): /* is @babel/types.@babel/types.Literal */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteral")().asInstanceOf[/* is @babel/types.@babel/types.Literal */ Boolean]
inline def isLiteral(node: js.Object): /* is @babel/types.@babel/types.Literal */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Literal */ Boolean]
inline def isLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Literal */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Literal */ Boolean]
inline def isLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Literal */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Literal */ Boolean]
inline def isLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Literal */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Literal */ Boolean]

inline def isLogicalExpression(): /* is @babel/types.@babel/types.LogicalExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLogicalExpression")().asInstanceOf[/* is @babel/types.@babel/types.LogicalExpression */ Boolean]
inline def isLogicalExpression(node: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLogicalExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.LogicalExpression */ Boolean]
inline def isLogicalExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLogicalExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.LogicalExpression */ Boolean]
inline def isLogicalExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLogicalExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.LogicalExpression */ Boolean]
inline def isLogicalExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLogicalExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.LogicalExpression */ Boolean]

inline def isLoop(): /* is @babel/types.@babel/types.Loop */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoop")().asInstanceOf[/* is @babel/types.@babel/types.Loop */ Boolean]
inline def isLoop(node: js.Object): /* is @babel/types.@babel/types.Loop */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoop")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Loop */ Boolean]
inline def isLoop(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Loop */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLoop")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Loop */ Boolean]
inline def isLoop(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Loop */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLoop")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Loop */ Boolean]
inline def isLoop(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Loop */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLoop")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Loop */ Boolean]

inline def isMemberExpression(): /* is @babel/types.@babel/types.MemberExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMemberExpression")().asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def isMemberExpression(node: js.Object): /* is @babel/types.@babel/types.MemberExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMemberExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def isMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def isMemberExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def isMemberExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]

inline def isMetaProperty(): /* is @babel/types.@babel/types.MetaProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMetaProperty")().asInstanceOf[/* is @babel/types.@babel/types.MetaProperty */ Boolean]
inline def isMetaProperty(node: js.Object): /* is @babel/types.@babel/types.MetaProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMetaProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.MetaProperty */ Boolean]
inline def isMetaProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MetaProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMetaProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MetaProperty */ Boolean]
inline def isMetaProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.MetaProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMetaProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MetaProperty */ Boolean]
inline def isMetaProperty(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.MetaProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMetaProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MetaProperty */ Boolean]

inline def isMethod(): /* is @babel/types.@babel/types.Method */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMethod")().asInstanceOf[/* is @babel/types.@babel/types.Method */ Boolean]
inline def isMethod(node: js.Object): /* is @babel/types.@babel/types.Method */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMethod")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Method */ Boolean]
inline def isMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Method */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Method */ Boolean]
inline def isMethod(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Method */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Method */ Boolean]
inline def isMethod(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Method */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Method */ Boolean]

inline def isMiscellaneous(): /* is @babel/types.@babel/types.Miscellaneous */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMiscellaneous")().asInstanceOf[/* is @babel/types.@babel/types.Miscellaneous */ Boolean]
inline def isMiscellaneous(node: js.Object): /* is @babel/types.@babel/types.Miscellaneous */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMiscellaneous")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Miscellaneous */ Boolean]
inline def isMiscellaneous(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Miscellaneous */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMiscellaneous")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Miscellaneous */ Boolean]
inline def isMiscellaneous(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Miscellaneous */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMiscellaneous")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Miscellaneous */ Boolean]
inline def isMiscellaneous(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Miscellaneous */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMiscellaneous")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Miscellaneous */ Boolean]

inline def isMixedTypeAnnotation(): /* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMixedTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean]
inline def isMixedTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMixedTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean]
inline def isMixedTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMixedTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean]
inline def isMixedTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMixedTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean]
inline def isMixedTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMixedTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean]

inline def isModuleDeclaration(): /* is @babel/types.@babel/types.ModuleDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.ModuleDeclaration */ Boolean]
inline def isModuleDeclaration(node: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ModuleDeclaration */ Boolean]
inline def isModuleDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModuleDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ModuleDeclaration */ Boolean]
inline def isModuleDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModuleDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ModuleDeclaration */ Boolean]
inline def isModuleDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModuleDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ModuleDeclaration */ Boolean]

inline def isModuleExpression(): /* is @babel/types.@babel/types.ModuleExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleExpression")().asInstanceOf[/* is @babel/types.@babel/types.ModuleExpression */ Boolean]
inline def isModuleExpression(node: js.Object): /* is @babel/types.@babel/types.ModuleExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ModuleExpression */ Boolean]
inline def isModuleExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ModuleExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModuleExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ModuleExpression */ Boolean]
inline def isModuleExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ModuleExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModuleExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ModuleExpression */ Boolean]
inline def isModuleExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ModuleExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModuleExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ModuleExpression */ Boolean]

inline def isModuleSpecifier(): /* is @babel/types.@babel/types.ModuleSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleSpecifier")().asInstanceOf[/* is @babel/types.@babel/types.ModuleSpecifier */ Boolean]
inline def isModuleSpecifier(node: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ModuleSpecifier */ Boolean]
inline def isModuleSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModuleSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ModuleSpecifier */ Boolean]
inline def isModuleSpecifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModuleSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ModuleSpecifier */ Boolean]
inline def isModuleSpecifier(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModuleSpecifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ModuleSpecifier */ Boolean]

inline def isNewExpression(): /* is @babel/types.@babel/types.NewExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewExpression")().asInstanceOf[/* is @babel/types.@babel/types.NewExpression */ Boolean]
inline def isNewExpression(node: js.Object): /* is @babel/types.@babel/types.NewExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.NewExpression */ Boolean]
inline def isNewExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NewExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNewExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NewExpression */ Boolean]
inline def isNewExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NewExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNewExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NewExpression */ Boolean]
inline def isNewExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.NewExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNewExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NewExpression */ Boolean]

inline def isNode(): /* is @babel/types.@babel/types.Node */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")().asInstanceOf[/* is @babel/types.@babel/types.Node */ Boolean]
inline def isNode(node: js.Object): /* is @babel/types.@babel/types.Node */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Node */ Boolean]

inline def isNodesEquivalent(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNodesEquivalent")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isNodesEquivalent_T[T /* <: Partial[Node] */](a: T, b: Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNodesEquivalent")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]

inline def isNoop(): /* is @babel/types.@babel/types.Noop */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNoop")().asInstanceOf[/* is @babel/types.@babel/types.Noop */ Boolean]
inline def isNoop(node: js.Object): /* is @babel/types.@babel/types.Noop */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNoop")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Noop */ Boolean]
inline def isNoop(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Noop */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNoop")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Noop */ Boolean]
inline def isNoop(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Noop */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNoop")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Noop */ Boolean]
inline def isNoop(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Noop */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNoop")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Noop */ Boolean]

inline def isNullLiteral(): /* is @babel/types.@babel/types.NullLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullLiteral")().asInstanceOf[/* is @babel/types.@babel/types.NullLiteral */ Boolean]
inline def isNullLiteral(node: js.Object): /* is @babel/types.@babel/types.NullLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.NullLiteral */ Boolean]
inline def isNullLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNullLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NullLiteral */ Boolean]
inline def isNullLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NullLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNullLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NullLiteral */ Boolean]
inline def isNullLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.NullLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNullLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NullLiteral */ Boolean]

inline def isNullLiteralTypeAnnotation(): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullLiteralTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean]
inline def isNullLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullLiteralTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean]
inline def isNullLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNullLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean]
inline def isNullLiteralTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNullLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean]
inline def isNullLiteralTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNullLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean]

inline def isNullableTypeAnnotation(): /* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullableTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean]
inline def isNullableTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullableTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean]
inline def isNullableTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNullableTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean]
inline def isNullableTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNullableTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean]
inline def isNullableTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNullableTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean]

inline def isNumberLiteral(): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberLiteral")().asInstanceOf[/* is @babel/types.@babel/types.NumericLiteral */ Boolean]
inline def isNumberLiteral(node: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.NumericLiteral */ Boolean]
inline def isNumberLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NumericLiteral */ Boolean]
inline def isNumberLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NumericLiteral */ Boolean]
inline def isNumberLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NumericLiteral */ Boolean]

inline def isNumberLiteralTypeAnnotation(): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberLiteralTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean]
inline def isNumberLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberLiteralTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean]
inline def isNumberLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean]
inline def isNumberLiteralTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean]
inline def isNumberLiteralTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean]

inline def isNumberTypeAnnotation(): /* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean]
inline def isNumberTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean]
inline def isNumberTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean]
inline def isNumberTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean]
inline def isNumberTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean]

inline def isNumericLiteral(): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericLiteral")().asInstanceOf[/* is @babel/types.@babel/types.NumericLiteral */ Boolean]
inline def isNumericLiteral(node: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.NumericLiteral */ Boolean]
inline def isNumericLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumericLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NumericLiteral */ Boolean]
inline def isNumericLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumericLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NumericLiteral */ Boolean]
inline def isNumericLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumericLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.NumericLiteral */ Boolean]

inline def isObjectExpression(): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectExpression")().asInstanceOf[/* is @babel/types.@babel/types.ObjectExpression */ Boolean]
inline def isObjectExpression(node: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ObjectExpression */ Boolean]
inline def isObjectExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectExpression */ Boolean]
inline def isObjectExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectExpression */ Boolean]
inline def isObjectExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectExpression */ Boolean]

inline def isObjectMember(): /* is @babel/types.@babel/types.ObjectMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectMember")().asInstanceOf[/* is @babel/types.@babel/types.ObjectMember */ Boolean]
inline def isObjectMember(node: js.Object): /* is @babel/types.@babel/types.ObjectMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectMember")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ObjectMember */ Boolean]
inline def isObjectMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectMember */ Boolean]
inline def isObjectMember(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectMember */ Boolean]
inline def isObjectMember(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ObjectMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectMember */ Boolean]

inline def isObjectMethod(): /* is @babel/types.@babel/types.ObjectMethod */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectMethod")().asInstanceOf[/* is @babel/types.@babel/types.ObjectMethod */ Boolean]
inline def isObjectMethod(node: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectMethod")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ObjectMethod */ Boolean]
inline def isObjectMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectMethod */ Boolean]
inline def isObjectMethod(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectMethod */ Boolean]
inline def isObjectMethod(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectMethod */ Boolean]

inline def isObjectPattern(): /* is @babel/types.@babel/types.ObjectPattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectPattern")().asInstanceOf[/* is @babel/types.@babel/types.ObjectPattern */ Boolean]
inline def isObjectPattern(node: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectPattern")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ObjectPattern */ Boolean]
inline def isObjectPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectPattern */ Boolean]
inline def isObjectPattern(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectPattern */ Boolean]
inline def isObjectPattern(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectPattern */ Boolean]

inline def isObjectProperty(): /* is @babel/types.@babel/types.ObjectProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectProperty")().asInstanceOf[/* is @babel/types.@babel/types.ObjectProperty */ Boolean]
inline def isObjectProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ObjectProperty */ Boolean]
inline def isObjectProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectProperty */ Boolean]
inline def isObjectProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectProperty */ Boolean]
inline def isObjectProperty(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectProperty */ Boolean]

inline def isObjectTypeAnnotation(): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean]
inline def isObjectTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean]
inline def isObjectTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean]
inline def isObjectTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean]
inline def isObjectTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean]

inline def isObjectTypeCallProperty(): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeCallProperty")().asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean]
inline def isObjectTypeCallProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeCallProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean]
inline def isObjectTypeCallProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeCallProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean]
inline def isObjectTypeCallProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeCallProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean]
inline def isObjectTypeCallProperty(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeCallProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean]

inline def isObjectTypeIndexer(): /* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeIndexer")().asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean]
inline def isObjectTypeIndexer(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeIndexer")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean]
inline def isObjectTypeIndexer(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeIndexer")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean]
inline def isObjectTypeIndexer(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeIndexer")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean]
inline def isObjectTypeIndexer(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeIndexer")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean]

inline def isObjectTypeInternalSlot(): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeInternalSlot")().asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean]
inline def isObjectTypeInternalSlot(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeInternalSlot")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean]
inline def isObjectTypeInternalSlot(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeInternalSlot")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean]
inline def isObjectTypeInternalSlot(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeInternalSlot")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean]
inline def isObjectTypeInternalSlot(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeInternalSlot")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean]

inline def isObjectTypeProperty(): /* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeProperty")().asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean]
inline def isObjectTypeProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean]
inline def isObjectTypeProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean]
inline def isObjectTypeProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean]
inline def isObjectTypeProperty(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean]

inline def isObjectTypeSpreadProperty(): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeSpreadProperty")().asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean]
inline def isObjectTypeSpreadProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeSpreadProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean]
inline def isObjectTypeSpreadProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeSpreadProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean]
inline def isObjectTypeSpreadProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeSpreadProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean]
inline def isObjectTypeSpreadProperty(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectTypeSpreadProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean]

inline def isOpaqueType(): /* is @babel/types.@babel/types.OpaqueType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpaqueType")().asInstanceOf[/* is @babel/types.@babel/types.OpaqueType */ Boolean]
inline def isOpaqueType(node: js.Object): /* is @babel/types.@babel/types.OpaqueType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpaqueType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.OpaqueType */ Boolean]
inline def isOpaqueType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OpaqueType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOpaqueType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.OpaqueType */ Boolean]
inline def isOpaqueType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.OpaqueType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOpaqueType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.OpaqueType */ Boolean]
inline def isOpaqueType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.OpaqueType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOpaqueType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.OpaqueType */ Boolean]

inline def isOptionalCallExpression(): /* is @babel/types.@babel/types.OptionalCallExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalCallExpression")().asInstanceOf[/* is @babel/types.@babel/types.OptionalCallExpression */ Boolean]
inline def isOptionalCallExpression(node: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalCallExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.OptionalCallExpression */ Boolean]
inline def isOptionalCallExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalCallExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.OptionalCallExpression */ Boolean]
inline def isOptionalCallExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalCallExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.OptionalCallExpression */ Boolean]
inline def isOptionalCallExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalCallExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.OptionalCallExpression */ Boolean]

inline def isOptionalIndexedAccessType(): /* is @babel/types.@babel/types.OptionalIndexedAccessType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalIndexedAccessType")().asInstanceOf[/* is @babel/types.@babel/types.OptionalIndexedAccessType */ Boolean]
inline def isOptionalIndexedAccessType(node: js.Object): /* is @babel/types.@babel/types.OptionalIndexedAccessType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalIndexedAccessType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.OptionalIndexedAccessType */ Boolean]
inline def isOptionalIndexedAccessType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OptionalIndexedAccessType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.OptionalIndexedAccessType */ Boolean]
inline def isOptionalIndexedAccessType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.OptionalIndexedAccessType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.OptionalIndexedAccessType */ Boolean]
inline def isOptionalIndexedAccessType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.OptionalIndexedAccessType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.OptionalIndexedAccessType */ Boolean]

inline def isOptionalMemberExpression(): /* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalMemberExpression")().asInstanceOf[/* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean]
inline def isOptionalMemberExpression(node: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalMemberExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean]
inline def isOptionalMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean]
inline def isOptionalMemberExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean]
inline def isOptionalMemberExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalMemberExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean]

inline def isParenthesizedExpression(): /* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParenthesizedExpression")().asInstanceOf[/* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean]
inline def isParenthesizedExpression(node: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParenthesizedExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean]
inline def isParenthesizedExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isParenthesizedExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean]
inline def isParenthesizedExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isParenthesizedExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean]
inline def isParenthesizedExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isParenthesizedExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean]

inline def isPattern(): /* is @babel/types.@babel/types.Pattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPattern")().asInstanceOf[/* is @babel/types.@babel/types.Pattern */ Boolean]
inline def isPattern(node: js.Object): /* is @babel/types.@babel/types.Pattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPattern")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Pattern */ Boolean]
inline def isPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Pattern */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Pattern */ Boolean]
inline def isPattern(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Pattern */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Pattern */ Boolean]
inline def isPattern(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Pattern */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPattern")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Pattern */ Boolean]

inline def isPatternLike(): /* is @babel/types.@babel/types.PatternLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPatternLike")().asInstanceOf[/* is @babel/types.@babel/types.PatternLike */ Boolean]
inline def isPatternLike(node: js.Object): /* is @babel/types.@babel/types.PatternLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPatternLike")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.PatternLike */ Boolean]
inline def isPatternLike(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PatternLike */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPatternLike")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PatternLike */ Boolean]
inline def isPatternLike(node: Null, opts: js.Object): /* is @babel/types.@babel/types.PatternLike */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPatternLike")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PatternLike */ Boolean]
inline def isPatternLike(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.PatternLike */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPatternLike")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PatternLike */ Boolean]

inline def isPipelineBareFunction(): /* is @babel/types.@babel/types.PipelineBareFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPipelineBareFunction")().asInstanceOf[/* is @babel/types.@babel/types.PipelineBareFunction */ Boolean]
inline def isPipelineBareFunction(node: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPipelineBareFunction")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.PipelineBareFunction */ Boolean]
inline def isPipelineBareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPipelineBareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PipelineBareFunction */ Boolean]
inline def isPipelineBareFunction(node: Null, opts: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPipelineBareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PipelineBareFunction */ Boolean]
inline def isPipelineBareFunction(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPipelineBareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PipelineBareFunction */ Boolean]

inline def isPipelinePrimaryTopicReference(): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPipelinePrimaryTopicReference")().asInstanceOf[/* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean]
inline def isPipelinePrimaryTopicReference(node: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPipelinePrimaryTopicReference")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean]
inline def isPipelinePrimaryTopicReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPipelinePrimaryTopicReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean]
inline def isPipelinePrimaryTopicReference(node: Null, opts: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPipelinePrimaryTopicReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean]
inline def isPipelinePrimaryTopicReference(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPipelinePrimaryTopicReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean]

inline def isPipelineTopicExpression(): /* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPipelineTopicExpression")().asInstanceOf[/* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean]
inline def isPipelineTopicExpression(node: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPipelineTopicExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean]
inline def isPipelineTopicExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPipelineTopicExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean]
inline def isPipelineTopicExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPipelineTopicExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean]
inline def isPipelineTopicExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPipelineTopicExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean]

inline def isPlaceholder(): /* is @babel/types.@babel/types.Placeholder */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlaceholder")().asInstanceOf[/* is @babel/types.@babel/types.Placeholder */ Boolean]
inline def isPlaceholder(node: js.Object): /* is @babel/types.@babel/types.Placeholder */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlaceholder")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Placeholder */ Boolean]
inline def isPlaceholder(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Placeholder */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPlaceholder")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Placeholder */ Boolean]
inline def isPlaceholder(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Placeholder */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPlaceholder")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Placeholder */ Boolean]
inline def isPlaceholder(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Placeholder */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPlaceholder")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Placeholder */ Boolean]

inline def isPlaceholderType(
  placeholderType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.babelTypes.babelTypesStrings.ClassAccessorProperty, typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder */ Any,
  targetType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.babelTypes.babelTypesStrings.ClassAccessorProperty, typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder */ Any
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPlaceholderType")(placeholderType.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isPrivate(): /* is @babel/types.@babel/types.Private */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrivate")().asInstanceOf[/* is @babel/types.@babel/types.Private */ Boolean]
inline def isPrivate(node: js.Object): /* is @babel/types.@babel/types.Private */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrivate")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Private */ Boolean]
inline def isPrivate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Private */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPrivate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Private */ Boolean]
inline def isPrivate(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Private */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPrivate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Private */ Boolean]
inline def isPrivate(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Private */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPrivate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Private */ Boolean]

inline def isPrivateName(): /* is @babel/types.@babel/types.PrivateName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrivateName")().asInstanceOf[/* is @babel/types.@babel/types.PrivateName */ Boolean]
inline def isPrivateName(node: js.Object): /* is @babel/types.@babel/types.PrivateName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrivateName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.PrivateName */ Boolean]
inline def isPrivateName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PrivateName */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPrivateName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PrivateName */ Boolean]
inline def isPrivateName(node: Null, opts: js.Object): /* is @babel/types.@babel/types.PrivateName */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPrivateName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PrivateName */ Boolean]
inline def isPrivateName(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.PrivateName */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPrivateName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.PrivateName */ Boolean]

inline def isProgram(): /* is @babel/types.@babel/types.Program */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProgram")().asInstanceOf[/* is @babel/types.@babel/types.Program */ Boolean]
inline def isProgram(node: js.Object): /* is @babel/types.@babel/types.Program */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProgram")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Program */ Boolean]
inline def isProgram(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Program */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isProgram")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Program */ Boolean]
inline def isProgram(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Program */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isProgram")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Program */ Boolean]
inline def isProgram(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Program */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isProgram")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Program */ Boolean]

inline def isProperty(): /* is @babel/types.@babel/types.Property */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProperty")().asInstanceOf[/* is @babel/types.@babel/types.Property */ Boolean]
inline def isProperty(node: js.Object): /* is @babel/types.@babel/types.Property */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Property */ Boolean]
inline def isProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Property */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Property */ Boolean]
inline def isProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Property */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Property */ Boolean]
inline def isProperty(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Property */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Property */ Boolean]

inline def isPureish(): /* is @babel/types.@babel/types.Pureish */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPureish")().asInstanceOf[/* is @babel/types.@babel/types.Pureish */ Boolean]
inline def isPureish(node: js.Object): /* is @babel/types.@babel/types.Pureish */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPureish")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Pureish */ Boolean]
inline def isPureish(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Pureish */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPureish")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Pureish */ Boolean]
inline def isPureish(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Pureish */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPureish")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Pureish */ Boolean]
inline def isPureish(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Pureish */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPureish")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Pureish */ Boolean]

inline def isQualifiedTypeIdentifier(): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQualifiedTypeIdentifier")().asInstanceOf[/* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean]
inline def isQualifiedTypeIdentifier(node: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQualifiedTypeIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean]
inline def isQualifiedTypeIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isQualifiedTypeIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean]
inline def isQualifiedTypeIdentifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isQualifiedTypeIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean]
inline def isQualifiedTypeIdentifier(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isQualifiedTypeIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean]

inline def isRecordExpression(): /* is @babel/types.@babel/types.RecordExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRecordExpression")().asInstanceOf[/* is @babel/types.@babel/types.RecordExpression */ Boolean]
inline def isRecordExpression(node: js.Object): /* is @babel/types.@babel/types.RecordExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRecordExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.RecordExpression */ Boolean]
inline def isRecordExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RecordExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRecordExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RecordExpression */ Boolean]
inline def isRecordExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.RecordExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRecordExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RecordExpression */ Boolean]
inline def isRecordExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.RecordExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRecordExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RecordExpression */ Boolean]

inline def isReferenced(node: Node, parent: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReferenced")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isReferenced(node: Node, parent: Node, grandparent: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReferenced")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], grandparent.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isRegExpLiteral(): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExpLiteral")().asInstanceOf[/* is @babel/types.@babel/types.RegExpLiteral */ Boolean]
inline def isRegExpLiteral(node: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExpLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.RegExpLiteral */ Boolean]
inline def isRegExpLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRegExpLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RegExpLiteral */ Boolean]
inline def isRegExpLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRegExpLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RegExpLiteral */ Boolean]
inline def isRegExpLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRegExpLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RegExpLiteral */ Boolean]

inline def isRegexLiteral(): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegexLiteral")().asInstanceOf[/* is @babel/types.@babel/types.RegExpLiteral */ Boolean]
inline def isRegexLiteral(node: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegexLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.RegExpLiteral */ Boolean]
inline def isRegexLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRegexLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RegExpLiteral */ Boolean]
inline def isRegexLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRegexLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RegExpLiteral */ Boolean]
inline def isRegexLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRegexLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RegExpLiteral */ Boolean]

inline def isRestElement(): /* is @babel/types.@babel/types.RestElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRestElement")().asInstanceOf[/* is @babel/types.@babel/types.RestElement */ Boolean]
inline def isRestElement(node: js.Object): /* is @babel/types.@babel/types.RestElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRestElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.RestElement */ Boolean]
inline def isRestElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RestElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRestElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RestElement */ Boolean]
inline def isRestElement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.RestElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRestElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RestElement */ Boolean]
inline def isRestElement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.RestElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRestElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RestElement */ Boolean]

inline def isRestProperty(): /* is @babel/types.@babel/types.RestElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRestProperty")().asInstanceOf[/* is @babel/types.@babel/types.RestElement */ Boolean]
inline def isRestProperty(node: js.Object): /* is @babel/types.@babel/types.RestElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRestProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.RestElement */ Boolean]
inline def isRestProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RestElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRestProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RestElement */ Boolean]
inline def isRestProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.RestElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRestProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RestElement */ Boolean]
inline def isRestProperty(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.RestElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRestProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.RestElement */ Boolean]

inline def isReturnStatement(): /* is @babel/types.@babel/types.ReturnStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReturnStatement")().asInstanceOf[/* is @babel/types.@babel/types.ReturnStatement */ Boolean]
inline def isReturnStatement(node: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReturnStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ReturnStatement */ Boolean]
inline def isReturnStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReturnStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ReturnStatement */ Boolean]
inline def isReturnStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReturnStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ReturnStatement */ Boolean]
inline def isReturnStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReturnStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ReturnStatement */ Boolean]

inline def isScopable(): /* is @babel/types.@babel/types.Scopable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScopable")().asInstanceOf[/* is @babel/types.@babel/types.Scopable */ Boolean]
inline def isScopable(node: js.Object): /* is @babel/types.@babel/types.Scopable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScopable")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Scopable */ Boolean]
inline def isScopable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Scopable */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isScopable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Scopable */ Boolean]
inline def isScopable(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Scopable */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isScopable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Scopable */ Boolean]
inline def isScopable(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Scopable */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isScopable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Scopable */ Boolean]

inline def isScope(node: Node, parent: Node): /* is @babel/types.@babel/types.Scopable */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isScope")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Scopable */ Boolean]

inline def isSequenceExpression(): /* is @babel/types.@babel/types.SequenceExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSequenceExpression")().asInstanceOf[/* is @babel/types.@babel/types.SequenceExpression */ Boolean]
inline def isSequenceExpression(node: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSequenceExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.SequenceExpression */ Boolean]
inline def isSequenceExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSequenceExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SequenceExpression */ Boolean]
inline def isSequenceExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSequenceExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SequenceExpression */ Boolean]
inline def isSequenceExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSequenceExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SequenceExpression */ Boolean]

inline def isSpecifierDefault(specifier: ModuleSpecifier): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpecifierDefault")(specifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isSpreadElement(): /* is @babel/types.@babel/types.SpreadElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpreadElement")().asInstanceOf[/* is @babel/types.@babel/types.SpreadElement */ Boolean]
inline def isSpreadElement(node: js.Object): /* is @babel/types.@babel/types.SpreadElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpreadElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.SpreadElement */ Boolean]
inline def isSpreadElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSpreadElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SpreadElement */ Boolean]
inline def isSpreadElement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSpreadElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SpreadElement */ Boolean]
inline def isSpreadElement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSpreadElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SpreadElement */ Boolean]

inline def isSpreadProperty(): /* is @babel/types.@babel/types.SpreadElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpreadProperty")().asInstanceOf[/* is @babel/types.@babel/types.SpreadElement */ Boolean]
inline def isSpreadProperty(node: js.Object): /* is @babel/types.@babel/types.SpreadElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpreadProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.SpreadElement */ Boolean]
inline def isSpreadProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSpreadProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SpreadElement */ Boolean]
inline def isSpreadProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSpreadProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SpreadElement */ Boolean]
inline def isSpreadProperty(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSpreadProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SpreadElement */ Boolean]

inline def isStandardized(): /* is @babel/types.@babel/types.Standardized */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStandardized")().asInstanceOf[/* is @babel/types.@babel/types.Standardized */ Boolean]
inline def isStandardized(node: js.Object): /* is @babel/types.@babel/types.Standardized */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStandardized")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Standardized */ Boolean]
inline def isStandardized(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Standardized */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStandardized")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Standardized */ Boolean]
inline def isStandardized(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Standardized */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStandardized")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Standardized */ Boolean]
inline def isStandardized(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Standardized */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStandardized")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Standardized */ Boolean]

inline def isStatement(): /* is @babel/types.@babel/types.Statement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatement")().asInstanceOf[/* is @babel/types.@babel/types.Statement */ Boolean]
inline def isStatement(node: js.Object): /* is @babel/types.@babel/types.Statement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Statement */ Boolean]
inline def isStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Statement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Statement */ Boolean]
inline def isStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Statement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Statement */ Boolean]
inline def isStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Statement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Statement */ Boolean]

inline def isStaticBlock(): /* is @babel/types.@babel/types.StaticBlock */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStaticBlock")().asInstanceOf[/* is @babel/types.@babel/types.StaticBlock */ Boolean]
inline def isStaticBlock(node: js.Object): /* is @babel/types.@babel/types.StaticBlock */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStaticBlock")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.StaticBlock */ Boolean]
inline def isStaticBlock(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StaticBlock */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStaticBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.StaticBlock */ Boolean]
inline def isStaticBlock(node: Null, opts: js.Object): /* is @babel/types.@babel/types.StaticBlock */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStaticBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.StaticBlock */ Boolean]
inline def isStaticBlock(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.StaticBlock */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStaticBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.StaticBlock */ Boolean]

inline def isStringLiteral(): /* is @babel/types.@babel/types.StringLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteral")().asInstanceOf[/* is @babel/types.@babel/types.StringLiteral */ Boolean]
inline def isStringLiteral(node: js.Object): /* is @babel/types.@babel/types.StringLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.StringLiteral */ Boolean]
inline def isStringLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.StringLiteral */ Boolean]
inline def isStringLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.StringLiteral */ Boolean]
inline def isStringLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.StringLiteral */ Boolean]

inline def isStringLiteralTypeAnnotation(): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteralTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean]
inline def isStringLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteralTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean]
inline def isStringLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean]
inline def isStringLiteralTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean]
inline def isStringLiteralTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteralTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean]

inline def isStringTypeAnnotation(): /* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean]
inline def isStringTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean]
inline def isStringTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStringTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean]
inline def isStringTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStringTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean]
inline def isStringTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStringTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean]

inline def isSuper(): /* is @babel/types.@babel/types.Super */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuper")().asInstanceOf[/* is @babel/types.@babel/types.Super */ Boolean]
inline def isSuper(node: js.Object): /* is @babel/types.@babel/types.Super */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuper")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Super */ Boolean]
inline def isSuper(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Super */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSuper")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Super */ Boolean]
inline def isSuper(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Super */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSuper")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Super */ Boolean]
inline def isSuper(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Super */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSuper")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Super */ Boolean]

inline def isSwitchCase(): /* is @babel/types.@babel/types.SwitchCase */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSwitchCase")().asInstanceOf[/* is @babel/types.@babel/types.SwitchCase */ Boolean]
inline def isSwitchCase(node: js.Object): /* is @babel/types.@babel/types.SwitchCase */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSwitchCase")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.SwitchCase */ Boolean]
inline def isSwitchCase(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SwitchCase */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSwitchCase")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SwitchCase */ Boolean]
inline def isSwitchCase(node: Null, opts: js.Object): /* is @babel/types.@babel/types.SwitchCase */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSwitchCase")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SwitchCase */ Boolean]
inline def isSwitchCase(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.SwitchCase */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSwitchCase")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SwitchCase */ Boolean]

inline def isSwitchStatement(): /* is @babel/types.@babel/types.SwitchStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSwitchStatement")().asInstanceOf[/* is @babel/types.@babel/types.SwitchStatement */ Boolean]
inline def isSwitchStatement(node: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSwitchStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.SwitchStatement */ Boolean]
inline def isSwitchStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSwitchStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SwitchStatement */ Boolean]
inline def isSwitchStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSwitchStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SwitchStatement */ Boolean]
inline def isSwitchStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSwitchStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SwitchStatement */ Boolean]

inline def isSymbolTypeAnnotation(): /* is @babel/types.@babel/types.SymbolTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.SymbolTypeAnnotation */ Boolean]
inline def isSymbolTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.SymbolTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.SymbolTypeAnnotation */ Boolean]
inline def isSymbolTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SymbolTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SymbolTypeAnnotation */ Boolean]
inline def isSymbolTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.SymbolTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SymbolTypeAnnotation */ Boolean]
inline def isSymbolTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.SymbolTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.SymbolTypeAnnotation */ Boolean]

inline def isTSAnyKeyword(): /* is @babel/types.@babel/types.TSAnyKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSAnyKeyword")().asInstanceOf[/* is @babel/types.@babel/types.TSAnyKeyword */ Boolean]
inline def isTSAnyKeyword(node: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSAnyKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSAnyKeyword */ Boolean]
inline def isTSAnyKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSAnyKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSAnyKeyword */ Boolean]
inline def isTSAnyKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSAnyKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSAnyKeyword */ Boolean]
inline def isTSAnyKeyword(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSAnyKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSAnyKeyword */ Boolean]

inline def isTSArrayType(): /* is @babel/types.@babel/types.TSArrayType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSArrayType")().asInstanceOf[/* is @babel/types.@babel/types.TSArrayType */ Boolean]
inline def isTSArrayType(node: js.Object): /* is @babel/types.@babel/types.TSArrayType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSArrayType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSArrayType */ Boolean]
inline def isTSArrayType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSArrayType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSArrayType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSArrayType */ Boolean]
inline def isTSArrayType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSArrayType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSArrayType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSArrayType */ Boolean]
inline def isTSArrayType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSArrayType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSArrayType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSArrayType */ Boolean]

inline def isTSAsExpression(): /* is @babel/types.@babel/types.TSAsExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSAsExpression")().asInstanceOf[/* is @babel/types.@babel/types.TSAsExpression */ Boolean]
inline def isTSAsExpression(node: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSAsExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSAsExpression */ Boolean]
inline def isTSAsExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSAsExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSAsExpression */ Boolean]
inline def isTSAsExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSAsExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSAsExpression */ Boolean]
inline def isTSAsExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSAsExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSAsExpression */ Boolean]

inline def isTSBaseType(): /* is @babel/types.@babel/types.TSBaseType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSBaseType")().asInstanceOf[/* is @babel/types.@babel/types.TSBaseType */ Boolean]
inline def isTSBaseType(node: js.Object): /* is @babel/types.@babel/types.TSBaseType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSBaseType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSBaseType */ Boolean]
inline def isTSBaseType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSBaseType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSBaseType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSBaseType */ Boolean]
inline def isTSBaseType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSBaseType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSBaseType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSBaseType */ Boolean]
inline def isTSBaseType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSBaseType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSBaseType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSBaseType */ Boolean]

inline def isTSBigIntKeyword(): /* is @babel/types.@babel/types.TSBigIntKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSBigIntKeyword")().asInstanceOf[/* is @babel/types.@babel/types.TSBigIntKeyword */ Boolean]
inline def isTSBigIntKeyword(node: js.Object): /* is @babel/types.@babel/types.TSBigIntKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSBigIntKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSBigIntKeyword */ Boolean]
inline def isTSBigIntKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSBigIntKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSBigIntKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSBigIntKeyword */ Boolean]
inline def isTSBigIntKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSBigIntKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSBigIntKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSBigIntKeyword */ Boolean]
inline def isTSBigIntKeyword(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSBigIntKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSBigIntKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSBigIntKeyword */ Boolean]

inline def isTSBooleanKeyword(): /* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSBooleanKeyword")().asInstanceOf[/* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean]
inline def isTSBooleanKeyword(node: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSBooleanKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean]
inline def isTSBooleanKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSBooleanKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean]
inline def isTSBooleanKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSBooleanKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean]
inline def isTSBooleanKeyword(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSBooleanKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean]

inline def isTSCallSignatureDeclaration(): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSCallSignatureDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean]
inline def isTSCallSignatureDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSCallSignatureDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean]
inline def isTSCallSignatureDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSCallSignatureDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean]
inline def isTSCallSignatureDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSCallSignatureDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean]
inline def isTSCallSignatureDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSCallSignatureDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean]

inline def isTSConditionalType(): /* is @babel/types.@babel/types.TSConditionalType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSConditionalType")().asInstanceOf[/* is @babel/types.@babel/types.TSConditionalType */ Boolean]
inline def isTSConditionalType(node: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSConditionalType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSConditionalType */ Boolean]
inline def isTSConditionalType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSConditionalType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSConditionalType */ Boolean]
inline def isTSConditionalType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSConditionalType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSConditionalType */ Boolean]
inline def isTSConditionalType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSConditionalType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSConditionalType */ Boolean]

inline def isTSConstructSignatureDeclaration(): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSConstructSignatureDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean]
inline def isTSConstructSignatureDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSConstructSignatureDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean]
inline def isTSConstructSignatureDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSConstructSignatureDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean]
inline def isTSConstructSignatureDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSConstructSignatureDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean]
inline def isTSConstructSignatureDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSConstructSignatureDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean]

inline def isTSConstructorType(): /* is @babel/types.@babel/types.TSConstructorType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSConstructorType")().asInstanceOf[/* is @babel/types.@babel/types.TSConstructorType */ Boolean]
inline def isTSConstructorType(node: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSConstructorType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSConstructorType */ Boolean]
inline def isTSConstructorType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSConstructorType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSConstructorType */ Boolean]
inline def isTSConstructorType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSConstructorType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSConstructorType */ Boolean]
inline def isTSConstructorType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSConstructorType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSConstructorType */ Boolean]

inline def isTSDeclareFunction(): /* is @babel/types.@babel/types.TSDeclareFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSDeclareFunction")().asInstanceOf[/* is @babel/types.@babel/types.TSDeclareFunction */ Boolean]
inline def isTSDeclareFunction(node: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSDeclareFunction")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSDeclareFunction */ Boolean]
inline def isTSDeclareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSDeclareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSDeclareFunction */ Boolean]
inline def isTSDeclareFunction(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSDeclareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSDeclareFunction */ Boolean]
inline def isTSDeclareFunction(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSDeclareFunction")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSDeclareFunction */ Boolean]

inline def isTSDeclareMethod(): /* is @babel/types.@babel/types.TSDeclareMethod */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSDeclareMethod")().asInstanceOf[/* is @babel/types.@babel/types.TSDeclareMethod */ Boolean]
inline def isTSDeclareMethod(node: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSDeclareMethod")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSDeclareMethod */ Boolean]
inline def isTSDeclareMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSDeclareMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSDeclareMethod */ Boolean]
inline def isTSDeclareMethod(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSDeclareMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSDeclareMethod */ Boolean]
inline def isTSDeclareMethod(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSDeclareMethod")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSDeclareMethod */ Boolean]

inline def isTSEntityName(): /* is @babel/types.@babel/types.TSEntityName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSEntityName")().asInstanceOf[/* is @babel/types.@babel/types.TSEntityName */ Boolean]
inline def isTSEntityName(node: js.Object): /* is @babel/types.@babel/types.TSEntityName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSEntityName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSEntityName */ Boolean]
inline def isTSEntityName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEntityName */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSEntityName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSEntityName */ Boolean]
inline def isTSEntityName(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSEntityName */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSEntityName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSEntityName */ Boolean]
inline def isTSEntityName(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSEntityName */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSEntityName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSEntityName */ Boolean]

inline def isTSEnumDeclaration(): /* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSEnumDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean]
inline def isTSEnumDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSEnumDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean]
inline def isTSEnumDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSEnumDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean]
inline def isTSEnumDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSEnumDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean]
inline def isTSEnumDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSEnumDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean]

inline def isTSEnumMember(): /* is @babel/types.@babel/types.TSEnumMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSEnumMember")().asInstanceOf[/* is @babel/types.@babel/types.TSEnumMember */ Boolean]
inline def isTSEnumMember(node: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSEnumMember")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSEnumMember */ Boolean]
inline def isTSEnumMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSEnumMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSEnumMember */ Boolean]
inline def isTSEnumMember(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSEnumMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSEnumMember */ Boolean]
inline def isTSEnumMember(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSEnumMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSEnumMember */ Boolean]

inline def isTSExportAssignment(): /* is @babel/types.@babel/types.TSExportAssignment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSExportAssignment")().asInstanceOf[/* is @babel/types.@babel/types.TSExportAssignment */ Boolean]
inline def isTSExportAssignment(node: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSExportAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSExportAssignment */ Boolean]
inline def isTSExportAssignment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSExportAssignment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSExportAssignment */ Boolean]
inline def isTSExportAssignment(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSExportAssignment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSExportAssignment */ Boolean]
inline def isTSExportAssignment(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSExportAssignment")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSExportAssignment */ Boolean]

inline def isTSExpressionWithTypeArguments(): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSExpressionWithTypeArguments")().asInstanceOf[/* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean]
inline def isTSExpressionWithTypeArguments(node: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSExpressionWithTypeArguments")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean]
inline def isTSExpressionWithTypeArguments(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSExpressionWithTypeArguments")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean]
inline def isTSExpressionWithTypeArguments(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSExpressionWithTypeArguments")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean]
inline def isTSExpressionWithTypeArguments(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSExpressionWithTypeArguments")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean]

inline def isTSExternalModuleReference(): /* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSExternalModuleReference")().asInstanceOf[/* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean]
inline def isTSExternalModuleReference(node: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSExternalModuleReference")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean]
inline def isTSExternalModuleReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSExternalModuleReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean]
inline def isTSExternalModuleReference(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSExternalModuleReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean]
inline def isTSExternalModuleReference(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSExternalModuleReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean]

inline def isTSFunctionType(): /* is @babel/types.@babel/types.TSFunctionType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSFunctionType")().asInstanceOf[/* is @babel/types.@babel/types.TSFunctionType */ Boolean]
inline def isTSFunctionType(node: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSFunctionType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSFunctionType */ Boolean]
inline def isTSFunctionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSFunctionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSFunctionType */ Boolean]
inline def isTSFunctionType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSFunctionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSFunctionType */ Boolean]
inline def isTSFunctionType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSFunctionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSFunctionType */ Boolean]

inline def isTSImportEqualsDeclaration(): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSImportEqualsDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean]
inline def isTSImportEqualsDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSImportEqualsDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean]
inline def isTSImportEqualsDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSImportEqualsDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean]
inline def isTSImportEqualsDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSImportEqualsDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean]
inline def isTSImportEqualsDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSImportEqualsDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean]

inline def isTSImportType(): /* is @babel/types.@babel/types.TSImportType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSImportType")().asInstanceOf[/* is @babel/types.@babel/types.TSImportType */ Boolean]
inline def isTSImportType(node: js.Object): /* is @babel/types.@babel/types.TSImportType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSImportType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSImportType */ Boolean]
inline def isTSImportType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSImportType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSImportType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSImportType */ Boolean]
inline def isTSImportType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSImportType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSImportType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSImportType */ Boolean]
inline def isTSImportType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSImportType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSImportType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSImportType */ Boolean]

inline def isTSIndexSignature(): /* is @babel/types.@babel/types.TSIndexSignature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSIndexSignature")().asInstanceOf[/* is @babel/types.@babel/types.TSIndexSignature */ Boolean]
inline def isTSIndexSignature(node: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSIndexSignature")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSIndexSignature */ Boolean]
inline def isTSIndexSignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSIndexSignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSIndexSignature */ Boolean]
inline def isTSIndexSignature(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSIndexSignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSIndexSignature */ Boolean]
inline def isTSIndexSignature(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSIndexSignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSIndexSignature */ Boolean]

inline def isTSIndexedAccessType(): /* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSIndexedAccessType")().asInstanceOf[/* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean]
inline def isTSIndexedAccessType(node: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSIndexedAccessType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean]
inline def isTSIndexedAccessType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean]
inline def isTSIndexedAccessType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean]
inline def isTSIndexedAccessType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSIndexedAccessType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean]

inline def isTSInferType(): /* is @babel/types.@babel/types.TSInferType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSInferType")().asInstanceOf[/* is @babel/types.@babel/types.TSInferType */ Boolean]
inline def isTSInferType(node: js.Object): /* is @babel/types.@babel/types.TSInferType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSInferType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSInferType */ Boolean]
inline def isTSInferType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInferType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSInferType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSInferType */ Boolean]
inline def isTSInferType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSInferType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSInferType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSInferType */ Boolean]
inline def isTSInferType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSInferType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSInferType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSInferType */ Boolean]

inline def isTSInstantiationExpression(): /* is @babel/types.@babel/types.TSInstantiationExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSInstantiationExpression")().asInstanceOf[/* is @babel/types.@babel/types.TSInstantiationExpression */ Boolean]
inline def isTSInstantiationExpression(node: js.Object): /* is @babel/types.@babel/types.TSInstantiationExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSInstantiationExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSInstantiationExpression */ Boolean]
inline def isTSInstantiationExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInstantiationExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSInstantiationExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSInstantiationExpression */ Boolean]
inline def isTSInstantiationExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSInstantiationExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSInstantiationExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSInstantiationExpression */ Boolean]
inline def isTSInstantiationExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSInstantiationExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSInstantiationExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSInstantiationExpression */ Boolean]

inline def isTSInterfaceBody(): /* is @babel/types.@babel/types.TSInterfaceBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSInterfaceBody")().asInstanceOf[/* is @babel/types.@babel/types.TSInterfaceBody */ Boolean]
inline def isTSInterfaceBody(node: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSInterfaceBody")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSInterfaceBody */ Boolean]
inline def isTSInterfaceBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSInterfaceBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSInterfaceBody */ Boolean]
inline def isTSInterfaceBody(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSInterfaceBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSInterfaceBody */ Boolean]
inline def isTSInterfaceBody(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSInterfaceBody")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSInterfaceBody */ Boolean]

inline def isTSInterfaceDeclaration(): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSInterfaceDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean]
inline def isTSInterfaceDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSInterfaceDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean]
inline def isTSInterfaceDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSInterfaceDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean]
inline def isTSInterfaceDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSInterfaceDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean]
inline def isTSInterfaceDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSInterfaceDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean]

inline def isTSIntersectionType(): /* is @babel/types.@babel/types.TSIntersectionType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSIntersectionType")().asInstanceOf[/* is @babel/types.@babel/types.TSIntersectionType */ Boolean]
inline def isTSIntersectionType(node: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSIntersectionType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSIntersectionType */ Boolean]
inline def isTSIntersectionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSIntersectionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSIntersectionType */ Boolean]
inline def isTSIntersectionType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSIntersectionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSIntersectionType */ Boolean]
inline def isTSIntersectionType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSIntersectionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSIntersectionType */ Boolean]

inline def isTSIntrinsicKeyword(): /* is @babel/types.@babel/types.TSIntrinsicKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSIntrinsicKeyword")().asInstanceOf[/* is @babel/types.@babel/types.TSIntrinsicKeyword */ Boolean]
inline def isTSIntrinsicKeyword(node: js.Object): /* is @babel/types.@babel/types.TSIntrinsicKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSIntrinsicKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSIntrinsicKeyword */ Boolean]
inline def isTSIntrinsicKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIntrinsicKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSIntrinsicKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSIntrinsicKeyword */ Boolean]
inline def isTSIntrinsicKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSIntrinsicKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSIntrinsicKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSIntrinsicKeyword */ Boolean]
inline def isTSIntrinsicKeyword(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSIntrinsicKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSIntrinsicKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSIntrinsicKeyword */ Boolean]

inline def isTSLiteralType(): /* is @babel/types.@babel/types.TSLiteralType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSLiteralType")().asInstanceOf[/* is @babel/types.@babel/types.TSLiteralType */ Boolean]
inline def isTSLiteralType(node: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSLiteralType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSLiteralType */ Boolean]
inline def isTSLiteralType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSLiteralType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSLiteralType */ Boolean]
inline def isTSLiteralType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSLiteralType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSLiteralType */ Boolean]
inline def isTSLiteralType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSLiteralType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSLiteralType */ Boolean]

inline def isTSMappedType(): /* is @babel/types.@babel/types.TSMappedType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSMappedType")().asInstanceOf[/* is @babel/types.@babel/types.TSMappedType */ Boolean]
inline def isTSMappedType(node: js.Object): /* is @babel/types.@babel/types.TSMappedType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSMappedType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSMappedType */ Boolean]
inline def isTSMappedType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSMappedType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSMappedType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSMappedType */ Boolean]
inline def isTSMappedType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSMappedType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSMappedType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSMappedType */ Boolean]
inline def isTSMappedType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSMappedType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSMappedType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSMappedType */ Boolean]

inline def isTSMethodSignature(): /* is @babel/types.@babel/types.TSMethodSignature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSMethodSignature")().asInstanceOf[/* is @babel/types.@babel/types.TSMethodSignature */ Boolean]
inline def isTSMethodSignature(node: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSMethodSignature")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSMethodSignature */ Boolean]
inline def isTSMethodSignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSMethodSignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSMethodSignature */ Boolean]
inline def isTSMethodSignature(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSMethodSignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSMethodSignature */ Boolean]
inline def isTSMethodSignature(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSMethodSignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSMethodSignature */ Boolean]

inline def isTSModuleBlock(): /* is @babel/types.@babel/types.TSModuleBlock */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSModuleBlock")().asInstanceOf[/* is @babel/types.@babel/types.TSModuleBlock */ Boolean]
inline def isTSModuleBlock(node: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSModuleBlock")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSModuleBlock */ Boolean]
inline def isTSModuleBlock(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSModuleBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSModuleBlock */ Boolean]
inline def isTSModuleBlock(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSModuleBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSModuleBlock */ Boolean]
inline def isTSModuleBlock(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSModuleBlock")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSModuleBlock */ Boolean]

inline def isTSModuleDeclaration(): /* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSModuleDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean]
inline def isTSModuleDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSModuleDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean]
inline def isTSModuleDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSModuleDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean]
inline def isTSModuleDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSModuleDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean]
inline def isTSModuleDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSModuleDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean]

inline def isTSNamedTupleMember(): /* is @babel/types.@babel/types.TSNamedTupleMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSNamedTupleMember")().asInstanceOf[/* is @babel/types.@babel/types.TSNamedTupleMember */ Boolean]
inline def isTSNamedTupleMember(node: js.Object): /* is @babel/types.@babel/types.TSNamedTupleMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSNamedTupleMember")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSNamedTupleMember */ Boolean]
inline def isTSNamedTupleMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNamedTupleMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNamedTupleMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNamedTupleMember */ Boolean]
inline def isTSNamedTupleMember(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSNamedTupleMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNamedTupleMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNamedTupleMember */ Boolean]
inline def isTSNamedTupleMember(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSNamedTupleMember */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNamedTupleMember")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNamedTupleMember */ Boolean]

inline def isTSNamespaceExportDeclaration(): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSNamespaceExportDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean]
inline def isTSNamespaceExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSNamespaceExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean]
inline def isTSNamespaceExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNamespaceExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean]
inline def isTSNamespaceExportDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNamespaceExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean]
inline def isTSNamespaceExportDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNamespaceExportDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean]

inline def isTSNeverKeyword(): /* is @babel/types.@babel/types.TSNeverKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSNeverKeyword")().asInstanceOf[/* is @babel/types.@babel/types.TSNeverKeyword */ Boolean]
inline def isTSNeverKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSNeverKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSNeverKeyword */ Boolean]
inline def isTSNeverKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNeverKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNeverKeyword */ Boolean]
inline def isTSNeverKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNeverKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNeverKeyword */ Boolean]
inline def isTSNeverKeyword(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNeverKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNeverKeyword */ Boolean]

inline def isTSNonNullExpression(): /* is @babel/types.@babel/types.TSNonNullExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSNonNullExpression")().asInstanceOf[/* is @babel/types.@babel/types.TSNonNullExpression */ Boolean]
inline def isTSNonNullExpression(node: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSNonNullExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSNonNullExpression */ Boolean]
inline def isTSNonNullExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNonNullExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNonNullExpression */ Boolean]
inline def isTSNonNullExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNonNullExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNonNullExpression */ Boolean]
inline def isTSNonNullExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNonNullExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNonNullExpression */ Boolean]

inline def isTSNullKeyword(): /* is @babel/types.@babel/types.TSNullKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSNullKeyword")().asInstanceOf[/* is @babel/types.@babel/types.TSNullKeyword */ Boolean]
inline def isTSNullKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSNullKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSNullKeyword */ Boolean]
inline def isTSNullKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNullKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNullKeyword */ Boolean]
inline def isTSNullKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNullKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNullKeyword */ Boolean]
inline def isTSNullKeyword(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNullKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNullKeyword */ Boolean]

inline def isTSNumberKeyword(): /* is @babel/types.@babel/types.TSNumberKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSNumberKeyword")().asInstanceOf[/* is @babel/types.@babel/types.TSNumberKeyword */ Boolean]
inline def isTSNumberKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSNumberKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSNumberKeyword */ Boolean]
inline def isTSNumberKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNumberKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNumberKeyword */ Boolean]
inline def isTSNumberKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNumberKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNumberKeyword */ Boolean]
inline def isTSNumberKeyword(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSNumberKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSNumberKeyword */ Boolean]

inline def isTSObjectKeyword(): /* is @babel/types.@babel/types.TSObjectKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSObjectKeyword")().asInstanceOf[/* is @babel/types.@babel/types.TSObjectKeyword */ Boolean]
inline def isTSObjectKeyword(node: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSObjectKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSObjectKeyword */ Boolean]
inline def isTSObjectKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSObjectKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSObjectKeyword */ Boolean]
inline def isTSObjectKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSObjectKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSObjectKeyword */ Boolean]
inline def isTSObjectKeyword(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSObjectKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSObjectKeyword */ Boolean]

inline def isTSOptionalType(): /* is @babel/types.@babel/types.TSOptionalType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSOptionalType")().asInstanceOf[/* is @babel/types.@babel/types.TSOptionalType */ Boolean]
inline def isTSOptionalType(node: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSOptionalType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSOptionalType */ Boolean]
inline def isTSOptionalType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSOptionalType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSOptionalType */ Boolean]
inline def isTSOptionalType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSOptionalType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSOptionalType */ Boolean]
inline def isTSOptionalType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSOptionalType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSOptionalType */ Boolean]

inline def isTSParameterProperty(): /* is @babel/types.@babel/types.TSParameterProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSParameterProperty")().asInstanceOf[/* is @babel/types.@babel/types.TSParameterProperty */ Boolean]
inline def isTSParameterProperty(node: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSParameterProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSParameterProperty */ Boolean]
inline def isTSParameterProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSParameterProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSParameterProperty */ Boolean]
inline def isTSParameterProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSParameterProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSParameterProperty */ Boolean]
inline def isTSParameterProperty(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSParameterProperty")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSParameterProperty */ Boolean]

inline def isTSParenthesizedType(): /* is @babel/types.@babel/types.TSParenthesizedType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSParenthesizedType")().asInstanceOf[/* is @babel/types.@babel/types.TSParenthesizedType */ Boolean]
inline def isTSParenthesizedType(node: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSParenthesizedType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSParenthesizedType */ Boolean]
inline def isTSParenthesizedType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSParenthesizedType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSParenthesizedType */ Boolean]
inline def isTSParenthesizedType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSParenthesizedType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSParenthesizedType */ Boolean]
inline def isTSParenthesizedType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSParenthesizedType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSParenthesizedType */ Boolean]

inline def isTSPropertySignature(): /* is @babel/types.@babel/types.TSPropertySignature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSPropertySignature")().asInstanceOf[/* is @babel/types.@babel/types.TSPropertySignature */ Boolean]
inline def isTSPropertySignature(node: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSPropertySignature")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSPropertySignature */ Boolean]
inline def isTSPropertySignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSPropertySignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSPropertySignature */ Boolean]
inline def isTSPropertySignature(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSPropertySignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSPropertySignature */ Boolean]
inline def isTSPropertySignature(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSPropertySignature")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSPropertySignature */ Boolean]

inline def isTSQualifiedName(): /* is @babel/types.@babel/types.TSQualifiedName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSQualifiedName")().asInstanceOf[/* is @babel/types.@babel/types.TSQualifiedName */ Boolean]
inline def isTSQualifiedName(node: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSQualifiedName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSQualifiedName */ Boolean]
inline def isTSQualifiedName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSQualifiedName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSQualifiedName */ Boolean]
inline def isTSQualifiedName(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSQualifiedName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSQualifiedName */ Boolean]
inline def isTSQualifiedName(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSQualifiedName")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSQualifiedName */ Boolean]

inline def isTSRestType(): /* is @babel/types.@babel/types.TSRestType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSRestType")().asInstanceOf[/* is @babel/types.@babel/types.TSRestType */ Boolean]
inline def isTSRestType(node: js.Object): /* is @babel/types.@babel/types.TSRestType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSRestType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSRestType */ Boolean]
inline def isTSRestType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSRestType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSRestType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSRestType */ Boolean]
inline def isTSRestType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSRestType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSRestType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSRestType */ Boolean]
inline def isTSRestType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSRestType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSRestType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSRestType */ Boolean]

inline def isTSSatisfiesExpression(): /* is @babel/types.@babel/types.TSSatisfiesExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSSatisfiesExpression")().asInstanceOf[/* is @babel/types.@babel/types.TSSatisfiesExpression */ Boolean]
inline def isTSSatisfiesExpression(node: js.Object): /* is @babel/types.@babel/types.TSSatisfiesExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSSatisfiesExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSSatisfiesExpression */ Boolean]
inline def isTSSatisfiesExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSSatisfiesExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSSatisfiesExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSSatisfiesExpression */ Boolean]
inline def isTSSatisfiesExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSSatisfiesExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSSatisfiesExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSSatisfiesExpression */ Boolean]
inline def isTSSatisfiesExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSSatisfiesExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSSatisfiesExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSSatisfiesExpression */ Boolean]

inline def isTSStringKeyword(): /* is @babel/types.@babel/types.TSStringKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSStringKeyword")().asInstanceOf[/* is @babel/types.@babel/types.TSStringKeyword */ Boolean]
inline def isTSStringKeyword(node: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSStringKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSStringKeyword */ Boolean]
inline def isTSStringKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSStringKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSStringKeyword */ Boolean]
inline def isTSStringKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSStringKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSStringKeyword */ Boolean]
inline def isTSStringKeyword(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSStringKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSStringKeyword */ Boolean]

inline def isTSSymbolKeyword(): /* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSSymbolKeyword")().asInstanceOf[/* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean]
inline def isTSSymbolKeyword(node: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSSymbolKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean]
inline def isTSSymbolKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSSymbolKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean]
inline def isTSSymbolKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSSymbolKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean]
inline def isTSSymbolKeyword(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSSymbolKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean]

inline def isTSThisType(): /* is @babel/types.@babel/types.TSThisType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSThisType")().asInstanceOf[/* is @babel/types.@babel/types.TSThisType */ Boolean]
inline def isTSThisType(node: js.Object): /* is @babel/types.@babel/types.TSThisType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSThisType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSThisType */ Boolean]
inline def isTSThisType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSThisType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSThisType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSThisType */ Boolean]
inline def isTSThisType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSThisType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSThisType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSThisType */ Boolean]
inline def isTSThisType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSThisType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSThisType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSThisType */ Boolean]

inline def isTSTupleType(): /* is @babel/types.@babel/types.TSTupleType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTupleType")().asInstanceOf[/* is @babel/types.@babel/types.TSTupleType */ Boolean]
inline def isTSTupleType(node: js.Object): /* is @babel/types.@babel/types.TSTupleType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTupleType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSTupleType */ Boolean]
inline def isTSTupleType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTupleType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTupleType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTupleType */ Boolean]
inline def isTSTupleType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTupleType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTupleType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTupleType */ Boolean]
inline def isTSTupleType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSTupleType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTupleType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTupleType */ Boolean]

inline def isTSType(): /* is @babel/types.@babel/types.TSType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSType")().asInstanceOf[/* is @babel/types.@babel/types.TSType */ Boolean]
inline def isTSType(node: js.Object): /* is @babel/types.@babel/types.TSType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSType */ Boolean]
inline def isTSType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSType */ Boolean]
inline def isTSType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSType */ Boolean]
inline def isTSType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSType */ Boolean]

inline def isTSTypeAliasDeclaration(): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAliasDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean]
inline def isTSTypeAliasDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAliasDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean]
inline def isTSTypeAliasDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAliasDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean]
inline def isTSTypeAliasDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAliasDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean]
inline def isTSTypeAliasDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAliasDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean]

inline def isTSTypeAnnotation(): /* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean]
inline def isTSTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean]
inline def isTSTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean]
inline def isTSTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean]
inline def isTSTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean]

inline def isTSTypeAssertion(): /* is @babel/types.@babel/types.TSTypeAssertion */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAssertion")().asInstanceOf[/* is @babel/types.@babel/types.TSTypeAssertion */ Boolean]
inline def isTSTypeAssertion(node: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAssertion")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSTypeAssertion */ Boolean]
inline def isTSTypeAssertion(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAssertion")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeAssertion */ Boolean]
inline def isTSTypeAssertion(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAssertion")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeAssertion */ Boolean]
inline def isTSTypeAssertion(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeAssertion")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeAssertion */ Boolean]

inline def isTSTypeElement(): /* is @babel/types.@babel/types.TSTypeElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeElement")().asInstanceOf[/* is @babel/types.@babel/types.TSTypeElement */ Boolean]
inline def isTSTypeElement(node: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSTypeElement */ Boolean]
inline def isTSTypeElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeElement */ Boolean]
inline def isTSTypeElement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeElement */ Boolean]
inline def isTSTypeElement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeElement */ Boolean]

inline def isTSTypeLiteral(): /* is @babel/types.@babel/types.TSTypeLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeLiteral")().asInstanceOf[/* is @babel/types.@babel/types.TSTypeLiteral */ Boolean]
inline def isTSTypeLiteral(node: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSTypeLiteral */ Boolean]
inline def isTSTypeLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeLiteral */ Boolean]
inline def isTSTypeLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeLiteral */ Boolean]
inline def isTSTypeLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeLiteral */ Boolean]

inline def isTSTypeOperator(): /* is @babel/types.@babel/types.TSTypeOperator */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeOperator")().asInstanceOf[/* is @babel/types.@babel/types.TSTypeOperator */ Boolean]
inline def isTSTypeOperator(node: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeOperator")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSTypeOperator */ Boolean]
inline def isTSTypeOperator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeOperator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeOperator */ Boolean]
inline def isTSTypeOperator(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeOperator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeOperator */ Boolean]
inline def isTSTypeOperator(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeOperator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeOperator */ Boolean]

inline def isTSTypeParameter(): /* is @babel/types.@babel/types.TSTypeParameter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameter")().asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameter */ Boolean]
inline def isTSTypeParameter(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameter")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameter */ Boolean]
inline def isTSTypeParameter(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameter")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameter */ Boolean]
inline def isTSTypeParameter(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameter")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameter */ Boolean]
inline def isTSTypeParameter(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameter")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameter */ Boolean]

inline def isTSTypeParameterDeclaration(): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameterDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean]
inline def isTSTypeParameterDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameterDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean]
inline def isTSTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameterDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean]
inline def isTSTypeParameterDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameterDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean]
inline def isTSTypeParameterDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameterDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean]

inline def isTSTypeParameterInstantiation(): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameterInstantiation")().asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean]
inline def isTSTypeParameterInstantiation(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameterInstantiation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean]
inline def isTSTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameterInstantiation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean]
inline def isTSTypeParameterInstantiation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameterInstantiation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean]
inline def isTSTypeParameterInstantiation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeParameterInstantiation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean]

inline def isTSTypePredicate(): /* is @babel/types.@babel/types.TSTypePredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypePredicate")().asInstanceOf[/* is @babel/types.@babel/types.TSTypePredicate */ Boolean]
inline def isTSTypePredicate(node: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypePredicate")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSTypePredicate */ Boolean]
inline def isTSTypePredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypePredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypePredicate */ Boolean]
inline def isTSTypePredicate(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypePredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypePredicate */ Boolean]
inline def isTSTypePredicate(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypePredicate")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypePredicate */ Boolean]

inline def isTSTypeQuery(): /* is @babel/types.@babel/types.TSTypeQuery */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeQuery")().asInstanceOf[/* is @babel/types.@babel/types.TSTypeQuery */ Boolean]
inline def isTSTypeQuery(node: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeQuery")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSTypeQuery */ Boolean]
inline def isTSTypeQuery(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeQuery")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeQuery */ Boolean]
inline def isTSTypeQuery(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeQuery")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeQuery */ Boolean]
inline def isTSTypeQuery(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeQuery")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeQuery */ Boolean]

inline def isTSTypeReference(): /* is @babel/types.@babel/types.TSTypeReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeReference")().asInstanceOf[/* is @babel/types.@babel/types.TSTypeReference */ Boolean]
inline def isTSTypeReference(node: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeReference")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSTypeReference */ Boolean]
inline def isTSTypeReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeReference */ Boolean]
inline def isTSTypeReference(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeReference */ Boolean]
inline def isTSTypeReference(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSTypeReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSTypeReference */ Boolean]

inline def isTSUndefinedKeyword(): /* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSUndefinedKeyword")().asInstanceOf[/* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean]
inline def isTSUndefinedKeyword(node: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSUndefinedKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean]
inline def isTSUndefinedKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSUndefinedKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean]
inline def isTSUndefinedKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSUndefinedKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean]
inline def isTSUndefinedKeyword(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSUndefinedKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean]

inline def isTSUnionType(): /* is @babel/types.@babel/types.TSUnionType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSUnionType")().asInstanceOf[/* is @babel/types.@babel/types.TSUnionType */ Boolean]
inline def isTSUnionType(node: js.Object): /* is @babel/types.@babel/types.TSUnionType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSUnionType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSUnionType */ Boolean]
inline def isTSUnionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUnionType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSUnionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSUnionType */ Boolean]
inline def isTSUnionType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSUnionType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSUnionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSUnionType */ Boolean]
inline def isTSUnionType(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSUnionType */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSUnionType")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSUnionType */ Boolean]

inline def isTSUnknownKeyword(): /* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSUnknownKeyword")().asInstanceOf[/* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean]
inline def isTSUnknownKeyword(node: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSUnknownKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean]
inline def isTSUnknownKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSUnknownKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean]
inline def isTSUnknownKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSUnknownKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean]
inline def isTSUnknownKeyword(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSUnknownKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean]

inline def isTSVoidKeyword(): /* is @babel/types.@babel/types.TSVoidKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSVoidKeyword")().asInstanceOf[/* is @babel/types.@babel/types.TSVoidKeyword */ Boolean]
inline def isTSVoidKeyword(node: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTSVoidKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TSVoidKeyword */ Boolean]
inline def isTSVoidKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSVoidKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSVoidKeyword */ Boolean]
inline def isTSVoidKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSVoidKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSVoidKeyword */ Boolean]
inline def isTSVoidKeyword(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTSVoidKeyword")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TSVoidKeyword */ Boolean]

inline def isTaggedTemplateExpression(): /* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTaggedTemplateExpression")().asInstanceOf[/* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean]
inline def isTaggedTemplateExpression(node: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTaggedTemplateExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean]
inline def isTaggedTemplateExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTaggedTemplateExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean]
inline def isTaggedTemplateExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTaggedTemplateExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean]
inline def isTaggedTemplateExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTaggedTemplateExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean]

inline def isTemplateElement(): /* is @babel/types.@babel/types.TemplateElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateElement")().asInstanceOf[/* is @babel/types.@babel/types.TemplateElement */ Boolean]
inline def isTemplateElement(node: js.Object): /* is @babel/types.@babel/types.TemplateElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TemplateElement */ Boolean]
inline def isTemplateElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TemplateElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TemplateElement */ Boolean]
inline def isTemplateElement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TemplateElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TemplateElement */ Boolean]
inline def isTemplateElement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TemplateElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateElement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TemplateElement */ Boolean]

inline def isTemplateLiteral(): /* is @babel/types.@babel/types.TemplateLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateLiteral")().asInstanceOf[/* is @babel/types.@babel/types.TemplateLiteral */ Boolean]
inline def isTemplateLiteral(node: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TemplateLiteral */ Boolean]
inline def isTemplateLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TemplateLiteral */ Boolean]
inline def isTemplateLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TemplateLiteral */ Boolean]
inline def isTemplateLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateLiteral")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TemplateLiteral */ Boolean]

inline def isTerminatorless(): /* is @babel/types.@babel/types.Terminatorless */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTerminatorless")().asInstanceOf[/* is @babel/types.@babel/types.Terminatorless */ Boolean]
inline def isTerminatorless(node: js.Object): /* is @babel/types.@babel/types.Terminatorless */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTerminatorless")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Terminatorless */ Boolean]
inline def isTerminatorless(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Terminatorless */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTerminatorless")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Terminatorless */ Boolean]
inline def isTerminatorless(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Terminatorless */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTerminatorless")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Terminatorless */ Boolean]
inline def isTerminatorless(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Terminatorless */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTerminatorless")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Terminatorless */ Boolean]

inline def isThisExpression(): /* is @babel/types.@babel/types.ThisExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisExpression")().asInstanceOf[/* is @babel/types.@babel/types.ThisExpression */ Boolean]
inline def isThisExpression(node: js.Object): /* is @babel/types.@babel/types.ThisExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ThisExpression */ Boolean]
inline def isThisExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThisExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThisExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ThisExpression */ Boolean]
inline def isThisExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ThisExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThisExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ThisExpression */ Boolean]
inline def isThisExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ThisExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThisExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ThisExpression */ Boolean]

inline def isThisTypeAnnotation(): /* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean]
inline def isThisTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean]
inline def isThisTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThisTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean]
inline def isThisTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThisTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean]
inline def isThisTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThisTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean]

inline def isThrowStatement(): /* is @babel/types.@babel/types.ThrowStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThrowStatement")().asInstanceOf[/* is @babel/types.@babel/types.ThrowStatement */ Boolean]
inline def isThrowStatement(node: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThrowStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ThrowStatement */ Boolean]
inline def isThrowStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThrowStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ThrowStatement */ Boolean]
inline def isThrowStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThrowStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ThrowStatement */ Boolean]
inline def isThrowStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThrowStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.ThrowStatement */ Boolean]

inline def isTopicReference(): /* is @babel/types.@babel/types.TopicReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTopicReference")().asInstanceOf[/* is @babel/types.@babel/types.TopicReference */ Boolean]
inline def isTopicReference(node: js.Object): /* is @babel/types.@babel/types.TopicReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTopicReference")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TopicReference */ Boolean]
inline def isTopicReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TopicReference */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTopicReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TopicReference */ Boolean]
inline def isTopicReference(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TopicReference */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTopicReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TopicReference */ Boolean]
inline def isTopicReference(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TopicReference */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTopicReference")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TopicReference */ Boolean]

inline def isTryStatement(): /* is @babel/types.@babel/types.TryStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTryStatement")().asInstanceOf[/* is @babel/types.@babel/types.TryStatement */ Boolean]
inline def isTryStatement(node: js.Object): /* is @babel/types.@babel/types.TryStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTryStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TryStatement */ Boolean]
inline def isTryStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TryStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTryStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TryStatement */ Boolean]
inline def isTryStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TryStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTryStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TryStatement */ Boolean]
inline def isTryStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TryStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTryStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TryStatement */ Boolean]

inline def isTupleExpression(): /* is @babel/types.@babel/types.TupleExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTupleExpression")().asInstanceOf[/* is @babel/types.@babel/types.TupleExpression */ Boolean]
inline def isTupleExpression(node: js.Object): /* is @babel/types.@babel/types.TupleExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTupleExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TupleExpression */ Boolean]
inline def isTupleExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TupleExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTupleExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TupleExpression */ Boolean]
inline def isTupleExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TupleExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTupleExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TupleExpression */ Boolean]
inline def isTupleExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TupleExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTupleExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TupleExpression */ Boolean]

inline def isTupleTypeAnnotation(): /* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTupleTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean]
inline def isTupleTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTupleTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean]
inline def isTupleTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTupleTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean]
inline def isTupleTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTupleTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean]
inline def isTupleTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTupleTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean]

inline def isType(nodetype: String, targetType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(nodetype.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isType(nodetype: Null, targetType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(nodetype.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isType(nodetype: Unit, targetType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(nodetype.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isType[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.babelTypes.babelTypesStrings.ClassAccessorProperty, typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder */ Any */](nodetype: String, targetType: T): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(nodetype.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]

inline def isTypeAlias(): /* is @babel/types.@babel/types.TypeAlias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAlias")().asInstanceOf[/* is @babel/types.@babel/types.TypeAlias */ Boolean]
inline def isTypeAlias(node: js.Object): /* is @babel/types.@babel/types.TypeAlias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAlias")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TypeAlias */ Boolean]
inline def isTypeAlias(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeAlias */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAlias")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeAlias */ Boolean]
inline def isTypeAlias(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeAlias */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAlias")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeAlias */ Boolean]
inline def isTypeAlias(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TypeAlias */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAlias")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeAlias */ Boolean]

inline def isTypeAnnotation(): /* is @babel/types.@babel/types.TypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.TypeAnnotation */ Boolean]
inline def isTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TypeAnnotation */ Boolean]
inline def isTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeAnnotation */ Boolean]
inline def isTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeAnnotation */ Boolean]
inline def isTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeAnnotation */ Boolean]

inline def isTypeCastExpression(): /* is @babel/types.@babel/types.TypeCastExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeCastExpression")().asInstanceOf[/* is @babel/types.@babel/types.TypeCastExpression */ Boolean]
inline def isTypeCastExpression(node: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeCastExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TypeCastExpression */ Boolean]
inline def isTypeCastExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeCastExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeCastExpression */ Boolean]
inline def isTypeCastExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeCastExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeCastExpression */ Boolean]
inline def isTypeCastExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeCastExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeCastExpression */ Boolean]

inline def isTypeParameter(): /* is @babel/types.@babel/types.TypeParameter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameter")().asInstanceOf[/* is @babel/types.@babel/types.TypeParameter */ Boolean]
inline def isTypeParameter(node: js.Object): /* is @babel/types.@babel/types.TypeParameter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameter")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TypeParameter */ Boolean]
inline def isTypeParameter(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameter */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameter")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeParameter */ Boolean]
inline def isTypeParameter(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeParameter */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameter")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeParameter */ Boolean]
inline def isTypeParameter(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TypeParameter */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameter")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeParameter */ Boolean]

inline def isTypeParameterDeclaration(): /* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameterDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean]
inline def isTypeParameterDeclaration(node: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameterDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean]
inline def isTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameterDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean]
inline def isTypeParameterDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameterDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean]
inline def isTypeParameterDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameterDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean]

inline def isTypeParameterInstantiation(): /* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameterInstantiation")().asInstanceOf[/* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean]
inline def isTypeParameterInstantiation(node: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameterInstantiation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean]
inline def isTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameterInstantiation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean]
inline def isTypeParameterInstantiation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameterInstantiation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean]
inline def isTypeParameterInstantiation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameterInstantiation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean]

inline def isTypeScript(): /* is @babel/types.@babel/types.TypeScript */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeScript")().asInstanceOf[/* is @babel/types.@babel/types.TypeScript */ Boolean]
inline def isTypeScript(node: js.Object): /* is @babel/types.@babel/types.TypeScript */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeScript")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TypeScript */ Boolean]
inline def isTypeScript(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeScript */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeScript")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeScript */ Boolean]
inline def isTypeScript(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeScript */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeScript")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeScript */ Boolean]
inline def isTypeScript(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TypeScript */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeScript")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeScript */ Boolean]

inline def isTypeofTypeAnnotation(): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeofTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean]
inline def isTypeofTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeofTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean]
inline def isTypeofTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeofTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean]
inline def isTypeofTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeofTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean]
inline def isTypeofTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeofTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean]

inline def isUnaryExpression(): /* is @babel/types.@babel/types.UnaryExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnaryExpression")().asInstanceOf[/* is @babel/types.@babel/types.UnaryExpression */ Boolean]
inline def isUnaryExpression(node: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnaryExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.UnaryExpression */ Boolean]
inline def isUnaryExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUnaryExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UnaryExpression */ Boolean]
inline def isUnaryExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUnaryExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UnaryExpression */ Boolean]
inline def isUnaryExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUnaryExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UnaryExpression */ Boolean]

inline def isUnaryLike(): /* is @babel/types.@babel/types.UnaryLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnaryLike")().asInstanceOf[/* is @babel/types.@babel/types.UnaryLike */ Boolean]
inline def isUnaryLike(node: js.Object): /* is @babel/types.@babel/types.UnaryLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnaryLike")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.UnaryLike */ Boolean]
inline def isUnaryLike(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnaryLike */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUnaryLike")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UnaryLike */ Boolean]
inline def isUnaryLike(node: Null, opts: js.Object): /* is @babel/types.@babel/types.UnaryLike */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUnaryLike")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UnaryLike */ Boolean]
inline def isUnaryLike(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.UnaryLike */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUnaryLike")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UnaryLike */ Boolean]

inline def isUnionTypeAnnotation(): /* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnionTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean]
inline def isUnionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnionTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean]
inline def isUnionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUnionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean]
inline def isUnionTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUnionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean]
inline def isUnionTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUnionTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean]

inline def isUpdateExpression(): /* is @babel/types.@babel/types.UpdateExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUpdateExpression")().asInstanceOf[/* is @babel/types.@babel/types.UpdateExpression */ Boolean]
inline def isUpdateExpression(node: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUpdateExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.UpdateExpression */ Boolean]
inline def isUpdateExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUpdateExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UpdateExpression */ Boolean]
inline def isUpdateExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUpdateExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UpdateExpression */ Boolean]
inline def isUpdateExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUpdateExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UpdateExpression */ Boolean]

inline def isUserWhitespacable(): /* is @babel/types.@babel/types.UserWhitespacable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUserWhitespacable")().asInstanceOf[/* is @babel/types.@babel/types.UserWhitespacable */ Boolean]
inline def isUserWhitespacable(node: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUserWhitespacable")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.UserWhitespacable */ Boolean]
inline def isUserWhitespacable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUserWhitespacable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UserWhitespacable */ Boolean]
inline def isUserWhitespacable(node: Null, opts: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUserWhitespacable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UserWhitespacable */ Boolean]
inline def isUserWhitespacable(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUserWhitespacable")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.UserWhitespacable */ Boolean]

inline def isV8IntrinsicIdentifier(): /* is @babel/types.@babel/types.V8IntrinsicIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isV8IntrinsicIdentifier")().asInstanceOf[/* is @babel/types.@babel/types.V8IntrinsicIdentifier */ Boolean]
inline def isV8IntrinsicIdentifier(node: js.Object): /* is @babel/types.@babel/types.V8IntrinsicIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isV8IntrinsicIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.V8IntrinsicIdentifier */ Boolean]
inline def isV8IntrinsicIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.V8IntrinsicIdentifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isV8IntrinsicIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.V8IntrinsicIdentifier */ Boolean]
inline def isV8IntrinsicIdentifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.V8IntrinsicIdentifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isV8IntrinsicIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.V8IntrinsicIdentifier */ Boolean]
inline def isV8IntrinsicIdentifier(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.V8IntrinsicIdentifier */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isV8IntrinsicIdentifier")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.V8IntrinsicIdentifier */ Boolean]

inline def isValidES3Identifier(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidES3Identifier")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isValidIdentifier(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidIdentifier")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isVar(node: Node): /* is @babel/types.@babel/types.VariableDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVar")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.VariableDeclaration */ Boolean]

inline def isVariableDeclaration(): /* is @babel/types.@babel/types.VariableDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableDeclaration")().asInstanceOf[/* is @babel/types.@babel/types.VariableDeclaration */ Boolean]
inline def isVariableDeclaration(node: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.VariableDeclaration */ Boolean]
inline def isVariableDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVariableDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.VariableDeclaration */ Boolean]
inline def isVariableDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVariableDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.VariableDeclaration */ Boolean]
inline def isVariableDeclaration(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVariableDeclaration")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.VariableDeclaration */ Boolean]

inline def isVariableDeclarator(): /* is @babel/types.@babel/types.VariableDeclarator */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableDeclarator")().asInstanceOf[/* is @babel/types.@babel/types.VariableDeclarator */ Boolean]
inline def isVariableDeclarator(node: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableDeclarator")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.VariableDeclarator */ Boolean]
inline def isVariableDeclarator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVariableDeclarator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.VariableDeclarator */ Boolean]
inline def isVariableDeclarator(node: Null, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVariableDeclarator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.VariableDeclarator */ Boolean]
inline def isVariableDeclarator(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVariableDeclarator")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.VariableDeclarator */ Boolean]

inline def isVariance(): /* is @babel/types.@babel/types.Variance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariance")().asInstanceOf[/* is @babel/types.@babel/types.Variance */ Boolean]
inline def isVariance(node: js.Object): /* is @babel/types.@babel/types.Variance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariance")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Variance */ Boolean]
inline def isVariance(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Variance */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVariance")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Variance */ Boolean]
inline def isVariance(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Variance */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVariance")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Variance */ Boolean]
inline def isVariance(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.Variance */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVariance")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.Variance */ Boolean]

inline def isVoidTypeAnnotation(): /* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVoidTypeAnnotation")().asInstanceOf[/* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean]
inline def isVoidTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVoidTypeAnnotation")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean]
inline def isVoidTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVoidTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean]
inline def isVoidTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVoidTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean]
inline def isVoidTypeAnnotation(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVoidTypeAnnotation")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean]

inline def isWhile(): /* is @babel/types.@babel/types.While */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhile")().asInstanceOf[/* is @babel/types.@babel/types.While */ Boolean]
inline def isWhile(node: js.Object): /* is @babel/types.@babel/types.While */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhile")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.While */ Boolean]
inline def isWhile(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.While */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWhile")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.While */ Boolean]
inline def isWhile(node: Null, opts: js.Object): /* is @babel/types.@babel/types.While */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWhile")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.While */ Boolean]
inline def isWhile(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.While */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWhile")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.While */ Boolean]

inline def isWhileStatement(): /* is @babel/types.@babel/types.WhileStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhileStatement")().asInstanceOf[/* is @babel/types.@babel/types.WhileStatement */ Boolean]
inline def isWhileStatement(node: js.Object): /* is @babel/types.@babel/types.WhileStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhileStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.WhileStatement */ Boolean]
inline def isWhileStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.WhileStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWhileStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.WhileStatement */ Boolean]
inline def isWhileStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.WhileStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWhileStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.WhileStatement */ Boolean]
inline def isWhileStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.WhileStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWhileStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.WhileStatement */ Boolean]

inline def isWithStatement(): /* is @babel/types.@babel/types.WithStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWithStatement")().asInstanceOf[/* is @babel/types.@babel/types.WithStatement */ Boolean]
inline def isWithStatement(node: js.Object): /* is @babel/types.@babel/types.WithStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWithStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.WithStatement */ Boolean]
inline def isWithStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.WithStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWithStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.WithStatement */ Boolean]
inline def isWithStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.WithStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWithStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.WithStatement */ Boolean]
inline def isWithStatement(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.WithStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWithStatement")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.WithStatement */ Boolean]

inline def isYieldExpression(): /* is @babel/types.@babel/types.YieldExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isYieldExpression")().asInstanceOf[/* is @babel/types.@babel/types.YieldExpression */ Boolean]
inline def isYieldExpression(node: js.Object): /* is @babel/types.@babel/types.YieldExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isYieldExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.YieldExpression */ Boolean]
inline def isYieldExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.YieldExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isYieldExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.YieldExpression */ Boolean]
inline def isYieldExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.YieldExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isYieldExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.YieldExpression */ Boolean]
inline def isYieldExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.YieldExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isYieldExpression")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.YieldExpression */ Boolean]

inline def jsxAttribute(name: JSXIdentifier_): JSXAttribute_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxAttribute")(name.asInstanceOf[js.Any]).asInstanceOf[JSXAttribute_]
inline def jsxAttribute(name: JSXIdentifier_, value: JSXElement_): JSXAttribute_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxAttribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[JSXAttribute_]
inline def jsxAttribute(name: JSXIdentifier_, value: JSXExpressionContainer_): JSXAttribute_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxAttribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[JSXAttribute_]
inline def jsxAttribute(name: JSXIdentifier_, value: JSXFragment_): JSXAttribute_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxAttribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[JSXAttribute_]
inline def jsxAttribute(name: JSXIdentifier_, value: StringLiteral_): JSXAttribute_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxAttribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[JSXAttribute_]
inline def jsxAttribute(name: JSXNamespacedName_): JSXAttribute_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxAttribute")(name.asInstanceOf[js.Any]).asInstanceOf[JSXAttribute_]
inline def jsxAttribute(name: JSXNamespacedName_, value: JSXElement_): JSXAttribute_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxAttribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[JSXAttribute_]
inline def jsxAttribute(name: JSXNamespacedName_, value: JSXExpressionContainer_): JSXAttribute_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxAttribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[JSXAttribute_]
inline def jsxAttribute(name: JSXNamespacedName_, value: JSXFragment_): JSXAttribute_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxAttribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[JSXAttribute_]
inline def jsxAttribute(name: JSXNamespacedName_, value: StringLiteral_): JSXAttribute_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxAttribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[JSXAttribute_]

inline def jsxClosingElement(name: JSXIdentifier_): JSXClosingElement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxClosingElement")(name.asInstanceOf[js.Any]).asInstanceOf[JSXClosingElement_]
inline def jsxClosingElement(name: JSXMemberExpression_): JSXClosingElement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxClosingElement")(name.asInstanceOf[js.Any]).asInstanceOf[JSXClosingElement_]
inline def jsxClosingElement(name: JSXNamespacedName_): JSXClosingElement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxClosingElement")(name.asInstanceOf[js.Any]).asInstanceOf[JSXClosingElement_]

inline def jsxClosingFragment(): JSXClosingFragment_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxClosingFragment")().asInstanceOf[JSXClosingFragment_]

inline def jsxElement(
  openingElement: JSXOpeningElement_,
  closingElement: Null,
  children: js.Array[
  JSXElement_ | JSXExpressionContainer_ | JSXFragment_ | JSXSpreadChild_ | JSXText_
]
): JSXElement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxElement")(openingElement.asInstanceOf[js.Any], closingElement.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[JSXElement_]
inline def jsxElement(
  openingElement: JSXOpeningElement_,
  closingElement: Null,
  children: js.Array[
  JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
],
  selfClosing: Boolean
): JSXElement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxElement")(openingElement.asInstanceOf[js.Any], closingElement.asInstanceOf[js.Any], children.asInstanceOf[js.Any], selfClosing.asInstanceOf[js.Any])).asInstanceOf[JSXElement_]
inline def jsxElement(
  openingElement: JSXOpeningElement_,
  closingElement: Unit,
  children: js.Array[
  JSXElement_ | JSXExpressionContainer_ | JSXFragment_ | JSXSpreadChild_ | JSXText_
]
): JSXElement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxElement")(openingElement.asInstanceOf[js.Any], closingElement.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[JSXElement_]
inline def jsxElement(
  openingElement: JSXOpeningElement_,
  closingElement: Unit,
  children: js.Array[
  JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
],
  selfClosing: Boolean
): JSXElement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxElement")(openingElement.asInstanceOf[js.Any], closingElement.asInstanceOf[js.Any], children.asInstanceOf[js.Any], selfClosing.asInstanceOf[js.Any])).asInstanceOf[JSXElement_]
inline def jsxElement(
  openingElement: JSXOpeningElement_,
  closingElement: JSXClosingElement_,
  children: js.Array[
  JSXElement_ | JSXExpressionContainer_ | JSXFragment_ | JSXSpreadChild_ | JSXText_
]
): JSXElement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxElement")(openingElement.asInstanceOf[js.Any], closingElement.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[JSXElement_]
inline def jsxElement(
  openingElement: JSXOpeningElement_,
  closingElement: JSXClosingElement_,
  children: js.Array[
  JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
],
  selfClosing: Boolean
): JSXElement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxElement")(openingElement.asInstanceOf[js.Any], closingElement.asInstanceOf[js.Any], children.asInstanceOf[js.Any], selfClosing.asInstanceOf[js.Any])).asInstanceOf[JSXElement_]

inline def jsxEmptyExpression(): JSXEmptyExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxEmptyExpression")().asInstanceOf[JSXEmptyExpression_]

inline def jsxExpressionContainer(expression: Expression): JSXExpressionContainer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxExpressionContainer")(expression.asInstanceOf[js.Any]).asInstanceOf[JSXExpressionContainer_]
inline def jsxExpressionContainer(expression: JSXEmptyExpression_): JSXExpressionContainer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxExpressionContainer")(expression.asInstanceOf[js.Any]).asInstanceOf[JSXExpressionContainer_]

inline def jsxFragment(
  openingFragment: JSXOpeningFragment_,
  closingFragment: JSXClosingFragment_,
  children: js.Array[
  JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
]
): JSXFragment_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxFragment")(openingFragment.asInstanceOf[js.Any], closingFragment.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[JSXFragment_]

inline def jsxIdentifier(name: String): JSXIdentifier_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxIdentifier")(name.asInstanceOf[js.Any]).asInstanceOf[JSXIdentifier_]

inline def jsxMemberExpression(`object`: JSXIdentifier_, property: JSXIdentifier_): JSXMemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxMemberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[JSXMemberExpression_]
inline def jsxMemberExpression(`object`: JSXMemberExpression_, property: JSXIdentifier_): JSXMemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxMemberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[JSXMemberExpression_]

inline def jsxNamespacedName(namespace: JSXIdentifier_, name: JSXIdentifier_): JSXNamespacedName_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxNamespacedName")(namespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[JSXNamespacedName_]

inline def jsxOpeningElement(name: JSXIdentifier_, attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_]): JSXOpeningElement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxOpeningElement")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[JSXOpeningElement_]
inline def jsxOpeningElement(
  name: JSXIdentifier_,
  attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
  selfClosing: Boolean
): JSXOpeningElement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxOpeningElement")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], selfClosing.asInstanceOf[js.Any])).asInstanceOf[JSXOpeningElement_]
inline def jsxOpeningElement(name: JSXMemberExpression_, attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_]): JSXOpeningElement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxOpeningElement")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[JSXOpeningElement_]
inline def jsxOpeningElement(
  name: JSXMemberExpression_,
  attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
  selfClosing: Boolean
): JSXOpeningElement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxOpeningElement")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], selfClosing.asInstanceOf[js.Any])).asInstanceOf[JSXOpeningElement_]
inline def jsxOpeningElement(name: JSXNamespacedName_, attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_]): JSXOpeningElement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxOpeningElement")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[JSXOpeningElement_]
inline def jsxOpeningElement(
  name: JSXNamespacedName_,
  attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
  selfClosing: Boolean
): JSXOpeningElement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxOpeningElement")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], selfClosing.asInstanceOf[js.Any])).asInstanceOf[JSXOpeningElement_]

inline def jsxOpeningFragment(): JSXOpeningFragment_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxOpeningFragment")().asInstanceOf[JSXOpeningFragment_]

inline def jsxSpreadAttribute(argument: Expression): JSXSpreadAttribute_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxSpreadAttribute")(argument.asInstanceOf[js.Any]).asInstanceOf[JSXSpreadAttribute_]

inline def jsxSpreadChild(expression: Expression): JSXSpreadChild_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxSpreadChild")(expression.asInstanceOf[js.Any]).asInstanceOf[JSXSpreadChild_]

inline def jsxText(value: String): JSXText_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxText")(value.asInstanceOf[js.Any]).asInstanceOf[JSXText_]

inline def labeledStatement(label: Identifier_, body: Statement): LabeledStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("labeledStatement")(label.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[LabeledStatement_]

inline def logicalExpression(
  operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
  left: Expression,
  right: Expression
): LogicalExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalExpression")(operator.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[LogicalExpression_]

inline def matchesPattern(node: Null, `match`: String): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesPattern")(node.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def matchesPattern(node: Null, `match`: String, allowPartial: Boolean): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesPattern")(node.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any], allowPartial.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def matchesPattern(node: Null, `match`: js.Array[String]): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesPattern")(node.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def matchesPattern(node: Null, `match`: js.Array[String], allowPartial: Boolean): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesPattern")(node.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any], allowPartial.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def matchesPattern(node: Unit, `match`: String): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesPattern")(node.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def matchesPattern(node: Unit, `match`: String, allowPartial: Boolean): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesPattern")(node.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any], allowPartial.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def matchesPattern(node: Unit, `match`: js.Array[String]): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesPattern")(node.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def matchesPattern(node: Unit, `match`: js.Array[String], allowPartial: Boolean): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesPattern")(node.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any], allowPartial.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def matchesPattern(node: Node, `match`: String): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesPattern")(node.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def matchesPattern(node: Node, `match`: String, allowPartial: Boolean): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesPattern")(node.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any], allowPartial.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def matchesPattern(node: Node, `match`: js.Array[String]): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesPattern")(node.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]
inline def matchesPattern(node: Node, `match`: js.Array[String], allowPartial: Boolean): /* is @babel/types.@babel/types.MemberExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesPattern")(node.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any], allowPartial.asInstanceOf[js.Any])).asInstanceOf[/* is @babel/types.@babel/types.MemberExpression */ Boolean]

inline def memberExpression(`object`: Expression, property: Expression): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Expression, property: Expression, computed: Boolean): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Expression, property: Expression, computed: Boolean, optional: `true` | `false`): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Expression, property: Expression, computed: Unit, optional: `true` | `false`): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Expression, property: Identifier_): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Expression, property: Identifier_, computed: Boolean): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Expression, property: Identifier_, computed: Boolean, optional: `true` | `false`): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Expression, property: Identifier_, computed: Unit, optional: `true` | `false`): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Expression, property: PrivateName_): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Expression, property: PrivateName_, computed: Boolean): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Expression, property: PrivateName_, computed: Boolean, optional: `true` | `false`): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Expression, property: PrivateName_, computed: Unit, optional: `true` | `false`): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Super_, property: Expression): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Super_, property: Expression, computed: Boolean): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Super_, property: Expression, computed: Boolean, optional: `true` | `false`): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Super_, property: Expression, computed: Unit, optional: `true` | `false`): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Super_, property: Identifier_): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Super_, property: Identifier_, computed: Boolean): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Super_, property: Identifier_, computed: Boolean, optional: `true` | `false`): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Super_, property: Identifier_, computed: Unit, optional: `true` | `false`): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Super_, property: PrivateName_): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Super_, property: PrivateName_, computed: Boolean): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Super_, property: PrivateName_, computed: Boolean, optional: `true` | `false`): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
inline def memberExpression(`object`: Super_, property: PrivateName_, computed: Unit, optional: `true` | `false`): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]

inline def metaProperty(meta: Identifier_, property: Identifier_): MetaProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("metaProperty")(meta.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[MetaProperty_]

inline def mixedTypeAnnotation(): MixedTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedTypeAnnotation")().asInstanceOf[MixedTypeAnnotation_]

inline def moduleExpression(body: Program_): ModuleExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("moduleExpression")(body.asInstanceOf[js.Any]).asInstanceOf[ModuleExpression_]

inline def newExpression(
  callee: Expression,
  _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
): NewExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("newExpression")(callee.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any])).asInstanceOf[NewExpression_]
inline def newExpression(
  callee: Super_,
  _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
): NewExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("newExpression")(callee.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any])).asInstanceOf[NewExpression_]
inline def newExpression(
  callee: V8IntrinsicIdentifier_,
  _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
): NewExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("newExpression")(callee.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any])).asInstanceOf[NewExpression_]

inline def noop(): Noop_ = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Noop_]

inline def nullLiteral(): NullLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("nullLiteral")().asInstanceOf[NullLiteral_]

inline def nullLiteralTypeAnnotation(): NullLiteralTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("nullLiteralTypeAnnotation")().asInstanceOf[NullLiteralTypeAnnotation_]

inline def nullableTypeAnnotation(typeAnnotation: FlowType): NullableTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("nullableTypeAnnotation")(typeAnnotation.asInstanceOf[js.Any]).asInstanceOf[NullableTypeAnnotation_]

inline def numberLiteralTypeAnnotation(value: Double): NumberLiteralTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("numberLiteralTypeAnnotation")(value.asInstanceOf[js.Any]).asInstanceOf[NumberLiteralTypeAnnotation_]

inline def numberTypeAnnotation(): NumberTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("numberTypeAnnotation")().asInstanceOf[NumberTypeAnnotation_]

inline def numericLiteral(value: Double): NumericLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("numericLiteral")(value.asInstanceOf[js.Any]).asInstanceOf[NumericLiteral_]

inline def objectExpression(properties: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_]): ObjectExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("objectExpression")(properties.asInstanceOf[js.Any]).asInstanceOf[ObjectExpression_]

inline def objectMethod(
  kind: js.UndefOr[method_ | get | set],
  key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  body: BlockStatement_,
  computed: js.UndefOr[Boolean],
  generator: js.UndefOr[Boolean],
  async: js.UndefOr[Boolean]
): ObjectMethod_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectMethod")(kind.asInstanceOf[js.Any], key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], body.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[ObjectMethod_]

inline def objectPattern(properties: js.Array[RestElement_ | ObjectProperty_]): ObjectPattern_ = ^.asInstanceOf[js.Dynamic].applyDynamic("objectPattern")(properties.asInstanceOf[js.Any]).asInstanceOf[ObjectPattern_]

inline def objectProperty(
  key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | DecimalLiteral_ | PrivateName_,
  value: Expression | PatternLike,
  computed: js.UndefOr[Boolean],
  shorthand: js.UndefOr[Boolean],
  decorators: js.UndefOr[js.Array[Decorator_] | Null]
): ObjectProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], shorthand.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[ObjectProperty_]

inline def objectTypeAnnotation(properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]): ObjectTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any]).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: js.Array[ObjectTypeIndexer_]
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: js.Array[ObjectTypeIndexer_],
  callProperties: js.Array[ObjectTypeCallProperty_]
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any], callProperties.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: js.Array[ObjectTypeIndexer_],
  callProperties: js.Array[ObjectTypeCallProperty_],
  internalSlots: js.Array[ObjectTypeInternalSlot_]
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any], callProperties.asInstanceOf[js.Any], internalSlots.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: js.Array[ObjectTypeIndexer_],
  callProperties: js.Array[ObjectTypeCallProperty_],
  internalSlots: js.Array[ObjectTypeInternalSlot_],
  exact: Boolean
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any], callProperties.asInstanceOf[js.Any], internalSlots.asInstanceOf[js.Any], exact.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: js.Array[ObjectTypeIndexer_],
  callProperties: js.Array[ObjectTypeCallProperty_],
  internalSlots: Unit,
  exact: Boolean
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any], callProperties.asInstanceOf[js.Any], internalSlots.asInstanceOf[js.Any], exact.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: js.Array[ObjectTypeIndexer_],
  callProperties: Unit,
  internalSlots: js.Array[ObjectTypeInternalSlot_]
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any], callProperties.asInstanceOf[js.Any], internalSlots.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: js.Array[ObjectTypeIndexer_],
  callProperties: Unit,
  internalSlots: js.Array[ObjectTypeInternalSlot_],
  exact: Boolean
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any], callProperties.asInstanceOf[js.Any], internalSlots.asInstanceOf[js.Any], exact.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: js.Array[ObjectTypeIndexer_],
  callProperties: Unit,
  internalSlots: Unit,
  exact: Boolean
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any], callProperties.asInstanceOf[js.Any], internalSlots.asInstanceOf[js.Any], exact.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: Unit,
  callProperties: js.Array[ObjectTypeCallProperty_]
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any], callProperties.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: Unit,
  callProperties: js.Array[ObjectTypeCallProperty_],
  internalSlots: js.Array[ObjectTypeInternalSlot_]
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any], callProperties.asInstanceOf[js.Any], internalSlots.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: Unit,
  callProperties: js.Array[ObjectTypeCallProperty_],
  internalSlots: js.Array[ObjectTypeInternalSlot_],
  exact: Boolean
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any], callProperties.asInstanceOf[js.Any], internalSlots.asInstanceOf[js.Any], exact.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: Unit,
  callProperties: js.Array[ObjectTypeCallProperty_],
  internalSlots: Unit,
  exact: Boolean
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any], callProperties.asInstanceOf[js.Any], internalSlots.asInstanceOf[js.Any], exact.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: Unit,
  callProperties: Unit,
  internalSlots: js.Array[ObjectTypeInternalSlot_]
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any], callProperties.asInstanceOf[js.Any], internalSlots.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: Unit,
  callProperties: Unit,
  internalSlots: js.Array[ObjectTypeInternalSlot_],
  exact: Boolean
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any], callProperties.asInstanceOf[js.Any], internalSlots.asInstanceOf[js.Any], exact.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]
inline def objectTypeAnnotation(
  properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
  indexers: Unit,
  callProperties: Unit,
  internalSlots: Unit,
  exact: Boolean
): ObjectTypeAnnotation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeAnnotation")(properties.asInstanceOf[js.Any], indexers.asInstanceOf[js.Any], callProperties.asInstanceOf[js.Any], internalSlots.asInstanceOf[js.Any], exact.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeAnnotation_]

inline def objectTypeCallProperty(value: FlowType): ObjectTypeCallProperty_ = ^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeCallProperty")(value.asInstanceOf[js.Any]).asInstanceOf[ObjectTypeCallProperty_]

inline def objectTypeIndexer(id: Null, key: FlowType, value: FlowType): ObjectTypeIndexer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeIndexer")(id.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeIndexer_]
inline def objectTypeIndexer(id: Null, key: FlowType, value: FlowType, variance: Variance_): ObjectTypeIndexer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeIndexer")(id.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeIndexer_]
inline def objectTypeIndexer(id: Unit, key: FlowType, value: FlowType): ObjectTypeIndexer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeIndexer")(id.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeIndexer_]
inline def objectTypeIndexer(id: Unit, key: FlowType, value: FlowType, variance: Variance_): ObjectTypeIndexer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeIndexer")(id.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeIndexer_]
inline def objectTypeIndexer(id: Identifier_, key: FlowType, value: FlowType): ObjectTypeIndexer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeIndexer")(id.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeIndexer_]
inline def objectTypeIndexer(id: Identifier_, key: FlowType, value: FlowType, variance: Variance_): ObjectTypeIndexer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeIndexer")(id.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeIndexer_]

inline def objectTypeInternalSlot(id: Identifier_, value: FlowType, optional: Boolean, _static: Boolean, method: Boolean): ObjectTypeInternalSlot_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeInternalSlot")(id.asInstanceOf[js.Any], value.asInstanceOf[js.Any], optional.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeInternalSlot_]

inline def objectTypeProperty(key: Identifier_, value: FlowType): ObjectTypeProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeProperty_]
inline def objectTypeProperty(key: Identifier_, value: FlowType, variance: Variance_): ObjectTypeProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeProperty_]
inline def objectTypeProperty(key: StringLiteral_, value: FlowType): ObjectTypeProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeProperty_]
inline def objectTypeProperty(key: StringLiteral_, value: FlowType, variance: Variance_): ObjectTypeProperty_ = (^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeProperty_]

inline def objectTypeSpreadProperty(argument: FlowType): ObjectTypeSpreadProperty_ = ^.asInstanceOf[js.Dynamic].applyDynamic("objectTypeSpreadProperty")(argument.asInstanceOf[js.Any]).asInstanceOf[ObjectTypeSpreadProperty_]

inline def opaqueType(id: Identifier_, typeParameters: Null, supertype: Null, impltype: FlowType): OpaqueType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("opaqueType")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], supertype.asInstanceOf[js.Any], impltype.asInstanceOf[js.Any])).asInstanceOf[OpaqueType_]
inline def opaqueType(id: Identifier_, typeParameters: Null, supertype: Unit, impltype: FlowType): OpaqueType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("opaqueType")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], supertype.asInstanceOf[js.Any], impltype.asInstanceOf[js.Any])).asInstanceOf[OpaqueType_]
inline def opaqueType(id: Identifier_, typeParameters: Null, supertype: FlowType, impltype: FlowType): OpaqueType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("opaqueType")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], supertype.asInstanceOf[js.Any], impltype.asInstanceOf[js.Any])).asInstanceOf[OpaqueType_]
inline def opaqueType(id: Identifier_, typeParameters: Unit, supertype: Null, impltype: FlowType): OpaqueType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("opaqueType")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], supertype.asInstanceOf[js.Any], impltype.asInstanceOf[js.Any])).asInstanceOf[OpaqueType_]
inline def opaqueType(id: Identifier_, typeParameters: Unit, supertype: Unit, impltype: FlowType): OpaqueType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("opaqueType")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], supertype.asInstanceOf[js.Any], impltype.asInstanceOf[js.Any])).asInstanceOf[OpaqueType_]
inline def opaqueType(id: Identifier_, typeParameters: Unit, supertype: FlowType, impltype: FlowType): OpaqueType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("opaqueType")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], supertype.asInstanceOf[js.Any], impltype.asInstanceOf[js.Any])).asInstanceOf[OpaqueType_]
inline def opaqueType(id: Identifier_, typeParameters: TypeParameterDeclaration_, supertype: Null, impltype: FlowType): OpaqueType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("opaqueType")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], supertype.asInstanceOf[js.Any], impltype.asInstanceOf[js.Any])).asInstanceOf[OpaqueType_]
inline def opaqueType(id: Identifier_, typeParameters: TypeParameterDeclaration_, supertype: Unit, impltype: FlowType): OpaqueType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("opaqueType")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], supertype.asInstanceOf[js.Any], impltype.asInstanceOf[js.Any])).asInstanceOf[OpaqueType_]
inline def opaqueType(
  id: Identifier_,
  typeParameters: TypeParameterDeclaration_,
  supertype: FlowType,
  impltype: FlowType
): OpaqueType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("opaqueType")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], supertype.asInstanceOf[js.Any], impltype.asInstanceOf[js.Any])).asInstanceOf[OpaqueType_]

inline def optionalCallExpression(
  callee: Expression,
  _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
  optional: Boolean
): OptionalCallExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("optionalCallExpression")(callee.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[OptionalCallExpression_]

inline def optionalIndexedAccessType(objectType: FlowType, indexType: FlowType): OptionalIndexedAccessType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("optionalIndexedAccessType")(objectType.asInstanceOf[js.Any], indexType.asInstanceOf[js.Any])).asInstanceOf[OptionalIndexedAccessType_]

inline def optionalMemberExpression(`object`: Expression, property: Expression, computed: Boolean, optional: Boolean): OptionalMemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("optionalMemberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[OptionalMemberExpression_]
inline def optionalMemberExpression(`object`: Expression, property: Expression, computed: Unit, optional: Boolean): OptionalMemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("optionalMemberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[OptionalMemberExpression_]
inline def optionalMemberExpression(`object`: Expression, property: Identifier_, computed: Boolean, optional: Boolean): OptionalMemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("optionalMemberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[OptionalMemberExpression_]
inline def optionalMemberExpression(`object`: Expression, property: Identifier_, computed: Unit, optional: Boolean): OptionalMemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("optionalMemberExpression")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], computed.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[OptionalMemberExpression_]

inline def parenthesizedExpression(expression: Expression): ParenthesizedExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parenthesizedExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[ParenthesizedExpression_]

inline def pipelineBareFunction(callee: Expression): PipelineBareFunction_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pipelineBareFunction")(callee.asInstanceOf[js.Any]).asInstanceOf[PipelineBareFunction_]

inline def pipelinePrimaryTopicReference(): PipelinePrimaryTopicReference_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pipelinePrimaryTopicReference")().asInstanceOf[PipelinePrimaryTopicReference_]

inline def pipelineTopicExpression(expression: Expression): PipelineTopicExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pipelineTopicExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[PipelineTopicExpression_]

inline def placeholder(
  expectedNode: Identifier | StringLiteral | typings.babelTypes.babelTypesStrings.Expression | typings.babelTypes.babelTypesStrings.Statement | typings.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typings.babelTypes.babelTypesStrings.Pattern,
  name: Identifier_
): Placeholder_ = (^.asInstanceOf[js.Dynamic].applyDynamic("placeholder")(expectedNode.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Placeholder_]

inline def prependToMemberExpression[T /* <: PickMemberExpressionobjec */](member: T, prepend: Expression): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prependToMemberExpression")(member.asInstanceOf[js.Any], prepend.asInstanceOf[js.Any])).asInstanceOf[T]
inline def prependToMemberExpression[T /* <: PickMemberExpressionobjec */](member: T, prepend: Super_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prependToMemberExpression")(member.asInstanceOf[js.Any], prepend.asInstanceOf[js.Any])).asInstanceOf[T]

inline def privateName(id: Identifier_): PrivateName_ = ^.asInstanceOf[js.Dynamic].applyDynamic("privateName")(id.asInstanceOf[js.Any]).asInstanceOf[PrivateName_]

inline def program(body: js.Array[Statement]): Program_ = ^.asInstanceOf[js.Dynamic].applyDynamic("program")(body.asInstanceOf[js.Any]).asInstanceOf[Program_]
inline def program(body: js.Array[Statement], directives: js.Array[Directive_]): Program_ = (^.asInstanceOf[js.Dynamic].applyDynamic("program")(body.asInstanceOf[js.Any], directives.asInstanceOf[js.Any])).asInstanceOf[Program_]
inline def program(body: js.Array[Statement], directives: js.Array[Directive_], sourceType: module | script): Program_ = (^.asInstanceOf[js.Dynamic].applyDynamic("program")(body.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], sourceType.asInstanceOf[js.Any])).asInstanceOf[Program_]
inline def program(
  body: js.Array[Statement],
  directives: js.Array[Directive_],
  sourceType: script | module,
  interpreter: InterpreterDirective_
): Program_ = (^.asInstanceOf[js.Dynamic].applyDynamic("program")(body.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], sourceType.asInstanceOf[js.Any], interpreter.asInstanceOf[js.Any])).asInstanceOf[Program_]
inline def program(
  body: js.Array[Statement],
  directives: js.Array[Directive_],
  sourceType: Unit,
  interpreter: InterpreterDirective_
): Program_ = (^.asInstanceOf[js.Dynamic].applyDynamic("program")(body.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], sourceType.asInstanceOf[js.Any], interpreter.asInstanceOf[js.Any])).asInstanceOf[Program_]
inline def program(body: js.Array[Statement], directives: Unit, sourceType: module | script): Program_ = (^.asInstanceOf[js.Dynamic].applyDynamic("program")(body.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], sourceType.asInstanceOf[js.Any])).asInstanceOf[Program_]
inline def program(
  body: js.Array[Statement],
  directives: Unit,
  sourceType: script | module,
  interpreter: InterpreterDirective_
): Program_ = (^.asInstanceOf[js.Dynamic].applyDynamic("program")(body.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], sourceType.asInstanceOf[js.Any], interpreter.asInstanceOf[js.Any])).asInstanceOf[Program_]
inline def program(body: js.Array[Statement], directives: Unit, sourceType: Unit, interpreter: InterpreterDirective_): Program_ = (^.asInstanceOf[js.Dynamic].applyDynamic("program")(body.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], sourceType.asInstanceOf[js.Any], interpreter.asInstanceOf[js.Any])).asInstanceOf[Program_]

inline def qualifiedTypeIdentifier(id: Identifier_, qualification: Identifier_): QualifiedTypeIdentifier_ = (^.asInstanceOf[js.Dynamic].applyDynamic("qualifiedTypeIdentifier")(id.asInstanceOf[js.Any], qualification.asInstanceOf[js.Any])).asInstanceOf[QualifiedTypeIdentifier_]
inline def qualifiedTypeIdentifier(id: Identifier_, qualification: QualifiedTypeIdentifier_): QualifiedTypeIdentifier_ = (^.asInstanceOf[js.Dynamic].applyDynamic("qualifiedTypeIdentifier")(id.asInstanceOf[js.Any], qualification.asInstanceOf[js.Any])).asInstanceOf[QualifiedTypeIdentifier_]

inline def recordExpression(properties: js.Array[ObjectProperty_ | SpreadElement_]): RecordExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("recordExpression")(properties.asInstanceOf[js.Any]).asInstanceOf[RecordExpression_]

inline def regExpLiteral(pattern: String): RegExpLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("regExpLiteral")(pattern.asInstanceOf[js.Any]).asInstanceOf[RegExpLiteral_]
inline def regExpLiteral(pattern: String, flags: String): RegExpLiteral_ = (^.asInstanceOf[js.Dynamic].applyDynamic("regExpLiteral")(pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[RegExpLiteral_]

inline def removeComments[T /* <: Node */](node: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("removeComments")(node.asInstanceOf[js.Any]).asInstanceOf[T]

inline def removeProperties(n: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeProperties")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def removeProperties(n: Node, opts: PreserveComments): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeProperties")(n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removePropertiesDeep[T /* <: Node */](n: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("removePropertiesDeep")(n.asInstanceOf[js.Any]).asInstanceOf[T]
inline def removePropertiesDeep[T /* <: Node */](n: T, opts: PreserveComments): T = (^.asInstanceOf[js.Dynamic].applyDynamic("removePropertiesDeep")(n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]

inline def removeTypeDuplicates_false(types: js.Array[js.UndefOr[FlowType | `false` | Null]]): js.Array[FlowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTypeDuplicates")(types.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlowType]]

inline def restElement(argument: LVal): RestElement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("restElement")(argument.asInstanceOf[js.Any]).asInstanceOf[RestElement_]

inline def returnStatement(): ReturnStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("returnStatement")().asInstanceOf[ReturnStatement_]
inline def returnStatement(argument: Expression): ReturnStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("returnStatement")(argument.asInstanceOf[js.Any]).asInstanceOf[ReturnStatement_]

inline def sequenceExpression(expressions: js.Array[Expression]): SequenceExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceExpression")(expressions.asInstanceOf[js.Any]).asInstanceOf[SequenceExpression_]

inline def shallowEqual[T /* <: js.Object */](actual: js.Object, expected: T): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]

inline def spreadElement(argument: Expression): SpreadElement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("spreadElement")(argument.asInstanceOf[js.Any]).asInstanceOf[SpreadElement_]

inline def staticBlock(body: js.Array[Statement]): StaticBlock_ = ^.asInstanceOf[js.Dynamic].applyDynamic("staticBlock")(body.asInstanceOf[js.Any]).asInstanceOf[StaticBlock_]

inline def stringLiteral(value: String): StringLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("stringLiteral")(value.asInstanceOf[js.Any]).asInstanceOf[StringLiteral_]

inline def stringLiteralTypeAnnotation(value: String): StringLiteralTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("stringLiteralTypeAnnotation")(value.asInstanceOf[js.Any]).asInstanceOf[StringLiteralTypeAnnotation_]

inline def stringTypeAnnotation(): StringTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("stringTypeAnnotation")().asInstanceOf[StringTypeAnnotation_]

inline def `super`(): Super_ = ^.asInstanceOf[js.Dynamic].applyDynamic("super")().asInstanceOf[Super_]

inline def switchCase(test: Null, consequent: js.Array[Statement]): SwitchCase_ = (^.asInstanceOf[js.Dynamic].applyDynamic("switchCase")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any])).asInstanceOf[SwitchCase_]
inline def switchCase(test: Unit, consequent: js.Array[Statement]): SwitchCase_ = (^.asInstanceOf[js.Dynamic].applyDynamic("switchCase")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any])).asInstanceOf[SwitchCase_]
inline def switchCase(test: Expression, consequent: js.Array[Statement]): SwitchCase_ = (^.asInstanceOf[js.Dynamic].applyDynamic("switchCase")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any])).asInstanceOf[SwitchCase_]

inline def switchStatement(discriminant: Expression, cases: js.Array[SwitchCase_]): SwitchStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("switchStatement")(discriminant.asInstanceOf[js.Any], cases.asInstanceOf[js.Any])).asInstanceOf[SwitchStatement_]

inline def symbolTypeAnnotation(): SymbolTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("symbolTypeAnnotation")().asInstanceOf[SymbolTypeAnnotation_]

inline def taggedTemplateExpression(tag: Expression, quasi: TemplateLiteral_): TaggedTemplateExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("taggedTemplateExpression")(tag.asInstanceOf[js.Any], quasi.asInstanceOf[js.Any])).asInstanceOf[TaggedTemplateExpression_]

inline def templateElement(value: Cooked): TemplateElement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("templateElement")(value.asInstanceOf[js.Any]).asInstanceOf[TemplateElement_]
inline def templateElement(value: Cooked, tail: Boolean): TemplateElement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("templateElement")(value.asInstanceOf[js.Any], tail.asInstanceOf[js.Any])).asInstanceOf[TemplateElement_]

inline def templateLiteral(quasis: js.Array[TemplateElement_], expressions: js.Array[Expression | TSType]): TemplateLiteral_ = (^.asInstanceOf[js.Dynamic].applyDynamic("templateLiteral")(quasis.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any])).asInstanceOf[TemplateLiteral_]

inline def thisExpression(): ThisExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("thisExpression")().asInstanceOf[ThisExpression_]

inline def thisTypeAnnotation(): ThisTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("thisTypeAnnotation")().asInstanceOf[ThisTypeAnnotation_]

inline def throwStatement(argument: Expression): ThrowStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("throwStatement")(argument.asInstanceOf[js.Any]).asInstanceOf[ThrowStatement_]

inline def toBindingIdentifierName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBindingIdentifierName")().asInstanceOf[String]
inline def toBindingIdentifierName(name: ToString): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBindingIdentifierName")(name.asInstanceOf[js.Any]).asInstanceOf[String]

inline def toBlock(node: Expression): BlockStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("toBlock")(node.asInstanceOf[js.Any]).asInstanceOf[BlockStatement_]
inline def toBlock(node: Expression, parent: Function): BlockStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("toBlock")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[BlockStatement_]
inline def toBlock(node: Statement): BlockStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("toBlock")(node.asInstanceOf[js.Any]).asInstanceOf[BlockStatement_]
inline def toBlock(node: Statement, parent: Function): BlockStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("toBlock")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[BlockStatement_]

inline def toComputedKey[T /* <: Extract[Node, Computed] */](node: T): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("toComputedKey")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
inline def toComputedKey[T /* <: Extract[Node, Computed] */](node: T, key: Expression): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("toComputedKey")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Expression]
inline def toComputedKey[T /* <: Extract[Node, Computed] */](node: T, key: Identifier_): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("toComputedKey")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Expression]

inline def toExpression(node: Class): ClassExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("toExpression")(node.asInstanceOf[js.Any]).asInstanceOf[ClassExpression_]
inline def toExpression(node: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("toExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
inline def toExpression(node: ExpressionStatement_): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("toExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
inline def toExpression(node: Function): FunctionExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("toExpression")(node.asInstanceOf[js.Any]).asInstanceOf[FunctionExpression_]

inline def toExpression_Expression(node: Class): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("toExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
inline def toExpression_Expression(node: Function): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("toExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]

inline def toIdentifier(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toIdentifier")().asInstanceOf[String]
inline def toIdentifier(name: ToString): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toIdentifier")(name.asInstanceOf[js.Any]).asInstanceOf[String]

inline def toKeyAlias(node: Method): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKeyAlias")(node.asInstanceOf[js.Any]).asInstanceOf[String]
inline def toKeyAlias(node: Method, key: Node): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toKeyAlias")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
inline def toKeyAlias(node: Property): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKeyAlias")(node.asInstanceOf[js.Any]).asInstanceOf[String]
inline def toKeyAlias(node: Property, key: Node): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toKeyAlias")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]

inline def toSequenceExpression(nodes: js.Array[Node], scope: BuildUndefinedNode): js.UndefOr[SequenceExpression_] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSequenceExpression")(nodes.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SequenceExpression_]]

inline def toStatement(node: AssignmentExpression_): Statement = ^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Statement]
inline def toStatement(node: AssignmentExpression_, ignore: Boolean): Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[Statement]
inline def toStatement(node: Class): Statement = ^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Statement]
inline def toStatement(node: Class, ignore: Boolean): Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[Statement]
inline def toStatement(node: Function): Statement = ^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Statement]
inline def toStatement(node: Function, ignore: Boolean): Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[Statement]
inline def toStatement(node: Statement): Statement = ^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Statement]
inline def toStatement(node: Statement, ignore: Boolean): Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[Statement]

inline def toStatement_ClassDeclaration_(node: Class): ClassDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any]).asInstanceOf[ClassDeclaration_]
inline def toStatement_ClassDeclaration_(node: Class, ignore: Boolean): ClassDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[ClassDeclaration_]

inline def toStatement_ExpressionStatement_(node: AssignmentExpression_): ExpressionStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any]).asInstanceOf[ExpressionStatement_]
inline def toStatement_ExpressionStatement_(node: AssignmentExpression_, ignore: Boolean): ExpressionStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[ExpressionStatement_]

inline def toStatement_FunctionDeclaration_(node: Function): FunctionDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any]).asInstanceOf[FunctionDeclaration_]
inline def toStatement_FunctionDeclaration_(node: Function, ignore: Boolean): FunctionDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration_]

inline def toStatement_true(node: AssignmentExpression_, ignore: `true`): js.UndefOr[Statement] = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Statement]]
inline def toStatement_true(node: Class, ignore: `true`): js.UndefOr[ClassDeclaration_] = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ClassDeclaration_]]
inline def toStatement_true(node: Function, ignore: `true`): js.UndefOr[FunctionDeclaration_] = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FunctionDeclaration_]]
inline def toStatement_true(node: Statement, ignore: `true`): js.UndefOr[Statement] = (^.asInstanceOf[js.Dynamic].applyDynamic("toStatement")(node.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Statement]]

inline def topicReference(): TopicReference_ = ^.asInstanceOf[js.Dynamic].applyDynamic("topicReference")().asInstanceOf[TopicReference_]

inline def traverse[T](n: Node, h: TraversalHandler[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(n.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def traverse[T](n: Node, h: TraversalHandlers[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(n.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def traverse[T](n: Node, h: TraversalHandlers[T], state: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(n.asInstanceOf[js.Any], h.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def traverse[T](n: Node, h: TraversalHandler[T], state: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(n.asInstanceOf[js.Any], h.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def traverseFast[T](n: Node, h: TraversalHandler[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseFast")(n.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def traverseFast[T](n: Node, h: TraversalHandler[T], state: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseFast")(n.asInstanceOf[js.Any], h.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def tryStatement(block: BlockStatement_): TryStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tryStatement")(block.asInstanceOf[js.Any]).asInstanceOf[TryStatement_]
inline def tryStatement(block: BlockStatement_, handler: Null, finalizer: BlockStatement_): TryStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tryStatement")(block.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], finalizer.asInstanceOf[js.Any])).asInstanceOf[TryStatement_]
inline def tryStatement(block: BlockStatement_, handler: Unit, finalizer: BlockStatement_): TryStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tryStatement")(block.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], finalizer.asInstanceOf[js.Any])).asInstanceOf[TryStatement_]
inline def tryStatement(block: BlockStatement_, handler: CatchClause_): TryStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tryStatement")(block.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[TryStatement_]
inline def tryStatement(block: BlockStatement_, handler: CatchClause_, finalizer: BlockStatement_): TryStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tryStatement")(block.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], finalizer.asInstanceOf[js.Any])).asInstanceOf[TryStatement_]

inline def tsAnyKeyword(): TSAnyKeyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsAnyKeyword")().asInstanceOf[TSAnyKeyword_]

inline def tsArrayType(elementType: TSType): TSArrayType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsArrayType")(elementType.asInstanceOf[js.Any]).asInstanceOf[TSArrayType_]

inline def tsAsExpression(expression: Expression, typeAnnotation: TSType): TSAsExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsAsExpression")(expression.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSAsExpression_]

inline def tsBigIntKeyword(): TSBigIntKeyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsBigIntKeyword")().asInstanceOf[TSBigIntKeyword_]

inline def tsBooleanKeyword(): TSBooleanKeyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsBooleanKeyword")().asInstanceOf[TSBooleanKeyword_]

inline def tsCallSignatureDeclaration(typeParameters: Null, parameters: js.Array[Identifier_ | RestElement_]): TSCallSignatureDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsCallSignatureDeclaration")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSCallSignatureDeclaration_]
inline def tsCallSignatureDeclaration(
  typeParameters: Null,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSCallSignatureDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsCallSignatureDeclaration")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSCallSignatureDeclaration_]
inline def tsCallSignatureDeclaration(typeParameters: Unit, parameters: js.Array[Identifier_ | RestElement_]): TSCallSignatureDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsCallSignatureDeclaration")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSCallSignatureDeclaration_]
inline def tsCallSignatureDeclaration(
  typeParameters: Unit,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSCallSignatureDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsCallSignatureDeclaration")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSCallSignatureDeclaration_]
inline def tsCallSignatureDeclaration(typeParameters: TSTypeParameterDeclaration_, parameters: js.Array[Identifier_ | RestElement_]): TSCallSignatureDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsCallSignatureDeclaration")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSCallSignatureDeclaration_]
inline def tsCallSignatureDeclaration(
  typeParameters: TSTypeParameterDeclaration_,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSCallSignatureDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsCallSignatureDeclaration")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSCallSignatureDeclaration_]

inline def tsConditionalType(checkType: TSType, extendsType: TSType, trueType: TSType, falseType: TSType): TSConditionalType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsConditionalType")(checkType.asInstanceOf[js.Any], extendsType.asInstanceOf[js.Any], trueType.asInstanceOf[js.Any], falseType.asInstanceOf[js.Any])).asInstanceOf[TSConditionalType_]

inline def tsConstructSignatureDeclaration(typeParameters: Null, parameters: js.Array[Identifier_ | RestElement_]): TSConstructSignatureDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsConstructSignatureDeclaration")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSConstructSignatureDeclaration_]
inline def tsConstructSignatureDeclaration(
  typeParameters: Null,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSConstructSignatureDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsConstructSignatureDeclaration")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSConstructSignatureDeclaration_]
inline def tsConstructSignatureDeclaration(typeParameters: Unit, parameters: js.Array[Identifier_ | RestElement_]): TSConstructSignatureDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsConstructSignatureDeclaration")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSConstructSignatureDeclaration_]
inline def tsConstructSignatureDeclaration(
  typeParameters: Unit,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSConstructSignatureDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsConstructSignatureDeclaration")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSConstructSignatureDeclaration_]
inline def tsConstructSignatureDeclaration(typeParameters: TSTypeParameterDeclaration_, parameters: js.Array[Identifier_ | RestElement_]): TSConstructSignatureDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsConstructSignatureDeclaration")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSConstructSignatureDeclaration_]
inline def tsConstructSignatureDeclaration(
  typeParameters: TSTypeParameterDeclaration_,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSConstructSignatureDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsConstructSignatureDeclaration")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSConstructSignatureDeclaration_]

inline def tsConstructorType(typeParameters: Null, parameters: js.Array[Identifier_ | RestElement_]): TSConstructorType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsConstructorType")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSConstructorType_]
inline def tsConstructorType(
  typeParameters: Null,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSConstructorType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsConstructorType")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSConstructorType_]
inline def tsConstructorType(typeParameters: Unit, parameters: js.Array[Identifier_ | RestElement_]): TSConstructorType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsConstructorType")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSConstructorType_]
inline def tsConstructorType(
  typeParameters: Unit,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSConstructorType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsConstructorType")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSConstructorType_]
inline def tsConstructorType(typeParameters: TSTypeParameterDeclaration_, parameters: js.Array[Identifier_ | RestElement_]): TSConstructorType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsConstructorType")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSConstructorType_]
inline def tsConstructorType(
  typeParameters: TSTypeParameterDeclaration_,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSConstructorType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsConstructorType")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSConstructorType_]

inline def tsDeclareFunction(id: Null, typeParameters: Null, params: js.Array[Identifier_ | Pattern | RestElement_]): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Null,
  typeParameters: Null,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: Noop_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Null,
  typeParameters: Null,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: TSTypeAnnotation_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(id: Null, typeParameters: Unit, params: js.Array[Identifier_ | Pattern | RestElement_]): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Null,
  typeParameters: Unit,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: Noop_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Null,
  typeParameters: Unit,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: TSTypeAnnotation_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(id: Null, typeParameters: Noop_, params: js.Array[Identifier_ | Pattern | RestElement_]): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Null,
  typeParameters: Noop_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: Noop_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Null,
  typeParameters: Noop_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: TSTypeAnnotation_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Null,
  typeParameters: TSTypeParameterDeclaration_,
  params: js.Array[Identifier_ | Pattern | RestElement_]
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Null,
  typeParameters: TSTypeParameterDeclaration_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: Noop_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Null,
  typeParameters: TSTypeParameterDeclaration_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: TSTypeAnnotation_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(id: Unit, typeParameters: Null, params: js.Array[Identifier_ | Pattern | RestElement_]): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Unit,
  typeParameters: Null,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: Noop_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Unit,
  typeParameters: Null,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: TSTypeAnnotation_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(id: Unit, typeParameters: Unit, params: js.Array[Identifier_ | Pattern | RestElement_]): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Unit,
  typeParameters: Unit,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: Noop_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Unit,
  typeParameters: Unit,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: TSTypeAnnotation_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(id: Unit, typeParameters: Noop_, params: js.Array[Identifier_ | Pattern | RestElement_]): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Unit,
  typeParameters: Noop_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: Noop_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Unit,
  typeParameters: Noop_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: TSTypeAnnotation_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Unit,
  typeParameters: TSTypeParameterDeclaration_,
  params: js.Array[Identifier_ | Pattern | RestElement_]
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Unit,
  typeParameters: TSTypeParameterDeclaration_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: Noop_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Unit,
  typeParameters: TSTypeParameterDeclaration_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: TSTypeAnnotation_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(id: Identifier_, typeParameters: Null, params: js.Array[Identifier_ | Pattern | RestElement_]): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Identifier_,
  typeParameters: Null,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: Noop_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Identifier_,
  typeParameters: Null,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: TSTypeAnnotation_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(id: Identifier_, typeParameters: Unit, params: js.Array[Identifier_ | Pattern | RestElement_]): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Identifier_,
  typeParameters: Unit,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: Noop_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Identifier_,
  typeParameters: Unit,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: TSTypeAnnotation_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(id: Identifier_, typeParameters: Noop_, params: js.Array[Identifier_ | Pattern | RestElement_]): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Identifier_,
  typeParameters: Noop_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: Noop_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Identifier_,
  typeParameters: Noop_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: TSTypeAnnotation_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Identifier_,
  typeParameters: TSTypeParameterDeclaration_,
  params: js.Array[Identifier_ | Pattern | RestElement_]
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Identifier_,
  typeParameters: TSTypeParameterDeclaration_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: Noop_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]
inline def tsDeclareFunction(
  id: Identifier_,
  typeParameters: TSTypeParameterDeclaration_,
  params: js.Array[Identifier_ | Pattern | RestElement_],
  returnType: TSTypeAnnotation_
): TSDeclareFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareFunction")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareFunction_]

inline def tsDeclareMethod(
  decorators: js.UndefOr[js.Array[Decorator_] | Null],
  key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
  typeParameters: js.UndefOr[TSTypeParameterDeclaration_ | Noop_ | Null],
  params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
  returnType: js.UndefOr[TSTypeAnnotation_ | Noop_ | Null]
): TSDeclareMethod_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareMethod")(decorators.asInstanceOf[js.Any], key.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], params.asInstanceOf[js.Any], returnType.asInstanceOf[js.Any])).asInstanceOf[TSDeclareMethod_]

inline def tsEnumDeclaration(id: Identifier_, members: js.Array[TSEnumMember_]): TSEnumDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsEnumDeclaration")(id.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[TSEnumDeclaration_]

inline def tsEnumMember(id: Identifier_): TSEnumMember_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsEnumMember")(id.asInstanceOf[js.Any]).asInstanceOf[TSEnumMember_]
inline def tsEnumMember(id: Identifier_, initializer: Expression): TSEnumMember_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsEnumMember")(id.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[TSEnumMember_]
inline def tsEnumMember(id: StringLiteral_): TSEnumMember_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsEnumMember")(id.asInstanceOf[js.Any]).asInstanceOf[TSEnumMember_]
inline def tsEnumMember(id: StringLiteral_, initializer: Expression): TSEnumMember_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsEnumMember")(id.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[TSEnumMember_]

inline def tsExportAssignment(expression: Expression): TSExportAssignment_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsExportAssignment")(expression.asInstanceOf[js.Any]).asInstanceOf[TSExportAssignment_]

inline def tsExpressionWithTypeArguments(expression: TSEntityName): TSExpressionWithTypeArguments_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsExpressionWithTypeArguments")(expression.asInstanceOf[js.Any]).asInstanceOf[TSExpressionWithTypeArguments_]
inline def tsExpressionWithTypeArguments(expression: TSEntityName, typeParameters: TSTypeParameterInstantiation_): TSExpressionWithTypeArguments_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsExpressionWithTypeArguments")(expression.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[TSExpressionWithTypeArguments_]

inline def tsExternalModuleReference(expression: StringLiteral_): TSExternalModuleReference_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsExternalModuleReference")(expression.asInstanceOf[js.Any]).asInstanceOf[TSExternalModuleReference_]

inline def tsFunctionType(typeParameters: Null, parameters: js.Array[Identifier_ | RestElement_]): TSFunctionType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsFunctionType")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSFunctionType_]
inline def tsFunctionType(
  typeParameters: Null,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSFunctionType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsFunctionType")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSFunctionType_]
inline def tsFunctionType(typeParameters: Unit, parameters: js.Array[Identifier_ | RestElement_]): TSFunctionType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsFunctionType")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSFunctionType_]
inline def tsFunctionType(
  typeParameters: Unit,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSFunctionType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsFunctionType")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSFunctionType_]
inline def tsFunctionType(typeParameters: TSTypeParameterDeclaration_, parameters: js.Array[Identifier_ | RestElement_]): TSFunctionType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsFunctionType")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSFunctionType_]
inline def tsFunctionType(
  typeParameters: TSTypeParameterDeclaration_,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSFunctionType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsFunctionType")(typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSFunctionType_]

inline def tsImportEqualsDeclaration(id: Identifier_, moduleReference: TSEntityName): TSImportEqualsDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsImportEqualsDeclaration")(id.asInstanceOf[js.Any], moduleReference.asInstanceOf[js.Any])).asInstanceOf[TSImportEqualsDeclaration_]
inline def tsImportEqualsDeclaration(id: Identifier_, moduleReference: TSExternalModuleReference_): TSImportEqualsDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsImportEqualsDeclaration")(id.asInstanceOf[js.Any], moduleReference.asInstanceOf[js.Any])).asInstanceOf[TSImportEqualsDeclaration_]

inline def tsImportType(argument: StringLiteral_): TSImportType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsImportType")(argument.asInstanceOf[js.Any]).asInstanceOf[TSImportType_]
inline def tsImportType(argument: StringLiteral_, qualifier: Null, typeParameters: TSTypeParameterInstantiation_): TSImportType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsImportType")(argument.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[TSImportType_]
inline def tsImportType(argument: StringLiteral_, qualifier: Unit, typeParameters: TSTypeParameterInstantiation_): TSImportType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsImportType")(argument.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[TSImportType_]
inline def tsImportType(argument: StringLiteral_, qualifier: TSEntityName): TSImportType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsImportType")(argument.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any])).asInstanceOf[TSImportType_]
inline def tsImportType(argument: StringLiteral_, qualifier: TSEntityName, typeParameters: TSTypeParameterInstantiation_): TSImportType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsImportType")(argument.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[TSImportType_]

inline def tsIndexSignature(parameters: js.Array[Identifier_]): TSIndexSignature_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsIndexSignature")(parameters.asInstanceOf[js.Any]).asInstanceOf[TSIndexSignature_]
inline def tsIndexSignature(parameters: js.Array[Identifier_], typeAnnotation: TSTypeAnnotation_): TSIndexSignature_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsIndexSignature")(parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSIndexSignature_]

inline def tsIndexedAccessType(objectType: TSType, indexType: TSType): TSIndexedAccessType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsIndexedAccessType")(objectType.asInstanceOf[js.Any], indexType.asInstanceOf[js.Any])).asInstanceOf[TSIndexedAccessType_]

inline def tsInferType(typeParameter: TSTypeParameter_): TSInferType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsInferType")(typeParameter.asInstanceOf[js.Any]).asInstanceOf[TSInferType_]

inline def tsInstantiationExpression(expression: Expression): TSInstantiationExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsInstantiationExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[TSInstantiationExpression_]
inline def tsInstantiationExpression(expression: Expression, typeParameters: TSTypeParameterInstantiation_): TSInstantiationExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsInstantiationExpression")(expression.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[TSInstantiationExpression_]

inline def tsInterfaceBody(body: js.Array[TSTypeElement]): TSInterfaceBody_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsInterfaceBody")(body.asInstanceOf[js.Any]).asInstanceOf[TSInterfaceBody_]

inline def tsInterfaceDeclaration(
  id: Identifier_,
  typeParameters: Null,
  _extends: js.Array[TSExpressionWithTypeArguments_],
  body: TSInterfaceBody_
): TSInterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsInterfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[TSInterfaceDeclaration_]
inline def tsInterfaceDeclaration(id: Identifier_, typeParameters: Null, _extends: Null, body: TSInterfaceBody_): TSInterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsInterfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[TSInterfaceDeclaration_]
inline def tsInterfaceDeclaration(id: Identifier_, typeParameters: Null, _extends: Unit, body: TSInterfaceBody_): TSInterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsInterfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[TSInterfaceDeclaration_]
inline def tsInterfaceDeclaration(
  id: Identifier_,
  typeParameters: Unit,
  _extends: js.Array[TSExpressionWithTypeArguments_],
  body: TSInterfaceBody_
): TSInterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsInterfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[TSInterfaceDeclaration_]
inline def tsInterfaceDeclaration(id: Identifier_, typeParameters: Unit, _extends: Null, body: TSInterfaceBody_): TSInterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsInterfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[TSInterfaceDeclaration_]
inline def tsInterfaceDeclaration(id: Identifier_, typeParameters: Unit, _extends: Unit, body: TSInterfaceBody_): TSInterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsInterfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[TSInterfaceDeclaration_]
inline def tsInterfaceDeclaration(
  id: Identifier_,
  typeParameters: TSTypeParameterDeclaration_,
  _extends: js.Array[TSExpressionWithTypeArguments_],
  body: TSInterfaceBody_
): TSInterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsInterfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[TSInterfaceDeclaration_]
inline def tsInterfaceDeclaration(
  id: Identifier_,
  typeParameters: TSTypeParameterDeclaration_,
  _extends: Null,
  body: TSInterfaceBody_
): TSInterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsInterfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[TSInterfaceDeclaration_]
inline def tsInterfaceDeclaration(
  id: Identifier_,
  typeParameters: TSTypeParameterDeclaration_,
  _extends: Unit,
  body: TSInterfaceBody_
): TSInterfaceDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsInterfaceDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], _extends.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[TSInterfaceDeclaration_]

inline def tsIntersectionType(types: js.Array[TSType]): TSIntersectionType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsIntersectionType")(types.asInstanceOf[js.Any]).asInstanceOf[TSIntersectionType_]

inline def tsIntrinsicKeyword(): TSIntrinsicKeyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsIntrinsicKeyword")().asInstanceOf[TSIntrinsicKeyword_]

inline def tsLiteralType(literal: BigIntLiteral_): TSLiteralType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsLiteralType")(literal.asInstanceOf[js.Any]).asInstanceOf[TSLiteralType_]
inline def tsLiteralType(literal: BooleanLiteral_): TSLiteralType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsLiteralType")(literal.asInstanceOf[js.Any]).asInstanceOf[TSLiteralType_]
inline def tsLiteralType(literal: NumericLiteral_): TSLiteralType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsLiteralType")(literal.asInstanceOf[js.Any]).asInstanceOf[TSLiteralType_]
inline def tsLiteralType(literal: StringLiteral_): TSLiteralType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsLiteralType")(literal.asInstanceOf[js.Any]).asInstanceOf[TSLiteralType_]
inline def tsLiteralType(literal: TemplateLiteral_): TSLiteralType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsLiteralType")(literal.asInstanceOf[js.Any]).asInstanceOf[TSLiteralType_]
inline def tsLiteralType(literal: UnaryExpression_): TSLiteralType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsLiteralType")(literal.asInstanceOf[js.Any]).asInstanceOf[TSLiteralType_]

inline def tsMappedType(typeParameter: TSTypeParameter_): TSMappedType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsMappedType")(typeParameter.asInstanceOf[js.Any]).asInstanceOf[TSMappedType_]
inline def tsMappedType(typeParameter: TSTypeParameter_, typeAnnotation: Null, nameType: TSType): TSMappedType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsMappedType")(typeParameter.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any], nameType.asInstanceOf[js.Any])).asInstanceOf[TSMappedType_]
inline def tsMappedType(typeParameter: TSTypeParameter_, typeAnnotation: Unit, nameType: TSType): TSMappedType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsMappedType")(typeParameter.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any], nameType.asInstanceOf[js.Any])).asInstanceOf[TSMappedType_]
inline def tsMappedType(typeParameter: TSTypeParameter_, typeAnnotation: TSType): TSMappedType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsMappedType")(typeParameter.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSMappedType_]
inline def tsMappedType(typeParameter: TSTypeParameter_, typeAnnotation: TSType, nameType: TSType): TSMappedType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsMappedType")(typeParameter.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any], nameType.asInstanceOf[js.Any])).asInstanceOf[TSMappedType_]

inline def tsMethodSignature(key: Expression, typeParameters: Null, parameters: js.Array[Identifier_ | RestElement_]): TSMethodSignature_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsMethodSignature")(key.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSMethodSignature_]
inline def tsMethodSignature(
  key: Expression,
  typeParameters: Null,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSMethodSignature_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsMethodSignature")(key.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSMethodSignature_]
inline def tsMethodSignature(key: Expression, typeParameters: Unit, parameters: js.Array[Identifier_ | RestElement_]): TSMethodSignature_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsMethodSignature")(key.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSMethodSignature_]
inline def tsMethodSignature(
  key: Expression,
  typeParameters: Unit,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSMethodSignature_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsMethodSignature")(key.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSMethodSignature_]
inline def tsMethodSignature(
  key: Expression,
  typeParameters: TSTypeParameterDeclaration_,
  parameters: js.Array[Identifier_ | RestElement_]
): TSMethodSignature_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsMethodSignature")(key.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[TSMethodSignature_]
inline def tsMethodSignature(
  key: Expression,
  typeParameters: TSTypeParameterDeclaration_,
  parameters: js.Array[Identifier_ | RestElement_],
  typeAnnotation: TSTypeAnnotation_
): TSMethodSignature_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsMethodSignature")(key.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSMethodSignature_]

inline def tsModuleBlock(body: js.Array[Statement]): TSModuleBlock_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsModuleBlock")(body.asInstanceOf[js.Any]).asInstanceOf[TSModuleBlock_]

inline def tsModuleDeclaration(id: Identifier_, body: TSModuleBlock_): TSModuleDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsModuleDeclaration")(id.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[TSModuleDeclaration_]
inline def tsModuleDeclaration(id: Identifier_, body: TSModuleDeclaration_): TSModuleDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsModuleDeclaration")(id.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[TSModuleDeclaration_]
inline def tsModuleDeclaration(id: StringLiteral_, body: TSModuleBlock_): TSModuleDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsModuleDeclaration")(id.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[TSModuleDeclaration_]
inline def tsModuleDeclaration(id: StringLiteral_, body: TSModuleDeclaration_): TSModuleDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsModuleDeclaration")(id.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[TSModuleDeclaration_]

inline def tsNamedTupleMember(label: Identifier_, elementType: TSType): TSNamedTupleMember_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsNamedTupleMember")(label.asInstanceOf[js.Any], elementType.asInstanceOf[js.Any])).asInstanceOf[TSNamedTupleMember_]
inline def tsNamedTupleMember(label: Identifier_, elementType: TSType, optional: Boolean): TSNamedTupleMember_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsNamedTupleMember")(label.asInstanceOf[js.Any], elementType.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[TSNamedTupleMember_]

inline def tsNamespaceExportDeclaration(id: Identifier_): TSNamespaceExportDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsNamespaceExportDeclaration")(id.asInstanceOf[js.Any]).asInstanceOf[TSNamespaceExportDeclaration_]

inline def tsNeverKeyword(): TSNeverKeyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsNeverKeyword")().asInstanceOf[TSNeverKeyword_]

inline def tsNonNullExpression(expression: Expression): TSNonNullExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsNonNullExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[TSNonNullExpression_]

inline def tsNullKeyword(): TSNullKeyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsNullKeyword")().asInstanceOf[TSNullKeyword_]

inline def tsNumberKeyword(): TSNumberKeyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsNumberKeyword")().asInstanceOf[TSNumberKeyword_]

inline def tsObjectKeyword(): TSObjectKeyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsObjectKeyword")().asInstanceOf[TSObjectKeyword_]

inline def tsOptionalType(typeAnnotation: TSType): TSOptionalType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsOptionalType")(typeAnnotation.asInstanceOf[js.Any]).asInstanceOf[TSOptionalType_]

inline def tsParameterProperty(parameter: AssignmentPattern_): TSParameterProperty_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParameterProperty")(parameter.asInstanceOf[js.Any]).asInstanceOf[TSParameterProperty_]
inline def tsParameterProperty(parameter: Identifier_): TSParameterProperty_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParameterProperty")(parameter.asInstanceOf[js.Any]).asInstanceOf[TSParameterProperty_]

inline def tsParenthesizedType(typeAnnotation: TSType): TSParenthesizedType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParenthesizedType")(typeAnnotation.asInstanceOf[js.Any]).asInstanceOf[TSParenthesizedType_]

inline def tsPropertySignature(key: Expression): TSPropertySignature_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsPropertySignature")(key.asInstanceOf[js.Any]).asInstanceOf[TSPropertySignature_]
inline def tsPropertySignature(key: Expression, typeAnnotation: Null, initializer: Expression): TSPropertySignature_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsPropertySignature")(key.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[TSPropertySignature_]
inline def tsPropertySignature(key: Expression, typeAnnotation: Unit, initializer: Expression): TSPropertySignature_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsPropertySignature")(key.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[TSPropertySignature_]
inline def tsPropertySignature(key: Expression, typeAnnotation: TSTypeAnnotation_): TSPropertySignature_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsPropertySignature")(key.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSPropertySignature_]
inline def tsPropertySignature(key: Expression, typeAnnotation: TSTypeAnnotation_, initializer: Expression): TSPropertySignature_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsPropertySignature")(key.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[TSPropertySignature_]

inline def tsQualifiedName(left: TSEntityName, right: Identifier_): TSQualifiedName_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsQualifiedName")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[TSQualifiedName_]

inline def tsRestType(typeAnnotation: TSType): TSRestType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsRestType")(typeAnnotation.asInstanceOf[js.Any]).asInstanceOf[TSRestType_]

inline def tsSatisfiesExpression(expression: Expression, typeAnnotation: TSType): TSSatisfiesExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsSatisfiesExpression")(expression.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSSatisfiesExpression_]

inline def tsStringKeyword(): TSStringKeyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsStringKeyword")().asInstanceOf[TSStringKeyword_]

inline def tsSymbolKeyword(): TSSymbolKeyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsSymbolKeyword")().asInstanceOf[TSSymbolKeyword_]

inline def tsThisType(): TSThisType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsThisType")().asInstanceOf[TSThisType_]

inline def tsTupleType(elementTypes: js.Array[TSType | TSNamedTupleMember_]): TSTupleType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTupleType")(elementTypes.asInstanceOf[js.Any]).asInstanceOf[TSTupleType_]

inline def tsTypeAliasDeclaration(id: Identifier_, typeParameters: Null, typeAnnotation: TSType): TSTypeAliasDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeAliasDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSTypeAliasDeclaration_]
inline def tsTypeAliasDeclaration(id: Identifier_, typeParameters: Unit, typeAnnotation: TSType): TSTypeAliasDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeAliasDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSTypeAliasDeclaration_]
inline def tsTypeAliasDeclaration(id: Identifier_, typeParameters: TSTypeParameterDeclaration_, typeAnnotation: TSType): TSTypeAliasDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeAliasDeclaration")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSTypeAliasDeclaration_]

inline def tsTypeAnnotation(typeAnnotation: TSType): TSTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeAnnotation")(typeAnnotation.asInstanceOf[js.Any]).asInstanceOf[TSTypeAnnotation_]

inline def tsTypeAssertion(typeAnnotation: TSType, expression: Expression): TSTypeAssertion_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeAssertion")(typeAnnotation.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[TSTypeAssertion_]

inline def tsTypeLiteral(members: js.Array[TSTypeElement]): TSTypeLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeLiteral")(members.asInstanceOf[js.Any]).asInstanceOf[TSTypeLiteral_]

inline def tsTypeOperator(typeAnnotation: TSType): TSTypeOperator_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeOperator")(typeAnnotation.asInstanceOf[js.Any]).asInstanceOf[TSTypeOperator_]

inline def tsTypeParameter(constraint: Null, _default: Null, name: String): TSTypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeParameter")(constraint.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TSTypeParameter_]
inline def tsTypeParameter(constraint: Null, _default: Unit, name: String): TSTypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeParameter")(constraint.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TSTypeParameter_]
inline def tsTypeParameter(constraint: Null, _default: TSType, name: String): TSTypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeParameter")(constraint.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TSTypeParameter_]
inline def tsTypeParameter(constraint: Unit, _default: Null, name: String): TSTypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeParameter")(constraint.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TSTypeParameter_]
inline def tsTypeParameter(constraint: Unit, _default: Unit, name: String): TSTypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeParameter")(constraint.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TSTypeParameter_]
inline def tsTypeParameter(constraint: Unit, _default: TSType, name: String): TSTypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeParameter")(constraint.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TSTypeParameter_]
inline def tsTypeParameter(constraint: TSType, _default: Null, name: String): TSTypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeParameter")(constraint.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TSTypeParameter_]
inline def tsTypeParameter(constraint: TSType, _default: Unit, name: String): TSTypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeParameter")(constraint.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TSTypeParameter_]
inline def tsTypeParameter(constraint: TSType, _default: TSType, name: String): TSTypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeParameter")(constraint.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TSTypeParameter_]

inline def tsTypeParameterDeclaration(params: js.Array[TSTypeParameter_]): TSTypeParameterDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeParameterDeclaration")(params.asInstanceOf[js.Any]).asInstanceOf[TSTypeParameterDeclaration_]

inline def tsTypeParameterInstantiation(params: js.Array[TSType]): TSTypeParameterInstantiation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeParameterInstantiation")(params.asInstanceOf[js.Any]).asInstanceOf[TSTypeParameterInstantiation_]

inline def tsTypePredicate(parameterName: Identifier_): TSTypePredicate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTypePredicate")(parameterName.asInstanceOf[js.Any]).asInstanceOf[TSTypePredicate_]
inline def tsTypePredicate(parameterName: Identifier_, typeAnnotation: Null, asserts: Boolean): TSTypePredicate_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypePredicate")(parameterName.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any], asserts.asInstanceOf[js.Any])).asInstanceOf[TSTypePredicate_]
inline def tsTypePredicate(parameterName: Identifier_, typeAnnotation: Unit, asserts: Boolean): TSTypePredicate_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypePredicate")(parameterName.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any], asserts.asInstanceOf[js.Any])).asInstanceOf[TSTypePredicate_]
inline def tsTypePredicate(parameterName: Identifier_, typeAnnotation: TSTypeAnnotation_): TSTypePredicate_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypePredicate")(parameterName.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSTypePredicate_]
inline def tsTypePredicate(parameterName: Identifier_, typeAnnotation: TSTypeAnnotation_, asserts: Boolean): TSTypePredicate_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypePredicate")(parameterName.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any], asserts.asInstanceOf[js.Any])).asInstanceOf[TSTypePredicate_]
inline def tsTypePredicate(parameterName: TSThisType_): TSTypePredicate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTypePredicate")(parameterName.asInstanceOf[js.Any]).asInstanceOf[TSTypePredicate_]
inline def tsTypePredicate(parameterName: TSThisType_, typeAnnotation: Null, asserts: Boolean): TSTypePredicate_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypePredicate")(parameterName.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any], asserts.asInstanceOf[js.Any])).asInstanceOf[TSTypePredicate_]
inline def tsTypePredicate(parameterName: TSThisType_, typeAnnotation: Unit, asserts: Boolean): TSTypePredicate_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypePredicate")(parameterName.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any], asserts.asInstanceOf[js.Any])).asInstanceOf[TSTypePredicate_]
inline def tsTypePredicate(parameterName: TSThisType_, typeAnnotation: TSTypeAnnotation_): TSTypePredicate_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypePredicate")(parameterName.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TSTypePredicate_]
inline def tsTypePredicate(parameterName: TSThisType_, typeAnnotation: TSTypeAnnotation_, asserts: Boolean): TSTypePredicate_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypePredicate")(parameterName.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any], asserts.asInstanceOf[js.Any])).asInstanceOf[TSTypePredicate_]

inline def tsTypeQuery(exprName: TSEntityName): TSTypeQuery_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeQuery")(exprName.asInstanceOf[js.Any]).asInstanceOf[TSTypeQuery_]
inline def tsTypeQuery(exprName: TSEntityName, typeParameters: TSTypeParameterInstantiation_): TSTypeQuery_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeQuery")(exprName.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[TSTypeQuery_]
inline def tsTypeQuery(exprName: TSImportType_): TSTypeQuery_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeQuery")(exprName.asInstanceOf[js.Any]).asInstanceOf[TSTypeQuery_]
inline def tsTypeQuery(exprName: TSImportType_, typeParameters: TSTypeParameterInstantiation_): TSTypeQuery_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeQuery")(exprName.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[TSTypeQuery_]

inline def tsTypeReference(typeName: TSEntityName): TSTypeReference_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeReference")(typeName.asInstanceOf[js.Any]).asInstanceOf[TSTypeReference_]
inline def tsTypeReference(typeName: TSEntityName, typeParameters: TSTypeParameterInstantiation_): TSTypeReference_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tsTypeReference")(typeName.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[TSTypeReference_]

inline def tsUndefinedKeyword(): TSUndefinedKeyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsUndefinedKeyword")().asInstanceOf[TSUndefinedKeyword_]

inline def tsUnionType(types: js.Array[TSType]): TSUnionType_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsUnionType")(types.asInstanceOf[js.Any]).asInstanceOf[TSUnionType_]

inline def tsUnknownKeyword(): TSUnknownKeyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsUnknownKeyword")().asInstanceOf[TSUnknownKeyword_]

inline def tsVoidKeyword(): TSVoidKeyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tsVoidKeyword")().asInstanceOf[TSVoidKeyword_]

inline def tupleExpression(): TupleExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tupleExpression")().asInstanceOf[TupleExpression_]
inline def tupleExpression(elements: js.Array[Expression | SpreadElement_]): TupleExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tupleExpression")(elements.asInstanceOf[js.Any]).asInstanceOf[TupleExpression_]

inline def tupleTypeAnnotation(types: js.Array[FlowType]): TupleTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tupleTypeAnnotation")(types.asInstanceOf[js.Any]).asInstanceOf[TupleTypeAnnotation_]

inline def typeAlias(id: Identifier_, typeParameters: Null, right: FlowType): TypeAlias_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeAlias")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[TypeAlias_]
inline def typeAlias(id: Identifier_, typeParameters: Unit, right: FlowType): TypeAlias_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeAlias")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[TypeAlias_]
inline def typeAlias(id: Identifier_, typeParameters: TypeParameterDeclaration_, right: FlowType): TypeAlias_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeAlias")(id.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[TypeAlias_]

inline def typeAnnotation(typeAnnotation: FlowType): TypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any]).asInstanceOf[TypeAnnotation_]

inline def typeCastExpression(expression: Expression, typeAnnotation: TypeAnnotation_): TypeCastExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeCastExpression")(expression.asInstanceOf[js.Any], typeAnnotation.asInstanceOf[js.Any])).asInstanceOf[TypeCastExpression_]

inline def typeParameter(): TypeParameter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("typeParameter")().asInstanceOf[TypeParameter_]
inline def typeParameter(bound: Null, _default: Null, variance: Variance_): TypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeParameter")(bound.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[TypeParameter_]
inline def typeParameter(bound: Null, _default: Unit, variance: Variance_): TypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeParameter")(bound.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[TypeParameter_]
inline def typeParameter(bound: Null, _default: FlowType): TypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeParameter")(bound.asInstanceOf[js.Any], _default.asInstanceOf[js.Any])).asInstanceOf[TypeParameter_]
inline def typeParameter(bound: Null, _default: FlowType, variance: Variance_): TypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeParameter")(bound.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[TypeParameter_]
inline def typeParameter(bound: Unit, _default: Null, variance: Variance_): TypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeParameter")(bound.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[TypeParameter_]
inline def typeParameter(bound: Unit, _default: Unit, variance: Variance_): TypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeParameter")(bound.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[TypeParameter_]
inline def typeParameter(bound: Unit, _default: FlowType): TypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeParameter")(bound.asInstanceOf[js.Any], _default.asInstanceOf[js.Any])).asInstanceOf[TypeParameter_]
inline def typeParameter(bound: Unit, _default: FlowType, variance: Variance_): TypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeParameter")(bound.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[TypeParameter_]
inline def typeParameter(bound: TypeAnnotation_): TypeParameter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("typeParameter")(bound.asInstanceOf[js.Any]).asInstanceOf[TypeParameter_]
inline def typeParameter(bound: TypeAnnotation_, _default: Null, variance: Variance_): TypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeParameter")(bound.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[TypeParameter_]
inline def typeParameter(bound: TypeAnnotation_, _default: Unit, variance: Variance_): TypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeParameter")(bound.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[TypeParameter_]
inline def typeParameter(bound: TypeAnnotation_, _default: FlowType): TypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeParameter")(bound.asInstanceOf[js.Any], _default.asInstanceOf[js.Any])).asInstanceOf[TypeParameter_]
inline def typeParameter(bound: TypeAnnotation_, _default: FlowType, variance: Variance_): TypeParameter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeParameter")(bound.asInstanceOf[js.Any], _default.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[TypeParameter_]

inline def typeParameterDeclaration(params: js.Array[TypeParameter_]): TypeParameterDeclaration_ = ^.asInstanceOf[js.Dynamic].applyDynamic("typeParameterDeclaration")(params.asInstanceOf[js.Any]).asInstanceOf[TypeParameterDeclaration_]

inline def typeParameterInstantiation(params: js.Array[FlowType]): TypeParameterInstantiation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("typeParameterInstantiation")(params.asInstanceOf[js.Any]).asInstanceOf[TypeParameterInstantiation_]

inline def typeofTypeAnnotation(argument: FlowType): TypeofTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("typeofTypeAnnotation")(argument.asInstanceOf[js.Any]).asInstanceOf[TypeofTypeAnnotation_]

inline def unaryExpression(
  operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
  argument: Expression
): UnaryExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("unaryExpression")(operator.asInstanceOf[js.Any], argument.asInstanceOf[js.Any])).asInstanceOf[UnaryExpression_]
inline def unaryExpression(
  operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
  argument: Expression,
  prefix: Boolean
): UnaryExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("unaryExpression")(operator.asInstanceOf[js.Any], argument.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[UnaryExpression_]

inline def unionTypeAnnotation(types: js.Array[FlowType]): UnionTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("unionTypeAnnotation")(types.asInstanceOf[js.Any]).asInstanceOf[UnionTypeAnnotation_]

inline def updateExpression(operator: PlussignPlussign | `--`, argument: Expression): UpdateExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("updateExpression")(operator.asInstanceOf[js.Any], argument.asInstanceOf[js.Any])).asInstanceOf[UpdateExpression_]
inline def updateExpression(operator: PlussignPlussign | `--`, argument: Expression, prefix: Boolean): UpdateExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("updateExpression")(operator.asInstanceOf[js.Any], argument.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[UpdateExpression_]

inline def v8IntrinsicIdentifier(name: String): V8IntrinsicIdentifier_ = ^.asInstanceOf[js.Dynamic].applyDynamic("v8IntrinsicIdentifier")(name.asInstanceOf[js.Any]).asInstanceOf[V8IntrinsicIdentifier_]

inline def validate(n: Node, key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(n.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def validate[T /* <: Node */, K /* <: /* keyof T */ String */](
  n: Null,
  key: K,
  value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(n.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def validate[T /* <: Node */, K /* <: /* keyof T */ String */](
  n: Unit,
  key: K,
  value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(n.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def validate[T /* <: Node */, K /* <: /* keyof T */ String */](
  n: Node,
  key: K,
  value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(n.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def valueToNode(): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("valueToNode")().asInstanceOf[Expression]
inline def valueToNode(value: String): StringLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("valueToNode")(value.asInstanceOf[js.Any]).asInstanceOf[StringLiteral_]
inline def valueToNode(value: js.Array[js.UndefOr[Boolean | Null | String | Double | js.RegExp | js.Object]]): ArrayExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("valueToNode")(value.asInstanceOf[js.Any]).asInstanceOf[ArrayExpression_]
inline def valueToNode(value: js.Object): ObjectExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("valueToNode")(value.asInstanceOf[js.Any]).asInstanceOf[ObjectExpression_]
inline def valueToNode(value: js.RegExp): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("valueToNode")(value.asInstanceOf[js.Any]).asInstanceOf[Expression]
inline def valueToNode(value: Boolean): BooleanLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("valueToNode")(value.asInstanceOf[js.Any]).asInstanceOf[BooleanLiteral_]
inline def valueToNode(value: Double): NumericLiteral_ | BinaryExpression_ | UnaryExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("valueToNode")(value.asInstanceOf[js.Any]).asInstanceOf[NumericLiteral_ | BinaryExpression_ | UnaryExpression_]
inline def valueToNode(value: Null): NullLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("valueToNode")(value.asInstanceOf[js.Any]).asInstanceOf[NullLiteral_]
inline def valueToNode(value: Unit): Identifier_ = ^.asInstanceOf[js.Dynamic].applyDynamic("valueToNode")(value.asInstanceOf[js.Any]).asInstanceOf[Identifier_]

inline def valueToNode_Expression(value: String): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("valueToNode")(value.asInstanceOf[js.Any]).asInstanceOf[Expression]
inline def valueToNode_Expression(value: js.Object): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("valueToNode")(value.asInstanceOf[js.Any]).asInstanceOf[Expression]
inline def valueToNode_Expression(value: Boolean): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("valueToNode")(value.asInstanceOf[js.Any]).asInstanceOf[Expression]
inline def valueToNode_Expression(value: Double): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("valueToNode")(value.asInstanceOf[js.Any]).asInstanceOf[Expression]

inline def valueToNode_RegExpLiteral_(value: js.RegExp): RegExpLiteral_ = ^.asInstanceOf[js.Dynamic].applyDynamic("valueToNode")(value.asInstanceOf[js.Any]).asInstanceOf[RegExpLiteral_]

inline def variableDeclaration(kind: `var` | let | const | `using` | (`await using`), declarations: js.Array[VariableDeclarator_]): VariableDeclaration_ = (^.asInstanceOf[js.Dynamic].applyDynamic("variableDeclaration")(kind.asInstanceOf[js.Any], declarations.asInstanceOf[js.Any])).asInstanceOf[VariableDeclaration_]

inline def variableDeclarator(id: LVal): VariableDeclarator_ = ^.asInstanceOf[js.Dynamic].applyDynamic("variableDeclarator")(id.asInstanceOf[js.Any]).asInstanceOf[VariableDeclarator_]
inline def variableDeclarator(id: LVal, init: Expression): VariableDeclarator_ = (^.asInstanceOf[js.Dynamic].applyDynamic("variableDeclarator")(id.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[VariableDeclarator_]

inline def variance(kind: minus | plus): Variance_ = ^.asInstanceOf[js.Dynamic].applyDynamic("variance")(kind.asInstanceOf[js.Any]).asInstanceOf[Variance_]

inline def voidTypeAnnotation(): VoidTypeAnnotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("voidTypeAnnotation")().asInstanceOf[VoidTypeAnnotation_]

inline def whileStatement(test: Expression, body: Statement): WhileStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("whileStatement")(test.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[WhileStatement_]

inline def withStatement(`object`: Expression, body: Statement): WithStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("withStatement")(`object`.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[WithStatement_]

inline def yieldExpression(): YieldExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("yieldExpression")().asInstanceOf[YieldExpression_]
inline def yieldExpression(argument: Null, delegate: Boolean): YieldExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("yieldExpression")(argument.asInstanceOf[js.Any], delegate.asInstanceOf[js.Any])).asInstanceOf[YieldExpression_]
inline def yieldExpression(argument: Unit, delegate: Boolean): YieldExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("yieldExpression")(argument.asInstanceOf[js.Any], delegate.asInstanceOf[js.Any])).asInstanceOf[YieldExpression_]
inline def yieldExpression(argument: Expression): YieldExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("yieldExpression")(argument.asInstanceOf[js.Any]).asInstanceOf[YieldExpression_]
inline def yieldExpression(argument: Expression, delegate: Boolean): YieldExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("yieldExpression")(argument.asInstanceOf[js.Any], delegate.asInstanceOf[js.Any])).asInstanceOf[YieldExpression_]

type Accessor = ClassAccessorProperty_

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.Accessor
  - typings.babelTypes.mod.AnyTypeAnnotation_
  - typings.babelTypes.mod.ArgumentPlaceholder_
  - typings.babelTypes.mod.ArrayExpression_
  - typings.babelTypes.mod.ArrayPattern_
  - typings.babelTypes.mod.ArrayTypeAnnotation_
  - typings.babelTypes.mod.ArrowFunctionExpression_
  - typings.babelTypes.mod.AssignmentExpression_
  - typings.babelTypes.mod.AssignmentPattern_
  - typings.babelTypes.mod.AwaitExpression_
  - typings.babelTypes.mod.BigIntLiteral_
  - typings.babelTypes.mod.Binary
  - typings.babelTypes.mod.BinaryExpression_
  - typings.babelTypes.mod.BindExpression_
  - typings.babelTypes.mod.Block
  - typings.babelTypes.mod.BlockParent
  - typings.babelTypes.mod.BlockStatement_
  - typings.babelTypes.mod.BooleanLiteral_
  - typings.babelTypes.mod.BooleanLiteralTypeAnnotation_
  - typings.babelTypes.mod.BooleanTypeAnnotation_
  - typings.babelTypes.mod.BreakStatement_
  - typings.babelTypes.mod.CallExpression_
  - typings.babelTypes.mod.CatchClause_
  - typings.babelTypes.mod.Class
  - typings.babelTypes.mod.ClassAccessorProperty_
  - typings.babelTypes.mod.ClassBody_
  - typings.babelTypes.mod.ClassDeclaration_
  - typings.babelTypes.mod.ClassExpression_
  - typings.babelTypes.mod.ClassImplements_
  - typings.babelTypes.mod.ClassMethod_
  - typings.babelTypes.mod.ClassPrivateMethod_
  - typings.babelTypes.mod.ClassPrivateProperty_
  - typings.babelTypes.mod.ClassProperty_
  - typings.babelTypes.mod.CompletionStatement
  - typings.babelTypes.mod.Conditional
  - typings.babelTypes.mod.ConditionalExpression_
  - typings.babelTypes.mod.ContinueStatement_
  - typings.babelTypes.mod.DebuggerStatement_
  - typings.babelTypes.mod.DecimalLiteral_
  - typings.babelTypes.mod.Declaration
  - typings.babelTypes.mod.DeclareClass_
  - typings.babelTypes.mod.DeclareExportAllDeclaration_
  - typings.babelTypes.mod.DeclareExportDeclaration_
  - typings.babelTypes.mod.DeclareFunction_
  - typings.babelTypes.mod.DeclareInterface_
  - typings.babelTypes.mod.DeclareModule_
  - typings.babelTypes.mod.DeclareModuleExports_
  - typings.babelTypes.mod.DeclareOpaqueType_
  - typings.babelTypes.mod.DeclareTypeAlias_
  - typings.babelTypes.mod.DeclareVariable_
  - typings.babelTypes.mod.DeclaredPredicate_
  - typings.babelTypes.mod.Decorator_
  - typings.babelTypes.mod.Directive_
  - typings.babelTypes.mod.DirectiveLiteral_
  - typings.babelTypes.mod.DoExpression_
  - typings.babelTypes.mod.DoWhileStatement_
  - typings.babelTypes.mod.EmptyStatement_
  - typings.babelTypes.mod.EmptyTypeAnnotation_
  - typings.babelTypes.mod.EnumBody
  - typings.babelTypes.mod.EnumBooleanBody_
  - typings.babelTypes.mod.EnumBooleanMember_
  - typings.babelTypes.mod.EnumDeclaration_
  - typings.babelTypes.mod.EnumDefaultedMember_
  - typings.babelTypes.mod.EnumMember
  - typings.babelTypes.mod.EnumNumberBody_
  - typings.babelTypes.mod.EnumNumberMember_
  - typings.babelTypes.mod.EnumStringBody_
  - typings.babelTypes.mod.EnumStringMember_
  - typings.babelTypes.mod.EnumSymbolBody_
  - typings.babelTypes.mod.ExistsTypeAnnotation_
  - typings.babelTypes.mod.ExportAllDeclaration_
  - typings.babelTypes.mod.ExportDeclaration
  - typings.babelTypes.mod.ExportDefaultDeclaration_
  - typings.babelTypes.mod.ExportDefaultSpecifier_
  - typings.babelTypes.mod.ExportNamedDeclaration_
  - typings.babelTypes.mod.ExportNamespaceSpecifier_
  - typings.babelTypes.mod.ExportSpecifier_
  - typings.babelTypes.mod.Expression
  - typings.babelTypes.mod.ExpressionStatement_
  - typings.babelTypes.mod.ExpressionWrapper
  - typings.babelTypes.mod.File_
  - typings.babelTypes.mod.Flow
  - typings.babelTypes.mod.FlowBaseAnnotation
  - typings.babelTypes.mod.FlowDeclaration
  - typings.babelTypes.mod.FlowPredicate
  - typings.babelTypes.mod.FlowType
  - typings.babelTypes.mod.For
  - typings.babelTypes.mod.ForInStatement_
  - typings.babelTypes.mod.ForOfStatement_
  - typings.babelTypes.mod.ForStatement_
  - typings.babelTypes.mod.ForXStatement
  - typings.babelTypes.mod.Function
  - typings.babelTypes.mod.FunctionDeclaration_
  - typings.babelTypes.mod.FunctionExpression_
  - typings.babelTypes.mod.FunctionParent
  - typings.babelTypes.mod.FunctionTypeAnnotation_
  - typings.babelTypes.mod.FunctionTypeParam_
  - typings.babelTypes.mod.GenericTypeAnnotation_
  - typings.babelTypes.mod.Identifier_
  - typings.babelTypes.mod.IfStatement_
  - typings.babelTypes.mod.Immutable
  - typings.babelTypes.mod.Import_
  - typings.babelTypes.mod.ImportAttribute_
  - typings.babelTypes.mod.ImportDeclaration_
  - typings.babelTypes.mod.ImportDefaultSpecifier_
  - typings.babelTypes.mod.ImportNamespaceSpecifier_
  - typings.babelTypes.mod.ImportOrExportDeclaration
  - typings.babelTypes.mod.ImportSpecifier_
  - typings.babelTypes.mod.IndexedAccessType_
  - typings.babelTypes.mod.InferredPredicate_
  - typings.babelTypes.mod.InterfaceDeclaration_
  - typings.babelTypes.mod.InterfaceExtends_
  - typings.babelTypes.mod.InterfaceTypeAnnotation_
  - typings.babelTypes.mod.InterpreterDirective_
  - typings.babelTypes.mod.IntersectionTypeAnnotation_
  - typings.babelTypes.mod.JSX
  - typings.babelTypes.mod.JSXAttribute_
  - typings.babelTypes.mod.JSXClosingElement_
  - typings.babelTypes.mod.JSXClosingFragment_
  - typings.babelTypes.mod.JSXElement_
  - typings.babelTypes.mod.JSXEmptyExpression_
  - typings.babelTypes.mod.JSXExpressionContainer_
  - typings.babelTypes.mod.JSXFragment_
  - typings.babelTypes.mod.JSXIdentifier_
  - typings.babelTypes.mod.JSXMemberExpression_
  - typings.babelTypes.mod.JSXNamespacedName_
  - typings.babelTypes.mod.JSXOpeningElement_
  - typings.babelTypes.mod.JSXOpeningFragment_
  - typings.babelTypes.mod.JSXSpreadAttribute_
  - typings.babelTypes.mod.JSXSpreadChild_
  - typings.babelTypes.mod.JSXText_
  - typings.babelTypes.mod.LVal
  - typings.babelTypes.mod.LabeledStatement_
  - typings.babelTypes.mod.Literal
  - typings.babelTypes.mod.LogicalExpression_
  - typings.babelTypes.mod.Loop
  - typings.babelTypes.mod.MemberExpression_
  - typings.babelTypes.mod.MetaProperty_
  - typings.babelTypes.mod.Method
  - typings.babelTypes.mod.Miscellaneous
  - typings.babelTypes.mod.MixedTypeAnnotation_
  - typings.babelTypes.mod.ModuleDeclaration
  - typings.babelTypes.mod.ModuleExpression_
  - typings.babelTypes.mod.ModuleSpecifier
  - typings.babelTypes.mod.NewExpression_
  - typings.babelTypes.mod.Noop_
  - typings.babelTypes.mod.NullLiteral_
  - typings.babelTypes.mod.NullLiteralTypeAnnotation_
  - typings.babelTypes.mod.NullableTypeAnnotation_
  - typings.babelTypes.mod.NumberLiteral
  - typings.babelTypes.mod.NumberLiteralTypeAnnotation_
  - typings.babelTypes.mod.NumberTypeAnnotation_
  - typings.babelTypes.mod.NumericLiteral_
  - typings.babelTypes.mod.ObjectExpression_
  - typings.babelTypes.mod.ObjectMember
  - typings.babelTypes.mod.ObjectMethod_
  - typings.babelTypes.mod.ObjectPattern_
  - typings.babelTypes.mod.ObjectProperty_
  - typings.babelTypes.mod.ObjectTypeAnnotation_
  - typings.babelTypes.mod.ObjectTypeCallProperty_
  - typings.babelTypes.mod.ObjectTypeIndexer_
  - typings.babelTypes.mod.ObjectTypeInternalSlot_
  - typings.babelTypes.mod.ObjectTypeProperty_
  - typings.babelTypes.mod.ObjectTypeSpreadProperty_
  - typings.babelTypes.mod.OpaqueType_
  - typings.babelTypes.mod.OptionalCallExpression_
  - typings.babelTypes.mod.OptionalIndexedAccessType_
  - typings.babelTypes.mod.OptionalMemberExpression_
  - typings.babelTypes.mod.ParenthesizedExpression_
  - typings.babelTypes.mod.Pattern
  - typings.babelTypes.mod.PatternLike
  - typings.babelTypes.mod.PipelineBareFunction_
  - typings.babelTypes.mod.PipelinePrimaryTopicReference_
  - typings.babelTypes.mod.PipelineTopicExpression_
  - typings.babelTypes.mod.Placeholder_
  - typings.babelTypes.mod.Private
  - typings.babelTypes.mod.PrivateName_
  - typings.babelTypes.mod.Program_
  - typings.babelTypes.mod.Property
  - typings.babelTypes.mod.Pureish
  - typings.babelTypes.mod.QualifiedTypeIdentifier_
  - typings.babelTypes.mod.RecordExpression_
  - typings.babelTypes.mod.RegExpLiteral_
  - typings.babelTypes.mod.RegexLiteral
  - typings.babelTypes.mod.RestElement_
  - typings.babelTypes.mod.RestProperty
  - typings.babelTypes.mod.ReturnStatement_
  - typings.babelTypes.mod.Scopable
  - typings.babelTypes.mod.SequenceExpression_
  - typings.babelTypes.mod.SpreadElement_
  - typings.babelTypes.mod.SpreadProperty
  - typings.babelTypes.mod.Standardized
  - typings.babelTypes.mod.Statement
  - typings.babelTypes.mod.StaticBlock_
  - typings.babelTypes.mod.StringLiteral_
  - typings.babelTypes.mod.StringLiteralTypeAnnotation_
  - typings.babelTypes.mod.StringTypeAnnotation_
  - typings.babelTypes.mod.Super_
  - typings.babelTypes.mod.SwitchCase_
  - typings.babelTypes.mod.SwitchStatement_
  - typings.babelTypes.mod.SymbolTypeAnnotation_
  - typings.babelTypes.mod.TSAnyKeyword_
  - typings.babelTypes.mod.TSArrayType_
  - typings.babelTypes.mod.TSAsExpression_
  - typings.babelTypes.mod.TSBaseType
  - typings.babelTypes.mod.TSBigIntKeyword_
  - typings.babelTypes.mod.TSBooleanKeyword_
  - typings.babelTypes.mod.TSCallSignatureDeclaration_
  - typings.babelTypes.mod.TSConditionalType_
  - typings.babelTypes.mod.TSConstructSignatureDeclaration_
  - typings.babelTypes.mod.TSConstructorType_
  - typings.babelTypes.mod.TSDeclareFunction_
  - typings.babelTypes.mod.TSDeclareMethod_
  - typings.babelTypes.mod.TSEntityName
  - typings.babelTypes.mod.TSEnumDeclaration_
  - typings.babelTypes.mod.TSEnumMember_
  - typings.babelTypes.mod.TSExportAssignment_
  - typings.babelTypes.mod.TSExpressionWithTypeArguments_
  - typings.babelTypes.mod.TSExternalModuleReference_
  - typings.babelTypes.mod.TSFunctionType_
  - typings.babelTypes.mod.TSImportEqualsDeclaration_
  - typings.babelTypes.mod.TSImportType_
  - typings.babelTypes.mod.TSIndexSignature_
  - typings.babelTypes.mod.TSIndexedAccessType_
  - typings.babelTypes.mod.TSInferType_
  - typings.babelTypes.mod.TSInstantiationExpression_
  - typings.babelTypes.mod.TSInterfaceBody_
  - typings.babelTypes.mod.TSInterfaceDeclaration_
  - typings.babelTypes.mod.TSIntersectionType_
  - typings.babelTypes.mod.TSIntrinsicKeyword_
  - typings.babelTypes.mod.TSLiteralType_
  - typings.babelTypes.mod.TSMappedType_
  - typings.babelTypes.mod.TSMethodSignature_
  - typings.babelTypes.mod.TSModuleBlock_
  - typings.babelTypes.mod.TSModuleDeclaration_
  - typings.babelTypes.mod.TSNamedTupleMember_
  - typings.babelTypes.mod.TSNamespaceExportDeclaration_
  - typings.babelTypes.mod.TSNeverKeyword_
  - typings.babelTypes.mod.TSNonNullExpression_
  - typings.babelTypes.mod.TSNullKeyword_
  - typings.babelTypes.mod.TSNumberKeyword_
  - typings.babelTypes.mod.TSObjectKeyword_
  - typings.babelTypes.mod.TSOptionalType_
  - typings.babelTypes.mod.TSParameterProperty_
  - typings.babelTypes.mod.TSParenthesizedType_
  - typings.babelTypes.mod.TSPropertySignature_
  - typings.babelTypes.mod.TSQualifiedName_
  - typings.babelTypes.mod.TSRestType_
  - typings.babelTypes.mod.TSSatisfiesExpression_
  - typings.babelTypes.mod.TSStringKeyword_
  - typings.babelTypes.mod.TSSymbolKeyword_
  - typings.babelTypes.mod.TSThisType_
  - typings.babelTypes.mod.TSTupleType_
  - typings.babelTypes.mod.TSType
  - typings.babelTypes.mod.TSTypeAliasDeclaration_
  - typings.babelTypes.mod.TSTypeAnnotation_
  - typings.babelTypes.mod.TSTypeAssertion_
  - typings.babelTypes.mod.TSTypeElement
  - typings.babelTypes.mod.TSTypeLiteral_
  - typings.babelTypes.mod.TSTypeOperator_
  - typings.babelTypes.mod.TSTypeParameter_
  - typings.babelTypes.mod.TSTypeParameterDeclaration_
  - typings.babelTypes.mod.TSTypeParameterInstantiation_
  - typings.babelTypes.mod.TSTypePredicate_
  - typings.babelTypes.mod.TSTypeQuery_
  - typings.babelTypes.mod.TSTypeReference_
  - typings.babelTypes.mod.TSUndefinedKeyword_
  - typings.babelTypes.mod.TSUnionType_
  - typings.babelTypes.mod.TSUnknownKeyword_
  - typings.babelTypes.mod.TSVoidKeyword_
  - typings.babelTypes.mod.TaggedTemplateExpression_
  - typings.babelTypes.mod.TemplateElement_
  - typings.babelTypes.mod.TemplateLiteral_
  - typings.babelTypes.mod.Terminatorless
  - typings.babelTypes.mod.ThisExpression_
  - typings.babelTypes.mod.ThisTypeAnnotation_
  - typings.babelTypes.mod.ThrowStatement_
  - typings.babelTypes.mod.TopicReference_
  - typings.babelTypes.mod.TryStatement_
  - typings.babelTypes.mod.TupleExpression_
  - typings.babelTypes.mod.TupleTypeAnnotation_
  - typings.babelTypes.mod.TypeAlias_
  - typings.babelTypes.mod.TypeAnnotation_
  - typings.babelTypes.mod.TypeCastExpression_
  - typings.babelTypes.mod.TypeParameter_
  - typings.babelTypes.mod.TypeParameterDeclaration_
  - typings.babelTypes.mod.TypeParameterInstantiation_
  - typings.babelTypes.mod.TypeScript
  - typings.babelTypes.mod.TypeofTypeAnnotation_
  - typings.babelTypes.mod.UnaryExpression_
  - typings.babelTypes.mod.UnaryLike
  - typings.babelTypes.mod.UnionTypeAnnotation_
  - typings.babelTypes.mod.UpdateExpression_
  - typings.babelTypes.mod.UserWhitespacable
  - typings.babelTypes.mod.V8IntrinsicIdentifier_
  - typings.babelTypes.mod.VariableDeclaration_
  - typings.babelTypes.mod.VariableDeclarator_
  - typings.babelTypes.mod.Variance_
  - typings.babelTypes.mod.VoidTypeAnnotation_
  - typings.babelTypes.mod.While
  - typings.babelTypes.mod.WhileStatement_
  - typings.babelTypes.mod.WithStatement_
  - typings.babelTypes.mod.YieldExpression_
*/
type Node = _Node | Accessor | NumberLiteral | RegexLiteral | RestProperty | SpreadProperty

type NumberLiteral = NumericLiteral_

type RegexLiteral = RegExpLiteral_

type RestProperty = RestElement_

type SpreadProperty = SpreadElement_

type TraversalAncestors = js.Array[Index]

type TraversalHandler[T] = js.ThisFunction3[/* this */ Unit, /* node */ Node, /* parent */ TraversalAncestors, /* type */ T, Unit]
