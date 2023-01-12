package typings.baseui.anon

import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.secondary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind extends StObject {
  
  var disabled: Boolean
  
  var kind: secondary
  
  def onClick(): Unit
  
  var shape: default_
  
  var size: default_
}
object Kind {
  
  inline def apply(disabled: Boolean, onClick: () => Unit): Kind = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], kind = "secondary", onClick = js.Any.fromFunction0(onClick), shape = "default", size = "default")
    __obj.asInstanceOf[Kind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setKind(value: secondary): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setShape(value: default_): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setSize(value: default_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
