package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugBillboards extends StObject {
  
  var debugBillboards: js.UndefOr[Boolean] = js.undefined
  
  var debugEllipsoids: js.UndefOr[Boolean] = js.undefined
  
  var noiseDetail: js.UndefOr[Double] = js.undefined
  
  var noiseOffset: js.UndefOr[Double] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
}
object DebugBillboards {
  
  inline def apply(): DebugBillboards = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugBillboards]
  }
  
  extension [Self <: DebugBillboards](x: Self) {
    
    inline def setDebugBillboards(value: Boolean): Self = StObject.set(x, "debugBillboards", value.asInstanceOf[js.Any])
    
    inline def setDebugBillboardsUndefined: Self = StObject.set(x, "debugBillboards", js.undefined)
    
    inline def setDebugEllipsoids(value: Boolean): Self = StObject.set(x, "debugEllipsoids", value.asInstanceOf[js.Any])
    
    inline def setDebugEllipsoidsUndefined: Self = StObject.set(x, "debugEllipsoids", js.undefined)
    
    inline def setNoiseDetail(value: Double): Self = StObject.set(x, "noiseDetail", value.asInstanceOf[js.Any])
    
    inline def setNoiseDetailUndefined: Self = StObject.set(x, "noiseDetail", js.undefined)
    
    inline def setNoiseOffset(value: Double): Self = StObject.set(x, "noiseOffset", value.asInstanceOf[js.Any])
    
    inline def setNoiseOffsetUndefined: Self = StObject.set(x, "noiseOffset", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
