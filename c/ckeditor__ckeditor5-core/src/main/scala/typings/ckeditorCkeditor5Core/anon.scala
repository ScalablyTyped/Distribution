package typings.ckeditorCkeditor5Core

import typings.ckeditorCkeditor5Utils.mod.BindChain
import typings.ckeditorCkeditor5Utils.mod.Emitter
import typings.ckeditorCkeditor5Utils.mod.EmitterMixinDelegateChain
import typings.ckeditorCkeditor5Utils.mod.EventInfo
import typings.ckeditorCkeditor5Utils.mod.PriorityString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var priority: PriorityString | Double = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(priority: PriorityString | Double): `0` = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: PriorityString | Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Destroy extends StObject {
    
    def destroy(): Unit | Null | js.Promise[_] = js.native
  }
  object Destroy {
    
    @scala.inline
    def apply(destroy: () => Unit | Null | js.Promise[_]): Destroy = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[Destroy]
    }
    
    @scala.inline
    implicit class DestroyMutableBuilder[Self <: Destroy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit | Null | js.Promise[_]): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Items extends StObject {
    
    var items: js.Array[String] = js.native
    
    var viewportTopOffset: Double = js.native
  }
  object Items {
    
    @scala.inline
    def apply(items: js.Array[String], viewportTopOffset: Double): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], viewportTopOffset = viewportTopOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    @scala.inline
    implicit class ItemsMutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setViewportTopOffset(value: Double): Self = StObject.set(x, "viewportTopOffset", value.asInstanceOf[js.Any])
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
    def stopDelegating(event: js.UndefOr[scala.Nothing], emitter: Emitter): Unit = js.native
    def stopDelegating(event: String): Unit = js.native
    def stopDelegating(event: String, emitter: Emitter): Unit = js.native
    
    def stopListening(): Unit = js.native
    def stopListening(emitter: js.UndefOr[scala.Nothing], event: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
    def stopListening(emitter: js.UndefOr[scala.Nothing], event: String): Unit = js.native
    def stopListening(emitter: js.UndefOr[scala.Nothing], event: String, callback: js.Function): Unit = js.native
    def stopListening(emitter: Emitter): Unit = js.native
    def stopListening(emitter: Emitter, event: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
    def stopListening(emitter: Emitter, event: String): Unit = js.native
    def stopListening(emitter: Emitter, event: String, callback: js.Function): Unit = js.native
    
    def unbind(unbindProperties: String*): Unit = js.native
  }
  
  @js.native
  trait Priority extends StObject {
    
    var priority: js.UndefOr[PriorityString | Double] = js.native
  }
  object Priority {
    
    @scala.inline
    def apply(): Priority = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Priority]
    }
    
    @scala.inline
    implicit class PriorityMutableBuilder[Self <: Priority] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: PriorityString | Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
}
