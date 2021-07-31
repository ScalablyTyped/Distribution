package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOriginRequestPolicyConfigResult extends StObject {
  
  /**
    * The current version of the origin request policy.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The origin request policy configuration.
    */
  var OriginRequestPolicyConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.OriginRequestPolicyConfig] = js.undefined
}
object GetOriginRequestPolicyConfigResult {
  
  @scala.inline
  def apply(): GetOriginRequestPolicyConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOriginRequestPolicyConfigResult]
  }
  
  @scala.inline
  implicit class GetOriginRequestPolicyConfigResultMutableBuilder[Self <: GetOriginRequestPolicyConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setOriginRequestPolicyConfig(value: OriginRequestPolicyConfig): Self = StObject.set(x, "OriginRequestPolicyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginRequestPolicyConfigUndefined: Self = StObject.set(x, "OriginRequestPolicyConfig", js.undefined)
  }
}
