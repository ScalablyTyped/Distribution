package typings.composeFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // Minimal typing for more than 4 parameters
  inline def apply[Result](f1: js.Function1[/* a */ js.Any, Result], functions: js.Function*): js.Function1[/* a */ js.Any, Result] = (^.asInstanceOf[js.Dynamic].apply(f1.asInstanceOf[js.Any], functions.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ js.Any, Result]]
  inline def apply[A, B, C](f1: js.Function1[/* b */ B, C], f2: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, C] = (^.asInstanceOf[js.Dynamic].apply(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, C]]
  inline def apply[A, B, C, D](f1: js.Function1[/* b */ C, D], f2: js.Function1[/* a */ B, C], f3: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, D] = (^.asInstanceOf[js.Dynamic].apply(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, D]]
  inline def apply[A, B, C, D, E](
    f1: js.Function1[/* b */ D, E],
    f2: js.Function1[/* a */ C, D],
    f3: js.Function1[/* a */ B, C],
    f4: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, E] = (^.asInstanceOf[js.Dynamic].apply(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any], f4.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, E]]
  
  @JSImport("compose-function", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
