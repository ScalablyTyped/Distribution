package typings.awsSdkClientS3Node.typesCreateBucketConfigurationMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.EU
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-northeast-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-south-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-southeast-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-southeast-2`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`cn-north-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`eu-central-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`eu-west-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`sa-east-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`us-west-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`us-west-2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBucketConfiguration extends js.Object {
  
  /**
    * <p>Specifies the region where the bucket will be created. If you don't specify a region, the bucket will be created in US Standard.</p>
    */
  var LocationConstraint: js.UndefOr[
    EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String
  ] = js.native
}
object CreateBucketConfiguration {
  
  @scala.inline
  def apply(): CreateBucketConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketConfiguration]
  }
  
  @scala.inline
  implicit class CreateBucketConfigurationOps[Self <: CreateBucketConfiguration] (val x: Self) extends AnyVal {
    
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
    def setLocationConstraint(
      value: EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String
    ): Self = this.set("LocationConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationConstraint: Self = this.set("LocationConstraint", js.undefined)
  }
}
