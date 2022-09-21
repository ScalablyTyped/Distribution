package typings.codemirrorView.anon

import typings.codemirrorView.codemirrorViewStrings.Alt
import typings.codemirrorView.codemirrorViewStrings.Control
import typings.codemirrorView.codemirrorViewStrings.Meta
import typings.codemirrorView.codemirrorViewStrings.Shift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: js.UndefOr[Alt | Control | Shift | Meta] = js.undefined
}
object Key {
  
  inline def apply(): Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: Alt | Control | Shift | Meta): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
