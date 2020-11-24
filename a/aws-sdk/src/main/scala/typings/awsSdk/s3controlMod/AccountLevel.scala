package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountLevel extends js.Object {
  
  /**
    * A container for the S3 Storage Lens activity metrics.
    */
  var ActivityMetrics: js.UndefOr[typings.awsSdk.s3controlMod.ActivityMetrics] = js.native
  
  /**
    * A container for the S3 Storage Lens bucket-level configuration.
    */
  var BucketLevel: typings.awsSdk.s3controlMod.BucketLevel = js.native
}
object AccountLevel {
  
  @scala.inline
  def apply(BucketLevel: BucketLevel): AccountLevel = {
    val __obj = js.Dynamic.literal(BucketLevel = BucketLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountLevel]
  }
  
  @scala.inline
  implicit class AccountLevelOps[Self <: AccountLevel] (val x: Self) extends AnyVal {
    
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
    def setBucketLevel(value: BucketLevel): Self = this.set("BucketLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityMetrics(value: ActivityMetrics): Self = this.set("ActivityMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityMetrics: Self = this.set("ActivityMetrics", js.undefined)
  }
}
