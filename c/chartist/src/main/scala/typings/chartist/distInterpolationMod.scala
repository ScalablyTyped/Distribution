package typings.chartist

import typings.chartist.distCoreTypesMod.SegmentData
import typings.chartist.distInterpolationCardinalMod.CardinalInterpolationOptions
import typings.chartist.distInterpolationMonotoneCubicMod.MonotoneCubicInterpolationOptions
import typings.chartist.distInterpolationNoneMod.NoneInterpolationOptions
import typings.chartist.distInterpolationSimpleMod.SimpleInteractionOptions
import typings.chartist.distInterpolationStepMod.StepInterpolationOptions
import typings.chartist.distSvgMod.SvgPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterpolationMod {
  
  @JSImport("chartist/dist/interpolation", JSImport.Namespace)
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
}
