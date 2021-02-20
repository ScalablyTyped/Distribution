package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetClusterParameterGroupMessage extends StObject {
  
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
  implicit class ResetClusterParameterGroupMessageMutableBuilder[Self <: ResetClusterParameterGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: ParametersList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
    
    @scala.inline
    def setResetAllParameters(value: Boolean): Self = StObject.set(x, "ResetAllParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetAllParametersUndefined: Self = StObject.set(x, "ResetAllParameters", js.undefined)
  }
}
