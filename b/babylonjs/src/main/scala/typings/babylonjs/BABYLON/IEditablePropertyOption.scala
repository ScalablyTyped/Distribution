package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Rebuild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditablePropertyOption extends StObject {
  
  /** max value */
  var max: js.UndefOr[Double] = js.undefined
  
  /** min value */
  var min: js.UndefOr[Double] = js.undefined
  
  /** notifiers: indicates which actions to take when the property is changed */
  var notifiers: js.UndefOr[Rebuild] = js.undefined
  
  /** list of the options for a variable of type list */
  var options: js.UndefOr[js.Array[IEditablePropertyListOption]] = js.undefined
}
object IEditablePropertyOption {
  
  inline def apply(): IEditablePropertyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditablePropertyOption]
  }
  
  extension [Self <: IEditablePropertyOption](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setNotifiers(value: Rebuild): Self = StObject.set(x, "notifiers", value.asInstanceOf[js.Any])
    
    inline def setNotifiersUndefined: Self = StObject.set(x, "notifiers", js.undefined)
    
    inline def setOptions(value: js.Array[IEditablePropertyListOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: IEditablePropertyListOption*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
