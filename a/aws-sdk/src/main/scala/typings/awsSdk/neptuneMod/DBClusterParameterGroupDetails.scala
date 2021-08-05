package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterParameterGroupDetails extends StObject {
  
  /**
    *  An optional pagination token provided by a previous DescribeDBClusterParameters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords .
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * Provides a list of parameters for the DB cluster parameter group.
    */
  var Parameters: js.UndefOr[ParametersList] = js.undefined
}
object DBClusterParameterGroupDetails {
  
  inline def apply(): DBClusterParameterGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterParameterGroupDetails]
  }
  
  extension [Self <: DBClusterParameterGroupDetails](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setParameters(value: ParametersList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
  }
}
