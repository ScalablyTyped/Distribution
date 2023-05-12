package typings.culori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcInterpolatePiecewiseMod {
  
  @JSImport("culori/src/interpolate/piecewise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpolatorPiecewise(interpolator: js.Function3[/* a */ Double, /* b */ Double, /* t */ Double, Double]): js.Function1[/* arr */ js.Array[Double], js.Function1[/* t */ Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolatorPiecewise")(interpolator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arr */ js.Array[Double], js.Function1[/* t */ Double, Double]]]
}
