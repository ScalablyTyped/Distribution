package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compose2Mod {
  
  @JSImport("crocks/combinators/compose2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A, B, C, D, E](f: js.Function2[/* c */ C, /* d */ D, E]): js.Function1[
    /* d */ js.Function1[/* a */ A, C], 
    js.Function1[
      /* h */ js.Function1[/* b */ B, D], 
      js.Function1[/* x */ A, js.Function1[/* y */ B, E]]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* d */ js.Function1[/* a */ A, C], 
    js.Function1[
      /* h */ js.Function1[/* b */ B, D], 
      js.Function1[/* x */ A, js.Function1[/* y */ B, E]]
    ]
  ]]
  inline def default[A, B, C, D, E](f: js.Function2[/* c */ C, /* d */ D, E], d: js.Function1[/* a */ A, C]): js.Function1[
    /* h */ js.Function1[/* b */ B, D], 
    js.Function1[/* x */ A, js.Function1[/* y */ B, E]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* h */ js.Function1[/* b */ B, D], 
    js.Function1[/* x */ A, js.Function1[/* y */ B, E]]
  ]]
  inline def default[A, B, C, D, E](
    f: js.Function2[/* c */ C, /* d */ D, E],
    d: js.Function1[/* a */ A, C],
    h: js.Function1[/* b */ B, D]
  ): js.Function1[/* x */ A, js.Function1[/* y */ B, E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any], d.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, js.Function1[/* y */ B, E]]]
  
  inline def default_ABCDE_Function2[A, B, C, D, E](
    f: js.Function2[/* c */ C, /* d */ D, E],
    d: js.Function1[/* a */ A, C],
    h: js.Function1[/* b */ B, D]
  ): js.Function2[/* x */ A, /* y */ B, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any], d.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* x */ A, /* y */ B, E]]
}
