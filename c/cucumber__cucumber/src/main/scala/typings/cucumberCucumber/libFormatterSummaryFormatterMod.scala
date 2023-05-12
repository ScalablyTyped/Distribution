package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterHelpersEventDataCollectorMod.ITestCaseAttempt
import typings.cucumberCucumber.libFormatterMod.IFormatterOptions
import typings.cucumberMessages.mod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterSummaryFormatterMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/summary_formatter", JSImport.Default)
  @js.native
  open class default protected () extends SummaryFormatter {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber/lib/formatter/summary_formatter", "default.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  trait ILogIssuesRequest extends StObject {
    
    var issues: js.Array[ITestCaseAttempt]
    
    var title: String
  }
  object ILogIssuesRequest {
    
    inline def apply(issues: js.Array[ITestCaseAttempt], title: String): ILogIssuesRequest = {
      val __obj = js.Dynamic.literal(issues = issues.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILogIssuesRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILogIssuesRequest] (val x: Self) extends AnyVal {
      
      inline def setIssues(value: js.Array[ITestCaseAttempt]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setIssuesVarargs(value: ITestCaseAttempt*): Self = StObject.set(x, "issues", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SummaryFormatter
    extends typings.cucumberCucumber.libFormatterMod.default {
    
    def logIssues(param0: ILogIssuesRequest): Unit = js.native
    
    def logSummary(testRunDuration: Duration): Unit = js.native
  }
}
