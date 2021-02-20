package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationControl3DOptions extends StObject {
  
  var anchor: js.UndefOr[ControlAnchor] = js.native
  
  var offset: js.UndefOr[Size] = js.native
}
object NavigationControl3DOptions {
  
  @scala.inline
  def apply(): NavigationControl3DOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationControl3DOptions]
  }
  
  @scala.inline
  implicit class NavigationControl3DOptionsMutableBuilder[Self <: NavigationControl3DOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: ControlAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
