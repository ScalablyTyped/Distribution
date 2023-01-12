package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInspectableOptions extends StObject {
  
  /**
    * Defines the visible part of the option
    */
  var label: String
  
  /**
    * Defines if the option should be selected or not
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the value part of the option (returned through the callback)
    */
  var value: Double | String
}
object IInspectableOptions {
  
  inline def apply(label: String, value: Double | String): IInspectableOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInspectableOptions] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
