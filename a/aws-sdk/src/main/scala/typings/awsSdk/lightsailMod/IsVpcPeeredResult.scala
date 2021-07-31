package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsVpcPeeredResult extends StObject {
  
  /**
    * Returns true if the Lightsail VPC is peered; otherwise, false.
    */
  var isPeered: js.UndefOr[Boolean] = js.undefined
}
object IsVpcPeeredResult {
  
  @scala.inline
  def apply(): IsVpcPeeredResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsVpcPeeredResult]
  }
  
  @scala.inline
  implicit class IsVpcPeeredResultMutableBuilder[Self <: IsVpcPeeredResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPeered(value: Boolean): Self = StObject.set(x, "isPeered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPeeredUndefined: Self = StObject.set(x, "isPeered", js.undefined)
  }
}
