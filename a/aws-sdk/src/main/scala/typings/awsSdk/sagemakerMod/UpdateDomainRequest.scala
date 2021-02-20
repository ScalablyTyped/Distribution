package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDomainRequest extends StObject {
  
  /**
    * A collection of settings.
    */
  var DefaultUserSettings: js.UndefOr[UserSettings] = js.native
  
  /**
    * The ID of the domain to be updated.
    */
  var DomainId: typings.awsSdk.sagemakerMod.DomainId = js.native
}
object UpdateDomainRequest {
  
  @scala.inline
  def apply(DomainId: DomainId): UpdateDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainRequest]
  }
  
  @scala.inline
  implicit class UpdateDomainRequestMutableBuilder[Self <: UpdateDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultUserSettings(value: UserSettings): Self = StObject.set(x, "DefaultUserSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUserSettingsUndefined: Self = StObject.set(x, "DefaultUserSettings", js.undefined)
    
    @scala.inline
    def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
  }
}
