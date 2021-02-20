package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreAddressToClassicResult extends StObject {
  
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
  
  /**
    * The move status for the IP address.
    */
  var Status: js.UndefOr[typings.awsSdk.ec2Mod.Status] = js.native
}
object RestoreAddressToClassicResult {
  
  @scala.inline
  def apply(): RestoreAddressToClassicResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreAddressToClassicResult]
  }
  
  @scala.inline
  implicit class RestoreAddressToClassicResultMutableBuilder[Self <: RestoreAddressToClassicResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
