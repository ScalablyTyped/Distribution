package typings.confirmdialog

import typings.confirmdialog.options.confirmOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * confirm alert
    *  {any} pMessage
    */
  def alert(): js.Any = js.native
  def alert(pMessage: js.UndefOr[scala.Nothing], title: String): js.Any = js.native
  def alert(pMessage: js.Any): js.Any = js.native
  def alert(pMessage: js.Any, title: String): js.Any = js.native
  
  def confirm(pOtions: String): js.Any = js.native
  def confirm(pOtions: String, title: String): js.Any = js.native
  /**
    * confirm Dialog
    *  {confirmOptions} pOtions
    */
  def confirm(pOtions: confirmOptions): js.Any = js.native
  def confirm(pOtions: confirmOptions, title: String): js.Any = js.native
  
  /**
    * confirm Dialog
    *  {any} pMessage
    */
  def dialog(pOtions: confirmOptions): js.Any = js.native
}
