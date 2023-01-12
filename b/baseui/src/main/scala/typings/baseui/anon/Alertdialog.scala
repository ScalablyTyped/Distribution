package typings.baseui.anon

import typings.baseui.baseuiStrings.alertdialog
import typings.baseui.baseuiStrings.dialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alertdialog extends StObject {
  
  val alertdialog: typings.baseui.baseuiStrings.alertdialog
  
  val dialog: typings.baseui.baseuiStrings.dialog
}
object Alertdialog {
  
  inline def apply(): Alertdialog = {
    val __obj = js.Dynamic.literal(alertdialog = "alertdialog", dialog = "dialog")
    __obj.asInstanceOf[Alertdialog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alertdialog] (val x: Self) extends AnyVal {
    
    inline def setAlertdialog(value: alertdialog): Self = StObject.set(x, "alertdialog", value.asInstanceOf[js.Any])
    
    inline def setDialog(value: dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
  }
}
