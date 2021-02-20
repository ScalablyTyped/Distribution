package typings.bootbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootboxLocaleValues extends StObject {
  
  var CANCEL: String = js.native
  
  var CONFIRM: String = js.native
  
  var OK: String = js.native
}
object BootboxLocaleValues {
  
  @scala.inline
  def apply(CANCEL: String, CONFIRM: String, OK: String): BootboxLocaleValues = {
    val __obj = js.Dynamic.literal(CANCEL = CANCEL.asInstanceOf[js.Any], CONFIRM = CONFIRM.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxLocaleValues]
  }
  
  @scala.inline
  implicit class BootboxLocaleValuesMutableBuilder[Self <: BootboxLocaleValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCANCEL(value: String): Self = StObject.set(x, "CANCEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCONFIRM(value: String): Self = StObject.set(x, "CONFIRM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOK(value: String): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
  }
}
