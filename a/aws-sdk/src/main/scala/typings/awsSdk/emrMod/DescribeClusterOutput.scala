package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClusterOutput extends js.Object {
  
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
  implicit class DescribeClusterOutputOps[Self <: DescribeClusterOutput] (val x: Self) extends AnyVal {
    
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
    def setCluster(value: Cluster): Self = this.set("Cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCluster: Self = this.set("Cluster", js.undefined)
  }
}
