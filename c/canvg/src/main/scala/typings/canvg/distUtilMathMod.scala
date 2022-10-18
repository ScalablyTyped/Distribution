package typings.canvg

import typings.canvg.distTypesMod.VectorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilMathMod {
  
  @JSImport("canvg/dist/util/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CB1(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("CB1")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def CB2(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("CB2")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def CB3(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("CB3")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def CB4(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("CB4")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("canvg/dist/util/math", "PSEUDO_ZERO")
  @js.native
  val PSEUDO_ZERO: /* 1e-8 */ Double = js.native
  
  inline def QB1(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("QB1")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def QB2(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("QB2")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def QB3(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("QB3")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def vectorMagnitude(v: VectorValue): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("vectorMagnitude")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def vectorsAngle(u: VectorValue, v: VectorValue): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("vectorsAngle")(u.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def vectorsRatio(u: VectorValue, v: VectorValue): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("vectorsRatio")(u.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
}
