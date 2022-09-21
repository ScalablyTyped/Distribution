package typings.tslintXANLscI2.mod

import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".tslint-xANLscI2", "RuleFailure")
@js.native
open class RuleFailure protected ()
  extends typings.tslintXANLscI2.ruleDTsMod.RuleFailure {
  def this(sourceFile: SourceFile, start: Double, end: Double, failure: String, ruleName: String) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: js.Array[typings.tslintXANLscI2.ruleDTsMod.Replacement]
  ) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: typings.tslintXANLscI2.ruleDTsMod.Replacement
  ) = this()
}
/* static members */
object RuleFailure {
  
  @JSImport(".tslint-xANLscI2", "RuleFailure")
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(a: typings.tslintXANLscI2.ruleDTsMod.RuleFailure, b: typings.tslintXANLscI2.ruleDTsMod.RuleFailure): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
