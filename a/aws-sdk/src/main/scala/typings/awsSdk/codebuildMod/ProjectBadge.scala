package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectBadge extends StObject {
  
  /**
    * Set this to true to generate a publicly accessible URL for your project's build badge.
    */
  var badgeEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The publicly-accessible URL through which you can access the build badge for your project. 
    */
  var badgeRequestUrl: js.UndefOr[String] = js.undefined
}
object ProjectBadge {
  
  inline def apply(): ProjectBadge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectBadge]
  }
  
  extension [Self <: ProjectBadge](x: Self) {
    
    inline def setBadgeEnabled(value: Boolean): Self = StObject.set(x, "badgeEnabled", value.asInstanceOf[js.Any])
    
    inline def setBadgeEnabledUndefined: Self = StObject.set(x, "badgeEnabled", js.undefined)
    
    inline def setBadgeRequestUrl(value: String): Self = StObject.set(x, "badgeRequestUrl", value.asInstanceOf[js.Any])
    
    inline def setBadgeRequestUrlUndefined: Self = StObject.set(x, "badgeRequestUrl", js.undefined)
  }
}
