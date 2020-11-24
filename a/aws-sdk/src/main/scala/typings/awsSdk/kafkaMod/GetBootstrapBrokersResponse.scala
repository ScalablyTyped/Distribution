package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBootstrapBrokersResponse extends js.Object {
  
  /**
    * 
    A string containing one or more hostname:port pairs.
    
    */
  var BootstrapBrokerString: js.UndefOr[string] = js.native
  
  /**
    * 
    A string containing one or more DNS names (or IP) and Sasl Scram port pairs.
    
    */
  var BootstrapBrokerStringSaslScram: js.UndefOr[string] = js.native
  
  /**
    * 
    A string containing one or more DNS names (or IP) and TLS port pairs.
    
    */
  var BootstrapBrokerStringTls: js.UndefOr[string] = js.native
}
object GetBootstrapBrokersResponse {
  
  @scala.inline
  def apply(): GetBootstrapBrokersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBootstrapBrokersResponse]
  }
  
  @scala.inline
  implicit class GetBootstrapBrokersResponseOps[Self <: GetBootstrapBrokersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBootstrapBrokerString(value: string): Self = this.set("BootstrapBrokerString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrapBrokerString: Self = this.set("BootstrapBrokerString", js.undefined)
    
    @scala.inline
    def setBootstrapBrokerStringSaslScram(value: string): Self = this.set("BootstrapBrokerStringSaslScram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrapBrokerStringSaslScram: Self = this.set("BootstrapBrokerStringSaslScram", js.undefined)
    
    @scala.inline
    def setBootstrapBrokerStringTls(value: string): Self = this.set("BootstrapBrokerStringTls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrapBrokerStringTls: Self = this.set("BootstrapBrokerStringTls", js.undefined)
  }
}
