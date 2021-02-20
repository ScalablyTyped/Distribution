package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountLevel extends StObject {
  
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
  implicit class AccountLevelMutableBuilder[Self <: AccountLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityMetrics(value: ActivityMetrics): Self = StObject.set(x, "ActivityMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityMetricsUndefined: Self = StObject.set(x, "ActivityMetrics", js.undefined)
    
    @scala.inline
    def setBucketLevel(value: BucketLevel): Self = StObject.set(x, "BucketLevel", value.asInstanceOf[js.Any])
  }
}
