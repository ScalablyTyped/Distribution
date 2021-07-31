package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterResult extends StObject {
  
  /**
    * Information about a specific cluster, including shipping information, cluster status, and other important metadata.
    */
  var ClusterMetadata: js.UndefOr[typings.awsSdk.snowballMod.ClusterMetadata] = js.undefined
}
object DescribeClusterResult {
  
  @scala.inline
  def apply(): DescribeClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterResult]
  }
  
  @scala.inline
  implicit class DescribeClusterResultMutableBuilder[Self <: DescribeClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterMetadata(value: ClusterMetadata): Self = StObject.set(x, "ClusterMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterMetadataUndefined: Self = StObject.set(x, "ClusterMetadata", js.undefined)
  }
}
