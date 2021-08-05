package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopJobRequest extends StObject {
  
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm job to stop.
    */
  var arn: AmazonResourceName
}
object StopJobRequest {
  
  inline def apply(arn: AmazonResourceName): StopJobRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopJobRequest]
  }
  
  extension [Self <: StopJobRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
