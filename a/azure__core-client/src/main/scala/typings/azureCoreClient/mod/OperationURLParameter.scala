package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationURLParameter
  extends StObject
     with OperationParameter {
  
  /**
    * Whether or not to skip encoding the URL parameter's value before adding it to the URL.
    */
  var skipEncoding: js.UndefOr[Boolean] = js.undefined
}
object OperationURLParameter {
  
  inline def apply(mapper: Mapper, parameterPath: ParameterPath): OperationURLParameter = {
    val __obj = js.Dynamic.literal(mapper = mapper.asInstanceOf[js.Any], parameterPath = parameterPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationURLParameter]
  }
  
  extension [Self <: OperationURLParameter](x: Self) {
    
    inline def setSkipEncoding(value: Boolean): Self = StObject.set(x, "skipEncoding", value.asInstanceOf[js.Any])
    
    inline def setSkipEncodingUndefined: Self = StObject.set(x, "skipEncoding", js.undefined)
  }
}
