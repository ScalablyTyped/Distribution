package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOriginRequestPolicyResult extends StObject {
  
  /**
    * The current version of the origin request policy.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The fully qualified URI of the origin request policy just created.
    */
  var Location: js.UndefOr[String] = js.native
  
  /**
    * An origin request policy.
    */
  var OriginRequestPolicy: js.UndefOr[typings.awsSdk.cloudfrontMod.OriginRequestPolicy] = js.native
}
object CreateOriginRequestPolicyResult {
  
  @scala.inline
  def apply(): CreateOriginRequestPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOriginRequestPolicyResult]
  }
  
  @scala.inline
  implicit class CreateOriginRequestPolicyResultMutableBuilder[Self <: CreateOriginRequestPolicyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    @scala.inline
    def setOriginRequestPolicy(value: OriginRequestPolicy): Self = StObject.set(x, "OriginRequestPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginRequestPolicyUndefined: Self = StObject.set(x, "OriginRequestPolicy", js.undefined)
  }
}
