package typings.dateFns

import typings.dateFns.anon.Unit
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatDistanceToNowStrictIndexMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double): String = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def apply(date: Double, options: Unit): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: Date): String = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def apply(date: Date, options: Unit): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/esm/formatDistanceToNowStrict/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
