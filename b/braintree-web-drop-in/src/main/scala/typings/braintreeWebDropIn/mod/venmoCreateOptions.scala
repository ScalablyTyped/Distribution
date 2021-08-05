package typings.braintreeWebDropIn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait venmoCreateOptions extends StObject {
  
  var allowNewBrowserTab: js.UndefOr[Boolean] = js.undefined
}
object venmoCreateOptions {
  
  inline def apply(): venmoCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[venmoCreateOptions]
  }
  
  extension [Self <: venmoCreateOptions](x: Self) {
    
    inline def setAllowNewBrowserTab(value: Boolean): Self = StObject.set(x, "allowNewBrowserTab", value.asInstanceOf[js.Any])
    
    inline def setAllowNewBrowserTabUndefined: Self = StObject.set(x, "allowNewBrowserTab", js.undefined)
  }
}
