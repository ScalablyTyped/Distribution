package typings.ckeditorCkeditor5Core

import typings.ckeditorCkeditor5Utils.mod.BindChain
import typings.ckeditorCkeditor5Utils.mod.Emitter
import typings.ckeditorCkeditor5Utils.mod.EmitterMixinDelegateChain
import typings.ckeditorCkeditor5Utils.mod.EventInfo
import typings.ckeditorCkeditor5Utils.mod.PriorityString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var priority: PriorityString | Double
  }
  object `0` {
    
    inline def apply(priority: PriorityString | Double): `0` = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setPriority(value: PriorityString | Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  trait Destroy extends StObject {
    
    def destroy(): Unit | Null | js.Promise[js.Any]
  }
  object Destroy {
    
    inline def apply(destroy: () => Unit | Null | js.Promise[js.Any]): Destroy = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[Destroy]
    }
    
    extension [Self <: Destroy](x: Self) {
      
      inline def setDestroy(value: () => Unit | Null | js.Promise[js.Any]): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
  
  trait Items extends StObject {
    
    var items: js.Array[String]
    
    var viewportTopOffset: Double
  }
  object Items {
    
    inline def apply(items: js.Array[String], viewportTopOffset: Double): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], viewportTopOffset = viewportTopOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    extension [Self <: Items](x: Self) {
      
      inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setViewportTopOffset(value: Double): Self = StObject.set(x, "viewportTopOffset", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils.Observable & {  message :string} */
  @js.native
  trait Observablemessagestring extends StObject {
    
    def bind(bindProperties: String*): BindChain = js.native
    
    def decorate(methodName: String): Unit = js.native
    
    // Emitter
    def delegate(events: String*): EmitterMixinDelegateChain = js.native
    
    def fire(eventOrInfo: String, args: js.Any*): js.Any = js.native
    def fire(eventOrInfo: EventInfo[Emitter], args: js.Any*): js.Any = js.native
    
    def listenTo(emitter: Emitter, event: String, callback: js.Function): Unit = js.native
    def listenTo(
      emitter: Emitter,
      event: String,
      callback: js.Function,
      options: typings.ckeditorCkeditor5Utils.anon.Priority
    ): Unit = js.native
    
    var message: String = js.native
    
    def off(event: String): Unit = js.native
    def off(event: String, callback: js.Function): Unit = js.native
    
    def on(event: String, callback: js.Function): Unit = js.native
    def on(event: String, callback: js.Function, options: typings.ckeditorCkeditor5Utils.anon.`0`): Unit = js.native
    
    def once(event: String, callback: js.Function): Unit = js.native
    def once(event: String, callback: js.Function, options: typings.ckeditorCkeditor5Utils.anon.`0`): Unit = js.native
    
    def set(name: String, value: js.Any): Unit = js.native
    def set(name: js.Object): Unit = js.native
    
    def stopDelegating(): Unit = js.native
    def stopDelegating(event: String): Unit = js.native
    def stopDelegating(event: String, emitter: Emitter): Unit = js.native
    def stopDelegating(event: Unit, emitter: Emitter): Unit = js.native
    
    def stopListening(): Unit = js.native
    def stopListening(emitter: Unit, event: String): Unit = js.native
    def stopListening(emitter: Unit, event: String, callback: js.Function): Unit = js.native
    def stopListening(emitter: Unit, event: Unit, callback: js.Function): Unit = js.native
    def stopListening(emitter: Emitter): Unit = js.native
    def stopListening(emitter: Emitter, event: String): Unit = js.native
    def stopListening(emitter: Emitter, event: String, callback: js.Function): Unit = js.native
    def stopListening(emitter: Emitter, event: Unit, callback: js.Function): Unit = js.native
    
    def unbind(unbindProperties: String*): Unit = js.native
  }
  
  trait Priority extends StObject {
    
    var priority: js.UndefOr[PriorityString | Double] = js.undefined
  }
  object Priority {
    
    inline def apply(): Priority = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Priority]
    }
    
    extension [Self <: Priority](x: Self) {
      
      inline def setPriority(value: PriorityString | Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
}
