package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterMapping extends StObject {
  
  /**
    * Parameter name.
    */
  var Name: String
  
  var Type: typings.awsSdk.timestreamqueryMod.Type
}
object ParameterMapping {
  
  inline def apply(Name: String, Type: Type): ParameterMapping = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterMapping]
  }
  
  extension [Self <: ParameterMapping](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
