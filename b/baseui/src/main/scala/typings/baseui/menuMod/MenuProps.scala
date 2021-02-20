package typings.baseui.menuMod

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuProps extends BaseMenuPropsT {
  
  var overrides: js.UndefOr[MenuOverrides] = js.native
  
  var size: js.UndefOr[default_ | compact] = js.native
}
object MenuProps {
  
  @scala.inline
  def apply(): MenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuProps]
  }
  
  @scala.inline
  implicit class MenuPropsMutableBuilder[Self <: MenuProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverrides(value: MenuOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setSize(value: default_ | compact): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
