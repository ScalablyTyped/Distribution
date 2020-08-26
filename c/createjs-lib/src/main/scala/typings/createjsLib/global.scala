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

