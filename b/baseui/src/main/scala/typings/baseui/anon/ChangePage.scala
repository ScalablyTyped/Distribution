package typings.baseui.anon

import typings.baseui.baseuiStrings.changePage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangePage extends StObject {
  
  val changePage: typings.baseui.baseuiStrings.changePage
}
object ChangePage {
  
  inline def apply(): ChangePage = {
    val __obj = js.Dynamic.literal(changePage = "changePage")
    __obj.asInstanceOf[ChangePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangePage] (val x: Self) extends AnyVal {
    
    inline def setChangePage(value: changePage): Self = StObject.set(x, "changePage", value.asInstanceOf[js.Any])
  }
}
