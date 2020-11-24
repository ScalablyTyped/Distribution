package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowedPrincipal extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the principal.
    */
  var Principal: js.UndefOr[String] = js.native
  
  /**
    * The type of principal.
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.ec2Mod.PrincipalType] = js.native
}
object AllowedPrincipal {
  
  @scala.inline
  def apply(): AllowedPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedPrincipal]
  }
  
  @scala.inline
  implicit class AllowedPrincipalOps[Self <: AllowedPrincipal] (val x: Self) extends AnyVal {
    
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
    def setPrincipal(value: String): Self = this.set("Principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipal: Self = this.set("Principal", js.undefined)
    
    @scala.inline
    def setPrincipalType(value: PrincipalType): Self = this.set("PrincipalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalType: Self = this.set("PrincipalType", js.undefined)
  }
}
