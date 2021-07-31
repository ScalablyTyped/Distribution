package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyRotationStatusResponse extends StObject {
  
  /**
    * A Boolean value that specifies whether key rotation is enabled.
    */
  var KeyRotationEnabled: js.UndefOr[BooleanType] = js.undefined
}
object GetKeyRotationStatusResponse {
  
  @scala.inline
  def apply(): GetKeyRotationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyRotationStatusResponse]
  }
  
  @scala.inline
  implicit class GetKeyRotationStatusResponseMutableBuilder[Self <: GetKeyRotationStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyRotationEnabled(value: BooleanType): Self = StObject.set(x, "KeyRotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyRotationEnabledUndefined: Self = StObject.set(x, "KeyRotationEnabled", js.undefined)
  }
}
