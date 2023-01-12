package typings.chartist

import typings.chartist.distCoreTypesMod.SegmentData
import typings.chartist.distSvgMod.SvgPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterpolationStepMod {
  
  @JSImport("chartist/dist/interpolation/step", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def step(): js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("step")().asInstanceOf[js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ]]
  inline def step(options: StepInterpolationOptions): js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("step")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ]]
  
  trait StepInterpolationOptions extends StObject {
    
    var fillHoles: js.UndefOr[Boolean] = js.undefined
    
    var postpone: js.UndefOr[Boolean] = js.undefined
  }
  object StepInterpolationOptions {
    
    inline def apply(): StepInterpolationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepInterpolationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepInterpolationOptions] (val x: Self) extends AnyVal {
      
      inline def setFillHoles(value: Boolean): Self = StObject.set(x, "fillHoles", value.asInstanceOf[js.Any])
      
      inline def setFillHolesUndefined: Self = StObject.set(x, "fillHoles", js.undefined)
      
      inline def setPostpone(value: Boolean): Self = StObject.set(x, "postpone", value.asInstanceOf[js.Any])
      
      inline def setPostponeUndefined: Self = StObject.set(x, "postpone", js.undefined)
    }
  }
}
