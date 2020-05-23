package typings.createjsLib

import typings.createjsLib.anon.HandleEvent
import typings.createjsLib.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object createjs extends js.Object {
    @js.native
    class Event protected ()
      extends typings.createjsLib.createjs.Event {
      def this(`type`: String, bubbles: Boolean, cancelable: Boolean) = this()
      // properties
      /* CompleteClass */
      override var bubbles: Boolean = js.native
      /* CompleteClass */
      override var cancelable: Boolean = js.native
      /* CompleteClass */
      override var currentTarget: js.Any = js.native
      // other event payloads
      /* CompleteClass */
      override var data: js.Any = js.native
       // It is 'Object' type officially, but 'any' is easier to use.
      /* CompleteClass */
      override var defaultPrevented: Boolean = js.native
      /* CompleteClass */
      override var delta: Double = js.native
      /* CompleteClass */
      override var error: String = js.native
      /* CompleteClass */
      override var eventPhase: Double = js.native
      /* CompleteClass */
      override var id: String = js.native
      /* CompleteClass */
      override var immediatePropagationStopped: Boolean = js.native
      /* CompleteClass */
      override var item: js.Any = js.native
      /* CompleteClass */
      override var loaded: Double = js.native
      /* CompleteClass */
      override var name: String = js.native
      /* CompleteClass */
      override var next: String = js.native
      /* CompleteClass */
      override var params: js.Any = js.native
      /* CompleteClass */
      override var paused: Boolean = js.native
      /* CompleteClass */
      override var progress: Double = js.native
      /* CompleteClass */
      override var propagationStopped: Boolean = js.native
      /* CompleteClass */
      override var rawResult: js.Any = js.native
      /* CompleteClass */
      override var removed: Boolean = js.native
      /* CompleteClass */
      override var result: js.Any = js.native
      /* CompleteClass */
      override var runTime: Double = js.native
      /* CompleteClass */
      override var src: String = js.native
      /* CompleteClass */
      override var target: js.Any = js.native
      /* CompleteClass */
      override var time: Double = js.native
       // It is 'Object' type officially, but 'any' is easier to use.
      /* CompleteClass */
      override var timeStamp: Double = js.native
      /* CompleteClass */
      override var total: Double = js.native
      /* CompleteClass */
      override var `type`: String = js.native
      /* CompleteClass */
      override def preventDefault(): Unit = js.native
      /* CompleteClass */
      override def remove(): Unit = js.native
      /* CompleteClass */
      override def set(props: js.Object): typings.createjsLib.createjs.Event = js.native
      /* CompleteClass */
      override def stopImmediatePropagation(): Unit = js.native
      /* CompleteClass */
      override def stopPropagation(): Unit = js.native
    }
    
    @js.native
    class EventDispatcher ()
      extends typings.createjsLib.createjs.EventDispatcher
    
    def extend(subclass: js.Function0[_], superclass: js.Function0[_]): js.Function0[_] = js.native
    def indexOf(array: js.Array[_], searchElement: js.Object): Double = js.native
    def promote(subclass: js.Function0[_], prefix: String): js.Function0[_] = js.native
    def proxy(method: js.Function1[/* eventObj */ js.Object, Boolean | Unit], scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, _] = js.native
    def proxy(method: HandleEvent, scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, _] = js.native
    def proxy(method: `0`, scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, _] = js.native
    /* static members */
    @js.native
    object EventDispatcher extends js.Object {
      def initialize(target: js.Object): Unit = js.native
    }
    
  }
  
}

