package typings.cucumberCucumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigurationOptionSplitterMod {
  
  object OptionSplitter {
    
    @JSImport("@cucumber/cucumber/lib/configuration/option_splitter", "OptionSplitter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def split(option: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(option.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
}
