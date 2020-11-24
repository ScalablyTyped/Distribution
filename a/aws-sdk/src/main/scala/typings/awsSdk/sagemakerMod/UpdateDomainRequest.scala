package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDomainRequest extends js.Object {
  
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
  implicit class UpdateDomainRequestOps[Self <: UpdateDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomainId(value: DomainId): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUserSettings(value: UserSettings): Self = this.set("DefaultUserSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultUserSettings: Self = this.set("DefaultUserSettings", js.undefined)
  }
}
