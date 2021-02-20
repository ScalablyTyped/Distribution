package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseRequest extends StObject {
  
  /**
    * The number of instances.
    */
  var InstanceCount: Integer = js.native
  
  /**
    * The purchase token.
    */
  var PurchaseToken: String = js.native
}
object PurchaseRequest {
  
  @scala.inline
  def apply(InstanceCount: Integer, PurchaseToken: String): PurchaseRequest = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], PurchaseToken = PurchaseToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseRequest]
  }
  
  @scala.inline
  implicit class PurchaseRequestMutableBuilder[Self <: PurchaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseToken(value: String): Self = StObject.set(x, "PurchaseToken", value.asInstanceOf[js.Any])
  }
}
