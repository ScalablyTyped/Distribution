package typings.culori

import typings.culori.srcCommonMod.Color
import typings.culori.srcDifferenceMod.DiffFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNearestMod {
  
  @JSImport("culori/src/nearest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](colors: js.Array[T], metric: DiffFn): js.Function3[
    /* color */ Color | String, 
    /* n */ js.UndefOr[Double], 
    /* τ */ js.UndefOr[PositiveNumber], 
    js.Array[T]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(colors.asInstanceOf[js.Any], metric.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* color */ Color | String, 
    /* n */ js.UndefOr[Double], 
    /* τ */ js.UndefOr[PositiveNumber], 
    js.Array[T]
  ]]
  inline def default[T](colors: js.Array[T], metric: DiffFn, accessor: js.Function1[/* c */ T, Color | String]): js.Function3[
    /* color */ Color | String, 
    /* n */ js.UndefOr[Double], 
    /* τ */ js.UndefOr[PositiveNumber], 
    js.Array[T]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(colors.asInstanceOf[js.Any], metric.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* color */ Color | String, 
    /* n */ js.UndefOr[Double], 
    /* τ */ js.UndefOr[PositiveNumber], 
    js.Array[T]
  ]]
  
  type PositiveNumber = Double
}
