package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseLayoutOptions extends LayoutOptions {
  
  var name: String = js.native
  
  // on layoutready event
  var ready: js.UndefOr[LayoutHandler] = js.native
  
  // on layoutstop event
  var stop: js.UndefOr[LayoutHandler] = js.native
}
object BaseLayoutOptions {
  
  @scala.inline
  def apply(name: String): BaseLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayoutOptions]
  }
  
  @scala.inline
  implicit class BaseLayoutOptionsMutableBuilder[Self <: BaseLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: /* e */ LayoutEventObject => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setStop(value: /* e */ LayoutEventObject => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
