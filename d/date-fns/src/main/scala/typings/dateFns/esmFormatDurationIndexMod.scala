package typings.dateFns

import typings.dateFns.anon.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFormatDurationIndexMod {
  
  object default {
    
    inline def apply(duration: Duration): String = ^.asInstanceOf[js.Dynamic].apply(duration.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(duration: Duration, options: Format): String = (^.asInstanceOf[js.Dynamic].apply(duration.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/esm/formatDuration/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
