package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.anon.TypeArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeChecker extends StObject {
  
  /** Follow all aliases to get the original symbol. */
  def getAliasedSymbol(symbol: Symbol): Symbol = js.native
  
  def getAmbientModules(): Array[Symbol] = js.native
  
  def getApparentType(`type`: Type): Type = js.native
  
  def getAugmentedPropertiesOfType(`type`: Type): Array[Symbol] = js.native
  
  def getBaseConstraintOfType(`type`: Type): js.UndefOr[Type] = js.native
  
  def getBaseTypeOfLiteralType(`type`: Type): Type = js.native
  
  def getBaseTypes(`type`: InterfaceType): Array[BaseType] = js.native
  
  def getConstantValue(node: ElementAccessExpression): js.UndefOr[java.lang.String | Double] = js.native
  def getConstantValue(node: EnumMember): js.UndefOr[java.lang.String | Double] = js.native
  def getConstantValue(node: PropertyAccessExpression): js.UndefOr[java.lang.String | Double] = js.native
  
  def getContextualType(node: Expression): js.UndefOr[Type] = js.native
  
  def getDeclaredTypeOfSymbol(symbol: Symbol): Type = js.native
  
  def getDefaultFromTypeParameter(`type`: Type): js.UndefOr[Type] = js.native
  
  def getExportSpecifierLocalTargetSymbol(location: ExportSpecifier): js.UndefOr[Symbol] = js.native
  def getExportSpecifierLocalTargetSymbol(location: Identifier): js.UndefOr[Symbol] = js.native
  
  /**
    * If a symbol is a local symbol with an associated exported symbol, returns the exported symbol.
    * Otherwise returns its input.
    * For example, at `export type T = number;`:
    *     - `getSymbolAtLocation` at the location `T` will return the exported symbol for `T`.
    *     - But the result of `getSymbolsInScope` will contain the *local* symbol for `T`, not the exported symbol.
    *     - Calling `getExportSymbolOfSymbol` on that local symbol will return the exported symbol.
    */
  def getExportSymbolOfSymbol(symbol: Symbol): Symbol = js.native
  
  def getExportsOfModule(moduleSymbol: Symbol): Array[Symbol] = js.native
  
  def getFullyQualifiedName(symbol: Symbol): java.lang.String = js.native
  
  /** Follow a *single* alias to get the immediately aliased symbol. */
  def getImmediateAliasedSymbol(symbol: Symbol): js.UndefOr[Symbol] = js.native
  
  def getIndexInfoOfType(`type`: Type, kind: IndexKind): js.UndefOr[IndexInfo] = js.native
  
  def getIndexInfosOfType(`type`: Type): Array[IndexInfo] = js.native
  
  def getIndexTypeOfType(`type`: Type, kind: IndexKind): js.UndefOr[Type] = js.native
  
  def getJsxIntrinsicTagNamesAt(location: Node): Array[Symbol] = js.native
  
  def getNonNullableType(`type`: Type): Type = js.native
  
  def getNullableType(`type`: Type, flags: TypeFlags): Type = js.native
  
  def getPrivateIdentifierPropertyOfType(leftType: Type, name: java.lang.String, location: Node): js.UndefOr[Symbol] = js.native
  
  def getPropertiesOfType(`type`: Type): Array[Symbol] = js.native
  
  def getPropertyOfType(`type`: Type, propertyName: java.lang.String): js.UndefOr[Symbol] = js.native
  
  def getPropertySymbolOfDestructuringAssignment(location: Identifier): js.UndefOr[Symbol] = js.native
  
  /**
    * returns unknownSignature in the case of an error.
    * returns undefined if the node is not valid.
    * @param argumentCount Apparent number of arguments, passed in case of a possibly incomplete call. This should come from an ArgumentListInfo. See `signatureHelp.ts`.
    */
  def getResolvedSignature(node: CallLikeExpression): js.UndefOr[Signature] = js.native
  def getResolvedSignature(node: CallLikeExpression, candidatesOutArray: Unit, argumentCount: Double): js.UndefOr[Signature] = js.native
  def getResolvedSignature(node: CallLikeExpression, candidatesOutArray: Array[Signature]): js.UndefOr[Signature] = js.native
  def getResolvedSignature(node: CallLikeExpression, candidatesOutArray: Array[Signature], argumentCount: Double): js.UndefOr[Signature] = js.native
  
  def getReturnTypeOfSignature(signature: Signature): Type = js.native
  
  def getRootSymbols(symbol: Symbol): Array[Symbol] = js.native
  
  /**
    * The function returns the value (local variable) symbol of an identifier in the short-hand property assignment.
    * This is necessary as an identifier in short-hand property assignment can contains two meaning: property name and property value.
    */
  def getShorthandAssignmentValueSymbol(): js.UndefOr[Symbol] = js.native
  def getShorthandAssignmentValueSymbol(location: Node): js.UndefOr[Symbol] = js.native
  
  def getSignatureFromDeclaration(declaration: SignatureDeclaration): js.UndefOr[Signature] = js.native
  
  def getSignaturesOfType(`type`: Type, kind: SignatureKind): Array[Signature] = js.native
  
  def getSymbolAtLocation(node: Node): js.UndefOr[Symbol] = js.native
  
  def getSymbolOfExpando(node: Node, allowDeclaration: Boolean): js.UndefOr[Symbol] = js.native
  
  def getSymbolsInScope(location: Node, meaning: SymbolFlags): Array[Symbol] = js.native
  
  def getSymbolsOfParameterPropertyDeclaration(parameter: ParameterDeclaration, parameterName: java.lang.String): Array[Symbol] = js.native
  
  def getTypeArguments(`type`: TypeReference): Array[Type] = js.native
  
  def getTypeAtLocation(node: Node): Type = js.native
  
  def getTypeFromTypeNode(node: TypeNode): Type = js.native
  
  def getTypeOfAssignmentPattern(pattern: AssignmentPattern): Type = js.native
  
  def getTypeOfSymbolAtLocation(symbol: Symbol, node: Node): Type = js.native
  
  def getTypePredicateOfSignature(signature: Signature): js.UndefOr[TypePredicate] = js.native
  
  def getWidenedType(`type`: Type): Type = js.native
  
  /** Note that the resulting nodes cannot be checked. */
  def indexInfoToIndexSignatureDeclaration(indexInfo: IndexInfo): js.UndefOr[IndexSignatureDeclaration] = js.native
  def indexInfoToIndexSignatureDeclaration(indexInfo: IndexInfo, enclosingDeclaration: Unit, flags: NodeBuilderFlags): js.UndefOr[IndexSignatureDeclaration] = js.native
  def indexInfoToIndexSignatureDeclaration(indexInfo: IndexInfo, enclosingDeclaration: Node): js.UndefOr[IndexSignatureDeclaration] = js.native
  def indexInfoToIndexSignatureDeclaration(indexInfo: IndexInfo, enclosingDeclaration: Node, flags: NodeBuilderFlags): js.UndefOr[IndexSignatureDeclaration] = js.native
  
  def isArgumentsSymbol(symbol: Symbol): Boolean = js.native
  
  def isImplementationOfOverload(node: SignatureDeclaration): js.UndefOr[Boolean] = js.native
  
  def isOptionalParameter(node: ParameterDeclaration): Boolean = js.native
  
  def isUndefinedSymbol(symbol: Symbol): Boolean = js.native
  
  def isUnknownSymbol(symbol: Symbol): Boolean = js.native
  
  def isValidPropertyAccess(node: ImportTypeNode, propertyName: java.lang.String): Boolean = js.native
  def isValidPropertyAccess(node: PropertyAccessExpression, propertyName: java.lang.String): Boolean = js.native
  def isValidPropertyAccess(node: QualifiedName, propertyName: java.lang.String): Boolean = js.native
  
  /**
    * Depending on the operation performed, it may be appropriate to throw away the checker
    * if the cancellation token is triggered. Typically, if it is used for error checking
    * and the operation is cancelled, then it should be discarded, otherwise it is safe to keep.
    */
  def runWithCancellationToken[T](token: CancellationToken, cb: js.Function1[/* checker */ this.type, T]): T = js.native
  
  /** Note that the resulting nodes cannot be checked. */
  def signatureToSignatureDeclaration(signature: Signature, kind: SyntaxKind): js.UndefOr[SignatureDeclaration & TypeArguments] = js.native
  def signatureToSignatureDeclaration(signature: Signature, kind: SyntaxKind, enclosingDeclaration: Unit, flags: NodeBuilderFlags): js.UndefOr[SignatureDeclaration & TypeArguments] = js.native
  def signatureToSignatureDeclaration(signature: Signature, kind: SyntaxKind, enclosingDeclaration: Node): js.UndefOr[SignatureDeclaration & TypeArguments] = js.native
  def signatureToSignatureDeclaration(signature: Signature, kind: SyntaxKind, enclosingDeclaration: Node, flags: NodeBuilderFlags): js.UndefOr[SignatureDeclaration & TypeArguments] = js.native
  
  def signatureToString(signature: Signature): java.lang.String = js.native
  def signatureToString(signature: Signature, enclosingDeclaration: Unit, flags: Unit, kind: SignatureKind): java.lang.String = js.native
  def signatureToString(signature: Signature, enclosingDeclaration: Unit, flags: TypeFormatFlags): java.lang.String = js.native
  def signatureToString(signature: Signature, enclosingDeclaration: Unit, flags: TypeFormatFlags, kind: SignatureKind): java.lang.String = js.native
  def signatureToString(signature: Signature, enclosingDeclaration: Node): java.lang.String = js.native
  def signatureToString(signature: Signature, enclosingDeclaration: Node, flags: Unit, kind: SignatureKind): java.lang.String = js.native
  def signatureToString(signature: Signature, enclosingDeclaration: Node, flags: TypeFormatFlags): java.lang.String = js.native
  def signatureToString(signature: Signature, enclosingDeclaration: Node, flags: TypeFormatFlags, kind: SignatureKind): java.lang.String = js.native
  
  /** Note that the resulting nodes cannot be checked. */
  def symbolToEntityName(symbol: Symbol, meaning: SymbolFlags): js.UndefOr[EntityName] = js.native
  def symbolToEntityName(symbol: Symbol, meaning: SymbolFlags, enclosingDeclaration: Unit, flags: NodeBuilderFlags): js.UndefOr[EntityName] = js.native
  def symbolToEntityName(symbol: Symbol, meaning: SymbolFlags, enclosingDeclaration: Node): js.UndefOr[EntityName] = js.native
  def symbolToEntityName(symbol: Symbol, meaning: SymbolFlags, enclosingDeclaration: Node, flags: NodeBuilderFlags): js.UndefOr[EntityName] = js.native
  
  /** Note that the resulting nodes cannot be checked. */
  def symbolToExpression(symbol: Symbol, meaning: SymbolFlags): js.UndefOr[Expression] = js.native
  def symbolToExpression(symbol: Symbol, meaning: SymbolFlags, enclosingDeclaration: Unit, flags: NodeBuilderFlags): js.UndefOr[Expression] = js.native
  def symbolToExpression(symbol: Symbol, meaning: SymbolFlags, enclosingDeclaration: Node): js.UndefOr[Expression] = js.native
  def symbolToExpression(symbol: Symbol, meaning: SymbolFlags, enclosingDeclaration: Node, flags: NodeBuilderFlags): js.UndefOr[Expression] = js.native
  
  /** Note that the resulting nodes cannot be checked. */
  def symbolToParameterDeclaration(symbol: Symbol): js.UndefOr[ParameterDeclaration] = js.native
  def symbolToParameterDeclaration(symbol: Symbol, enclosingDeclaration: Unit, flags: NodeBuilderFlags): js.UndefOr[ParameterDeclaration] = js.native
  def symbolToParameterDeclaration(symbol: Symbol, enclosingDeclaration: Node): js.UndefOr[ParameterDeclaration] = js.native
  def symbolToParameterDeclaration(symbol: Symbol, enclosingDeclaration: Node, flags: NodeBuilderFlags): js.UndefOr[ParameterDeclaration] = js.native
  
  def symbolToString(symbol: Symbol): java.lang.String = js.native
  def symbolToString(symbol: Symbol, enclosingDeclaration: Unit, meaning: Unit, flags: SymbolFormatFlags): java.lang.String = js.native
  def symbolToString(symbol: Symbol, enclosingDeclaration: Unit, meaning: SymbolFlags): java.lang.String = js.native
  def symbolToString(symbol: Symbol, enclosingDeclaration: Unit, meaning: SymbolFlags, flags: SymbolFormatFlags): java.lang.String = js.native
  def symbolToString(symbol: Symbol, enclosingDeclaration: Node): java.lang.String = js.native
  def symbolToString(symbol: Symbol, enclosingDeclaration: Node, meaning: Unit, flags: SymbolFormatFlags): java.lang.String = js.native
  def symbolToString(symbol: Symbol, enclosingDeclaration: Node, meaning: SymbolFlags): java.lang.String = js.native
  def symbolToString(symbol: Symbol, enclosingDeclaration: Node, meaning: SymbolFlags, flags: SymbolFormatFlags): java.lang.String = js.native
  
  /** Note that the resulting nodes cannot be checked. */
  def symbolToTypeParameterDeclarations(symbol: Symbol): js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
  def symbolToTypeParameterDeclarations(symbol: Symbol, enclosingDeclaration: Unit, flags: NodeBuilderFlags): js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
  def symbolToTypeParameterDeclarations(symbol: Symbol, enclosingDeclaration: Node): js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
  def symbolToTypeParameterDeclarations(symbol: Symbol, enclosingDeclaration: Node, flags: NodeBuilderFlags): js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
  
  def tryGetMemberInModuleExports(memberName: java.lang.String, moduleSymbol: Symbol): js.UndefOr[Symbol] = js.native
  
  /** Note that the resulting nodes cannot be checked. */
  def typeParameterToDeclaration(parameter: TypeParameter): js.UndefOr[TypeParameterDeclaration] = js.native
  def typeParameterToDeclaration(parameter: TypeParameter, enclosingDeclaration: Unit, flags: NodeBuilderFlags): js.UndefOr[TypeParameterDeclaration] = js.native
  def typeParameterToDeclaration(parameter: TypeParameter, enclosingDeclaration: Node): js.UndefOr[TypeParameterDeclaration] = js.native
  def typeParameterToDeclaration(parameter: TypeParameter, enclosingDeclaration: Node, flags: NodeBuilderFlags): js.UndefOr[TypeParameterDeclaration] = js.native
  
  def typePredicateToString(predicate: TypePredicate): java.lang.String = js.native
  def typePredicateToString(predicate: TypePredicate, enclosingDeclaration: Unit, flags: TypeFormatFlags): java.lang.String = js.native
  def typePredicateToString(predicate: TypePredicate, enclosingDeclaration: Node): java.lang.String = js.native
  def typePredicateToString(predicate: TypePredicate, enclosingDeclaration: Node, flags: TypeFormatFlags): java.lang.String = js.native
  
  def typeToString(`type`: Type): java.lang.String = js.native
  def typeToString(`type`: Type, enclosingDeclaration: Unit, flags: TypeFormatFlags): java.lang.String = js.native
  def typeToString(`type`: Type, enclosingDeclaration: Node): java.lang.String = js.native
  def typeToString(`type`: Type, enclosingDeclaration: Node, flags: TypeFormatFlags): java.lang.String = js.native
  
  /** Note that the resulting nodes cannot be checked. */
  def typeToTypeNode(`type`: Type): js.UndefOr[TypeNode] = js.native
  def typeToTypeNode(`type`: Type, enclosingDeclaration: Unit, flags: NodeBuilderFlags): js.UndefOr[TypeNode] = js.native
  def typeToTypeNode(`type`: Type, enclosingDeclaration: Node): js.UndefOr[TypeNode] = js.native
  def typeToTypeNode(`type`: Type, enclosingDeclaration: Node, flags: NodeBuilderFlags): js.UndefOr[TypeNode] = js.native
}
