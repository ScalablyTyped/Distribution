package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterPublisherInput extends StObject {
  
  /**
    * Whether you accept the Terms and Conditions for publishing extensions in the CloudFormation registry. You must accept the terms and conditions in order to register to publish public extensions to the CloudFormation registry. The default is false.
    */
  var AcceptTermsAndConditions: js.UndefOr[typings.awsSdk.cloudformationMod.AcceptTermsAndConditions] = js.undefined
  
  /**
    * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource Name (ARN) for your connection to that account. For more information, see Registering your account to publish CloudFormation extensions in the CloudFormation CLI User Guide.
    */
  var ConnectionArn: js.UndefOr[typings.awsSdk.cloudformationMod.ConnectionArn] = js.undefined
}
object RegisterPublisherInput {
  
  inline def apply(): RegisterPublisherInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterPublisherInput]
  }
  
  extension [Self <: RegisterPublisherInput](x: Self) {
    
    inline def setAcceptTermsAndConditions(value: AcceptTermsAndConditions): Self = StObject.set(x, "AcceptTermsAndConditions", value.asInstanceOf[js.Any])
    
    inline def setAcceptTermsAndConditionsUndefined: Self = StObject.set(x, "AcceptTermsAndConditions", js.undefined)
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setConnectionArnUndefined: Self = StObject.set(x, "ConnectionArn", js.undefined)
  }
}
