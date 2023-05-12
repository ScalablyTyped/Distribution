package typings.chrome.chrome.downloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UiOptions extends StObject {
  
  /** Enable or disable the download UI. */
  var enabled: Boolean
}
object UiOptions {
  
  inline def apply(enabled: Boolean): UiOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UiOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
