package typings.bookshelf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetOptions extends StObject {
  
  var unset: js.UndefOr[Boolean] = js.undefined
}
object SetOptions {
  
  inline def apply(): SetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions]
  }
  
  extension [Self <: SetOptions](x: Self) {
    
    inline def setUnset(value: Boolean): Self = StObject.set(x, "unset", value.asInstanceOf[js.Any])
    
    inline def setUnsetUndefined: Self = StObject.set(x, "unset", js.undefined)
  }
}
