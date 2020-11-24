package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exclude extends js.Object {
  
  /**
    * A container for the S3 Storage Lens bucket excludes.
    */
  var Buckets: js.UndefOr[typings.awsSdk.s3controlMod.Buckets] = js.native
  
  /**
    * A container for the S3 Storage Lens Region excludes.
    */
  var Regions: js.UndefOr[typings.awsSdk.s3controlMod.Regions] = js.native
}
object Exclude {
  
  @scala.inline
  def apply(): Exclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exclude]
  }
  
  @scala.inline
  implicit class ExcludeOps[Self <: Exclude] (val x: Self) extends AnyVal {
    
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
    def setBucketsVarargs(value: S3BucketArnString*): Self = this.set("Buckets", js.Array(value :_*))
    
    @scala.inline
    def setBuckets(value: Buckets): Self = this.set("Buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuckets: Self = this.set("Buckets", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: S3AWSRegion*): Self = this.set("Regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: Regions): Self = this.set("Regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("Regions", js.undefined)
  }
}
