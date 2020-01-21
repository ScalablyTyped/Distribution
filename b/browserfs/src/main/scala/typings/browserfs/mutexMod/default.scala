package typings.browserfs.mutexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/generic/mutex", JSImport.Default)
@js.native
class default () extends Mutex {
  /* CompleteClass */
  override var _locked: js.Any = js.native
  /* CompleteClass */
  override var _waiters: js.Any = js.native
  /* CompleteClass */
  override def isLocked(): Boolean = js.native
  /* CompleteClass */
  override def lock(cb: js.Function): Unit = js.native
  /* CompleteClass */
  override def tryLock(): Boolean = js.native
  /* CompleteClass */
  override def unlock(): Unit = js.native
}

