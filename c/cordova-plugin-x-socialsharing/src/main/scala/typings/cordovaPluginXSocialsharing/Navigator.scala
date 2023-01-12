package typings.cordovaPluginXSocialsharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  def share(shareData: SocialSharingW3CData): js.Promise[SocialSharingResult]
  @JSName("share")
  var share_Original: SocialSharingW3C
}
object Navigator {
  
  inline def apply(share: /* shareData */ SocialSharingW3CData => js.Promise[SocialSharingResult]): Navigator = {
    val __obj = js.Dynamic.literal(share = js.Any.fromFunction1(share))
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    inline def setShare(value: /* shareData */ SocialSharingW3CData => js.Promise[SocialSharingResult]): Self = StObject.set(x, "share", js.Any.fromFunction1(value))
  }
}
