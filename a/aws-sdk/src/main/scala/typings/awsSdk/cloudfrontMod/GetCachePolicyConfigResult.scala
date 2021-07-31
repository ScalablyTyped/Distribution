package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCachePolicyConfigResult extends StObject {
  
  /**
    * The cache policy configuration.
    */
  var CachePolicyConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.CachePolicyConfig] = js.undefined
  
  /**
    * The current version of the cache policy.
    */
  var ETag: js.UndefOr[String] = js.undefined
}
object GetCachePolicyConfigResult {
  
  @scala.inline
  def apply(): GetCachePolicyConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCachePolicyConfigResult]
  }
  
  @scala.inline
  implicit class GetCachePolicyConfigResultMutableBuilder[Self <: GetCachePolicyConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachePolicyConfig(value: CachePolicyConfig): Self = StObject.set(x, "CachePolicyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachePolicyConfigUndefined: Self = StObject.set(x, "CachePolicyConfig", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}
