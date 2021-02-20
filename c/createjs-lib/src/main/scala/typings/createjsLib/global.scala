package typings.createjsLib

import typings.createjsLib.anon.HandleEvent
import typings.createjsLib.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object createjs {
    
    @JSGlobal("createjs.Event")
    @js.native
    class Event protected ()
      extends typings.createjsLib.createjs.Event {
      def this(`type`: String, bubbles: Boolean, cancelable: Boolean) = this()
    }
    
    @JSGlobal("createjs.EventDispatcher")
    @js.native
    class EventDispatcher ()
      extends typings.createjsLib.createjs.EventDispatcher
    /* static members */
    object EventDispatcher {
      
      @JSGlobal("createjs.EventDispatcher.initialize")
      @js.native
      def initialize(target: js.Object): Unit = js.native
    }
    
    @JSGlobal("createjs.extend")
    @js.native
    def extend(subclass: js.Function0[_], superclass: js.Function0[_]): js.Function0[_] = js.native
    
    @JSGlobal("createjs.indexOf")
    @js.native
    def indexOf(array: js.Array[_], searchElement: js.Object): Double = js.native
    
    @JSGlobal("createjs.promote")
    @js.native
    def promote(subclass: js.Function0[_], prefix: String): js.Function0[_] = js.native
    
    @JSGlobal("createjs.proxy")
    @js.native
    def proxy(method: js.Function1[/* eventObj */ js.Object, Boolean | Unit], scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, _] = js.native
    @JSGlobal("createjs.proxy")
    @js.native
    def proxy(method: HandleEvent, scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, _] = js.native
    @JSGlobal("createjs.proxy")
    @js.native
    def proxy(method: `0`, scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, _] = js.native
  }
}
