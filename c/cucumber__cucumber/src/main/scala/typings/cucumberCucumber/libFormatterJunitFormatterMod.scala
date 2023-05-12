package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterMod.IFormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterJunitFormatterMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/junit_formatter", JSImport.Default)
  @js.native
  open class default protected () extends JunitFormatter {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber/lib/formatter/junit_formatter", "default.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  @js.native
  trait JunitFormatter
    extends typings.cucumberCucumber.libFormatterMod.default {
    
    /* private */ var buildXmlReport: Any = js.native
    
    /* private */ var durationToSeconds: Any = js.native
    
    /* private */ var formatTestSteps: Any = js.native
    
    /* private */ var getTestCaseName: Any = js.native
    
    /* private */ var getTestCaseResult: Any = js.native
    
    /* private */ var getTestCases: Any = js.native
    
    /* private */ var getTestStep: Any = js.native
    
    /* private */ var getTestSteps: Any = js.native
    
    /* private */ var nameOrDefault: Any = js.native
    
    /* private */ val names: Any = js.native
    
    /* private */ var onTestRunFinished: Any = js.native
  }
}
