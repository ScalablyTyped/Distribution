package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRandomPasswordResponse extends js.Object {
  
  /**
    * A string with the generated password.
    */
  var RandomPassword: js.UndefOr[RandomPasswordType] = js.native
}
object GetRandomPasswordResponse {
  
  @scala.inline
  def apply(): GetRandomPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRandomPasswordResponse]
  }
  
  @scala.inline
  implicit class GetRandomPasswordResponseOps[Self <: GetRandomPasswordResponse] (val x: Self) extends AnyVal {
    
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
    def setRandomPassword(value: RandomPasswordType): Self = this.set("RandomPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandomPassword: Self = this.set("RandomPassword", js.undefined)
  }
}
