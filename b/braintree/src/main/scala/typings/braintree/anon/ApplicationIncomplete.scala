package typings.braintree.anon

import typings.braintree.braintreeStrings.application_incomplete
import typings.braintree.braintreeStrings.avs
import typings.braintree.braintreeStrings.avs_and_cvv
import typings.braintree.braintreeStrings.cvv
import typings.braintree.braintreeStrings.duplicate
import typings.braintree.braintreeStrings.fraud
import typings.braintree.braintreeStrings.risk_threshold
import typings.braintree.braintreeStrings.three_d_secure
import typings.braintree.braintreeStrings.token_issuance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationIncomplete extends StObject {
  
  var ApplicationIncomplete: application_incomplete
  
  var Avs: avs
  
  var AvsAndCvv: avs_and_cvv
  
  var Cvv: cvv
  
  var Duplicate: duplicate
  
  var Fraud: fraud
  
  var RiskThreshold: risk_threshold
  
  var ThreeDSecure: three_d_secure
  
  var TokenIssuance: token_issuance
}
object ApplicationIncomplete {
  
  inline def apply(): ApplicationIncomplete = {
    val __obj = js.Dynamic.literal(ApplicationIncomplete = "application_incomplete", Avs = "avs", AvsAndCvv = "avs_and_cvv", Cvv = "cvv", Duplicate = "duplicate", Fraud = "fraud", RiskThreshold = "risk_threshold", ThreeDSecure = "three_d_secure", TokenIssuance = "token_issuance")
    __obj.asInstanceOf[ApplicationIncomplete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationIncomplete] (val x: Self) extends AnyVal {
    
    inline def setApplicationIncomplete(value: application_incomplete): Self = StObject.set(x, "ApplicationIncomplete", value.asInstanceOf[js.Any])
    
    inline def setAvs(value: avs): Self = StObject.set(x, "Avs", value.asInstanceOf[js.Any])
    
    inline def setAvsAndCvv(value: avs_and_cvv): Self = StObject.set(x, "AvsAndCvv", value.asInstanceOf[js.Any])
    
    inline def setCvv(value: cvv): Self = StObject.set(x, "Cvv", value.asInstanceOf[js.Any])
    
    inline def setDuplicate(value: duplicate): Self = StObject.set(x, "Duplicate", value.asInstanceOf[js.Any])
    
    inline def setFraud(value: fraud): Self = StObject.set(x, "Fraud", value.asInstanceOf[js.Any])
    
    inline def setRiskThreshold(value: risk_threshold): Self = StObject.set(x, "RiskThreshold", value.asInstanceOf[js.Any])
    
    inline def setThreeDSecure(value: three_d_secure): Self = StObject.set(x, "ThreeDSecure", value.asInstanceOf[js.Any])
    
    inline def setTokenIssuance(value: token_issuance): Self = StObject.set(x, "TokenIssuance", value.asInstanceOf[js.Any])
  }
}
