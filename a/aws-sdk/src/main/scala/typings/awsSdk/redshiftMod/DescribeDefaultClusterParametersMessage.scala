package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDefaultClusterParametersMessage extends StObject {
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeDefaultClusterParameters request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The name of the cluster parameter group family.
    */
  var ParameterGroupFamily: String
}
object DescribeDefaultClusterParametersMessage {
  
  @scala.inline
  def apply(ParameterGroupFamily: String): DescribeDefaultClusterParametersMessage = {
    val __obj = js.Dynamic.literal(ParameterGroupFamily = ParameterGroupFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDefaultClusterParametersMessage]
  }
  
  @scala.inline
  implicit class DescribeDefaultClusterParametersMessageMutableBuilder[Self <: DescribeDefaultClusterParametersMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setParameterGroupFamily(value: String): Self = StObject.set(x, "ParameterGroupFamily", value.asInstanceOf[js.Any])
  }
}
