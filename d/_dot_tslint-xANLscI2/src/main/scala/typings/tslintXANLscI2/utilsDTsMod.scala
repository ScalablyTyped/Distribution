package typings.tslintXANLscI2

import typings.tslintXANLscI2.ruleDTsMod.IDisabledInterval
import typings.tslintXANLscI2.ruleDTsMod.RuleFailure
import typings.typescript.mod.BinaryOperatorToken
import typings.typescript.mod.BindingElement
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Declaration
import typings.typescript.mod.Expression
import typings.typescript.mod.ModifierFlags
import typings.typescript.mod.ModifiersArray
import typings.typescript.mod.ModuleDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.NodeFlags
import typings.typescript.mod.ObjectFlags
import typings.typescript.mod.ObjectType
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Symbol
import typings.typescript.mod.SymbolFlags
import typings.typescript.mod.SyntaxKind
import typings.typescript.mod.Type
import typings.typescript.mod.TypeFlags
import typings.typescript.mod.VariableDeclaration
import typings.typescript.mod.VariableStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/language/utils.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ancestorWhere[T /* <: Node */](node: Node, predicate: js.Function1[/* n */ Node, /* is T */ Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ancestorWhere")(node.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def childOfKind(node: Node, kind: SyntaxKind): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("childOfKind")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def doesIntersect(failure: RuleFailure, disabledIntervals: js.Array[IDisabledInterval]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doesIntersect")(failure.asInstanceOf[js.Any], disabledIntervals.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def forEachComment(node: Node, cb: ForEachCommentCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachComment")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachToken(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEachToken(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback, filter: FilterCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getBindingElementVariableDeclaration(node: BindingElement): VariableDeclaration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBindingElementVariableDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[VariableDeclaration | Null]
  
  inline def getEqualsKind(node: BinaryOperatorToken): js.UndefOr[EqualsKind] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEqualsKind")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[EqualsKind]]
  
  inline def getSourceFile(fileName: String, source: String): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceFile")(fileName.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
  
  inline def hasCommentAfterPosition(text: String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasCommentAfterPosition")(text.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasModifier(modifiers: Unit, modifierKinds: SyntaxKind*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(List(modifiers.asInstanceOf[js.Any]).`++`(modifierKinds.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  inline def hasModifier(modifiers: ModifiersArray, modifierKinds: SyntaxKind*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(List(modifiers.asInstanceOf[js.Any]).`++`(modifierKinds.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  inline def isAssignment(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlockScopeBoundary(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlockScopedBindingElement(node: BindingElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedBindingElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlockScopedVariable(node: VariableDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariable")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isBlockScopedVariable(node: VariableStatement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariable")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCombinedModifierFlagSet(node: Declaration, flagToCheck: ModifierFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCombinedModifierFlagSet")(node.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCombinedNodeFlagSet(node: Node, flagToCheck: NodeFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCombinedNodeFlagSet")(node.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isLoop(node: Node): /* is typescript.typescript.IterationStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoop")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IterationStatement */ Boolean]
  
  inline def isNegativeNumberLiteral(node: Node): /* is .tslint-xANLscI2.anon.PrefixUnaryExpressionoper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegativeNumberLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is .tslint-xANLscI2.anon.PrefixUnaryExpressionoper */ Boolean]
  
  inline def isNestedModuleDeclaration(decl: ModuleDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNestedModuleDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNodeFlagSet(node: Node, flagToCheck: NodeFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNodeFlagSet")(node.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNumeric(node: Expression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObjectFlagSet(objectType: ObjectType, flagToCheck: ObjectFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectFlagSet")(objectType.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isScopeBoundary(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStrictNullChecksEnabled(options: CompilerOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStrictNullChecksEnabled")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSymbolFlagSet(symbol: Symbol, flagToCheck: SymbolFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolFlagSet")(symbol.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTypeFlagSet(`type`: Type, flagToCheck: TypeFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeFlagSet")(`type`.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isWhiteSpace(ch: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhiteSpace")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def someAncestor(node: Node, predicate: js.Function1[/* n */ Node, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("someAncestor")(node.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def unwrapParentheses(node: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapParentheses")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  trait EqualsKind extends StObject {
    
    var isPositive: Boolean
    
    var isStrict: Boolean
  }
  object EqualsKind {
    
    inline def apply(isPositive: Boolean, isStrict: Boolean): EqualsKind = {
      val __obj = js.Dynamic.literal(isPositive = isPositive.asInstanceOf[js.Any], isStrict = isStrict.asInstanceOf[js.Any])
      __obj.asInstanceOf[EqualsKind]
    }
    
    extension [Self <: EqualsKind](x: Self) {
      
      inline def setIsPositive(value: Boolean): Self = StObject.set(x, "isPositive", value.asInstanceOf[js.Any])
      
      inline def setIsStrict(value: Boolean): Self = StObject.set(x, "isStrict", value.asInstanceOf[js.Any])
    }
  }
  
  type FilterCallback = js.Function1[/* node */ Node, Boolean]
  
  type ForEachCommentCallback = js.Function3[/* fullText */ String, /* kind */ SyntaxKind, /* pos */ TokenPosition, Unit]
  
  type ForEachTokenCallback = js.Function4[
    /* fullText */ String, 
    /* kind */ SyntaxKind, 
    /* pos */ TokenPosition, 
    /* parent */ Node, 
    Unit
  ]
  
  trait TokenPosition extends StObject {
    
    /** The end of the token */
    var end: Double
    
    /** The start of the token including all trivia before it */
    var fullStart: Double
    
    /** The start of the token */
    var tokenStart: Double
  }
  object TokenPosition {
    
    inline def apply(end: Double, fullStart: Double, tokenStart: Double): TokenPosition = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], fullStart = fullStart.asInstanceOf[js.Any], tokenStart = tokenStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenPosition]
    }
    
    extension [Self <: TokenPosition](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setFullStart(value: Double): Self = StObject.set(x, "fullStart", value.asInstanceOf[js.Any])
      
      inline def setTokenStart(value: Double): Self = StObject.set(x, "tokenStart", value.asInstanceOf[js.Any])
    }
  }
}
