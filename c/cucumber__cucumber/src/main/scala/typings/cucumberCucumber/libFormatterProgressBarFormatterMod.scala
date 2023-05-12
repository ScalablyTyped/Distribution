package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterMod.IFormatterOptions
import typings.cucumberMessages.mod.Envelope
import typings.cucumberMessages.mod.TestCaseFinished
import typings.cucumberMessages.mod.TestRunFinished
import typings.cucumberMessages.mod.TestStepFinished
import typings.cucumberMessages.mod.UndefinedParameterType
import typings.progress.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterProgressBarFormatterMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/progress_bar_formatter", JSImport.Default)
  @js.native
  open class default protected () extends ProgressBarFormatter {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber/lib/formatter/progress_bar_formatter", "default.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  @js.native
  trait ProgressBarFormatter
    extends typings.cucumberCucumber.libFormatterMod.default {
    
    def incrementStepCount(pickleId: String): Unit = js.native
    
    def initializeProgressBar(): Unit = js.native
    
    /* private */ var issueCount: Any = js.native
    
    def logErrorIfNeeded(testCaseFinished: TestCaseFinished): Unit = js.native
    
    def logProgress(param0: TestStepFinished): Unit = js.native
    
    def logSummary(testRunFinished: TestRunFinished): Unit = js.native
    
    def logUndefinedParametertype(parameterType: UndefinedParameterType): Unit = js.native
    
    /* private */ var numberOfSteps: Any = js.native
    
    def parseEnvelope(envelope: Envelope): Unit = js.native
    
    var progressBar: ^ = js.native
    
    /* private */ var testRunStarted: Any = js.native
  }
}
