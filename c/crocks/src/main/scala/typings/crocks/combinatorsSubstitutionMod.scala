package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combinatorsSubstitutionMod {
  
  @JSImport("crocks/combinators/substitution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function1[/* g */ js.Function1[/* a */ A, B], js.Function1[/* x */ A, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* g */ js.Function1[/* a */ A, B], js.Function1[/* x */ A, C]]]
  inline def default[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C], g: js.Function1[/* a */ A, B]): js.Function1[/* x */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, C]]
  inline def default[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C], g: js.Function1[/* a */ A, B], x: A): C = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[C]
}
