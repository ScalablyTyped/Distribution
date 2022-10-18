package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combinatorsPsiMod {
  
  @JSImport("crocks/combinators/psi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C]): js.Function1[
    /* g */ js.Function1[/* a */ A, B], 
    js.Function1[/* x */ A, js.Function1[/* y */ A, C]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* g */ js.Function1[/* a */ A, B], 
    js.Function1[/* x */ A, js.Function1[/* y */ A, C]]
  ]]
  inline def default[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C], g: js.Function1[/* a */ A, B]): js.Function1[/* x */ A, js.Function1[/* y */ A, C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, js.Function1[/* y */ A, C]]]
  
  inline def default_ABC_Function2[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C], g: js.Function1[/* a */ A, B]): js.Function2[/* x */ A, /* y */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* x */ A, /* y */ A, C]]
}
