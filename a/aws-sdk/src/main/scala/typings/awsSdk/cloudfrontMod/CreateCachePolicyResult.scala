package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCachePolicyResult extends StObject {
  
  /**
    * A cache policy.
    */
  var CachePolicy: js.UndefOr[typings.awsSdk.cloudfrontMod.CachePolicy] = js.undefined
  
  /**
    * The current version of the cache policy.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The fully qualified URI of the cache policy just created.
    */
  var Location: js.UndefOr[String] = js.undefined
}
object CreateCachePolicyResult {
  
  inline def apply(): CreateCachePolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCachePolicyResult]
  }
  
  extension [Self <: CreateCachePolicyResult](x: Self) {
    
    inline def setCachePolicy(value: CachePolicy): Self = StObject.set(x, "CachePolicy", value.asInstanceOf[js.Any])
    
    inline def setCachePolicyUndefined: Self = StObject.set(x, "CachePolicy", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
