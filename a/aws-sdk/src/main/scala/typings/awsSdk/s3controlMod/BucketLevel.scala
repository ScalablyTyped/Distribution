package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLevel extends js.Object {
  
  /**
    * A container for the bucket-level activity metrics for Amazon S3 Storage Lens
    */
  var ActivityMetrics: js.UndefOr[typings.awsSdk.s3controlMod.ActivityMetrics] = js.native
  
  /**
    * A container for the bucket-level prefix-level metrics for S3 Storage Lens
    */
  var PrefixLevel: js.UndefOr[typings.awsSdk.s3controlMod.PrefixLevel] = js.native
}
object BucketLevel {
  
  @scala.inline
  def apply(): BucketLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLevel]
  }
  
  @scala.inline
  implicit class BucketLevelOps[Self <: BucketLevel] (val x: Self) extends AnyVal {
    
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
    def setActivityMetrics(value: ActivityMetrics): Self = this.set("ActivityMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityMetrics: Self = this.set("ActivityMetrics", js.undefined)
    
    @scala.inline
    def setPrefixLevel(value: PrefixLevel): Self = this.set("PrefixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixLevel: Self = this.set("PrefixLevel", js.undefined)
  }
}
