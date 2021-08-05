package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandidateWindowParameterProperties extends StObject {
  
  /**
    * Optional.
    * Text that is shown at the bottom of the candidate window.
    */
  var auxiliaryText: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    * True to display the auxiliary text, false to hide it.
    */
  var auxiliaryTextVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    * True to show the cursor, false to hide it.
    */
  var cursorVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    * The number of candidates to display per page.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional.
    * True if the candidate window should be rendered vertical, false to make it horizontal.
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    * True to show the Candidate window, false to hide it.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    * Where to display the candidate window.
    * @since Chrome 28.
    */
  var windowPosition: js.UndefOr[String] = js.undefined
}
object CandidateWindowParameterProperties {
  
  inline def apply(): CandidateWindowParameterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandidateWindowParameterProperties]
  }
  
  extension [Self <: CandidateWindowParameterProperties](x: Self) {
    
    inline def setAuxiliaryText(value: String): Self = StObject.set(x, "auxiliaryText", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryTextUndefined: Self = StObject.set(x, "auxiliaryText", js.undefined)
    
    inline def setAuxiliaryTextVisible(value: Boolean): Self = StObject.set(x, "auxiliaryTextVisible", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryTextVisibleUndefined: Self = StObject.set(x, "auxiliaryTextVisible", js.undefined)
    
    inline def setCursorVisible(value: Boolean): Self = StObject.set(x, "cursorVisible", value.asInstanceOf[js.Any])
    
    inline def setCursorVisibleUndefined: Self = StObject.set(x, "cursorVisible", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWindowPosition(value: String): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
    
    inline def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
  }
}
