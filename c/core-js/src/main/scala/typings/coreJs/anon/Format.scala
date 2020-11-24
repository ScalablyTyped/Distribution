package typings.coreJs.anon

import typings.coreJs.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format extends js.Object {
  
  def format(date: Date, template: String): String = js.native
  def format(date: Date, template: String, locale: String): String = js.native
  
  def formatUTC(date: Date, template: String): String = js.native
  def formatUTC(date: Date, template: String, locale: String): String = js.native
  
  def now(): Double = js.native
  
  def toISOString(date: Date): String = js.native
}
