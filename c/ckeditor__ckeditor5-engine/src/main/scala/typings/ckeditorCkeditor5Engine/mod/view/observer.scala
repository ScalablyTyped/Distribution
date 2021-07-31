package typings.ckeditorCkeditor5Engine.mod.view

import typings.ckeditorCkeditor5Utils.mod.KeystrokeInfo
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observer {
  
  // engine/view/observer/clickobserver
  @JSImport("@ckeditor/ckeditor5-engine", "view.observer.ClickObserver")
  @js.native
  class ClickObserver protected () extends DomEventObserver {
    def this(view: View) = this()
  }
  
  // engine/view/observer/compositionobserver
  @JSImport("@ckeditor/ckeditor5-engine", "view.observer.CompositionObserver")
  @js.native
  class CompositionObserver protected () extends DomEventObserver {
    def this(view: View) = this()
  }
  
  // engine/view/observer/domeventdata
  @JSImport("@ckeditor/ckeditor5-engine", "view.observer.DomEventData")
  @js.native
  class DomEventData () extends StObject
  
  // engine/view/observer/domeventobserver
  @JSImport("@ckeditor/ckeditor5-engine", "view.observer.DomEventObserver")
  @js.native
  class DomEventObserver protected () extends Observer {
    def this(view: View) = this()
    
    val domEventType: String | js.Array[String] = js.native
    
    def fire(eventType: String, domEvent: Event): Unit = js.native
    def fire(eventType: String, domEvent: Event, additionalData: js.Object): Unit = js.native
    
    def onDomEvent(): Unit = js.native
    
    var useCapture: Boolean = js.native
  }
  
  // engine/view/observer/fakeselectionobserver
  @JSImport("@ckeditor/ckeditor5-engine", "view.observer.FakeSelectionObserver")
  @js.native
  class FakeSelectionObserver protected () extends Observer {
    def this(view: View) = this()
    
    def observe(): Unit = js.native
  }
  
  // engine/view/observer/focusobserver
  @JSImport("@ckeditor/ckeditor5-engine", "view.observer.FocusObserver")
  @js.native
  class FocusObserver protected () extends DomEventObserver {
    def this(view: View) = this()
  }
  
  // engine/view/observer/keyobserver
  @JSImport("@ckeditor/ckeditor5-engine", "view.observer.KeyEventData")
  @js.native
  class KeyEventData ()
    extends DomEventData
       with KeystrokeInfo {
    
    /* CompleteClass */
    var keyCode: Double = js.native
    
    var keystroke: Double = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "view.observer.KeyObserver")
  @js.native
  class KeyObserver protected () extends DomEventObserver {
    def this(view: View) = this()
  }
  
  // engine/view/observer/mouseobserver
  @JSImport("@ckeditor/ckeditor5-engine", "view.observer.MouseObserver")
  @js.native
  class MouseObserver protected () extends DomEventObserver {
    def this(view: View) = this()
  }
  
  // engine/view/observer/mutationobserver
  @JSImport("@ckeditor/ckeditor5-engine", "view.observer.MutationObserver")
  @js.native
  class MutationObserver protected () extends Observer {
    def this(view: View) = this()
    
    var domConverter: DomConverter = js.native
    
    var renderer: Renderer = js.native
  }
  
  // engine/view/observer/observer
  @JSImport("@ckeditor/ckeditor5-engine", "view.observer.Observer")
  @js.native
  class Observer protected () extends StObject {
    def this(view: View) = this()
    
    def destroy(): Unit = js.native
    
    def disable(): Unit = js.native
    
    val document: Document = js.native
    
    def enable(): Unit = js.native
    
    val isEnabled: Boolean = js.native
    
    def observe(domElement: HTMLElement, name: String): Unit = js.native
    
    val view: View = js.native
  }
  
  // engine/view/observer/selectionobserver
  @JSImport("@ckeditor/ckeditor5-engine", "view.observer.SelectionObserver")
  @js.native
  class SelectionObserver protected () extends Observer {
    def this(view: View) = this()
    
    val domConverter: DomConverter = js.native
    
    val mutationObserver: MutationObserver = js.native
    
    val selection: DocumentSelection = js.native
  }
  
  trait MutatedChildren extends StObject {
    
    var newChildren: js.Array[Node]
    
    var node: Element
    
    var oldChildren: js.Array[Node]
    
    var `type`: String
  }
  object MutatedChildren {
    
    @scala.inline
    def apply(newChildren: js.Array[Node], node: Element, oldChildren: js.Array[Node], `type`: String): MutatedChildren = {
      val __obj = js.Dynamic.literal(newChildren = newChildren.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldChildren = oldChildren.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutatedChildren]
    }
    
    @scala.inline
    implicit class MutatedChildrenMutableBuilder[Self <: MutatedChildren] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewChildren(value: js.Array[Node]): Self = StObject.set(x, "newChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewChildrenVarargs(value: Node*): Self = StObject.set(x, "newChildren", js.Array(value :_*))
      
      @scala.inline
      def setNode(value: Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldChildren(value: js.Array[Node]): Self = StObject.set(x, "oldChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldChildrenVarargs(value: Node*): Self = StObject.set(x, "oldChildren", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MutatedText extends StObject {
    
    var newText: String
    
    var node: Text
    
    var oldText: String
    
    var `type`: String
  }
  object MutatedText {
    
    @scala.inline
    def apply(newText: String, node: Text, oldText: String, `type`: String): MutatedText = {
      val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutatedText]
    }
    
    @scala.inline
    implicit class MutatedTextMutableBuilder[Self <: MutatedText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: Text): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldText(value: String): Self = StObject.set(x, "oldText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
