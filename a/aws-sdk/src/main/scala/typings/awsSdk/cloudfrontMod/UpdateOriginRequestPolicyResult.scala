package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateOriginRequestPolicyResult extends StObject {
  
  /**
    * The current version of the origin request policy.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * An origin request policy.
    */
  var OriginRequestPolicy: js.UndefOr[typings.awsSdk.cloudfrontMod.OriginRequestPolicy] = js.native
}
object UpdateOriginRequestPolicyResult {
  
  @scala.inline
  def apply(): UpdateOriginRequestPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOriginRequestPolicyResult]
  }
  
  @scala.inline
  implicit class UpdateOriginRequestPolicyResultMutableBuilder[Self <: UpdateOriginRequestPolicyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setOriginRequestPolicy(value: OriginRequestPolicy): Self = StObject.set(x, "OriginRequestPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginRequestPolicyUndefined: Self = StObject.set(x, "OriginRequestPolicy", js.undefined)
  }
}
