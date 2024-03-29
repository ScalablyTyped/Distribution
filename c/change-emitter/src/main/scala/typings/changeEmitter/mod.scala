package typings.changeEmitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("change-emitter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createChangeEmitter(): ChangeEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("createChangeEmitter")().asInstanceOf[ChangeEmitter]
  
  inline def createChangeEmitter_T1T2T3T4T5_ChangeEmitterOf5[T1, T2, T3, T4, T5](): ChangeEmitterOf5[T1, T2, T3, T4, T5] = ^.asInstanceOf[js.Dynamic].applyDynamic("createChangeEmitter")().asInstanceOf[ChangeEmitterOf5[T1, T2, T3, T4, T5]]
  
  inline def createChangeEmitter_T1T2T3T4_ChangeEmitterOf4[T1, T2, T3, T4](): ChangeEmitterOf4[T1, T2, T3, T4] = ^.asInstanceOf[js.Dynamic].applyDynamic("createChangeEmitter")().asInstanceOf[ChangeEmitterOf4[T1, T2, T3, T4]]
  
  inline def createChangeEmitter_T1T2T3_ChangeEmitterOf3[T1, T2, T3](): ChangeEmitterOf3[T1, T2, T3] = ^.asInstanceOf[js.Dynamic].applyDynamic("createChangeEmitter")().asInstanceOf[ChangeEmitterOf3[T1, T2, T3]]
  
  inline def createChangeEmitter_T1T2_ChangeEmitterOf2[T1, T2](): ChangeEmitterOf2[T1, T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("createChangeEmitter")().asInstanceOf[ChangeEmitterOf2[T1, T2]]
  
  inline def createChangeEmitter_T_ChangeEmitterOf1[T](): ChangeEmitterOf1[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createChangeEmitter")().asInstanceOf[ChangeEmitterOf1[T]]
  
  trait ChangeEmitter extends StObject {
    
    def emit(args: Any*): Unit
    
    def listen(listener: Listener): Unlisten
  }
  object ChangeEmitter {
    
    inline def apply(emit: /* repeated */ Any => Unit, listen: Listener => Unlisten): ChangeEmitter = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), listen = js.Any.fromFunction1(listen))
      __obj.asInstanceOf[ChangeEmitter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEmitter] (val x: Self) extends AnyVal {
      
      inline def setEmit(value: /* repeated */ Any => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      inline def setListen(value: Listener => Unlisten): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
    }
  }
  
  trait ChangeEmitterOf0 extends StObject {
    
    def emit(): Unit
    
    def listen(listener: ListenerOf0): Unlisten
  }
  object ChangeEmitterOf0 {
    
    inline def apply(emit: () => Unit, listen: ListenerOf0 => Unlisten): ChangeEmitterOf0 = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction0(emit), listen = js.Any.fromFunction1(listen))
      __obj.asInstanceOf[ChangeEmitterOf0]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEmitterOf0] (val x: Self) extends AnyVal {
      
      inline def setEmit(value: () => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction0(value))
      
      inline def setListen(value: ListenerOf0 => Unlisten): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
    }
  }
  
  trait ChangeEmitterOf1[T] extends StObject {
    
    def emit(value: T): Unit
    
    def listen(listener: ListenerOf1[T]): Unlisten
  }
  object ChangeEmitterOf1 {
    
    inline def apply[T](emit: T => Unit, listen: ListenerOf1[T] => Unlisten): ChangeEmitterOf1[T] = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), listen = js.Any.fromFunction1(listen))
      __obj.asInstanceOf[ChangeEmitterOf1[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEmitterOf1[?], T] (val x: Self & ChangeEmitterOf1[T]) extends AnyVal {
      
      inline def setEmit(value: T => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      inline def setListen(value: ListenerOf1[T] => Unlisten): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
    }
  }
  
  trait ChangeEmitterOf2[T1, T2] extends StObject {
    
    def emit(value1: T1, value2: T2): Unit
    
    def listen(listener: ListenerOf2[T1, T2]): Unlisten
  }
  object ChangeEmitterOf2 {
    
    inline def apply[T1, T2](emit: (T1, T2) => Unit, listen: ListenerOf2[T1, T2] => Unlisten): ChangeEmitterOf2[T1, T2] = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), listen = js.Any.fromFunction1(listen))
      __obj.asInstanceOf[ChangeEmitterOf2[T1, T2]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEmitterOf2[?, ?], T1, T2] (val x: Self & (ChangeEmitterOf2[T1, T2])) extends AnyVal {
      
      inline def setEmit(value: (T1, T2) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setListen(value: ListenerOf2[T1, T2] => Unlisten): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
    }
  }
  
  trait ChangeEmitterOf3[T1, T2, T3] extends StObject {
    
    def emit(value1: T1, value2: T2, value3: T3): Unit
    
    def listen(listener: ListenerOf3[T1, T2, T3]): Unlisten
  }
  object ChangeEmitterOf3 {
    
    inline def apply[T1, T2, T3](emit: (T1, T2, T3) => Unit, listen: ListenerOf3[T1, T2, T3] => Unlisten): ChangeEmitterOf3[T1, T2, T3] = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction3(emit), listen = js.Any.fromFunction1(listen))
      __obj.asInstanceOf[ChangeEmitterOf3[T1, T2, T3]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEmitterOf3[?, ?, ?], T1, T2, T3] (val x: Self & (ChangeEmitterOf3[T1, T2, T3])) extends AnyVal {
      
      inline def setEmit(value: (T1, T2, T3) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction3(value))
      
      inline def setListen(value: ListenerOf3[T1, T2, T3] => Unlisten): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
    }
  }
  
  trait ChangeEmitterOf4[T1, T2, T3, T4] extends StObject {
    
    def emit(value1: T1, value2: T2, value3: T3, value4: T4): Unit
    
    def listen(listener: ListenerOf4[T1, T2, T3, T4]): Unlisten
  }
  object ChangeEmitterOf4 {
    
    inline def apply[T1, T2, T3, T4](emit: (T1, T2, T3, T4) => Unit, listen: ListenerOf4[T1, T2, T3, T4] => Unlisten): ChangeEmitterOf4[T1, T2, T3, T4] = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction4(emit), listen = js.Any.fromFunction1(listen))
      __obj.asInstanceOf[ChangeEmitterOf4[T1, T2, T3, T4]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEmitterOf4[?, ?, ?, ?], T1, T2, T3, T4] (val x: Self & (ChangeEmitterOf4[T1, T2, T3, T4])) extends AnyVal {
      
      inline def setEmit(value: (T1, T2, T3, T4) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction4(value))
      
      inline def setListen(value: ListenerOf4[T1, T2, T3, T4] => Unlisten): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
    }
  }
  
  trait ChangeEmitterOf5[T1, T2, T3, T4, T5] extends StObject {
    
    def emit(value1: T1, value2: T2, value3: T3, value4: T4, value5: T5): Unit
    
    def listen(listener: ListenerOf5[T1, T2, T3, T4, T5]): Unlisten
  }
  object ChangeEmitterOf5 {
    
    inline def apply[T1, T2, T3, T4, T5](emit: (T1, T2, T3, T4, T5) => Unit, listen: ListenerOf5[T1, T2, T3, T4, T5] => Unlisten): ChangeEmitterOf5[T1, T2, T3, T4, T5] = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction5(emit), listen = js.Any.fromFunction1(listen))
      __obj.asInstanceOf[ChangeEmitterOf5[T1, T2, T3, T4, T5]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEmitterOf5[?, ?, ?, ?, ?], T1, T2, T3, T4, T5] (val x: Self & (ChangeEmitterOf5[T1, T2, T3, T4, T5])) extends AnyVal {
      
      inline def setEmit(value: (T1, T2, T3, T4, T5) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction5(value))
      
      inline def setListen(value: ListenerOf5[T1, T2, T3, T4, T5] => Unlisten): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Listener extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  type ListenerOf0 = js.Function0[Unit]
  
  type ListenerOf1[T] = js.Function1[/* value */ T, Unit]
  
  type ListenerOf2[T1, T2] = js.Function2[/* value1 */ T1, /* value2 */ T2, Unit]
  
  type ListenerOf3[T1, T2, T3] = js.Function3[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, Unit]
  
  type ListenerOf4[T1, T2, T3, T4] = js.Function4[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, /* value4 */ T4, Unit]
  
  type ListenerOf5[T1, T2, T3, T4, T5] = js.Function5[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, /* value4 */ T4, /* value5 */ T5, Unit]
  
  type Unlisten = js.Function0[Unit]
}
