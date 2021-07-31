package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableRestoreStatusMessage extends StObject {
  
  /**
    * The Amazon Redshift cluster that the table is being restored to.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * An optional pagination token provided by a previous DescribeTableRestoreStatus request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by the MaxRecords parameter.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The identifier of the table restore request to return status for. If you don't specify a TableRestoreRequestId value, then DescribeTableRestoreStatus returns the status of all in-progress table restore requests.
    */
  var TableRestoreRequestId: js.UndefOr[String] = js.undefined
}
object DescribeTableRestoreStatusMessage {
  
  @scala.inline
  def apply(): DescribeTableRestoreStatusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableRestoreStatusMessage]
  }
  
  @scala.inline
  implicit class DescribeTableRestoreStatusMessageMutableBuilder[Self <: DescribeTableRestoreStatusMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setTableRestoreRequestId(value: String): Self = StObject.set(x, "TableRestoreRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRestoreRequestIdUndefined: Self = StObject.set(x, "TableRestoreRequestId", js.undefined)
  }
}
