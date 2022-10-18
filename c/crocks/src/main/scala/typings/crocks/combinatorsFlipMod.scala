package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combinatorsFlipMod {
  
  @JSImport("crocks/combinators/flip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function1[/* y */ B, js.Function1[/* x */ A, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ B, js.Function1[/* x */ A, C]]]
  
  inline def default_ABC_Function2[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function2[/* y */ B, /* x */ A, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* y */ B, /* x */ A, C]]
}
