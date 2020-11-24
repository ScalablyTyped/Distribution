package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEcsClustersResult extends js.Object {
  
  /**
    * A list of EcsCluster objects containing the cluster descriptions.
    */
  var EcsClusters: js.UndefOr[typings.awsSdk.opsworksMod.EcsClusters] = js.native
  
  /**
    * If a paginated request does not return all of the remaining results, this parameter is set to a token that you can assign to the request object's NextToken parameter to retrieve the next set of results. If the previous paginated request returned all of the remaining results, this parameter is set to null.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeEcsClustersResult {
  
  @scala.inline
  def apply(): DescribeEcsClustersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEcsClustersResult]
  }
  
  @scala.inline
  implicit class DescribeEcsClustersResultOps[Self <: DescribeEcsClustersResult] (val x: Self) extends AnyVal {
    
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
    def setEcsClustersVarargs(value: EcsCluster*): Self = this.set("EcsClusters", js.Array(value :_*))
    
    @scala.inline
    def setEcsClusters(value: EcsClusters): Self = this.set("EcsClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcsClusters: Self = this.set("EcsClusters", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
