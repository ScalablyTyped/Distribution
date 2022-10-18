package typings.chartist

import typings.chartist.distCoreTypesMod.SegmentData
import typings.chartist.distSvgMod.SvgPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterpolationCardinalMod {
  
  @JSImport("chartist/dist/interpolation/cardinal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cardinal(): js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardinal")().asInstanceOf[js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ]]
  inline def cardinal(options: CardinalInterpolationOptions): js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardinal")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ]]
  
  trait CardinalInterpolationOptions extends StObject {
    
    var fillHoles: js.UndefOr[Boolean] = js.undefined
    
    var tension: js.UndefOr[Double] = js.undefined
  }
  object CardinalInterpolationOptions {
    
    inline def apply(): CardinalInterpolationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardinalInterpolationOptions]
    }
    
    extension [Self <: CardinalInterpolationOptions](x: Self) {
      
      inline def setFillHoles(value: Boolean): Self = StObject.set(x, "fillHoles", value.asInstanceOf[js.Any])
      
      inline def setFillHolesUndefined: Self = StObject.set(x, "fillHoles", js.undefined)
      
      inline def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
      
      inline def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    }
  }
}
