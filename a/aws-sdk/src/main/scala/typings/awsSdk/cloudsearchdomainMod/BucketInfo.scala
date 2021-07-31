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
  
  @scala.inline
  def apply(): BucketInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketInfo]
  }
  
  @scala.inline
  implicit class BucketInfoMutableBuilder[Self <: BucketInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: BucketList): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: Bucket*): Self = StObject.set(x, "buckets", js.Array(value :_*))
  }
}
