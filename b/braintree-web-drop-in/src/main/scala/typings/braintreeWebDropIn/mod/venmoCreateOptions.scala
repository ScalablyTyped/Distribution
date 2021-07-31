package typings.braintreeWebDropIn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait venmoCreateOptions extends StObject {
  
  var allowNewBrowserTab: js.UndefOr[Boolean] = js.undefined
}
object venmoCreateOptions {
  
  @scala.inline
  def apply(): venmoCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[venmoCreateOptions]
  }
  
  @scala.inline
  implicit class venmoCreateOptionsMutableBuilder[Self <: venmoCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNewBrowserTab(value: Boolean): Self = StObject.set(x, "allowNewBrowserTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNewBrowserTabUndefined: Self = StObject.set(x, "allowNewBrowserTab", js.undefined)
  }
}
