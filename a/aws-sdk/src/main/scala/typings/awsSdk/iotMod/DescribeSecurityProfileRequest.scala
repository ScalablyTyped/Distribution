package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSecurityProfileRequest extends StObject {
  
  /**
    * The name of the security profile whose information you want to get.
    */
  var securityProfileName: SecurityProfileName = js.native
}
object DescribeSecurityProfileRequest {
  
  @scala.inline
  def apply(securityProfileName: SecurityProfileName): DescribeSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityProfileRequest]
  }
  
  @scala.inline
  implicit class DescribeSecurityProfileRequestMutableBuilder[Self <: DescribeSecurityProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
  }
}
