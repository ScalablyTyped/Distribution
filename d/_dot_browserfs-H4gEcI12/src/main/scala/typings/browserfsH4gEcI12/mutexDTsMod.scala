package typings.browserfsH4gEcI12

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mutexDTsMod {
  
  @JSImport(".browserfs-H4gEcI12/dist/node/generic/mutex.d.ts", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Mutex {
    
    /* private */ /* CompleteClass */
    var _locked: Any = js.native
    
    /* private */ /* CompleteClass */
    var _waiters: Any = js.native
    
    /* CompleteClass */
    override def isLocked(): Boolean = js.native
    
    /* CompleteClass */
    override def lock(cb: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def tryLock(): Boolean = js.native
    
    /* CompleteClass */
    override def unlock(): Unit = js.native
  }
  
  trait Mutex extends StObject {
    
    /* private */ var _locked: Any
    
    /* private */ var _waiters: Any
    
    def isLocked(): Boolean
    
    def lock(cb: js.Function): Unit
    
    def tryLock(): Boolean
    
    def unlock(): Unit
  }
  object Mutex {
    
    inline def apply(
      _locked: Any,
      _waiters: Any,
      isLocked: () => Boolean,
      lock: js.Function => Unit,
      tryLock: () => Boolean,
      unlock: () => Unit
    ): Mutex = {
      val __obj = js.Dynamic.literal(_locked = _locked.asInstanceOf[js.Any], _waiters = _waiters.asInstanceOf[js.Any], isLocked = js.Any.fromFunction0(isLocked), lock = js.Any.fromFunction1(lock), tryLock = js.Any.fromFunction0(tryLock), unlock = js.Any.fromFunction0(unlock))
      __obj.asInstanceOf[Mutex]
    }
    
    extension [Self <: Mutex](x: Self) {
      
      inline def setIsLocked(value: () => Boolean): Self = StObject.set(x, "isLocked", js.Any.fromFunction0(value))
      
      inline def setLock(value: js.Function => Unit): Self = StObject.set(x, "lock", js.Any.fromFunction1(value))
      
      inline def setTryLock(value: () => Boolean): Self = StObject.set(x, "tryLock", js.Any.fromFunction0(value))
      
      inline def setUnlock(value: () => Unit): Self = StObject.set(x, "unlock", js.Any.fromFunction0(value))
      
      inline def set_locked(value: Any): Self = StObject.set(x, "_locked", value.asInstanceOf[js.Any])
      
      inline def set_waiters(value: Any): Self = StObject.set(x, "_waiters", value.asInstanceOf[js.Any])
    }
  }
}
