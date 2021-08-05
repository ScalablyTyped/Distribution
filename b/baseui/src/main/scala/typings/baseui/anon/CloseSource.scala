package typings.baseui.anon

import typings.baseui.baseuiStrings.backdrop
import typings.baseui.baseuiStrings.closeButton
import typings.baseui.baseuiStrings.escape_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseSource extends StObject {
  
  var closeSource: js.UndefOr[closeButton | backdrop | escape_] = js.undefined
}
object CloseSource {
  
  inline def apply(): CloseSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseSource]
  }
  
  extension [Self <: CloseSource](x: Self) {
    
    inline def setCloseSource(value: closeButton | backdrop | escape_): Self = StObject.set(x, "closeSource", value.asInstanceOf[js.Any])
    
    inline def setCloseSourceUndefined: Self = StObject.set(x, "closeSource", js.undefined)
  }
}
