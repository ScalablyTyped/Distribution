package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DhcpConfiguration extends js.Object {
  
  /**
    * The name of a DHCP option.
    */
  var Key: js.UndefOr[String] = js.native
  
  /**
    * One or more values for the DHCP option.
    */
  var Values: js.UndefOr[DhcpConfigurationValueList] = js.native
}
object DhcpConfiguration {
  
  @scala.inline
  def apply(): DhcpConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DhcpConfiguration]
  }
  
  @scala.inline
  implicit class DhcpConfigurationOps[Self <: DhcpConfiguration] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: AttributeValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: DhcpConfigurationValueList): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
