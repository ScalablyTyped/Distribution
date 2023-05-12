package typings.culori

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcInterpolateLinearMod {
  
  @JSImport("culori/src/interpolate/linear", "interpolatorLinear")
  @js.native
  val interpolatorLinear: ReturnType[
    js.Function1[
      /* interpolator */ js.Function3[/* a */ Double, /* b */ Double, /* t */ Double, Double], 
      js.Function1[/* arr */ js.Array[Double], js.Function1[/* t */ Double, Double]]
    ]
  ] = js.native
}
