package typings.ckeditor4.CKEDITOR.plugins

import typings.ckeditor4.CKEDITOR.dom.element
import typings.ckeditor4.CKEDITOR.dom.elementPath
import typings.ckeditor4.CKEDITOR.dom.selection
import typings.ckeditor4.CKEDITOR.editor
import typings.ckeditor4.CKEDITOR.ui.balloonToolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object balloontoolbar {
  
  @js.native
  trait context extends StObject {
    
    def destroy(): Unit = js.native
    
    var editor: typings.ckeditor4.CKEDITOR.editor = js.native
    
    def hide(): Unit = js.native
    
    var options: contextDefinition = js.native
    
    def refresh(): Unit = js.native
    
    def show(): Unit = js.native
    def show(pointedElement: element): Unit = js.native
    
    var toolbar: balloonToolbar = js.native
  }
  
  trait contextDefinition extends StObject {
    
    var cssSelector: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var refresh: js.UndefOr[
        js.Function3[/* editor */ editor, /* path */ elementPath, /* selection */ selection, element]
      ] = js.undefined
    
    var widgets: js.UndefOr[js.Array[String] | String] = js.undefined
  }
  object contextDefinition {
    
    inline def apply(): contextDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[contextDefinition]
    }
    
    extension [Self <: contextDefinition](x: Self) {
      
      inline def setCssSelector(value: String): Self = StObject.set(x, "cssSelector", value.asInstanceOf[js.Any])
      
      inline def setCssSelectorUndefined: Self = StObject.set(x, "cssSelector", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setRefresh(value: (/* editor */ editor, /* path */ elementPath, /* selection */ selection) => element): Self = StObject.set(x, "refresh", js.Any.fromFunction3(value))
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      inline def setWidgets(value: js.Array[String] | String): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
      
      inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
      
      inline def setWidgetsVarargs(value: String*): Self = StObject.set(x, "widgets", js.Array(value*))
    }
  }
  
  @js.native
  trait contextManager extends StObject {
    
    def add(context: context): Unit = js.native
    
    def check(): Unit = js.native
    def check(selection: selection): Unit = js.native
    
    def create(options: contextDefinition): context = js.native
    
    def destroy(): Unit = js.native
    
    var editor: typings.ckeditor4.CKEDITOR.editor = js.native
    
    def hide(): Unit = js.native
  }
}
