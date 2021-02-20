package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCachePolicyResult extends StObject {
  
  /**
    * A cache policy.
    */
  var CachePolicy: js.UndefOr[typings.awsSdk.cloudfrontMod.CachePolicy] = js.native
  
  /**
    * The current version of the cache policy.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The fully qualified URI of the cache policy just created.
    */
  var Location: js.UndefOr[String] = js.native
}
object CreateCachePolicyResult {
  
  @scala.inline
  def apply(): CreateCachePolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCachePolicyResult]
  }
  
  @scala.inline
  implicit class CreateCachePolicyResultMutableBuilder[Self <: CreateCachePolicyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachePolicy(value: CachePolicy): Self = StObject.set(x, "CachePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachePolicyUndefined: Self = StObject.set(x, "CachePolicy", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
