package typings.cordovaPluginXSocialsharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocialSharingResult extends StObject {
  
  var app: js.UndefOr[String] = js.undefined
  
  var completed: Boolean
}
object SocialSharingResult {
  
  inline def apply(completed: Boolean): SocialSharingResult = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialSharingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SocialSharingResult] (val x: Self) extends AnyVal {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
  }
}
