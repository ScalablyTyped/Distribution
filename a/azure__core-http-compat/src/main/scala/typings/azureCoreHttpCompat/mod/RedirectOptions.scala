package typings.azureCoreHttpCompat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectOptions extends StObject {
  
  /**
    * When true, redirect responses are followed.  Defaults to true.
    */
  var handleRedirects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of times the redirect URL will be tried before
    * failing.  Defaults to 20.
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
}
object RedirectOptions {
  
  inline def apply(): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedirectOptions] (val x: Self) extends AnyVal {
    
    inline def setHandleRedirects(value: Boolean): Self = StObject.set(x, "handleRedirects", value.asInstanceOf[js.Any])
    
    inline def setHandleRedirectsUndefined: Self = StObject.set(x, "handleRedirects", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
  }
}
