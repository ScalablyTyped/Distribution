package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomationNonInteractive extends _AutomationOptions {
  
  var desktop: js.UndefOr[`false`] = js.native
  
  var interact: `false` = js.native
  
  /** Patterns for matching, use chrome url pattern */
  var matches: js.UndefOr[js.Array[String | UrlMatches]] = js.native
}
object AutomationNonInteractive {
  
  @scala.inline
  def apply(interact: `false`): AutomationNonInteractive = {
    val __obj = js.Dynamic.literal(interact = interact.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomationNonInteractive]
  }
  
  @scala.inline
  implicit class AutomationNonInteractiveMutableBuilder[Self <: AutomationNonInteractive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesktop(value: `false`): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
    
    @scala.inline
    def setInteract(value: `false`): Self = StObject.set(x, "interact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatches(value: js.Array[String | UrlMatches]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    @scala.inline
    def setMatchesVarargs(value: (String | UrlMatches)*): Self = StObject.set(x, "matches", js.Array(value :_*))
  }
}
