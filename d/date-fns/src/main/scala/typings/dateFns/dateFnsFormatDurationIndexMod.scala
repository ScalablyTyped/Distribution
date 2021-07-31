package typings.dateFns

import typings.dateFns.anon.Delimiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsFormatDurationIndexMod {
  
  object default {
    
    @scala.inline
    def apply(duration: typings.dateFns.mod.Duration): String = ^.asInstanceOf[js.Dynamic].apply(duration.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def apply(duration: typings.dateFns.mod.Duration, options: Delimiter): String = (^.asInstanceOf[js.Dynamic].apply(duration.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/formatDuration/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
