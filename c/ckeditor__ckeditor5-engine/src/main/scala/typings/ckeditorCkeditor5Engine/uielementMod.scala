package typings.ckeditorCkeditor5Engine

import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uielementMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/uielement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.viewSelectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.viewItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/view/uielement", JSImport.Default)
  @js.native
  open class default () extends UIElement
  
  inline def injectUiElementHandling(
    view: /* Couldn't translate: 'key not found: IArray(TsIdentLibraryScoped(ckeditor,ckeditor5-engine), TsIdentModule(Some(ckeditor),List(ckeditor5-engine, src, view, view)))' */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectUiElementHandling")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait UIElement
    extends typings.ckeditorCkeditor5Engine.viewElementMod.default {
    
    /**
      * Renders this {@link module:engine/view/uielement~UIElement} to DOM. This method is called by
      * {@link module:engine/view/domconverter~DomConverter}.
      * Do not use inheritance to create custom rendering method, replace `render()` method instead:
      *
      *    const myUIElement = downcastWriter.createUIElement( 'span' );
      *    myUIElement.render = function( domDocument, domConverter ) {
      *      const domElement = this.toDomElement( domDocument );
      *
      *      domConverter.setContentOf( domElement, '<b>this is ui element</b>' );
      *
      *      return domElement;
      *    };
      *
      * If changes in your UI element should trigger some editor UI update you should call
      * the {@link module:core/editor/editorui~EditorUI#update `editor.ui.update()`} method
      * after rendering your UI element.
      */
    def render(domDocument: Document, domConverter: typings.ckeditorCkeditor5Engine.domconverterMod.default): HTMLElement = js.native
    
    /**
      * Creates DOM element based on this view UIElement.
      * Note that each time this method is called new DOM element is created.
      */
    def toDomElement(domDocument: Document): HTMLElement = js.native
  }
}
