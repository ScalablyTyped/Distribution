package typings.baseui.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictx
  extends StObject
     with /* x */ StringDictionary[Any] {
  
  var __optgroup: js.UndefOr[String] = js.undefined
  
  var clearableValue: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var isCreatable: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[ReactNode] = js.undefined
}
object Dictx {
  
  inline def apply(): Dictx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictx]
  }
  
  extension [Self <: Dictx](x: Self) {
    
    inline def setClearableValue(value: Boolean): Self = StObject.set(x, "clearableValue", value.asInstanceOf[js.Any])
    
    inline def setClearableValueUndefined: Self = StObject.set(x, "clearableValue", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsCreatable(value: Boolean): Self = StObject.set(x, "isCreatable", value.asInstanceOf[js.Any])
    
    inline def setIsCreatableUndefined: Self = StObject.set(x, "isCreatable", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def set__optgroup(value: String): Self = StObject.set(x, "__optgroup", value.asInstanceOf[js.Any])
    
    inline def set__optgroupUndefined: Self = StObject.set(x, "__optgroup", js.undefined)
  }
}
