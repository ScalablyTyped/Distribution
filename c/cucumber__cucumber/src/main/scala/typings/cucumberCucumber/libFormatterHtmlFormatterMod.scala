package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterMod.IFormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHtmlFormatterMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/html_formatter", JSImport.Default)
  @js.native
  open class default protected () extends HtmlFormatter {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber/lib/formatter/html_formatter", "default.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  @js.native
  trait HtmlFormatter
    extends typings.cucumberCucumber.libFormatterMod.default {
    
    /* private */ val _htmlStream: Any = js.native
  }
}
