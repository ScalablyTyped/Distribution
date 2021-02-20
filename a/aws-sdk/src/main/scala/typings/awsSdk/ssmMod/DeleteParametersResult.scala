package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteParametersResult extends StObject {
  
  /**
    * The names of the deleted parameters.
    */
  var DeletedParameters: js.UndefOr[ParameterNameList] = js.native
  
  /**
    * The names of parameters that weren't deleted because the parameters are not valid.
    */
  var InvalidParameters: js.UndefOr[ParameterNameList] = js.native
}
object DeleteParametersResult {
  
  @scala.inline
  def apply(): DeleteParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteParametersResult]
  }
  
  @scala.inline
  implicit class DeleteParametersResultMutableBuilder[Self <: DeleteParametersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedParameters(value: ParameterNameList): Self = StObject.set(x, "DeletedParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedParametersUndefined: Self = StObject.set(x, "DeletedParameters", js.undefined)
    
    @scala.inline
    def setDeletedParametersVarargs(value: PSParameterName*): Self = StObject.set(x, "DeletedParameters", js.Array(value :_*))
    
    @scala.inline
    def setInvalidParameters(value: ParameterNameList): Self = StObject.set(x, "InvalidParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidParametersUndefined: Self = StObject.set(x, "InvalidParameters", js.undefined)
    
    @scala.inline
    def setInvalidParametersVarargs(value: PSParameterName*): Self = StObject.set(x, "InvalidParameters", js.Array(value :_*))
  }
}
