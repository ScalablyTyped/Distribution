package typings.tslintXANLscI2

import typings.tslintXANLscI2.abstractRuleDTsMod.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.ITypedRule
import typings.tslintXANLscI2.ruleDTsMod.RuleFailure
import typings.tslintXANLscI2.walkerDTsMod.IWalker
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionallyTypedRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/language/rule/optionallyTypedRule.d.ts", "OptionallyTypedRule")
  @js.native
  abstract class OptionallyTypedRule protected ()
    extends AbstractRule
       with ITypedRule {
    def this(options: IOptions) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(sourceFile: SourceFile): js.Array[RuleFailure] = js.native
    
    /* CompleteClass */
    override def applyWithProgram(sourceFile: SourceFile, program: Program): js.Array[RuleFailure] = js.native
    
    /* CompleteClass */
    override def applyWithWalker(walker: IWalker): js.Array[RuleFailure] = js.native
    
    /* CompleteClass */
    override def getOptions(): IOptions = js.native
    
    /* CompleteClass */
    override def isEnabled(): Boolean = js.native
  }
}
