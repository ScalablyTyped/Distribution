package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableVpcClassicLinkDnsSupportResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object DisableVpcClassicLinkDnsSupportResult {
  
  @scala.inline
  def apply(): DisableVpcClassicLinkDnsSupportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableVpcClassicLinkDnsSupportResult]
  }
  
  @scala.inline
  implicit class DisableVpcClassicLinkDnsSupportResultMutableBuilder[Self <: DisableVpcClassicLinkDnsSupportResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
