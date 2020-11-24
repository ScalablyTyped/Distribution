package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLocationEfsResponse extends js.Object {
  
  /**
    * The time that the EFS location was created.
    */
  var CreationTime: js.UndefOr[Time] = js.native
  
  var Ec2Config: js.UndefOr[typings.awsSdk.datasyncMod.Ec2Config] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the EFS location that was described.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
  
  /**
    * The URL of the EFS location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.native
}
object DescribeLocationEfsResponse {
  
  @scala.inline
  def apply(): DescribeLocationEfsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationEfsResponse]
  }
  
  @scala.inline
  implicit class DescribeLocationEfsResponseOps[Self <: DescribeLocationEfsResponse] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: Time): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setEc2Config(value: Ec2Config): Self = this.set("Ec2Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2Config: Self = this.set("Ec2Config", js.undefined)
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = this.set("LocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationArn: Self = this.set("LocationArn", js.undefined)
    
    @scala.inline
    def setLocationUri(value: LocationUri): Self = this.set("LocationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationUri: Self = this.set("LocationUri", js.undefined)
  }
}
