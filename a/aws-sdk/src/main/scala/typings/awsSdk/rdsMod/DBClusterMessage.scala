package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterMessage extends StObject {
  
  /**
    * Contains a list of DB clusters for the user.
    */
  var DBClusters: js.UndefOr[DBClusterList] = js.undefined
  
  /**
    * A pagination token that can be used in a later DescribeDBClusters request.
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
