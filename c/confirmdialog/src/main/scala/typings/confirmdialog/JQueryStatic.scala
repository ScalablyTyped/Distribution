package typings.confirmdialog

import typings.confirmdialog.options.confirmOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  /**
    * confirm alert
    *  {any} pMessage
    */
  def alert(): Any = js.native
  def alert(pMessage: Any): Any = js.native
  def alert(pMessage: Any, title: String): Any = js.native
  def alert(pMessage: Unit, title: String): Any = js.native
  
  def confirm(pOtions: String): Any = js.native
  def confirm(pOtions: String, title: String): Any = js.native
  /**
    * confirm Dialog
    *  {confirmOptions} pOtions
    */
  def confirm(pOtions: confirmOptions): Any = js.native
  def confirm(pOtions: confirmOptions, title: String): Any = js.native
  
  def dialog(pOtions: String): Any = js.native
  /**
    * confirm Dialog
    *  {any} pMessage
    */
  def dialog(pOtions: confirmOptions): Any = js.native
}
