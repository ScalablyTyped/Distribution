package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelOptions extends StObject {
  
  var enableMassClear: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Size] = js.native
  
  var position: js.UndefOr[Point] = js.native
}
object LabelOptions {
  
  @scala.inline
  def apply(): LabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptions]
  }
  
  @scala.inline
  implicit class LabelOptionsMutableBuilder[Self <: LabelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableMassClear(value: Boolean): Self = StObject.set(x, "enableMassClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMassClearUndefined: Self = StObject.set(x, "enableMassClear", js.undefined)
    
    @scala.inline
    def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
