package typings.browserfs.mutexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mutex extends js.Object {
  var _locked: js.Any
  var _waiters: js.Any
  def isLocked(): Boolean
  def lock(cb: js.Function): Unit
  def tryLock(): Boolean
  def unlock(): Unit
}

object Mutex {
  @scala.inline
  def apply(
    _locked: js.Any,
    _waiters: js.Any,
    isLocked: () => Boolean,
    lock: js.Function => Unit,
    tryLock: () => Boolean,
    unlock: () => Unit
  ): Mutex = {
    val __obj = js.Dynamic.literal(_locked = _locked.asInstanceOf[js.Any], _waiters = _waiters.asInstanceOf[js.Any], isLocked = js.Any.fromFunction0(isLocked), lock = js.Any.fromFunction1(lock), tryLock = js.Any.fromFunction0(tryLock), unlock = js.Any.fromFunction0(unlock))
  
    __obj.asInstanceOf[Mutex]
  }
}

