package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaAvailabilityProvider extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda that acts as the availability provider.
    */
  var LambdaArn: typings.awsSdk.clientsWorkmailMod.LambdaArn
}
object LambdaAvailabilityProvider {
  
  inline def apply(LambdaArn: LambdaArn): LambdaAvailabilityProvider = {
    val __obj = js.Dynamic.literal(LambdaArn = LambdaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaAvailabilityProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaAvailabilityProvider] (val x: Self) extends AnyVal {
    
    inline def setLambdaArn(value: LambdaArn): Self = StObject.set(x, "LambdaArn", value.asInstanceOf[js.Any])
  }
}
