package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightFormatMod {
  
  object default {
    
    inline def apply(date: js.Date, format: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, format: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/lightFormat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
