package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProtectionResponse extends StObject {
  
  /**
    * The unique identifier (ID) for the Protection object that is created.
    */
  var ProtectionId: js.UndefOr[typings.awsSdk.shieldMod.ProtectionId] = js.native
}
object CreateProtectionResponse {
  
  @scala.inline
  def apply(): CreateProtectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProtectionResponse]
  }
  
  @scala.inline
  implicit class CreateProtectionResponseMutableBuilder[Self <: CreateProtectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectionId(value: ProtectionId): Self = StObject.set(x, "ProtectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionIdUndefined: Self = StObject.set(x, "ProtectionId", js.undefined)
  }
}
