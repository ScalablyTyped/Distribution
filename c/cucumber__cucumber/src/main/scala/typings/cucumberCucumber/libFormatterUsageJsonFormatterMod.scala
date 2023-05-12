package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterMod.IFormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterUsageJsonFormatterMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/usage_json_formatter", JSImport.Default)
  @js.native
  open class default protected () extends UsageJsonFormatter {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber/lib/formatter/usage_json_formatter", "default.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  @js.native
  trait UsageJsonFormatter
    extends typings.cucumberCucumber.libFormatterMod.default {
    
    def logUsage(): Unit = js.native
    
    def replacer(key: String, value: Any): Any = js.native
  }
}
