package typings.awsSdk.migrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaEndpointConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda endpoint. 
    */
  var Arn: js.UndefOr[LambdaArn] = js.undefined
}
object LambdaEndpointConfig {
  
  inline def apply(): LambdaEndpointConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaEndpointConfig]
  }
  
  extension [Self <: LambdaEndpointConfig](x: Self) {
    
    inline def setArn(value: LambdaArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
