package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.left
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.right
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alignment extends StObject {
  
  /**
    * Specifies the label&apos;s horizontal alignment. Applies only to labels outside their editors (see labelMode).
    */
  var alignment: js.UndefOr[center | left | right] = js.undefined
  
  /**
    * Specifies the location of a label against the editor. Applies only to labels outside their editors (see labelMode).
    */
  var location: js.UndefOr[left | right | top] = js.undefined
  
  /**
    * Specifies whether a colon is displayed at the end of the current label. Applies only to labels outside their editors (see labelMode).
    */
  var showColon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the label text.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Controls the visibility of the label outside the editor.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Alignment {
  
  inline def apply(): Alignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alignment]
  }
  
  extension [Self <: Alignment](x: Self) {
    
    inline def setAlignment(value: center | left | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setLocation(value: left | right | top): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setShowColon(value: Boolean): Self = StObject.set(x, "showColon", value.asInstanceOf[js.Any])
    
    inline def setShowColonUndefined: Self = StObject.set(x, "showColon", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
