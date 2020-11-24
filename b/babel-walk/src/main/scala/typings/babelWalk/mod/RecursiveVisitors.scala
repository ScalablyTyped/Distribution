package typings.babelWalk.mod

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.AnyTypeAnnotation
import typings.babelWalk.babelWalkStrings.ArgumentPlaceholder
import typings.babelWalk.babelWalkStrings.ArrayExpression
import typings.babelWalk.babelWalkStrings.ArrayPattern
import typings.babelWalk.babelWalkStrings.ArrayTypeAnnotation
import typings.babelWalk.babelWalkStrings.ArrowFunctionExpression
import typings.babelWalk.babelWalkStrings.AssignmentExpression
import typings.babelWalk.babelWalkStrings.AssignmentPattern
import typings.babelWalk.babelWalkStrings.AwaitExpression
import typings.babelWalk.babelWalkStrings.BigIntLiteral
import typings.babelWalk.babelWalkStrings.Binary
import typings.babelWalk.babelWalkStrings.BinaryExpression
import typings.babelWalk.babelWalkStrings.BindExpression
import typings.babelWalk.babelWalkStrings.Block
import typings.babelWalk.babelWalkStrings.BlockParent
import typings.babelWalk.babelWalkStrings.BlockStatement
import typings.babelWalk.babelWalkStrings.BooleanLiteral
import typings.babelWalk.babelWalkStrings.BooleanLiteralTypeAnnotation
import typings.babelWalk.babelWalkStrings.BooleanTypeAnnotation
import typings.babelWalk.babelWalkStrings.BreakStatement
import typings.babelWalk.babelWalkStrings.CallExpression
import typings.babelWalk.babelWalkStrings.CatchClause
import typings.babelWalk.babelWalkStrings.Class
import typings.babelWalk.babelWalkStrings.ClassBody
import typings.babelWalk.babelWalkStrings.ClassDeclaration
import typings.babelWalk.babelWalkStrings.ClassExpression
import typings.babelWalk.babelWalkStrings.ClassImplements
import typings.babelWalk.babelWalkStrings.ClassMethod
import typings.babelWalk.babelWalkStrings.ClassPrivateMethod
import typings.babelWalk.babelWalkStrings.ClassPrivateProperty
import typings.babelWalk.babelWalkStrings.ClassProperty
import typings.babelWalk.babelWalkStrings.CompletionStatement
import typings.babelWalk.babelWalkStrings.Conditional
import typings.babelWalk.babelWalkStrings.ConditionalExpression
import typings.babelWalk.babelWalkStrings.ContinueStatement
import typings.babelWalk.babelWalkStrings.DebuggerStatement
import typings.babelWalk.babelWalkStrings.DecimalLiteral
import typings.babelWalk.babelWalkStrings.Declaration
import typings.babelWalk.babelWalkStrings.DeclareClass
import typings.babelWalk.babelWalkStrings.DeclareExportAllDeclaration
import typings.babelWalk.babelWalkStrings.DeclareExportDeclaration
import typings.babelWalk.babelWalkStrings.DeclareFunction
import typings.babelWalk.babelWalkStrings.DeclareInterface
import typings.babelWalk.babelWalkStrings.DeclareModule
import typings.babelWalk.babelWalkStrings.DeclareModuleExports
import typings.babelWalk.babelWalkStrings.DeclareOpaqueType
import typings.babelWalk.babelWalkStrings.DeclareTypeAlias
import typings.babelWalk.babelWalkStrings.DeclareVariable
import typings.babelWalk.babelWalkStrings.DeclaredPredicate
import typings.babelWalk.babelWalkStrings.Decorator
import typings.babelWalk.babelWalkStrings.Directive
import typings.babelWalk.babelWalkStrings.DirectiveLiteral
import typings.babelWalk.babelWalkStrings.DoExpression
import typings.babelWalk.babelWalkStrings.DoWhileStatement
import typings.babelWalk.babelWalkStrings.EmptyStatement
import typings.babelWalk.babelWalkStrings.EmptyTypeAnnotation
import typings.babelWalk.babelWalkStrings.EnumBody
import typings.babelWalk.babelWalkStrings.EnumBooleanBody
import typings.babelWalk.babelWalkStrings.EnumBooleanMember
import typings.babelWalk.babelWalkStrings.EnumDeclaration
import typings.babelWalk.babelWalkStrings.EnumDefaultedMember
import typings.babelWalk.babelWalkStrings.EnumMember
import typings.babelWalk.babelWalkStrings.EnumNumberBody
import typings.babelWalk.babelWalkStrings.EnumNumberMember
import typings.babelWalk.babelWalkStrings.EnumStringBody
import typings.babelWalk.babelWalkStrings.EnumStringMember
import typings.babelWalk.babelWalkStrings.EnumSymbolBody
import typings.babelWalk.babelWalkStrings.ExistsTypeAnnotation
import typings.babelWalk.babelWalkStrings.ExportAllDeclaration
import typings.babelWalk.babelWalkStrings.ExportDeclaration
import typings.babelWalk.babelWalkStrings.ExportDefaultDeclaration
import typings.babelWalk.babelWalkStrings.ExportDefaultSpecifier
import typings.babelWalk.babelWalkStrings.ExportNamedDeclaration
import typings.babelWalk.babelWalkStrings.ExportNamespaceSpecifier
import typings.babelWalk.babelWalkStrings.ExportSpecifier
import typings.babelWalk.babelWalkStrings.Expression
import typings.babelWalk.babelWalkStrings.ExpressionStatement
import typings.babelWalk.babelWalkStrings.ExpressionWrapper
import typings.babelWalk.babelWalkStrings.File
import typings.babelWalk.babelWalkStrings.Flow
import typings.babelWalk.babelWalkStrings.FlowBaseAnnotation
import typings.babelWalk.babelWalkStrings.FlowDeclaration
import typings.babelWalk.babelWalkStrings.FlowPredicate
import typings.babelWalk.babelWalkStrings.FlowType
import typings.babelWalk.babelWalkStrings.For
import typings.babelWalk.babelWalkStrings.ForInStatement
import typings.babelWalk.babelWalkStrings.ForOfStatement
import typings.babelWalk.babelWalkStrings.ForStatement
import typings.babelWalk.babelWalkStrings.ForXStatement
import typings.babelWalk.babelWalkStrings.Function
import typings.babelWalk.babelWalkStrings.FunctionDeclaration
import typings.babelWalk.babelWalkStrings.FunctionExpression
import typings.babelWalk.babelWalkStrings.FunctionParent
import typings.babelWalk.babelWalkStrings.FunctionTypeAnnotation
import typings.babelWalk.babelWalkStrings.FunctionTypeParam
import typings.babelWalk.babelWalkStrings.GenericTypeAnnotation
import typings.babelWalk.babelWalkStrings.Identifier
import typings.babelWalk.babelWalkStrings.IfStatement
import typings.babelWalk.babelWalkStrings.Immutable
import typings.babelWalk.babelWalkStrings.Import
import typings.babelWalk.babelWalkStrings.ImportAttribute
import typings.babelWalk.babelWalkStrings.ImportDeclaration
import typings.babelWalk.babelWalkStrings.ImportDefaultSpecifier
import typings.babelWalk.babelWalkStrings.ImportNamespaceSpecifier
import typings.babelWalk.babelWalkStrings.ImportSpecifier
import typings.babelWalk.babelWalkStrings.InferredPredicate
import typings.babelWalk.babelWalkStrings.InterfaceDeclaration
import typings.babelWalk.babelWalkStrings.InterfaceExtends
import typings.babelWalk.babelWalkStrings.InterfaceTypeAnnotation
import typings.babelWalk.babelWalkStrings.InterpreterDirective
import typings.babelWalk.babelWalkStrings.IntersectionTypeAnnotation
import typings.babelWalk.babelWalkStrings.JSX
import typings.babelWalk.babelWalkStrings.JSXAttribute
import typings.babelWalk.babelWalkStrings.JSXClosingElement
import typings.babelWalk.babelWalkStrings.JSXClosingFragment
import typings.babelWalk.babelWalkStrings.JSXElement
import typings.babelWalk.babelWalkStrings.JSXEmptyExpression
import typings.babelWalk.babelWalkStrings.JSXExpressionContainer
import typings.babelWalk.babelWalkStrings.JSXFragment
import typings.babelWalk.babelWalkStrings.JSXIdentifier
import typings.babelWalk.babelWalkStrings.JSXMemberExpression
import typings.babelWalk.babelWalkStrings.JSXNamespacedName
import typings.babelWalk.babelWalkStrings.JSXOpeningElement
import typings.babelWalk.babelWalkStrings.JSXOpeningFragment
import typings.babelWalk.babelWalkStrings.JSXSpreadAttribute
import typings.babelWalk.babelWalkStrings.JSXSpreadChild
import typings.babelWalk.babelWalkStrings.JSXText
import typings.babelWalk.babelWalkStrings.LVal
import typings.babelWalk.babelWalkStrings.LabeledStatement
import typings.babelWalk.babelWalkStrings.Literal
import typings.babelWalk.babelWalkStrings.LogicalExpression
import typings.babelWalk.babelWalkStrings.Loop
import typings.babelWalk.babelWalkStrings.MemberExpression
import typings.babelWalk.babelWalkStrings.MetaProperty
import typings.babelWalk.babelWalkStrings.Method
import typings.babelWalk.babelWalkStrings.MixedTypeAnnotation
import typings.babelWalk.babelWalkStrings.ModuleDeclaration
import typings.babelWalk.babelWalkStrings.ModuleSpecifier
import typings.babelWalk.babelWalkStrings.NewExpression
import typings.babelWalk.babelWalkStrings.Noop
import typings.babelWalk.babelWalkStrings.NullLiteral
import typings.babelWalk.babelWalkStrings.NullLiteralTypeAnnotation
import typings.babelWalk.babelWalkStrings.NullableTypeAnnotation
import typings.babelWalk.babelWalkStrings.NumberLiteralTypeAnnotation
import typings.babelWalk.babelWalkStrings.NumberTypeAnnotation
import typings.babelWalk.babelWalkStrings.NumericLiteral
import typings.babelWalk.babelWalkStrings.ObjectExpression
import typings.babelWalk.babelWalkStrings.ObjectMember
import typings.babelWalk.babelWalkStrings.ObjectMethod
import typings.babelWalk.babelWalkStrings.ObjectPattern
import typings.babelWalk.babelWalkStrings.ObjectProperty
import typings.babelWalk.babelWalkStrings.ObjectTypeAnnotation
import typings.babelWalk.babelWalkStrings.ObjectTypeCallProperty
import typings.babelWalk.babelWalkStrings.ObjectTypeIndexer
import typings.babelWalk.babelWalkStrings.ObjectTypeInternalSlot
import typings.babelWalk.babelWalkStrings.ObjectTypeProperty
import typings.babelWalk.babelWalkStrings.ObjectTypeSpreadProperty
import typings.babelWalk.babelWalkStrings.OpaqueType
import typings.babelWalk.babelWalkStrings.OptionalCallExpression
import typings.babelWalk.babelWalkStrings.OptionalMemberExpression
import typings.babelWalk.babelWalkStrings.ParenthesizedExpression
import typings.babelWalk.babelWalkStrings.Pattern
import typings.babelWalk.babelWalkStrings.PatternLike
import typings.babelWalk.babelWalkStrings.PipelineBareFunction
import typings.babelWalk.babelWalkStrings.PipelinePrimaryTopicReference
import typings.babelWalk.babelWalkStrings.PipelineTopicExpression
import typings.babelWalk.babelWalkStrings.Placeholder
import typings.babelWalk.babelWalkStrings.Private
import typings.babelWalk.babelWalkStrings.PrivateName
import typings.babelWalk.babelWalkStrings.Program
import typings.babelWalk.babelWalkStrings.Property
import typings.babelWalk.babelWalkStrings.Pureish
import typings.babelWalk.babelWalkStrings.QualifiedTypeIdentifier
import typings.babelWalk.babelWalkStrings.RecordExpression
import typings.babelWalk.babelWalkStrings.RegExpLiteral
import typings.babelWalk.babelWalkStrings.RestElement
import typings.babelWalk.babelWalkStrings.ReturnStatement
import typings.babelWalk.babelWalkStrings.Scopable
import typings.babelWalk.babelWalkStrings.SequenceExpression
import typings.babelWalk.babelWalkStrings.SpreadElement
import typings.babelWalk.babelWalkStrings.Statement
import typings.babelWalk.babelWalkStrings.StaticBlock
import typings.babelWalk.babelWalkStrings.StringLiteral
import typings.babelWalk.babelWalkStrings.StringLiteralTypeAnnotation
import typings.babelWalk.babelWalkStrings.StringTypeAnnotation
import typings.babelWalk.babelWalkStrings.Super
import typings.babelWalk.babelWalkStrings.SwitchCase
import typings.babelWalk.babelWalkStrings.SwitchStatement
import typings.babelWalk.babelWalkStrings.SymbolTypeAnnotation
import typings.babelWalk.babelWalkStrings.TSAnyKeyword
import typings.babelWalk.babelWalkStrings.TSArrayType
import typings.babelWalk.babelWalkStrings.TSAsExpression
import typings.babelWalk.babelWalkStrings.TSBaseType
import typings.babelWalk.babelWalkStrings.TSBigIntKeyword
import typings.babelWalk.babelWalkStrings.TSBooleanKeyword
import typings.babelWalk.babelWalkStrings.TSCallSignatureDeclaration
import typings.babelWalk.babelWalkStrings.TSConditionalType
import typings.babelWalk.babelWalkStrings.TSConstructSignatureDeclaration
import typings.babelWalk.babelWalkStrings.TSConstructorType
import typings.babelWalk.babelWalkStrings.TSDeclareFunction
import typings.babelWalk.babelWalkStrings.TSDeclareMethod
import typings.babelWalk.babelWalkStrings.TSEntityName
import typings.babelWalk.babelWalkStrings.TSEnumDeclaration
import typings.babelWalk.babelWalkStrings.TSEnumMember
import typings.babelWalk.babelWalkStrings.TSExportAssignment
import typings.babelWalk.babelWalkStrings.TSExpressionWithTypeArguments
import typings.babelWalk.babelWalkStrings.TSExternalModuleReference
import typings.babelWalk.babelWalkStrings.TSFunctionType
import typings.babelWalk.babelWalkStrings.TSImportEqualsDeclaration
import typings.babelWalk.babelWalkStrings.TSImportType
import typings.babelWalk.babelWalkStrings.TSIndexSignature
import typings.babelWalk.babelWalkStrings.TSIndexedAccessType
import typings.babelWalk.babelWalkStrings.TSInferType
import typings.babelWalk.babelWalkStrings.TSInterfaceBody
import typings.babelWalk.babelWalkStrings.TSInterfaceDeclaration
import typings.babelWalk.babelWalkStrings.TSIntersectionType
import typings.babelWalk.babelWalkStrings.TSIntrinsicKeyword
import typings.babelWalk.babelWalkStrings.TSLiteralType
import typings.babelWalk.babelWalkStrings.TSMappedType
import typings.babelWalk.babelWalkStrings.TSMethodSignature
import typings.babelWalk.babelWalkStrings.TSModuleBlock
import typings.babelWalk.babelWalkStrings.TSModuleDeclaration
import typings.babelWalk.babelWalkStrings.TSNamedTupleMember
import typings.babelWalk.babelWalkStrings.TSNamespaceExportDeclaration
import typings.babelWalk.babelWalkStrings.TSNeverKeyword
import typings.babelWalk.babelWalkStrings.TSNonNullExpression
import typings.babelWalk.babelWalkStrings.TSNullKeyword
import typings.babelWalk.babelWalkStrings.TSNumberKeyword
import typings.babelWalk.babelWalkStrings.TSObjectKeyword
import typings.babelWalk.babelWalkStrings.TSOptionalType
import typings.babelWalk.babelWalkStrings.TSParameterProperty
import typings.babelWalk.babelWalkStrings.TSParenthesizedType
import typings.babelWalk.babelWalkStrings.TSPropertySignature
import typings.babelWalk.babelWalkStrings.TSQualifiedName
import typings.babelWalk.babelWalkStrings.TSRestType
import typings.babelWalk.babelWalkStrings.TSStringKeyword
import typings.babelWalk.babelWalkStrings.TSSymbolKeyword
import typings.babelWalk.babelWalkStrings.TSThisType
import typings.babelWalk.babelWalkStrings.TSTupleType
import typings.babelWalk.babelWalkStrings.TSType
import typings.babelWalk.babelWalkStrings.TSTypeAliasDeclaration
import typings.babelWalk.babelWalkStrings.TSTypeAnnotation
import typings.babelWalk.babelWalkStrings.TSTypeAssertion
import typings.babelWalk.babelWalkStrings.TSTypeElement
import typings.babelWalk.babelWalkStrings.TSTypeLiteral
import typings.babelWalk.babelWalkStrings.TSTypeOperator
import typings.babelWalk.babelWalkStrings.TSTypeParameter
import typings.babelWalk.babelWalkStrings.TSTypeParameterDeclaration
import typings.babelWalk.babelWalkStrings.TSTypeParameterInstantiation
import typings.babelWalk.babelWalkStrings.TSTypePredicate
import typings.babelWalk.babelWalkStrings.TSTypeQuery
import typings.babelWalk.babelWalkStrings.TSTypeReference
import typings.babelWalk.babelWalkStrings.TSUndefinedKeyword
import typings.babelWalk.babelWalkStrings.TSUnionType
import typings.babelWalk.babelWalkStrings.TSUnknownKeyword
import typings.babelWalk.babelWalkStrings.TSVoidKeyword
import typings.babelWalk.babelWalkStrings.TaggedTemplateExpression
import typings.babelWalk.babelWalkStrings.TemplateElement
import typings.babelWalk.babelWalkStrings.TemplateLiteral
import typings.babelWalk.babelWalkStrings.Terminatorless
import typings.babelWalk.babelWalkStrings.ThisExpression
import typings.babelWalk.babelWalkStrings.ThisTypeAnnotation
import typings.babelWalk.babelWalkStrings.ThrowStatement
import typings.babelWalk.babelWalkStrings.TryStatement
import typings.babelWalk.babelWalkStrings.TupleExpression
import typings.babelWalk.babelWalkStrings.TupleTypeAnnotation
import typings.babelWalk.babelWalkStrings.TypeAlias
import typings.babelWalk.babelWalkStrings.TypeAnnotation
import typings.babelWalk.babelWalkStrings.TypeCastExpression
import typings.babelWalk.babelWalkStrings.TypeParameter
import typings.babelWalk.babelWalkStrings.TypeParameterDeclaration
import typings.babelWalk.babelWalkStrings.TypeParameterInstantiation
import typings.babelWalk.babelWalkStrings.TypeofTypeAnnotation
import typings.babelWalk.babelWalkStrings.UnaryExpression
import typings.babelWalk.babelWalkStrings.UnaryLike
import typings.babelWalk.babelWalkStrings.UnionTypeAnnotation
import typings.babelWalk.babelWalkStrings.UpdateExpression
import typings.babelWalk.babelWalkStrings.UserWhitespacable
import typings.babelWalk.babelWalkStrings.V8IntrinsicIdentifier
import typings.babelWalk.babelWalkStrings.VariableDeclaration
import typings.babelWalk.babelWalkStrings.VariableDeclarator
import typings.babelWalk.babelWalkStrings.Variance
import typings.babelWalk.babelWalkStrings.VoidTypeAnnotation
import typings.babelWalk.babelWalkStrings.While
import typings.babelWalk.babelWalkStrings.WhileStatement
import typings.babelWalk.babelWalkStrings.WithStatement
import typings.babelWalk.babelWalkStrings.YieldExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in keyof @babel/types.@babel/types.Aliases | @babel/types.@babel/types.Node['type'] ]:? (node : babel-walk.babel-walk/lib.NodeType<key>, state : TState, recurse : (node : @babel/types.@babel/types.Node): void): void} */
@js.native
trait RecursiveVisitors[TState] extends js.Object {
  
  var AnyTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.AnyTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ArgumentPlaceholder: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ArgumentPlaceholder], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ArrayExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ArrayExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ArrayPattern: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ArrayPattern], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ArrayTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ArrayTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ArrowFunctionExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ArrowFunctionExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var AssignmentExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.AssignmentExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var AssignmentPattern: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.AssignmentPattern], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var AwaitExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.AwaitExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var BigIntLiteral: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.BigIntLiteral], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Binary: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Binary], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var BinaryExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.BinaryExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var BindExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.BindExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Block: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Block], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var BlockParent: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.BlockParent], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var BlockStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.BlockStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var BooleanLiteral: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.BooleanLiteral], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var BooleanLiteralTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.BooleanLiteralTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var BooleanTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.BooleanTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var BreakStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.BreakStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var CallExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.CallExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var CatchClause: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.CatchClause], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Class: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Class], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ClassBody: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ClassBody], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ClassDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ClassDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ClassExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ClassExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ClassImplements: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ClassImplements], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ClassMethod: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ClassMethod], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ClassPrivateMethod: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ClassPrivateMethod], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ClassPrivateProperty: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ClassPrivateProperty], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ClassProperty: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ClassProperty], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var CompletionStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.CompletionStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Conditional: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Conditional], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ConditionalExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ConditionalExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ContinueStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ContinueStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DebuggerStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DebuggerStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DecimalLiteral: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DecimalLiteral], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Declaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Declaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DeclareClass: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DeclareClass], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DeclareExportAllDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DeclareExportAllDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DeclareExportDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DeclareExportDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DeclareFunction: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DeclareFunction], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DeclareInterface: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DeclareInterface], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DeclareModule: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DeclareModule], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DeclareModuleExports: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DeclareModuleExports], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DeclareOpaqueType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DeclareOpaqueType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DeclareTypeAlias: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DeclareTypeAlias], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DeclareVariable: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DeclareVariable], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DeclaredPredicate: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DeclaredPredicate], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Decorator: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Decorator], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Directive: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Directive], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DirectiveLiteral: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DirectiveLiteral], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DoExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DoExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var DoWhileStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.DoWhileStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var EmptyStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.EmptyStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var EmptyTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.EmptyTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var EnumBody: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.EnumBody], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var EnumBooleanBody: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.EnumBooleanBody], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var EnumBooleanMember: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.EnumBooleanMember], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var EnumDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.EnumDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var EnumDefaultedMember: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.EnumDefaultedMember], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var EnumMember: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.EnumMember], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var EnumNumberBody: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.EnumNumberBody], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var EnumNumberMember: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.EnumNumberMember], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var EnumStringBody: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.EnumStringBody], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var EnumStringMember: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.EnumStringMember], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var EnumSymbolBody: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.EnumSymbolBody], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ExistsTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ExistsTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ExportAllDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ExportAllDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ExportDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ExportDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ExportDefaultDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ExportDefaultDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ExportDefaultSpecifier: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ExportDefaultSpecifier], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ExportNamedDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ExportNamedDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ExportNamespaceSpecifier: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ExportNamespaceSpecifier], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ExportSpecifier: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ExportSpecifier], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Expression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Expression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ExpressionStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ExpressionStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ExpressionWrapper: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ExpressionWrapper], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var File: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.File], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Flow: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Flow], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var FlowBaseAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.FlowBaseAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var FlowDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.FlowDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var FlowPredicate: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.FlowPredicate], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var FlowType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.FlowType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var For: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.For], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ForInStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ForInStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ForOfStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ForOfStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ForStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ForStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ForXStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ForXStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Function: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Function], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var FunctionDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.FunctionDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var FunctionExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.FunctionExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var FunctionParent: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.FunctionParent], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var FunctionTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.FunctionTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var FunctionTypeParam: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.FunctionTypeParam], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var GenericTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.GenericTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Identifier: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Identifier], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var IfStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.IfStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Immutable: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Immutable], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Import: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Import], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ImportAttribute: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ImportAttribute], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ImportDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ImportDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ImportDefaultSpecifier: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ImportDefaultSpecifier], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ImportNamespaceSpecifier: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ImportNamespaceSpecifier], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ImportSpecifier: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ImportSpecifier], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var InferredPredicate: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.InferredPredicate], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var InterfaceDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.InterfaceDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var InterfaceExtends: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.InterfaceExtends], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var InterfaceTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.InterfaceTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var InterpreterDirective: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.InterpreterDirective], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var IntersectionTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.IntersectionTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSX: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSX], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXAttribute: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXAttribute], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXClosingElement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXClosingElement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXClosingFragment: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXClosingFragment], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXElement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXElement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXEmptyExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXEmptyExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXExpressionContainer: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXExpressionContainer], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXFragment: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXFragment], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXIdentifier: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXIdentifier], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXMemberExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXMemberExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXNamespacedName: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXNamespacedName], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXOpeningElement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXOpeningElement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXOpeningFragment: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXOpeningFragment], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXSpreadAttribute: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXSpreadAttribute], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXSpreadChild: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXSpreadChild], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var JSXText: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.JSXText], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var LVal: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.LVal], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var LabeledStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.LabeledStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Literal: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Literal], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var LogicalExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.LogicalExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Loop: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Loop], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var MemberExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.MemberExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var MetaProperty: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.MetaProperty], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Method: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Method], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var MixedTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.MixedTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ModuleDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ModuleDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ModuleSpecifier: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ModuleSpecifier], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var NewExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.NewExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Noop: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Noop], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var NullLiteral: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.NullLiteral], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var NullLiteralTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.NullLiteralTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var NullableTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.NullableTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var NumberLiteralTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.NumberLiteralTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var NumberTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.NumberTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var NumericLiteral: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.NumericLiteral], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ObjectExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ObjectExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ObjectMember: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ObjectMember], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ObjectMethod: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ObjectMethod], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ObjectPattern: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ObjectPattern], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ObjectProperty: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ObjectProperty], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ObjectTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ObjectTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ObjectTypeCallProperty: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ObjectTypeCallProperty], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ObjectTypeIndexer: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ObjectTypeIndexer], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ObjectTypeInternalSlot: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ObjectTypeInternalSlot], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ObjectTypeProperty: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ObjectTypeProperty], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ObjectTypeSpreadProperty: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ObjectTypeSpreadProperty], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var OpaqueType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.OpaqueType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var OptionalCallExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.OptionalCallExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var OptionalMemberExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.OptionalMemberExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ParenthesizedExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ParenthesizedExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Pattern: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Pattern], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var PatternLike: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.PatternLike], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var PipelineBareFunction: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.PipelineBareFunction], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var PipelinePrimaryTopicReference: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.PipelinePrimaryTopicReference], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var PipelineTopicExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.PipelineTopicExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Placeholder: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Placeholder], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Private: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Private], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var PrivateName: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.PrivateName], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Program: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Program], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Property: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Property], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Pureish: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Pureish], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var QualifiedTypeIdentifier: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.QualifiedTypeIdentifier], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var RecordExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.RecordExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var RegExpLiteral: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.RegExpLiteral], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var RestElement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.RestElement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ReturnStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ReturnStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Scopable: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Scopable], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var SequenceExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.SequenceExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var SpreadElement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.SpreadElement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Statement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Statement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var StaticBlock: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.StaticBlock], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var StringLiteral: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.StringLiteral], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var StringLiteralTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.StringLiteralTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var StringTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.StringTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Super: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Super], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var SwitchCase: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.SwitchCase], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var SwitchStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.SwitchStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var SymbolTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.SymbolTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSAnyKeyword: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSAnyKeyword], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSArrayType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSArrayType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSAsExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSAsExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSBaseType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSBaseType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSBigIntKeyword: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSBigIntKeyword], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSBooleanKeyword: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSBooleanKeyword], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSCallSignatureDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSCallSignatureDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSConditionalType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSConditionalType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSConstructSignatureDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSConstructSignatureDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSConstructorType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSConstructorType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSDeclareFunction: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSDeclareFunction], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSDeclareMethod: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSDeclareMethod], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSEntityName: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSEntityName], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSEnumDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSEnumDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSEnumMember: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSEnumMember], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSExportAssignment: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSExportAssignment], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSExpressionWithTypeArguments: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSExpressionWithTypeArguments], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSExternalModuleReference: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSExternalModuleReference], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSFunctionType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSFunctionType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSImportEqualsDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSImportEqualsDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSImportType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSImportType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSIndexSignature: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSIndexSignature], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSIndexedAccessType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSIndexedAccessType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSInferType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSInferType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSInterfaceBody: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSInterfaceBody], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSInterfaceDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSInterfaceDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSIntersectionType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSIntersectionType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSIntrinsicKeyword: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSIntrinsicKeyword], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSLiteralType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSLiteralType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSMappedType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSMappedType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSMethodSignature: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSMethodSignature], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSModuleBlock: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSModuleBlock], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSModuleDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSModuleDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSNamedTupleMember: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSNamedTupleMember], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSNamespaceExportDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSNamespaceExportDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSNeverKeyword: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSNeverKeyword], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSNonNullExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSNonNullExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSNullKeyword: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSNullKeyword], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSNumberKeyword: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSNumberKeyword], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSObjectKeyword: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSObjectKeyword], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSOptionalType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSOptionalType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSParameterProperty: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSParameterProperty], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSParenthesizedType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSParenthesizedType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSPropertySignature: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSPropertySignature], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSQualifiedName: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSQualifiedName], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSRestType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSRestType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSStringKeyword: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSStringKeyword], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSSymbolKeyword: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSSymbolKeyword], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSThisType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSThisType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSTupleType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSTupleType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSTypeAliasDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSTypeAliasDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSTypeAssertion: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSTypeAssertion], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSTypeElement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSTypeElement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSTypeLiteral: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSTypeLiteral], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSTypeOperator: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSTypeOperator], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSTypeParameter: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSTypeParameter], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSTypeParameterDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSTypeParameterDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSTypeParameterInstantiation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSTypeParameterInstantiation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSTypePredicate: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSTypePredicate], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSTypeQuery: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSTypeQuery], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSTypeReference: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSTypeReference], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSUndefinedKeyword: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSUndefinedKeyword], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSUnionType: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSUnionType], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSUnknownKeyword: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSUnknownKeyword], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TSVoidKeyword: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TSVoidKeyword], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TaggedTemplateExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TaggedTemplateExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TemplateElement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TemplateElement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TemplateLiteral: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TemplateLiteral], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Terminatorless: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Terminatorless], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ThisExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ThisExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ThisTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ThisTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var ThrowStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.ThrowStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TryStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TryStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TupleExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TupleExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TupleTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TupleTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TypeAlias: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TypeAlias], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TypeCastExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TypeCastExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TypeParameter: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TypeParameter], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TypeParameterDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TypeParameterDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TypeParameterInstantiation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TypeParameterInstantiation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var TypeofTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.TypeofTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var UnaryExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.UnaryExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var UnaryLike: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.UnaryLike], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var UnionTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.UnionTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var UpdateExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.UpdateExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var UserWhitespacable: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.UserWhitespacable], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var V8IntrinsicIdentifier: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.V8IntrinsicIdentifier], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var VariableDeclaration: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.VariableDeclaration], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var VariableDeclarator: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.VariableDeclarator], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var Variance: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.Variance], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var VoidTypeAnnotation: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.VoidTypeAnnotation], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var While: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.While], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var WhileStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.WhileStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var WithStatement: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.WithStatement], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
  
  var YieldExpression: js.UndefOr[
    js.Function3[
      /* node */ NodeType[typings.babelWalk.babelWalkStrings.YieldExpression], 
      /* state */ TState, 
      /* recurse */ js.Function1[/* node */ Node, Unit], 
      Unit
    ]
  ] = js.native
}
object RecursiveVisitors {
  
  @scala.inline
  def apply[TState](): RecursiveVisitors[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursiveVisitors[TState]]
  }
  
  @scala.inline
  implicit class RecursiveVisitorsOps[Self <: RecursiveVisitors[_], TState] (val x: Self with RecursiveVisitors[TState]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnyTypeAnnotation(
      value: (/* node */ NodeType[AnyTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("AnyTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAnyTypeAnnotation: Self = this.set("AnyTypeAnnotation", js.undefined)
    
    @scala.inline
    def setArgumentPlaceholder(
      value: (/* node */ NodeType[ArgumentPlaceholder], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ArgumentPlaceholder", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteArgumentPlaceholder: Self = this.set("ArgumentPlaceholder", js.undefined)
    
    @scala.inline
    def setArrayExpression(
      value: (/* node */ NodeType[ArrayExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ArrayExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteArrayExpression: Self = this.set("ArrayExpression", js.undefined)
    
    @scala.inline
    def setArrayPattern(
      value: (/* node */ NodeType[ArrayPattern], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ArrayPattern", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteArrayPattern: Self = this.set("ArrayPattern", js.undefined)
    
    @scala.inline
    def setArrayTypeAnnotation(
      value: (/* node */ NodeType[ArrayTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ArrayTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteArrayTypeAnnotation: Self = this.set("ArrayTypeAnnotation", js.undefined)
    
    @scala.inline
    def setArrowFunctionExpression(
      value: (/* node */ NodeType[ArrowFunctionExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ArrowFunctionExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteArrowFunctionExpression: Self = this.set("ArrowFunctionExpression", js.undefined)
    
    @scala.inline
    def setAssignmentExpression(
      value: (/* node */ NodeType[AssignmentExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("AssignmentExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAssignmentExpression: Self = this.set("AssignmentExpression", js.undefined)
    
    @scala.inline
    def setAssignmentPattern(
      value: (/* node */ NodeType[AssignmentPattern], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("AssignmentPattern", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAssignmentPattern: Self = this.set("AssignmentPattern", js.undefined)
    
    @scala.inline
    def setAwaitExpression(
      value: (/* node */ NodeType[AwaitExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("AwaitExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAwaitExpression: Self = this.set("AwaitExpression", js.undefined)
    
    @scala.inline
    def setBigIntLiteral(
      value: (/* node */ NodeType[BigIntLiteral], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("BigIntLiteral", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBigIntLiteral: Self = this.set("BigIntLiteral", js.undefined)
    
    @scala.inline
    def setBinary(
      value: (/* node */ NodeType[Binary], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Binary", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBinary: Self = this.set("Binary", js.undefined)
    
    @scala.inline
    def setBinaryExpression(
      value: (/* node */ NodeType[BinaryExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("BinaryExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBinaryExpression: Self = this.set("BinaryExpression", js.undefined)
    
    @scala.inline
    def setBindExpression(
      value: (/* node */ NodeType[BindExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("BindExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBindExpression: Self = this.set("BindExpression", js.undefined)
    
    @scala.inline
    def setBlock(
      value: (/* node */ NodeType[Block], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Block", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBlock: Self = this.set("Block", js.undefined)
    
    @scala.inline
    def setBlockParent(
      value: (/* node */ NodeType[BlockParent], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("BlockParent", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBlockParent: Self = this.set("BlockParent", js.undefined)
    
    @scala.inline
    def setBlockStatement(
      value: (/* node */ NodeType[BlockStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("BlockStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBlockStatement: Self = this.set("BlockStatement", js.undefined)
    
    @scala.inline
    def setBooleanLiteral(
      value: (/* node */ NodeType[BooleanLiteral], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("BooleanLiteral", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBooleanLiteral: Self = this.set("BooleanLiteral", js.undefined)
    
    @scala.inline
    def setBooleanLiteralTypeAnnotation(
      value: (/* node */ NodeType[BooleanLiteralTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("BooleanLiteralTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBooleanLiteralTypeAnnotation: Self = this.set("BooleanLiteralTypeAnnotation", js.undefined)
    
    @scala.inline
    def setBooleanTypeAnnotation(
      value: (/* node */ NodeType[BooleanTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("BooleanTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBooleanTypeAnnotation: Self = this.set("BooleanTypeAnnotation", js.undefined)
    
    @scala.inline
    def setBreakStatement(
      value: (/* node */ NodeType[BreakStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("BreakStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBreakStatement: Self = this.set("BreakStatement", js.undefined)
    
    @scala.inline
    def setCallExpression(
      value: (/* node */ NodeType[CallExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("CallExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCallExpression: Self = this.set("CallExpression", js.undefined)
    
    @scala.inline
    def setCatchClause(
      value: (/* node */ NodeType[CatchClause], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("CatchClause", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCatchClause: Self = this.set("CatchClause", js.undefined)
    
    @scala.inline
    def setClass(
      value: (/* node */ NodeType[Class], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Class", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteClass: Self = this.set("Class", js.undefined)
    
    @scala.inline
    def setClassBody(
      value: (/* node */ NodeType[ClassBody], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ClassBody", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteClassBody: Self = this.set("ClassBody", js.undefined)
    
    @scala.inline
    def setClassDeclaration(
      value: (/* node */ NodeType[ClassDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ClassDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteClassDeclaration: Self = this.set("ClassDeclaration", js.undefined)
    
    @scala.inline
    def setClassExpression(
      value: (/* node */ NodeType[ClassExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ClassExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteClassExpression: Self = this.set("ClassExpression", js.undefined)
    
    @scala.inline
    def setClassImplements(
      value: (/* node */ NodeType[ClassImplements], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ClassImplements", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteClassImplements: Self = this.set("ClassImplements", js.undefined)
    
    @scala.inline
    def setClassMethod(
      value: (/* node */ NodeType[ClassMethod], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ClassMethod", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteClassMethod: Self = this.set("ClassMethod", js.undefined)
    
    @scala.inline
    def setClassPrivateMethod(
      value: (/* node */ NodeType[ClassPrivateMethod], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ClassPrivateMethod", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteClassPrivateMethod: Self = this.set("ClassPrivateMethod", js.undefined)
    
    @scala.inline
    def setClassPrivateProperty(
      value: (/* node */ NodeType[ClassPrivateProperty], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ClassPrivateProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteClassPrivateProperty: Self = this.set("ClassPrivateProperty", js.undefined)
    
    @scala.inline
    def setClassProperty(
      value: (/* node */ NodeType[ClassProperty], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ClassProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteClassProperty: Self = this.set("ClassProperty", js.undefined)
    
    @scala.inline
    def setCompletionStatement(
      value: (/* node */ NodeType[CompletionStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("CompletionStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCompletionStatement: Self = this.set("CompletionStatement", js.undefined)
    
    @scala.inline
    def setConditional(
      value: (/* node */ NodeType[Conditional], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Conditional", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteConditional: Self = this.set("Conditional", js.undefined)
    
    @scala.inline
    def setConditionalExpression(
      value: (/* node */ NodeType[ConditionalExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ConditionalExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteConditionalExpression: Self = this.set("ConditionalExpression", js.undefined)
    
    @scala.inline
    def setContinueStatement(
      value: (/* node */ NodeType[ContinueStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ContinueStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteContinueStatement: Self = this.set("ContinueStatement", js.undefined)
    
    @scala.inline
    def setDebuggerStatement(
      value: (/* node */ NodeType[DebuggerStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DebuggerStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDebuggerStatement: Self = this.set("DebuggerStatement", js.undefined)
    
    @scala.inline
    def setDecimalLiteral(
      value: (/* node */ NodeType[DecimalLiteral], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DecimalLiteral", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDecimalLiteral: Self = this.set("DecimalLiteral", js.undefined)
    
    @scala.inline
    def setDeclaration(
      value: (/* node */ NodeType[Declaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Declaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDeclaration: Self = this.set("Declaration", js.undefined)
    
    @scala.inline
    def setDeclareClass(
      value: (/* node */ NodeType[DeclareClass], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DeclareClass", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDeclareClass: Self = this.set("DeclareClass", js.undefined)
    
    @scala.inline
    def setDeclareExportAllDeclaration(
      value: (/* node */ NodeType[DeclareExportAllDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DeclareExportAllDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDeclareExportAllDeclaration: Self = this.set("DeclareExportAllDeclaration", js.undefined)
    
    @scala.inline
    def setDeclareExportDeclaration(
      value: (/* node */ NodeType[DeclareExportDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DeclareExportDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDeclareExportDeclaration: Self = this.set("DeclareExportDeclaration", js.undefined)
    
    @scala.inline
    def setDeclareFunction(
      value: (/* node */ NodeType[DeclareFunction], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DeclareFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDeclareFunction: Self = this.set("DeclareFunction", js.undefined)
    
    @scala.inline
    def setDeclareInterface(
      value: (/* node */ NodeType[DeclareInterface], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DeclareInterface", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDeclareInterface: Self = this.set("DeclareInterface", js.undefined)
    
    @scala.inline
    def setDeclareModule(
      value: (/* node */ NodeType[DeclareModule], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DeclareModule", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDeclareModule: Self = this.set("DeclareModule", js.undefined)
    
    @scala.inline
    def setDeclareModuleExports(
      value: (/* node */ NodeType[DeclareModuleExports], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DeclareModuleExports", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDeclareModuleExports: Self = this.set("DeclareModuleExports", js.undefined)
    
    @scala.inline
    def setDeclareOpaqueType(
      value: (/* node */ NodeType[DeclareOpaqueType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DeclareOpaqueType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDeclareOpaqueType: Self = this.set("DeclareOpaqueType", js.undefined)
    
    @scala.inline
    def setDeclareTypeAlias(
      value: (/* node */ NodeType[DeclareTypeAlias], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DeclareTypeAlias", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDeclareTypeAlias: Self = this.set("DeclareTypeAlias", js.undefined)
    
    @scala.inline
    def setDeclareVariable(
      value: (/* node */ NodeType[DeclareVariable], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DeclareVariable", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDeclareVariable: Self = this.set("DeclareVariable", js.undefined)
    
    @scala.inline
    def setDeclaredPredicate(
      value: (/* node */ NodeType[DeclaredPredicate], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DeclaredPredicate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDeclaredPredicate: Self = this.set("DeclaredPredicate", js.undefined)
    
    @scala.inline
    def setDecorator(
      value: (/* node */ NodeType[Decorator], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Decorator", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDecorator: Self = this.set("Decorator", js.undefined)
    
    @scala.inline
    def setDirective(
      value: (/* node */ NodeType[Directive], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Directive", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDirective: Self = this.set("Directive", js.undefined)
    
    @scala.inline
    def setDirectiveLiteral(
      value: (/* node */ NodeType[DirectiveLiteral], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DirectiveLiteral", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDirectiveLiteral: Self = this.set("DirectiveLiteral", js.undefined)
    
    @scala.inline
    def setDoExpression(
      value: (/* node */ NodeType[DoExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DoExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDoExpression: Self = this.set("DoExpression", js.undefined)
    
    @scala.inline
    def setDoWhileStatement(
      value: (/* node */ NodeType[DoWhileStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("DoWhileStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDoWhileStatement: Self = this.set("DoWhileStatement", js.undefined)
    
    @scala.inline
    def setEmptyStatement(
      value: (/* node */ NodeType[EmptyStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("EmptyStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEmptyStatement: Self = this.set("EmptyStatement", js.undefined)
    
    @scala.inline
    def setEmptyTypeAnnotation(
      value: (/* node */ NodeType[EmptyTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("EmptyTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEmptyTypeAnnotation: Self = this.set("EmptyTypeAnnotation", js.undefined)
    
    @scala.inline
    def setEnumBody(
      value: (/* node */ NodeType[EnumBody], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("EnumBody", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnumBody: Self = this.set("EnumBody", js.undefined)
    
    @scala.inline
    def setEnumBooleanBody(
      value: (/* node */ NodeType[EnumBooleanBody], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("EnumBooleanBody", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnumBooleanBody: Self = this.set("EnumBooleanBody", js.undefined)
    
    @scala.inline
    def setEnumBooleanMember(
      value: (/* node */ NodeType[EnumBooleanMember], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("EnumBooleanMember", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnumBooleanMember: Self = this.set("EnumBooleanMember", js.undefined)
    
    @scala.inline
    def setEnumDeclaration(
      value: (/* node */ NodeType[EnumDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("EnumDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnumDeclaration: Self = this.set("EnumDeclaration", js.undefined)
    
    @scala.inline
    def setEnumDefaultedMember(
      value: (/* node */ NodeType[EnumDefaultedMember], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("EnumDefaultedMember", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnumDefaultedMember: Self = this.set("EnumDefaultedMember", js.undefined)
    
    @scala.inline
    def setEnumMember(
      value: (/* node */ NodeType[EnumMember], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("EnumMember", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnumMember: Self = this.set("EnumMember", js.undefined)
    
    @scala.inline
    def setEnumNumberBody(
      value: (/* node */ NodeType[EnumNumberBody], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("EnumNumberBody", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnumNumberBody: Self = this.set("EnumNumberBody", js.undefined)
    
    @scala.inline
    def setEnumNumberMember(
      value: (/* node */ NodeType[EnumNumberMember], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("EnumNumberMember", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnumNumberMember: Self = this.set("EnumNumberMember", js.undefined)
    
    @scala.inline
    def setEnumStringBody(
      value: (/* node */ NodeType[EnumStringBody], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("EnumStringBody", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnumStringBody: Self = this.set("EnumStringBody", js.undefined)
    
    @scala.inline
    def setEnumStringMember(
      value: (/* node */ NodeType[EnumStringMember], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("EnumStringMember", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnumStringMember: Self = this.set("EnumStringMember", js.undefined)
    
    @scala.inline
    def setEnumSymbolBody(
      value: (/* node */ NodeType[EnumSymbolBody], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("EnumSymbolBody", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnumSymbolBody: Self = this.set("EnumSymbolBody", js.undefined)
    
    @scala.inline
    def setExistsTypeAnnotation(
      value: (/* node */ NodeType[ExistsTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ExistsTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExistsTypeAnnotation: Self = this.set("ExistsTypeAnnotation", js.undefined)
    
    @scala.inline
    def setExportAllDeclaration(
      value: (/* node */ NodeType[ExportAllDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ExportAllDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExportAllDeclaration: Self = this.set("ExportAllDeclaration", js.undefined)
    
    @scala.inline
    def setExportDeclaration(
      value: (/* node */ NodeType[ExportDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ExportDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExportDeclaration: Self = this.set("ExportDeclaration", js.undefined)
    
    @scala.inline
    def setExportDefaultDeclaration(
      value: (/* node */ NodeType[ExportDefaultDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ExportDefaultDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExportDefaultDeclaration: Self = this.set("ExportDefaultDeclaration", js.undefined)
    
    @scala.inline
    def setExportDefaultSpecifier(
      value: (/* node */ NodeType[ExportDefaultSpecifier], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ExportDefaultSpecifier", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExportDefaultSpecifier: Self = this.set("ExportDefaultSpecifier", js.undefined)
    
    @scala.inline
    def setExportNamedDeclaration(
      value: (/* node */ NodeType[ExportNamedDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ExportNamedDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExportNamedDeclaration: Self = this.set("ExportNamedDeclaration", js.undefined)
    
    @scala.inline
    def setExportNamespaceSpecifier(
      value: (/* node */ NodeType[ExportNamespaceSpecifier], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ExportNamespaceSpecifier", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExportNamespaceSpecifier: Self = this.set("ExportNamespaceSpecifier", js.undefined)
    
    @scala.inline
    def setExportSpecifier(
      value: (/* node */ NodeType[ExportSpecifier], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ExportSpecifier", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExportSpecifier: Self = this.set("ExportSpecifier", js.undefined)
    
    @scala.inline
    def setExpression(
      value: (/* node */ NodeType[Expression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Expression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExpression: Self = this.set("Expression", js.undefined)
    
    @scala.inline
    def setExpressionStatement(
      value: (/* node */ NodeType[ExpressionStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ExpressionStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExpressionStatement: Self = this.set("ExpressionStatement", js.undefined)
    
    @scala.inline
    def setExpressionWrapper(
      value: (/* node */ NodeType[ExpressionWrapper], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ExpressionWrapper", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExpressionWrapper: Self = this.set("ExpressionWrapper", js.undefined)
    
    @scala.inline
    def setFile(
      value: (/* node */ NodeType[File], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("File", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFile: Self = this.set("File", js.undefined)
    
    @scala.inline
    def setFlow(
      value: (/* node */ NodeType[Flow], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Flow", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFlow: Self = this.set("Flow", js.undefined)
    
    @scala.inline
    def setFlowBaseAnnotation(
      value: (/* node */ NodeType[FlowBaseAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("FlowBaseAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFlowBaseAnnotation: Self = this.set("FlowBaseAnnotation", js.undefined)
    
    @scala.inline
    def setFlowDeclaration(
      value: (/* node */ NodeType[FlowDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("FlowDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFlowDeclaration: Self = this.set("FlowDeclaration", js.undefined)
    
    @scala.inline
    def setFlowPredicate(
      value: (/* node */ NodeType[FlowPredicate], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("FlowPredicate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFlowPredicate: Self = this.set("FlowPredicate", js.undefined)
    
    @scala.inline
    def setFlowType(
      value: (/* node */ NodeType[FlowType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("FlowType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFlowType: Self = this.set("FlowType", js.undefined)
    
    @scala.inline
    def setFor(
      value: (/* node */ NodeType[For], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("For", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFor: Self = this.set("For", js.undefined)
    
    @scala.inline
    def setForInStatement(
      value: (/* node */ NodeType[ForInStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ForInStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteForInStatement: Self = this.set("ForInStatement", js.undefined)
    
    @scala.inline
    def setForOfStatement(
      value: (/* node */ NodeType[ForOfStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ForOfStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteForOfStatement: Self = this.set("ForOfStatement", js.undefined)
    
    @scala.inline
    def setForStatement(
      value: (/* node */ NodeType[ForStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ForStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteForStatement: Self = this.set("ForStatement", js.undefined)
    
    @scala.inline
    def setForXStatement(
      value: (/* node */ NodeType[ForXStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ForXStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteForXStatement: Self = this.set("ForXStatement", js.undefined)
    
    @scala.inline
    def setFunction(
      value: (/* node */ NodeType[Function], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Function", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFunction: Self = this.set("Function", js.undefined)
    
    @scala.inline
    def setFunctionDeclaration(
      value: (/* node */ NodeType[FunctionDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("FunctionDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFunctionDeclaration: Self = this.set("FunctionDeclaration", js.undefined)
    
    @scala.inline
    def setFunctionExpression(
      value: (/* node */ NodeType[FunctionExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("FunctionExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFunctionExpression: Self = this.set("FunctionExpression", js.undefined)
    
    @scala.inline
    def setFunctionParent(
      value: (/* node */ NodeType[FunctionParent], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("FunctionParent", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFunctionParent: Self = this.set("FunctionParent", js.undefined)
    
    @scala.inline
    def setFunctionTypeAnnotation(
      value: (/* node */ NodeType[FunctionTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("FunctionTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFunctionTypeAnnotation: Self = this.set("FunctionTypeAnnotation", js.undefined)
    
    @scala.inline
    def setFunctionTypeParam(
      value: (/* node */ NodeType[FunctionTypeParam], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("FunctionTypeParam", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFunctionTypeParam: Self = this.set("FunctionTypeParam", js.undefined)
    
    @scala.inline
    def setGenericTypeAnnotation(
      value: (/* node */ NodeType[GenericTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("GenericTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGenericTypeAnnotation: Self = this.set("GenericTypeAnnotation", js.undefined)
    
    @scala.inline
    def setIdentifier(
      value: (/* node */ NodeType[Identifier], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Identifier", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteIdentifier: Self = this.set("Identifier", js.undefined)
    
    @scala.inline
    def setIfStatement(
      value: (/* node */ NodeType[IfStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("IfStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteIfStatement: Self = this.set("IfStatement", js.undefined)
    
    @scala.inline
    def setImmutable(
      value: (/* node */ NodeType[Immutable], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Immutable", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteImmutable: Self = this.set("Immutable", js.undefined)
    
    @scala.inline
    def setImport(
      value: (/* node */ NodeType[Import], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Import", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteImport: Self = this.set("Import", js.undefined)
    
    @scala.inline
    def setImportAttribute(
      value: (/* node */ NodeType[ImportAttribute], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ImportAttribute", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteImportAttribute: Self = this.set("ImportAttribute", js.undefined)
    
    @scala.inline
    def setImportDeclaration(
      value: (/* node */ NodeType[ImportDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ImportDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteImportDeclaration: Self = this.set("ImportDeclaration", js.undefined)
    
    @scala.inline
    def setImportDefaultSpecifier(
      value: (/* node */ NodeType[ImportDefaultSpecifier], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ImportDefaultSpecifier", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteImportDefaultSpecifier: Self = this.set("ImportDefaultSpecifier", js.undefined)
    
    @scala.inline
    def setImportNamespaceSpecifier(
      value: (/* node */ NodeType[ImportNamespaceSpecifier], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ImportNamespaceSpecifier", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteImportNamespaceSpecifier: Self = this.set("ImportNamespaceSpecifier", js.undefined)
    
    @scala.inline
    def setImportSpecifier(
      value: (/* node */ NodeType[ImportSpecifier], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ImportSpecifier", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteImportSpecifier: Self = this.set("ImportSpecifier", js.undefined)
    
    @scala.inline
    def setInferredPredicate(
      value: (/* node */ NodeType[InferredPredicate], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("InferredPredicate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteInferredPredicate: Self = this.set("InferredPredicate", js.undefined)
    
    @scala.inline
    def setInterfaceDeclaration(
      value: (/* node */ NodeType[InterfaceDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("InterfaceDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteInterfaceDeclaration: Self = this.set("InterfaceDeclaration", js.undefined)
    
    @scala.inline
    def setInterfaceExtends(
      value: (/* node */ NodeType[InterfaceExtends], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("InterfaceExtends", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteInterfaceExtends: Self = this.set("InterfaceExtends", js.undefined)
    
    @scala.inline
    def setInterfaceTypeAnnotation(
      value: (/* node */ NodeType[InterfaceTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("InterfaceTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteInterfaceTypeAnnotation: Self = this.set("InterfaceTypeAnnotation", js.undefined)
    
    @scala.inline
    def setInterpreterDirective(
      value: (/* node */ NodeType[InterpreterDirective], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("InterpreterDirective", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteInterpreterDirective: Self = this.set("InterpreterDirective", js.undefined)
    
    @scala.inline
    def setIntersectionTypeAnnotation(
      value: (/* node */ NodeType[IntersectionTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("IntersectionTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteIntersectionTypeAnnotation: Self = this.set("IntersectionTypeAnnotation", js.undefined)
    
    @scala.inline
    def setJSX(
      value: (/* node */ NodeType[JSX], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSX", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSX: Self = this.set("JSX", js.undefined)
    
    @scala.inline
    def setJSXAttribute(
      value: (/* node */ NodeType[JSXAttribute], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXAttribute", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXAttribute: Self = this.set("JSXAttribute", js.undefined)
    
    @scala.inline
    def setJSXClosingElement(
      value: (/* node */ NodeType[JSXClosingElement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXClosingElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXClosingElement: Self = this.set("JSXClosingElement", js.undefined)
    
    @scala.inline
    def setJSXClosingFragment(
      value: (/* node */ NodeType[JSXClosingFragment], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXClosingFragment", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXClosingFragment: Self = this.set("JSXClosingFragment", js.undefined)
    
    @scala.inline
    def setJSXElement(
      value: (/* node */ NodeType[JSXElement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXElement: Self = this.set("JSXElement", js.undefined)
    
    @scala.inline
    def setJSXEmptyExpression(
      value: (/* node */ NodeType[JSXEmptyExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXEmptyExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXEmptyExpression: Self = this.set("JSXEmptyExpression", js.undefined)
    
    @scala.inline
    def setJSXExpressionContainer(
      value: (/* node */ NodeType[JSXExpressionContainer], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXExpressionContainer", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXExpressionContainer: Self = this.set("JSXExpressionContainer", js.undefined)
    
    @scala.inline
    def setJSXFragment(
      value: (/* node */ NodeType[JSXFragment], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXFragment", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXFragment: Self = this.set("JSXFragment", js.undefined)
    
    @scala.inline
    def setJSXIdentifier(
      value: (/* node */ NodeType[JSXIdentifier], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXIdentifier", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXIdentifier: Self = this.set("JSXIdentifier", js.undefined)
    
    @scala.inline
    def setJSXMemberExpression(
      value: (/* node */ NodeType[JSXMemberExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXMemberExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXMemberExpression: Self = this.set("JSXMemberExpression", js.undefined)
    
    @scala.inline
    def setJSXNamespacedName(
      value: (/* node */ NodeType[JSXNamespacedName], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXNamespacedName", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXNamespacedName: Self = this.set("JSXNamespacedName", js.undefined)
    
    @scala.inline
    def setJSXOpeningElement(
      value: (/* node */ NodeType[JSXOpeningElement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXOpeningElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXOpeningElement: Self = this.set("JSXOpeningElement", js.undefined)
    
    @scala.inline
    def setJSXOpeningFragment(
      value: (/* node */ NodeType[JSXOpeningFragment], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXOpeningFragment", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXOpeningFragment: Self = this.set("JSXOpeningFragment", js.undefined)
    
    @scala.inline
    def setJSXSpreadAttribute(
      value: (/* node */ NodeType[JSXSpreadAttribute], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXSpreadAttribute", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXSpreadAttribute: Self = this.set("JSXSpreadAttribute", js.undefined)
    
    @scala.inline
    def setJSXSpreadChild(
      value: (/* node */ NodeType[JSXSpreadChild], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXSpreadChild", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXSpreadChild: Self = this.set("JSXSpreadChild", js.undefined)
    
    @scala.inline
    def setJSXText(
      value: (/* node */ NodeType[JSXText], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("JSXText", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteJSXText: Self = this.set("JSXText", js.undefined)
    
    @scala.inline
    def setLVal(
      value: (/* node */ NodeType[LVal], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("LVal", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLVal: Self = this.set("LVal", js.undefined)
    
    @scala.inline
    def setLabeledStatement(
      value: (/* node */ NodeType[LabeledStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("LabeledStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLabeledStatement: Self = this.set("LabeledStatement", js.undefined)
    
    @scala.inline
    def setLiteral(
      value: (/* node */ NodeType[Literal], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Literal", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLiteral: Self = this.set("Literal", js.undefined)
    
    @scala.inline
    def setLogicalExpression(
      value: (/* node */ NodeType[LogicalExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("LogicalExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLogicalExpression: Self = this.set("LogicalExpression", js.undefined)
    
    @scala.inline
    def setLoop(
      value: (/* node */ NodeType[Loop], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Loop", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLoop: Self = this.set("Loop", js.undefined)
    
    @scala.inline
    def setMemberExpression(
      value: (/* node */ NodeType[MemberExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("MemberExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMemberExpression: Self = this.set("MemberExpression", js.undefined)
    
    @scala.inline
    def setMetaProperty(
      value: (/* node */ NodeType[MetaProperty], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("MetaProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMetaProperty: Self = this.set("MetaProperty", js.undefined)
    
    @scala.inline
    def setMethod(
      value: (/* node */ NodeType[Method], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Method", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMethod: Self = this.set("Method", js.undefined)
    
    @scala.inline
    def setMixedTypeAnnotation(
      value: (/* node */ NodeType[MixedTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("MixedTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMixedTypeAnnotation: Self = this.set("MixedTypeAnnotation", js.undefined)
    
    @scala.inline
    def setModuleDeclaration(
      value: (/* node */ NodeType[ModuleDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ModuleDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteModuleDeclaration: Self = this.set("ModuleDeclaration", js.undefined)
    
    @scala.inline
    def setModuleSpecifier(
      value: (/* node */ NodeType[ModuleSpecifier], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ModuleSpecifier", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteModuleSpecifier: Self = this.set("ModuleSpecifier", js.undefined)
    
    @scala.inline
    def setNewExpression(
      value: (/* node */ NodeType[NewExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("NewExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteNewExpression: Self = this.set("NewExpression", js.undefined)
    
    @scala.inline
    def setNoop(
      value: (/* node */ NodeType[Noop], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Noop", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteNoop: Self = this.set("Noop", js.undefined)
    
    @scala.inline
    def setNullLiteral(
      value: (/* node */ NodeType[NullLiteral], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("NullLiteral", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteNullLiteral: Self = this.set("NullLiteral", js.undefined)
    
    @scala.inline
    def setNullLiteralTypeAnnotation(
      value: (/* node */ NodeType[NullLiteralTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("NullLiteralTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteNullLiteralTypeAnnotation: Self = this.set("NullLiteralTypeAnnotation", js.undefined)
    
    @scala.inline
    def setNullableTypeAnnotation(
      value: (/* node */ NodeType[NullableTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("NullableTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteNullableTypeAnnotation: Self = this.set("NullableTypeAnnotation", js.undefined)
    
    @scala.inline
    def setNumberLiteralTypeAnnotation(
      value: (/* node */ NodeType[NumberLiteralTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("NumberLiteralTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteNumberLiteralTypeAnnotation: Self = this.set("NumberLiteralTypeAnnotation", js.undefined)
    
    @scala.inline
    def setNumberTypeAnnotation(
      value: (/* node */ NodeType[NumberTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("NumberTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteNumberTypeAnnotation: Self = this.set("NumberTypeAnnotation", js.undefined)
    
    @scala.inline
    def setNumericLiteral(
      value: (/* node */ NodeType[NumericLiteral], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("NumericLiteral", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteNumericLiteral: Self = this.set("NumericLiteral", js.undefined)
    
    @scala.inline
    def setObjectExpression(
      value: (/* node */ NodeType[ObjectExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ObjectExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteObjectExpression: Self = this.set("ObjectExpression", js.undefined)
    
    @scala.inline
    def setObjectMember(
      value: (/* node */ NodeType[ObjectMember], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ObjectMember", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteObjectMember: Self = this.set("ObjectMember", js.undefined)
    
    @scala.inline
    def setObjectMethod(
      value: (/* node */ NodeType[ObjectMethod], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ObjectMethod", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteObjectMethod: Self = this.set("ObjectMethod", js.undefined)
    
    @scala.inline
    def setObjectPattern(
      value: (/* node */ NodeType[ObjectPattern], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ObjectPattern", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteObjectPattern: Self = this.set("ObjectPattern", js.undefined)
    
    @scala.inline
    def setObjectProperty(
      value: (/* node */ NodeType[ObjectProperty], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ObjectProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteObjectProperty: Self = this.set("ObjectProperty", js.undefined)
    
    @scala.inline
    def setObjectTypeAnnotation(
      value: (/* node */ NodeType[ObjectTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ObjectTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteObjectTypeAnnotation: Self = this.set("ObjectTypeAnnotation", js.undefined)
    
    @scala.inline
    def setObjectTypeCallProperty(
      value: (/* node */ NodeType[ObjectTypeCallProperty], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ObjectTypeCallProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteObjectTypeCallProperty: Self = this.set("ObjectTypeCallProperty", js.undefined)
    
    @scala.inline
    def setObjectTypeIndexer(
      value: (/* node */ NodeType[ObjectTypeIndexer], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ObjectTypeIndexer", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteObjectTypeIndexer: Self = this.set("ObjectTypeIndexer", js.undefined)
    
    @scala.inline
    def setObjectTypeInternalSlot(
      value: (/* node */ NodeType[ObjectTypeInternalSlot], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ObjectTypeInternalSlot", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteObjectTypeInternalSlot: Self = this.set("ObjectTypeInternalSlot", js.undefined)
    
    @scala.inline
    def setObjectTypeProperty(
      value: (/* node */ NodeType[ObjectTypeProperty], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ObjectTypeProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteObjectTypeProperty: Self = this.set("ObjectTypeProperty", js.undefined)
    
    @scala.inline
    def setObjectTypeSpreadProperty(
      value: (/* node */ NodeType[ObjectTypeSpreadProperty], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ObjectTypeSpreadProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteObjectTypeSpreadProperty: Self = this.set("ObjectTypeSpreadProperty", js.undefined)
    
    @scala.inline
    def setOpaqueType(
      value: (/* node */ NodeType[OpaqueType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("OpaqueType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOpaqueType: Self = this.set("OpaqueType", js.undefined)
    
    @scala.inline
    def setOptionalCallExpression(
      value: (/* node */ NodeType[OptionalCallExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("OptionalCallExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOptionalCallExpression: Self = this.set("OptionalCallExpression", js.undefined)
    
    @scala.inline
    def setOptionalMemberExpression(
      value: (/* node */ NodeType[OptionalMemberExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("OptionalMemberExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOptionalMemberExpression: Self = this.set("OptionalMemberExpression", js.undefined)
    
    @scala.inline
    def setParenthesizedExpression(
      value: (/* node */ NodeType[ParenthesizedExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ParenthesizedExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteParenthesizedExpression: Self = this.set("ParenthesizedExpression", js.undefined)
    
    @scala.inline
    def setPattern(
      value: (/* node */ NodeType[Pattern], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Pattern", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePattern: Self = this.set("Pattern", js.undefined)
    
    @scala.inline
    def setPatternLike(
      value: (/* node */ NodeType[PatternLike], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("PatternLike", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePatternLike: Self = this.set("PatternLike", js.undefined)
    
    @scala.inline
    def setPipelineBareFunction(
      value: (/* node */ NodeType[PipelineBareFunction], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("PipelineBareFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePipelineBareFunction: Self = this.set("PipelineBareFunction", js.undefined)
    
    @scala.inline
    def setPipelinePrimaryTopicReference(
      value: (/* node */ NodeType[PipelinePrimaryTopicReference], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("PipelinePrimaryTopicReference", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePipelinePrimaryTopicReference: Self = this.set("PipelinePrimaryTopicReference", js.undefined)
    
    @scala.inline
    def setPipelineTopicExpression(
      value: (/* node */ NodeType[PipelineTopicExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("PipelineTopicExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePipelineTopicExpression: Self = this.set("PipelineTopicExpression", js.undefined)
    
    @scala.inline
    def setPlaceholder(
      value: (/* node */ NodeType[Placeholder], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Placeholder", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePlaceholder: Self = this.set("Placeholder", js.undefined)
    
    @scala.inline
    def setPrivate(
      value: (/* node */ NodeType[Private], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Private", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePrivate: Self = this.set("Private", js.undefined)
    
    @scala.inline
    def setPrivateName(
      value: (/* node */ NodeType[PrivateName], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("PrivateName", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePrivateName: Self = this.set("PrivateName", js.undefined)
    
    @scala.inline
    def setProgram(
      value: (/* node */ NodeType[Program], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Program", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteProgram: Self = this.set("Program", js.undefined)
    
    @scala.inline
    def setProperty(
      value: (/* node */ NodeType[Property], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Property", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteProperty: Self = this.set("Property", js.undefined)
    
    @scala.inline
    def setPureish(
      value: (/* node */ NodeType[Pureish], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Pureish", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePureish: Self = this.set("Pureish", js.undefined)
    
    @scala.inline
    def setQualifiedTypeIdentifier(
      value: (/* node */ NodeType[QualifiedTypeIdentifier], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("QualifiedTypeIdentifier", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteQualifiedTypeIdentifier: Self = this.set("QualifiedTypeIdentifier", js.undefined)
    
    @scala.inline
    def setRecordExpression(
      value: (/* node */ NodeType[RecordExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("RecordExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRecordExpression: Self = this.set("RecordExpression", js.undefined)
    
    @scala.inline
    def setRegExpLiteral(
      value: (/* node */ NodeType[RegExpLiteral], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("RegExpLiteral", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRegExpLiteral: Self = this.set("RegExpLiteral", js.undefined)
    
    @scala.inline
    def setRestElement(
      value: (/* node */ NodeType[RestElement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("RestElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRestElement: Self = this.set("RestElement", js.undefined)
    
    @scala.inline
    def setReturnStatement(
      value: (/* node */ NodeType[ReturnStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ReturnStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteReturnStatement: Self = this.set("ReturnStatement", js.undefined)
    
    @scala.inline
    def setScopable(
      value: (/* node */ NodeType[Scopable], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Scopable", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteScopable: Self = this.set("Scopable", js.undefined)
    
    @scala.inline
    def setSequenceExpression(
      value: (/* node */ NodeType[SequenceExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("SequenceExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSequenceExpression: Self = this.set("SequenceExpression", js.undefined)
    
    @scala.inline
    def setSpreadElement(
      value: (/* node */ NodeType[SpreadElement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("SpreadElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSpreadElement: Self = this.set("SpreadElement", js.undefined)
    
    @scala.inline
    def setStatement(
      value: (/* node */ NodeType[Statement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Statement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStatement: Self = this.set("Statement", js.undefined)
    
    @scala.inline
    def setStaticBlock(
      value: (/* node */ NodeType[StaticBlock], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("StaticBlock", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStaticBlock: Self = this.set("StaticBlock", js.undefined)
    
    @scala.inline
    def setStringLiteral(
      value: (/* node */ NodeType[StringLiteral], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("StringLiteral", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStringLiteral: Self = this.set("StringLiteral", js.undefined)
    
    @scala.inline
    def setStringLiteralTypeAnnotation(
      value: (/* node */ NodeType[StringLiteralTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("StringLiteralTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStringLiteralTypeAnnotation: Self = this.set("StringLiteralTypeAnnotation", js.undefined)
    
    @scala.inline
    def setStringTypeAnnotation(
      value: (/* node */ NodeType[StringTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("StringTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStringTypeAnnotation: Self = this.set("StringTypeAnnotation", js.undefined)
    
    @scala.inline
    def setSuper(
      value: (/* node */ NodeType[Super], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Super", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSuper: Self = this.set("Super", js.undefined)
    
    @scala.inline
    def setSwitchCase(
      value: (/* node */ NodeType[SwitchCase], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("SwitchCase", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSwitchCase: Self = this.set("SwitchCase", js.undefined)
    
    @scala.inline
    def setSwitchStatement(
      value: (/* node */ NodeType[SwitchStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("SwitchStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSwitchStatement: Self = this.set("SwitchStatement", js.undefined)
    
    @scala.inline
    def setSymbolTypeAnnotation(
      value: (/* node */ NodeType[SymbolTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("SymbolTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSymbolTypeAnnotation: Self = this.set("SymbolTypeAnnotation", js.undefined)
    
    @scala.inline
    def setTSAnyKeyword(
      value: (/* node */ NodeType[TSAnyKeyword], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSAnyKeyword", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSAnyKeyword: Self = this.set("TSAnyKeyword", js.undefined)
    
    @scala.inline
    def setTSArrayType(
      value: (/* node */ NodeType[TSArrayType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSArrayType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSArrayType: Self = this.set("TSArrayType", js.undefined)
    
    @scala.inline
    def setTSAsExpression(
      value: (/* node */ NodeType[TSAsExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSAsExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSAsExpression: Self = this.set("TSAsExpression", js.undefined)
    
    @scala.inline
    def setTSBaseType(
      value: (/* node */ NodeType[TSBaseType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSBaseType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSBaseType: Self = this.set("TSBaseType", js.undefined)
    
    @scala.inline
    def setTSBigIntKeyword(
      value: (/* node */ NodeType[TSBigIntKeyword], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSBigIntKeyword", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSBigIntKeyword: Self = this.set("TSBigIntKeyword", js.undefined)
    
    @scala.inline
    def setTSBooleanKeyword(
      value: (/* node */ NodeType[TSBooleanKeyword], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSBooleanKeyword", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSBooleanKeyword: Self = this.set("TSBooleanKeyword", js.undefined)
    
    @scala.inline
    def setTSCallSignatureDeclaration(
      value: (/* node */ NodeType[TSCallSignatureDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSCallSignatureDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSCallSignatureDeclaration: Self = this.set("TSCallSignatureDeclaration", js.undefined)
    
    @scala.inline
    def setTSConditionalType(
      value: (/* node */ NodeType[TSConditionalType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSConditionalType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSConditionalType: Self = this.set("TSConditionalType", js.undefined)
    
    @scala.inline
    def setTSConstructSignatureDeclaration(
      value: (/* node */ NodeType[TSConstructSignatureDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSConstructSignatureDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSConstructSignatureDeclaration: Self = this.set("TSConstructSignatureDeclaration", js.undefined)
    
    @scala.inline
    def setTSConstructorType(
      value: (/* node */ NodeType[TSConstructorType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSConstructorType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSConstructorType: Self = this.set("TSConstructorType", js.undefined)
    
    @scala.inline
    def setTSDeclareFunction(
      value: (/* node */ NodeType[TSDeclareFunction], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSDeclareFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSDeclareFunction: Self = this.set("TSDeclareFunction", js.undefined)
    
    @scala.inline
    def setTSDeclareMethod(
      value: (/* node */ NodeType[TSDeclareMethod], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSDeclareMethod", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSDeclareMethod: Self = this.set("TSDeclareMethod", js.undefined)
    
    @scala.inline
    def setTSEntityName(
      value: (/* node */ NodeType[TSEntityName], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSEntityName", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSEntityName: Self = this.set("TSEntityName", js.undefined)
    
    @scala.inline
    def setTSEnumDeclaration(
      value: (/* node */ NodeType[TSEnumDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSEnumDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSEnumDeclaration: Self = this.set("TSEnumDeclaration", js.undefined)
    
    @scala.inline
    def setTSEnumMember(
      value: (/* node */ NodeType[TSEnumMember], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSEnumMember", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSEnumMember: Self = this.set("TSEnumMember", js.undefined)
    
    @scala.inline
    def setTSExportAssignment(
      value: (/* node */ NodeType[TSExportAssignment], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSExportAssignment", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSExportAssignment: Self = this.set("TSExportAssignment", js.undefined)
    
    @scala.inline
    def setTSExpressionWithTypeArguments(
      value: (/* node */ NodeType[TSExpressionWithTypeArguments], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSExpressionWithTypeArguments", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSExpressionWithTypeArguments: Self = this.set("TSExpressionWithTypeArguments", js.undefined)
    
    @scala.inline
    def setTSExternalModuleReference(
      value: (/* node */ NodeType[TSExternalModuleReference], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSExternalModuleReference", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSExternalModuleReference: Self = this.set("TSExternalModuleReference", js.undefined)
    
    @scala.inline
    def setTSFunctionType(
      value: (/* node */ NodeType[TSFunctionType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSFunctionType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSFunctionType: Self = this.set("TSFunctionType", js.undefined)
    
    @scala.inline
    def setTSImportEqualsDeclaration(
      value: (/* node */ NodeType[TSImportEqualsDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSImportEqualsDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSImportEqualsDeclaration: Self = this.set("TSImportEqualsDeclaration", js.undefined)
    
    @scala.inline
    def setTSImportType(
      value: (/* node */ NodeType[TSImportType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSImportType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSImportType: Self = this.set("TSImportType", js.undefined)
    
    @scala.inline
    def setTSIndexSignature(
      value: (/* node */ NodeType[TSIndexSignature], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSIndexSignature", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSIndexSignature: Self = this.set("TSIndexSignature", js.undefined)
    
    @scala.inline
    def setTSIndexedAccessType(
      value: (/* node */ NodeType[TSIndexedAccessType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSIndexedAccessType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSIndexedAccessType: Self = this.set("TSIndexedAccessType", js.undefined)
    
    @scala.inline
    def setTSInferType(
      value: (/* node */ NodeType[TSInferType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSInferType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSInferType: Self = this.set("TSInferType", js.undefined)
    
    @scala.inline
    def setTSInterfaceBody(
      value: (/* node */ NodeType[TSInterfaceBody], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSInterfaceBody", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSInterfaceBody: Self = this.set("TSInterfaceBody", js.undefined)
    
    @scala.inline
    def setTSInterfaceDeclaration(
      value: (/* node */ NodeType[TSInterfaceDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSInterfaceDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSInterfaceDeclaration: Self = this.set("TSInterfaceDeclaration", js.undefined)
    
    @scala.inline
    def setTSIntersectionType(
      value: (/* node */ NodeType[TSIntersectionType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSIntersectionType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSIntersectionType: Self = this.set("TSIntersectionType", js.undefined)
    
    @scala.inline
    def setTSIntrinsicKeyword(
      value: (/* node */ NodeType[TSIntrinsicKeyword], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSIntrinsicKeyword", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSIntrinsicKeyword: Self = this.set("TSIntrinsicKeyword", js.undefined)
    
    @scala.inline
    def setTSLiteralType(
      value: (/* node */ NodeType[TSLiteralType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSLiteralType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSLiteralType: Self = this.set("TSLiteralType", js.undefined)
    
    @scala.inline
    def setTSMappedType(
      value: (/* node */ NodeType[TSMappedType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSMappedType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSMappedType: Self = this.set("TSMappedType", js.undefined)
    
    @scala.inline
    def setTSMethodSignature(
      value: (/* node */ NodeType[TSMethodSignature], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSMethodSignature", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSMethodSignature: Self = this.set("TSMethodSignature", js.undefined)
    
    @scala.inline
    def setTSModuleBlock(
      value: (/* node */ NodeType[TSModuleBlock], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSModuleBlock", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSModuleBlock: Self = this.set("TSModuleBlock", js.undefined)
    
    @scala.inline
    def setTSModuleDeclaration(
      value: (/* node */ NodeType[TSModuleDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSModuleDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSModuleDeclaration: Self = this.set("TSModuleDeclaration", js.undefined)
    
    @scala.inline
    def setTSNamedTupleMember(
      value: (/* node */ NodeType[TSNamedTupleMember], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSNamedTupleMember", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSNamedTupleMember: Self = this.set("TSNamedTupleMember", js.undefined)
    
    @scala.inline
    def setTSNamespaceExportDeclaration(
      value: (/* node */ NodeType[TSNamespaceExportDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSNamespaceExportDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSNamespaceExportDeclaration: Self = this.set("TSNamespaceExportDeclaration", js.undefined)
    
    @scala.inline
    def setTSNeverKeyword(
      value: (/* node */ NodeType[TSNeverKeyword], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSNeverKeyword", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSNeverKeyword: Self = this.set("TSNeverKeyword", js.undefined)
    
    @scala.inline
    def setTSNonNullExpression(
      value: (/* node */ NodeType[TSNonNullExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSNonNullExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSNonNullExpression: Self = this.set("TSNonNullExpression", js.undefined)
    
    @scala.inline
    def setTSNullKeyword(
      value: (/* node */ NodeType[TSNullKeyword], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSNullKeyword", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSNullKeyword: Self = this.set("TSNullKeyword", js.undefined)
    
    @scala.inline
    def setTSNumberKeyword(
      value: (/* node */ NodeType[TSNumberKeyword], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSNumberKeyword", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSNumberKeyword: Self = this.set("TSNumberKeyword", js.undefined)
    
    @scala.inline
    def setTSObjectKeyword(
      value: (/* node */ NodeType[TSObjectKeyword], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSObjectKeyword", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSObjectKeyword: Self = this.set("TSObjectKeyword", js.undefined)
    
    @scala.inline
    def setTSOptionalType(
      value: (/* node */ NodeType[TSOptionalType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSOptionalType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSOptionalType: Self = this.set("TSOptionalType", js.undefined)
    
    @scala.inline
    def setTSParameterProperty(
      value: (/* node */ NodeType[TSParameterProperty], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSParameterProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSParameterProperty: Self = this.set("TSParameterProperty", js.undefined)
    
    @scala.inline
    def setTSParenthesizedType(
      value: (/* node */ NodeType[TSParenthesizedType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSParenthesizedType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSParenthesizedType: Self = this.set("TSParenthesizedType", js.undefined)
    
    @scala.inline
    def setTSPropertySignature(
      value: (/* node */ NodeType[TSPropertySignature], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSPropertySignature", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSPropertySignature: Self = this.set("TSPropertySignature", js.undefined)
    
    @scala.inline
    def setTSQualifiedName(
      value: (/* node */ NodeType[TSQualifiedName], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSQualifiedName", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSQualifiedName: Self = this.set("TSQualifiedName", js.undefined)
    
    @scala.inline
    def setTSRestType(
      value: (/* node */ NodeType[TSRestType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSRestType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSRestType: Self = this.set("TSRestType", js.undefined)
    
    @scala.inline
    def setTSStringKeyword(
      value: (/* node */ NodeType[TSStringKeyword], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSStringKeyword", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSStringKeyword: Self = this.set("TSStringKeyword", js.undefined)
    
    @scala.inline
    def setTSSymbolKeyword(
      value: (/* node */ NodeType[TSSymbolKeyword], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSSymbolKeyword", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSSymbolKeyword: Self = this.set("TSSymbolKeyword", js.undefined)
    
    @scala.inline
    def setTSThisType(
      value: (/* node */ NodeType[TSThisType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSThisType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSThisType: Self = this.set("TSThisType", js.undefined)
    
    @scala.inline
    def setTSTupleType(
      value: (/* node */ NodeType[TSTupleType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSTupleType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSTupleType: Self = this.set("TSTupleType", js.undefined)
    
    @scala.inline
    def setTSType(
      value: (/* node */ NodeType[TSType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSType: Self = this.set("TSType", js.undefined)
    
    @scala.inline
    def setTSTypeAliasDeclaration(
      value: (/* node */ NodeType[TSTypeAliasDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSTypeAliasDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSTypeAliasDeclaration: Self = this.set("TSTypeAliasDeclaration", js.undefined)
    
    @scala.inline
    def setTSTypeAnnotation(
      value: (/* node */ NodeType[TSTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSTypeAnnotation: Self = this.set("TSTypeAnnotation", js.undefined)
    
    @scala.inline
    def setTSTypeAssertion(
      value: (/* node */ NodeType[TSTypeAssertion], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSTypeAssertion", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSTypeAssertion: Self = this.set("TSTypeAssertion", js.undefined)
    
    @scala.inline
    def setTSTypeElement(
      value: (/* node */ NodeType[TSTypeElement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSTypeElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSTypeElement: Self = this.set("TSTypeElement", js.undefined)
    
    @scala.inline
    def setTSTypeLiteral(
      value: (/* node */ NodeType[TSTypeLiteral], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSTypeLiteral", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSTypeLiteral: Self = this.set("TSTypeLiteral", js.undefined)
    
    @scala.inline
    def setTSTypeOperator(
      value: (/* node */ NodeType[TSTypeOperator], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSTypeOperator", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSTypeOperator: Self = this.set("TSTypeOperator", js.undefined)
    
    @scala.inline
    def setTSTypeParameter(
      value: (/* node */ NodeType[TSTypeParameter], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSTypeParameter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSTypeParameter: Self = this.set("TSTypeParameter", js.undefined)
    
    @scala.inline
    def setTSTypeParameterDeclaration(
      value: (/* node */ NodeType[TSTypeParameterDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSTypeParameterDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSTypeParameterDeclaration: Self = this.set("TSTypeParameterDeclaration", js.undefined)
    
    @scala.inline
    def setTSTypeParameterInstantiation(
      value: (/* node */ NodeType[TSTypeParameterInstantiation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSTypeParameterInstantiation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSTypeParameterInstantiation: Self = this.set("TSTypeParameterInstantiation", js.undefined)
    
    @scala.inline
    def setTSTypePredicate(
      value: (/* node */ NodeType[TSTypePredicate], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSTypePredicate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSTypePredicate: Self = this.set("TSTypePredicate", js.undefined)
    
    @scala.inline
    def setTSTypeQuery(
      value: (/* node */ NodeType[TSTypeQuery], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSTypeQuery", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSTypeQuery: Self = this.set("TSTypeQuery", js.undefined)
    
    @scala.inline
    def setTSTypeReference(
      value: (/* node */ NodeType[TSTypeReference], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSTypeReference", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSTypeReference: Self = this.set("TSTypeReference", js.undefined)
    
    @scala.inline
    def setTSUndefinedKeyword(
      value: (/* node */ NodeType[TSUndefinedKeyword], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSUndefinedKeyword", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSUndefinedKeyword: Self = this.set("TSUndefinedKeyword", js.undefined)
    
    @scala.inline
    def setTSUnionType(
      value: (/* node */ NodeType[TSUnionType], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSUnionType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSUnionType: Self = this.set("TSUnionType", js.undefined)
    
    @scala.inline
    def setTSUnknownKeyword(
      value: (/* node */ NodeType[TSUnknownKeyword], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSUnknownKeyword", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSUnknownKeyword: Self = this.set("TSUnknownKeyword", js.undefined)
    
    @scala.inline
    def setTSVoidKeyword(
      value: (/* node */ NodeType[TSVoidKeyword], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TSVoidKeyword", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTSVoidKeyword: Self = this.set("TSVoidKeyword", js.undefined)
    
    @scala.inline
    def setTaggedTemplateExpression(
      value: (/* node */ NodeType[TaggedTemplateExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TaggedTemplateExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTaggedTemplateExpression: Self = this.set("TaggedTemplateExpression", js.undefined)
    
    @scala.inline
    def setTemplateElement(
      value: (/* node */ NodeType[TemplateElement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TemplateElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTemplateElement: Self = this.set("TemplateElement", js.undefined)
    
    @scala.inline
    def setTemplateLiteral(
      value: (/* node */ NodeType[TemplateLiteral], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TemplateLiteral", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTemplateLiteral: Self = this.set("TemplateLiteral", js.undefined)
    
    @scala.inline
    def setTerminatorless(
      value: (/* node */ NodeType[Terminatorless], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Terminatorless", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTerminatorless: Self = this.set("Terminatorless", js.undefined)
    
    @scala.inline
    def setThisExpression(
      value: (/* node */ NodeType[ThisExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ThisExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteThisExpression: Self = this.set("ThisExpression", js.undefined)
    
    @scala.inline
    def setThisTypeAnnotation(
      value: (/* node */ NodeType[ThisTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ThisTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteThisTypeAnnotation: Self = this.set("ThisTypeAnnotation", js.undefined)
    
    @scala.inline
    def setThrowStatement(
      value: (/* node */ NodeType[ThrowStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("ThrowStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteThrowStatement: Self = this.set("ThrowStatement", js.undefined)
    
    @scala.inline
    def setTryStatement(
      value: (/* node */ NodeType[TryStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TryStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTryStatement: Self = this.set("TryStatement", js.undefined)
    
    @scala.inline
    def setTupleExpression(
      value: (/* node */ NodeType[TupleExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TupleExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTupleExpression: Self = this.set("TupleExpression", js.undefined)
    
    @scala.inline
    def setTupleTypeAnnotation(
      value: (/* node */ NodeType[TupleTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TupleTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTupleTypeAnnotation: Self = this.set("TupleTypeAnnotation", js.undefined)
    
    @scala.inline
    def setTypeAlias(
      value: (/* node */ NodeType[TypeAlias], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TypeAlias", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTypeAlias: Self = this.set("TypeAlias", js.undefined)
    
    @scala.inline
    def setTypeAnnotation(
      value: (/* node */ NodeType[TypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTypeAnnotation: Self = this.set("TypeAnnotation", js.undefined)
    
    @scala.inline
    def setTypeCastExpression(
      value: (/* node */ NodeType[TypeCastExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TypeCastExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTypeCastExpression: Self = this.set("TypeCastExpression", js.undefined)
    
    @scala.inline
    def setTypeParameter(
      value: (/* node */ NodeType[TypeParameter], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TypeParameter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTypeParameter: Self = this.set("TypeParameter", js.undefined)
    
    @scala.inline
    def setTypeParameterDeclaration(
      value: (/* node */ NodeType[TypeParameterDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TypeParameterDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTypeParameterDeclaration: Self = this.set("TypeParameterDeclaration", js.undefined)
    
    @scala.inline
    def setTypeParameterInstantiation(
      value: (/* node */ NodeType[TypeParameterInstantiation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TypeParameterInstantiation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTypeParameterInstantiation: Self = this.set("TypeParameterInstantiation", js.undefined)
    
    @scala.inline
    def setTypeofTypeAnnotation(
      value: (/* node */ NodeType[TypeofTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("TypeofTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTypeofTypeAnnotation: Self = this.set("TypeofTypeAnnotation", js.undefined)
    
    @scala.inline
    def setUnaryExpression(
      value: (/* node */ NodeType[UnaryExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("UnaryExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUnaryExpression: Self = this.set("UnaryExpression", js.undefined)
    
    @scala.inline
    def setUnaryLike(
      value: (/* node */ NodeType[UnaryLike], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("UnaryLike", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUnaryLike: Self = this.set("UnaryLike", js.undefined)
    
    @scala.inline
    def setUnionTypeAnnotation(
      value: (/* node */ NodeType[UnionTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("UnionTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUnionTypeAnnotation: Self = this.set("UnionTypeAnnotation", js.undefined)
    
    @scala.inline
    def setUpdateExpression(
      value: (/* node */ NodeType[UpdateExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("UpdateExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUpdateExpression: Self = this.set("UpdateExpression", js.undefined)
    
    @scala.inline
    def setUserWhitespacable(
      value: (/* node */ NodeType[UserWhitespacable], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("UserWhitespacable", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUserWhitespacable: Self = this.set("UserWhitespacable", js.undefined)
    
    @scala.inline
    def setV8IntrinsicIdentifier(
      value: (/* node */ NodeType[V8IntrinsicIdentifier], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("V8IntrinsicIdentifier", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteV8IntrinsicIdentifier: Self = this.set("V8IntrinsicIdentifier", js.undefined)
    
    @scala.inline
    def setVariableDeclaration(
      value: (/* node */ NodeType[VariableDeclaration], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("VariableDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteVariableDeclaration: Self = this.set("VariableDeclaration", js.undefined)
    
    @scala.inline
    def setVariableDeclarator(
      value: (/* node */ NodeType[VariableDeclarator], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("VariableDeclarator", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteVariableDeclarator: Self = this.set("VariableDeclarator", js.undefined)
    
    @scala.inline
    def setVariance(
      value: (/* node */ NodeType[Variance], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("Variance", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteVariance: Self = this.set("Variance", js.undefined)
    
    @scala.inline
    def setVoidTypeAnnotation(
      value: (/* node */ NodeType[VoidTypeAnnotation], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("VoidTypeAnnotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteVoidTypeAnnotation: Self = this.set("VoidTypeAnnotation", js.undefined)
    
    @scala.inline
    def setWhile(
      value: (/* node */ NodeType[While], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("While", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteWhile: Self = this.set("While", js.undefined)
    
    @scala.inline
    def setWhileStatement(
      value: (/* node */ NodeType[WhileStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("WhileStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteWhileStatement: Self = this.set("WhileStatement", js.undefined)
    
    @scala.inline
    def setWithStatement(
      value: (/* node */ NodeType[WithStatement], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("WithStatement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteWithStatement: Self = this.set("WithStatement", js.undefined)
    
    @scala.inline
    def setYieldExpression(
      value: (/* node */ NodeType[YieldExpression], /* state */ TState, /* recurse */ js.Function1[/* node */ Node, Unit]) => Unit
    ): Self = this.set("YieldExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteYieldExpression: Self = this.set("YieldExpression", js.undefined)
  }
}
