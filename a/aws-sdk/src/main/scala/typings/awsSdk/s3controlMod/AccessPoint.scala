package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessPoint extends js.Object {
  
  /**
    * The ARN for the access point.
    */
  var AccessPointArn: js.UndefOr[S3AccessPointArn] = js.native
  
  /**
    * The name of the bucket associated with this access point.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The name of this access point.
    */
  var Name: AccessPointName = js.native
  
  /**
    * Indicates whether this access point allows access from the public internet. If VpcConfiguration is specified for this access point, then NetworkOrigin is VPC, and the access point doesn't allow access from the public internet. Otherwise, NetworkOrigin is Internet, and the access point allows access from the public internet, subject to the access point and bucket access policies.
    */
  var NetworkOrigin: typings.awsSdk.s3controlMod.NetworkOrigin = js.native
  
  /**
    * The virtual private cloud (VPC) configuration for this access point, if one exists.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.VpcConfiguration] = js.native
}
object AccessPoint {
  
  @scala.inline
  def apply(Bucket: BucketName, Name: AccessPointName, NetworkOrigin: NetworkOrigin): AccessPoint = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NetworkOrigin = NetworkOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPoint]
  }
  
  @scala.inline
  implicit class AccessPointOps[Self <: AccessPoint] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AccessPointName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkOrigin(value: NetworkOrigin): Self = this.set("NetworkOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPointArn(value: S3AccessPointArn): Self = this.set("AccessPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessPointArn: Self = this.set("AccessPointArn", js.undefined)
    
    @scala.inline
    def setVpcConfiguration(value: VpcConfiguration): Self = this.set("VpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfiguration: Self = this.set("VpcConfiguration", js.undefined)
  }
}
