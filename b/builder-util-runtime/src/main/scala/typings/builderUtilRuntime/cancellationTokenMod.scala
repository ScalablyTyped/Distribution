package typings.builderUtilRuntime

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cancellationTokenMod {
  
  @JSImport("builder-util-runtime/out/CancellationToken", "CancellationError")
  @js.native
  class CancellationError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("builder-util-runtime/out/CancellationToken", "CancellationToken")
  @js.native
  class CancellationToken () extends EventEmitter {
    def this(parent: CancellationToken) = this()
    
    /* private */ var _cancelled: js.Any = js.native
    
    /* private */ var _parent: js.Any = js.native
    
    def cancel(): Unit = js.native
    
    def cancelled: Boolean = js.native
    
    def createPromise[R](
      callback: js.Function3[
          /* resolve */ js.Function1[/* thenableOrResult */ js.UndefOr[R], Unit], 
          /* reject */ js.Function1[/* error */ Error, Unit], 
          /* onCancel */ js.Function1[/* callback */ js.Function0[Unit], Unit], 
          Unit
        ]
    ): js.Promise[R] = js.native
    
    def dispose(): Unit = js.native
    
    /* private */ var onCancel: js.Any = js.native
    
    /* private */ var parentCancelHandler: js.Any = js.native
    
    def parent_=(value: CancellationToken): Unit = js.native
    
    /* private */ var removeParentCancelHandler: js.Any = js.native
  }
}
