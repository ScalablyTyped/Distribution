package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  /**
    * Specifies the text of the button that closes the popup menu without applying a filter.
    */
  var cancel: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the item that represents empty values in the popup menu.
    */
  var emptyValue: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text of the button that applies a filter.
    */
  var ok: js.UndefOr[String] = js.undefined
}
object Cancel {
  
  inline def apply(): Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancel]
  }
  
  extension [Self <: Cancel](x: Self) {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setEmptyValue(value: String): Self = StObject.set(x, "emptyValue", value.asInstanceOf[js.Any])
    
    inline def setEmptyValueUndefined: Self = StObject.set(x, "emptyValue", js.undefined)
    
    inline def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
  }
}
