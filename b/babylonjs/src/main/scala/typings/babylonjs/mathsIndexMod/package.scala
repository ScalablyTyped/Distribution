package typings.babylonjs.mathsIndexMod

import typings.babylonjs.anon.Maximum
import typings.babylonjs.mathsIndexMod.^
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Constant used to define the minimal number value in Babylon.js
  * @ignorenaming
  */
inline def Epsilon: /* 0.001 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("Epsilon").asInstanceOf[/* 0.001 */ Double]

inline def PHI: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PHI").asInstanceOf[Double]

inline def ToGammaSpace: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ToGammaSpace").asInstanceOf[Double]

inline def ToLinearSpace: /* 2.2 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ToLinearSpace").asInstanceOf[/* 2.2 */ Double]

inline def extractMinAndMax(positions: FloatArray, start: Double, count: Double): Maximum = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMax")(positions.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Maximum]
inline def extractMinAndMax(positions: FloatArray, start: Double, count: Double, bias: Unit, stride: Double): Maximum = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMax")(positions.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Maximum]
inline def extractMinAndMax(
  positions: FloatArray,
  start: Double,
  count: Double,
  bias: Nullable[typings.babylonjs.mathsMathDotvectorMod.Vector2]
): Maximum = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMax")(positions.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Maximum]
inline def extractMinAndMax(
  positions: FloatArray,
  start: Double,
  count: Double,
  bias: Nullable[typings.babylonjs.mathsMathDotvectorMod.Vector2],
  stride: Double
): Maximum = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMax")(positions.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Maximum]

inline def extractMinAndMaxIndexed(positions: FloatArray, indices: IndicesArray, indexStart: Double, indexCount: Double): Maximum = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMaxIndexed")(positions.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any])).asInstanceOf[Maximum]
inline def extractMinAndMaxIndexed(
  positions: FloatArray,
  indices: IndicesArray,
  indexStart: Double,
  indexCount: Double,
  bias: Nullable[typings.babylonjs.mathsMathDotvectorMod.Vector2]
): Maximum = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMaxIndexed")(positions.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Maximum]
