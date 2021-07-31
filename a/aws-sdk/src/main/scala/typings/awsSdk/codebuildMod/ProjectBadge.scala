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
    * The publicly-accessible URL through which you can access the build badge for your project.  The publicly accessible URL through which you can access the build badge for your project. 
    */
  var badgeRequestUrl: js.UndefOr[String] = js.undefined
}
object ProjectBadge {
  
  @scala.inline
  def apply(): ProjectBadge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectBadge]
  }
  
  @scala.inline
  implicit class ProjectBadgeMutableBuilder[Self <: ProjectBadge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadgeEnabled(value: Boolean): Self = StObject.set(x, "badgeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeEnabledUndefined: Self = StObject.set(x, "badgeEnabled", js.undefined)
    
    @scala.inline
    def setBadgeRequestUrl(value: String): Self = StObject.set(x, "badgeRequestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeRequestUrlUndefined: Self = StObject.set(x, "badgeRequestUrl", js.undefined)
  }
}
