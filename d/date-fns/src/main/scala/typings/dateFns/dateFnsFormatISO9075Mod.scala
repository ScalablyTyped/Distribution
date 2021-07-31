package typings.dateFns

import typings.dateFns.anon.Representation
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsFormatISO9075Mod {
  
  object default {
    
    @scala.inline
    def apply(date: Double): String = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def apply(date: Double, options: Representation): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: Date): String = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def apply(date: Date, options: Representation): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/formatISO9075", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
