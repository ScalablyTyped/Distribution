package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicAccess extends js.Object {
  
  /**
    * Describes the effective permission on this bucket after factoring all attached policies.
    */
  var EffectivePermission: js.UndefOr[String] = js.native
  
  /**
    * Contains information about how permissions are configured for the S3 bucket.
    */
  var PermissionConfiguration: js.UndefOr[typings.awsSdk.guarddutyMod.PermissionConfiguration] = js.native
}
object PublicAccess {
  
  @scala.inline
  def apply(): PublicAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicAccess]
  }
  
  @scala.inline
  implicit class PublicAccessOps[Self <: PublicAccess] (val x: Self) extends AnyVal {
    
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
    def setEffectivePermission(value: String): Self = this.set("EffectivePermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectivePermission: Self = this.set("EffectivePermission", js.undefined)
    
    @scala.inline
    def setPermissionConfiguration(value: PermissionConfiguration): Self = this.set("PermissionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionConfiguration: Self = this.set("PermissionConfiguration", js.undefined)
  }
}
