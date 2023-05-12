package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @babel/types.@babel/types/lib.NodeTypesWithoutComment | @babel/types.@babel/types/lib.Comment['type'] */
/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.babelTypesStrings.ClassExpression
  - typings.babelTypes.babelTypesStrings.TSArrayType
  - typings.babelTypes.babelTypesStrings.Loop
  - typings.babelTypes.babelTypesStrings.BreakStatement
  - typings.babelTypes.babelTypesStrings.StringTypeAnnotation
  - typings.babelTypes.babelTypesStrings.ExportDefaultSpecifier
  - typings.babelTypes.babelTypesStrings.EnumStringMember
  - typings.babelTypes.babelTypesStrings.ReturnStatement
  - typings.babelTypes.babelTypesStrings.TSSatisfiesExpression
  - typings.babelTypes.babelTypesStrings.TSInterfaceBody
  - typings.babelTypes.babelTypesStrings.TSAsExpression
  - typings.babelTypes.babelTypesStrings.InterfaceTypeAnnotation
  - typings.babelTypes.babelTypesStrings.BlockParent
  - typings.babelTypes.babelTypesStrings.TSAnyKeyword
  - typings.babelTypes.babelTypesStrings.TypeCastExpression
  - typings.babelTypes.babelTypesStrings.YieldExpression
  - typings.babelTypes.babelTypesStrings.ObjectTypeCallProperty
  - typings.babelTypes.babelTypesStrings.TupleTypeAnnotation
  - typings.babelTypes.babelTypesStrings.ImportOrExportDeclaration
  - typings.babelTypes.babelTypesStrings.Standardized
  - typings.babelTypes.babelTypesStrings.TypeParameterDeclaration
  - typings.babelTypes.babelTypesStrings.TSModuleDeclaration
  - typings.babelTypes.babelTypesStrings.ForInStatement
  - typings.babelTypes.babelTypesStrings.EnumMember
  - typings.babelTypes.babelTypesStrings.TSConditionalType
  - typings.babelTypes.babelTypesStrings.ImportDefaultSpecifier
  - typings.babelTypes.babelTypesStrings.TSLiteralType
  - typings.babelTypes.babelTypesStrings.TSTypeParameterDeclaration
  - typings.babelTypes.babelTypesStrings.TypeAnnotation
  - typings.babelTypes.babelTypesStrings.SpreadElement
  - typings.babelTypes.babelTypesStrings.TryStatement
  - typings.babelTypes.babelTypesStrings.BlockStatement
  - typings.babelTypes.babelTypesStrings.Pattern
  - typings.babelTypes.babelTypesStrings.RestElement
  - typings.babelTypes.babelTypesStrings.While
  - typings.babelTypes.babelTypesStrings.OptionalMemberExpression
  - typings.babelTypes.babelTypesStrings.JSX
  - typings.babelTypes.babelTypesStrings.File
  - typings.babelTypes.babelTypesStrings.TSIndexedAccessType
  - typings.babelTypes.babelTypesStrings.TSQualifiedName
  - typings.babelTypes.babelTypesStrings.UserWhitespacable
  - typings.babelTypes.babelTypesStrings.PipelinePrimaryTopicReference
  - typings.babelTypes.babelTypesStrings.JSXExpressionContainer
  - typings.babelTypes.babelTypesStrings.TSNullKeyword
  - typings.babelTypes.babelTypesStrings.Noop
  - typings.babelTypes.babelTypesStrings.DeclareModule
  - typings.babelTypes.babelTypesStrings.FlowType
  - typings.babelTypes.babelTypesStrings.LabeledStatement
  - typings.babelTypes.babelTypesStrings.ExportAllDeclaration
  - typings.babelTypes.babelTypesStrings.RegExpLiteral
  - typings.babelTypes.babelTypesStrings.WhileStatement
  - typings.babelTypes.babelTypesStrings.ContinueStatement
  - typings.babelTypes.babelTypesStrings.Accessor
  - typings.babelTypes.babelTypesStrings.FunctionTypeAnnotation
  - typings.babelTypes.babelTypesStrings.TSFunctionType
  - typings.babelTypes.babelTypesStrings.NullLiteralTypeAnnotation
  - typings.babelTypes.babelTypesStrings.SwitchStatement
  - typings.babelTypes.babelTypesStrings.OptionalCallExpression
  - typings.babelTypes.babelTypesStrings.ExportNamedDeclaration
  - typings.babelTypes.babelTypesStrings.CallExpression
  - typings.babelTypes.babelTypesStrings.InterfaceDeclaration
  - typings.babelTypes.babelTypesStrings.JSXSpreadAttribute
  - typings.babelTypes.babelTypesStrings.SymbolTypeAnnotation
  - typings.babelTypes.babelTypesStrings.ThisTypeAnnotation
  - typings.babelTypes.babelTypesStrings.TSTypeOperator
  - typings.babelTypes.babelTypesStrings.TSBigIntKeyword
  - typings.babelTypes.babelTypesStrings.SwitchCase
  - typings.babelTypes.babelTypesStrings.TSUnknownKeyword
  - typings.babelTypes.babelTypesStrings.ArrayExpression
  - typings.babelTypes.babelTypesStrings.MixedTypeAnnotation
  - typings.babelTypes.babelTypesStrings.ExportDeclaration
  - typings.babelTypes.babelTypesStrings.TSVoidKeyword
  - typings.babelTypes.babelTypesStrings.NewExpression
  - typings.babelTypes.babelTypesStrings.MemberExpression
  - typings.babelTypes.babelTypesStrings.RecordExpression
  - typings.babelTypes.babelTypesStrings.Flow
  - typings.babelTypes.babelTypesStrings.ExpressionStatement
  - typings.babelTypes.babelTypesStrings.Directive
  - typings.babelTypes.babelTypesStrings.AssignmentPattern
  - typings.babelTypes.babelTypesStrings.RegexLiteral
  - typings.babelTypes.babelTypesStrings.AnyTypeAnnotation
  - typings.babelTypes.babelTypesStrings.TSIntrinsicKeyword
  - typings.babelTypes.babelTypesStrings.EnumDeclaration
  - typings.babelTypes.babelTypesStrings.VariableDeclaration
  - typings.babelTypes.babelTypesStrings.IndexedAccessType
  - typings.babelTypes.babelTypesStrings.LogicalExpression
  - typings.babelTypes.babelTypesStrings.OpaqueType
  - typings.babelTypes.babelTypesStrings.TaggedTemplateExpression
  - typings.babelTypes.babelTypesStrings.JSXSpreadChild
  - typings.babelTypes.babelTypesStrings.JSXOpeningElement
  - typings.babelTypes.babelTypesStrings.CommentBlock
  - typings.babelTypes.babelTypesStrings.QualifiedTypeIdentifier
  - typings.babelTypes.babelTypesStrings.TSTypeParameterInstantiation
  - typings.babelTypes.babelTypesStrings.TSDeclareMethod
  - typings.babelTypes.babelTypesStrings.TypeScript
  - typings.babelTypes.babelTypesStrings.TemplateLiteral
  - typings.babelTypes.babelTypesStrings.BindExpression
  - typings.babelTypes.babelTypesStrings.TSType
  - typings.babelTypes.babelTypesStrings.ExportDefaultDeclaration
  - typings.babelTypes.babelTypesStrings.ObjectTypeSpreadProperty
  - typings.babelTypes.babelTypesStrings.Decorator
  - typings.babelTypes.babelTypesStrings.MetaProperty
  - typings.babelTypes.babelTypesStrings.ObjectTypeAnnotation
  - typings.babelTypes.babelTypesStrings.IfStatement
  - typings.babelTypes.babelTypesStrings.ArrayTypeAnnotation
  - typings.babelTypes.babelTypesStrings.JSXIdentifier
  - typings.babelTypes.babelTypesStrings.InterpreterDirective
  - typings.babelTypes.babelTypesStrings.BinaryExpression
  - typings.babelTypes.babelTypesStrings.ForXStatement
  - typings.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration
  - typings.babelTypes.babelTypesStrings.TSEnumDeclaration
  - typings.babelTypes.babelTypesStrings.TSTypeAliasDeclaration
  - typings.babelTypes.babelTypesStrings.TSUnionType
  - typings.babelTypes.babelTypesStrings.TSTypeParameter
  - typings.babelTypes.babelTypesStrings.PrivateName
  - typings.babelTypes.babelTypesStrings.WithStatement
  - typings.babelTypes.babelTypesStrings.TSNonNullExpression
  - typings.babelTypes.babelTypesStrings.NullableTypeAnnotation
  - typings.babelTypes.babelTypesStrings.Identifier
  - typings.babelTypes.babelTypesStrings.UpdateExpression
  - typings.babelTypes.babelTypesStrings.Terminatorless
  - typings.babelTypes.babelTypesStrings.CommentLine
  - typings.babelTypes.babelTypesStrings.TSStringKeyword
  - typings.babelTypes.babelTypesStrings.TopicReference
  - typings.babelTypes.babelTypesStrings.JSXAttribute
  - typings.babelTypes.babelTypesStrings.TSInferType
  - typings.babelTypes.babelTypesStrings.DeclareFunction
  - typings.babelTypes.babelTypesStrings.PatternLike
  - typings.babelTypes.babelTypesStrings.PipelineTopicExpression
  - typings.babelTypes.babelTypesStrings.VoidTypeAnnotation
  - typings.babelTypes.babelTypesStrings.Scopable
  - typings.babelTypes.babelTypesStrings.EmptyStatement
  - typings.babelTypes.babelTypesStrings.ClassDeclaration
  - typings.babelTypes.babelTypesStrings.DeclareExportAllDeclaration
  - typings.babelTypes.babelTypesStrings.StaticBlock
  - typings.babelTypes.babelTypesStrings.TSTypeAnnotation
  - typings.babelTypes.babelTypesStrings.AwaitExpression
  - typings.babelTypes.babelTypesStrings.ImportSpecifier
  - typings.babelTypes.babelTypesStrings.ArrayPattern
  - typings.babelTypes.babelTypesStrings.ExportSpecifier
  - typings.babelTypes.babelTypesStrings.EnumBooleanMember
  - typings.babelTypes.babelTypesStrings.TSPropertySignature
  - typings.babelTypes.babelTypesStrings.ExistsTypeAnnotation
  - typings.babelTypes.babelTypesStrings.TSTypeQuery
  - typings.babelTypes.babelTypesStrings.TSExternalModuleReference
  - typings.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration
  - typings.babelTypes.babelTypesStrings.FlowPredicate
  - typings.babelTypes.babelTypesStrings.ImportAttribute
  - typings.babelTypes.babelTypesStrings.Method
  - typings.babelTypes.babelTypesStrings.ObjectExpression
  - typings.babelTypes.babelTypesStrings.JSXEmptyExpression
  - typings.babelTypes.babelTypesStrings.ObjectMethod
  - typings.babelTypes.babelTypesStrings.ModuleDeclaration
  - typings.babelTypes.babelTypesStrings.RestProperty
  - typings.babelTypes.babelTypesStrings.Pureish
  - typings.babelTypes.babelTypesStrings.TSTypeElement
  - typings.babelTypes.babelTypesStrings.TSSymbolKeyword
  - typings.babelTypes.babelTypesStrings.TSMappedType
  - typings.babelTypes.babelTypesStrings.JSXClosingElement
  - typings.babelTypes.babelTypesStrings.VariableDeclarator
  - typings.babelTypes.babelTypesStrings.TSEntityName
  - typings.babelTypes.babelTypesStrings.ObjectMember
  - typings.babelTypes.babelTypesStrings.StringLiteral
  - typings.babelTypes.babelTypesStrings.BooleanLiteral
  - typings.babelTypes.babelTypesStrings.TSEnumMember
  - typings.babelTypes.babelTypesStrings.InferredPredicate
  - typings.babelTypes.babelTypesStrings.AssignmentExpression
  - typings.babelTypes.babelTypesStrings.FunctionDeclaration
  - typings.babelTypes.babelTypesStrings.EnumBooleanBody
  - typings.babelTypes.babelTypesStrings.FlowBaseAnnotation
  - typings.babelTypes.babelTypesStrings.For
  - typings.babelTypes.babelTypesStrings.ModuleSpecifier
  - typings.babelTypes.babelTypesStrings.DebuggerStatement
  - typings.babelTypes.babelTypesStrings.InterfaceExtends
  - typings.babelTypes.babelTypesStrings.ThrowStatement
  - typings.babelTypes.babelTypesStrings.V8IntrinsicIdentifier
  - typings.babelTypes.babelTypesStrings.EmptyTypeAnnotation
  - typings.babelTypes.babelTypesStrings.Property
  - typings.babelTypes.babelTypesStrings.DirectiveLiteral
  - typings.babelTypes.babelTypesStrings.ObjectProperty
  - typings.babelTypes.babelTypesStrings.TSExportAssignment
  - typings.babelTypes.babelTypesStrings.OptionalIndexedAccessType
  - typings.babelTypes.babelTypesStrings.ArrowFunctionExpression
  - typings.babelTypes.babelTypesStrings.ModuleExpression
  - typings.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments
  - typings.babelTypes.babelTypesStrings.TypeofTypeAnnotation
  - typings.babelTypes.babelTypesStrings.TSCallSignatureDeclaration
  - typings.babelTypes.babelTypesStrings.JSXFragment
  - typings.babelTypes.babelTypesStrings.Literal
  - typings.babelTypes.babelTypesStrings.Variance
  - typings.babelTypes.babelTypesStrings.Declaration
  - typings.babelTypes.babelTypesStrings.LVal
  - typings.babelTypes.babelTypesStrings.JSXNamespacedName
  - typings.babelTypes.babelTypesStrings.Program
  - typings.babelTypes.babelTypesStrings.TSTypeLiteral
  - typings.babelTypes.babelTypesStrings.NumberLiteralTypeAnnotation
  - typings.babelTypes.babelTypesStrings.DeclareExportDeclaration
  - typings.babelTypes.babelTypesStrings.ObjectTypeProperty
  - typings.babelTypes.babelTypesStrings.TSImportEqualsDeclaration
  - typings.babelTypes.babelTypesStrings.DeclareInterface
  - typings.babelTypes.babelTypesStrings.PipelineBareFunction
  - typings.babelTypes.babelTypesStrings.EnumStringBody
  - typings.babelTypes.babelTypesStrings.NumberTypeAnnotation
  - typings.babelTypes.babelTypesStrings.Super
  - typings.babelTypes.babelTypesStrings.ForOfStatement
  - typings.babelTypes.babelTypesStrings.DeclareTypeAlias
  - typings.babelTypes.babelTypesStrings.Placeholder
  - typings.babelTypes.babelTypesStrings.TSUndefinedKeyword
  - typings.babelTypes.babelTypesStrings.ConditionalExpression
  - typings.babelTypes.babelTypesStrings.Class
  - typings.babelTypes.babelTypesStrings.SequenceExpression
  - typings.babelTypes.babelTypesStrings.Import
  - typings.babelTypes.babelTypesStrings.TypeParameter
  - typings.babelTypes.babelTypesStrings.JSXElement
  - typings.babelTypes.babelTypesStrings.ObjectTypeIndexer
  - typings.babelTypes.babelTypesStrings.Function
  - typings.babelTypes.babelTypesStrings.CatchClause
  - typings.babelTypes.babelTypesStrings.Expression
  - typings.babelTypes.babelTypesStrings.UnaryExpression
  - typings.babelTypes.babelTypesStrings.BooleanLiteralTypeAnnotation
  - typings.babelTypes.babelTypesStrings.ExportNamespaceSpecifier
  - typings.babelTypes.babelTypesStrings.Miscellaneous
  - typings.babelTypes.babelTypesStrings.TypeAlias
  - typings.babelTypes.babelTypesStrings.TSNumberKeyword
  - typings.babelTypes.babelTypesStrings.Conditional
  - typings.babelTypes.babelTypesStrings.DeclareVariable
  - typings.babelTypes.babelTypesStrings.BooleanTypeAnnotation
  - typings.babelTypes.babelTypesStrings.SpreadProperty
  - typings.babelTypes.babelTypesStrings.BigIntLiteral
  - typings.babelTypes.babelTypesStrings.ExpressionWrapper
  - typings.babelTypes.babelTypesStrings.TSOptionalType
  - typings.babelTypes.babelTypesStrings.TSTypePredicate
  - typings.babelTypes.babelTypesStrings.TSInterfaceDeclaration
  - typings.babelTypes.babelTypesStrings.DeclaredPredicate
  - typings.babelTypes.babelTypesStrings.ClassMethod
  - typings.babelTypes.babelTypesStrings.ForStatement
  - typings.babelTypes.babelTypesStrings.Statement
  - typings.babelTypes.babelTypesStrings.UnaryLike
  - typings.babelTypes.babelTypesStrings.EnumDefaultedMember
  - typings.babelTypes.babelTypesStrings.ClassProperty
  - typings.babelTypes.babelTypesStrings.FunctionExpression
  - typings.babelTypes.babelTypesStrings.FunctionParent
  - typings.babelTypes.babelTypesStrings.TemplateElement
  - typings.babelTypes.babelTypesStrings.JSXText
  - typings.babelTypes.babelTypesStrings.TSParameterProperty
  - typings.babelTypes.babelTypesStrings.JSXMemberExpression
  - typings.babelTypes.babelTypesStrings.EnumSymbolBody
  - typings.babelTypes.babelTypesStrings.TSTupleType
  - typings.babelTypes.babelTypesStrings.DoWhileStatement
  - typings.babelTypes.babelTypesStrings.TSBaseType
  - typings.babelTypes.babelTypesStrings.TSDeclareFunction
  - typings.babelTypes.babelTypesStrings.ImportNamespaceSpecifier
  - typings.babelTypes.babelTypesStrings.TSMethodSignature
  - typings.babelTypes.babelTypesStrings.ParenthesizedExpression
  - typings.babelTypes.babelTypesStrings.EnumNumberMember
  - typings.babelTypes.babelTypesStrings.Private
  - typings.babelTypes.babelTypesStrings.DecimalLiteral
  - typings.babelTypes.babelTypesStrings.TSIndexSignature
  - typings.babelTypes.babelTypesStrings.Block
  - typings.babelTypes.babelTypesStrings.TSThisType
  - typings.babelTypes.babelTypesStrings.TupleExpression
  - typings.babelTypes.babelTypesStrings.TSRestType
  - typings.babelTypes.babelTypesStrings.JSXClosingFragment
  - typings.babelTypes.babelTypesStrings.ClassImplements
  - typings.babelTypes.babelTypesStrings.TSConstructorType
  - typings.babelTypes.babelTypesStrings.ClassAccessorProperty
  - typings.babelTypes.babelTypesStrings.IntersectionTypeAnnotation
  - typings.babelTypes.babelTypesStrings.TSInstantiationExpression
  - typings.babelTypes.babelTypesStrings.NumericLiteral
  - typings.babelTypes.babelTypesStrings.TSObjectKeyword
  - typings.babelTypes.babelTypesStrings.NumberLiteral
  - typings.babelTypes.babelTypesStrings.DoExpression
  - typings.babelTypes.babelTypesStrings.JSXOpeningFragment
  - typings.babelTypes.babelTypesStrings.UnionTypeAnnotation
  - typings.babelTypes.babelTypesStrings.TSNamedTupleMember
  - typings.babelTypes.babelTypesStrings.DeclareModuleExports
  - typings.babelTypes.babelTypesStrings.ObjectPattern
  - typings.babelTypes.babelTypesStrings.TSBooleanKeyword
  - typings.babelTypes.babelTypesStrings.StringLiteralTypeAnnotation
  - typings.babelTypes.babelTypesStrings.TSParenthesizedType
  - typings.babelTypes.babelTypesStrings.FunctionTypeParam
  - typings.babelTypes.babelTypesStrings.DeclareOpaqueType
  - typings.babelTypes.babelTypesStrings.ClassPrivateProperty
  - typings.babelTypes.babelTypesStrings.TSModuleBlock
  - typings.babelTypes.babelTypesStrings.ClassBody
  - typings.babelTypes.babelTypesStrings.ObjectTypeInternalSlot
  - typings.babelTypes.babelTypesStrings.ThisExpression
  - typings.babelTypes.babelTypesStrings.ClassPrivateMethod
  - typings.babelTypes.babelTypesStrings.TSTypeAssertion
  - typings.babelTypes.babelTypesStrings.Binary
  - typings.babelTypes.babelTypesStrings.TSNeverKeyword
  - typings.babelTypes.babelTypesStrings.TSIntersectionType
  - typings.babelTypes.babelTypesStrings.ArgumentPlaceholder
  - typings.babelTypes.babelTypesStrings.EnumNumberBody
  - typings.babelTypes.babelTypesStrings.TSImportType
  - typings.babelTypes.babelTypesStrings.FlowDeclaration
  - typings.babelTypes.babelTypesStrings.CompletionStatement
  - typings.babelTypes.babelTypesStrings.DeclareClass
  - typings.babelTypes.babelTypesStrings.ImportDeclaration
  - typings.babelTypes.babelTypesStrings.Immutable
  - typings.babelTypes.babelTypesStrings.GenericTypeAnnotation
  - typings.babelTypes.babelTypesStrings.EnumBody
  - typings.babelTypes.babelTypesStrings.NullLiteral
  - typings.babelTypes.babelTypesStrings.TypeParameterInstantiation
  - typings.babelTypes.babelTypesStrings.TSTypeReference
*/
trait NodeTypes extends StObject
object NodeTypes {
  
  inline def Accessor: typings.babelTypes.babelTypesStrings.Accessor = "Accessor".asInstanceOf[typings.babelTypes.babelTypesStrings.Accessor]
  
  inline def AnyTypeAnnotation: typings.babelTypes.babelTypesStrings.AnyTypeAnnotation = "AnyTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.AnyTypeAnnotation]
  
  inline def ArgumentPlaceholder: typings.babelTypes.babelTypesStrings.ArgumentPlaceholder = "ArgumentPlaceholder".asInstanceOf[typings.babelTypes.babelTypesStrings.ArgumentPlaceholder]
  
  inline def ArrayExpression: typings.babelTypes.babelTypesStrings.ArrayExpression = "ArrayExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.ArrayExpression]
  
  inline def ArrayPattern: typings.babelTypes.babelTypesStrings.ArrayPattern = "ArrayPattern".asInstanceOf[typings.babelTypes.babelTypesStrings.ArrayPattern]
  
  inline def ArrayTypeAnnotation: typings.babelTypes.babelTypesStrings.ArrayTypeAnnotation = "ArrayTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.ArrayTypeAnnotation]
  
  inline def ArrowFunctionExpression: typings.babelTypes.babelTypesStrings.ArrowFunctionExpression = "ArrowFunctionExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.ArrowFunctionExpression]
  
  inline def AssignmentExpression: typings.babelTypes.babelTypesStrings.AssignmentExpression = "AssignmentExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.AssignmentExpression]
  
  inline def AssignmentPattern: typings.babelTypes.babelTypesStrings.AssignmentPattern = "AssignmentPattern".asInstanceOf[typings.babelTypes.babelTypesStrings.AssignmentPattern]
  
  inline def AwaitExpression: typings.babelTypes.babelTypesStrings.AwaitExpression = "AwaitExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.AwaitExpression]
  
  inline def BigIntLiteral: typings.babelTypes.babelTypesStrings.BigIntLiteral = "BigIntLiteral".asInstanceOf[typings.babelTypes.babelTypesStrings.BigIntLiteral]
  
  inline def Binary: typings.babelTypes.babelTypesStrings.Binary = "Binary".asInstanceOf[typings.babelTypes.babelTypesStrings.Binary]
  
  inline def BinaryExpression: typings.babelTypes.babelTypesStrings.BinaryExpression = "BinaryExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.BinaryExpression]
  
  inline def BindExpression: typings.babelTypes.babelTypesStrings.BindExpression = "BindExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.BindExpression]
  
  inline def Block: typings.babelTypes.babelTypesStrings.Block = "Block".asInstanceOf[typings.babelTypes.babelTypesStrings.Block]
  
  inline def BlockParent: typings.babelTypes.babelTypesStrings.BlockParent = "BlockParent".asInstanceOf[typings.babelTypes.babelTypesStrings.BlockParent]
  
  inline def BlockStatement: typings.babelTypes.babelTypesStrings.BlockStatement = "BlockStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.BlockStatement]
  
  inline def BooleanLiteral: typings.babelTypes.babelTypesStrings.BooleanLiteral = "BooleanLiteral".asInstanceOf[typings.babelTypes.babelTypesStrings.BooleanLiteral]
  
  inline def BooleanLiteralTypeAnnotation: typings.babelTypes.babelTypesStrings.BooleanLiteralTypeAnnotation = "BooleanLiteralTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.BooleanLiteralTypeAnnotation]
  
  inline def BooleanTypeAnnotation: typings.babelTypes.babelTypesStrings.BooleanTypeAnnotation = "BooleanTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.BooleanTypeAnnotation]
  
  inline def BreakStatement: typings.babelTypes.babelTypesStrings.BreakStatement = "BreakStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.BreakStatement]
  
  inline def CallExpression: typings.babelTypes.babelTypesStrings.CallExpression = "CallExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.CallExpression]
  
  inline def CatchClause: typings.babelTypes.babelTypesStrings.CatchClause = "CatchClause".asInstanceOf[typings.babelTypes.babelTypesStrings.CatchClause]
  
  inline def Class: typings.babelTypes.babelTypesStrings.Class = "Class".asInstanceOf[typings.babelTypes.babelTypesStrings.Class]
  
  inline def ClassAccessorProperty: typings.babelTypes.babelTypesStrings.ClassAccessorProperty = "ClassAccessorProperty".asInstanceOf[typings.babelTypes.babelTypesStrings.ClassAccessorProperty]
  
  inline def ClassBody: typings.babelTypes.babelTypesStrings.ClassBody = "ClassBody".asInstanceOf[typings.babelTypes.babelTypesStrings.ClassBody]
  
  inline def ClassDeclaration: typings.babelTypes.babelTypesStrings.ClassDeclaration = "ClassDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.ClassDeclaration]
  
  inline def ClassExpression: typings.babelTypes.babelTypesStrings.ClassExpression = "ClassExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.ClassExpression]
  
  inline def ClassImplements: typings.babelTypes.babelTypesStrings.ClassImplements = "ClassImplements".asInstanceOf[typings.babelTypes.babelTypesStrings.ClassImplements]
  
  inline def ClassMethod: typings.babelTypes.babelTypesStrings.ClassMethod = "ClassMethod".asInstanceOf[typings.babelTypes.babelTypesStrings.ClassMethod]
  
  inline def ClassPrivateMethod: typings.babelTypes.babelTypesStrings.ClassPrivateMethod = "ClassPrivateMethod".asInstanceOf[typings.babelTypes.babelTypesStrings.ClassPrivateMethod]
  
  inline def ClassPrivateProperty: typings.babelTypes.babelTypesStrings.ClassPrivateProperty = "ClassPrivateProperty".asInstanceOf[typings.babelTypes.babelTypesStrings.ClassPrivateProperty]
  
  inline def ClassProperty: typings.babelTypes.babelTypesStrings.ClassProperty = "ClassProperty".asInstanceOf[typings.babelTypes.babelTypesStrings.ClassProperty]
  
  inline def CommentBlock: typings.babelTypes.babelTypesStrings.CommentBlock = "CommentBlock".asInstanceOf[typings.babelTypes.babelTypesStrings.CommentBlock]
  
  inline def CommentLine: typings.babelTypes.babelTypesStrings.CommentLine = "CommentLine".asInstanceOf[typings.babelTypes.babelTypesStrings.CommentLine]
  
  inline def CompletionStatement: typings.babelTypes.babelTypesStrings.CompletionStatement = "CompletionStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.CompletionStatement]
  
  inline def Conditional: typings.babelTypes.babelTypesStrings.Conditional = "Conditional".asInstanceOf[typings.babelTypes.babelTypesStrings.Conditional]
  
  inline def ConditionalExpression: typings.babelTypes.babelTypesStrings.ConditionalExpression = "ConditionalExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.ConditionalExpression]
  
  inline def ContinueStatement: typings.babelTypes.babelTypesStrings.ContinueStatement = "ContinueStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.ContinueStatement]
  
  inline def DebuggerStatement: typings.babelTypes.babelTypesStrings.DebuggerStatement = "DebuggerStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.DebuggerStatement]
  
  inline def DecimalLiteral: typings.babelTypes.babelTypesStrings.DecimalLiteral = "DecimalLiteral".asInstanceOf[typings.babelTypes.babelTypesStrings.DecimalLiteral]
  
  inline def Declaration: typings.babelTypes.babelTypesStrings.Declaration = "Declaration".asInstanceOf[typings.babelTypes.babelTypesStrings.Declaration]
  
  inline def DeclareClass: typings.babelTypes.babelTypesStrings.DeclareClass = "DeclareClass".asInstanceOf[typings.babelTypes.babelTypesStrings.DeclareClass]
  
  inline def DeclareExportAllDeclaration: typings.babelTypes.babelTypesStrings.DeclareExportAllDeclaration = "DeclareExportAllDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.DeclareExportAllDeclaration]
  
  inline def DeclareExportDeclaration: typings.babelTypes.babelTypesStrings.DeclareExportDeclaration = "DeclareExportDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.DeclareExportDeclaration]
  
  inline def DeclareFunction: typings.babelTypes.babelTypesStrings.DeclareFunction = "DeclareFunction".asInstanceOf[typings.babelTypes.babelTypesStrings.DeclareFunction]
  
  inline def DeclareInterface: typings.babelTypes.babelTypesStrings.DeclareInterface = "DeclareInterface".asInstanceOf[typings.babelTypes.babelTypesStrings.DeclareInterface]
  
  inline def DeclareModule: typings.babelTypes.babelTypesStrings.DeclareModule = "DeclareModule".asInstanceOf[typings.babelTypes.babelTypesStrings.DeclareModule]
  
  inline def DeclareModuleExports: typings.babelTypes.babelTypesStrings.DeclareModuleExports = "DeclareModuleExports".asInstanceOf[typings.babelTypes.babelTypesStrings.DeclareModuleExports]
  
  inline def DeclareOpaqueType: typings.babelTypes.babelTypesStrings.DeclareOpaqueType = "DeclareOpaqueType".asInstanceOf[typings.babelTypes.babelTypesStrings.DeclareOpaqueType]
  
  inline def DeclareTypeAlias: typings.babelTypes.babelTypesStrings.DeclareTypeAlias = "DeclareTypeAlias".asInstanceOf[typings.babelTypes.babelTypesStrings.DeclareTypeAlias]
  
  inline def DeclareVariable: typings.babelTypes.babelTypesStrings.DeclareVariable = "DeclareVariable".asInstanceOf[typings.babelTypes.babelTypesStrings.DeclareVariable]
  
  inline def DeclaredPredicate: typings.babelTypes.babelTypesStrings.DeclaredPredicate = "DeclaredPredicate".asInstanceOf[typings.babelTypes.babelTypesStrings.DeclaredPredicate]
  
  inline def Decorator: typings.babelTypes.babelTypesStrings.Decorator = "Decorator".asInstanceOf[typings.babelTypes.babelTypesStrings.Decorator]
  
  inline def Directive: typings.babelTypes.babelTypesStrings.Directive = "Directive".asInstanceOf[typings.babelTypes.babelTypesStrings.Directive]
  
  inline def DirectiveLiteral: typings.babelTypes.babelTypesStrings.DirectiveLiteral = "DirectiveLiteral".asInstanceOf[typings.babelTypes.babelTypesStrings.DirectiveLiteral]
  
  inline def DoExpression: typings.babelTypes.babelTypesStrings.DoExpression = "DoExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.DoExpression]
  
  inline def DoWhileStatement: typings.babelTypes.babelTypesStrings.DoWhileStatement = "DoWhileStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.DoWhileStatement]
  
  inline def EmptyStatement: typings.babelTypes.babelTypesStrings.EmptyStatement = "EmptyStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.EmptyStatement]
  
  inline def EmptyTypeAnnotation: typings.babelTypes.babelTypesStrings.EmptyTypeAnnotation = "EmptyTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.EmptyTypeAnnotation]
  
  inline def EnumBody: typings.babelTypes.babelTypesStrings.EnumBody = "EnumBody".asInstanceOf[typings.babelTypes.babelTypesStrings.EnumBody]
  
  inline def EnumBooleanBody: typings.babelTypes.babelTypesStrings.EnumBooleanBody = "EnumBooleanBody".asInstanceOf[typings.babelTypes.babelTypesStrings.EnumBooleanBody]
  
  inline def EnumBooleanMember: typings.babelTypes.babelTypesStrings.EnumBooleanMember = "EnumBooleanMember".asInstanceOf[typings.babelTypes.babelTypesStrings.EnumBooleanMember]
  
  inline def EnumDeclaration: typings.babelTypes.babelTypesStrings.EnumDeclaration = "EnumDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.EnumDeclaration]
  
  inline def EnumDefaultedMember: typings.babelTypes.babelTypesStrings.EnumDefaultedMember = "EnumDefaultedMember".asInstanceOf[typings.babelTypes.babelTypesStrings.EnumDefaultedMember]
  
  inline def EnumMember: typings.babelTypes.babelTypesStrings.EnumMember = "EnumMember".asInstanceOf[typings.babelTypes.babelTypesStrings.EnumMember]
  
  inline def EnumNumberBody: typings.babelTypes.babelTypesStrings.EnumNumberBody = "EnumNumberBody".asInstanceOf[typings.babelTypes.babelTypesStrings.EnumNumberBody]
  
  inline def EnumNumberMember: typings.babelTypes.babelTypesStrings.EnumNumberMember = "EnumNumberMember".asInstanceOf[typings.babelTypes.babelTypesStrings.EnumNumberMember]
  
  inline def EnumStringBody: typings.babelTypes.babelTypesStrings.EnumStringBody = "EnumStringBody".asInstanceOf[typings.babelTypes.babelTypesStrings.EnumStringBody]
  
  inline def EnumStringMember: typings.babelTypes.babelTypesStrings.EnumStringMember = "EnumStringMember".asInstanceOf[typings.babelTypes.babelTypesStrings.EnumStringMember]
  
  inline def EnumSymbolBody: typings.babelTypes.babelTypesStrings.EnumSymbolBody = "EnumSymbolBody".asInstanceOf[typings.babelTypes.babelTypesStrings.EnumSymbolBody]
  
  inline def ExistsTypeAnnotation: typings.babelTypes.babelTypesStrings.ExistsTypeAnnotation = "ExistsTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.ExistsTypeAnnotation]
  
  inline def ExportAllDeclaration: typings.babelTypes.babelTypesStrings.ExportAllDeclaration = "ExportAllDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.ExportAllDeclaration]
  
  inline def ExportDeclaration: typings.babelTypes.babelTypesStrings.ExportDeclaration = "ExportDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.ExportDeclaration]
  
  inline def ExportDefaultDeclaration: typings.babelTypes.babelTypesStrings.ExportDefaultDeclaration = "ExportDefaultDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.ExportDefaultDeclaration]
  
  inline def ExportDefaultSpecifier: typings.babelTypes.babelTypesStrings.ExportDefaultSpecifier = "ExportDefaultSpecifier".asInstanceOf[typings.babelTypes.babelTypesStrings.ExportDefaultSpecifier]
  
  inline def ExportNamedDeclaration: typings.babelTypes.babelTypesStrings.ExportNamedDeclaration = "ExportNamedDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.ExportNamedDeclaration]
  
  inline def ExportNamespaceSpecifier: typings.babelTypes.babelTypesStrings.ExportNamespaceSpecifier = "ExportNamespaceSpecifier".asInstanceOf[typings.babelTypes.babelTypesStrings.ExportNamespaceSpecifier]
  
  inline def ExportSpecifier: typings.babelTypes.babelTypesStrings.ExportSpecifier = "ExportSpecifier".asInstanceOf[typings.babelTypes.babelTypesStrings.ExportSpecifier]
  
  inline def Expression: typings.babelTypes.babelTypesStrings.Expression = "Expression".asInstanceOf[typings.babelTypes.babelTypesStrings.Expression]
  
  inline def ExpressionStatement: typings.babelTypes.babelTypesStrings.ExpressionStatement = "ExpressionStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.ExpressionStatement]
  
  inline def ExpressionWrapper: typings.babelTypes.babelTypesStrings.ExpressionWrapper = "ExpressionWrapper".asInstanceOf[typings.babelTypes.babelTypesStrings.ExpressionWrapper]
  
  inline def File: typings.babelTypes.babelTypesStrings.File = "File".asInstanceOf[typings.babelTypes.babelTypesStrings.File]
  
  inline def Flow: typings.babelTypes.babelTypesStrings.Flow = "Flow".asInstanceOf[typings.babelTypes.babelTypesStrings.Flow]
  
  inline def FlowBaseAnnotation: typings.babelTypes.babelTypesStrings.FlowBaseAnnotation = "FlowBaseAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.FlowBaseAnnotation]
  
  inline def FlowDeclaration: typings.babelTypes.babelTypesStrings.FlowDeclaration = "FlowDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.FlowDeclaration]
  
  inline def FlowPredicate: typings.babelTypes.babelTypesStrings.FlowPredicate = "FlowPredicate".asInstanceOf[typings.babelTypes.babelTypesStrings.FlowPredicate]
  
  inline def FlowType: typings.babelTypes.babelTypesStrings.FlowType = "FlowType".asInstanceOf[typings.babelTypes.babelTypesStrings.FlowType]
  
  inline def For: typings.babelTypes.babelTypesStrings.For = "For".asInstanceOf[typings.babelTypes.babelTypesStrings.For]
  
  inline def ForInStatement: typings.babelTypes.babelTypesStrings.ForInStatement = "ForInStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.ForInStatement]
  
  inline def ForOfStatement: typings.babelTypes.babelTypesStrings.ForOfStatement = "ForOfStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.ForOfStatement]
  
  inline def ForStatement: typings.babelTypes.babelTypesStrings.ForStatement = "ForStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.ForStatement]
  
  inline def ForXStatement: typings.babelTypes.babelTypesStrings.ForXStatement = "ForXStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.ForXStatement]
  
  inline def Function: typings.babelTypes.babelTypesStrings.Function = "Function".asInstanceOf[typings.babelTypes.babelTypesStrings.Function]
  
  inline def FunctionDeclaration: typings.babelTypes.babelTypesStrings.FunctionDeclaration = "FunctionDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.FunctionDeclaration]
  
  inline def FunctionExpression: typings.babelTypes.babelTypesStrings.FunctionExpression = "FunctionExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.FunctionExpression]
  
  inline def FunctionParent: typings.babelTypes.babelTypesStrings.FunctionParent = "FunctionParent".asInstanceOf[typings.babelTypes.babelTypesStrings.FunctionParent]
  
  inline def FunctionTypeAnnotation: typings.babelTypes.babelTypesStrings.FunctionTypeAnnotation = "FunctionTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.FunctionTypeAnnotation]
  
  inline def FunctionTypeParam: typings.babelTypes.babelTypesStrings.FunctionTypeParam = "FunctionTypeParam".asInstanceOf[typings.babelTypes.babelTypesStrings.FunctionTypeParam]
  
  inline def GenericTypeAnnotation: typings.babelTypes.babelTypesStrings.GenericTypeAnnotation = "GenericTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.GenericTypeAnnotation]
  
  inline def Identifier: typings.babelTypes.babelTypesStrings.Identifier = "Identifier".asInstanceOf[typings.babelTypes.babelTypesStrings.Identifier]
  
  inline def IfStatement: typings.babelTypes.babelTypesStrings.IfStatement = "IfStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.IfStatement]
  
  inline def Immutable: typings.babelTypes.babelTypesStrings.Immutable = "Immutable".asInstanceOf[typings.babelTypes.babelTypesStrings.Immutable]
  
  inline def Import: typings.babelTypes.babelTypesStrings.Import = "Import".asInstanceOf[typings.babelTypes.babelTypesStrings.Import]
  
  inline def ImportAttribute: typings.babelTypes.babelTypesStrings.ImportAttribute = "ImportAttribute".asInstanceOf[typings.babelTypes.babelTypesStrings.ImportAttribute]
  
  inline def ImportDeclaration: typings.babelTypes.babelTypesStrings.ImportDeclaration = "ImportDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.ImportDeclaration]
  
  inline def ImportDefaultSpecifier: typings.babelTypes.babelTypesStrings.ImportDefaultSpecifier = "ImportDefaultSpecifier".asInstanceOf[typings.babelTypes.babelTypesStrings.ImportDefaultSpecifier]
  
  inline def ImportNamespaceSpecifier: typings.babelTypes.babelTypesStrings.ImportNamespaceSpecifier = "ImportNamespaceSpecifier".asInstanceOf[typings.babelTypes.babelTypesStrings.ImportNamespaceSpecifier]
  
  inline def ImportOrExportDeclaration: typings.babelTypes.babelTypesStrings.ImportOrExportDeclaration = "ImportOrExportDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.ImportOrExportDeclaration]
  
  inline def ImportSpecifier: typings.babelTypes.babelTypesStrings.ImportSpecifier = "ImportSpecifier".asInstanceOf[typings.babelTypes.babelTypesStrings.ImportSpecifier]
  
  inline def IndexedAccessType: typings.babelTypes.babelTypesStrings.IndexedAccessType = "IndexedAccessType".asInstanceOf[typings.babelTypes.babelTypesStrings.IndexedAccessType]
  
  inline def InferredPredicate: typings.babelTypes.babelTypesStrings.InferredPredicate = "InferredPredicate".asInstanceOf[typings.babelTypes.babelTypesStrings.InferredPredicate]
  
  inline def InterfaceDeclaration: typings.babelTypes.babelTypesStrings.InterfaceDeclaration = "InterfaceDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.InterfaceDeclaration]
  
  inline def InterfaceExtends: typings.babelTypes.babelTypesStrings.InterfaceExtends = "InterfaceExtends".asInstanceOf[typings.babelTypes.babelTypesStrings.InterfaceExtends]
  
  inline def InterfaceTypeAnnotation: typings.babelTypes.babelTypesStrings.InterfaceTypeAnnotation = "InterfaceTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.InterfaceTypeAnnotation]
  
  inline def InterpreterDirective: typings.babelTypes.babelTypesStrings.InterpreterDirective = "InterpreterDirective".asInstanceOf[typings.babelTypes.babelTypesStrings.InterpreterDirective]
  
  inline def IntersectionTypeAnnotation: typings.babelTypes.babelTypesStrings.IntersectionTypeAnnotation = "IntersectionTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.IntersectionTypeAnnotation]
  
  inline def JSX: typings.babelTypes.babelTypesStrings.JSX = "JSX".asInstanceOf[typings.babelTypes.babelTypesStrings.JSX]
  
  inline def JSXAttribute: typings.babelTypes.babelTypesStrings.JSXAttribute = "JSXAttribute".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXAttribute]
  
  inline def JSXClosingElement: typings.babelTypes.babelTypesStrings.JSXClosingElement = "JSXClosingElement".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXClosingElement]
  
  inline def JSXClosingFragment: typings.babelTypes.babelTypesStrings.JSXClosingFragment = "JSXClosingFragment".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXClosingFragment]
  
  inline def JSXElement: typings.babelTypes.babelTypesStrings.JSXElement = "JSXElement".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXElement]
  
  inline def JSXEmptyExpression: typings.babelTypes.babelTypesStrings.JSXEmptyExpression = "JSXEmptyExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXEmptyExpression]
  
  inline def JSXExpressionContainer: typings.babelTypes.babelTypesStrings.JSXExpressionContainer = "JSXExpressionContainer".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXExpressionContainer]
  
  inline def JSXFragment: typings.babelTypes.babelTypesStrings.JSXFragment = "JSXFragment".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXFragment]
  
  inline def JSXIdentifier: typings.babelTypes.babelTypesStrings.JSXIdentifier = "JSXIdentifier".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXIdentifier]
  
  inline def JSXMemberExpression: typings.babelTypes.babelTypesStrings.JSXMemberExpression = "JSXMemberExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXMemberExpression]
  
  inline def JSXNamespacedName: typings.babelTypes.babelTypesStrings.JSXNamespacedName = "JSXNamespacedName".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXNamespacedName]
  
  inline def JSXOpeningElement: typings.babelTypes.babelTypesStrings.JSXOpeningElement = "JSXOpeningElement".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXOpeningElement]
  
  inline def JSXOpeningFragment: typings.babelTypes.babelTypesStrings.JSXOpeningFragment = "JSXOpeningFragment".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXOpeningFragment]
  
  inline def JSXSpreadAttribute: typings.babelTypes.babelTypesStrings.JSXSpreadAttribute = "JSXSpreadAttribute".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXSpreadAttribute]
  
  inline def JSXSpreadChild: typings.babelTypes.babelTypesStrings.JSXSpreadChild = "JSXSpreadChild".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXSpreadChild]
  
  inline def JSXText: typings.babelTypes.babelTypesStrings.JSXText = "JSXText".asInstanceOf[typings.babelTypes.babelTypesStrings.JSXText]
  
  inline def LVal: typings.babelTypes.babelTypesStrings.LVal = "LVal".asInstanceOf[typings.babelTypes.babelTypesStrings.LVal]
  
  inline def LabeledStatement: typings.babelTypes.babelTypesStrings.LabeledStatement = "LabeledStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.LabeledStatement]
  
  inline def Literal: typings.babelTypes.babelTypesStrings.Literal = "Literal".asInstanceOf[typings.babelTypes.babelTypesStrings.Literal]
  
  inline def LogicalExpression: typings.babelTypes.babelTypesStrings.LogicalExpression = "LogicalExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.LogicalExpression]
  
  inline def Loop: typings.babelTypes.babelTypesStrings.Loop = "Loop".asInstanceOf[typings.babelTypes.babelTypesStrings.Loop]
  
  inline def MemberExpression: typings.babelTypes.babelTypesStrings.MemberExpression = "MemberExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.MemberExpression]
  
  inline def MetaProperty: typings.babelTypes.babelTypesStrings.MetaProperty = "MetaProperty".asInstanceOf[typings.babelTypes.babelTypesStrings.MetaProperty]
  
  inline def Method: typings.babelTypes.babelTypesStrings.Method = "Method".asInstanceOf[typings.babelTypes.babelTypesStrings.Method]
  
  inline def Miscellaneous: typings.babelTypes.babelTypesStrings.Miscellaneous = "Miscellaneous".asInstanceOf[typings.babelTypes.babelTypesStrings.Miscellaneous]
  
  inline def MixedTypeAnnotation: typings.babelTypes.babelTypesStrings.MixedTypeAnnotation = "MixedTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.MixedTypeAnnotation]
  
  inline def ModuleDeclaration: typings.babelTypes.babelTypesStrings.ModuleDeclaration = "ModuleDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.ModuleDeclaration]
  
  inline def ModuleExpression: typings.babelTypes.babelTypesStrings.ModuleExpression = "ModuleExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.ModuleExpression]
  
  inline def ModuleSpecifier: typings.babelTypes.babelTypesStrings.ModuleSpecifier = "ModuleSpecifier".asInstanceOf[typings.babelTypes.babelTypesStrings.ModuleSpecifier]
  
  inline def NewExpression: typings.babelTypes.babelTypesStrings.NewExpression = "NewExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.NewExpression]
  
  inline def Noop: typings.babelTypes.babelTypesStrings.Noop = "Noop".asInstanceOf[typings.babelTypes.babelTypesStrings.Noop]
  
  inline def NullLiteral: typings.babelTypes.babelTypesStrings.NullLiteral = "NullLiteral".asInstanceOf[typings.babelTypes.babelTypesStrings.NullLiteral]
  
  inline def NullLiteralTypeAnnotation: typings.babelTypes.babelTypesStrings.NullLiteralTypeAnnotation = "NullLiteralTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.NullLiteralTypeAnnotation]
  
  inline def NullableTypeAnnotation: typings.babelTypes.babelTypesStrings.NullableTypeAnnotation = "NullableTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.NullableTypeAnnotation]
  
  inline def NumberLiteral: typings.babelTypes.babelTypesStrings.NumberLiteral = "NumberLiteral".asInstanceOf[typings.babelTypes.babelTypesStrings.NumberLiteral]
  
  inline def NumberLiteralTypeAnnotation: typings.babelTypes.babelTypesStrings.NumberLiteralTypeAnnotation = "NumberLiteralTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.NumberLiteralTypeAnnotation]
  
  inline def NumberTypeAnnotation: typings.babelTypes.babelTypesStrings.NumberTypeAnnotation = "NumberTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.NumberTypeAnnotation]
  
  inline def NumericLiteral: typings.babelTypes.babelTypesStrings.NumericLiteral = "NumericLiteral".asInstanceOf[typings.babelTypes.babelTypesStrings.NumericLiteral]
  
  inline def ObjectExpression: typings.babelTypes.babelTypesStrings.ObjectExpression = "ObjectExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.ObjectExpression]
  
  inline def ObjectMember: typings.babelTypes.babelTypesStrings.ObjectMember = "ObjectMember".asInstanceOf[typings.babelTypes.babelTypesStrings.ObjectMember]
  
  inline def ObjectMethod: typings.babelTypes.babelTypesStrings.ObjectMethod = "ObjectMethod".asInstanceOf[typings.babelTypes.babelTypesStrings.ObjectMethod]
  
  inline def ObjectPattern: typings.babelTypes.babelTypesStrings.ObjectPattern = "ObjectPattern".asInstanceOf[typings.babelTypes.babelTypesStrings.ObjectPattern]
  
  inline def ObjectProperty: typings.babelTypes.babelTypesStrings.ObjectProperty = "ObjectProperty".asInstanceOf[typings.babelTypes.babelTypesStrings.ObjectProperty]
  
  inline def ObjectTypeAnnotation: typings.babelTypes.babelTypesStrings.ObjectTypeAnnotation = "ObjectTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.ObjectTypeAnnotation]
  
  inline def ObjectTypeCallProperty: typings.babelTypes.babelTypesStrings.ObjectTypeCallProperty = "ObjectTypeCallProperty".asInstanceOf[typings.babelTypes.babelTypesStrings.ObjectTypeCallProperty]
  
  inline def ObjectTypeIndexer: typings.babelTypes.babelTypesStrings.ObjectTypeIndexer = "ObjectTypeIndexer".asInstanceOf[typings.babelTypes.babelTypesStrings.ObjectTypeIndexer]
  
  inline def ObjectTypeInternalSlot: typings.babelTypes.babelTypesStrings.ObjectTypeInternalSlot = "ObjectTypeInternalSlot".asInstanceOf[typings.babelTypes.babelTypesStrings.ObjectTypeInternalSlot]
  
  inline def ObjectTypeProperty: typings.babelTypes.babelTypesStrings.ObjectTypeProperty = "ObjectTypeProperty".asInstanceOf[typings.babelTypes.babelTypesStrings.ObjectTypeProperty]
  
  inline def ObjectTypeSpreadProperty: typings.babelTypes.babelTypesStrings.ObjectTypeSpreadProperty = "ObjectTypeSpreadProperty".asInstanceOf[typings.babelTypes.babelTypesStrings.ObjectTypeSpreadProperty]
  
  inline def OpaqueType: typings.babelTypes.babelTypesStrings.OpaqueType = "OpaqueType".asInstanceOf[typings.babelTypes.babelTypesStrings.OpaqueType]
  
  inline def OptionalCallExpression: typings.babelTypes.babelTypesStrings.OptionalCallExpression = "OptionalCallExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.OptionalCallExpression]
  
  inline def OptionalIndexedAccessType: typings.babelTypes.babelTypesStrings.OptionalIndexedAccessType = "OptionalIndexedAccessType".asInstanceOf[typings.babelTypes.babelTypesStrings.OptionalIndexedAccessType]
  
  inline def OptionalMemberExpression: typings.babelTypes.babelTypesStrings.OptionalMemberExpression = "OptionalMemberExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.OptionalMemberExpression]
  
  inline def ParenthesizedExpression: typings.babelTypes.babelTypesStrings.ParenthesizedExpression = "ParenthesizedExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.ParenthesizedExpression]
  
  inline def Pattern: typings.babelTypes.babelTypesStrings.Pattern = "Pattern".asInstanceOf[typings.babelTypes.babelTypesStrings.Pattern]
  
  inline def PatternLike: typings.babelTypes.babelTypesStrings.PatternLike = "PatternLike".asInstanceOf[typings.babelTypes.babelTypesStrings.PatternLike]
  
  inline def PipelineBareFunction: typings.babelTypes.babelTypesStrings.PipelineBareFunction = "PipelineBareFunction".asInstanceOf[typings.babelTypes.babelTypesStrings.PipelineBareFunction]
  
  inline def PipelinePrimaryTopicReference: typings.babelTypes.babelTypesStrings.PipelinePrimaryTopicReference = "PipelinePrimaryTopicReference".asInstanceOf[typings.babelTypes.babelTypesStrings.PipelinePrimaryTopicReference]
  
  inline def PipelineTopicExpression: typings.babelTypes.babelTypesStrings.PipelineTopicExpression = "PipelineTopicExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.PipelineTopicExpression]
  
  inline def Placeholder: typings.babelTypes.babelTypesStrings.Placeholder = "Placeholder".asInstanceOf[typings.babelTypes.babelTypesStrings.Placeholder]
  
  inline def Private: typings.babelTypes.babelTypesStrings.Private = "Private".asInstanceOf[typings.babelTypes.babelTypesStrings.Private]
  
  inline def PrivateName: typings.babelTypes.babelTypesStrings.PrivateName = "PrivateName".asInstanceOf[typings.babelTypes.babelTypesStrings.PrivateName]
  
  inline def Program: typings.babelTypes.babelTypesStrings.Program = "Program".asInstanceOf[typings.babelTypes.babelTypesStrings.Program]
  
  inline def Property: typings.babelTypes.babelTypesStrings.Property = "Property".asInstanceOf[typings.babelTypes.babelTypesStrings.Property]
  
  inline def Pureish: typings.babelTypes.babelTypesStrings.Pureish = "Pureish".asInstanceOf[typings.babelTypes.babelTypesStrings.Pureish]
  
  inline def QualifiedTypeIdentifier: typings.babelTypes.babelTypesStrings.QualifiedTypeIdentifier = "QualifiedTypeIdentifier".asInstanceOf[typings.babelTypes.babelTypesStrings.QualifiedTypeIdentifier]
  
  inline def RecordExpression: typings.babelTypes.babelTypesStrings.RecordExpression = "RecordExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.RecordExpression]
  
  inline def RegExpLiteral: typings.babelTypes.babelTypesStrings.RegExpLiteral = "RegExpLiteral".asInstanceOf[typings.babelTypes.babelTypesStrings.RegExpLiteral]
  
  inline def RegexLiteral: typings.babelTypes.babelTypesStrings.RegexLiteral = "RegexLiteral".asInstanceOf[typings.babelTypes.babelTypesStrings.RegexLiteral]
  
  inline def RestElement: typings.babelTypes.babelTypesStrings.RestElement = "RestElement".asInstanceOf[typings.babelTypes.babelTypesStrings.RestElement]
  
  inline def RestProperty: typings.babelTypes.babelTypesStrings.RestProperty = "RestProperty".asInstanceOf[typings.babelTypes.babelTypesStrings.RestProperty]
  
  inline def ReturnStatement: typings.babelTypes.babelTypesStrings.ReturnStatement = "ReturnStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.ReturnStatement]
  
  inline def Scopable: typings.babelTypes.babelTypesStrings.Scopable = "Scopable".asInstanceOf[typings.babelTypes.babelTypesStrings.Scopable]
  
  inline def SequenceExpression: typings.babelTypes.babelTypesStrings.SequenceExpression = "SequenceExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.SequenceExpression]
  
  inline def SpreadElement: typings.babelTypes.babelTypesStrings.SpreadElement = "SpreadElement".asInstanceOf[typings.babelTypes.babelTypesStrings.SpreadElement]
  
  inline def SpreadProperty: typings.babelTypes.babelTypesStrings.SpreadProperty = "SpreadProperty".asInstanceOf[typings.babelTypes.babelTypesStrings.SpreadProperty]
  
  inline def Standardized: typings.babelTypes.babelTypesStrings.Standardized = "Standardized".asInstanceOf[typings.babelTypes.babelTypesStrings.Standardized]
  
  inline def Statement: typings.babelTypes.babelTypesStrings.Statement = "Statement".asInstanceOf[typings.babelTypes.babelTypesStrings.Statement]
  
  inline def StaticBlock: typings.babelTypes.babelTypesStrings.StaticBlock = "StaticBlock".asInstanceOf[typings.babelTypes.babelTypesStrings.StaticBlock]
  
  inline def StringLiteral: typings.babelTypes.babelTypesStrings.StringLiteral = "StringLiteral".asInstanceOf[typings.babelTypes.babelTypesStrings.StringLiteral]
  
  inline def StringLiteralTypeAnnotation: typings.babelTypes.babelTypesStrings.StringLiteralTypeAnnotation = "StringLiteralTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.StringLiteralTypeAnnotation]
  
  inline def StringTypeAnnotation: typings.babelTypes.babelTypesStrings.StringTypeAnnotation = "StringTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.StringTypeAnnotation]
  
  inline def Super: typings.babelTypes.babelTypesStrings.Super = "Super".asInstanceOf[typings.babelTypes.babelTypesStrings.Super]
  
  inline def SwitchCase: typings.babelTypes.babelTypesStrings.SwitchCase = "SwitchCase".asInstanceOf[typings.babelTypes.babelTypesStrings.SwitchCase]
  
  inline def SwitchStatement: typings.babelTypes.babelTypesStrings.SwitchStatement = "SwitchStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.SwitchStatement]
  
  inline def SymbolTypeAnnotation: typings.babelTypes.babelTypesStrings.SymbolTypeAnnotation = "SymbolTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.SymbolTypeAnnotation]
  
  inline def TSAnyKeyword: typings.babelTypes.babelTypesStrings.TSAnyKeyword = "TSAnyKeyword".asInstanceOf[typings.babelTypes.babelTypesStrings.TSAnyKeyword]
  
  inline def TSArrayType: typings.babelTypes.babelTypesStrings.TSArrayType = "TSArrayType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSArrayType]
  
  inline def TSAsExpression: typings.babelTypes.babelTypesStrings.TSAsExpression = "TSAsExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.TSAsExpression]
  
  inline def TSBaseType: typings.babelTypes.babelTypesStrings.TSBaseType = "TSBaseType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSBaseType]
  
  inline def TSBigIntKeyword: typings.babelTypes.babelTypesStrings.TSBigIntKeyword = "TSBigIntKeyword".asInstanceOf[typings.babelTypes.babelTypesStrings.TSBigIntKeyword]
  
  inline def TSBooleanKeyword: typings.babelTypes.babelTypesStrings.TSBooleanKeyword = "TSBooleanKeyword".asInstanceOf[typings.babelTypes.babelTypesStrings.TSBooleanKeyword]
  
  inline def TSCallSignatureDeclaration: typings.babelTypes.babelTypesStrings.TSCallSignatureDeclaration = "TSCallSignatureDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.TSCallSignatureDeclaration]
  
  inline def TSConditionalType: typings.babelTypes.babelTypesStrings.TSConditionalType = "TSConditionalType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSConditionalType]
  
  inline def TSConstructSignatureDeclaration: typings.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration = "TSConstructSignatureDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration]
  
  inline def TSConstructorType: typings.babelTypes.babelTypesStrings.TSConstructorType = "TSConstructorType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSConstructorType]
  
  inline def TSDeclareFunction: typings.babelTypes.babelTypesStrings.TSDeclareFunction = "TSDeclareFunction".asInstanceOf[typings.babelTypes.babelTypesStrings.TSDeclareFunction]
  
  inline def TSDeclareMethod: typings.babelTypes.babelTypesStrings.TSDeclareMethod = "TSDeclareMethod".asInstanceOf[typings.babelTypes.babelTypesStrings.TSDeclareMethod]
  
  inline def TSEntityName: typings.babelTypes.babelTypesStrings.TSEntityName = "TSEntityName".asInstanceOf[typings.babelTypes.babelTypesStrings.TSEntityName]
  
  inline def TSEnumDeclaration: typings.babelTypes.babelTypesStrings.TSEnumDeclaration = "TSEnumDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.TSEnumDeclaration]
  
  inline def TSEnumMember: typings.babelTypes.babelTypesStrings.TSEnumMember = "TSEnumMember".asInstanceOf[typings.babelTypes.babelTypesStrings.TSEnumMember]
  
  inline def TSExportAssignment: typings.babelTypes.babelTypesStrings.TSExportAssignment = "TSExportAssignment".asInstanceOf[typings.babelTypes.babelTypesStrings.TSExportAssignment]
  
  inline def TSExpressionWithTypeArguments: typings.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments = "TSExpressionWithTypeArguments".asInstanceOf[typings.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments]
  
  inline def TSExternalModuleReference: typings.babelTypes.babelTypesStrings.TSExternalModuleReference = "TSExternalModuleReference".asInstanceOf[typings.babelTypes.babelTypesStrings.TSExternalModuleReference]
  
  inline def TSFunctionType: typings.babelTypes.babelTypesStrings.TSFunctionType = "TSFunctionType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSFunctionType]
  
  inline def TSImportEqualsDeclaration: typings.babelTypes.babelTypesStrings.TSImportEqualsDeclaration = "TSImportEqualsDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.TSImportEqualsDeclaration]
  
  inline def TSImportType: typings.babelTypes.babelTypesStrings.TSImportType = "TSImportType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSImportType]
  
  inline def TSIndexSignature: typings.babelTypes.babelTypesStrings.TSIndexSignature = "TSIndexSignature".asInstanceOf[typings.babelTypes.babelTypesStrings.TSIndexSignature]
  
  inline def TSIndexedAccessType: typings.babelTypes.babelTypesStrings.TSIndexedAccessType = "TSIndexedAccessType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSIndexedAccessType]
  
  inline def TSInferType: typings.babelTypes.babelTypesStrings.TSInferType = "TSInferType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSInferType]
  
  inline def TSInstantiationExpression: typings.babelTypes.babelTypesStrings.TSInstantiationExpression = "TSInstantiationExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.TSInstantiationExpression]
  
  inline def TSInterfaceBody: typings.babelTypes.babelTypesStrings.TSInterfaceBody = "TSInterfaceBody".asInstanceOf[typings.babelTypes.babelTypesStrings.TSInterfaceBody]
  
  inline def TSInterfaceDeclaration: typings.babelTypes.babelTypesStrings.TSInterfaceDeclaration = "TSInterfaceDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.TSInterfaceDeclaration]
  
  inline def TSIntersectionType: typings.babelTypes.babelTypesStrings.TSIntersectionType = "TSIntersectionType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSIntersectionType]
  
  inline def TSIntrinsicKeyword: typings.babelTypes.babelTypesStrings.TSIntrinsicKeyword = "TSIntrinsicKeyword".asInstanceOf[typings.babelTypes.babelTypesStrings.TSIntrinsicKeyword]
  
  inline def TSLiteralType: typings.babelTypes.babelTypesStrings.TSLiteralType = "TSLiteralType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSLiteralType]
  
  inline def TSMappedType: typings.babelTypes.babelTypesStrings.TSMappedType = "TSMappedType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSMappedType]
  
  inline def TSMethodSignature: typings.babelTypes.babelTypesStrings.TSMethodSignature = "TSMethodSignature".asInstanceOf[typings.babelTypes.babelTypesStrings.TSMethodSignature]
  
  inline def TSModuleBlock: typings.babelTypes.babelTypesStrings.TSModuleBlock = "TSModuleBlock".asInstanceOf[typings.babelTypes.babelTypesStrings.TSModuleBlock]
  
  inline def TSModuleDeclaration: typings.babelTypes.babelTypesStrings.TSModuleDeclaration = "TSModuleDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.TSModuleDeclaration]
  
  inline def TSNamedTupleMember: typings.babelTypes.babelTypesStrings.TSNamedTupleMember = "TSNamedTupleMember".asInstanceOf[typings.babelTypes.babelTypesStrings.TSNamedTupleMember]
  
  inline def TSNamespaceExportDeclaration: typings.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration = "TSNamespaceExportDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration]
  
  inline def TSNeverKeyword: typings.babelTypes.babelTypesStrings.TSNeverKeyword = "TSNeverKeyword".asInstanceOf[typings.babelTypes.babelTypesStrings.TSNeverKeyword]
  
  inline def TSNonNullExpression: typings.babelTypes.babelTypesStrings.TSNonNullExpression = "TSNonNullExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.TSNonNullExpression]
  
  inline def TSNullKeyword: typings.babelTypes.babelTypesStrings.TSNullKeyword = "TSNullKeyword".asInstanceOf[typings.babelTypes.babelTypesStrings.TSNullKeyword]
  
  inline def TSNumberKeyword: typings.babelTypes.babelTypesStrings.TSNumberKeyword = "TSNumberKeyword".asInstanceOf[typings.babelTypes.babelTypesStrings.TSNumberKeyword]
  
  inline def TSObjectKeyword: typings.babelTypes.babelTypesStrings.TSObjectKeyword = "TSObjectKeyword".asInstanceOf[typings.babelTypes.babelTypesStrings.TSObjectKeyword]
  
  inline def TSOptionalType: typings.babelTypes.babelTypesStrings.TSOptionalType = "TSOptionalType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSOptionalType]
  
  inline def TSParameterProperty: typings.babelTypes.babelTypesStrings.TSParameterProperty = "TSParameterProperty".asInstanceOf[typings.babelTypes.babelTypesStrings.TSParameterProperty]
  
  inline def TSParenthesizedType: typings.babelTypes.babelTypesStrings.TSParenthesizedType = "TSParenthesizedType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSParenthesizedType]
  
  inline def TSPropertySignature: typings.babelTypes.babelTypesStrings.TSPropertySignature = "TSPropertySignature".asInstanceOf[typings.babelTypes.babelTypesStrings.TSPropertySignature]
  
  inline def TSQualifiedName: typings.babelTypes.babelTypesStrings.TSQualifiedName = "TSQualifiedName".asInstanceOf[typings.babelTypes.babelTypesStrings.TSQualifiedName]
  
  inline def TSRestType: typings.babelTypes.babelTypesStrings.TSRestType = "TSRestType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSRestType]
  
  inline def TSSatisfiesExpression: typings.babelTypes.babelTypesStrings.TSSatisfiesExpression = "TSSatisfiesExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.TSSatisfiesExpression]
  
  inline def TSStringKeyword: typings.babelTypes.babelTypesStrings.TSStringKeyword = "TSStringKeyword".asInstanceOf[typings.babelTypes.babelTypesStrings.TSStringKeyword]
  
  inline def TSSymbolKeyword: typings.babelTypes.babelTypesStrings.TSSymbolKeyword = "TSSymbolKeyword".asInstanceOf[typings.babelTypes.babelTypesStrings.TSSymbolKeyword]
  
  inline def TSThisType: typings.babelTypes.babelTypesStrings.TSThisType = "TSThisType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSThisType]
  
  inline def TSTupleType: typings.babelTypes.babelTypesStrings.TSTupleType = "TSTupleType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSTupleType]
  
  inline def TSType: typings.babelTypes.babelTypesStrings.TSType = "TSType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSType]
  
  inline def TSTypeAliasDeclaration: typings.babelTypes.babelTypesStrings.TSTypeAliasDeclaration = "TSTypeAliasDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.TSTypeAliasDeclaration]
  
  inline def TSTypeAnnotation: typings.babelTypes.babelTypesStrings.TSTypeAnnotation = "TSTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.TSTypeAnnotation]
  
  inline def TSTypeAssertion: typings.babelTypes.babelTypesStrings.TSTypeAssertion = "TSTypeAssertion".asInstanceOf[typings.babelTypes.babelTypesStrings.TSTypeAssertion]
  
  inline def TSTypeElement: typings.babelTypes.babelTypesStrings.TSTypeElement = "TSTypeElement".asInstanceOf[typings.babelTypes.babelTypesStrings.TSTypeElement]
  
  inline def TSTypeLiteral: typings.babelTypes.babelTypesStrings.TSTypeLiteral = "TSTypeLiteral".asInstanceOf[typings.babelTypes.babelTypesStrings.TSTypeLiteral]
  
  inline def TSTypeOperator: typings.babelTypes.babelTypesStrings.TSTypeOperator = "TSTypeOperator".asInstanceOf[typings.babelTypes.babelTypesStrings.TSTypeOperator]
  
  inline def TSTypeParameter: typings.babelTypes.babelTypesStrings.TSTypeParameter = "TSTypeParameter".asInstanceOf[typings.babelTypes.babelTypesStrings.TSTypeParameter]
  
  inline def TSTypeParameterDeclaration: typings.babelTypes.babelTypesStrings.TSTypeParameterDeclaration = "TSTypeParameterDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.TSTypeParameterDeclaration]
  
  inline def TSTypeParameterInstantiation: typings.babelTypes.babelTypesStrings.TSTypeParameterInstantiation = "TSTypeParameterInstantiation".asInstanceOf[typings.babelTypes.babelTypesStrings.TSTypeParameterInstantiation]
  
  inline def TSTypePredicate: typings.babelTypes.babelTypesStrings.TSTypePredicate = "TSTypePredicate".asInstanceOf[typings.babelTypes.babelTypesStrings.TSTypePredicate]
  
  inline def TSTypeQuery: typings.babelTypes.babelTypesStrings.TSTypeQuery = "TSTypeQuery".asInstanceOf[typings.babelTypes.babelTypesStrings.TSTypeQuery]
  
  inline def TSTypeReference: typings.babelTypes.babelTypesStrings.TSTypeReference = "TSTypeReference".asInstanceOf[typings.babelTypes.babelTypesStrings.TSTypeReference]
  
  inline def TSUndefinedKeyword: typings.babelTypes.babelTypesStrings.TSUndefinedKeyword = "TSUndefinedKeyword".asInstanceOf[typings.babelTypes.babelTypesStrings.TSUndefinedKeyword]
  
  inline def TSUnionType: typings.babelTypes.babelTypesStrings.TSUnionType = "TSUnionType".asInstanceOf[typings.babelTypes.babelTypesStrings.TSUnionType]
  
  inline def TSUnknownKeyword: typings.babelTypes.babelTypesStrings.TSUnknownKeyword = "TSUnknownKeyword".asInstanceOf[typings.babelTypes.babelTypesStrings.TSUnknownKeyword]
  
  inline def TSVoidKeyword: typings.babelTypes.babelTypesStrings.TSVoidKeyword = "TSVoidKeyword".asInstanceOf[typings.babelTypes.babelTypesStrings.TSVoidKeyword]
  
  inline def TaggedTemplateExpression: typings.babelTypes.babelTypesStrings.TaggedTemplateExpression = "TaggedTemplateExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.TaggedTemplateExpression]
  
  inline def TemplateElement: typings.babelTypes.babelTypesStrings.TemplateElement = "TemplateElement".asInstanceOf[typings.babelTypes.babelTypesStrings.TemplateElement]
  
  inline def TemplateLiteral: typings.babelTypes.babelTypesStrings.TemplateLiteral = "TemplateLiteral".asInstanceOf[typings.babelTypes.babelTypesStrings.TemplateLiteral]
  
  inline def Terminatorless: typings.babelTypes.babelTypesStrings.Terminatorless = "Terminatorless".asInstanceOf[typings.babelTypes.babelTypesStrings.Terminatorless]
  
  inline def ThisExpression: typings.babelTypes.babelTypesStrings.ThisExpression = "ThisExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.ThisExpression]
  
  inline def ThisTypeAnnotation: typings.babelTypes.babelTypesStrings.ThisTypeAnnotation = "ThisTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.ThisTypeAnnotation]
  
  inline def ThrowStatement: typings.babelTypes.babelTypesStrings.ThrowStatement = "ThrowStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.ThrowStatement]
  
  inline def TopicReference: typings.babelTypes.babelTypesStrings.TopicReference = "TopicReference".asInstanceOf[typings.babelTypes.babelTypesStrings.TopicReference]
  
  inline def TryStatement: typings.babelTypes.babelTypesStrings.TryStatement = "TryStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.TryStatement]
  
  inline def TupleExpression: typings.babelTypes.babelTypesStrings.TupleExpression = "TupleExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.TupleExpression]
  
  inline def TupleTypeAnnotation: typings.babelTypes.babelTypesStrings.TupleTypeAnnotation = "TupleTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.TupleTypeAnnotation]
  
  inline def TypeAlias: typings.babelTypes.babelTypesStrings.TypeAlias = "TypeAlias".asInstanceOf[typings.babelTypes.babelTypesStrings.TypeAlias]
  
  inline def TypeAnnotation: typings.babelTypes.babelTypesStrings.TypeAnnotation = "TypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.TypeAnnotation]
  
  inline def TypeCastExpression: typings.babelTypes.babelTypesStrings.TypeCastExpression = "TypeCastExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.TypeCastExpression]
  
  inline def TypeParameter: typings.babelTypes.babelTypesStrings.TypeParameter = "TypeParameter".asInstanceOf[typings.babelTypes.babelTypesStrings.TypeParameter]
  
  inline def TypeParameterDeclaration: typings.babelTypes.babelTypesStrings.TypeParameterDeclaration = "TypeParameterDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.TypeParameterDeclaration]
  
  inline def TypeParameterInstantiation: typings.babelTypes.babelTypesStrings.TypeParameterInstantiation = "TypeParameterInstantiation".asInstanceOf[typings.babelTypes.babelTypesStrings.TypeParameterInstantiation]
  
  inline def TypeScript: typings.babelTypes.babelTypesStrings.TypeScript = "TypeScript".asInstanceOf[typings.babelTypes.babelTypesStrings.TypeScript]
  
  inline def TypeofTypeAnnotation: typings.babelTypes.babelTypesStrings.TypeofTypeAnnotation = "TypeofTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.TypeofTypeAnnotation]
  
  inline def UnaryExpression: typings.babelTypes.babelTypesStrings.UnaryExpression = "UnaryExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.UnaryExpression]
  
  inline def UnaryLike: typings.babelTypes.babelTypesStrings.UnaryLike = "UnaryLike".asInstanceOf[typings.babelTypes.babelTypesStrings.UnaryLike]
  
  inline def UnionTypeAnnotation: typings.babelTypes.babelTypesStrings.UnionTypeAnnotation = "UnionTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.UnionTypeAnnotation]
  
  inline def UpdateExpression: typings.babelTypes.babelTypesStrings.UpdateExpression = "UpdateExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.UpdateExpression]
  
  inline def UserWhitespacable: typings.babelTypes.babelTypesStrings.UserWhitespacable = "UserWhitespacable".asInstanceOf[typings.babelTypes.babelTypesStrings.UserWhitespacable]
  
  inline def V8IntrinsicIdentifier: typings.babelTypes.babelTypesStrings.V8IntrinsicIdentifier = "V8IntrinsicIdentifier".asInstanceOf[typings.babelTypes.babelTypesStrings.V8IntrinsicIdentifier]
  
  inline def VariableDeclaration: typings.babelTypes.babelTypesStrings.VariableDeclaration = "VariableDeclaration".asInstanceOf[typings.babelTypes.babelTypesStrings.VariableDeclaration]
  
  inline def VariableDeclarator: typings.babelTypes.babelTypesStrings.VariableDeclarator = "VariableDeclarator".asInstanceOf[typings.babelTypes.babelTypesStrings.VariableDeclarator]
  
  inline def Variance: typings.babelTypes.babelTypesStrings.Variance = "Variance".asInstanceOf[typings.babelTypes.babelTypesStrings.Variance]
  
  inline def VoidTypeAnnotation: typings.babelTypes.babelTypesStrings.VoidTypeAnnotation = "VoidTypeAnnotation".asInstanceOf[typings.babelTypes.babelTypesStrings.VoidTypeAnnotation]
  
  inline def While: typings.babelTypes.babelTypesStrings.While = "While".asInstanceOf[typings.babelTypes.babelTypesStrings.While]
  
  inline def WhileStatement: typings.babelTypes.babelTypesStrings.WhileStatement = "WhileStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.WhileStatement]
  
  inline def WithStatement: typings.babelTypes.babelTypesStrings.WithStatement = "WithStatement".asInstanceOf[typings.babelTypes.babelTypesStrings.WithStatement]
  
  inline def YieldExpression: typings.babelTypes.babelTypesStrings.YieldExpression = "YieldExpression".asInstanceOf[typings.babelTypes.babelTypesStrings.YieldExpression]
}
