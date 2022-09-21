package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * A configuration for an AWS Lambda channel.
    */
  var LambdaConfiguration: js.UndefOr[typings.awsSdk.lookoutmetricsMod.LambdaConfiguration] = js.undefined
  
  /**
    * A configuration for an Amazon SNS channel.
    */
  var SNSConfiguration: js.UndefOr[typings.awsSdk.lookoutmetricsMod.SNSConfiguration] = js.undefined
}
object Action {
  
  inline def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setLambdaConfiguration(value: LambdaConfiguration): Self = StObject.set(x, "LambdaConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLambdaConfigurationUndefined: Self = StObject.set(x, "LambdaConfiguration", js.undefined)
    
    inline def setSNSConfiguration(value: SNSConfiguration): Self = StObject.set(x, "SNSConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSNSConfigurationUndefined: Self = StObject.set(x, "SNSConfiguration", js.undefined)
  }
}
