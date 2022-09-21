package typings.tslintXANLscI2

import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.scopeAwareRuleWalkerDTsMod.ScopeAwareRuleWalker
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockScopeAwareRuleWalkerDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/language/walker/blockScopeAwareRuleWalker.d.ts", "BlockScopeAwareRuleWalker")
  @js.native
  abstract class BlockScopeAwareRuleWalker[T, U] protected () extends ScopeAwareRuleWalker[T] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
    
    /* private */ val blockScopeStack: Any = js.native
    
    def createBlockScope(node: Node): U = js.native
    
    def findBlockScope(predicate: js.Function1[/* scope */ U, Boolean]): js.UndefOr[U] = js.native
    
    def getAllBlockScopes(): js.Array[U] = js.native
    
    def getCurrentBlockDepth(): Double = js.native
    
    def getCurrentBlockScope(): U = js.native
    
    /* private */ var isBlockScopeBoundary: Any = js.native
    
    def onBlockScopeEnd(): Unit = js.native
    
    def onBlockScopeStart(): Unit = js.native
  }
}
