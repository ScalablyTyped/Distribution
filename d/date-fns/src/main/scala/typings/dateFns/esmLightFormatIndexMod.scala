package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmLightFormatIndexMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double, format: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: Date, format: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/esm/lightFormat/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
