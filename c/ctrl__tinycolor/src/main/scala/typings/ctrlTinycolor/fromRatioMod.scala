package typings.ctrlTinycolor

import typings.ctrlTinycolor.distMod.TinyColor_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromRatioMod {
  
  @JSImport("@ctrl/tinycolor/dist/from-ratio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromRatio(ratio: RatioInput): TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRatio")(ratio.asInstanceOf[js.Any]).asInstanceOf[TinyColor_]
  @scala.inline
  def fromRatio(ratio: RatioInput, opts: js.Any): TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRatio")(ratio.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TinyColor_]
  
  @scala.inline
  def legacyRandom(): TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("legacyRandom")().asInstanceOf[TinyColor_]
  
  trait RatioInput extends StObject {
    
    var a: js.UndefOr[Double | String] = js.undefined
    
    var b: Double | String
    
    var g: Double | String
    
    var r: Double | String
  }
  object RatioInput {
    
    @scala.inline
    def apply(b: Double | String, g: Double | String, r: Double | String): RatioInput = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RatioInput]
    }
    
    @scala.inline
    implicit class RatioInputMutableBuilder[Self <: RatioInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double | String): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      @scala.inline
      def setB(value: Double | String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double | String): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
