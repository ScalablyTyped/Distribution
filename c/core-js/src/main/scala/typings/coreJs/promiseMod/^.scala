package typings.coreJs.promiseMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Promise
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-js/es6/promise", JSImport.Namespace)
@js.native
class ^[T] protected () extends Promise[T] {
  /**
    * Creates a new Promise.
    * @param executor A callback used to initialize the promise. This callback is passed two arguments:
    * a resolve callback used to resolve the promise with a value or the result of another promise,
    * and a reject callback used to reject the promise with a provided reason or error.
    */
  def this(executor: js.Function2[
        /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ]) = this()
}
@JSImport("core-js/es6/promise", JSImport.Namespace)
@js.native
object ^ extends TopLevel[PromiseConstructor]
