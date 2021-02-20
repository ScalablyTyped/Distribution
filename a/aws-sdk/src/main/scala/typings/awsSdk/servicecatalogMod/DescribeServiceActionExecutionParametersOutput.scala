package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeServiceActionExecutionParametersOutput extends StObject {
  
  /**
    * The parameters of the self-service action.
    */
  var ServiceActionParameters: js.UndefOr[ExecutionParameters] = js.native
}
object DescribeServiceActionExecutionParametersOutput {
  
  @scala.inline
  def apply(): DescribeServiceActionExecutionParametersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceActionExecutionParametersOutput]
  }
  
  @scala.inline
  implicit class DescribeServiceActionExecutionParametersOutputMutableBuilder[Self <: DescribeServiceActionExecutionParametersOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceActionParameters(value: ExecutionParameters): Self = StObject.set(x, "ServiceActionParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceActionParametersUndefined: Self = StObject.set(x, "ServiceActionParameters", js.undefined)
    
    @scala.inline
    def setServiceActionParametersVarargs(value: ExecutionParameter*): Self = StObject.set(x, "ServiceActionParameters", js.Array(value :_*))
  }
}
