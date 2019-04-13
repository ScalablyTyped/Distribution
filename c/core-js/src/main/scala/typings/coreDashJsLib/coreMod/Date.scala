package typings
package coreDashJsLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/core", "Date")
@js.native
object Date extends js.Object {
  def format(date: coreDashJsLib.Date, template: java.lang.String): java.lang.String = js.native
  def format(date: coreDashJsLib.Date, template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  def formatUTC(date: coreDashJsLib.Date, template: java.lang.String): java.lang.String = js.native
  def formatUTC(date: coreDashJsLib.Date, template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  def now(): scala.Double = js.native
  def toISOString(date: coreDashJsLib.Date): java.lang.String = js.native
}

