package typings.baseui.selectMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option
  extends /* key */ StringDictionary[js.Any] {
  
  val __optgroup: js.UndefOr[String] = js.native
  
  val clearableValue: js.UndefOr[Boolean] = js.native
  
  val disabled: js.UndefOr[Boolean] = js.native
  
  val id: js.UndefOr[String | Double] = js.native
  
  val isCreatable: js.UndefOr[Boolean] = js.native
  
  val label: js.UndefOr[ReactNode] = js.native
}
object Option {
  
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearableValue(value: Boolean): Self = StObject.set(x, "clearableValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearableValueUndefined: Self = StObject.set(x, "clearableValue", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsCreatable(value: Boolean): Self = StObject.set(x, "isCreatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCreatableUndefined: Self = StObject.set(x, "isCreatable", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def set__optgroup(value: String): Self = StObject.set(x, "__optgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__optgroupUndefined: Self = StObject.set(x, "__optgroup", js.undefined)
  }
}
