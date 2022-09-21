package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopCanaryRequest extends StObject {
  
  /**
    * The name of the canary that you want to stop. To find the names of your canaries, use ListCanaries.
    */
  var Name: CanaryName
}
object StopCanaryRequest {
  
  inline def apply(Name: CanaryName): StopCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopCanaryRequest]
  }
  
  extension [Self <: StopCanaryRequest](x: Self) {
    
    inline def setName(value: CanaryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
