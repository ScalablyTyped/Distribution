package typings.chartist

import typings.chartist.coreTypesMod.SegmentData
import typings.chartist.svgMod.SvgPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleMod {
  
  @JSImport("chartist/dist/interpolation/simple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def simple(): js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("simple")().asInstanceOf[js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ]]
  inline def simple(options: SimpleInteractionOptions): js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("simple")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ]]
  
  trait SimpleInteractionOptions extends StObject {
    
    var divisor: js.UndefOr[Double] = js.undefined
    
    var fillHoles: js.UndefOr[Boolean] = js.undefined
  }
  object SimpleInteractionOptions {
    
    inline def apply(): SimpleInteractionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleInteractionOptions]
    }
    
    extension [Self <: SimpleInteractionOptions](x: Self) {
      
      inline def setDivisor(value: Double): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
      
      inline def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
      
      inline def setFillHoles(value: Boolean): Self = StObject.set(x, "fillHoles", value.asInstanceOf[js.Any])
      
      inline def setFillHolesUndefined: Self = StObject.set(x, "fillHoles", js.undefined)
    }
  }
}
