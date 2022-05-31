package typings.babylonjs.mathsIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Constant used to define the minimal number value in Babylon.js
  * @ignorenaming
  */
inline def Epsilon: scala.Double = typings.babylonjs.mathsIndexMod.^.asInstanceOf[js.Dynamic].selectDynamic("Epsilon").asInstanceOf[scala.Double]
inline def Epsilon_=(x: scala.Double): scala.Unit = typings.babylonjs.mathsIndexMod.^.asInstanceOf[js.Dynamic].updateDynamic("Epsilon")(x.asInstanceOf[js.Any])

inline def ToGammaSpace: scala.Double = typings.babylonjs.mathsIndexMod.^.asInstanceOf[js.Dynamic].selectDynamic("ToGammaSpace").asInstanceOf[scala.Double]

inline def ToLinearSpace: /* 2.2 */ scala.Double = typings.babylonjs.mathsIndexMod.^.asInstanceOf[js.Dynamic].selectDynamic("ToLinearSpace").asInstanceOf[/* 2.2 */ scala.Double]

inline def extractMinAndMax(positions: typings.babylonjs.typesMod.FloatArray, start: scala.Double, count: scala.Double): typings.babylonjs.anon.Maximum = (typings.babylonjs.mathsIndexMod.^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMax")(positions.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.anon.Maximum]
inline def extractMinAndMax(
  positions: typings.babylonjs.typesMod.FloatArray,
  start: scala.Double,
  count: scala.Double,
  bias: scala.Unit,
  stride: scala.Double
): typings.babylonjs.anon.Maximum = (typings.babylonjs.mathsIndexMod.^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMax")(positions.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.anon.Maximum]
inline def extractMinAndMax(
  positions: typings.babylonjs.typesMod.FloatArray,
  start: scala.Double,
  count: scala.Double,
  bias: typings.babylonjs.typesMod.Nullable[typings.babylonjs.mathVectorMod.Vector2]
): typings.babylonjs.anon.Maximum = (typings.babylonjs.mathsIndexMod.^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMax")(positions.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.anon.Maximum]
inline def extractMinAndMax(
  positions: typings.babylonjs.typesMod.FloatArray,
  start: scala.Double,
  count: scala.Double,
  bias: typings.babylonjs.typesMod.Nullable[typings.babylonjs.mathVectorMod.Vector2],
  stride: scala.Double
): typings.babylonjs.anon.Maximum = (typings.babylonjs.mathsIndexMod.^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMax")(positions.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.anon.Maximum]

inline def extractMinAndMaxIndexed(
  positions: typings.babylonjs.typesMod.FloatArray,
  indices: typings.babylonjs.typesMod.IndicesArray,
  indexStart: scala.Double,
  indexCount: scala.Double
): typings.babylonjs.anon.Maximum = (typings.babylonjs.mathsIndexMod.^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMaxIndexed")(positions.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.anon.Maximum]
inline def extractMinAndMaxIndexed(
  positions: typings.babylonjs.typesMod.FloatArray,
  indices: typings.babylonjs.typesMod.IndicesArray,
  indexStart: scala.Double,
  indexCount: scala.Double,
  bias: typings.babylonjs.typesMod.Nullable[typings.babylonjs.mathVectorMod.Vector2]
): typings.babylonjs.anon.Maximum = (typings.babylonjs.mathsIndexMod.^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMaxIndexed")(positions.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.anon.Maximum]
