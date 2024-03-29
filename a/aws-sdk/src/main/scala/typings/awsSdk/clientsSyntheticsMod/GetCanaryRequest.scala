package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCanaryRequest extends StObject {
  
  /**
    * The name of the canary that you want details for.
    */
  var Name: CanaryName
}
object GetCanaryRequest {
  
  inline def apply(Name: CanaryName): GetCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCanaryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCanaryRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: CanaryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
