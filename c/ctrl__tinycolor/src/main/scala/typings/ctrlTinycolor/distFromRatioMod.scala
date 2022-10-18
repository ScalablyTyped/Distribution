package typings.ctrlTinycolor

import typings.ctrlTinycolor.distMod.TinyColor_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFromRatioMod {
  
  @JSImport("@ctrl/tinycolor/dist/from-ratio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromRatio(ratio: RatioInput): TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRatio")(ratio.asInstanceOf[js.Any]).asInstanceOf[TinyColor_]
  inline def fromRatio(ratio: RatioInput, opts: Any): TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRatio")(ratio.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TinyColor_]
  
  inline def legacyRandom(): TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("legacyRandom")().asInstanceOf[TinyColor_]
  
  trait RatioInput extends StObject {
    
    var a: js.UndefOr[Double | String] = js.undefined
    
    var b: Double | String
    
    var g: Double | String
    
    var r: Double | String
  }
  object RatioInput {
    
    inline def apply(b: Double | String, g: Double | String, r: Double | String): RatioInput = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RatioInput]
    }
    
    extension [Self <: RatioInput](x: Self) {
      
      inline def setA(value: Double | String): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setB(value: Double | String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double | String): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
