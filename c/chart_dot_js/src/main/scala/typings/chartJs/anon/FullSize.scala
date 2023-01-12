package typings.chartJs.anon

import typings.chartJs.typesLayoutMod.LayoutPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullSize extends StObject {
  
  var fullSize: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[LayoutPosition] = js.undefined
  
  var weight: js.UndefOr[Double] = js.undefined
}
object FullSize {
  
  inline def apply(): FullSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullSize] (val x: Self) extends AnyVal {
    
    inline def setFullSize(value: Double): Self = StObject.set(x, "fullSize", value.asInstanceOf[js.Any])
    
    inline def setFullSizeUndefined: Self = StObject.set(x, "fullSize", js.undefined)
    
    inline def setPosition(value: LayoutPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
