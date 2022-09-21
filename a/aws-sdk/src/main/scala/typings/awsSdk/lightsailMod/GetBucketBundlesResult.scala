package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketBundlesResult extends StObject {
  
  /**
    * An object that describes bucket bundles.
    */
  var bundles: js.UndefOr[BucketBundleList] = js.undefined
}
object GetBucketBundlesResult {
  
  inline def apply(): GetBucketBundlesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketBundlesResult]
  }
  
  extension [Self <: GetBucketBundlesResult](x: Self) {
    
    inline def setBundles(value: BucketBundleList): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    inline def setBundlesVarargs(value: BucketBundle*): Self = StObject.set(x, "bundles", js.Array(value*))
  }
}
