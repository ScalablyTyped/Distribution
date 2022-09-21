package typings.tslintXANLscI2

import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleWalkerDTsMod.RuleWalker
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object programAwareRuleWalkerDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/language/walker/programAwareRuleWalker.d.ts", "ProgramAwareRuleWalker")
  @js.native
  open class ProgramAwareRuleWalker protected () extends RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
    
    def getProgram(): Program = js.native
    
    def getTypeChecker(): TypeChecker = js.native
    
    /* private */ val program: Any = js.native
    
    /* private */ val typeChecker: Any = js.native
  }
}
