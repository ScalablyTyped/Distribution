package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLevel extends StObject {
  
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
  implicit class BucketLevelMutableBuilder[Self <: BucketLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityMetrics(value: ActivityMetrics): Self = StObject.set(x, "ActivityMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityMetricsUndefined: Self = StObject.set(x, "ActivityMetrics", js.undefined)
    
    @scala.inline
    def setPrefixLevel(value: PrefixLevel): Self = StObject.set(x, "PrefixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixLevelUndefined: Self = StObject.set(x, "PrefixLevel", js.undefined)
  }
}
