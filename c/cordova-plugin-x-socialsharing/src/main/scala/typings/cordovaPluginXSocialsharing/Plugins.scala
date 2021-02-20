package typings.cordovaPluginXSocialsharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plugins extends StObject {
  
  var socialsharing: SocialSharing = js.native
}
object Plugins {
  
  @scala.inline
  def apply(socialsharing: SocialSharing): Plugins = {
    val __obj = js.Dynamic.literal(socialsharing = socialsharing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins]
  }
  
  @scala.inline
  implicit class PluginsMutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSocialsharing(value: SocialSharing): Self = StObject.set(x, "socialsharing", value.asInstanceOf[js.Any])
  }
}
