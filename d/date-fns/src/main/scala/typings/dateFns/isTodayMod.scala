package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isTodayMod {
  
  object default {
    
    inline def apply(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def apply(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("date-fns/esm/isToday", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
