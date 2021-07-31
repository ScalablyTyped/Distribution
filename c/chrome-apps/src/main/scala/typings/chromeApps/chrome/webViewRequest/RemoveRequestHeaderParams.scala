package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveRequestHeaderParams extends StObject {
  
  /** HTTP request header name (case-insensitive) */
  var name: String
}
object RemoveRequestHeaderParams {
  
  @scala.inline
  def apply(name: String): RemoveRequestHeaderParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRequestHeaderParams]
  }
  
  @scala.inline
  implicit class RemoveRequestHeaderParamsMutableBuilder[Self <: RemoveRequestHeaderParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
