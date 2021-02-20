package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateDnsNameConfiguration extends StObject {
  
  /**
    * The name of the record subdomain the service provider needs to create. The service provider adds the value text to the name.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The verification state of the VPC endpoint service. &gt;Consumers of the endpoint service can use the private name only when the state is verified.
    */
  var State: js.UndefOr[DnsNameState] = js.native
  
  /**
    * The endpoint service verification type, for example TXT.
    */
  var Type: js.UndefOr[String] = js.native
  
  /**
    * The value the service provider adds to the private DNS name domain record before verification.
    */
  var Value: js.UndefOr[String] = js.native
}
object PrivateDnsNameConfiguration {
  
  @scala.inline
  def apply(): PrivateDnsNameConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateDnsNameConfiguration]
  }
  
  @scala.inline
  implicit class PrivateDnsNameConfigurationMutableBuilder[Self <: PrivateDnsNameConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setState(value: DnsNameState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
