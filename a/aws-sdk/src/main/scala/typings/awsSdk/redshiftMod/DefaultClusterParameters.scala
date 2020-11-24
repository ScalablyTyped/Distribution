package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultClusterParameters extends js.Object {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The name of the cluster parameter group family to which the engine default parameters apply.
    */
  var ParameterGroupFamily: js.UndefOr[String] = js.native
  
  /**
    * The list of cluster default parameters.
    */
  var Parameters: js.UndefOr[ParametersList] = js.native
}
object DefaultClusterParameters {
  
  @scala.inline
  def apply(): DefaultClusterParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultClusterParameters]
  }
  
  @scala.inline
  implicit class DefaultClusterParametersOps[Self <: DefaultClusterParameters] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setParameterGroupFamily(value: String): Self = this.set("ParameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterGroupFamily: Self = this.set("ParameterGroupFamily", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = this.set("Parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: ParametersList): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
  }
}
