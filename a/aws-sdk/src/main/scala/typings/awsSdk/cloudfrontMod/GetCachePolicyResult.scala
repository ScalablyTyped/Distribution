package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCachePolicyResult extends StObject {
  
  /**
    * The cache policy.
    */
  var CachePolicy: js.UndefOr[typings.awsSdk.cloudfrontMod.CachePolicy] = js.native
  
  /**
    * The current version of the cache policy.
    */
  var ETag: js.UndefOr[String] = js.native
}
object GetCachePolicyResult {
  
  @scala.inline
  def apply(): GetCachePolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCachePolicyResult]
  }
  
  @scala.inline
  implicit class GetCachePolicyResultMutableBuilder[Self <: GetCachePolicyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachePolicy(value: CachePolicy): Self = StObject.set(x, "CachePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachePolicyUndefined: Self = StObject.set(x, "CachePolicy", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}
