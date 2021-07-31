package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyListenerOutput extends StObject {
  
  /**
    * Information about the modified listener.
    */
  var Listeners: js.UndefOr[typings.awsSdk.elbv2Mod.Listeners] = js.undefined
}
object ModifyListenerOutput {
  
  @scala.inline
  def apply(): ModifyListenerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyListenerOutput]
  }
  
  @scala.inline
  implicit class ModifyListenerOutputMutableBuilder[Self <: ModifyListenerOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListeners(value: Listeners): Self = StObject.set(x, "Listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersUndefined: Self = StObject.set(x, "Listeners", js.undefined)
    
    @scala.inline
    def setListenersVarargs(value: Listener*): Self = StObject.set(x, "Listeners", js.Array(value :_*))
  }
}
