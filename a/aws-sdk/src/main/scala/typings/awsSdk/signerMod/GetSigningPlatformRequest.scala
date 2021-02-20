package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSigningPlatformRequest extends StObject {
  
  /**
    * The ID of the target signing platform.
    */
  var platformId: PlatformId = js.native
}
object GetSigningPlatformRequest {
  
  @scala.inline
  def apply(platformId: PlatformId): GetSigningPlatformRequest = {
    val __obj = js.Dynamic.literal(platformId = platformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSigningPlatformRequest]
  }
  
  @scala.inline
  implicit class GetSigningPlatformRequestMutableBuilder[Self <: GetSigningPlatformRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatformId(value: PlatformId): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
  }
}
