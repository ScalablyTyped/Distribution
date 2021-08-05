package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Include extends StObject {
  
  /**
    * A container for the S3 Storage Lens bucket includes.
    */
  var Buckets: js.UndefOr[typings.awsSdk.s3controlMod.Buckets] = js.undefined
  
  /**
    * A container for the S3 Storage Lens Region includes.
    */
  var Regions: js.UndefOr[typings.awsSdk.s3controlMod.Regions] = js.undefined
}
object Include {
  
  inline def apply(): Include = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Include]
  }
  
  extension [Self <: Include](x: Self) {
    
    inline def setBuckets(value: Buckets): Self = StObject.set(x, "Buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "Buckets", js.undefined)
    
    inline def setBucketsVarargs(value: S3BucketArnString*): Self = StObject.set(x, "Buckets", js.Array(value :_*))
    
    inline def setRegions(value: Regions): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "Regions", js.undefined)
    
    inline def setRegionsVarargs(value: S3AWSRegion*): Self = StObject.set(x, "Regions", js.Array(value :_*))
  }
}
