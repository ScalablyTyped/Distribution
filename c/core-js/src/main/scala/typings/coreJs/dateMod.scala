package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.Date` */
object dateMod {
  
  @JSImport("core-js/core/date", "format")
  @js.native
  def format(date: Date, template: java.lang.String): java.lang.String = js.native
  @JSImport("core-js/core/date", "format")
  @js.native
  def format(date: Date, template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  
  @JSImport("core-js/core/date", "formatUTC")
  @js.native
  def formatUTC(date: Date, template: java.lang.String): java.lang.String = js.native
  @JSImport("core-js/core/date", "formatUTC")
  @js.native
  def formatUTC(date: Date, template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  
  @JSImport("core-js/core/date", "now")
  @js.native
  def now(): Double = js.native
  
  @JSImport("core-js/core/date", "toISOString")
  @js.native
  def toISOString(date: Date): java.lang.String = js.native
}
