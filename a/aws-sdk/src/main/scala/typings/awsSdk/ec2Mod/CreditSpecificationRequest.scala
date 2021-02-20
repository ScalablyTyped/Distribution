package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreditSpecificationRequest extends StObject {
  
  /**
    * The credit option for CPU usage of a T2, T3, or T3a instance. Valid values are standard and unlimited.
    */
  var CpuCredits: String = js.native
}
object CreditSpecificationRequest {
  
  @scala.inline
  def apply(CpuCredits: String): CreditSpecificationRequest = {
    val __obj = js.Dynamic.literal(CpuCredits = CpuCredits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditSpecificationRequest]
  }
  
  @scala.inline
  implicit class CreditSpecificationRequestMutableBuilder[Self <: CreditSpecificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuCredits(value: String): Self = StObject.set(x, "CpuCredits", value.asInstanceOf[js.Any])
  }
}
