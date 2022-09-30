package typings.builderUtilRuntime

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cancellationTokenMod {
  
  @JSImport("builder-util-runtime/out/CancellationToken", "CancellationError")
  @js.native
  open class CancellationError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("builder-util-runtime/out/CancellationToken", "CancellationToken")
  @js.native
  open class CancellationToken () extends EventEmitter {
    def this(parent: CancellationToken) = this()
    
    /* private */ var _cancelled: Any = js.native
    
    /* private */ var _parent: Any = js.native
    
    def cancel(): Unit = js.native
    
    def cancelled: Boolean = js.native
    
    def createPromise[R](
      callback: js.Function3[
          /* resolve */ js.Function1[/* thenableOrResult */ R | PromiseLike[R], Unit], 
          /* reject */ js.Function1[/* error */ js.Error, Unit], 
          /* onCancel */ js.Function1[/* callback */ js.Function0[Unit], Unit], 
          Unit
        ]
    ): js.Promise[R] = js.native
    
    def dispose(): Unit = js.native
    
    /* private */ var onCancel: Any = js.native
    
    /* private */ var parentCancelHandler: Any = js.native
    
    def parent_=(value: CancellationToken): Unit = js.native
    
    /* private */ var removeParentCancelHandler: Any = js.native
  }
}
