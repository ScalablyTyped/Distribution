package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Principal extends js.Object {
  
  /**
    * The ARN of the principal (IAM user, role, or group).
    */
  var PrincipalARN: js.UndefOr[typings.awsSdk.servicecatalogMod.PrincipalARN] = js.native
  
  /**
    * The principal type. The supported value is IAM.
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.servicecatalogMod.PrincipalType] = js.native
}
object Principal {
  
  @scala.inline
  def apply(): Principal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Principal]
  }
  
  @scala.inline
  implicit class PrincipalOps[Self <: Principal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrincipalARN(value: PrincipalARN): Self = this.set("PrincipalARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalARN: Self = this.set("PrincipalARN", js.undefined)
    
    @scala.inline
    def setPrincipalType(value: PrincipalType): Self = this.set("PrincipalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalType: Self = this.set("PrincipalType", js.undefined)
  }
}
