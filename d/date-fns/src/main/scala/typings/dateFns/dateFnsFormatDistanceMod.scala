package typings.dateFns

import typings.dateFns.anon.AddSuffix
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsFormatDistanceMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: Double, baseDate: Double, options: AddSuffix): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: Double, baseDate: Date): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: Double, baseDate: Date, options: AddSuffix): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: Date, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: Date, baseDate: Double, options: AddSuffix): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: Date, baseDate: Date): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: Date, baseDate: Date, options: AddSuffix): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/formatDistance", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
