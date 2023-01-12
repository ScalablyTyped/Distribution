package typings.baseui.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{[x: string] : any,   id :string | number | undefined,   label :react.react.ReactNode | undefined,   disabled :boolean | undefined,   clearableValue :boolean | undefined,   isCreatable :boolean | undefined,   __optgroup :string | undefined}> */
trait Readonlyxstringanyidstrin extends StObject {
  
  val __optgroup: js.UndefOr[String] = js.undefined
  
  val clearableValue: js.UndefOr[Boolean] = js.undefined
  
  val disabled: js.UndefOr[Boolean] = js.undefined
  
  val id: js.UndefOr[String | Double] = js.undefined
  
  val isCreatable: js.UndefOr[Boolean] = js.undefined
  
  val label: js.UndefOr[ReactNode] = js.undefined
}
object Readonlyxstringanyidstrin {
  
  inline def apply(): Readonlyxstringanyidstrin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Readonlyxstringanyidstrin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlyxstringanyidstrin] (val x: Self) extends AnyVal {
    
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
