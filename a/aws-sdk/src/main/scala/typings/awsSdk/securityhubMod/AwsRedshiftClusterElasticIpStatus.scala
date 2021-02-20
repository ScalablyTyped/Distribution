package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterElasticIpStatus extends StObject {
  
  /**
    * The elastic IP address for the cluster.
    */
  var ElasticIp: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the elastic IP address.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsRedshiftClusterElasticIpStatus {
  
  @scala.inline
  def apply(): AwsRedshiftClusterElasticIpStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterElasticIpStatus]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterElasticIpStatusMutableBuilder[Self <: AwsRedshiftClusterElasticIpStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticIp(value: NonEmptyString): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticIpUndefined: Self = StObject.set(x, "ElasticIp", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
