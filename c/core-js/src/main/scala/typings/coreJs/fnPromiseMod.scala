package typings.coreJs

import org.scalablytyped.runtime.Shortcut
import typings.std.Promise
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnPromiseMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/fn/promise", JSImport.Namespace)
  @js.native
  open class ^[T] protected ()
    extends StObject
       with Promise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used to resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    /* standard es2015.promise */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ]) = this()
  }
  @JSImport("core-js/fn/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PromiseConstructor = js.native
  
  type _To = js.Object & PromiseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fnPromiseMod.foo` */
  override def _to: js.Object & PromiseConstructor = ^
}
