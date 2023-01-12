package typings.chartist

import typings.chartist.distCoreTypesMod.SegmentData
import typings.chartist.distSvgMod.SvgPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterpolationNoneMod {
  
  @JSImport("chartist/dist/interpolation/none", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def none(): js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("none")().asInstanceOf[js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ]]
  inline def none(options: NoneInterpolationOptions): js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("none")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ]]
  
  trait NoneInterpolationOptions extends StObject {
    
    var fillHoles: js.UndefOr[Boolean] = js.undefined
  }
  object NoneInterpolationOptions {
    
    inline def apply(): NoneInterpolationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoneInterpolationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoneInterpolationOptions] (val x: Self) extends AnyVal {
      
      inline def setFillHoles(value: Boolean): Self = StObject.set(x, "fillHoles", value.asInstanceOf[js.Any])
      
      inline def setFillHolesUndefined: Self = StObject.set(x, "fillHoles", js.undefined)
    }
  }
}
