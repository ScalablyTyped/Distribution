package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTerminologyRequest extends StObject {
  
  /**
    * The name of the custom terminology being deleted. 
    */
  var Name: ResourceName
}
object DeleteTerminologyRequest {
  
  inline def apply(Name: ResourceName): DeleteTerminologyRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTerminologyRequest]
  }
  
  extension [Self <: DeleteTerminologyRequest](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
