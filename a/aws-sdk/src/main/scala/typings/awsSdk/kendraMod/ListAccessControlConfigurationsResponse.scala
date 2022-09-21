package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessControlConfigurationsResponse extends StObject {
  
  /**
    * The details of your access control configurations.
    */
  var AccessControlConfigurations: AccessControlConfigurationSummaryList
  
  /**
    * If the response is truncated, Amazon Kendra returns this token, which you can use in the subsequent request to retrieve the next set of access control configurations.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListAccessControlConfigurationsResponse {
  
  inline def apply(AccessControlConfigurations: AccessControlConfigurationSummaryList): ListAccessControlConfigurationsResponse = {
    val __obj = js.Dynamic.literal(AccessControlConfigurations = AccessControlConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessControlConfigurationsResponse]
  }
  
  extension [Self <: ListAccessControlConfigurationsResponse](x: Self) {
    
    inline def setAccessControlConfigurations(value: AccessControlConfigurationSummaryList): Self = StObject.set(x, "AccessControlConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAccessControlConfigurationsVarargs(value: AccessControlConfigurationSummary*): Self = StObject.set(x, "AccessControlConfigurations", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
