package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Resource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon S3 bucket.
    */
  var BucketArn: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * For export jobs, you can provide an optional KeyRange within a specific Amazon S3 bucket. The length of the range is defined at job creation, and has either an inclusive BeginMarker, an inclusive EndMarker, or both. Ranges are UTF-8 binary sorted.
    */
  var KeyRange: js.UndefOr[typings.awsSdk.snowballMod.KeyRange] = js.undefined
}
object S3Resource {
  
  inline def apply(): S3Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Resource]
  }
  
  extension [Self <: S3Resource](x: Self) {
    
    inline def setBucketArn(value: ResourceARN): Self = StObject.set(x, "BucketArn", value.asInstanceOf[js.Any])
    
    inline def setBucketArnUndefined: Self = StObject.set(x, "BucketArn", js.undefined)
    
    inline def setKeyRange(value: KeyRange): Self = StObject.set(x, "KeyRange", value.asInstanceOf[js.Any])
    
    inline def setKeyRangeUndefined: Self = StObject.set(x, "KeyRange", js.undefined)
  }
}
