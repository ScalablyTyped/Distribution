package typings.cordovaPluginXSocialsharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugins extends StObject {
  
  var socialsharing: SocialSharing
}
object Plugins {
  
  inline def apply(socialsharing: SocialSharing): Plugins = {
    val __obj = js.Dynamic.literal(socialsharing = socialsharing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins]
  }
  
  extension [Self <: Plugins](x: Self) {
    
    inline def setSocialsharing(value: SocialSharing): Self = StObject.set(x, "socialsharing", value.asInstanceOf[js.Any])
  }
}
