package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersResult extends StObject {
  
  /**
    * The names of the deleted parameters.
    */
  var DeletedParameters: js.UndefOr[ParameterNameList] = js.undefined
  
  /**
    * The names of parameters that weren't deleted because the parameters aren't valid.
    */
  var InvalidParameters: js.UndefOr[ParameterNameList] = js.undefined
}
object DeleteParametersResult {
  
  inline def apply(): DeleteParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteParametersResult]
  }
  
  extension [Self <: DeleteParametersResult](x: Self) {
    
    inline def setDeletedParameters(value: ParameterNameList): Self = StObject.set(x, "DeletedParameters", value.asInstanceOf[js.Any])
    
    inline def setDeletedParametersUndefined: Self = StObject.set(x, "DeletedParameters", js.undefined)
    
    inline def setDeletedParametersVarargs(value: PSParameterName*): Self = StObject.set(x, "DeletedParameters", js.Array(value*))
    
    inline def setInvalidParameters(value: ParameterNameList): Self = StObject.set(x, "InvalidParameters", value.asInstanceOf[js.Any])
    
    inline def setInvalidParametersUndefined: Self = StObject.set(x, "InvalidParameters", js.undefined)
    
    inline def setInvalidParametersVarargs(value: PSParameterName*): Self = StObject.set(x, "InvalidParameters", js.Array(value*))
  }
}
