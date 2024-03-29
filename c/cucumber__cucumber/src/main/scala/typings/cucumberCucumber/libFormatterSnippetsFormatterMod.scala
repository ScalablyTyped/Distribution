package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterMod.IFormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterSnippetsFormatterMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/snippets_formatter", JSImport.Default)
  @js.native
  open class default protected () extends SnippetsFormatter {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber/lib/formatter/snippets_formatter", "default.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  @js.native
  trait SnippetsFormatter
    extends typings.cucumberCucumber.libFormatterMod.default {
    
    def logSnippets(): Unit = js.native
  }
}
