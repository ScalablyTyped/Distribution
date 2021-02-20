package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheClusterMessage extends StObject {
  
  /**
    * A list of clusters. Each item in the list contains detailed information about one cluster.
    */
  var CacheClusters: js.UndefOr[CacheClusterList] = js.native
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
}
object CacheClusterMessage {
  
  @scala.inline
  def apply(): CacheClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheClusterMessage]
  }
  
  @scala.inline
  implicit class CacheClusterMessageMutableBuilder[Self <: CacheClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheClusters(value: CacheClusterList): Self = StObject.set(x, "CacheClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClustersUndefined: Self = StObject.set(x, "CacheClusters", js.undefined)
    
    @scala.inline
    def setCacheClustersVarargs(value: CacheCluster*): Self = StObject.set(x, "CacheClusters", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
