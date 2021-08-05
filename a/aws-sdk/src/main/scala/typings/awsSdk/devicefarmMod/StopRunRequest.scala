package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRunRequest extends StObject {
  
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm run to stop.
    */
  var arn: AmazonResourceName
}
object StopRunRequest {
  
  inline def apply(arn: AmazonResourceName): StopRunRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRunRequest]
  }
  
  extension [Self <: StopRunRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
