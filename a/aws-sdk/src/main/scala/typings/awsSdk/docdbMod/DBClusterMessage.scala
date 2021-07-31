package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterMessage extends StObject {
  
  /**
    * A list of clusters.
    */
  var DBClusters: js.UndefOr[DBClusterList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBClusterMessage {
  
  @scala.inline
  def apply(): DBClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterMessage]
  }
  
  @scala.inline
  implicit class DBClusterMessageMutableBuilder[Self <: DBClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusters(value: DBClusterList): Self = StObject.set(x, "DBClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClustersUndefined: Self = StObject.set(x, "DBClusters", js.undefined)
    
    @scala.inline
    def setDBClustersVarargs(value: DBCluster*): Self = StObject.set(x, "DBClusters", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
