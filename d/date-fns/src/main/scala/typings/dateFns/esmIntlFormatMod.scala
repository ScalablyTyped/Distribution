package typings.dateFns

import typings.dateFns.anon.Era
import typings.dateFns.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmIntlFormatMod {
  
  object default {
    
    inline def apply(argument: js.Date): String = ^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(argument: js.Date, formatOptions: Unit, localeOptions: `0`): String = (^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any], localeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(argument: js.Date, formatOptions: Era): String = (^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(argument: js.Date, formatOptions: Era, localeOptions: `0`): String = (^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any], localeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(argument: Double): String = ^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(argument: Double, formatOptions: Unit, localeOptions: `0`): String = (^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any], localeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(argument: Double, formatOptions: Era): String = (^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(argument: Double, formatOptions: Era, localeOptions: `0`): String = (^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any], localeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/esm/intlFormat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
