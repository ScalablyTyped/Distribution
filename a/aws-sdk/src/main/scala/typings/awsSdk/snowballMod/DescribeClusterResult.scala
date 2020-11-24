package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClusterResult extends js.Object {
  
  /**
    * Information about a specific cluster, including shipping information, cluster status, and other important metadata.
    */
  var ClusterMetadata: js.UndefOr[typings.awsSdk.snowballMod.ClusterMetadata] = js.native
}
object DescribeClusterResult {
  
  @scala.inline
  def apply(): DescribeClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterResult]
  }
  
  @scala.inline
  implicit class DescribeClusterResultOps[Self <: DescribeClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterMetadata(value: ClusterMetadata): Self = this.set("ClusterMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterMetadata: Self = this.set("ClusterMetadata", js.undefined)
  }
}
