package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterMod.IFormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterRerunFormatterMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/rerun_formatter", JSImport.Default)
  @js.native
  open class default protected () extends RerunFormatter {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber/lib/formatter/rerun_formatter", "default.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  @js.native
  trait RerunFormatter
    extends typings.cucumberCucumber.libFormatterMod.default {
    
    def logFailedTestCases(): Unit = js.native
    
    /* private */ val separator: Any = js.native
  }
}
