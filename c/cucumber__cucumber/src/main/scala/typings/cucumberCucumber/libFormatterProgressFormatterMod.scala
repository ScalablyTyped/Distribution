package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterMod.IFormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterProgressFormatterMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/progress_formatter", JSImport.Default)
  @js.native
  open class default protected () extends ProgressFormatter {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber/lib/formatter/progress_formatter", "default.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  @js.native
  trait ProgressFormatter
    extends typings.cucumberCucumber.libFormatterSummaryFormatterMod.default {
    
    def logProgress(
      param0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ITestStepFinished */ Any
    ): Unit = js.native
  }
}
