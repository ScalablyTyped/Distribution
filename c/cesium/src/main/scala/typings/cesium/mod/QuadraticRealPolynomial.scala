package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object QuadraticRealPolynomial {
  
  @JSImport("cesium", "QuadraticRealPolynomial")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def computeDiscriminant(a: Double, b: Double, c: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDiscriminant")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def computeRealRoots(a: Double, b: Double, c: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeRealRoots")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
