package typings.awsSdk.mwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) returned in the response for the environment.
    */
  var Arn: js.UndefOr[EnvironmentArn] = js.undefined
}
object CreateEnvironmentOutput {
  
  inline def apply(): CreateEnvironmentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEnvironmentOutput]
  }
  
  extension [Self <: CreateEnvironmentOutput](x: Self) {
    
    inline def setArn(value: EnvironmentArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
