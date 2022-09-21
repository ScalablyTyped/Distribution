package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CachePolicySummary extends StObject {
  
  /**
    * The cache policy.
    */
  var CachePolicy: typings.awsSdk.cloudfrontMod.CachePolicy
  
  /**
    * The type of cache policy, either managed (created by Amazon Web Services) or custom (created in this Amazon Web Services account).
    */
  var Type: CachePolicyType
}
object CachePolicySummary {
  
  inline def apply(CachePolicy: CachePolicy, Type: CachePolicyType): CachePolicySummary = {
    val __obj = js.Dynamic.literal(CachePolicy = CachePolicy.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePolicySummary]
  }
  
  extension [Self <: CachePolicySummary](x: Self) {
    
    inline def setCachePolicy(value: CachePolicy): Self = StObject.set(x, "CachePolicy", value.asInstanceOf[js.Any])
    
    inline def setType(value: CachePolicyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
