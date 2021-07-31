package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrderableClusterOptionsMessage extends StObject {
  
  /**
    * The version filter value. Specify this parameter to show only the available offerings matching the specified version. Default: All versions. Constraints: Must be one of the version returned from DescribeClusterVersions.
    */
  var ClusterVersion: js.UndefOr[String] = js.undefined
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeOrderableClusterOptions request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The node type filter value. Specify this parameter to show only the available offerings matching the specified node type.
    */
  var NodeType: js.UndefOr[String] = js.undefined
}
object DescribeOrderableClusterOptionsMessage {
  
  @scala.inline
  def apply(): DescribeOrderableClusterOptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrderableClusterOptionsMessage]
  }
  
  @scala.inline
  implicit class DescribeOrderableClusterOptionsMessageMutableBuilder[Self <: DescribeOrderableClusterOptionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterVersion(value: String): Self = StObject.set(x, "ClusterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterVersionUndefined: Self = StObject.set(x, "ClusterVersion", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
  }
}
