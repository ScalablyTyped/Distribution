package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exclude extends StObject {
  
  /**
    * A container for the S3 Storage Lens bucket excludes.
    */
  var Buckets: js.UndefOr[typings.awsSdk.s3controlMod.Buckets] = js.undefined
  
  /**
    * A container for the S3 Storage Lens Region excludes.
    */
  var Regions: js.UndefOr[typings.awsSdk.s3controlMod.Regions] = js.undefined
}
object Exclude {
  
  @scala.inline
  def apply(): Exclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exclude]
  }
  
  @scala.inline
  implicit class ExcludeMutableBuilder[Self <: Exclude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: Buckets): Self = StObject.set(x, "Buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "Buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: S3BucketArnString*): Self = StObject.set(x, "Buckets", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: Regions): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "Regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: S3AWSRegion*): Self = StObject.set(x, "Regions", js.Array(value :_*))
  }
}
