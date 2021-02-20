package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterSummary extends StObject {
  
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.native
  
  /**
    * The unique identifier for the cluster.
    */
  var Id: js.UndefOr[ClusterId] = js.native
  
  /**
    * The name of the cluster.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly four times more expensive would result in the normalized instance hours being incremented by four. This result is only an approximation and does not reflect the actual billing rate.
    */
  var NormalizedInstanceHours: js.UndefOr[Integer] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of the Outpost where the cluster is launched. 
    */
  var OutpostArn: js.UndefOr[OptionalArnType] = js.native
  
  /**
    * The details about the current status of the cluster.
    */
  var Status: js.UndefOr[ClusterStatus] = js.native
}
object ClusterSummary {
  
  @scala.inline
  def apply(): ClusterSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSummary]
  }
  
  @scala.inline
  implicit class ClusterSummaryMutableBuilder[Self <: ClusterSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: ArnType): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    @scala.inline
    def setId(value: ClusterId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNormalizedInstanceHours(value: Integer): Self = StObject.set(x, "NormalizedInstanceHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedInstanceHoursUndefined: Self = StObject.set(x, "NormalizedInstanceHours", js.undefined)
    
    @scala.inline
    def setOutpostArn(value: OptionalArnType): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    @scala.inline
    def setStatus(value: ClusterStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
