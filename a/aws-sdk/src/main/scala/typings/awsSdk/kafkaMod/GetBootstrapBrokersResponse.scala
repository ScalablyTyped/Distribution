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
    A string that contains one or more DNS names (or IP addresses) and SASL IAM port pairs.
    
    */
  var BootstrapBrokerStringPublicSaslIam: js.UndefOr[string] = js.undefined
  
  /**
    * 
    A string containing one or more DNS names (or IP) and Sasl Scram port pairs.
    
    */
  var BootstrapBrokerStringPublicSaslScram: js.UndefOr[string] = js.undefined
  
  /**
    * 
    A string containing one or more DNS names (or IP) and TLS port pairs.
    
    */
  var BootstrapBrokerStringPublicTls: js.UndefOr[string] = js.undefined
  
  /**
    * 
    A string that contains one or more DNS names (or IP addresses) and SASL IAM port pairs.
    
    */
  var BootstrapBrokerStringSaslIam: js.UndefOr[string] = js.undefined
  
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
  
  inline def apply(): GetBootstrapBrokersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBootstrapBrokersResponse]
  }
  
  extension [Self <: GetBootstrapBrokersResponse](x: Self) {
    
    inline def setBootstrapBrokerString(value: string): Self = StObject.set(x, "BootstrapBrokerString", value.asInstanceOf[js.Any])
    
    inline def setBootstrapBrokerStringPublicSaslIam(value: string): Self = StObject.set(x, "BootstrapBrokerStringPublicSaslIam", value.asInstanceOf[js.Any])
    
    inline def setBootstrapBrokerStringPublicSaslIamUndefined: Self = StObject.set(x, "BootstrapBrokerStringPublicSaslIam", js.undefined)
    
    inline def setBootstrapBrokerStringPublicSaslScram(value: string): Self = StObject.set(x, "BootstrapBrokerStringPublicSaslScram", value.asInstanceOf[js.Any])
    
    inline def setBootstrapBrokerStringPublicSaslScramUndefined: Self = StObject.set(x, "BootstrapBrokerStringPublicSaslScram", js.undefined)
    
    inline def setBootstrapBrokerStringPublicTls(value: string): Self = StObject.set(x, "BootstrapBrokerStringPublicTls", value.asInstanceOf[js.Any])
    
    inline def setBootstrapBrokerStringPublicTlsUndefined: Self = StObject.set(x, "BootstrapBrokerStringPublicTls", js.undefined)
    
    inline def setBootstrapBrokerStringSaslIam(value: string): Self = StObject.set(x, "BootstrapBrokerStringSaslIam", value.asInstanceOf[js.Any])
    
    inline def setBootstrapBrokerStringSaslIamUndefined: Self = StObject.set(x, "BootstrapBrokerStringSaslIam", js.undefined)
    
    inline def setBootstrapBrokerStringSaslScram(value: string): Self = StObject.set(x, "BootstrapBrokerStringSaslScram", value.asInstanceOf[js.Any])
    
    inline def setBootstrapBrokerStringSaslScramUndefined: Self = StObject.set(x, "BootstrapBrokerStringSaslScram", js.undefined)
    
    inline def setBootstrapBrokerStringTls(value: string): Self = StObject.set(x, "BootstrapBrokerStringTls", value.asInstanceOf[js.Any])
    
    inline def setBootstrapBrokerStringTlsUndefined: Self = StObject.set(x, "BootstrapBrokerStringTls", js.undefined)
    
    inline def setBootstrapBrokerStringUndefined: Self = StObject.set(x, "BootstrapBrokerString", js.undefined)
  }
}
