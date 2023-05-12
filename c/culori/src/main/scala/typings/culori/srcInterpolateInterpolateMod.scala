package typings.culori

import typings.culori.srcCommonMod.Color
import typings.culori.srcCommonMod.FindColorByMode
import typings.culori.srcCommonMod.Mode
import typings.culori.srcCommonMod.OverridesObject
import typings.culori.srcMapMod.MapFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcInterpolateInterpolateMod {
  
  @JSImport("culori/src/interpolate/interpolate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpolate[M /* <: Mode */](colors: ColorsParameter): Interpolator[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(colors.asInstanceOf[js.Any]).asInstanceOf[Interpolator[M]]
  inline def interpolate[M /* <: Mode */](colors: ColorsParameter, mode: M): Interpolator[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(colors.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Interpolator[M]]
  inline def interpolate[M /* <: Mode */](colors: ColorsParameter, mode: M, overrides: OverridesParameter[M]): Interpolator[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(colors.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Interpolator[M]]
  inline def interpolate[M /* <: Mode */](colors: ColorsParameter, mode: Unit, overrides: OverridesParameter[M]): Interpolator[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(colors.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Interpolator[M]]
  
  inline def interpolateWith[M /* <: Mode */](premap: MapFn[M], postmap: MapFn[M]): js.Function3[
    /* colors */ ColorsParameter, 
    /* mode */ js.UndefOr[M], 
    /* overrides */ js.UndefOr[OverridesParameter[M]], 
    Interpolator[M]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateWith")(premap.asInstanceOf[js.Any], postmap.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* colors */ ColorsParameter, 
    /* mode */ js.UndefOr[M], 
    /* overrides */ js.UndefOr[OverridesParameter[M]], 
    Interpolator[M]
  ]]
  
  inline def interpolateWithPremultipliedAlpha[M /* <: Mode */](colors: ColorsParameter): Interpolator[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateWithPremultipliedAlpha")(colors.asInstanceOf[js.Any]).asInstanceOf[Interpolator[M]]
  inline def interpolateWithPremultipliedAlpha[M /* <: Mode */](colors: ColorsParameter, mode: M): Interpolator[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateWithPremultipliedAlpha")(colors.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Interpolator[M]]
  inline def interpolateWithPremultipliedAlpha[M /* <: Mode */](colors: ColorsParameter, mode: M, overrides: OverridesParameter[M]): Interpolator[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateWithPremultipliedAlpha")(colors.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Interpolator[M]]
  inline def interpolateWithPremultipliedAlpha[M /* <: Mode */](colors: ColorsParameter, mode: Unit, overrides: OverridesParameter[M]): Interpolator[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateWithPremultipliedAlpha")(colors.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Interpolator[M]]
  
  type ColorPosition = js.Tuple2[Color | String, Double]
  
  type ColorsParameter = js.Array[Color | String | Position | ColorPosition | PositionFn]
  
  type Interpolator[M /* <: Mode */] = js.Function1[/* t */ Double, FindColorByMode[M, Color]]
  
  type OverridesFunction = js.Function1[/* values */ js.Array[Double], Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.culori.srcInterpolateInterpolateMod.OverridesWithFixupFnsForChannels[M]
    - typings.culori.srcInterpolateInterpolateMod.OverridesFunction
    - typings.culori.srcCommonMod.OverridesObject[M]
    - typings.culori.srcInterpolateInterpolateMod.OverridesWithUseFnsForChannels[M]
  */
  type OverridesParameter[M /* <: Mode */] = _OverridesParameter[M] | OverridesFunction | OverridesObject[M]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof culori.culori/src/common.TakeColorChannels<M> ]: {  fixup :(arr : std.Array<number>): std.Array<number> | undefined}}
    }}}
    */
  @js.native
  trait OverridesWithFixupFnsForChannels[M /* <: Mode */]
    extends StObject
       with _OverridesParameter[M]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof culori.culori/src/common.TakeColorChannels<M> ]: {  use :culori.culori/src/interpolate/interpolate.Interpolator<M> | undefined}}
    }}}
    */
  @js.native
  trait OverridesWithUseFnsForChannels[M /* <: Mode */]
    extends StObject
       with _OverridesParameter[M]
  
  type Position = Double
  
  type PositionFn = js.Function1[/* P */ Double, Double]
  
  trait _OverridesParameter[M /* <: Mode */] extends StObject
}
