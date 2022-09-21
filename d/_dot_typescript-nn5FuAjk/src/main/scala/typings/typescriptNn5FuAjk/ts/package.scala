package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StringDictionary
import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.anon.AffectedResult
import typings.typescriptNn5FuAjk.anon.EscapedIdentifier
import typings.typescriptNn5FuAjk.anon.Metadata
import typings.typescriptNn5FuAjk.ts.SyntaxKind.AsteriskAsteriskToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AbstractKeyword = ModifierToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.AbstractKeyword]

type AccessibilityModifier = PublicKeyword | PrivateKeyword | ProtectedKeyword

type AdditiveOperatorOrHigher = MultiplicativeOperatorOrHigher | AdditiveOperator

type AffectedFileResult[T] = js.UndefOr[AffectedResult[T]]

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.ts.BindingElement
  - typings.typescriptNn5FuAjk.ts.OmittedExpression
  - typings.typescriptNn5FuAjk.ts.SpreadElement
  - typings.typescriptNn5FuAjk.ts.ArrayLiteralExpression
  - typings.typescriptNn5FuAjk.ts.ObjectLiteralExpression
  - typings.typescriptNn5FuAjk.ts.AssignmentExpression[typings.typescriptNn5FuAjk.ts.EqualsToken]
  - typings.typescriptNn5FuAjk.ts.Identifier
  - typings.typescriptNn5FuAjk.ts.PropertyAccessExpression
  - typings.typescriptNn5FuAjk.ts.ElementAccessExpression
*/
type ArrayBindingOrAssignmentElement = _ArrayBindingOrAssignmentElement | AssignmentExpression[EqualsToken]

type AssertKeyword = KeywordToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.AssertKeyword]

type AssertsKeyword = KeywordToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.AssertsKeyword]

type AssertsToken = AssertsKeyword

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.ts.SyntaxKind.QuestionQuestionToken
  - typings.typescriptNn5FuAjk.ts.LogicalOperatorOrHigher
  - typings.typescriptNn5FuAjk.ts.AssignmentOperator
*/
type AssignmentOperatorOrHigher = _AssignmentOperatorOrHigher | LogicalOperatorOrHigher

type AssignmentOperatorToken = Token[AssignmentOperator]

type AsteriskToken = PunctuationToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.AsteriskToken]

type AsyncKeyword = ModifierToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.AsyncKeyword]

type AwaitKeyword = KeywordToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.AwaitKeyword]

type AwaitKeywordToken = AwaitKeyword

type BaseType = ObjectType | IntersectionType | TypeVariable

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.ts.AssignmentOperatorOrHigher
  - typings.typescriptNn5FuAjk.ts.SyntaxKind.CommaToken
*/
type BinaryOperator = _BinaryOperator | LogicalOperatorOrHigher

type BinaryOperatorToken = Token[BinaryOperator]

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.ts.VariableDeclaration
  - typings.typescriptNn5FuAjk.ts.ParameterDeclaration
  - typings.typescriptNn5FuAjk.ts.ObjectBindingOrAssignmentElement
  - typings.typescriptNn5FuAjk.ts.ArrayBindingOrAssignmentElement
*/
type BindingOrAssignmentElement = _BindingOrAssignmentElement | AssignmentExpression[EqualsToken]

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.ts.DotDotDotToken
  - typings.typescriptNn5FuAjk.ts.SpreadElement
  - typings.typescriptNn5FuAjk.ts.SpreadAssignment
*/
type BindingOrAssignmentElementRestIndicator = _BindingOrAssignmentElementRestIndicator | DotDotDotToken

type BitwiseOperatorOrHigher = EqualityOperatorOrHigher | BitwiseOperator

type ClassMemberModifier = AccessibilityModifier | ReadonlyKeyword | StaticKeyword

type CodeActionCommand = InstallPackageAction

type ColonToken = PunctuationToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.ColonToken]

type CompilerOptionsValue = js.UndefOr[
java.lang.String | Double | Boolean | (Array[Double | PluginImport | ProjectReference | java.lang.String]) | MapLike[Array[java.lang.String]] | Null]

type ConciseBody = FunctionBody | Expression

type ConstKeyword = ModifierToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.ConstKeyword]

/** Create the program with rootNames and options, if they are undefined, oldProgram and new configFile diagnostics create new program */
type CreateProgram[T /* <: BuilderProgram */] = js.Function6[
/* rootNames */ js.UndefOr[Array[java.lang.String]], 
/* options */ js.UndefOr[CompilerOptions], 
/* host */ js.UndefOr[CompilerHost], 
/* oldProgram */ js.UndefOr[T], 
/* configFileParsingDiagnostics */ js.UndefOr[Array[Diagnostic]], 
/* projectReferences */ js.UndefOr[Array[ProjectReference]], 
T]

type CustomTransformerFactory = js.Function1[/* context */ TransformationContext, CustomTransformer]

type DeclareKeyword = ModifierToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.DeclareKeyword]

type DefaultKeyword = ModifierToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.DefaultKeyword]

type DeferredTypeReference = TypeReference

type DiagnosticReporter = js.Function1[/* diagnostic */ Diagnostic, Unit]

type DirectoryWatcherCallback = js.Function1[/* fileName */ java.lang.String, Unit]

type DotDotDotToken = PunctuationToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.DotDotDotToken]

type DotToken = PunctuationToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.DotToken]

type EmitHelperUniqueNameCallback = js.Function1[/* name */ java.lang.String, java.lang.String]

type EnumType = Type

type EqualityOperatorOrHigher = RelationalOperatorOrHigher | EqualityOperator

type EqualsGreaterThanToken = PunctuationToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.EqualsGreaterThanToken]

type EqualsToken = PunctuationToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.EqualsToken]

type ErrorCallback = js.Function2[/* message */ DiagnosticMessage, /* length */ Double, Unit]

type ExclamationToken = PunctuationToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.ExclamationToken]

type ExponentiationOperator = AsteriskAsteriskToken

type ExportKeyword = ModifierToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.ExportKeyword]

type FileWatcherCallback = js.Function2[/* fileName */ java.lang.String, /* eventKind */ FileWatcherEventKind, Unit]

type FunctionBody = Block

type FunctionLike = SignatureDeclaration

type InKeyword = ModifierToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.InKeyword]

type IncrementExpression = UpdateExpression

type InstantiableType = Type

type IntersectionType = UnionOrIntersectionType

type JsFileExtensionInfo = FileExtensionInfo

type KeywordToken[TKind /* <: KeywordSyntaxKind */] = Token[TKind]

type LogicalOperatorOrHigher = BitwiseOperatorOrHigher | LogicalOperator

/**
  * ES6 Map interface.
  */
/**
  * @deprecated Use `ts.ESMap<K, V>` instead.
  */
type Map[T] = ESMap[java.lang.String, T]

/**
  * Type of objects whose values are all of the same type.
  * The `in` and `for-in` operators can *not* be safely used,
  * since `Object.prototype` may be modified by outside code.
  */
type MapLike[T] = StringDictionary[T]

type MinusToken = PunctuationToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.MinusToken]

type Modifier = AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | InKeyword | PrivateKeyword | ProtectedKeyword | PublicKeyword | OutKeyword | OverrideKeyword | ReadonlyKeyword | StaticKeyword

type ModifierToken[TKind /* <: ModifierSyntaxKind */] = KeywordToken[TKind]

type ModifiersArray = NodeArray[Modifier]

type MultiplicativeOperatorOrHigher = ExponentiationOperator | MultiplicativeOperator

type OutKeyword = ModifierToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.OutKeyword]

type OverrideKeyword = ModifierToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.OverrideKeyword]

type ParameterPropertyModifier = AccessibilityModifier | ReadonlyKeyword

type PlusToken = PunctuationToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.PlusToken]

type PrivateKeyword = ModifierToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.PrivateKeyword]

type ProtectedKeyword = ModifierToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.ProtectedKeyword]

type PublicKeyword = ModifierToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.PublicKeyword]

type PunctuationToken[TKind /* <: PunctuationSyntaxKind */] = Token[TKind]

type QuestionDotToken = PunctuationToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.QuestionDotToken]

type QuestionToken = PunctuationToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.QuestionToken]

type ReadonlyKeyword = ModifierToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.ReadonlyKeyword]

/**
  * ES6 Map interface, only read methods included.
  */
/**
  * @deprecated Use `ts.ReadonlyESMap<K, V>` instead.
  */
type ReadonlyMap[T] = ReadonlyESMap[java.lang.String, T]

type ReadonlyToken = ReadonlyKeyword

type ReadonlyUnderscoreEscapedMap[T] = ReadonlyESMap[String, T]

type RelationalOperatorOrHigher = ShiftOperatorOrHigher | RelationalOperator

type ReportEmitErrorSummary = js.Function2[
/* errorCount */ Double, 
/* filesInError */ Array[js.UndefOr[ReportFileInError]], 
Unit]

type ResolvedConfigFileName = java.lang.String

type ShiftOperatorOrHigher = AdditiveOperatorOrHigher | ShiftOperator

type StaticKeyword = ModifierToken[typings.typescriptNn5FuAjk.ts.SyntaxKind.StaticKeyword]

type String = (java.lang.String & EscapedIdentifier) | (Unit & EscapedIdentifier) | InternalSymbolName

type StructuredType = ObjectType | UnionType | IntersectionType

type SymbolTable = UnderscoreEscapedMap[Symbol]

type Transformer[T /* <: Node */] = js.Function1[/* node */ T, T]

type TransformerFactory[T /* <: Node */] = js.Function1[/* context */ TransformationContext, Transformer[T]]

type TypeParameter = InstantiableType

type TypeVariable = TypeParameter | IndexedAccessType

type UnionType = UnionOrIntersectionType

type VisitResult[T /* <: Node */] = js.UndefOr[T | Array[T]]

type Visitor = js.Function1[/* node */ Node, VisitResult[Node]]

/**
  * Creates the watch what generates program using the config file
  */
type WatchOfConfigFile[T] = Watch[T]

type WatchStatusReporter = js.Function4[
/* diagnostic */ Diagnostic, 
/* newLine */ java.lang.String, 
/* options */ CompilerOptions, 
/* errorCount */ js.UndefOr[Double], 
Unit]

type WithMetadata[T] = T & Metadata

type WriteFileCallback = js.Function6[
/* fileName */ java.lang.String, 
/* text */ java.lang.String, 
/* writeByteOrderMark */ Boolean, 
/* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, Unit]], 
/* sourceFiles */ js.UndefOr[Array[SourceFile]], 
/* data */ js.UndefOr[WriteFileCallbackData], 
Unit]
