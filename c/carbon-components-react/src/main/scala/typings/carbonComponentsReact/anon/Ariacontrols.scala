package typings.carbonComponentsReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ariacontrols extends StObject {
  
  var `aria-controls`: String
  
  var `aria-expanded`: Boolean
  
  def onClick(): Unit
}
object Ariacontrols {
  
  inline def apply(`aria-controls`: String, `aria-expanded`: Boolean, onClick: () => Unit): Ariacontrols = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick))
    __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ariacontrols]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ariacontrols] (val x: Self) extends AnyVal {
    
    inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
  }
}
