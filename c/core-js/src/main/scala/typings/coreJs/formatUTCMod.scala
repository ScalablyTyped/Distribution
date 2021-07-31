package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatUTCMod {
  
  /* was `typeof core.Date.formatUTC` */
  @scala.inline
  def apply(date: Date, template: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def apply(date: Date, template: java.lang.String, locale: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @JSImport("core-js/fn/date/formatUTC", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
