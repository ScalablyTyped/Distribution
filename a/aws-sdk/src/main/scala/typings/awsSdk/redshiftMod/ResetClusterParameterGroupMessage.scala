package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetClusterParameterGroupMessage extends js.Object {
  
  /**
    * The name of the cluster parameter group to be reset.
    */
  var ParameterGroupName: String = js.native
  
  /**
    * An array of names of parameters to be reset. If ResetAllParameters option is not used, then at least one parameter name must be supplied.  Constraints: A maximum of 20 parameters can be reset in a single request.
    */
  var Parameters: js.UndefOr[ParametersList] = js.native
  
  /**
    * If true, all parameters in the specified parameter group will be reset to their default values.  Default: true 
    */
  var ResetAllParameters: js.UndefOr[Boolean] = js.native
}
object ResetClusterParameterGroupMessage {
  
  @scala.inline
  def apply(ParameterGroupName: String): ResetClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetClusterParameterGroupMessage]
  }
  
  @scala.inline
  implicit class ResetClusterParameterGroupMessageOps[Self <: ResetClusterParameterGroupMessage] (val x: Self) extends AnyVal {
    
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
    def setParameterGroupName(value: String): Self = this.set("ParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = this.set("Parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: ParametersList): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setResetAllParameters(value: Boolean): Self = this.set("ResetAllParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetAllParameters: Self = this.set("ResetAllParameters", js.undefined)
  }
}
