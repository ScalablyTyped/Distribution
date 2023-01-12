package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Redirect extends StObject {
  
  /** Path relative to the extension directory.
    * Should start with '/'.
    */
  var extensionPath: js.UndefOr[String] = js.undefined
  
  /** Substitution pattern for rules which specify a regexFilter.
    * The first match of regexFilter within the url will be replaced with this pattern.
    * Within regexSubstitution, backslash-escaped digits (\1 to \9) can be used to insert the corresponding capture groups.
    * \0 refers to the entire matching text.
    */
  var regexSubstitution: js.UndefOr[String] = js.undefined
  
  /** Url transformations to perform. */
  var transform: js.UndefOr[URLTransform] = js.undefined
  
  /** The redirect url.
    * Redirects to JavaScript urls are not allowed.
    */
  var url: js.UndefOr[String] = js.undefined
}
object Redirect {
  
  inline def apply(): Redirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Redirect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Redirect] (val x: Self) extends AnyVal {
    
    inline def setExtensionPath(value: String): Self = StObject.set(x, "extensionPath", value.asInstanceOf[js.Any])
    
    inline def setExtensionPathUndefined: Self = StObject.set(x, "extensionPath", js.undefined)
    
    inline def setRegexSubstitution(value: String): Self = StObject.set(x, "regexSubstitution", value.asInstanceOf[js.Any])
    
    inline def setRegexSubstitutionUndefined: Self = StObject.set(x, "regexSubstitution", js.undefined)
    
    inline def setTransform(value: URLTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
