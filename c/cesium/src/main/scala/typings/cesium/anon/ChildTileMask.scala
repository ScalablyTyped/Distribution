package typings.cesium.anon

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildTileMask extends StObject {
  
  var buffer: ArrayBuffer = js.native
  
  var childTileMask: js.UndefOr[Double] = js.native
  
  var createdByUpsampling: js.UndefOr[Boolean] = js.native
  
  var credits: js.UndefOr[js.Array[typings.cesium.mod.Credit]] = js.native
  
  var negativeAltitudeExponentBias: Double = js.native
  
  var negativeElevationThreshold: Double = js.native
}
object ChildTileMask {
  
  @scala.inline
  def apply(buffer: ArrayBuffer, negativeAltitudeExponentBias: Double, negativeElevationThreshold: Double): ChildTileMask = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], negativeAltitudeExponentBias = negativeAltitudeExponentBias.asInstanceOf[js.Any], negativeElevationThreshold = negativeElevationThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildTileMask]
  }
  
  @scala.inline
  implicit class ChildTileMaskMutableBuilder[Self <: ChildTileMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildTileMask(value: Double): Self = StObject.set(x, "childTileMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildTileMaskUndefined: Self = StObject.set(x, "childTileMask", js.undefined)
    
    @scala.inline
    def setCreatedByUpsampling(value: Boolean): Self = StObject.set(x, "createdByUpsampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUpsamplingUndefined: Self = StObject.set(x, "createdByUpsampling", js.undefined)
    
    @scala.inline
    def setCredits(value: js.Array[typings.cesium.mod.Credit]): Self = StObject.set(x, "credits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditsUndefined: Self = StObject.set(x, "credits", js.undefined)
    
    @scala.inline
    def setCreditsVarargs(value: typings.cesium.mod.Credit*): Self = StObject.set(x, "credits", js.Array(value :_*))
    
    @scala.inline
    def setNegativeAltitudeExponentBias(value: Double): Self = StObject.set(x, "negativeAltitudeExponentBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeElevationThreshold(value: Double): Self = StObject.set(x, "negativeElevationThreshold", value.asInstanceOf[js.Any])
  }
}
