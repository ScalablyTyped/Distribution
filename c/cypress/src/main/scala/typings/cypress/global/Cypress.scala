package typings.cypress.global

import org.scalablytyped.runtime.Shortcut
import typings.cypress.CyEventEmitter
import typings.cypress.typesBluebirdMod.Resolvable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Global variable `Cypress` holds common utilities and constants.
  * @see https://on.cypress.io/api
  *
```
Cypress.config("pageLoadTimeout") // => 60000
Cypress.version // => "1.4.0"
Cypress._ // => Lodash _
```
  */
object Cypress extends Shortcut {
  
  @JSGlobal("Cypress")
  @js.native
  val ^ : typings.cypress.Cypress.Cypress & CyEventEmitter = js.native
  
  /**
    * Cypress automatically includes a Buffer library and exposes it as Cypress.Buffer.
    *
    * @see https://on.cypress.io/buffer
    * @see https://github.com/feross/buffer
    * @example
    *    Cypress.Buffer.method()
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Cypress.Buffer")
  @js.native
  open class Buffer protected ()
    extends typings.buffer.mod.Buffer {
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      */
    def this(str: String) = this()
  }
  
  /**
    * Cypress automatically includes Bluebird and exposes it as Cypress.Promise.
    *
    * @see https://on.cypress.io/promise
    * @see https://github.com/petkaantonov/bluebird
    * @example
    *   new Cypress.Promise((resolve, reject) => { ... })
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Cypress.Promise")
  @js.native
  open class Promise[R] protected ()
    extends typings.cypress.typesBluebirdMod.^[R] {
    /**
      * Create a new promise. The passed in function will receive functions
      * `resolve` and `reject` as its arguments which can be called to seal the fate of the created promise.
      *
      * If promise cancellation is enabled, passed in function will receive
      * one more function argument `onCancel` that allows to register an optional cancellation callback.
      */
    def this(callback: js.Function3[
            /* resolve */ js.Function1[
              /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ Any]], 
              Unit
            ], 
            /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
            /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
            Unit
          ]) = this()
  }
  
  type _To = typings.cypress.Cypress.Cypress & CyEventEmitter
  
  /* This means you don't have to write `^`, but can instead just say `Cypress.foo` */
  override def _to: typings.cypress.Cypress.Cypress & CyEventEmitter = ^
}
