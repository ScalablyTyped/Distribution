package typings.codemirror.mod

import typings.codemirror.codemirrorStrings.`after-top`
import typings.codemirror.codemirrorStrings.`before-bottom`
import typings.codemirror.codemirrorStrings.bottom
import typings.codemirror.codemirrorStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowPanelOptions extends StObject {
  
  /**The new panel will be added after the given panel. */
  var after: js.UndefOr[Panel] = js.undefined
  
  /**The new panel will be added before the given panel. */
  var before: js.UndefOr[Panel] = js.undefined
  
  /**Controls the position of the newly added panel. The following values are recognized:
    * `top` (default): Adds the panel at the very top.
    *  `after-top`: Adds the panel at the bottom of the top panels.
    *  `bottom`: Adds the panel at the very bottom.
    *  `before-bottom`: Adds the panel at the top of the bottom panels.
    */
  var position: js.UndefOr[top | `after-top` | bottom | `before-bottom`] = js.undefined
  
  /**The new panel will replace the given panel. */
  var replace: js.UndefOr[Panel] = js.undefined
  
  /**Whether to scroll the editor to keep the text's vertical position stable, when adding a panel above it. Defaults to false. */
  var stable: js.UndefOr[Boolean] = js.undefined
}
object ShowPanelOptions {
  
  inline def apply(): ShowPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowPanelOptions]
  }
  
  extension [Self <: ShowPanelOptions](x: Self) {
    
    inline def setAfter(value: Panel): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: Panel): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setPosition(value: top | `after-top` | bottom | `before-bottom`): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setReplace(value: Panel): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setStable(value: Boolean): Self = StObject.set(x, "stable", value.asInstanceOf[js.Any])
    
    inline def setStableUndefined: Self = StObject.set(x, "stable", js.undefined)
  }
}
