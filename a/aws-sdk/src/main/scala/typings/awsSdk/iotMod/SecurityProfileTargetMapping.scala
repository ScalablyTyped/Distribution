package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityProfileTargetMapping extends js.Object {
  
  /**
    * Information that identifies the security profile.
    */
  var securityProfileIdentifier: js.UndefOr[SecurityProfileIdentifier] = js.native
  
  /**
    * Information about the target (thing group) associated with the security profile.
    */
  var target: js.UndefOr[SecurityProfileTarget] = js.native
}
object SecurityProfileTargetMapping {
  
  @scala.inline
  def apply(): SecurityProfileTargetMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityProfileTargetMapping]
  }
  
  @scala.inline
  implicit class SecurityProfileTargetMappingOps[Self <: SecurityProfileTargetMapping] (val x: Self) extends AnyVal {
    
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
    def setSecurityProfileIdentifier(value: SecurityProfileIdentifier): Self = this.set("securityProfileIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityProfileIdentifier: Self = this.set("securityProfileIdentifier", js.undefined)
    
    @scala.inline
    def setTarget(value: SecurityProfileTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
