package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelOptions extends StObject {
  
  var enableMassClear: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Size] = js.undefined
  
  var position: js.UndefOr[Point] = js.undefined
}
object LabelOptions {
  
  inline def apply(): LabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptions]
  }
  
  extension [Self <: LabelOptions](x: Self) {
    
    inline def setEnableMassClear(value: Boolean): Self = StObject.set(x, "enableMassClear", value.asInstanceOf[js.Any])
    
    inline def setEnableMassClearUndefined: Self = StObject.set(x, "enableMassClear", js.undefined)
    
    inline def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
