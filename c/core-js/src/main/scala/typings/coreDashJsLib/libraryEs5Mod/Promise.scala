package typings
package coreDashJsLib.libraryEs5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/es5", "Promise")
@js.native
class Promise[T] protected ()
  extends stdLib.Promise[T] {
  /**
    * Creates a new Promise.
    * @param executor A callback used to initialize the promise. This callback is passed two arguments:
    * a resolve callback used to resolve the promise with a value or the result of another promise,
    * and a reject callback used to reject the promise with a provided reason or error.
    */
  def this(executor: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]) = this()
}

