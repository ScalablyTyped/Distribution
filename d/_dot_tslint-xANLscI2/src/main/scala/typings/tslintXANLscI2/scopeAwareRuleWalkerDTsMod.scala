package typings.tslintXANLscI2

import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleWalkerDTsMod.RuleWalker
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopeAwareRuleWalkerDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/language/walker/scopeAwareRuleWalker.d.ts", "ScopeAwareRuleWalker")
  @js.native
  abstract class ScopeAwareRuleWalker[T] protected () extends RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
    
    def createScope(node: Node): T = js.native
    
    def getAllScopes(): js.Array[T] = js.native
    
    def getCurrentDepth(): Double = js.native
    
    def getCurrentScope(): T = js.native
    
    /* protected */ def isScopeBoundary(node: Node): Boolean = js.native
    
    def onScopeEnd(): Unit = js.native
    
    def onScopeStart(): Unit = js.native
    
    /* private */ val scopeStack: Any = js.native
  }
}
