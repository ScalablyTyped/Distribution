package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalClustersMessage extends StObject {
  
  /**
    *  The list of global clusters returned by this request. 
    */
  var GlobalClusters: js.UndefOr[GlobalClusterList] = js.native
  
  /**
    *  An optional pagination token provided by a previous DescribeGlobalClusters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object GlobalClustersMessage {
  
  @scala.inline
  def apply(): GlobalClustersMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalClustersMessage]
  }
  
  @scala.inline
  implicit class GlobalClustersMessageMutableBuilder[Self <: GlobalClustersMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalClusters(value: GlobalClusterList): Self = StObject.set(x, "GlobalClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalClustersUndefined: Self = StObject.set(x, "GlobalClusters", js.undefined)
    
    @scala.inline
    def setGlobalClustersVarargs(value: GlobalCluster*): Self = StObject.set(x, "GlobalClusters", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
