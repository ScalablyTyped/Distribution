package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.Date` */
object libraryFnDateMod {
  
  @JSImport("core-js/library/fn/date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(date: Date, template: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def format(date: Date, template: java.lang.String, locale: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  inline def formatUTC(date: Date, template: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUTC")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def formatUTC(date: Date, template: java.lang.String, locale: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUTC")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def toISOString(date: Date): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toISOString")(date.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
