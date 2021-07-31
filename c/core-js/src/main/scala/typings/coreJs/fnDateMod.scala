package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.Date` */
object fnDateMod {
  
  @JSImport("core-js/fn/date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def format(date: Date, template: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def format(date: Date, template: java.lang.String, locale: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def formatUTC(date: Date, template: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUTC")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatUTC(date: Date, template: java.lang.String, locale: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUTC")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  @scala.inline
  def toISOString(date: Date): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toISOString")(date.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
