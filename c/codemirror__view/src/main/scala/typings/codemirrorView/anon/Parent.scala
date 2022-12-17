package typings.codemirrorView.anon

import typings.codemirrorView.codemirrorViewStrings.absolute
import typings.codemirrorView.codemirrorViewStrings.fixed
import typings.codemirrorView.mod.EditorView
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parent extends StObject {
  
  /**
    The element to put the tooltips into. By default, they are put
    in the editor (`cm-editor`) element, and that is usually what
    you want. But in some layouts that can lead to positioning
    issues, and you need to use a different parent to work around
    those.
    */
  var parent: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    By default, tooltips use `"fixed"`
    [positioning](https://developer.mozilla.org/en-US/docs/Web/CSS/position),
    which has the advantage that tooltips don't get cut off by
    scrollable parent elements. However, CSS rules like `contain:
    layout` can break fixed positioning in child nodes, which can be
    worked about by using `"absolute"` here.
    
    On iOS, which at the time of writing still doesn't properly
    support fixed positioning, the library always uses absolute
    positioning.
    */
  var position: js.UndefOr[fixed | absolute] = js.undefined
  
  /**
    By default, when figuring out whether there is room for a
    tooltip at a given position, the extension considers the entire
    space between 0,0 and `innerWidth`,`innerHeight` to be available
    for showing tooltips. You can provide a function here that
    returns an alternative rectangle.
    */
  var tooltipSpace: js.UndefOr[js.Function1[/* view */ EditorView, Left]] = js.undefined
}
object Parent {
  
  inline def apply(): Parent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parent]
  }
  
  extension [Self <: Parent](x: Self) {
    
    inline def setParent(value: HTMLElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPosition(value: fixed | absolute): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTooltipSpace(value: /* view */ EditorView => Left): Self = StObject.set(x, "tooltipSpace", js.Any.fromFunction1(value))
    
    inline def setTooltipSpaceUndefined: Self = StObject.set(x, "tooltipSpace", js.undefined)
  }
}
