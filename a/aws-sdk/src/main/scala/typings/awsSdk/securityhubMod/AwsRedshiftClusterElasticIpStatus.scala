package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterElasticIpStatus extends js.Object {
  
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
  implicit class AwsRedshiftClusterElasticIpStatusOps[Self <: AwsRedshiftClusterElasticIpStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElasticIp(value: NonEmptyString): Self = this.set("ElasticIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticIp: Self = this.set("ElasticIp", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
