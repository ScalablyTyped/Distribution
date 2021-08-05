package typings.codemirror.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertLeft extends StObject {
  
  /** By default, text typed when the cursor is on top of the bookmark will end up to the right of the bookmark.
    Set this option to true to make it go to the left instead. */
  var insertLeft: js.UndefOr[Boolean] = js.undefined
  
  /** Can be used to display a DOM node at the current location of the bookmark (analogous to the replacedWith option to markText). */
  var widget: js.UndefOr[HTMLElement] = js.undefined
}
object InsertLeft {
  
  inline def apply(): InsertLeft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertLeft]
  }
  
  extension [Self <: InsertLeft](x: Self) {
    
    inline def setInsertLeft(value: Boolean): Self = StObject.set(x, "insertLeft", value.asInstanceOf[js.Any])
    
    inline def setInsertLeftUndefined: Self = StObject.set(x, "insertLeft", js.undefined)
    
    inline def setWidget(value: HTMLElement): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
    
    inline def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
  }
}
