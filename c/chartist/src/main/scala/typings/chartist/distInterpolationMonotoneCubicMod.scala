package typings.chartist

import typings.chartist.distCoreTypesMod.SegmentData
import typings.chartist.distSvgMod.SvgPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterpolationMonotoneCubicMod {
  
  @JSImport("chartist/dist/interpolation/monotoneCubic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def monotoneCubic(): js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("monotoneCubic")().asInstanceOf[js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ]]
  inline def monotoneCubic(options: MonotoneCubicInterpolationOptions): js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("monotoneCubic")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ]]
  
  trait MonotoneCubicInterpolationOptions extends StObject {
    
    var fillHoles: js.UndefOr[Boolean] = js.undefined
  }
  object MonotoneCubicInterpolationOptions {
    
    inline def apply(): MonotoneCubicInterpolationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MonotoneCubicInterpolationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MonotoneCubicInterpolationOptions] (val x: Self) extends AnyVal {
      
      inline def setFillHoles(value: Boolean): Self = StObject.set(x, "fillHoles", value.asInstanceOf[js.Any])
      
      inline def setFillHolesUndefined: Self = StObject.set(x, "fillHoles", js.undefined)
    }
  }
}
