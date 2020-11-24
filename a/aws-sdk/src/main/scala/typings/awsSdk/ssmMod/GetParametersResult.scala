package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetParametersResult extends js.Object {
  
  /**
    * A list of parameters that are not formatted correctly or do not run during an execution.
    */
  var InvalidParameters: js.UndefOr[ParameterNameList] = js.native
  
  /**
    * A list of details for a parameter.
    */
  var Parameters: js.UndefOr[ParameterList] = js.native
}
object GetParametersResult {
  
  @scala.inline
  def apply(): GetParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParametersResult]
  }
  
  @scala.inline
  implicit class GetParametersResultOps[Self <: GetParametersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInvalidParametersVarargs(value: PSParameterName*): Self = this.set("InvalidParameters", js.Array(value :_*))
    
    @scala.inline
    def setInvalidParameters(value: ParameterNameList): Self = this.set("InvalidParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidParameters: Self = this.set("InvalidParameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = this.set("Parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: ParameterList): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
  }
}
