package typings.dateFns

import typings.dateFns.anon.Delimiter
import typings.dateFns.anon.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatDurationMod {
  
  object default {
    
    @scala.inline
    def apply(duration: typings.dateFns.mod.Duration | Duration): String = ^.asInstanceOf[js.Dynamic].apply(duration.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def apply(duration: Duration, options: Format): String = (^.asInstanceOf[js.Dynamic].apply(duration.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(duration: typings.dateFns.mod.Duration, options: Delimiter): String = (^.asInstanceOf[js.Dynamic].apply(duration.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/esm/formatDuration", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
