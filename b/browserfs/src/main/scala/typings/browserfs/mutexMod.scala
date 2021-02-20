package typings.browserfs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mutexMod {
  
  @JSImport("browserfs/dist/node/generic/mutex", JSImport.Default)
  @js.native
  class default () extends Mutex
  
  @js.native
  trait Mutex extends StObject {
    
    var _locked: js.Any = js.native
    
    var _waiters: js.Any = js.native
    
    def isLocked(): Boolean = js.native
    
    def lock(cb: js.Function): Unit = js.native
    
    def tryLock(): Boolean = js.native
    
    def unlock(): Unit = js.native
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
    
    @scala.inline
    implicit class MutexMutableBuilder[Self <: Mutex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsLocked(value: () => Boolean): Self = StObject.set(x, "isLocked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLock(value: js.Function => Unit): Self = StObject.set(x, "lock", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTryLock(value: () => Boolean): Self = StObject.set(x, "tryLock", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnlock(value: () => Unit): Self = StObject.set(x, "unlock", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_locked(value: js.Any): Self = StObject.set(x, "_locked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_waiters(value: js.Any): Self = StObject.set(x, "_waiters", value.asInstanceOf[js.Any])
    }
  }
}
