package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationParameter extends StObject {
  
  /**
    * The mapper that defines how to validate and serialize this parameter's value.
    */
  var mapper: Mapper
  
  /**
    * The path to this parameter's value in OperationArguments or the object that contains paths for
    * each property's value in OperationArguments.
    */
  var parameterPath: ParameterPath
}
object OperationParameter {
  
  inline def apply(mapper: Mapper, parameterPath: ParameterPath): OperationParameter = {
    val __obj = js.Dynamic.literal(mapper = mapper.asInstanceOf[js.Any], parameterPath = parameterPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationParameter] (val x: Self) extends AnyVal {
    
    inline def setMapper(value: Mapper): Self = StObject.set(x, "mapper", value.asInstanceOf[js.Any])
    
    inline def setParameterPath(value: ParameterPath): Self = StObject.set(x, "parameterPath", value.asInstanceOf[js.Any])
    
    inline def setParameterPathVarargs(value: String*): Self = StObject.set(x, "parameterPath", js.Array(value*))
  }
}
