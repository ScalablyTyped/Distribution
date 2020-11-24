package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeServiceActionExecutionParametersOutput extends js.Object {
  
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
  implicit class DescribeServiceActionExecutionParametersOutputOps[Self <: DescribeServiceActionExecutionParametersOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setServiceActionParametersVarargs(value: ExecutionParameter*): Self = this.set("ServiceActionParameters", js.Array(value :_*))
    
    @scala.inline
    def setServiceActionParameters(value: ExecutionParameters): Self = this.set("ServiceActionParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceActionParameters: Self = this.set("ServiceActionParameters", js.undefined)
  }
}
