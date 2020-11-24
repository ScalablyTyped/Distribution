package typings.coreJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #############################################################################################
// Date formatting - https://github.com/zloirock/core-js/#date-formatting
// Modules: core.date
// #############################################################################################
@js.native
trait Date extends js.Object {
  
  /**
    * Non-standard.
    */
  def format(template: java.lang.String): java.lang.String = js.native
  def format(template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  
  /**
    * Non-standard.
    */
  def formatUTC(template: java.lang.String): java.lang.String = js.native
  def formatUTC(template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
}
