package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCanaryRequest extends StObject {
  
  /**
    * The name of the canary that you want to run. To find canary names, use DescribeCanaries.
    */
  var Name: CanaryName
}
object StartCanaryRequest {
  
  inline def apply(Name: CanaryName): StartCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCanaryRequest]
  }
  
  extension [Self <: StartCanaryRequest](x: Self) {
    
    inline def setName(value: CanaryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
