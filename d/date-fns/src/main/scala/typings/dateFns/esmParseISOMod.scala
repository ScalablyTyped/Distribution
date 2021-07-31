package typings.dateFns

import typings.dateFns.anon.AdditionalDigits
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmParseISOMod {
  
  object default {
    
    @scala.inline
    def apply(argument: String): Date = ^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any]).asInstanceOf[Date]
    @scala.inline
    def apply(argument: String, options: AdditionalDigits): Date = (^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/esm/parseISO", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
