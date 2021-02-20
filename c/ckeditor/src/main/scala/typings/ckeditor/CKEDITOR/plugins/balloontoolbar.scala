package typings.ckeditor.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.dom.elementPath
import typings.ckeditor.CKEDITOR.dom.selection
import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.CKEDITOR.ui.balloonToolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object balloontoolbar {
  
  @js.native
  trait context extends StObject {
    
    def destroy(): Unit = js.native
    
    var editor: typings.ckeditor.CKEDITOR.editor = js.native
    
    def hide(): Unit = js.native
    
    var options: contextDefinition = js.native
    
    def refresh(): Unit = js.native
    
    def show(): Unit = js.native
    def show(pointedElement: element): Unit = js.native
    
    var toolbar: balloonToolbar = js.native
  }
  
  @js.native
  trait contextDefinition extends StObject {
    
    var cssSelector: js.UndefOr[String] = js.native
    
    var priority: js.UndefOr[Double] = js.native
    
    var refresh: js.UndefOr[
        js.Function3[/* editor */ editor, /* path */ elementPath, /* selection */ selection, element]
      ] = js.native
    
    var widgets: js.UndefOr[js.Array[String] | String] = js.native
  }
  object contextDefinition {
    
    @scala.inline
    def apply(): contextDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[contextDefinition]
    }
    
    @scala.inline
    implicit class contextDefinitionMutableBuilder[Self <: contextDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssSelector(value: String): Self = StObject.set(x, "cssSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssSelectorUndefined: Self = StObject.set(x, "cssSelector", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setRefresh(value: (/* editor */ editor, /* path */ elementPath, /* selection */ selection) => element): Self = StObject.set(x, "refresh", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      @scala.inline
      def setWidgets(value: js.Array[String] | String): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
      
      @scala.inline
      def setWidgetsVarargs(value: String*): Self = StObject.set(x, "widgets", js.Array(value :_*))
    }
  }
  
  @js.native
  trait contextManager extends StObject {
    
    def add(context: context): Unit = js.native
    
    def check(): Unit = js.native
    def check(selection: selection): Unit = js.native
    
    def create(options: contextDefinition): context = js.native
    
    def destroy(): Unit = js.native
    
    var editor: typings.ckeditor.CKEDITOR.editor = js.native
    
    def hide(): Unit = js.native
  }
}
