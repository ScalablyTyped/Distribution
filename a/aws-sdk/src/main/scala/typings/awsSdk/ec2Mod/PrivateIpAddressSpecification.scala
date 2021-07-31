package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateIpAddressSpecification extends StObject {
  
  /**
    * Indicates whether the private IPv4 address is the primary private IPv4 address. Only one IPv4 address can be designated as primary.
    */
  var Primary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The private IPv4 addresses.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
}
object PrivateIpAddressSpecification {
  
  @scala.inline
  def apply(): PrivateIpAddressSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateIpAddressSpecification]
  }
  
  @scala.inline
  implicit class PrivateIpAddressSpecificationMutableBuilder[Self <: PrivateIpAddressSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "Primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "Primary", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
  }
}
