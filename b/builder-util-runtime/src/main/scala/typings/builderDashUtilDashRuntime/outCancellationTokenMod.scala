package typings.builderDashUtilDashRuntime

import typings.builderDashUtilDashRuntime.outCancellationTokenMod.CancellationToken
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/CancellationToken", JSImport.Namespace)
@js.native
object outCancellationTokenMod extends js.Object {
  @js.native
  class CancellationError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class CancellationToken () extends EventEmitter {
    def this(parent: CancellationToken) = this()
    var _cancelled: js.Any = js.native
    var _parent: js.Any = js.native
    val cancelled: Boolean = js.native
    var onCancel: js.Any = js.native
    var parent: CancellationToken = js.native
    var parentCancelHandler: js.Any = js.native
    var removeParentCancelHandler: js.Any = js.native
    def cancel(): Unit = js.native
    def createPromise[R](
      callback: js.Function3[
          /* resolve */ js.Function1[/* thenableOrResult */ js.UndefOr[R], Unit], 
          /* reject */ js.Function1[/* error */ Error, Unit], 
          /* onCancel */ js.Function1[/* callback */ js.Function0[Unit], Unit], 
          Unit
        ]
    ): js.Promise[R] = js.native
    def dispose(): Unit = js.native
  }
  
}

