package typings.tslintXANLscI2

import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexDotDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/language/walker/index.d.ts", "AbstractWalker")
  @js.native
  abstract class AbstractWalker[T] protected ()
    extends typings.tslintXANLscI2.walkerDTsMod.AbstractWalker[T] {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
  }
  
  @JSImport(".tslint-xANLscI2/lib/language/walker/index.d.ts", "BlockScopeAwareRuleWalker")
  @js.native
  abstract class BlockScopeAwareRuleWalker[T, U] protected ()
    extends typings.tslintXANLscI2.blockScopeAwareRuleWalkerDTsMod.BlockScopeAwareRuleWalker[T, U] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @JSImport(".tslint-xANLscI2/lib/language/walker/index.d.ts", "ProgramAwareRuleWalker")
  @js.native
  open class ProgramAwareRuleWalker protected ()
    extends typings.tslintXANLscI2.programAwareRuleWalkerDTsMod.ProgramAwareRuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
  }
  
  @JSImport(".tslint-xANLscI2/lib/language/walker/index.d.ts", "RuleWalker")
  @js.native
  open class RuleWalker protected ()
    extends typings.tslintXANLscI2.ruleWalkerDTsMod.RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @JSImport(".tslint-xANLscI2/lib/language/walker/index.d.ts", "ScopeAwareRuleWalker")
  @js.native
  abstract class ScopeAwareRuleWalker[T] protected ()
    extends typings.tslintXANLscI2.scopeAwareRuleWalkerDTsMod.ScopeAwareRuleWalker[T] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @JSImport(".tslint-xANLscI2/lib/language/walker/index.d.ts", "SyntaxWalker")
  @js.native
  open class SyntaxWalker ()
    extends typings.tslintXANLscI2.syntaxWalkerDTsMod.SyntaxWalker
  
  @JSImport(".tslint-xANLscI2/lib/language/walker/index.d.ts", "WalkContext")
  @js.native
  open class WalkContext[T] protected ()
    extends typings.tslintXANLscI2.walkContextDTsMod.WalkContext[T] {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
  }
}
