package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultClusterParameters extends StObject {
  
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
  implicit class DefaultClusterParametersMutableBuilder[Self <: DefaultClusterParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setParameterGroupFamily(value: String): Self = StObject.set(x, "ParameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupFamilyUndefined: Self = StObject.set(x, "ParameterGroupFamily", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
  }
}
