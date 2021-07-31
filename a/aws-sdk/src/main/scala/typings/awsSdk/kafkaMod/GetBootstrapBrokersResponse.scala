package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBootstrapBrokersResponse extends StObject {
  
  /**
    * 
    A string containing one or more hostname:port pairs.
    
    */
  var BootstrapBrokerString: js.UndefOr[string] = js.undefined
  
  /**
    * 
    A string containing one or more DNS names (or IP) and Sasl Scram port pairs.
    
    */
  var BootstrapBrokerStringSaslScram: js.UndefOr[string] = js.undefined
  
  /**
    * 
    A string containing one or more DNS names (or IP) and TLS port pairs.
    
    */
  var BootstrapBrokerStringTls: js.UndefOr[string] = js.undefined
}
object GetBootstrapBrokersResponse {
  
  @scala.inline
  def apply(): GetBootstrapBrokersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBootstrapBrokersResponse]
  }
  
  @scala.inline
  implicit class GetBootstrapBrokersResponseMutableBuilder[Self <: GetBootstrapBrokersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBootstrapBrokerString(value: string): Self = StObject.set(x, "BootstrapBrokerString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapBrokerStringSaslScram(value: string): Self = StObject.set(x, "BootstrapBrokerStringSaslScram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapBrokerStringSaslScramUndefined: Self = StObject.set(x, "BootstrapBrokerStringSaslScram", js.undefined)
    
    @scala.inline
    def setBootstrapBrokerStringTls(value: string): Self = StObject.set(x, "BootstrapBrokerStringTls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapBrokerStringTlsUndefined: Self = StObject.set(x, "BootstrapBrokerStringTls", js.undefined)
    
    @scala.inline
    def setBootstrapBrokerStringUndefined: Self = StObject.set(x, "BootstrapBrokerString", js.undefined)
  }
}
