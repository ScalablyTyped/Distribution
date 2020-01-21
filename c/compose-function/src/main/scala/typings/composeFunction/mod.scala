package typings.composeFunction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("compose-function", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // Minimal typing for more than 4 parameters
  def apply[Result](f1: js.Function1[/* a */ js.Any, Result], functions: js.Function*): js.Function1[/* a */ js.Any, Result] = js.native
  def apply[A, B, C](f1: js.Function1[/* b */ B, C], f2: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, C] = js.native
  def apply[A, B, C, D](f1: js.Function1[/* b */ C, D], f2: js.Function1[/* a */ B, C], f3: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, D] = js.native
  def apply[A, B, C, D, E](
    f1: js.Function1[/* b */ D, E],
    f2: js.Function1[/* a */ C, D],
    f3: js.Function1[/* a */ B, C],
    f4: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, E] = js.native
}

