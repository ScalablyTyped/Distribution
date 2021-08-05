package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomationNonInteractive
  extends StObject
     with _AutomationOptions {
  
  var desktop: js.UndefOr[`false`] = js.undefined
  
  var interact: `false`
  
  /** Patterns for matching, use chrome url pattern */
  var matches: js.UndefOr[js.Array[String | UrlMatches]] = js.undefined
}
object AutomationNonInteractive {
  
  inline def apply(): AutomationNonInteractive = {
    val __obj = js.Dynamic.literal(interact = false)
    __obj.asInstanceOf[AutomationNonInteractive]
  }
  
  extension [Self <: AutomationNonInteractive](x: Self) {
    
    inline def setDesktop(value: `false`): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
    
    inline def setInteract(value: `false`): Self = StObject.set(x, "interact", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: js.Array[String | UrlMatches]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: (String | UrlMatches)*): Self = StObject.set(x, "matches", js.Array(value :_*))
  }
}
