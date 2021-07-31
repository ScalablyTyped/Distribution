package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectByRegExParams extends StObject {
  
  /**
    * A match pattern that may contain capture groups.
    * Capture groups are referenced in the Perl syntax ($1, $2, ...)
    * instead of the RE2 syntax (\1, \2, ...) in order to be closer
    * to JavaScript Regular Expressions.
    */
  var from: String
  
  /** Destination pattern. @see from */
  var to: String
}
object RedirectByRegExParams {
  
  @scala.inline
  def apply(from: String, to: String): RedirectByRegExParams = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectByRegExParams]
  }
  
  @scala.inline
  implicit class RedirectByRegExParamsMutableBuilder[Self <: RedirectByRegExParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
