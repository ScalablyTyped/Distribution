package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Confirm extends StObject {
  
  var confirm: Boolean
}
object Confirm {
  
  inline def apply(confirm: Boolean): Confirm = {
    val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confirm]
  }
  
  extension [Self <: Confirm](x: Self) {
    
    inline def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
  }
}
