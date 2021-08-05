package typings.createjsLib

import typings.createjsLib.anon.HandleEvent
import typings.createjsLib.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object createjs {
    
    @JSGlobal("createjs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("createjs.Event")
    @js.native
    class Event protected ()
      extends StObject
         with typings.createjsLib.createjs.Event {
      def this(`type`: String, bubbles: Boolean, cancelable: Boolean) = this()
      
      // properties
      /* CompleteClass */
      var bubbles: Boolean = js.native
      
      /* CompleteClass */
      var cancelable: Boolean = js.native
      
      /* CompleteClass */
      var currentTarget: js.Any = js.native
      
      // other event payloads
      /* CompleteClass */
      var data: js.Any = js.native
      
      // It is 'Object' type officially, but 'any' is easier to use.
      /* CompleteClass */
      var defaultPrevented: Boolean = js.native
      
      /* CompleteClass */
      var delta: Double = js.native
      
      /* CompleteClass */
      var error: String = js.native
      
      /* CompleteClass */
      var eventPhase: Double = js.native
      
      /* CompleteClass */
      var id: String = js.native
      
      /* CompleteClass */
      var immediatePropagationStopped: Boolean = js.native
      
      /* CompleteClass */
      var item: js.Any = js.native
      
      /* CompleteClass */
      var loaded: Double = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      var next: String = js.native
      
      /* CompleteClass */
      var params: js.Any = js.native
      
      /* CompleteClass */
      var paused: Boolean = js.native
      
      /* CompleteClass */
      override def preventDefault(): Unit = js.native
      
      /* CompleteClass */
      var progress: Double = js.native
      
      /* CompleteClass */
      var propagationStopped: Boolean = js.native
      
      /* CompleteClass */
      var rawResult: js.Any = js.native
      
      /* CompleteClass */
      override def remove(): Unit = js.native
      
      /* CompleteClass */
      var removed: Boolean = js.native
      
      /* CompleteClass */
      var result: js.Any = js.native
      
      /* CompleteClass */
      var runTime: Double = js.native
      
      /* CompleteClass */
      override def set(props: js.Object): typings.createjsLib.createjs.Event = js.native
      
      /* CompleteClass */
      var src: String = js.native
      
      /* CompleteClass */
      override def stopImmediatePropagation(): Unit = js.native
      
      /* CompleteClass */
      override def stopPropagation(): Unit = js.native
      
      /* CompleteClass */
      var target: js.Any = js.native
      
      /* CompleteClass */
      var time: Double = js.native
      
      // It is 'Object' type officially, but 'any' is easier to use.
      /* CompleteClass */
      var timeStamp: Double = js.native
      
      /* CompleteClass */
      var total: Double = js.native
      
      /* CompleteClass */
      var `type`: String = js.native
    }
    
    @JSGlobal("createjs.EventDispatcher")
    @js.native
    class EventDispatcher ()
      extends StObject
         with typings.createjsLib.createjs.EventDispatcher
    /* static members */
    object EventDispatcher {
      
      @JSGlobal("createjs.EventDispatcher")
      @js.native
      val ^ : js.Any = js.native
      
      inline def initialize(target: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    inline def extend(subclass: js.Function0[js.Any], superclass: js.Function0[js.Any]): js.Function0[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(subclass.asInstanceOf[js.Any], superclass.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Any]]
    
    inline def indexOf(array: js.Array[js.Any], searchElement: js.Object): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def promote(subclass: js.Function0[js.Any], prefix: String): js.Function0[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promote")(subclass.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Any]]
    
    inline def proxy(method: js.Function1[/* eventObj */ js.Object, Boolean | Unit], scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(method.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* eventObj */ js.Object, js.Any]]
    inline def proxy(method: HandleEvent, scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(method.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* eventObj */ js.Object, js.Any]]
    inline def proxy(method: `0`, scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(method.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* eventObj */ js.Object, js.Any]]
  }
}
