package typings.blueprintjsCore.anon

import typings.blueprintjsCore.blueprintjsCoreStrings.CLOSE_DIALOG
import typings.blueprintjsCore.blueprintjsCoreStrings.OPEN_DIALOG
import typings.blueprintjsCore.libEsmContextHotkeysHotkeysProviderMod.HotkeysAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with HotkeysAction {
  
  var `type`: CLOSE_DIALOG | OPEN_DIALOG
}
object Type {
  
  inline def apply(`type`: CLOSE_DIALOG | OPEN_DIALOG): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    inline def setType(value: CLOSE_DIALOG | OPEN_DIALOG): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
