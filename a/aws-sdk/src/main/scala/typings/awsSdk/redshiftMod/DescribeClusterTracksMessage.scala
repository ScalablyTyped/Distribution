package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClusterTracksMessage extends StObject {
  
  /**
    * The name of the maintenance track. 
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterTracks request exceed the value specified in MaxRecords, Amazon Redshift returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * An integer value for the maximum number of maintenance tracks to return.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}
object DescribeClusterTracksMessage {
  
  @scala.inline
  def apply(): DescribeClusterTracksMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterTracksMessage]
  }
  
  @scala.inline
  implicit class DescribeClusterTracksMessageMutableBuilder[Self <: DescribeClusterTracksMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaintenanceTrackName(value: String): Self = StObject.set(x, "MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceTrackNameUndefined: Self = StObject.set(x, "MaintenanceTrackName", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
