package typings.cesium.anon

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: Element | String
  
  var instructionsInitiallyVisible: js.UndefOr[Boolean] = js.undefined
}
object Container {
  
  inline def apply(container: Element | String): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: Element | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setInstructionsInitiallyVisible(value: Boolean): Self = StObject.set(x, "instructionsInitiallyVisible", value.asInstanceOf[js.Any])
    
    inline def setInstructionsInitiallyVisibleUndefined: Self = StObject.set(x, "instructionsInitiallyVisible", js.undefined)
  }
}
