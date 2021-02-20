package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClusterOutput extends StObject {
  
  /**
    * This output contains the details for the requested cluster.
    */
  var Cluster: js.UndefOr[typings.awsSdk.emrMod.Cluster] = js.native
}
object DescribeClusterOutput {
  
  @scala.inline
  def apply(): DescribeClusterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterOutput]
  }
  
  @scala.inline
  implicit class DescribeClusterOutputMutableBuilder[Self <: DescribeClusterOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
