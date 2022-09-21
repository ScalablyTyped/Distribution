package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var component: Unit
  
  var props: Unit
  
  var style: Unit
}
object Component {
  
  inline def apply(component: Unit, props: Unit, style: Unit): Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setComponent(value: Unit): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Unit): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Unit): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
