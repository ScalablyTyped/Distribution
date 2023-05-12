package typings.cesium.anon

import typings.cesium.mod.Credit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer extends StObject {
  
  var buffer: js.typedarray.ArrayBuffer
  
  var childTileMask: js.UndefOr[Double] = js.undefined
  
  var createdByUpsampling: js.UndefOr[Boolean] = js.undefined
  
  var credits: js.UndefOr[js.Array[Credit]] = js.undefined
  
  var negativeAltitudeExponentBias: Double
  
  var negativeElevationThreshold: Double
}
object Buffer {
  
  inline def apply(
    buffer: js.typedarray.ArrayBuffer,
    negativeAltitudeExponentBias: Double,
    negativeElevationThreshold: Double
  ): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], negativeAltitudeExponentBias = negativeAltitudeExponentBias.asInstanceOf[js.Any], negativeElevationThreshold = negativeElevationThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setChildTileMask(value: Double): Self = StObject.set(x, "childTileMask", value.asInstanceOf[js.Any])
    
    inline def setChildTileMaskUndefined: Self = StObject.set(x, "childTileMask", js.undefined)
    
    inline def setCreatedByUpsampling(value: Boolean): Self = StObject.set(x, "createdByUpsampling", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUpsamplingUndefined: Self = StObject.set(x, "createdByUpsampling", js.undefined)
    
    inline def setCredits(value: js.Array[Credit]): Self = StObject.set(x, "credits", value.asInstanceOf[js.Any])
    
    inline def setCreditsUndefined: Self = StObject.set(x, "credits", js.undefined)
    
    inline def setCreditsVarargs(value: Credit*): Self = StObject.set(x, "credits", js.Array(value*))
    
    inline def setNegativeAltitudeExponentBias(value: Double): Self = StObject.set(x, "negativeAltitudeExponentBias", value.asInstanceOf[js.Any])
    
    inline def setNegativeElevationThreshold(value: Double): Self = StObject.set(x, "negativeElevationThreshold", value.asInstanceOf[js.Any])
  }
}
