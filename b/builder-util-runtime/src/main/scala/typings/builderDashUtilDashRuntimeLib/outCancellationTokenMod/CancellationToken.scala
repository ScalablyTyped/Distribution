package typings
package builderDashUtilDashRuntimeLib.outCancellationTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/CancellationToken", "CancellationToken")
@js.native
class CancellationToken ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(parent: CancellationToken) = this()
  var _cancelled: js.Any = js.native
  var _parent: js.Any = js.native
  val cancelled: scala.Boolean = js.native
  var onCancel: js.Any = js.native
  var parent: CancellationToken = js.native
  var parentCancelHandler: js.Any = js.native
  var removeParentCancelHandler: js.Any = js.native
  def cancel(): scala.Unit = js.native
  def createPromise[R](
    callback: js.Function3[
      /* resolve */ js.Function1[/* thenableOrResult */ js.UndefOr[R], scala.Unit], 
      /* reject */ js.Function1[/* error */ nodeLib.Error, scala.Unit], 
      /* onCancel */ js.Function1[/* callback */ js.Function0[scala.Unit], scala.Unit], 
      scala.Unit
    ]
  ): stdLib.Promise[R] = js.native
  def dispose(): scala.Unit = js.native
}

