package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBucketConfiguration extends js.Object {
  
  /**
    * Specifies the Region where the bucket will be created. If you don't specify a Region, the bucket is created in the US East (N. Virginia) Region (us-east-1).
    */
  var LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.native
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
    def setLocationConstraint(value: BucketLocationConstraint): Self = this.set("LocationConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationConstraint: Self = this.set("LocationConstraint", js.undefined)
  }
}
