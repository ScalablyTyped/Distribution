package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketInfo extends StObject {
  
  /**
    * A list of the calculated facet values and counts.
    */
  var buckets: js.UndefOr[BucketList] = js.undefined
}
object BucketInfo {
  
  inline def apply(): BucketInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketInfo]
  }
  
  extension [Self <: BucketInfo](x: Self) {
    
    inline def setBuckets(value: BucketList): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: Bucket*): Self = StObject.set(x, "buckets", js.Array(value :_*))
  }
}
