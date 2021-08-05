package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersRequest extends StObject {
  
  /**
    * The names of the parameters to delete.
    */
  var Names: ParameterNameList
}
object DeleteParametersRequest {
  
  inline def apply(Names: ParameterNameList): DeleteParametersRequest = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersRequest]
  }
  
  extension [Self <: DeleteParametersRequest](x: Self) {
    
    inline def setNames(value: ParameterNameList): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: PSParameterName*): Self = StObject.set(x, "Names", js.Array(value :_*))
  }
}
