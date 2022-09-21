package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipboardItemOptions extends StObject {
  
  var presentationStyle: js.UndefOr[PresentationStyle] = js.undefined
}
object ClipboardItemOptions {
  
  inline def apply(): ClipboardItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipboardItemOptions]
  }
  
  extension [Self <: ClipboardItemOptions](x: Self) {
    
    inline def setPresentationStyle(value: PresentationStyle): Self = StObject.set(x, "presentationStyle", value.asInstanceOf[js.Any])
    
    inline def setPresentationStyleUndefined: Self = StObject.set(x, "presentationStyle", js.undefined)
  }
}
