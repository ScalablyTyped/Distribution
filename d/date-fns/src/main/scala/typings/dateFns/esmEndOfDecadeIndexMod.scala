package typings.dateFns

import typings.dateFns.anon.AdditionalDigits
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmEndOfDecadeIndexMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double): Date = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Date]
    @scala.inline
    def apply(date: Double, options: AdditionalDigits): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date): Date = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date, options: AdditionalDigits): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/esm/endOfDecade/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
