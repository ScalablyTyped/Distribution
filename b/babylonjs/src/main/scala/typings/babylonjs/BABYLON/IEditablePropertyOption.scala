package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Rebuild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditablePropertyOption extends StObject {
  
  /** max value */
  var max: js.UndefOr[Double] = js.native
  
  /** min value */
  var min: js.UndefOr[Double] = js.native
  
  /** notifiers: indicates which actions to take when the property is changed */
  var notifiers: js.UndefOr[Rebuild] = js.native
  
  /** list of the options for a variable of type list */
  var options: js.UndefOr[js.Array[IEditablePropertyListOption]] = js.native
}
object IEditablePropertyOption {
  
  @scala.inline
  def apply(): IEditablePropertyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditablePropertyOption]
  }
  
  @scala.inline
  implicit class IEditablePropertyOptionMutableBuilder[Self <: IEditablePropertyOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setNotifiers(value: Rebuild): Self = StObject.set(x, "notifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifiersUndefined: Self = StObject.set(x, "notifiers", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[IEditablePropertyListOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: IEditablePropertyListOption*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
