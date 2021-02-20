package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.removeSubTapp()
@js.native
trait RemoveSubTappConfig extends StObject {
  
  var close: Boolean = js.native
  
  var remove: Boolean = js.native
  
  var tappID: Double = js.native
}
object RemoveSubTappConfig {
  
  @scala.inline
  def apply(close: Boolean, remove: Boolean, tappID: Double): RemoveSubTappConfig = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], tappID = tappID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSubTappConfig]
  }
  
  @scala.inline
  implicit class RemoveSubTappConfigMutableBuilder[Self <: RemoveSubTappConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTappID(value: Double): Self = StObject.set(x, "tappID", value.asInstanceOf[js.Any])
  }
}
