package typings.cucumberCucumber

import typings.cucumberCucumber.anon.TypeofFormatter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHelpersFormattersMod {
  
  object default {
    
    @JSImport("@cucumber/cucumber/lib/formatter/helpers/formatters", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildFormattersDocumentationString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildFormattersDocumentationString")().asInstanceOf[String]
    
    inline def getFormatters(): Record[String, TypeofFormatter] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatters")().asInstanceOf[Record[String, TypeofFormatter]]
  }
}
