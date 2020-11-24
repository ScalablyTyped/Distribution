package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateDnsNameConfiguration extends js.Object {
  
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
  implicit class PrivateDnsNameConfigurationOps[Self <: PrivateDnsNameConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setState(value: DnsNameState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
