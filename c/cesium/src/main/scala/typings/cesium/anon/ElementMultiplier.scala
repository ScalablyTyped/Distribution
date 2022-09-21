package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementMultiplier extends StObject {
  
  var elementMultiplier: js.UndefOr[Double] = js.undefined
  
  var elementsPerHeight: js.UndefOr[Double] = js.undefined
  
  var heightOffset: js.UndefOr[Double] = js.undefined
  
  var heightScale: js.UndefOr[Double] = js.undefined
  
  var highestEncodedHeight: js.UndefOr[Double] = js.undefined
  
  var isBigEndian: js.UndefOr[Boolean] = js.undefined
  
  var lowestEncodedHeight: js.UndefOr[Double] = js.undefined
  
  var stride: js.UndefOr[Double] = js.undefined
}
object ElementMultiplier {
  
  inline def apply(): ElementMultiplier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementMultiplier]
  }
  
  extension [Self <: ElementMultiplier](x: Self) {
    
    inline def setElementMultiplier(value: Double): Self = StObject.set(x, "elementMultiplier", value.asInstanceOf[js.Any])
    
    inline def setElementMultiplierUndefined: Self = StObject.set(x, "elementMultiplier", js.undefined)
    
    inline def setElementsPerHeight(value: Double): Self = StObject.set(x, "elementsPerHeight", value.asInstanceOf[js.Any])
    
    inline def setElementsPerHeightUndefined: Self = StObject.set(x, "elementsPerHeight", js.undefined)
    
    inline def setHeightOffset(value: Double): Self = StObject.set(x, "heightOffset", value.asInstanceOf[js.Any])
    
    inline def setHeightOffsetUndefined: Self = StObject.set(x, "heightOffset", js.undefined)
    
    inline def setHeightScale(value: Double): Self = StObject.set(x, "heightScale", value.asInstanceOf[js.Any])
    
    inline def setHeightScaleUndefined: Self = StObject.set(x, "heightScale", js.undefined)
    
    inline def setHighestEncodedHeight(value: Double): Self = StObject.set(x, "highestEncodedHeight", value.asInstanceOf[js.Any])
    
    inline def setHighestEncodedHeightUndefined: Self = StObject.set(x, "highestEncodedHeight", js.undefined)
    
    inline def setIsBigEndian(value: Boolean): Self = StObject.set(x, "isBigEndian", value.asInstanceOf[js.Any])
    
    inline def setIsBigEndianUndefined: Self = StObject.set(x, "isBigEndian", js.undefined)
    
    inline def setLowestEncodedHeight(value: Double): Self = StObject.set(x, "lowestEncodedHeight", value.asInstanceOf[js.Any])
    
    inline def setLowestEncodedHeightUndefined: Self = StObject.set(x, "lowestEncodedHeight", js.undefined)
    
    inline def setStride(value: Double): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
    
    inline def setStrideUndefined: Self = StObject.set(x, "stride", js.undefined)
  }
}
