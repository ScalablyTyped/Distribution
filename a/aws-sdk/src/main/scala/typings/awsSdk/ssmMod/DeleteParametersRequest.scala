package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteParametersRequest extends StObject {
  
  /**
    * The names of the parameters to delete.
    */
  var Names: ParameterNameList = js.native
}
object DeleteParametersRequest {
  
  @scala.inline
  def apply(Names: ParameterNameList): DeleteParametersRequest = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersRequest]
  }
  
  @scala.inline
  implicit class DeleteParametersRequestMutableBuilder[Self <: DeleteParametersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: ParameterNameList): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: PSParameterName*): Self = StObject.set(x, "Names", js.Array(value :_*))
  }
}
