package typings.babelTraverse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoGlobals extends StObject {
  
  var noGlobals: js.UndefOr[Boolean] = js.undefined
  
  var noUids: js.UndefOr[Boolean] = js.undefined
}
object NoGlobals {
  
  inline def apply(): NoGlobals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoGlobals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoGlobals] (val x: Self) extends AnyVal {
    
    inline def setNoGlobals(value: Boolean): Self = StObject.set(x, "noGlobals", value.asInstanceOf[js.Any])
    
    inline def setNoGlobalsUndefined: Self = StObject.set(x, "noGlobals", js.undefined)
    
    inline def setNoUids(value: Boolean): Self = StObject.set(x, "noUids", value.asInstanceOf[js.Any])
    
    inline def setNoUidsUndefined: Self = StObject.set(x, "noUids", js.undefined)
  }
}
