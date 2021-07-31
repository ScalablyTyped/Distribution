package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableVpcClassicLinkResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object DisableVpcClassicLinkResult {
  
  @scala.inline
  def apply(): DisableVpcClassicLinkResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableVpcClassicLinkResult]
  }
  
  @scala.inline
  implicit class DisableVpcClassicLinkResultMutableBuilder[Self <: DisableVpcClassicLinkResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
